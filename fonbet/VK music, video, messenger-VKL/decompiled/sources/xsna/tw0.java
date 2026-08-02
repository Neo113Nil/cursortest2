package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: AdsItemEndOverlayRedesignContainer.kt */
/* loaded from: classes17.dex */
public final class tw0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public tw0(ChannelFragment.e eVar, ChannelFragment.f fVar, ChannelFragment.g gVar) {
        this.a = eVar;
        this.b = fVar;
        this.c = gVar;
    }

    public void a(RestrictionBadge restrictionBadge) {
        ((ChannelFragment.g) this.c).invoke(restrictionBadge);
    }

    public void b() {
        ((ChannelFragment.f) this.b).invoke();
    }

    public void c() {
        ((ChannelFragment.e) this.a).invoke();
    }

    public void d() {
        ((ChannelFragment.f) this.b).invoke();
    }

    public tw0(ViewGroup viewGroup) {
        this.a = (ConstraintLayout) viewGroup.findViewById(R.id.ads_end_overlay_container);
        this.b = (VkText) viewGroup.findViewById(R.id.ads_overlay_bottom_info);
        this.c = (VkPlaceholder) viewGroup.findViewById(R.id.ads_overlay_placeholder);
    }
}
