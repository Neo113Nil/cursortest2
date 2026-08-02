package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class g751 extends f751 {
    public u1w o;
    public u1w p;
    public u1w q;

    public g751(n751 n751Var, WindowInsets windowInsets) {
        super(n751Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.k751
    public u1w i() {
        if (this.p == null) {
            this.p = u1w.d(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.k751
    public u1w k() {
        if (this.o == null) {
            this.o = u1w.d(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.k751
    public u1w m() {
        if (this.q == null) {
            this.q = u1w.d(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.d751, defpackage.k751
    public n751 n(int i, int i2, int i3, int i4) {
        return n751.h(null, this.c.inset(i, i2, i3, i4));
    }

    public g751(n751 n751Var, g751 g751Var) {
        super(n751Var, g751Var);
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
