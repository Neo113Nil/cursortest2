package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class ml3 {
    public final ll3 a;

    public ml3(ll3 ll3Var) {
        this.a = ll3Var;
    }

    public final void a() {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.a(b);
    }

    public final void b(Object obj) {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.b(b, obj);
        b.setVisibility(0);
    }

    public final void a(oi oiVar, ol3 ol3Var, Object obj) {
        if (this.a.b() == null) {
            return;
        }
        this.a.a(oiVar, ol3Var, obj);
    }

    public final boolean a(Object obj) {
        View b = this.a.b();
        return b != null && this.a.a(b, obj);
    }
}
