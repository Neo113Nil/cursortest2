package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollListener.kt */
/* loaded from: classes2.dex */
public final class rfh0 extends RecyclerView.t {
    public final uy90 b;
    public boolean c;

    public rfh0(uy90 uy90Var) {
        this.b = uy90Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = i != 0;
        this.c = z;
        if (z) {
            return;
        }
        this.b.a(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z = this.c;
        uy90 uy90Var = this.b;
        if (!z) {
            uy90Var.a(true);
            return;
        }
        Rect rect = (Rect) uy90Var.d;
        qd50 qd50Var = (qd50) uy90Var.a;
        Rect rect2 = (Rect) uy90Var.c;
        qd50Var.c(rect2);
        hez hezVar = (hez) uy90Var.b;
        uel0 c = hezVar.c(rect2);
        View view = c.a;
        int i3 = c.b;
        if (i3 < 0) {
            qd50Var.f();
            return;
        }
        if (i3 == 0) {
            qd50Var.f();
            hezVar.a(view, true);
            return;
        }
        Long d = hezVar.d(i3);
        if (d == null) {
            qd50Var.f();
            return;
        }
        qd50Var.h(d.longValue());
        vtt0.g((vtt0) qd50Var.c, i3 >= 2);
        uel0 b = hezVar.b(rect2);
        View view2 = b.a;
        int i4 = b.b;
        if (i4 < 0) {
            qd50Var.i(0);
            return;
        }
        hezVar.e(i4, rect);
        int i5 = rect2.top;
        int i6 = rect2.bottom;
        int i7 = rect.top;
        if (i7 < i5) {
            qd50Var.i(0);
            hezVar.a(view2, false);
        } else {
            qd50Var.i(i7 - i6);
            hezVar.a(view2, true);
        }
    }
}
