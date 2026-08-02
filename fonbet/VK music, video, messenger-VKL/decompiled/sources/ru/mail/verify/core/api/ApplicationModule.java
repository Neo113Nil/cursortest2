package ru.mail.verify.core.api;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Pair;
import ru.mail.libverify.g0.r;
import ru.mail.libverify.platform.core.IInternalFactory;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.core.PlatformCoreService;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.gcm.GcmProcessService;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.SocketFactoryProvider;
import ru.ok.tracer.lite.TracerLite;
import xsna.bd3;
import xsna.j9;
import xsna.s3q0;

/* loaded from: classes11.dex */
public final class ApplicationModule {

    @NonNull
    private final Thread.UncaughtExceptionHandler b;

    @NonNull
    private final d c;
    private volatile UncaughtExceptionListener d;

    @Nullable
    private volatile SocketFactoryProvider e;

    @Nullable
    private PlatformCoreService g;

    @NonNull
    private final c a = new c();

    @NonNull
    private final NetworkPolicyConfig f = new NetworkPolicyConfig(r.DEFAULT, ru.mail.libverify.g0.n.DEFAULT);

    public static final class NetworkPolicyConfig {

        @NonNull
        private volatile r a;

        @NonNull
        private volatile ru.mail.libverify.g0.n b;

        public NetworkPolicyConfig(@NonNull r rVar, @NonNull ru.mail.libverify.g0.n nVar) {
            this.a = rVar;
            this.b = nVar;
        }

        @NonNull
        public ru.mail.libverify.g0.n getBackgroundAwakeMode() {
            return this.b;
        }

        @NonNull
        public r getNetworkSyncMode() {
            return this.a;
        }
    }

    public class a implements ILog {
        @Override // ru.mail.libverify.platform.core.ILog
        public final void d(@NonNull String str, @NonNull String str2) {
            FileLog.d(str, str2);
        }

        @Override // ru.mail.libverify.platform.core.ILog
        public final void e(@NonNull String str, @NonNull String str2) {
            FileLog.e(str, str2);
        }

        @Override // ru.mail.libverify.platform.core.ILog
        public final void v(@NonNull String str, @NonNull String str2) {
            FileLog.v(str, str2);
        }

        @Override // ru.mail.libverify.platform.core.ILog
        public final void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            FileLog.e(str, str2, th);
        }
    }

    public class b implements IInternalFactory {
        @Override // ru.mail.libverify.platform.core.IInternalFactory
        public final void deliverGcmMessageIntent(@NonNull Context context, @Nullable String str, @NonNull Map<String, String> map) {
            ru.mail.libverify.d0.a.a(context, str, map);
        }

        @Override // ru.mail.libverify.platform.core.IInternalFactory
        public final void refreshGcmToken(@NonNull Context context) {
            if (ru.mail.libverify.d0.a.e(context)) {
                GcmProcessService.a(context);
            }
        }
    }

    public static class c {
        private volatile Context a;
        private volatile boolean b = false;
        private volatile boolean c;

        public final boolean a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }
    }

    public final class d implements RejectedExecutionHandler {
        public /* synthetic */ d(ApplicationModule applicationModule, int i) {
            this();
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminating() || threadPoolExecutor.isTerminated()) {
                FileLog.d("NotifyCore", "discard runnable %s on executor %s as it was shut down", runnable, threadPoolExecutor);
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("discard runnable " + runnable + " on executor " + threadPoolExecutor + " as it was shut down");
            FileLog.e("NotifyCore", "wrong libverify instance object state", illegalStateException);
            UncaughtExceptionListener uncaughtExceptionListener = ApplicationModule.this.d;
            if (uncaughtExceptionListener != null) {
                uncaughtExceptionListener.uncaughtException(null, illegalStateException);
            }
        }

        private d() {
        }
    }

    public final class e implements Thread.UncaughtExceptionHandler {
        public /* synthetic */ e(ApplicationModule applicationModule, int i) {
            this();
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            FileLog.e("NotifyCore", th, "FATAL ERROR due to notify unhandled exception in thread %s (%d)", thread.getName(), Long.valueOf(thread.getId()));
            UncaughtExceptionListener uncaughtExceptionListener = ApplicationModule.this.d;
            if (uncaughtExceptionListener != null) {
                uncaughtExceptionListener.uncaughtException(thread, th);
            }
        }

        private e() {
        }
    }

    public ApplicationModule() {
        int i = 0;
        this.b = new e(this, i);
        this.c = new d(this, i);
    }

    @NonNull
    public final Context a() {
        return this.a.a;
    }

    @Nullable
    public final SocketFactoryProvider d() {
        return this.e;
    }

    @NonNull
    public final c e() {
        return this.a;
    }

    @NonNull
    public final Thread.UncaughtExceptionHandler f() {
        return this.b;
    }

    public final void g() {
        FileLog.v("NotifyCore", "Debug logs are enabled");
        this.a.b = true;
        c cVar = this.a;
        new Handler();
        cVar.getClass();
    }

    public final void h() {
        FileLog.v("NotifyCore", "Tracer are disabled");
        this.a.c = true;
    }

    public final void a(@Nullable SocketFactoryProvider socketFactoryProvider) {
        this.e = socketFactoryProvider;
    }

    @NonNull
    public final NetworkPolicyConfig b() {
        return this.f;
    }

    @NonNull
    public final RejectedExecutionHandler c() {
        return this.c;
    }

    public final void a(@NonNull UncaughtExceptionListener uncaughtExceptionListener) {
        this.d = uncaughtExceptionListener;
    }

    public final void b(@NonNull Context context) {
        this.a.a = context;
    }

    @NonNull
    public static TracerLite a(@NonNull Context context, @NonNull w wVar) {
        TracerLite tracerLite = new TracerLite(context, "ru.mail.libverify", TracerLite.Configuration.Companion.build(new j9(wVar, 2)));
        Pair[] pairArr = {new Pair("applicationName", wVar.G()), new Pair("applicationVersion", wVar.k()), new Pair("libverifyBuild", "297"), new Pair("libverifyLocale", wVar.d().getCountry())};
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            tracerLite.setKey((String) pair.i(), String.valueOf(pair.j()));
        }
        return tracerLite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s3q0 a(w wVar, TracerLite.Configuration.Builder builder) {
        String str = "https://clientapi.mail.ru/tracer";
        try {
            str = wVar.D().a("https://clientapi.mail.ru/tracer", null, true).b().h();
        } catch (Exception unused) {
        }
        builder.setApiUrl(str);
        return s3q0.a;
    }

    public final void a(@Nullable PlatformCoreService platformCoreService) {
        this.g = platformCoreService;
        if (platformCoreService == null) {
            return;
        }
        platformCoreService.setLog(new a());
        platformCoreService.setInternalFactory(new b());
        platformCoreService.setSmsRetrieverService(new bd3());
    }

    @NonNull
    public final PlatformCoreService a(@NonNull Context context) {
        PlatformCoreService platformCoreService;
        if (this.g == null) {
            String[] strArr = {"ru.mail.libverify.platform.firebase.FirebaseCoreService", "ru.mail.libverify.platform.huawei.HuaweiCoreService"};
            int i = 0;
            PlatformCoreService platformCoreService2 = null;
            while (true) {
                if (i >= 2) {
                    break;
                }
                String str = strArr[i];
                try {
                    try {
                        platformCoreService = (PlatformCoreService) Class.forName(str).newInstance();
                        if (platformCoreService2 == null) {
                            platformCoreService2 = platformCoreService;
                        }
                    } catch (IllegalAccessException | InstantiationException e2) {
                        e2.printStackTrace();
                    }
                } catch (ClassNotFoundException e3) {
                    e3.printStackTrace();
                }
                if (platformCoreService.isServiceAvailable(context, null)) {
                    FileLog.e("NotifyCore", "Platform %s initialized", str);
                    platformCoreService2 = platformCoreService;
                    break;
                }
                continue;
                i++;
            }
            if (platformCoreService2 != null) {
                this.g = platformCoreService2;
                a(platformCoreService2);
            } else {
                throw new IllegalStateException("Add at least one platform library.");
            }
        }
        return this.g;
    }
}
