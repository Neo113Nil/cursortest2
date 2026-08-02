package xsna;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView;
import com.vkontakte.android.R;

/* compiled from: DynamicRatingView.kt */
/* loaded from: classes18.dex */
public final class rqo extends View.AccessibilityDelegate {
    public final /* synthetic */ DynamicRatingView a;
    public final /* synthetic */ Context b;

    public rqo(DynamicRatingView dynamicRatingView, Context context) {
        this.a = dynamicRatingView;
        this.b = context;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        DynamicRatingView dynamicRatingView = this.a;
        accessibilityNodeInfo.setContentDescription(dynamicRatingView.getResources().getString(R.string.rating_view_content_description_accessibility));
        if (dynamicRatingView.s) {
            return;
        }
        iut0.t(dynamicRatingView, this.b.getString(R.string.dynamic_rating_view_state_content_description, Integer.valueOf((int) dynamicRatingView.getRating())));
    }
}
