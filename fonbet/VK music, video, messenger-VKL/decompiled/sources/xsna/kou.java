package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.notifications.NotificationItem;
import com.vk.notifications.GroupedNotificationsFragment;
import java.util.LinkedHashSet;

/* compiled from: GroupedNotificationsFragment.kt */
/* loaded from: classes4.dex */
public final class kou extends RecyclerView.t {
    public final /* synthetic */ GroupedNotificationsFragment b;

    public kou(GroupedNotificationsFragment groupedNotificationsFragment) {
        this.b = groupedNotificationsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (childAt.getTop() >= 0 && childAt.getBottom() <= recyclerView.getHeight()) {
                try {
                    NotificationItem notificationItem = ((ka70) recyclerView.findContainingViewHolder(childAt)).r;
                    if (notificationItem != null) {
                        qi70 qi70Var = this.b.a0;
                        String str = notificationItem.b;
                        LinkedHashSet<String> linkedHashSet = qi70Var.b;
                        if (!linkedHashSet.contains(str)) {
                            linkedHashSet.add(str);
                            qi70Var.a.add(str);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Exception unused) {
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
        }
    }
}
