package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.core.view.components.placeholder.VkPlaceholder;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class zu40 extends wq70<VkPlaceholder.b> {
    public final /* synthetic */ MusicPlaceholderVh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu40(MusicPlaceholderVh musicPlaceholderVh) {
        super(null);
        this.b = musicPlaceholderVh;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, VkPlaceholder.b bVar, VkPlaceholder.b bVar2) {
        VkPlaceholder.b bVar3 = bVar2;
        VkPlaceholder vkPlaceholder = this.b.i;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        vkPlaceholder.setMiddle(bVar3);
    }
}
