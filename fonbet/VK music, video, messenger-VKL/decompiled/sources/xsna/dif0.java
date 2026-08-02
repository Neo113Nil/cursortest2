package xsna;

import android.graphics.Rect;
import java.util.List;
import xsna.q630;

/* compiled from: RectListNode.android.kt */
/* loaded from: classes11.dex */
public abstract class dif0 extends q630.c implements o1u {
    public Rect p;

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        zhf0 z = jgz.p(oVar).z(oVar, true);
        i2(new Rect(an10.b(z.a), an10.b(z.b), an10.b(z.c), an10.b(z.d)));
    }

    @Override // xsna.q630.c
    public final void b2() {
        i2(null);
    }

    public final void i2(Rect rect) {
        List systemGestureExclusionRects;
        q2q q2qVar = (q2q) this;
        ci50 ci50Var = new ci50(new Rect[16]);
        systemGestureExclusionRects = jtl.a(q2qVar).getSystemGestureExclusionRects();
        ci50Var.c(ci50Var.d, systemGestureExclusionRects);
        Rect rect2 = this.p;
        if (rect2 != null) {
            ci50Var.j(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            ci50Var.b(rect);
        }
        jtl.a(q2qVar).setSystemGestureExclusionRects(ci50Var.f());
        this.p = rect;
    }
}
