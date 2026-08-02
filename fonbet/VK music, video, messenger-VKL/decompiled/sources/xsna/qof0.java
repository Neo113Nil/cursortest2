package xsna;

import android.app.Application;
import com.vk.reefton.utils.ReefNetworkUtil;

/* compiled from: ReefServiceRegistry.kt */
/* loaded from: classes5.dex */
public final class qof0 {
    public static gnf0 A;
    public static dof0 C;
    public static ReefNetworkUtil E;
    public static hof0 G;
    public static enf0 I;
    public static apf0 K;
    public static som0 M;
    public static b8h0 w;
    public static xnf0 y;
    public final Application a;
    public fnf0 b;
    public b8h0 d;
    public aof0 f;
    public bof0 h;
    public xnf0 j;
    public unf0 l;
    public nnf0 n;
    public iof0 p;
    public static final bpn0 s = new bpn0(new iud0(1));
    public static final bpn0 t = new bpn0(new zo80(3));
    public static final a u = a.b;
    public static final b v = b.b;
    public static final ap80 x = new ap80(5);
    public static final gdi z = new gdi(1);
    public static final byo B = new byo(21);
    public static final u4u D = new u4u(25);
    public static final y160 F = new y160(8);
    public static final d230 H = new d230(10);
    public static final dl70 J = new dl70(12);
    public static final e420 L = new e420(17);
    public static final l35 N = new l35(23);
    public gzs<? extends fnf0> c = c.b;
    public gzs<? extends b8h0> e = new nof0(0);
    public gzs<? extends aof0> g = new ku70(7);
    public gzs<? extends bof0> i = new daz(11);
    public gzs<? extends xnf0> k = new bbb0(this, 8);
    public gzs<? extends unf0> m = e.b;
    public gzs<? extends nnf0> o = d.b;
    public gzs<? extends iof0> q = new uv80(3);
    public final bpn0 r = new bpn0(new ml7(24));

    /* compiled from: ReefServiceRegistry.kt */
    public static final class a implements gzs {
        public static final a b = new a();

        @Override // xsna.gzs
        public final Object invoke() {
            throw new IllegalStateException("ReefNetworkClient factory not provided");
        }
    }

    /* compiled from: ReefServiceRegistry.kt */
    public static final class b implements gzs {
        public static final b b = new b();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* compiled from: ReefServiceRegistry.kt */
    public static final class c implements gzs {
        public static final c b = new c();

        @Override // xsna.gzs
        public final Object invoke() {
            throw new IllegalStateException("ReefConfig factory not provided!");
        }
    }

    /* compiled from: ReefServiceRegistry.kt */
    public static final class d implements gzs {
        public static final d b = new d();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* compiled from: ReefServiceRegistry.kt */
    public static final class e implements gzs {
        public static final e b = new e();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    public qof0(Application application) {
        this.a = application;
    }

    public final fnf0 a() {
        fnf0 fnf0Var = this.b;
        if (fnf0Var != null) {
            return fnf0Var;
        }
        fnf0 invoke = this.c.invoke();
        this.b = invoke;
        return invoke;
    }

    public final aof0 b() {
        aof0 aof0Var = this.f;
        if (aof0Var != null) {
            return aof0Var;
        }
        aof0 invoke = this.g.invoke();
        this.f = invoke;
        return invoke;
    }

    public final ReefNetworkUtil c() {
        ReefNetworkUtil reefNetworkUtil = E;
        if (reefNetworkUtil != null) {
            return reefNetworkUtil;
        }
        ReefNetworkUtil reefNetworkUtil2 = (ReefNetworkUtil) F.invoke(this);
        E = reefNetworkUtil2;
        return reefNetworkUtil2;
    }

    public final hof0 d() {
        hof0 hof0Var = G;
        if (hof0Var != null) {
            return hof0Var;
        }
        hof0 hof0Var2 = (hof0) H.invoke(this);
        G = hof0Var2;
        return hof0Var2;
    }

    public final b8h0 e() {
        b8h0 b8h0Var = this.d;
        if (b8h0Var != null) {
            return b8h0Var;
        }
        b8h0 invoke = this.e.invoke();
        this.d = invoke;
        return invoke;
    }

    public final com.vk.reefton.d f() {
        return (com.vk.reefton.d) this.r.getValue();
    }
}
