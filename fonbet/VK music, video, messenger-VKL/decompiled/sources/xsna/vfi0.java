package xsna;

import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: SemanticsRegion.android.kt */
/* loaded from: classes11.dex */
public final class vfi0 {
    public final Region a = new Region();

    public final boolean a(l9x l9xVar) {
        return this.a.op(l9xVar.a, l9xVar.b, l9xVar.c, l9xVar.d, Region.Op.DIFFERENCE);
    }

    public final l9x b() {
        Rect bounds = this.a.getBounds();
        return new l9x(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public final boolean c(vfi0 vfi0Var) {
        return this.a.op(vfi0Var.a, Region.Op.INTERSECT);
    }

    public final void d(l9x l9xVar) {
        this.a.set(l9xVar.a, l9xVar.b, l9xVar.c, l9xVar.d);
    }
}
