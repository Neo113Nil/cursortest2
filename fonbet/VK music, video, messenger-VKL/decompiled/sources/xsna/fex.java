package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.aex;

/* compiled from: InterestingStoriesBlockItemsHolderAdapter.kt */
/* loaded from: classes4.dex */
public final class fex extends RecyclerView.i {
    public final /* synthetic */ gex a;

    public fex(gex gexVar) {
        this.a = gexVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b() {
        gex gexVar = this.a;
        if (gexVar.h.g() != null || gexVar.f.d.size() <= 0) {
            return;
        }
        aex c = gexVar.f.c(0);
        if (c instanceof aex.a) {
            gexVar.h.i((aex.a) c, 0);
        }
    }
}
