package me.grishka.appkit.views;

import android.widget.AbsListView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: UsableRecyclerView.java */
/* loaded from: classes8.dex */
public final class a implements AbsListView.OnScrollListener {
    public final /* synthetic */ UsableRecyclerView b;

    public a(UsableRecyclerView usableRecyclerView) {
        this.b = usableRecyclerView;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        UsableRecyclerView usableRecyclerView = this.b;
        UsableRecyclerView.p pVar = usableRecyclerView.c;
        if (pVar != null && i + i2 >= i3 - 1 && i2 != 0 && i3 != 0) {
            pVar.N0();
        }
        UsableRecyclerView.p pVar2 = usableRecyclerView.c;
        if (pVar2 == null || !(pVar2 instanceof UsableRecyclerView.l)) {
            return;
        }
        ((UsableRecyclerView.l) pVar2).Zd(i, i2, i3);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        UsableRecyclerView.p pVar;
        if (i == 0 || i != 1 || (pVar = this.b.c) == null) {
            return;
        }
        pVar.M();
    }
}
