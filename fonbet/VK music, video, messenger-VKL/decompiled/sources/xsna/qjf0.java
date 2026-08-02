package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: RecyclerViewDelegate.java */
/* loaded from: classes8.dex */
public final class qjf0 {
    public final UsableRecyclerView a;

    public qjf0(UsableRecyclerView usableRecyclerView) {
        this.a = usableRecyclerView;
    }

    public final int a() {
        UsableRecyclerView usableRecyclerView = this.a;
        RecyclerView.o layoutManager = usableRecyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).v();
        }
        if (usableRecyclerView.getAdapter() == null || usableRecyclerView.getChildCount() == 0) {
            return 0;
        }
        return usableRecyclerView.getChildAdapterPosition(usableRecyclerView.getChildAt(0));
    }

    public final int b() {
        UsableRecyclerView usableRecyclerView = this.a;
        RecyclerView.o layoutManager = usableRecyclerView.getLayoutManager();
        return (layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).x() : (usableRecyclerView.getAdapter() == null || usableRecyclerView.getChildCount() == 0) ? 0 : usableRecyclerView.getChildAdapterPosition(usableRecyclerView.getChildAt(usableRecyclerView.getChildCount() - 1))) - a();
    }
}
