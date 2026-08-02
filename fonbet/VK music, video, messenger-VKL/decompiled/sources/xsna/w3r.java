package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FeedRecyclerViewAccessibilityDelegate.kt */
/* loaded from: classes17.dex */
public final class w3r extends androidx.recyclerview.widget.l0 {
    public final RecyclerView b;

    public w3r(RecyclerView recyclerView) {
        super(recyclerView);
        this.b = recyclerView;
    }

    @Override // xsna.hk
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int eventType = accessibilityEvent.getEventType();
        if (eventType == R.id.action_go_to_next_heading) {
            dih0.b(childAdapterPosition, recyclerView, true);
            return true;
        }
        if (eventType != R.id.action_go_to_previous_heading) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        dih0.b(childAdapterPosition, recyclerView, false);
        return true;
    }
}
