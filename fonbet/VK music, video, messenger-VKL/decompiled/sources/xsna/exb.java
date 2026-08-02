package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import xsna.nwb;

/* compiled from: ChatProfileItemDecorator.kt */
/* loaded from: classes2.dex */
public final class exb extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;
    public final utd0 e;

    public exb(int i, int i2, int i3, utd0 utd0Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = utd0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean f;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean t = BuildInfo.t();
        int i = this.c;
        int i2 = this.b;
        utd0 utd0Var = this.e;
        if (!t) {
            boolean z = j5g.b0(childAdapterPosition, utd0Var.h.f) instanceof nwb.c;
            boolean z2 = childAdapterPosition >= 0 && childAdapterPosition == utd0Var.h.f.size() - 1;
            if (z) {
                rect.top = i2;
                if (!z2 && (j5g.b0(childAdapterPosition + 1, utd0Var.h.f) instanceof nwb.l)) {
                    i = this.d;
                }
                rect.bottom = i;
                return;
            }
            if ((childAdapterPosition == 0) && !(j5g.b0(childAdapterPosition, utd0Var.h.f) instanceof nwb.l)) {
                rect.top = i2;
                return;
            } else {
                if (!z2 || (j5g.b0(childAdapterPosition, utd0Var.h.f) instanceof nwb.l)) {
                    return;
                }
                rect.bottom = i;
                return;
            }
        }
        if (j5g.b0(childAdapterPosition, utd0Var.h.f) instanceof nwb.l) {
            return;
        }
        androidx.recyclerview.widget.d<hfz> dVar = utd0Var.h;
        androidx.recyclerview.widget.d<hfz> dVar2 = utd0Var.h;
        if (j5g.b0(childAdapterPosition, dVar.f) instanceof nwb.c) {
            return;
        }
        if (childAdapterPosition != 0) {
            i2 = 0;
        }
        hfz hfzVar = (hfz) j5g.b0(childAdapterPosition, dVar2.f);
        int i3 = childAdapterPosition + 1;
        hfz hfzVar2 = (hfz) j5g.b0(i3, dVar2.f);
        if ((hfzVar instanceof b7i) && (hfzVar2 instanceof b7i)) {
            f = ((b7i) hfzVar).b((b7i) hfzVar2);
        } else {
            f = epx.f(hfzVar != null ? hfzVar.getClass() : null, hfzVar2 != null ? hfzVar2.getClass() : null);
        }
        if (f || (j5g.b0(i3, dVar2.f) instanceof nwb.c)) {
            i = 0;
        }
        rect.set(0, i2, 0, i);
    }
}
