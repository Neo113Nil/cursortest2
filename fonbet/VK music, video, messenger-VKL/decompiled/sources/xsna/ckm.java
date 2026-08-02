package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: DialogStackChangedHelper.kt */
/* loaded from: classes2.dex */
public final class ckm implements bkm {
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final int d;
    public boolean e;
    public ww50<?> f;

    public ckm(int i, Context context, gzs gzsVar, gzs gzsVar2) {
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = i;
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y != null) {
            this.f = Y;
            this.e = Y.y() > i;
            Y.c0(this);
            Y.j(this);
        }
    }

    @Override // xsna.bkm
    public final void bb(int i) {
        boolean z = this.e;
        boolean z2 = i > this.d;
        if (z2 == z) {
            return;
        }
        if (z2) {
            this.e = true;
            this.c.invoke();
        } else {
            this.e = false;
            this.b.invoke();
        }
    }
}
