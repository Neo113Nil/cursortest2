package xsna;

import android.app.Activity;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.reefton.Reef;
import com.vk.reefton.dto.ReefHeartbeatType;
import com.vk.toggle.Features;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c63;

/* compiled from: VkReef.kt */
/* loaded from: classes.dex */
public final class jfv0 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static bpn0 d;
    public static VKApplication e;
    public static boolean f;
    public static gzs<String> g;
    public static String h;
    public static boolean i;
    public static final ConcurrentLinkedQueue j;
    public static boolean k;
    public static io.reactivex.rxjava3.disposables.c l;
    public static final bpn0 m;
    public static final bpn0 n;
    public static final bpn0 o;
    public static final bpn0 p;
    public static final bpn0 q;
    public static final bpn0 r;
    public static final bpn0 s;
    public static final bpn0 t;
    public static final bpn0 u;
    public static Reef v;
    public static final a w;

    /* compiled from: VkReef.kt */
    public static final class a extends c63.b {
        @Override // xsna.c63.b
        public final void u() {
            jfv0.a(new iiu0(3));
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            io.reactivex.rxjava3.disposables.c cVar = jfv0.l;
            if (cVar != null) {
                cVar.dispose();
            }
            long j = jfv0.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            asu0.a.getClass();
            int i = 2;
            jfv0.l = new io.reactivex.rxjava3.internal.operators.observable.k2(new io.reactivex.rxjava3.internal.operators.observable.y1(io.reactivex.rxjava3.core.q.C0(j, timeUnit, asu0.p())), new d2w(new fml(3), 2)).t0(1L).z0(jfv0.b, timeUnit, io.reactivex.rxjava3.internal.operators.observable.g0.b).subscribe(new f2w(new e2w(2), i), new kos(new g2w(i), 4));
        }
    }

    /* compiled from: VkReef.kt */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = timeUnit.toMillis(5L);
        b = timeUnit.toMillis(30L);
        c = timeUnit.toMillis(60L);
        g = new t0f(18);
        h = "";
        i = true;
        j = new ConcurrentLinkedQueue();
        m = new bpn0(new x0f(14));
        n = new bpn0(new dr6(24));
        o = new bpn0(new ox4(15));
        p = new bpn0(new aq0(16));
        q = new bpn0(new aqi(14));
        r = new bpn0(new wb3(11));
        s = new bpn0(new xb3(16));
        t = new bpn0(new xh6(20));
        u = new bpn0(new y56(15));
        w = new a();
    }

    public static void a(izs izsVar) {
        Reef reef = v;
        if (reef == null) {
            b();
            VKApplication vKApplication = e;
            if (vKApplication == null) {
                reef = null;
            } else {
                cnf0 cnf0Var = new cnf0(vKApplication);
                cnf0Var.c(new vqe0(14));
                int i2 = 6;
                cnf0Var.k(new chr0(i2));
                cnf0Var.j(new bem0(i2));
                cnf0Var.m(new cem0(4));
                cnf0Var.e(new xvc0(7));
                cnf0Var.f(ReefHeartbeatType.APP, Long.valueOf(c), TimeUnit.MILLISECONDS);
                cnf0Var.b();
                cnf0Var.g();
                if (!k) {
                    cnf0Var.d(new w2a0(17));
                    cnf0Var.l(new xbj0(8));
                    cnf0Var.i(new vo50(24));
                    cnf0Var.h(new i8c0(12));
                }
                if (BuildInfo.h()) {
                    L.e("REEF", "Init reef for app on thread " + Thread.currentThread().getName());
                }
                Reef a2 = cnf0Var.a();
                a2.c();
                while (true) {
                    izs izsVar2 = (izs) j.poll();
                    if (izsVar2 == null) {
                        break;
                    } else {
                        izsVar2.invoke(a2);
                    }
                }
                reef = a2;
            }
            if (reef != null) {
                v = reef;
            } else {
                reef = null;
            }
        }
        izsVar.invoke(reef);
    }

    public static void b() {
        if (f) {
            return;
        }
        f = true;
        asu0.a.getClass();
        qxm0.A(asu0.u());
        AtomicInteger atomicInteger = Reef.i;
        Reef.a.b(new b(com.vk.metrics.eventtracking.b.a));
        k = com.vk.toggle.b.A.a(Features.Type.FEATURE_REEF_TEST_DEFAULTS);
    }
}
