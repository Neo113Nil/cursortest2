package xsna;

import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: PodcastHeaderRecentHolder.kt */
/* loaded from: classes3.dex */
public final class lhb0 extends dib0<s3q0> {
    @Override // xsna.vif0
    public final void i6(Object obj) {
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.music_podcast_recent_episodes), null, null, null, 0, 510));
    }
}
