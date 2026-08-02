package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FullVisibleItemPlayStrategy.kt */
/* loaded from: classes2.dex */
public final class xws implements db80 {
    @Override // xsna.db80
    public final xh5 b(ai5 ai5Var, int i, int i2) {
        return (xh5) j5g.a0(c(ai5Var, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<xh5> c(ai5 ai5Var, int i, int i2) {
        RecyclerView recyclerView;
        if (ai5Var == null || (recyclerView = ai5Var.getRecyclerView()) == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = i2 + i;
        while (i < i3) {
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != 0 && tev.a.a(findViewHolderForAdapterPosition.itemView) >= 1.0f) {
                y9t0 Eh = ai5Var.Eh(i);
                yg5 yg5Var = Eh != null ? Eh.a : null;
                ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                mnt0 c = ent0Var != null ? x5t0.c(ent0Var) : null;
                if (yg5Var != null && c != null) {
                    mnt0 mnt0Var = c;
                    arrayList.add(new xh5(yg5Var, mnt0Var.getVideoConfig(), mnt0Var.mo407getVideoView(), findViewHolderForAdapterPosition, null));
                }
            }
            i++;
        }
        return arrayList;
    }

    @Override // xsna.db80
    public final int a(RecyclerView recyclerView, int i, int i2) {
        return i;
    }
}
