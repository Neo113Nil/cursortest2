package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.Features;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.internal.ToggleManager;
import com.vk.toggle.internal.a;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c63;
import xsna.ka3;
import xsna.la3;
import xsna.mgn0;
import xsna.up6;

/* compiled from: AppUtils.kt */
/* loaded from: classes11.dex */
public final class nb3 {
    public static final nb3 a;
    public static final c b;
    public static final io.reactivex.rxjava3.disposables.b c;
    public static final t6r0 d;
    public static c63.b e;
    public static final f f;
    public static final bpn0 g;
    public static ToggleManager.c h;
    public static final bpn0 i;

    /* compiled from: AppUtils.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.toggle.internal.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.toggle.internal.a aVar) {
            nb3 nb3Var = (nb3) this.receiver;
            nb3 nb3Var2 = nb3.a;
            nb3Var.getClass();
            if (epx.f(aVar, a.c.a)) {
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                la3 a = la3.a.a(bVar.i(Features.Type.FEATURE_CORE_TECH_TRACE_OTEL), com.vk.toggle.d.L());
                ka3.a aVar2 = new ka3.a(a.b(), a.a(), a.c(), a.e(), false, new ka3.b(a.d().a(), a.d().f(), a.d().h(), a.d().b(), a.d().e(), a.d().c(), a.d().d(), a.d().g()));
                ka3.a aVar3 = ka3.a;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Tracer config: " + aVar2});
                }
                if (!epx.f(ka3.a, aVar2)) {
                    ka3.a = aVar2;
                    n.execute(new ja3(0, aVar2, context));
                }
                up6.a(new up6.a(bVar.a(CoreFeatures.FIXED_SERVER_IMAGE_SIZE_GRID_FORCE_UPPER)));
            }
            return s3q0.a;
        }
    }

    /* compiled from: AppUtils.kt */
    public static final class b extends c63.b {
        public final ns b;

        public b(ns nsVar) {
            this.b = nsVar;
        }

        @Override // xsna.c63.b
        public final void u() {
            this.b.stop();
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            nb3.a.getClass();
            if (o25.a().b()) {
                this.b.a(o25.a().c(), new fb3(0));
            }
        }
    }

    /* compiled from: AppUtils.kt */
    public static final class c {
    }

    /* compiled from: AppUtils.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DevicePerformanceInfo.Class.values().length];
            try {
                iArr[DevicePerformanceInfo.Class.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DevicePerformanceInfo.Class.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DevicePerformanceInfo.Class.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ToggleManager.DevicePerformanceMetric.values().length];
            try {
                iArr2[ToggleManager.DevicePerformanceMetric.CPU.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ToggleManager.DevicePerformanceMetric.DISK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ToggleManager.DevicePerformanceMetric.RAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ToggleManager.DevicePerformanceMetric.OVERALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: AppUtils.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<wy2> {
        @Override // xsna.gzs
        public final wy2 invoke() {
            ((vx2) this.receiver).getClass();
            return vx2.b();
        }
    }

    /* compiled from: AppUtils.kt */
    public static final class f implements mgn0.h {
        @Override // xsna.mgn0.h
        public final ExecutorService a() {
            asu0.a.getClass();
            return asu0.h();
        }

        @Override // xsna.mgn0.h
        public final ExecutorService b(int i, String str) {
            return asu0.a.b(i, 0L, str);
        }

        @Override // xsna.mgn0.h
        public final ExecutorService c() {
            asu0.a.getClass();
            return asu0.n();
        }
    }

    static {
        nb3 nb3Var = new nb3();
        a = nb3Var;
        b = new c();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        c = bVar;
        d = new t6r0();
        f = new f();
        int i2 = 0;
        g = new bpn0(new mb3(0));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = com.vk.toggle.b.A.k().a.a0(asu0.a.d());
        ua3 ua3Var = new ua3(new a(1, nb3Var, nb3.class, "onTogglesEvent", "onTogglesEvent(Lcom/vk/toggle/internal/TogglesEvent;)V", 0), i2);
        int i3 = kwg0.a;
        bVar.b(a0.subscribe(ua3Var, new va3(new nu2("toggles observable error", 2), i2)));
        i = new bpn0(new wa3(i2));
    }

    public static final ToggleManager.DevicePerformanceClass a(DevicePerformanceInfo.Class r1) {
        int i2 = d.$EnumSwitchMapping$0[r1.ordinal()];
        if (i2 == 1) {
            return ToggleManager.DevicePerformanceClass.LOW;
        }
        if (i2 == 2) {
            return ToggleManager.DevicePerformanceClass.MEDIUM;
        }
        if (i2 == 3) {
            return ToggleManager.DevicePerformanceClass.HIGH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void b() {
        long p = we7.p();
        long o = we7.o();
        long n = we7.n();
        b.getClass();
        o2l.a.getClass();
        boolean b2 = o2l.b("__dbg_network_stat_force", false);
        a.getClass();
        cru0 cru0Var = new cru0(((Boolean) g.getValue()).booleanValue(), 1);
        cru0Var.g = p;
        m5m b3 = com.vk.toggle.d.v0.b();
        if (b3 == null) {
            m5m.d.getClass();
            b3 = m5m.e;
        }
        cru0Var.f = new zpu0(b3.c, b3.b, b3.a);
        cru0Var.h = o;
        cru0Var.i = n;
        cru0Var.e = b2 && BuildInfo.h();
        qsk0.a.n = new epf(new vyp[]{cru0Var, new rsr()});
    }

    public static void c(plq0 plq0Var) {
        if (o25.a().b()) {
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.c()) {
                c.b(bVar.u(new gb3(plq0Var, 0), null));
                asu0.a.getClass();
                asu0.n().execute(new hb3());
            }
        }
    }
}
