package ru.ok.android.externcalls.analytics.internal.upload;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.storage.CacheWriter;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.analytics.internal.storage.DbCacheWriter;
import ru.ok.android.externcalls.analytics.internal.storage.FileCacheWriter;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.e9e0;
import xsna.efz;
import xsna.qlb0;
import xsna.t33;

@CallInternalApi
/* loaded from: classes9.dex */
public final class Worker {
    private static final String LOG_TAG = "CallAnalyticsWorker";
    private static final int MSG_APPEND = 0;
    private static final int MSG_FLUSH = 1;
    private static final int MSG_UPLOAD_MAX_TIMEOUT = 3;
    private static final int MSG_UPLOAD_SILENCE_TIMEOUT = 2;
    private static volatile Looper looper;
    private final EventChannel channel;
    private final CacheWriter fileCacheWriter;
    private final Handler handler;
    private final CallAnalyticsLogger logger;
    private volatile long millisToUploadAny = Long.MAX_VALUE;
    private final ConcurrentHashMap<String, Long> millisToUpload = new ConcurrentHashMap<>();

    public class Callback implements Handler.Callback {
        public /* synthetic */ Callback(Worker worker, int i) {
            this();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                Worker.this.handleAppend((CallAnalyticsEvent) message.obj);
                return true;
            }
            if (i == 1) {
                Worker.this.handleFlush((ConditionVariable) message.obj);
                return true;
            }
            if (i == 2) {
                Worker.this.handleUploadSilenceTimeout();
                return true;
            }
            if (i != 3) {
                return false;
            }
            Worker.this.handleUploadMaxTimeout();
            return true;
        }

        private Callback() {
        }
    }

    public Worker(Context context, @NonNull e9e0<Looper> e9e0Var, @NonNull e9e0<File> e9e0Var2, @NonNull Lock lock, @NonNull EventChannel eventChannel, DatabaseHelper databaseHelper, boolean z) {
        this.channel = eventChannel;
        this.fileCacheWriter = databaseHelper != null ? new DbCacheWriter(databaseHelper, lock) : new FileCacheWriter(e9e0Var2, z, lock);
        this.handler = new Handler(e9e0Var.get(), new Callback(this, 0));
        this.logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    }

    private long getMaxTimeToUpload(@NonNull String str) {
        Long l = this.millisToUpload.get(str);
        return (l == null || l.longValue() >= Long.MAX_VALUE) ? this.millisToUploadAny < Long.MAX_VALUE ? this.millisToUploadAny : CallAnalyticsConfigStorage.INSTANCE.getUpload().getMaxTimeToUploadMillis() : l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAppend(CallAnalyticsEvent callAnalyticsEvent) {
        this.fileCacheWriter.writeToCache(callAnalyticsEvent);
        UploadConfig upload = CallAnalyticsConfigStorage.INSTANCE.getUpload();
        int fileLengthTriggerToUploadBytes = upload.getFileLengthTriggerToUploadBytes();
        long length = this.fileCacheWriter.length();
        if (length < fileLengthTriggerToUploadBytes) {
            int eventCountToUploadNumber = upload.getEventCountToUploadNumber();
            int count = this.fileCacheWriter.count();
            if (count >= eventCountToUploadNumber) {
                this.logger.d(LOG_TAG, efz.a(count, eventCountToUploadNumber, "trigger | record count (", ") exceeded "));
                startUpload("record count");
                return;
            }
            return;
        }
        this.logger.d(LOG_TAG, "trigger | log file size (" + (length / 1000) + "Kb) exceeded " + (fileLengthTriggerToUploadBytes / 1000) + "Kb");
        startUpload("file size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFlush(ConditionVariable conditionVariable) {
        conditionVariable.open();
        this.logger.d(LOG_TAG, "trigger flush");
        startUpload("flush");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadMaxTimeout() {
        this.logger.d(LOG_TAG, "trigger | max time since log item passed");
        startUpload("timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadSilenceTimeout() {
        this.logger.d(LOG_TAG, qlb0.a(CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis(), "trigger | time since last log item exceeded ", UcumUtils.UCUM_MILLISECODS));
        startUpload("silence timeout");
    }

    private void startUpload(String str) {
        CallAnalyticsLogger callAnalyticsLogger = this.logger;
        StringBuilder a = t33.a("upload requested. reason=", str, ", channel=");
        a.append(this.channel.getKey());
        callAnalyticsLogger.d(LOG_TAG, a.toString());
        UploadStarter.INSTANCE.startUpload(this.channel);
    }

    public void clearMaxMillisToUpload() {
        this.millisToUploadAny = Long.MAX_VALUE;
        this.millisToUpload.clear();
    }

    public void drop() {
        try {
            this.fileCacheWriter.drop();
        } catch (IOException e) {
            this.logger.e(LOG_TAG, "drop failed", e);
        }
    }

    public void flush() {
        flush(new ConditionVariable());
    }

    public void grab(e9e0<File> e9e0Var) throws IOException {
        if (e9e0Var == null) {
            return;
        }
        this.fileCacheWriter.grab(e9e0Var);
    }

    public void scheduleEventSend(@NonNull CallAnalyticsEvent callAnalyticsEvent) {
        Handler handler = this.handler;
        handler.sendMessage(Message.obtain(handler, 0, callAnalyticsEvent));
        long silenceToUploadMillis = CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis();
        if (silenceToUploadMillis < Long.MAX_VALUE) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, silenceToUploadMillis);
        }
    }

    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        long silenceToUploadMillis = CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis();
        if (silenceToUploadMillis < Long.MAX_VALUE && idleStateProvider != null && idleStateProvider.isIdle() && !this.handler.hasMessages(2)) {
            this.handler.sendEmptyMessageDelayed(2, silenceToUploadMillis);
            this.logger.d(LOG_TAG, "Schedule upload by timeout by leaving idle state");
        }
    }

    public void setMaxMillisToUpload(@NonNull String str, long j) {
        if (j < Long.MAX_VALUE) {
            this.millisToUpload.put(str, Long.valueOf(j));
        } else {
            this.millisToUpload.remove(str);
        }
    }

    public void setMaxMillisToUploadAny(long j) {
        this.millisToUploadAny = j;
    }

    private void flush(ConditionVariable conditionVariable) {
        Message.obtain(this.handler, 1, conditionVariable).sendToTarget();
        conditionVariable.block();
    }
}
