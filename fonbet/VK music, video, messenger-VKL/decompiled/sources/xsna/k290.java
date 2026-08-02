package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import java.util.Iterator;

/* compiled from: OverlayComponentsTouchListener.kt */
/* loaded from: classes4.dex */
public final class k290 implements View.OnTouchListener {
    public final FeedRecyclerView b;
    public final b2r c;
    public boolean d;
    public final GestureDetector e;

    public k290(FeedRecyclerView feedRecyclerView, b2r b2rVar) {
        this.b = feedRecyclerView;
        this.c = b2rVar;
        this.e = new GestureDetector(feedRecyclerView.getContext(), new j290(this));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FeedRecyclerView feedRecyclerView = this.b;
        if (feedRecyclerView.getScrollState() == 0 && motionEvent != null) {
            boolean onTouchEvent = this.e.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                Iterator it = this.c.h.values().iterator();
                while (it.hasNext()) {
                    ((pyp0) it.next()).e();
                }
                this.d = false;
                feedRecyclerView.requestDisallowInterceptTouchEvent(false);
            }
            if (this.d || onTouchEvent) {
                return true;
            }
        }
        return false;
    }
}
