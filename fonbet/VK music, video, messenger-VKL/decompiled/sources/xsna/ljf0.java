package xsna;

import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RecyclerToListViewScrollListener.java */
/* loaded from: classes8.dex */
public final class ljf0 extends RecyclerView.t {
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public ljf0(AbsListView.OnScrollListener onScrollListener) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = Integer.MIN_VALUE;
        arrayList.add(onScrollListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.f = 0;
        } else if (i == 1) {
            this.f = 1;
        } else if (i != 2) {
            this.f = Integer.MIN_VALUE;
        } else {
            this.f = 2;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((AbsListView.OnScrollListener) it.next()).onScrollStateChanged(null, this.f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4 = this.f;
        ArrayList arrayList = this.b;
        if (i4 == 2 && i2 < 35 && (i3 = this.g) > 0 && i3 - i2 < 100) {
            this.f = 3;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbsListView.OnScrollListener) it.next()).onScrollStateChanged(null, this.f);
            }
        }
        this.g = i2;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int v = linearLayoutManager.v();
            int abs = Math.abs(v - linearLayoutManager.x());
            int itemCount = recyclerView.getAdapter().getItemCount();
            if (v == this.c && abs == this.d && itemCount == this.e) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbsListView.OnScrollListener) it2.next()).onScroll(null, v, abs, itemCount);
            }
            this.c = v;
            this.d = abs;
            this.e = itemCount;
        }
    }
}
