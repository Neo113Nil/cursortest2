package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: MultiVideoTimelineView.kt */
/* loaded from: classes16.dex */
public final class w640 extends hk {
    public final /* synthetic */ MultiVideoTimelineView b;

    public w640(MultiVideoTimelineView multiVideoTimelineView) {
        this.b = multiVideoTimelineView;
    }

    public final String a(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        long seconds = timeUnit.toSeconds(j) % j2;
        StringBuilder sb = new StringBuilder();
        MultiVideoTimelineView multiVideoTimelineView = this.b;
        if (minutes > 0) {
            int i = (int) minutes;
            sb.append(multiVideoTimelineView.getResources().getQuantityString(R.plurals.duration_accessibility_minutes, i, Integer.valueOf(i)));
        }
        int i2 = (int) seconds;
        sb.append(multiVideoTimelineView.getResources().getQuantityString(R.plurals.duration_accessibility_seconds, i2, Integer.valueOf(i2)));
        return sb.toString();
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        MultiVideoTimelineView multiVideoTimelineView = this.b;
        view.setContentDescription(multiVideoTimelineView.getResources().getString(R.string.timeline_duration_content_description, a((long) (multiVideoTimelineView.getProgress() * multiVideoTimelineView.getDuration())), a(multiVideoTimelineView.getDuration())));
    }

    @Override // xsna.hk
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getEventType() == 8;
    }
}
