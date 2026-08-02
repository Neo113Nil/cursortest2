package ru.rustore.sdk.pushclient.messaging.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.data.imageloader.ImageDownloaderImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.api.json.JsonToken;
import ru.rustore.sdk.pushclient.m.p;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;
import xsna.aaz0;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.bpy0;
import xsna.dd70;
import xsna.epx;
import xsna.gzs;
import xsna.hpj;
import xsna.i2z0;
import xsna.iay0;
import xsna.kfy0;
import xsna.l1z0;
import xsna.lvy0;
import xsna.myc0;
import xsna.nm8;
import xsna.nvf0;
import xsna.nvy0;
import xsna.o0b;
import xsna.op5;
import xsna.qv20;
import xsna.rzy0;
import xsna.s101;
import xsna.s3q0;
import xsna.s9y0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes9.dex */
public class RuStoreMessagingService extends Service {
    public static final /* synthetic */ int k = 0;
    public final bpn0 b = new bpn0(b.i);
    public final bpn0 c = new bpn0(a.i);
    public final bpn0 d = new bpn0(g.i);
    public final hpj e;
    public final bpn0 f;
    public final bpn0 g;
    public volatile int h;
    public final bpn0 i;
    public final bpn0 j;

    public static final class a extends Lambda implements gzs<AnalyticsSender> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final AnalyticsSender invoke() {
            return ru.rustore.sdk.pushclient.m.h.b();
        }
    }

    public static final class b extends Lambda implements gzs<iay0> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final iay0 invoke() {
            return (iay0) ru.rustore.sdk.pushclient.m.h.g.getValue();
        }
    }

    public static final class c extends Lambda implements gzs<kfy0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final kfy0 invoke() {
            Logger logger = lvy0.a;
            RuStoreMessagingService ruStoreMessagingService = RuStoreMessagingService.this;
            int i = RuStoreMessagingService.k;
            Logger a = ruStoreMessagingService.a();
            PackagesRepository packagesRepository = (PackagesRepository) ru.rustore.sdk.pushclient.m.h.i.getValue();
            Logger logger2 = p.a;
            return new ru.rustore.sdk.pushclient.u.d(new i2z0(new GetCallingAppInfoUseCase((CallingAppRepository) ru.rustore.sdk.pushclient.m.h.r.getValue()), packagesRepository, (ru.rustore.sdk.pushclient.k.b) ru.rustore.sdk.pushclient.m.h.e.getValue()), (iay0) ru.rustore.sdk.pushclient.m.h.g.getValue(), (ru.rustore.sdk.pushclient.a.a) ru.rustore.sdk.pushclient.m.c.b.getValue(), (s9y0) ru.rustore.sdk.pushclient.m.h.c.getValue(), (CrashReporterRepository) ru.rustore.sdk.pushclient.m.h.v.getValue(), ru.rustore.sdk.pushclient.m.h.b(), a);
        }
    }

    public static final class d extends Lambda implements gzs<Logger> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsClientSdk");
            }
            return defaultLogger.createLogger("VkpnsMessagingService");
        }
    }

    public static final class e extends Lambda implements gzs<nvy0> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final nvy0 invoke() {
            Logger logger = lvy0.a;
            iay0 iay0Var = (iay0) ru.rustore.sdk.pushclient.m.h.g.getValue();
            PackagesRepository packagesRepository = (PackagesRepository) ru.rustore.sdk.pushclient.m.h.i.getValue();
            Logger logger2 = p.a;
            i2z0 i2z0Var = new i2z0(new GetCallingAppInfoUseCase((CallingAppRepository) ru.rustore.sdk.pushclient.m.h.r.getValue()), packagesRepository, (ru.rustore.sdk.pushclient.k.b) ru.rustore.sdk.pushclient.m.h.e.getValue());
            s101 s101Var = s101.e;
            Context applicationContext = s101.h().a.getApplicationContext();
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            op5 op5Var = new op5(aaz0Var.a.getApplicationContext());
            dd70 dd70Var = (dd70) ru.rustore.sdk.pushclient.m.h.h.getValue();
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 != null) {
                return new ru.rustore.sdk.pushclient.u.g(iay0Var, i2z0Var, new bpy0(applicationContext, op5Var, dd70Var, new ru.rustore.sdk.pushclient.v.c(aaz0Var2.a.getApplicationContext()), ImageDownloaderImplKt.ImageDownloader(s101Var), logger), (s9y0) ru.rustore.sdk.pushclient.m.h.c.getValue(), ru.rustore.sdk.pushclient.m.h.b(), (CrashReporterRepository) ru.rustore.sdk.pushclient.m.h.v.getValue(), logger);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService$onCreate$1", f = "RuStoreMessagingService.kt", l = {JsonToken.END_ARRAY, 95}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        int label;

        public f(spj<? super f> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return RuStoreMessagingService.this.new f(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
        
            if (r11 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x013c, code lost:
        
            if (xsna.s3q0.a == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x013f, code lost:
        
            if (r11 != r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x013e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
        
            if (r11 != r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o0b aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!SdkInitAwaiter.awaitInitialization$default(ru.rustore.sdk.pushclient.a.h.w, 0L, 1, null)) {
                    RuStoreMessagingService.this.stopSelf();
                    return s3q0.a;
                }
                ((iay0) RuStoreMessagingService.this.b.getValue()).getClass();
                nm8 nm8Var = iay0.d;
                nm8Var.getClass();
                aVar = new nm8.a();
                this.L$0 = aVar;
                this.label = 1;
                obj = aVar.a(this);
            } else {
                if (i == 1) {
                    aVar = (o0b) this.L$0;
                    kotlin.a.a(obj);
                    if (((Boolean) obj).booleanValue()) {
                        l1z0 l1z0Var = (l1z0) aVar.next();
                        RuStoreMessagingService ruStoreMessagingService = RuStoreMessagingService.this;
                        int i2 = RuStoreMessagingService.k;
                        Logger.DefaultImpls.info$default(ruStoreMessagingService.a(), "Received event from channel: ".concat(l1z0Var.getClass().getSimpleName()), null, 2, null);
                        RuStoreMessagingService ruStoreMessagingService2 = RuStoreMessagingService.this;
                        this.L$0 = aVar;
                        this.label = 2;
                        ruStoreMessagingService2.getClass();
                        if (l1z0Var instanceof l1z0.b) {
                            Object b = ruStoreMessagingService2.b((l1z0.b) l1z0Var, this);
                        } else if (l1z0Var instanceof l1z0.a) {
                            RemoteMessage remoteMessage = ((l1z0.a) l1z0Var).a;
                            Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending message to client via onMessageReceived method", null, 2, null);
                            remoteMessage.getMessageId();
                            int priority = remoteMessage.getPriority();
                            remoteMessage.getTtl();
                            remoteMessage.getFrom();
                            remoteMessage.getCollapseKey();
                            Map<String, String> data = remoteMessage.getData();
                            remoteMessage.getRawData();
                            RemoteMessage.Notification notification = remoteMessage.getNotification();
                            if (notification != null) {
                                remoteMessage.getClickActionType();
                                notification.getTitle();
                                notification.getBody();
                                notification.getChannelId();
                                notification.getImageUrl();
                                notification.getColor();
                                notification.getIcon();
                                notification.getClickAction();
                            }
                            ruStoreMessagingService2.e(new nvf0(priority, data));
                            ((AnalyticsSender) ruStoreMessagingService2.c.getValue()).send(new ru.rustore.sdk.pushclient.d.b(remoteMessage));
                            Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending message successful", null, 2, null);
                        } else if (l1z0Var instanceof l1z0.c) {
                            Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending on delete messages to client via onDeleteMessages method", null, 2, null);
                            ruStoreMessagingService2.c();
                            Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending on delete messages successful", null, 2, null);
                        } else if (l1z0Var instanceof l1z0.d) {
                            Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending error to client via onError method", null, 2, null);
                            ruStoreMessagingService2.d(((l1z0.d) l1z0Var).a);
                            Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending error messages successful", null, 2, null);
                        }
                    }
                    return s3q0.a;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (o0b) this.L$0;
                kotlin.a.a(obj);
                RuStoreMessagingService ruStoreMessagingService3 = RuStoreMessagingService.this;
                int i3 = RuStoreMessagingService.k;
                Logger.DefaultImpls.info$default(ruStoreMessagingService3.a(), "Stop service deferred after last event", null, 2, null);
                ((DelayedAction) RuStoreMessagingService.this.j.getValue()).runWithDelay(20000L);
                this.L$0 = aVar;
                this.label = 1;
                obj = aVar.a(this);
            }
        }
    }

    public static final class g extends Lambda implements gzs<s9y0> {
        public static final g i = new g(0);

        @Override // xsna.gzs
        public final s9y0 invoke() {
            return (s9y0) ru.rustore.sdk.pushclient.m.h.c.getValue();
        }
    }

    public static final class h extends Lambda implements gzs<DelayedAction> {
        public h() {
            super(0);
        }

        @Override // xsna.gzs
        public final DelayedAction invoke() {
            return new DelayedAction(null, new ru.rustore.sdk.pushclient.messaging.service.b(RuStoreMessagingService.this), 1, null);
        }
    }

    public RuStoreMessagingService() {
        bdn bdnVar = bdn.a;
        this.e = zvj.a(wgl.c);
        this.f = new bpn0(new c());
        this.g = new bpn0(e.i);
        this.i = new bpn0(d.i);
        this.j = new bpn0(new h());
    }

    public final Logger a() {
        return (Logger) this.i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(l1z0.b bVar, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.messaging.service.a aVar;
        Object obj;
        int i;
        RuStoreMessagingService ruStoreMessagingService;
        String str;
        RuStoreMessagingService ruStoreMessagingService2;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.messaging.service.a) {
            aVar = (ru.rustore.sdk.pushclient.messaging.service.a) continuationImpl;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(a(), "Sending token to client via onNewToken method", null, 2, null);
                    s9y0 s9y0Var = (s9y0) this.d.getValue();
                    aVar.L$0 = this;
                    aVar.L$1 = bVar;
                    aVar.label = 1;
                    obj = s9y0Var.f(aVar);
                    if (obj != coroutineSingletons) {
                        ruStoreMessagingService = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ruStoreMessagingService2 = (RuStoreMessagingService) aVar.L$0;
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending token successful", null, 2, null);
                    return s3q0.a;
                }
                bVar = (l1z0.b) aVar.L$1;
                ruStoreMessagingService = (RuStoreMessagingService) aVar.L$0;
                kotlin.a.a(obj);
                str = bVar.a;
                if (!epx.f((String) obj, str)) {
                    Logger.DefaultImpls.warn$default(ruStoreMessagingService.a(), "This token has already been sent to client earlier", null, 2, null);
                    return s3q0.a;
                }
                ruStoreMessagingService.f(str);
                s9y0 s9y0Var2 = (s9y0) ruStoreMessagingService.d.getValue();
                aVar.L$0 = ruStoreMessagingService;
                aVar.L$1 = null;
                aVar.label = 2;
                if (s9y0Var2.h(str, aVar) != coroutineSingletons) {
                    ruStoreMessagingService2 = ruStoreMessagingService;
                    Logger.DefaultImpls.info$default(ruStoreMessagingService2.a(), "Sending token successful", null, 2, null);
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        aVar = new ru.rustore.sdk.pushclient.messaging.service.a(this, continuationImpl);
        obj = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        str = bVar.a;
        if (!epx.f((String) obj, str)) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new rzy0(this.g, this.f, this.i);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        myc0.h(this.e, null, null, new f(null), 3);
        ((DelayedAction) this.j.getValue()).runWithDelay(20000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zvj.c(this.e, null);
        if (qv20.b) {
            Logger.DefaultImpls.info$default(a(), "Service is destroying", null, 2, null);
            ((kfy0) this.f.getValue()).onDestroy();
            ((nvy0) this.g.getValue()).onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.h = i2;
        return 3;
    }

    public void c() {
    }

    public void d(List<? extends RuStorePushClientException> list) {
    }

    public void e(nvf0 nvf0Var) {
    }

    public void f(String str) {
    }
}
