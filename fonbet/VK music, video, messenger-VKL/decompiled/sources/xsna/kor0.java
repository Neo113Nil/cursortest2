package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: VerticalBannerView.kt */
/* loaded from: classes6.dex */
public final class kor0 extends hk {
    public final /* synthetic */ Context b;

    public kor0(Context context) {
        this.b = context;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.w(this.b.getString(R.string.vk_banner_ad_choices_accessibility_role));
    }
}
