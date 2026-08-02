package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.core.view.components.tabs.VkTabs;
import com.vkontakte.android.R;

/* compiled from: ClipsGridTabLayoutInflater.kt */
/* loaded from: classes17.dex */
public final class qee {
    public static VkTabs a(NonBouncedAppBarLayout nonBouncedAppBarLayout) {
        VkTabs vkTabs = (VkTabs) bwt0.I(R.layout.clips_grid_tab_layout_with_card_indicator, nonBouncedAppBarLayout, false);
        View findViewById = nonBouncedAppBarLayout.findViewById(R.id.profile_clips_tabs);
        if (findViewById != null) {
            nonBouncedAppBarLayout.removeView(findViewById);
        }
        nonBouncedAppBarLayout.addView(vkTabs);
        return vkTabs;
    }

    public static boolean b(ViewGroup viewGroup) {
        return !(viewGroup.findViewById(R.id.profile_clips_tabs) instanceof VkTabs);
    }
}
