package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InterestingStoriesBlockRecyclerListener.kt */
/* loaded from: classes4.dex */
public final class sex extends RecyclerView.t {
    public final dhh b;
    public int c = -1;

    public sex(dhh dhhVar) {
        this.b = dhhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.o layoutManager;
        int s;
        if (i == 0 && (layoutManager = recyclerView.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager) && this.c != (s = ((LinearLayoutManager) layoutManager).s())) {
            this.c = s;
            this.b.invoke(Integer.valueOf(s));
        }
    }
}
