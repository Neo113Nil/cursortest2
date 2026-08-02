package ru.ok.android.externcalls.analytics.internal.event;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.upload.Worker;
import ru.ok.android.onelog.UploadService;
import xsna.e9e0;

@CallInternalApi
/* loaded from: classes9.dex */
public final class EventQueueCollector {
    private static final String APPEND_FILENAME = "append";
    private static final String LOG_DIRNAME = "calls-sdk-analytics";
    private static final String UPLOAD_FILENAME = "upload";

    @SuppressLint({"StaticFieldLeak"})
    private static volatile EventQueueCollector lastInstance;
    private final EventChannel channel;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;
    private final DatabaseHelper dbHelper;
    private static final ConcurrentHashMap<EventChannel, EventQueueCollector> INSTANCES = new ConcurrentHashMap<>();
    private static volatile Uploader.IdleStateProvider idleStateProvider = null;
    private static final LooperProvider looperProvider = new LooperProvider(0);
    private final AtomicReference<Boolean> compressionEnabled = new AtomicReference<>();
    private final AtomicReference<Boolean> dbCacheEnabled = new AtomicReference<>();
    private final AtomicReference<Worker> worker = new AtomicReference<>();
    private final AtomicReference<Uploader> uploader = new AtomicReference<>();
    private final Lock uploadLock = new ReentrantLock();

    public interface IdleStateProvider {
        boolean isCallActive();

        boolean isIdle();
    }

    public static class IdleStateProviderCast implements Uploader.IdleStateProvider {
        private final boolean isCallActive;
        private final boolean isIdle;

        public IdleStateProviderCast(IdleStateProvider idleStateProvider) {
            this.isIdle = idleStateProvider == null || idleStateProvider.isIdle();
            this.isCallActive = idleStateProvider != null && idleStateProvider.isCallActive();
        }

        @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader.IdleStateProvider
        public boolean isCallActive() {
            return this.isCallActive;
        }

        @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader.IdleStateProvider
        public boolean isIdle() {
            return this.isIdle;
        }
    }

    public final class LegacyStorage implements e9e0<File> {
        public /* synthetic */ LegacyStorage(EventQueueCollector eventQueueCollector, int i) {
            this();
        }

        private LegacyStorage() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.e9e0
        public File get() {
            return new File(EventQueueCollector.this.context.getFilesDir(), EventQueueCollector.LOG_DIRNAME);
        }
    }

    public static final class LooperProvider implements e9e0<Looper> {
        private volatile Looper looper;

        public /* synthetic */ LooperProvider(int i) {
            this();
        }

        private LooperProvider() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.e9e0
        public Looper get() {
            if (this.looper == null) {
                synchronized (this) {
                    try {
                        if (this.looper == null) {
                            HandlerThread handlerThread = new HandlerThread(UploadService.SCHEME);
                            handlerThread.start();
                            this.looper = handlerThread.getLooper();
                        }
                    } finally {
                    }
                }
            }
            return this.looper;
        }
    }

    public final class OneLogFile implements e9e0<File> {

        @Nullable
        private File cachedFile;

        @NonNull
        private final String name;

        public OneLogFile(@NonNull String str) {
            this.name = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.e9e0
        @NonNull
        public File get() {
            File file = this.cachedFile;
            if (file != null) {
                return file;
            }
            File file2 = new File(new File(new File(EventQueueCollector.this.context.getFilesDir(), EventQueueCollector.LOG_DIRNAME), EventQueueCollector.this.channel.getApiMethod()), this.name);
            this.cachedFile = file2;
            return file2;
        }
    }

    private EventQueueCollector(@NonNull Context context, @NonNull EventChannel eventChannel) {
        this.context = context;
        this.channel = eventChannel;
        this.dbHelper = isDbCacheEnabled() ? new DatabaseHelper(context, isContentCompressionEnabled(), eventChannel, CallAnalyticsConfigStorage.INSTANCE.getLogger()) : null;
    }

    public static void clearAllMaxTimeToUpload() {
        Iterator<EventQueueCollector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().getWorker().clearMaxMillisToUpload();
        }
    }

    public static void flushAll() {
        Iterator<EventQueueCollector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().flush();
        }
    }

    public static EventQueueCollector getInstance(@NonNull EventChannel eventChannel) {
        Application application = ApplicationProvider.getApplication();
        EventQueueCollector eventQueueCollector = lastInstance;
        if (eventQueueCollector != null && eventQueueCollector.channel.equals(eventChannel)) {
            return eventQueueCollector;
        }
        ConcurrentHashMap<EventChannel, EventQueueCollector> concurrentHashMap = INSTANCES;
        EventQueueCollector eventQueueCollector2 = concurrentHashMap.get(eventChannel);
        if (eventQueueCollector2 != null) {
            lastInstance = eventQueueCollector2;
            return eventQueueCollector2;
        }
        EventQueueCollector eventQueueCollector3 = new EventQueueCollector(application, eventChannel);
        EventQueueCollector putIfAbsent = concurrentHashMap.putIfAbsent(eventChannel, eventQueueCollector3);
        if (putIfAbsent != null) {
            lastInstance = putIfAbsent;
            return putIfAbsent;
        }
        eventQueueCollector3.getUploader().setIdleStateProvider(idleStateProvider);
        lastInstance = eventQueueCollector3;
        return eventQueueCollector3;
    }

    private Uploader getUploader() {
        Uploader uploader = this.uploader.get();
        if (uploader != null) {
            return uploader;
        }
        Uploader create = Uploader.create(looperProvider, this.dbHelper != null ? new LegacyStorage(this, 0) : new OneLogFile(UPLOAD_FILENAME), this.uploadLock, this.channel, isContentCompressionEnabled(), this.dbHelper);
        AtomicReference<Uploader> atomicReference = this.uploader;
        while (!atomicReference.compareAndSet(null, create)) {
            if (atomicReference.get() != null) {
                return this.uploader.get();
            }
        }
        return create;
    }

    private Worker getWorker() {
        Worker worker = this.worker.get();
        if (worker != null) {
            return worker;
        }
        Worker worker2 = new Worker(this.context, looperProvider, new OneLogFile(APPEND_FILENAME), new ReentrantLock(), this.channel, this.dbHelper, isContentCompressionEnabled());
        AtomicReference<Worker> atomicReference = this.worker;
        while (!atomicReference.compareAndSet(null, worker2)) {
            if (atomicReference.get() != null) {
                return this.worker.get();
            }
        }
        return worker2;
    }

    private boolean isContentCompressionEnabled() {
        Boolean bool = this.compressionEnabled.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        boolean z = config != null && config.getUpload().getCompressContent();
        AtomicReference<Boolean> atomicReference = this.compressionEnabled;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return this.compressionEnabled.get().booleanValue();
            }
        }
        return z;
    }

    private boolean isDbCacheEnabled() {
        Boolean bool = this.dbCacheEnabled.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        boolean z = config != null && config.getUpload().getUseDbCache();
        AtomicReference<Boolean> atomicReference = this.dbCacheEnabled;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return this.dbCacheEnabled.get().booleanValue();
            }
        }
        return z;
    }

    public static void setIdleStateProvider(IdleStateProvider idleStateProvider2) {
        IdleStateProviderCast idleStateProviderCast = idleStateProvider2 == null ? null : new IdleStateProviderCast(idleStateProvider2);
        idleStateProvider = idleStateProviderCast;
        for (EventQueueCollector eventQueueCollector : INSTANCES.values()) {
            Uploader uploader = eventQueueCollector.getUploader();
            if (uploader != null) {
                uploader.setIdleStateProvider(idleStateProviderCast);
            }
            Worker worker = eventQueueCollector.getWorker();
            if (worker != null) {
                worker.setIdleStateProvider(idleStateProviderCast);
            }
        }
    }

    public void addEvent(@NonNull CallAnalyticsEvent callAnalyticsEvent) {
        if (this.channel.matches(callAnalyticsEvent)) {
            getWorker().scheduleEventSend(callAnalyticsEvent);
            return;
        }
        throw new IllegalArgumentException("Unexpected event " + callAnalyticsEvent.getApiMethodName() + ", collector=" + callAnalyticsEvent.getCollector());
    }

    public void drop() {
        getWorker().drop();
        getUploader().drop();
    }

    public void flush() {
        getWorker().flush();
    }

    public void grabAndUpload() throws IOException {
        try {
            this.uploadLock.lock();
            Worker worker = getWorker();
            final Uploader uploader = getUploader();
            Objects.requireNonNull(uploader);
            worker.grab(new e9e0() { // from class: xsna.j0q
                @Override // xsna.e9e0
                public final Object get() {
                    return Uploader.this.getSink();
                }
            });
            this.uploadLock.unlock();
            getUploader().upload();
        } catch (Throwable th) {
            this.uploadLock.unlock();
            throw th;
        }
    }

    public void uploadGrabbed() throws IOException {
        getUploader().upload();
    }
}
