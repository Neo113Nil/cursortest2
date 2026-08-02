package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: DialogStackChangedHelper.kt */
/* loaded from: classes17.dex */
public final class dkm implements bkm {
    public Context b;
    public sxc c;
    public txc d;
    public int e;
    public boolean f;

    public static void a(dkm dkmVar) {
        Context context = dkmVar.b;
        ww50 b = b(context);
        if (b != null) {
            b.c0(dkmVar);
        }
        dkmVar.b = context;
        ww50 b2 = b(context);
        if (b2 != null) {
            dkmVar.e = b2.y();
            b2.c0(dkmVar);
            b2.j(dkmVar);
        }
    }

    public static ww50 b(Context context) {
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null) {
            return ey50Var.Y();
        }
        return null;
    }

    @Override // xsna.bkm
    public final void bb(int i) {
        boolean z = this.f;
        boolean z2 = i > this.e;
        if (z2 == z) {
            return;
        }
        this.f = z2;
        if (z2) {
            this.c.invoke();
        } else {
            this.d.invoke();
        }
    }

    public final void c() {
        ww50 b = b(this.b);
        if (b != null) {
            b.c0(this);
        }
    }
}
