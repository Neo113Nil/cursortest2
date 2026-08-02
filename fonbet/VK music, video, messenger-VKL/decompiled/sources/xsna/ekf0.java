package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.viewer.engine.feed.internal.recycler.ScrollEvent;
import xsna.i1e;

/* compiled from: RecyclerViewScrollListener.kt */
/* loaded from: classes17.dex */
public final class ekf0 extends RecyclerView.t {
    public final LinearLayoutManager b;
    public final i1e.d c;
    public final i1e.a d;
    public final zx e;
    public int f = -1;

    public ekf0(LinearLayoutManager linearLayoutManager, i1e.d dVar, i1e.a aVar, zx zxVar) {
        this.b = linearLayoutManager;
        this.c = dVar;
        this.d = aVar;
        this.e = zxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ScrollEvent scrollEvent;
        i1e.d dVar = this.c;
        if (i == 0) {
            this.f = this.b.s();
            scrollEvent = ScrollEvent.IDLE;
        } else if (i == 1) {
            scrollEvent = ScrollEvent.DRAGGING;
        } else if (i != 2) {
            return;
        } else {
            scrollEvent = ScrollEvent.SETTLING;
        }
        dVar.a(scrollEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ScrollEvent scrollEvent;
        int s;
        int scrollState = recyclerView.getScrollState();
        LinearLayoutManager linearLayoutManager = this.b;
        if (scrollState == 0 && this.f != (s = linearLayoutManager.s())) {
            this.f = s;
            this.e.invoke(Integer.valueOf(s));
        }
        if (linearLayoutManager.b != 0) {
            i = i2;
        }
        int scrollState2 = recyclerView.getScrollState();
        i1e.a aVar = this.d;
        if (scrollState2 == 0) {
            this.f = linearLayoutManager.s();
            scrollEvent = ScrollEvent.IDLE;
        } else if (scrollState2 == 1) {
            scrollEvent = ScrollEvent.DRAGGING;
        } else if (scrollState2 != 2) {
            return;
        } else {
            scrollEvent = ScrollEvent.SETTLING;
        }
        aVar.a(scrollEvent, i);
    }
}
