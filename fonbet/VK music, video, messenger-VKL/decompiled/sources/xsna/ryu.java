package xsna;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.vkontakte.android.R;
import xsna.am;

/* compiled from: HeadingAccessibilityDelegate.kt */
/* loaded from: classes17.dex */
public final class ryu extends hk {
    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        Resources resources = view.getResources();
        amVar.b(new am.a(R.id.action_go_to_next_heading, resources != null ? resources.getString(R.string.accessibility_next_heading_action) : null));
        amVar.b(new am.a(R.id.action_go_to_previous_heading, resources != null ? resources.getString(R.string.accessibility_previous_heading_action) : null));
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != R.id.action_go_to_next_heading && i != R.id.action_go_to_previous_heading) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        sendAccessibilityEvent(view, i);
        return true;
    }
}
