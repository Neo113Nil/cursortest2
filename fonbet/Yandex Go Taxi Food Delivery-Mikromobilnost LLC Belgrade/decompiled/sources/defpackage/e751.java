package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class e751 extends d751 {
    public u1w n;

    public e751(n751 n751Var, e751 e751Var) {
        super(n751Var, e751Var);
        this.n = null;
        this.n = e751Var.n;
    }

    @Override // defpackage.k751
    public n751 b() {
        return n751.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.k751
    public n751 c() {
        return n751.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.k751
    public final u1w j() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = u1w.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.k751
    public boolean o() {
        return this.c.isConsumed();
    }

    public e751(n751 n751Var, WindowInsets windowInsets) {
        super(n751Var, windowInsets);
        this.n = null;
    }
}
