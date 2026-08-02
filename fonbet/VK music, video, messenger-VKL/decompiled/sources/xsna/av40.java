package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.core.view.components.placeholder.VkPlaceholder;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class av40 extends wq70<VkPlaceholder.a> {
    public final /* synthetic */ MusicPlaceholderVh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av40(MusicPlaceholderVh musicPlaceholderVh) {
        super(null);
        this.b = musicPlaceholderVh;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, VkPlaceholder.a aVar, VkPlaceholder.a aVar2) {
        VkPlaceholder.a aVar3 = aVar2;
        VkPlaceholder vkPlaceholder = this.b.i;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        vkPlaceholder.setBottom(aVar3);
    }
}
