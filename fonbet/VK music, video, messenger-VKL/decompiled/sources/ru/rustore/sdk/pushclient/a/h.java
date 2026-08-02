package ru.rustore.sdk.pushclient.a;

import android.app.Application;
import com.vk.push.common.AppInfo;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsSenderProvider;
import com.vk.push.common.component.PushTokenComponent;
import com.vk.push.common.component.TopicComponent;
import com.vk.push.common.logger.LoggerProvider;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;
import com.vk.push.core.feature.FeatureManager;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.b6l;
import xsna.bay0;
import xsna.bdn;
import xsna.bpn0;
import xsna.c4z0;
import xsna.cay0;
import xsna.d5o0;
import xsna.dd70;
import xsna.drm0;
import xsna.epx;
import xsna.g2z;
import xsna.gay0;
import xsna.gzs;
import xsna.hay0;
import xsna.hpj;
import xsna.i6z0;
import xsna.iay0;
import xsna.ify0;
import xsna.k1z0;
import xsna.lvy0;
import xsna.piy0;
import xsna.r7z0;
import xsna.rob;
import xsna.s101;
import xsna.s3q0;
import xsna.s9y0;
import xsna.siy0;
import xsna.spj;
import xsna.tty0;
import xsna.u1z0;
import xsna.uoy0;
import xsna.uty0;
import xsna.v9y0;
import xsna.vty0;
import xsna.xwy0;
import xsna.yok0;
import xsna.zvj;

/* loaded from: classes9.dex */
public final class h implements TopicComponent, cay0, PushTokenComponent, AnalyticsSenderProvider, LoggerProvider {
    public static volatile h u;
    public final Application b;
    public final Logger c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final hpj r;
    public yok0 s;
    public static final b t = new b();
    public static final hpj v = zvj.a(bdn.b);
    public static final SdkInitAwaiter w = new SdkInitAwaiter("VkpnsClientSdk", a.i);

    public static final class a extends Lambda implements gzs<Boolean> {
        public static final a i = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            b bVar = h.t;
            return Boolean.valueOf(h.u != null);
        }
    }

    public static final class b {
        public static h a() {
            h hVar = h.u;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        }
    }

    public static final class c extends Lambda implements gzs<AnalyticsSender> {
        public static final c i = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final AnalyticsSender invoke() {
            return ru.rustore.sdk.pushclient.m.h.b();
        }
    }

    public static final class d extends Lambda implements gzs<ru.rustore.sdk.pushclient.k.b> {
        public static final d i = new d();

        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.k.b invoke() {
            return (ru.rustore.sdk.pushclient.k.b) ru.rustore.sdk.pushclient.m.h.e.getValue();
        }
    }

    public static final class e extends Lambda implements gzs<iay0> {
        public static final e i = new e();

        public e() {
            super(0);
        }

        @Override // xsna.gzs
        public final iay0 invoke() {
            return (iay0) ru.rustore.sdk.pushclient.m.h.g.getValue();
        }
    }

    public static final class f extends Lambda implements gzs<CollectDeviceIdErrorsUseCase> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final CollectDeviceIdErrorsUseCase invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.p.a;
            h hVar = h.this;
            return new CollectDeviceIdErrorsUseCase((DeviceIdRepository) ru.rustore.sdk.pushclient.m.h.n.getValue(), (CrashReporterRepository) ru.rustore.sdk.pushclient.m.h.v.getValue(), hVar.c, hVar.r);
        }
    }

    public static final class g extends Lambda implements gzs<gay0> {
        public g() {
            super(0);
        }

        @Override // xsna.gzs
        public final gay0 invoke() {
            Logger logger = lvy0.a;
            Logger logger2 = h.this.c;
            Logger logger3 = ru.rustore.sdk.pushclient.m.p.a;
            return new gay0(new g2z((uty0) ru.rustore.sdk.pushclient.m.h.b.getValue()), new ru.rustore.sdk.pushclient.s.b(ru.rustore.sdk.pushclient.m.h.c(), logger2), logger2);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk", f = "VkpnsClientSdk.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 231}, m = "getToken")
    /* renamed from: ru.rustore.sdk.pushclient.a.h$h, reason: collision with other inner class name */
    public static final class C2398h extends ContinuationImpl {
        public d5o0.a a;
        public /* synthetic */ Object b;
        public int d;

        public C2398h(spj<? super C2398h> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return h.this.getToken(null, this);
        }
    }

    public static final class i extends Lambda implements gzs<siy0> {
        public static final i i = new i();

        public i() {
            super(0);
        }

        @Override // xsna.gzs
        public final siy0 invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.p.a;
            return new siy0((hay0) ru.rustore.sdk.pushclient.m.h.w.getValue(), (PackagesRepository) ru.rustore.sdk.pushclient.m.h.i.getValue(), ru.rustore.sdk.pushclient.m.h.b());
        }
    }

    public static final class j extends Lambda implements gzs<vty0> {
        public static final j i = new j();

        public j() {
            super(0);
        }

        @Override // xsna.gzs
        public final vty0 invoke() {
            return ru.rustore.sdk.pushclient.m.p.a();
        }
    }

    public static final class k extends Lambda implements gzs<cay0> {
        public k() {
            super(0);
        }

        @Override // xsna.gzs
        public final cay0 invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.c.a;
            Logger logger2 = h.this.c;
            Logger logger3 = ru.rustore.sdk.pushclient.m.p.a;
            return new ify0(new CheckHostsAvailabilityUseCase((PackagesRepository) ru.rustore.sdk.pushclient.m.h.i.getValue()), logger2);
        }
    }

    public static final class l extends Lambda implements gzs<Object> {
        public l() {
            super(0);
        }

        @Override // xsna.gzs
        public final Object invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.c.a;
            new ru.rustore.sdk.pushclient.a.o(h.this, null);
            Logger logger2 = h.this.c;
            Logger logger3 = ru.rustore.sdk.pushclient.m.p.a;
            return new rob(logger2);
        }
    }

    public static final class m extends Lambda implements gzs<k1z0> {
        public m() {
            super(0);
        }

        @Override // xsna.gzs
        public final k1z0 invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.p.a;
            h hVar = h.this;
            Logger logger2 = hVar.c;
            return new k1z0((bay0) ru.rustore.sdk.pushclient.m.h.j.getValue(), (xwy0) ru.rustore.sdk.pushclient.m.h.k.getValue(), ru.rustore.sdk.pushclient.m.h.b(), hVar.r, (s9y0) ru.rustore.sdk.pushclient.m.h.c.getValue(), logger2);
        }
    }

    public static final class n extends Lambda implements gzs<piy0> {
        public static final n i = new n();

        public n() {
            super(0);
        }

        @Override // xsna.gzs
        public final piy0 invoke() {
            Logger logger = lvy0.a;
            Logger logger2 = ru.rustore.sdk.pushclient.m.p.a;
            return new piy0(new ru.rustore.sdk.pushclient.s.c(ru.rustore.sdk.pushclient.m.h.c(), (PackagesRepository) ru.rustore.sdk.pushclient.m.h.i.getValue(), ru.rustore.sdk.pushclient.m.h.b()), ru.rustore.sdk.pushclient.m.h.c(), (FeatureManager) ru.rustore.sdk.pushclient.m.h.u.getValue(), lvy0.a);
        }
    }

    public static final class o extends Lambda implements gzs<u1z0> {
        public static final o i = new o();

        public o() {
            super(0);
        }

        @Override // xsna.gzs
        public final u1z0 invoke() {
            return (u1z0) ru.rustore.sdk.pushclient.m.h.m.getValue();
        }
    }

    public static final class p extends Lambda implements gzs<ru.rustore.sdk.pushclient.a.a> {
        public static final p i = new p();

        public p() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.a.a invoke() {
            return (ru.rustore.sdk.pushclient.a.a) ru.rustore.sdk.pushclient.m.c.b.getValue();
        }
    }

    public static final class q extends Lambda implements gzs<TopicComponent> {
        public q() {
            super(0);
        }

        @Override // xsna.gzs
        public final TopicComponent invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.c.a;
            Logger logger2 = h.this.c;
            Logger logger3 = ru.rustore.sdk.pushclient.m.p.a;
            bpn0 bpn0Var = ru.rustore.sdk.pushclient.m.h.d;
            return new ru.rustore.sdk.pushclient.n.h(new i6z0((c4z0) bpn0Var.getValue()), new r7z0((c4z0) bpn0Var.getValue()), logger2);
        }
    }

    public static final class r extends Lambda implements gzs<uoy0> {
        public r() {
            super(0);
        }

        @Override // xsna.gzs
        public final uoy0 invoke() {
            Logger logger = ru.rustore.sdk.pushclient.m.c.a;
            return new uoy0((iay0) ru.rustore.sdk.pushclient.m.h.g.getValue(), new ru.rustore.sdk.pushclient.m.a(1, null), h.this.c);
        }
    }

    public h(aaz0 aaz0Var) {
        Logger logger;
        s101 s101Var = s101.e;
        if (!epx.f(s101.f, aaz0Var)) {
            synchronized (s101Var) {
                try {
                    if (!epx.f(s101.f, aaz0Var)) {
                        s101.f = aaz0Var;
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.b = s101.h().a;
        aaz0 aaz0Var2 = s101.f;
        this.c = (aaz0Var2 == null || (logger = aaz0Var2.c) == null) ? new DefaultLogger("VkpnsClientSdk") : logger;
        this.d = new bpn0(c.i);
        this.e = new bpn0(e.i);
        this.f = new bpn0(new m());
        this.g = new bpn0(new g());
        this.h = new bpn0(d.i);
        this.i = new bpn0(o.i);
        this.j = new bpn0(j.i);
        this.k = new bpn0(new f());
        this.l = new bpn0(i.i);
        this.m = new bpn0(n.i);
        this.n = new bpn0(p.i);
        this.o = new bpn0(new r());
        this.p = new bpn0(new q());
        new bpn0(new l());
        this.q = new bpn0(new k());
        this.r = zvj.a(bdn.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d5, code lost:
    
        if (r10.a(r4, ru.rustore.sdk.pushclient.a.c.i, r5, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (xsna.zvj.d(new ru.rustore.sdk.pushclient.l.l(r10.a.a, true, null), r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.a.m mVar;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ru.rustore.sdk.pushclient.k.b bVar;
        h hVar2;
        AppInfo appInfo;
        hVar.getClass();
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.a.m) {
            mVar = (ru.rustore.sdk.pushclient.a.m) continuationImpl;
            int i3 = mVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.e = i3 - Integer.MIN_VALUE;
                Object obj = mVar.c;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = mVar.e;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(hVar.c, "Update master", null, 2, null);
                    ru.rustore.sdk.pushclient.k.b bVar2 = (ru.rustore.sdk.pushclient.k.b) hVar.h.getValue();
                    mVar.a = hVar;
                    mVar.e = 1;
                    obj = bVar2.e(mVar);
                } else if (i2 == 1) {
                    hVar = mVar.a;
                    kotlin.a.a(obj);
                } else if (i2 == 2) {
                    appInfo = mVar.b;
                    hVar2 = mVar.a;
                    kotlin.a.a(obj);
                    ((AnalyticsSender) hVar2.d.getValue()).send(new tty0("vkcm_sdk_client_update_master"));
                    vty0 vty0Var = (vty0) hVar2.j.getValue();
                    mVar.a = hVar2;
                    mVar.b = appInfo;
                    mVar.e = 3;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    appInfo = mVar.b;
                    hVar2 = mVar.a;
                    kotlin.a.a(obj);
                    uoy0 uoy0Var = (uoy0) hVar2.o.getValue();
                    Application application = hVar2.b;
                    ru.rustore.sdk.pushclient.a.n nVar = new ru.rustore.sdk.pushclient.a.n(appInfo, hVar2, null);
                    mVar.a = null;
                    mVar.b = null;
                    mVar.e = 4;
                }
                AppInfo appInfo2 = (AppInfo) obj;
                bVar = (ru.rustore.sdk.pushclient.k.b) hVar.h.getValue();
                mVar.a = hVar;
                mVar.b = appInfo2;
                mVar.e = 2;
                if (bVar.d(mVar) != coroutineSingletons) {
                    hVar2 = hVar;
                    appInfo = appInfo2;
                    ((AnalyticsSender) hVar2.d.getValue()).send(new tty0("vkcm_sdk_client_update_master"));
                    vty0 vty0Var2 = (vty0) hVar2.j.getValue();
                    mVar.a = hVar2;
                    mVar.b = appInfo;
                    mVar.e = 3;
                }
                return coroutineSingletons;
            }
        }
        mVar = new ru.rustore.sdk.pushclient.a.m(hVar, continuationImpl);
        Object obj2 = mVar.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = mVar.e;
        if (i2 != 0) {
        }
        AppInfo appInfo22 = (AppInfo) obj2;
        bVar = (ru.rustore.sdk.pushclient.k.b) hVar.h.getValue();
        mVar.a = hVar;
        mVar.b = appInfo22;
        mVar.e = 2;
        if (bVar.d(mVar) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(h hVar, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.a.p pVar;
        int i2;
        h hVar2;
        AnalyticsSender analyticsSender;
        hVar.getClass();
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.a.p) {
            pVar = (ru.rustore.sdk.pushclient.a.p) continuationImpl;
            int i3 = pVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.e = i3 - Integer.MIN_VALUE;
                Object obj = pVar.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pVar.e;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    AnalyticsSender analyticsSender2 = (AnalyticsSender) hVar.d.getValue();
                    ru.rustore.sdk.pushclient.a.a aVar = (ru.rustore.sdk.pushclient.a.a) hVar.n.getValue();
                    pVar.a = hVar;
                    pVar.b = analyticsSender2;
                    pVar.e = 1;
                    Object c2 = aVar.c(pVar);
                    if (c2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hVar2 = hVar;
                    analyticsSender = analyticsSender2;
                    obj = c2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    analyticsSender = pVar.b;
                    hVar2 = pVar.a;
                    kotlin.a.a(obj);
                }
                analyticsSender.send(new v9y0((String) obj, new dd70(hVar2.b).b.areNotificationsEnabled()));
                return s3q0.a;
            }
        }
        pVar = new ru.rustore.sdk.pushclient.a.p(hVar, continuationImpl);
        Object obj2 = pVar.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pVar.e;
        if (i2 != 0) {
        }
        analyticsSender.send(new v9y0((String) obj2, new dd70(hVar2.b).b.areNotificationsEnabled()));
        return s3q0.a;
    }

    @Override // xsna.cay0
    public final Object a(d5o0.a aVar, ru.rustore.sdk.pushclient.a.e eVar) {
        Object a2 = ((cay0) this.q.getValue()).a(aVar, eVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final Object deleteToken(d5o0<s3q0>.a aVar, spj<? super s3q0> spjVar) {
        Logger.DefaultImpls.info$default(this.c, "Delete current push token", null, 2, null);
        Object d2 = ((ru.rustore.sdk.pushclient.a.a) this.n.getValue()).d(aVar, spjVar);
        return d2 == CoroutineSingletons.COROUTINE_SUSPENDED ? d2 : s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.vk.push.common.component.PushTokenComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getToken(d5o0<String>.a aVar, spj<? super s3q0> spjVar) {
        C2398h c2398h;
        int i2;
        String str;
        if (spjVar instanceof C2398h) {
            c2398h = (C2398h) spjVar;
            int i3 = c2398h.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2398h.d = i3 - Integer.MIN_VALUE;
                Object obj = c2398h.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = c2398h.d;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.c, "Get token requested", null, 2, null);
                    ru.rustore.sdk.pushclient.a.a aVar2 = (ru.rustore.sdk.pushclient.a.a) this.n.getValue();
                    c2398h.a = aVar;
                    c2398h.d = 1;
                    obj = aVar2.c(c2398h);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    aVar = c2398h.a;
                    kotlin.a.a(obj);
                }
                str = (String) obj;
                if (drm0.N(str)) {
                    aVar.b(str);
                    return s3q0.a;
                }
                c2398h.a = null;
                c2398h.d = 2;
                Object h = ((ru.rustore.sdk.pushclient.a.a) b.a().n.getValue()).h(aVar, c2398h);
                if (h != coroutineSingletons) {
                    h = s3q0.a;
                }
            }
        }
        c2398h = new C2398h(spjVar);
        Object obj2 = c2398h.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = c2398h.d;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (drm0.N(str)) {
        }
    }

    @Override // com.vk.push.common.analytics.AnalyticsSenderProvider
    public final AnalyticsSender provideAnalyticsSender() {
        return (AnalyticsSender) this.d.getValue();
    }

    @Override // com.vk.push.common.logger.LoggerProvider
    public final Logger provideLogger() {
        Logger logger;
        aaz0 aaz0Var = s101.f;
        return (aaz0Var == null || (logger = aaz0Var.c) == null) ? new DefaultLogger("VkpnsClientSdk") : logger;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Object subscribeToTopic(String str, d5o0<s3q0>.a aVar, spj<? super s3q0> spjVar) {
        Object subscribeToTopic = ((TopicComponent) this.p.getValue()).subscribeToTopic(str, aVar, spjVar);
        return subscribeToTopic == CoroutineSingletons.COROUTINE_SUSPENDED ? subscribeToTopic : s3q0.a;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Object unsubscribeFromTopic(String str, d5o0<s3q0>.a aVar, spj<? super s3q0> spjVar) {
        Object unsubscribeFromTopic = ((TopicComponent) this.p.getValue()).unsubscribeFromTopic(str, aVar, spjVar);
        return unsubscribeFromTopic == CoroutineSingletons.COROUTINE_SUSPENDED ? unsubscribeFromTopic : s3q0.a;
    }
}
