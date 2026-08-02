package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.screens.feed.helpers.scroll.ScrollEvent;

/* compiled from: ScrollListenerConverter.kt */
/* loaded from: classes17.dex */
public final class sfh0 extends RecyclerView.t {
    public final /* synthetic */ bfh0 b;
    public final /* synthetic */ dfh0 c;

    public sfh0(bfh0 bfh0Var, dfh0 dfh0Var) {
        this.b = bfh0Var;
        this.c = dfh0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ScrollEvent scrollEvent;
        dfh0 dfh0Var = this.c;
        if (i == 0) {
            scrollEvent = ScrollEvent.IDLE;
        } else if (i == 1) {
            scrollEvent = ScrollEvent.DRAGGING;
        } else if (i != 2) {
            return;
        } else {
            scrollEvent = ScrollEvent.SETTLING;
        }
        dfh0Var.a(scrollEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ScrollEvent scrollEvent;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.b) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            i = i2;
        }
        int scrollState = recyclerView.getScrollState();
        bfh0 bfh0Var = this.b;
        if (scrollState == 0) {
            scrollEvent = ScrollEvent.IDLE;
        } else if (scrollState == 1) {
            scrollEvent = ScrollEvent.DRAGGING;
        } else if (scrollState != 2) {
            return;
        } else {
            scrollEvent = ScrollEvent.SETTLING;
        }
        bfh0Var.a(scrollEvent, i);
    }
}
