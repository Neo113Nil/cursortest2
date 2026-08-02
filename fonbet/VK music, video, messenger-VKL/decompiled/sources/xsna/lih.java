package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CommunityProfileContentGoodsViewHolder.kt */
/* loaded from: classes5.dex */
public final class lih extends GridLayoutManager.c {
    public final /* synthetic */ kih d;

    public lih(kih kihVar) {
        this.d = kihVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        RecyclerView.Adapter z0 = this.d.I.z0(i);
        return ((z0 instanceof hlh) || (z0 instanceof ffh) || (z0 instanceof rjh) || (z0 instanceof eeh)) ? 2 : 1;
    }
}
