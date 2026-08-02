package defpackage;

/* loaded from: classes11.dex */
public final class gl91 implements Runnable {
    public final ql91 a;
    public final wp91 b;

    public gl91(ql91 ql91Var, wp91 wp91Var) {
        this.a = ql91Var;
        this.b = wp91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        wp91 wp91Var = this.b;
        if (ql91.y.k(this.a, this, ql91.f(wp91Var))) {
            ql91.h(this.a);
        }
    }
}
