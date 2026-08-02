package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;

/* loaded from: classes10.dex */
class AlertController$4 implements AbsListView.OnScrollListener {
    final /* synthetic */ a this$0;
    final /* synthetic */ View val$bottom;
    final /* synthetic */ View val$top;

    public AlertController$4(a aVar, View view, View view2) {
        this.this$0 = aVar;
        this.val$top = view;
        this.val$bottom = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View view = this.val$top;
        View view2 = this.val$bottom;
        if (view != null) {
            view.setVisibility(absListView.canScrollVertically(-1) ? 0 : 4);
        }
        if (view2 != null) {
            view2.setVisibility(absListView.canScrollVertically(1) ? 0 : 4);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
