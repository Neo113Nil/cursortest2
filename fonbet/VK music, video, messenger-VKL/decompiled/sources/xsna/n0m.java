package xsna;

import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.core.preference.Preference;
import com.vkontakte.android.R;
import xsna.cyn0;

/* compiled from: DeprecatedAttachActivity.java */
/* loaded from: classes15.dex */
public final class n0m extends ViewPager.m {
    public final /* synthetic */ DeprecatedAttachActivity b;

    public n0m(DeprecatedAttachActivity deprecatedAttachActivity) {
        this.b = deprecatedAttachActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        DeprecatedAttachActivity deprecatedAttachActivity = this.b;
        deprecatedAttachActivity.O = i;
        deprecatedAttachActivity.P = f;
        StoryFragment W1 = deprecatedAttachActivity.W1();
        if (W1 != null) {
            if (!deprecatedAttachActivity.T || deprecatedAttachActivity.O != deprecatedAttachActivity.d0) {
                W1.fo(1.0f, deprecatedAttachActivity.H.getWidth());
            } else if (W1.fo(f, i2)) {
                deprecatedAttachActivity.H.setCurrentItem(deprecatedAttachActivity.d0);
            }
        }
        deprecatedAttachActivity.f2();
    }

    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        DeprecatedAttachActivity deprecatedAttachActivity = this.b;
        deprecatedAttachActivity.z.smoothScrollToPosition(i);
        deprecatedAttachActivity.O = i;
        deprecatedAttachActivity.P = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        cyn0.b bVar = deprecatedAttachActivity.C.f.get(i);
        if (deprecatedAttachActivity.v.e.size() <= 0 || !deprecatedAttachActivity.Z1()) {
            deprecatedAttachActivity.U1(true, true);
        } else {
            deprecatedAttachActivity.U1(false, true);
        }
        if (deprecatedAttachActivity.b0 && bVar.a == R.drawable.vk_icon_cup_outline_28) {
            deprecatedAttachActivity.T1(true);
            deprecatedAttachActivity.K.setText(R.string.picker_achievements_action_btn);
        } else {
            deprecatedAttachActivity.T1(false);
        }
        deprecatedAttachActivity.e2();
        if (bVar.a == R.drawable.money_transfer_outline_32) {
            Preference.f("Attach_Prefs").edit().putBoolean("MONEY_ATTACH_BADGE_SEEN", true).apply();
        }
        deprecatedAttachActivity.f2();
    }
}
