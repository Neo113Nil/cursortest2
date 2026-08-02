package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.tabs.VkTabs;
import com.vkontakte.android.R;

/* compiled from: VideoRelatedVideosHeaderViewHolder.kt */
/* loaded from: classes7.dex */
public final class bct0 {
    public final ImageButton a;
    public final TextView b;
    public final TextView c;
    public final VkButton d;
    public final VkButton e;
    public final VkButton f;
    public final VkButton g;
    public final View h;
    public final VkTabs i;

    public bct0(ViewGroup viewGroup) {
        this.a = (ImageButton) viewGroup.findViewById(R.id.videoDialogNavigationIcon);
        this.b = (TextView) viewGroup.findViewById(R.id.videoDialogTitle);
        this.c = (TextView) viewGroup.findViewById(R.id.videoDialogSubtitle);
        this.d = (VkButton) viewGroup.findViewById(R.id.videoSortIcon);
        this.e = (VkButton) viewGroup.findViewById(R.id.videoShuffleIcon);
        this.f = (VkButton) viewGroup.findViewById(R.id.videoCycleModeIcon);
        this.g = (VkButton) viewGroup.findViewById(R.id.videoMoreIcon);
        this.h = viewGroup.findViewById(R.id.videoNavigationSwipeIcon);
        this.i = (VkTabs) viewGroup.findViewById(R.id.tabs);
    }
}
