package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.am;

/* compiled from: AccessibilityUtils.kt */
/* loaded from: classes4.dex */
public final class ym {

    /* compiled from: AccessibilityUtils.kt */
    public static final class a extends hk {
        public final /* synthetic */ View b;
        public final /* synthetic */ Boolean c;

        public a(View view, Boolean bool) {
            this.b = view;
            this.c = bool;
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            View view2 = this.b;
            Context context = view2.getContext();
            int i2 = R.string.photo_flow_item_accessibility_action_select;
            Boolean bool = this.c;
            if (bool == null) {
                i = R.string.photo_flow_item_accessibility_action_open_viewer;
            } else if (bool.equals(Boolean.TRUE)) {
                i = R.string.photo_flow_item_accessibility_action_unselect;
            } else {
                if (!bool.equals(Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.photo_flow_item_accessibility_action_select;
            }
            amVar.b(new am.a(16, context.getString(i)));
            Context context2 = view2.getContext();
            if (bool == null) {
                i2 = R.string.photo_flow_item_accessibility_action_open_menu;
            } else if (bool.equals(Boolean.TRUE)) {
                i2 = R.string.photo_flow_item_accessibility_action_unselect;
            } else if (!bool.equals(Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            amVar.b(new am.a(32, context2.getString(i2)));
        }
    }

    public static final void a(View view, Boolean bool, boolean z) {
        view.setContentDescription(view.getContext().getString((bool == null && z) ? R.string.photo_flow_item_pinned_accessibility : epx.f(bool, Boolean.TRUE) ? R.string.photo_flow_item_selected_accessibility : R.string.photo_flow_item_accessibility));
        iut0.q(view, new a(view, bool));
    }
}
