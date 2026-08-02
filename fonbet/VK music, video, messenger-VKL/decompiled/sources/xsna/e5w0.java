package xsna;

import android.content.Context;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.domain.usecase.GetInitializedHostPackagesUseCase;
import com.vk.push.core.process.SeparateProcessRepository;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.ijh0;
import xsna.kyw;
import xsna.nta;
import xsna.pmy;

/* compiled from: VkpnsPushProviderSdk.kt */
/* loaded from: classes.dex */
public final class e5w0 {
    public static volatile e5w0 A;
    public static final b y = new b();
    public static final SdkInitAwaiter z = new SdkInitAwaiter("VkpnsPushProviderSdk", a.i);
    public final Logger a;
    public final bpn0 b;
    public final bpn0 c;
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
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final hpj x;

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final Boolean invoke() {
            b bVar = e5w0.y;
            boolean z = false;
            if (e5w0.A != null) {
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig != null ? vkpnsPushConfig.d : false) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class b {
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class c extends Lambda implements gzs<AnalyticsSender> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final AnalyticsSender invoke() {
            Logger logger = v6g0.a;
            return v6g0.a();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class d extends Lambda implements gzs<pv6> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final pv6 invoke() {
            return (pv6) v6g0.k.getValue();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class e extends Lambda implements gzs<ip9> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final ip9 invoke() {
            Logger logger = yfq0.a;
            return new ip9(v6g0.g());
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class f extends Lambda implements gzs<CollectDeviceIdErrorsUseCase> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final CollectDeviceIdErrorsUseCase invoke() {
            Logger logger = yfq0.a;
            e5w0 e5w0Var = e5w0.this;
            Logger logger2 = e5w0Var.a;
            hpj hpjVar = e5w0Var.x;
            Logger logger3 = v6g0.a;
            return new CollectDeviceIdErrorsUseCase((DeviceIdRepository) v6g0.g.getValue(), v6g0.b(), logger2, hpjVar);
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class g extends Lambda implements gzs<xzm> {
        public static final g i = new g(0);

        @Override // xsna.gzs
        public final xzm invoke() {
            Logger logger = yfq0.a;
            Logger logger2 = v6g0.a;
            return new xzm((uri0) v6g0.m.getValue());
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class h extends Lambda implements gzs<sap> {
        public static final h i = new h(0);

        @Override // xsna.gzs
        public final sap invoke() {
            Logger logger = v6g0.a;
            return (sap) v6g0.l.getValue();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class i extends Lambda implements gzs<gip> {
        public static final i i = new i(0);

        @Override // xsna.gzs
        public final gip invoke() {
            Logger logger = yfq0.a;
            Logger logger2 = v6g0.a;
            return new gip((uri0) v6g0.m.getValue());
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class j extends Lambda implements gzs<GetInitializedHostPackagesUseCase> {
        public static final j i = new j(0);

        @Override // xsna.gzs
        public final GetInitializedHostPackagesUseCase invoke() {
            Logger logger = yfq0.a;
            return new GetInitializedHostPackagesUseCase(v6g0.e());
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class k extends Lambda implements gzs<pmy> {
        public static final k i = new k(0);

        @Override // xsna.gzs
        public final pmy invoke() {
            return (pmy) v6g0.j.getValue();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class l extends Lambda implements gzs<nj10> {
        public static final l i = new l(0);

        @Override // xsna.gzs
        public final nj10 invoke() {
            Logger logger = ycx.a;
            return ycx.a();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class m extends Lambda implements gzs<bk10> {
        public static final m i = new m(0);

        @Override // xsna.gzs
        public final bk10 invoke() {
            Logger logger = v6g0.a;
            return v6g0.d();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class n extends Lambda implements gzs<ok10> {
        public static final n i = new n(0);

        @Override // xsna.gzs
        public final ok10 invoke() {
            Logger logger = yfq0.a;
            return new ok10();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class o extends Lambda implements gzs<nhe0> {
        public static final o i = new o(0);

        @Override // xsna.gzs
        public final nhe0 invoke() {
            return g9i.a();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class p extends Lambda implements gzs<hqf0> {
        public static final p i = new p(0);

        @Override // xsna.gzs
        public final hqf0 invoke() {
            Logger logger = yfq0.a;
            Logger logger2 = v6g0.a;
            return new hqf0((gzx0) v6g0.t.getValue());
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class q extends Lambda implements gzs<w5h0> {
        public q() {
            super(0);
        }

        @Override // xsna.gzs
        public final w5h0 invoke() {
            Logger logger = ycx.a;
            return ycx.b(e5w0.this.a);
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class r extends Lambda implements gzs<ijh0> {
        public static final r i = new r(0);

        @Override // xsna.gzs
        public final ijh0 invoke() {
            return (ijh0) v6g0.p.getValue();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class s extends Lambda implements gzs<qjh0> {
        public static final s i = new s(0);

        @Override // xsna.gzs
        public final qjh0 invoke() {
            return (qjh0) v6g0.f.getValue();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class t extends Lambda implements gzs<SeparateProcessRepository> {
        public static final t i = new t(0);

        @Override // xsna.gzs
        public final SeparateProcessRepository invoke() {
            Logger logger = v6g0.a;
            return (SeparateProcessRepository) v6g0.x.getValue();
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class u extends Lambda implements gzs<oqk0> {
        public u() {
            super(0);
        }

        @Override // xsna.gzs
        public final oqk0 invoke() {
            Logger logger = ycx.a;
            return ycx.c(e5w0.this.a);
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class v extends Lambda implements gzs<pqk0> {
        public v() {
            super(0);
        }

        @Override // xsna.gzs
        public final pqk0 invoke() {
            Logger logger = yfq0.a;
            Logger logger2 = e5w0.this.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            if (qxi.b == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            if (qxi.b != null) {
                return new pqk0(applicationContext, (yly) v6g0.K.getValue(), logger2);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class w extends Lambda implements gzs<yfl0> {
        public static final w i = new w(0);

        @Override // xsna.gzs
        public final yfl0 invoke() {
            Logger logger = yfq0.a;
            return new yfl0((msi0) v6g0.r.getValue());
        }
    }

    /* compiled from: VkpnsPushProviderSdk.kt */
    public static final class x extends Lambda implements gzs<StopPushServiceInteractor> {
        public x() {
            super(0);
        }

        @Override // xsna.gzs
        public final StopPushServiceInteractor invoke() {
            Logger logger = ycx.a;
            return ycx.d(e5w0.this.a);
        }
    }

    public e5w0(VkpnsPushConfig vkpnsPushConfig) {
        Logger logger;
        qxi qxiVar = qxi.a;
        if (!epx.f(qxi.b, vkpnsPushConfig)) {
            synchronized (qxiVar) {
                try {
                    if (!epx.f(qxi.b, vkpnsPushConfig)) {
                        qxi.b = vkpnsPushConfig;
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
        this.a = (vkpnsPushConfig2 == null || (logger = vkpnsPushConfig2.c) == null) ? new DefaultLogger("VkpnsPushProviderSdk") : logger;
        this.b = new bpn0(c.i);
        this.c = new bpn0(r.i);
        this.d = new bpn0(k.i);
        this.e = new bpn0(h.i);
        this.f = new bpn0(m.i);
        this.g = new bpn0(d.i);
        this.h = new bpn0(o.i);
        this.i = new bpn0(e.i);
        this.j = new bpn0(new v());
        this.k = new bpn0(p.i);
        this.l = new bpn0(w.i);
        this.m = new bpn0(i.i);
        this.n = new bpn0(g.i);
        this.o = new bpn0(l.i);
        this.p = new bpn0(new u());
        this.q = new bpn0(new x());
        this.r = new bpn0(new q());
        this.s = new bpn0(j.i);
        this.t = new bpn0(n.i);
        this.u = new bpn0(s.i);
        this.v = new bpn0(new f());
        this.w = new bpn0(t.i);
        this.x = zvj.a(bdn.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x018f, code lost:
    
        if (r11.b(r10, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017b, code lost:
    
        if (r3.a.write(new xsna.sap.a(!r11), r0) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a6, code lost:
    
        if (r11.b(r10, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        if (r11 != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z2, ContinuationImpl continuationImpl) {
        g5w0 g5w0Var;
        boolean isIgnoringBatteryOptimizations$default;
        boolean z3;
        boolean z4;
        e5w0 e5w0Var;
        Object a2;
        boolean z5;
        e5w0 e5w0Var2;
        Object e2;
        boolean z6;
        e5w0 e5w0Var3;
        if (continuationImpl instanceof g5w0) {
            g5w0Var = (g5w0) continuationImpl;
            int i2 = g5w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g5w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = g5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (g5w0Var.label) {
                    case 0:
                        kotlin.a.a(obj);
                        VkpnsPushConfig vkpnsPushConfig = qxi.b;
                        if (vkpnsPushConfig == null) {
                            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                        }
                        isIgnoringBatteryOptimizations$default = PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(vkpnsPushConfig.a.getApplicationContext(), null, 1, null);
                        if (isIgnoringBatteryOptimizations$default) {
                            pv6 pv6Var = (pv6) this.g.getValue();
                            g5w0Var.L$0 = this;
                            g5w0Var.Z$0 = z2;
                            g5w0Var.Z$1 = isIgnoringBatteryOptimizations$default;
                            g5w0Var.label = 1;
                            a2 = pv6Var.a(g5w0Var);
                            if (a2 != coroutineSingletons) {
                                e5w0Var = this;
                                if (!((Boolean) a2).booleanValue() || z2) {
                                    boolean z7 = isIgnoringBatteryOptimizations$default;
                                    z3 = z2;
                                    z4 = z7;
                                    if (!z4) {
                                        pv6 pv6Var2 = (pv6) e5w0Var.g.getValue();
                                        g5w0Var.L$0 = e5w0Var;
                                        g5w0Var.Z$0 = z3;
                                        g5w0Var.Z$1 = z4;
                                        g5w0Var.label = 2;
                                        Object a3 = pv6Var2.a(g5w0Var);
                                        if (a3 != coroutineSingletons) {
                                            z5 = z3;
                                            obj = a3;
                                            if (((Boolean) obj).booleanValue() && z5) {
                                                ((AnalyticsSender) e5w0Var.b.getValue()).send(kyw.a.a(new nta.a(true, false)));
                                                isIgnoringBatteryOptimizations$default = z4;
                                                Logger.DefaultImpls.info$default(e5w0Var.a, "Master elections is needed", null, 2, null);
                                                nj10 nj10Var = (nj10) e5w0Var.o.getValue();
                                                g5w0Var.L$0 = e5w0Var;
                                                g5w0Var.Z$0 = isIgnoringBatteryOptimizations$default;
                                                g5w0Var.label = 5;
                                                e2 = nj10Var.e(g5w0Var);
                                                if (e2 != coroutineSingletons) {
                                                    boolean z8 = isIgnoringBatteryOptimizations$default;
                                                    obj = e2;
                                                    z6 = z8;
                                                    e5w0Var3 = e5w0Var;
                                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                                    sap sapVar = (sap) e5w0Var3.e.getValue();
                                                    g5w0Var.L$0 = e5w0Var3;
                                                    g5w0Var.Z$0 = z6;
                                                    g5w0Var.label = 6;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    e5w0Var2 = e5w0Var;
                                    sap sapVar2 = (sap) e5w0Var2.e.getValue();
                                    g5w0Var.L$0 = e5w0Var2;
                                    g5w0Var.Z$0 = z4;
                                    g5w0Var.label = 3;
                                    obj = sapVar2.a(g5w0Var);
                                    break;
                                } else {
                                    ((AnalyticsSender) e5w0Var.b.getValue()).send(kyw.a.a(new nta.a(false, true)));
                                    Logger.DefaultImpls.info$default(e5w0Var.a, "Master elections is needed", null, 2, null);
                                    nj10 nj10Var2 = (nj10) e5w0Var.o.getValue();
                                    g5w0Var.L$0 = e5w0Var;
                                    g5w0Var.Z$0 = isIgnoringBatteryOptimizations$default;
                                    g5w0Var.label = 5;
                                    e2 = nj10Var2.e(g5w0Var);
                                    if (e2 != coroutineSingletons) {
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        z3 = z2;
                        z4 = isIgnoringBatteryOptimizations$default;
                        e5w0Var = this;
                        if (!z4) {
                        }
                        e5w0Var2 = e5w0Var;
                        sap sapVar22 = (sap) e5w0Var2.e.getValue();
                        g5w0Var.L$0 = e5w0Var2;
                        g5w0Var.Z$0 = z4;
                        g5w0Var.label = 3;
                        obj = sapVar22.a(g5w0Var);
                    case 1:
                        boolean z9 = g5w0Var.Z$1;
                        boolean z10 = g5w0Var.Z$0;
                        e5w0Var = (e5w0) g5w0Var.L$0;
                        kotlin.a.a(obj);
                        isIgnoringBatteryOptimizations$default = z9;
                        z2 = z10;
                        a2 = obj;
                        if (((Boolean) a2).booleanValue()) {
                        }
                        boolean z72 = isIgnoringBatteryOptimizations$default;
                        z3 = z2;
                        z4 = z72;
                        if (!z4) {
                        }
                        e5w0Var2 = e5w0Var;
                        sap sapVar222 = (sap) e5w0Var2.e.getValue();
                        g5w0Var.L$0 = e5w0Var2;
                        g5w0Var.Z$0 = z4;
                        g5w0Var.label = 3;
                        obj = sapVar222.a(g5w0Var);
                        break;
                    case 2:
                        z4 = g5w0Var.Z$1;
                        z5 = g5w0Var.Z$0;
                        e5w0Var = (e5w0) g5w0Var.L$0;
                        kotlin.a.a(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ((AnalyticsSender) e5w0Var.b.getValue()).send(kyw.a.a(new nta.a(true, false)));
                            isIgnoringBatteryOptimizations$default = z4;
                            Logger.DefaultImpls.info$default(e5w0Var.a, "Master elections is needed", null, 2, null);
                            nj10 nj10Var22 = (nj10) e5w0Var.o.getValue();
                            g5w0Var.L$0 = e5w0Var;
                            g5w0Var.Z$0 = isIgnoringBatteryOptimizations$default;
                            g5w0Var.label = 5;
                            e2 = nj10Var22.e(g5w0Var);
                            if (e2 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        e5w0Var2 = e5w0Var;
                        sap sapVar2222 = (sap) e5w0Var2.e.getValue();
                        g5w0Var.L$0 = e5w0Var2;
                        g5w0Var.Z$0 = z4;
                        g5w0Var.label = 3;
                        obj = sapVar2222.a(g5w0Var);
                        break;
                    case 3:
                        z4 = g5w0Var.Z$0;
                        e5w0Var2 = (e5w0) g5w0Var.L$0;
                        kotlin.a.a(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            pv6 pv6Var3 = (pv6) e5w0Var2.g.getValue();
                            g5w0Var.L$0 = null;
                            g5w0Var.label = 4;
                            break;
                        } else {
                            ((AnalyticsSender) e5w0Var2.b.getValue()).send(kyw.a.a(nta.b.d));
                            isIgnoringBatteryOptimizations$default = z4;
                            e5w0Var = e5w0Var2;
                            Logger.DefaultImpls.info$default(e5w0Var.a, "Master elections is needed", null, 2, null);
                            nj10 nj10Var222 = (nj10) e5w0Var.o.getValue();
                            g5w0Var.L$0 = e5w0Var;
                            g5w0Var.Z$0 = isIgnoringBatteryOptimizations$default;
                            g5w0Var.label = 5;
                            e2 = nj10Var222.e(g5w0Var);
                            if (e2 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        break;
                    case 4:
                        kotlin.a.a(obj);
                        return s3q0.a;
                    case 5:
                        z6 = g5w0Var.Z$0;
                        e5w0Var3 = (e5w0) g5w0Var.L$0;
                        kotlin.a.a(obj);
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        sap sapVar3 = (sap) e5w0Var3.e.getValue();
                        g5w0Var.L$0 = e5w0Var3;
                        g5w0Var.Z$0 = z6;
                        g5w0Var.label = 6;
                        break;
                    case 6:
                        z6 = g5w0Var.Z$0;
                        e5w0Var3 = (e5w0) g5w0Var.L$0;
                        kotlin.a.a(obj);
                        pv6 pv6Var4 = (pv6) e5w0Var3.g.getValue();
                        g5w0Var.L$0 = null;
                        g5w0Var.label = 7;
                        break;
                    case 7:
                        kotlin.a.a(obj);
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        g5w0Var = new g5w0(this, continuationImpl);
        Object obj2 = g5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (g5w0Var.label) {
        }
    }

    public final Object b(h5w0 h5w0Var) {
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig != null ? vkpnsPushConfig.d : false) {
            Object e2 = e(h5w0Var);
            return e2 == CoroutineSingletons.COROUTINE_SUSPENDED ? e2 : s3q0.a;
        }
        Object d2 = d(h5w0Var);
        return d2 == CoroutineSingletons.COROUTINE_SUSPENDED ? d2 : s3q0.a;
    }

    public final boolean c() {
        return ((GetInitializedHostPackagesUseCase) this.s.getValue()).invoke().size() > 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0178, code lost:
    
        if (r10.c(r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0160, code lost:
    
        if (r10.a.write(new xsna.ijh0.a(false), r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0141, code lost:
    
        if (r7.a.write(new xsna.sap.a(!r10), r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011a, code lost:
    
        if (r10 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        if (r10 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        i5w0 i5w0Var;
        e5w0 e5w0Var;
        Object b2;
        boolean z2;
        e5w0 e5w0Var2;
        boolean booleanValue;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        e5w0 e5w0Var3;
        if (continuationImpl instanceof i5w0) {
            i5w0Var = (i5w0) continuationImpl;
            int i3 = i5w0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i5w0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = i5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (i5w0Var.label) {
                    case 0:
                        kotlin.a.a(obj);
                        Logger.DefaultImpls.info$default(this.a, "This host is disabled now", null, 2, null);
                        ((xzm) this.n.getValue()).a();
                        ijh0 ijh0Var = (ijh0) this.c.getValue();
                        i5w0Var.L$0 = this;
                        i5w0Var.label = 1;
                        obj = ijh0Var.a(i5w0Var);
                        if (obj != coroutineSingletons) {
                            e5w0Var = this;
                            boolean booleanValue2 = ((Boolean) obj).booleanValue();
                            bk10 bk10Var = (bk10) e5w0Var.f.getValue();
                            i5w0Var.L$0 = e5w0Var;
                            i5w0Var.Z$0 = booleanValue2;
                            i5w0Var.label = 2;
                            b2 = bk10Var.b(i5w0Var);
                            if (b2 != coroutineSingletons) {
                                z2 = booleanValue2;
                                obj = b2;
                                e5w0Var2 = e5w0Var;
                                booleanValue = ((Boolean) obj).booleanValue();
                                z3 = z2;
                                if (booleanValue || !z2) {
                                    sap sapVar = (sap) e5w0Var2.e.getValue();
                                    i5w0Var.L$0 = e5w0Var2;
                                    i5w0Var.Z$0 = z2;
                                    i5w0Var.Z$1 = booleanValue;
                                    i5w0Var.label = 3;
                                    obj = sapVar.a(i5w0Var);
                                    z4 = z2;
                                    break;
                                }
                                nj10 nj10Var = (nj10) e5w0Var2.o.getValue();
                                i5w0Var.L$0 = e5w0Var2;
                                i5w0Var.Z$0 = z3;
                                i5w0Var.Z$1 = booleanValue;
                                i5w0Var.label = 4;
                                obj = nj10Var.e(i5w0Var);
                                z5 = z3;
                                break;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        e5w0Var = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        boolean booleanValue22 = ((Boolean) obj).booleanValue();
                        bk10 bk10Var2 = (bk10) e5w0Var.f.getValue();
                        i5w0Var.L$0 = e5w0Var;
                        i5w0Var.Z$0 = booleanValue22;
                        i5w0Var.label = 2;
                        b2 = bk10Var2.b(i5w0Var);
                        if (b2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        boolean z9 = i5w0Var.Z$0;
                        e5w0 e5w0Var4 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        e5w0Var2 = e5w0Var4;
                        z2 = z9;
                        booleanValue = ((Boolean) obj).booleanValue();
                        z3 = z2;
                        if (booleanValue) {
                        }
                        sap sapVar2 = (sap) e5w0Var2.e.getValue();
                        i5w0Var.L$0 = e5w0Var2;
                        i5w0Var.Z$0 = z2;
                        i5w0Var.Z$1 = booleanValue;
                        i5w0Var.label = 3;
                        obj = sapVar2.a(i5w0Var);
                        z4 = z2;
                        break;
                    case 3:
                        booleanValue = i5w0Var.Z$1;
                        boolean z10 = i5w0Var.Z$0;
                        e5w0Var2 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        z4 = z10;
                        z6 = z4;
                        z3 = z4;
                        break;
                    case 4:
                        booleanValue = i5w0Var.Z$1;
                        boolean z11 = i5w0Var.Z$0;
                        e5w0Var2 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        z5 = z11;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        sap sapVar3 = (sap) e5w0Var2.e.getValue();
                        i5w0Var.L$0 = e5w0Var2;
                        i5w0Var.Z$0 = z5;
                        i5w0Var.Z$1 = booleanValue;
                        i5w0Var.label = 5;
                        z6 = z5;
                        break;
                    case 5:
                        booleanValue = i5w0Var.Z$1;
                        boolean z12 = i5w0Var.Z$0;
                        e5w0Var2 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        z6 = z12;
                        ijh0 ijh0Var2 = (ijh0) e5w0Var2.c.getValue();
                        i5w0Var.L$0 = e5w0Var2;
                        i5w0Var.Z$0 = z6;
                        i5w0Var.Z$1 = booleanValue;
                        i5w0Var.label = 6;
                        z7 = z6;
                        break;
                    case 6:
                        booleanValue = i5w0Var.Z$1;
                        boolean z13 = i5w0Var.Z$0;
                        e5w0Var2 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        z7 = z13;
                        bk10 bk10Var3 = (bk10) e5w0Var2.f.getValue();
                        i5w0Var.L$0 = e5w0Var2;
                        i5w0Var.Z$0 = z7;
                        i5w0Var.Z$1 = booleanValue;
                        i5w0Var.label = 7;
                        z8 = z7;
                        break;
                    case 7:
                        booleanValue = i5w0Var.Z$1;
                        boolean z14 = i5w0Var.Z$0;
                        e5w0Var2 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        z8 = z14;
                        int i4 = !z8;
                        pmy pmyVar = (pmy) e5w0Var2.d.getValue();
                        i5w0Var.L$0 = e5w0Var2;
                        i5w0Var.Z$0 = booleanValue;
                        i5w0Var.I$0 = i4;
                        i5w0Var.label = 8;
                        Object a2 = pmyVar.a(i5w0Var);
                        if (a2 != coroutineSingletons) {
                            i2 = i4;
                            obj = a2;
                            e5w0Var3 = e5w0Var2;
                            e5w0Var3.f(booleanValue, ((Boolean) obj).booleanValue(), i2 != 0);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    case 8:
                        i2 = i5w0Var.I$0;
                        booleanValue = i5w0Var.Z$0;
                        e5w0Var3 = (e5w0) i5w0Var.L$0;
                        kotlin.a.a(obj);
                        e5w0Var3.f(booleanValue, ((Boolean) obj).booleanValue(), i2 != 0);
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        i5w0Var = new i5w0(this, continuationImpl);
        Object obj2 = i5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (i5w0Var.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0255, code lost:
    
        if (r3.d(r4, r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0259, code lost:
    
        r3 = r2;
        r6 = r8;
        r4 = r9;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0274, code lost:
    
        if (r8.a(false, r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02bc, code lost:
    
        if (r8.a(r3, r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02bf, code lost:
    
        r1 = r15;
        r0 = r8;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02e5, code lost:
    
        if (r8.a(false, r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fb, code lost:
    
        if (r15 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        j5w0 j5w0Var;
        e5w0 e5w0Var;
        boolean booleanValue;
        boolean z2;
        boolean z3;
        boolean booleanValue2;
        boolean z4;
        e5w0 e5w0Var2;
        boolean z5;
        boolean z6;
        e5w0 e5w0Var3;
        boolean z7;
        boolean z8;
        e5w0 e5w0Var4;
        boolean z9;
        boolean z10;
        boolean z11;
        VkpnsPushConfig vkpnsPushConfig;
        boolean z12;
        Object write;
        VkpnsPushConfig vkpnsPushConfig2;
        ijh0 ijh0Var;
        ijh0 ijh0Var2;
        if (continuationImpl instanceof j5w0) {
            j5w0Var = (j5w0) continuationImpl;
            int i2 = j5w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j5w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = j5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (j5w0Var.label) {
                    case 0:
                        kotlin.a.a(obj);
                        ((gip) this.m.getValue()).a();
                        ((CollectDeviceIdErrorsUseCase) this.v.getValue()).invoke();
                        ((hqf0) this.k.getValue()).a();
                        Logger logger = this.a;
                        ((qjh0) this.u.getValue()).getClass();
                        Logger.DefaultImpls.info$default(logger, "Host SDK is initialized. Version: 7.4.0-rc01", null, 2, null);
                        pmy pmyVar = (pmy) this.d.getValue();
                        j5w0Var.L$0 = this;
                        j5w0Var.label = 1;
                        obj = pmyVar.a(j5w0Var);
                        if (obj != coroutineSingletons) {
                            e5w0Var = this;
                            booleanValue = ((Boolean) obj).booleanValue();
                            j5w0Var.L$0 = e5w0Var;
                            j5w0Var.Z$0 = booleanValue;
                            j5w0Var.label = 2;
                            obj = e5w0Var.g(j5w0Var);
                            break;
                        }
                        return coroutineSingletons;
                    case 1:
                        e5w0 e5w0Var5 = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        e5w0Var = e5w0Var5;
                        booleanValue = ((Boolean) obj).booleanValue();
                        j5w0Var.L$0 = e5w0Var;
                        j5w0Var.Z$0 = booleanValue;
                        j5w0Var.label = 2;
                        obj = e5w0Var.g(j5w0Var);
                        break;
                    case 2:
                        booleanValue = j5w0Var.Z$0;
                        e5w0Var = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        bk10 bk10Var = (bk10) e5w0Var.f.getValue();
                        j5w0Var.L$0 = e5w0Var;
                        j5w0Var.Z$0 = booleanValue;
                        j5w0Var.Z$1 = booleanValue3;
                        j5w0Var.label = 3;
                        Object b2 = bk10Var.b(j5w0Var);
                        if (b2 != coroutineSingletons) {
                            boolean z13 = booleanValue;
                            z2 = booleanValue3;
                            obj = b2;
                            z3 = z13;
                            booleanValue2 = ((Boolean) obj).booleanValue();
                            if (!z3) {
                                Logger.DefaultImpls.info$default(e5w0Var.a, "First launch of host", null, 2, null);
                                if (e5w0Var.c()) {
                                    Logger.DefaultImpls.info$default(e5w0Var.a, "Master already exist", null, 2, null);
                                    pmy pmyVar2 = (pmy) e5w0Var.d.getValue();
                                    j5w0Var.L$0 = e5w0Var;
                                    j5w0Var.Z$0 = z3;
                                    j5w0Var.Z$1 = z2;
                                    j5w0Var.Z$2 = booleanValue2;
                                    j5w0Var.label = 6;
                                    write = pmyVar2.a.write(new pmy.a(false), j5w0Var);
                                    if (write != coroutineSingletons) {
                                    }
                                    if (write != coroutineSingletons) {
                                    }
                                } else {
                                    Logger.DefaultImpls.info$default(e5w0Var.a, "This host became a master", null, 2, null);
                                    bk10 bk10Var2 = (bk10) e5w0Var.f.getValue();
                                    VkpnsPushConfig vkpnsPushConfig3 = qxi.b;
                                    if (vkpnsPushConfig3 == null) {
                                        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                                    }
                                    String packageName = vkpnsPushConfig3.a.getApplicationContext().getPackageName();
                                    j5w0Var.L$0 = e5w0Var;
                                    j5w0Var.Z$0 = z3;
                                    j5w0Var.Z$1 = z2;
                                    j5w0Var.Z$2 = booleanValue2;
                                    j5w0Var.label = 4;
                                    if (bk10Var2.d(packageName, j5w0Var) != coroutineSingletons) {
                                        boolean z14 = z3;
                                        e5w0Var4 = e5w0Var;
                                        z9 = z14;
                                        z10 = z2;
                                        z11 = booleanValue2;
                                        vkpnsPushConfig = qxi.b;
                                        if (vkpnsPushConfig != null) {
                                            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                                        }
                                        boolean isIgnoringBatteryOptimizations$default = PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(vkpnsPushConfig.a.getApplicationContext(), null, 1, null);
                                        pv6 pv6Var = (pv6) e5w0Var4.g.getValue();
                                        j5w0Var.L$0 = e5w0Var4;
                                        j5w0Var.Z$0 = z9;
                                        j5w0Var.Z$1 = z10;
                                        j5w0Var.Z$2 = z11;
                                        j5w0Var.label = 5;
                                        if (pv6Var.b(isIgnoringBatteryOptimizations$default, j5w0Var) != coroutineSingletons) {
                                            z12 = z9;
                                            e5w0Var = e5w0Var4;
                                            ok10 ok10Var = (ok10) e5w0Var.t.getValue();
                                            vkpnsPushConfig2 = qxi.b;
                                            if (vkpnsPushConfig2 != null) {
                                                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                                            }
                                            Context applicationContext = vkpnsPushConfig2.a.getApplicationContext();
                                            ok10Var.getClass();
                                            ok10.a(applicationContext);
                                            booleanValue2 = z11;
                                            z2 = z10;
                                            z3 = z12;
                                            pmy pmyVar22 = (pmy) e5w0Var.d.getValue();
                                            j5w0Var.L$0 = e5w0Var;
                                            j5w0Var.Z$0 = z3;
                                            j5w0Var.Z$1 = z2;
                                            j5w0Var.Z$2 = booleanValue2;
                                            j5w0Var.label = 6;
                                            write = pmyVar22.a.write(new pmy.a(false), j5w0Var);
                                            if (write != coroutineSingletons) {
                                                write = s3q0.a;
                                            }
                                            if (write != coroutineSingletons) {
                                                e5w0Var3 = e5w0Var;
                                                z5 = z3;
                                                ijh0Var = (ijh0) e5w0Var3.c.getValue();
                                                j5w0Var.L$0 = e5w0Var3;
                                                j5w0Var.Z$0 = z5;
                                                j5w0Var.Z$1 = z2;
                                                j5w0Var.Z$2 = booleanValue2;
                                                j5w0Var.label = 7;
                                                if (ijh0Var.a.write(new ijh0.a(true), j5w0Var) != coroutineSingletons) {
                                                    z4 = booleanValue2;
                                                    e5w0Var2 = e5w0Var3;
                                                    ((oqk0) e5w0Var2.p.getValue()).b(e5w0Var2.x, new wv2(e5w0Var2));
                                                    ((StopPushServiceInteractor) e5w0Var2.q.getValue()).a(e5w0Var2.x, new its(e5w0Var2));
                                                    e5w0Var2.f(z4, z5, z2);
                                                    return s3q0.a;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (!z2) {
                                    if (!booleanValue2) {
                                        ((ip9) e5w0Var.i.getValue()).a();
                                        Logger.DefaultImpls.info$default(e5w0Var.a, "This host not a master", null, 2, null);
                                        j5w0Var.L$0 = e5w0Var;
                                        j5w0Var.Z$0 = z3;
                                        j5w0Var.Z$1 = z2;
                                        j5w0Var.Z$2 = booleanValue2;
                                        j5w0Var.label = 12;
                                        break;
                                    } else {
                                        Logger.DefaultImpls.info$default(e5w0Var.a, "This host already a master", null, 2, null);
                                        boolean c2 = e5w0Var.c();
                                        j5w0Var.L$0 = e5w0Var;
                                        j5w0Var.Z$0 = z3;
                                        j5w0Var.Z$1 = z2;
                                        j5w0Var.Z$2 = booleanValue2;
                                        j5w0Var.label = 11;
                                        break;
                                    }
                                    ((oqk0) e5w0Var2.p.getValue()).b(e5w0Var2.x, new wv2(e5w0Var2));
                                    ((StopPushServiceInteractor) e5w0Var2.q.getValue()).a(e5w0Var2.x, new its(e5w0Var2));
                                    e5w0Var2.f(z4, z5, z2);
                                    return s3q0.a;
                                }
                                Logger.DefaultImpls.info$default(e5w0Var.a, "This host is enabled now", null, 2, null);
                                if (e5w0Var.c()) {
                                    j5w0Var.L$0 = e5w0Var;
                                    j5w0Var.Z$0 = z3;
                                    j5w0Var.Z$1 = z2;
                                    j5w0Var.Z$2 = booleanValue2;
                                    j5w0Var.label = 9;
                                    break;
                                } else {
                                    Logger.DefaultImpls.info$default(e5w0Var.a, "This host became a master", null, 2, null);
                                    bk10 bk10Var3 = (bk10) e5w0Var.f.getValue();
                                    VkpnsPushConfig vkpnsPushConfig4 = qxi.b;
                                    if (vkpnsPushConfig4 == null) {
                                        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                                    }
                                    String packageName2 = vkpnsPushConfig4.a.getApplicationContext().getPackageName();
                                    j5w0Var.L$0 = e5w0Var;
                                    j5w0Var.Z$0 = z3;
                                    j5w0Var.Z$1 = z2;
                                    j5w0Var.Z$2 = booleanValue2;
                                    j5w0Var.label = 8;
                                    break;
                                }
                                ijh0Var2 = (ijh0) e5w0Var3.c.getValue();
                                j5w0Var.L$0 = e5w0Var3;
                                j5w0Var.Z$0 = z7;
                                j5w0Var.Z$1 = z6;
                                j5w0Var.Z$2 = z8;
                                j5w0Var.label = 10;
                                if (ijh0Var2.a.write(new ijh0.a(true), j5w0Var) != coroutineSingletons) {
                                    z4 = z8;
                                    z2 = z6;
                                    z5 = z7;
                                    e5w0Var2 = e5w0Var3;
                                    ((oqk0) e5w0Var2.p.getValue()).b(e5w0Var2.x, new wv2(e5w0Var2));
                                    ((StopPushServiceInteractor) e5w0Var2.q.getValue()).a(e5w0Var2.x, new its(e5w0Var2));
                                    e5w0Var2.f(z4, z5, z2);
                                    return s3q0.a;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 3:
                        z2 = j5w0Var.Z$1;
                        boolean z15 = j5w0Var.Z$0;
                        e5w0 e5w0Var6 = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        z3 = z15;
                        e5w0Var = e5w0Var6;
                        booleanValue2 = ((Boolean) obj).booleanValue();
                        if (!z3) {
                        }
                        return coroutineSingletons;
                    case 4:
                        z11 = j5w0Var.Z$2;
                        z10 = j5w0Var.Z$1;
                        z9 = j5w0Var.Z$0;
                        e5w0Var4 = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        vkpnsPushConfig = qxi.b;
                        if (vkpnsPushConfig != null) {
                        }
                        break;
                    case 5:
                        z11 = j5w0Var.Z$2;
                        z10 = j5w0Var.Z$1;
                        z12 = j5w0Var.Z$0;
                        e5w0Var = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        ok10 ok10Var2 = (ok10) e5w0Var.t.getValue();
                        vkpnsPushConfig2 = qxi.b;
                        if (vkpnsPushConfig2 != null) {
                        }
                        break;
                    case 6:
                        boolean z16 = j5w0Var.Z$2;
                        boolean z17 = j5w0Var.Z$1;
                        boolean z18 = j5w0Var.Z$0;
                        e5w0Var3 = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        booleanValue2 = z16;
                        z2 = z17;
                        z5 = z18;
                        ijh0Var = (ijh0) e5w0Var3.c.getValue();
                        j5w0Var.L$0 = e5w0Var3;
                        j5w0Var.Z$0 = z5;
                        j5w0Var.Z$1 = z2;
                        j5w0Var.Z$2 = booleanValue2;
                        j5w0Var.label = 7;
                        if (ijh0Var.a.write(new ijh0.a(true), j5w0Var) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                    case 10:
                    case 11:
                    case 12:
                        z4 = j5w0Var.Z$2;
                        z2 = j5w0Var.Z$1;
                        z5 = j5w0Var.Z$0;
                        e5w0Var2 = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        ((oqk0) e5w0Var2.p.getValue()).b(e5w0Var2.x, new wv2(e5w0Var2));
                        ((StopPushServiceInteractor) e5w0Var2.q.getValue()).a(e5w0Var2.x, new its(e5w0Var2));
                        e5w0Var2.f(z4, z5, z2);
                        return s3q0.a;
                    case 8:
                    case 9:
                        z8 = j5w0Var.Z$2;
                        z6 = j5w0Var.Z$1;
                        z7 = j5w0Var.Z$0;
                        e5w0Var3 = (e5w0) j5w0Var.L$0;
                        kotlin.a.a(obj);
                        ijh0Var2 = (ijh0) e5w0Var3.c.getValue();
                        j5w0Var.L$0 = e5w0Var3;
                        j5w0Var.Z$0 = z7;
                        j5w0Var.Z$1 = z6;
                        j5w0Var.Z$2 = z8;
                        j5w0Var.label = 10;
                        if (ijh0Var2.a.write(new ijh0.a(true), j5w0Var) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        j5w0Var = new j5w0(this, continuationImpl);
        Object obj2 = j5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (j5w0Var.label) {
        }
    }

    public final void f(boolean z2, boolean z3, boolean z4) {
        AnalyticsSender analyticsSender = (AnalyticsSender) this.b.getValue();
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        boolean z5 = vkpnsPushConfig != null ? vkpnsPushConfig.d : false;
        VkpnsPushConfig.BackgroundWorkMode backgroundWorkMode = qxi.b().f;
        boolean isIgnoringBatteryOptimizations$default = PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(qxi.b().a.getApplicationContext(), null, 1, null);
        int appStandbyBucket = PackageExtenstionsKt.getAppStandbyBucket(qxi.b().a.getApplicationContext());
        qxi.b();
        analyticsSender.send(new eke0(isIgnoringBatteryOptimizations$default, z2, z5, z3, z4, backgroundWorkMode, appStandbyBucket));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        k5w0 k5w0Var;
        int i2;
        if (continuationImpl instanceof k5w0) {
            k5w0Var = (k5w0) continuationImpl;
            int i3 = k5w0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k5w0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = k5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = k5w0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ijh0 ijh0Var = (ijh0) this.c.getValue();
                    k5w0Var.label = 1;
                    obj = ijh0Var.a(k5w0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }
        k5w0Var = new k5w0(this, continuationImpl);
        Object obj2 = k5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = k5w0Var.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj2).booleanValue());
    }
}
