package xsna;

import android.content.Context;

/* compiled from: AppLovinDynamicLibLoader.kt */
/* loaded from: classes14.dex */
public final class g73 {
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final b25 d;
    public final bpn0 e = new bpn0(new im0(this, 4));
    public final bpn0 f = new bpn0(new ra(this, 2));

    /* compiled from: AppLovinDynamicLibLoader.kt */
    public static abstract class a {

        /* compiled from: AppLovinDynamicLibLoader.kt */
        /* renamed from: xsna.g73$a$a, reason: collision with other inner class name */
        public static final class C2917a extends a {
            public final Throwable a;

            public C2917a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: AppLovinDynamicLibLoader.kt */
        public static abstract class b extends a {

            /* compiled from: AppLovinDynamicLibLoader.kt */
            /* renamed from: xsna.g73$a$b$a, reason: collision with other inner class name */
            public static final class C2918a extends b {
            }

            /* compiled from: AppLovinDynamicLibLoader.kt */
            /* renamed from: xsna.g73$a$b$b, reason: collision with other inner class name */
            public static final class C2919b extends b {
                public final e73 a;

                public C2919b(e73 e73Var) {
                    this.a = e73Var;
                }
            }
        }
    }

    /* compiled from: AppLovinDynamicLibLoader.kt */
    public static final class b extends vdl<p73> {
    }

    public g73(Context context, boolean z, boolean z2, b25 b25Var) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = b25Var;
    }

    public final void a() {
        bpn0 bpn0Var = this.f;
        ((eqo) bpn0Var.getValue()).g = null;
        ((eqo) bpn0Var.getValue()).a();
    }
}
