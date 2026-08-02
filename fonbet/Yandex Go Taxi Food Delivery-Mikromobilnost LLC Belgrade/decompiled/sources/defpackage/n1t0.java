package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u0;
import just.adapter.scroll.ScrollDirection;
import just.adapter.snapping.SnappingAnchor;

/* loaded from: classes4.dex */
public final class n1t0 {
    public final RecyclerView.e a;
    public final tls b;
    public final SnappingAnchor c;
    public final View d;
    public final int e;
    public final int f;
    public final int g;

    public n1t0(RecyclerView.e eVar, kn2 kn2Var, SnappingAnchor snappingAnchor, View view, d2t0 d2t0Var, ScrollDirection scrollDirection) {
        ruw ruwVar;
        int b;
        ruw ruwVar2;
        int b2;
        this.a = eVar;
        this.b = kn2Var;
        this.c = snappingAnchor;
        this.d = view;
        int measuredWidth = eVar.I() ? view.getMeasuredWidth() : view.getMeasuredHeight();
        Float f = d2t0Var.a;
        y1t0 y1t0Var = d2t0Var.d;
        y1t0 y1t0Var2 = d2t0Var.c;
        int e = e(f != null ? rzo.s(f.floatValue(), view) : 0, view);
        this.e = e;
        int[] iArr = m1t0.a;
        int i = iArr[scrollDirection.ordinal()];
        if (i == 1) {
            ruwVar = y1t0Var.a;
        } else if (i == 2) {
            ruwVar = y1t0Var2.a;
        } else {
            if (i != 3) {
                w511.b();
                throw null;
            }
            ruwVar = y1t0Var2.a;
        }
        String str = ruwVar.b;
        View view2 = str != null ? (View) kn2Var.invoke(str) : null;
        if (view2 != null) {
            b = e(0, view2) - b(ruwVar, eVar.I() ? view2.getMeasuredWidth() : view2.getMeasuredHeight());
        } else {
            b = e - b(ruwVar, measuredWidth);
        }
        this.f = b;
        int i2 = iArr[scrollDirection.ordinal()];
        if (i2 == 1) {
            ruwVar2 = y1t0Var.b;
        } else if (i2 == 2) {
            ruwVar2 = y1t0Var.b;
        } else {
            if (i2 != 3) {
                w511.b();
                throw null;
            }
            ruwVar2 = y1t0Var2.b;
        }
        String str2 = ruwVar2.b;
        View view3 = str2 != null ? (View) kn2Var.invoke(str2) : null;
        if (view3 != null) {
            b2 = e(0, view3) - b(ruwVar2, eVar.I() ? view3.getMeasuredWidth() : view3.getMeasuredHeight());
        } else {
            b2 = e - b(ruwVar2, measuredWidth);
        }
        this.g = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(RecyclerView.e eVar) {
        PointF d;
        int itemCount = eVar.getItemCount();
        if (!(eVar instanceof u0) || (d = ((u0) eVar).d(itemCount - 1)) == null) {
            return false;
        }
        return d.x < 0.0f || d.y < 0.0f;
    }

    public final boolean a(int i, int i2, ScrollDirection scrollDirection) {
        int i3 = this.f;
        int i4 = this.g;
        if (i3 >= i4) {
            return false;
        }
        int i5 = m1t0.a[scrollDirection.ordinal()];
        int i6 = this.e;
        if (i5 == 1) {
            return i6 < i && i3 > i2;
        }
        if (i5 == 2) {
            return i6 > i && i4 < i2;
        }
        if (i5 == 3) {
            return i6 > i && i4 < i2;
        }
        w511.b();
        return false;
    }

    public final int b(ruw ruwVar, int i) {
        int i2 = m1t0.b[ruwVar.a.ordinal()];
        if (i2 == 1) {
            float f = i;
            Float f2 = ruwVar.d;
            return (int) (f * (f2 != null ? f2.floatValue() : 0.0f));
        }
        if (i2 != 2) {
            w511.b();
            return 0;
        }
        Integer num = ruwVar.c;
        if (num != null) {
            return rzo.u(num.intValue(), this.d);
        }
        return 0;
    }

    public final boolean c(int i) {
        return i <= this.g && this.f <= i;
    }

    public final int d() {
        return this.e;
    }

    public final int e(int i, View view) {
        SnappingAnchor snappingAnchor = SnappingAnchor.START;
        SnappingAnchor snappingAnchor2 = this.c;
        RecyclerView.e eVar = this.a;
        return (snappingAnchor2 == snappingAnchor ? eVar.I() ? f(eVar) ? view.getRight() : view.getLeft() : view.getTop() : eVar.I() ? f(eVar) ? view.getLeft() : view.getRight() : view.getBottom()) - i;
    }
}
