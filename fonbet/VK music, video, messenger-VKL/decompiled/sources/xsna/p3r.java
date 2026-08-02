package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class p3r implements Runnable {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FeedReactionsStack d;
    public final /* synthetic */ int e;

    public /* synthetic */ p3r(RecyclerView recyclerView, int i, FeedReactionsStack feedReactionsStack, int i2) {
        this.b = recyclerView;
        this.c = i;
        this.d = feedReactionsStack;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = FeedReactionsStack.r;
        RecyclerView recyclerView = this.b;
        int i2 = this.c;
        if (recyclerView.canScrollVertically(i2)) {
            try {
                recyclerView.scrollBy(0, i2);
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
        }
        FeedReactionsStack feedReactionsStack = this.d;
        ViewGroup.LayoutParams layoutParams = feedReactionsStack.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.e;
        }
        feedReactionsStack.requestLayout();
    }
}
