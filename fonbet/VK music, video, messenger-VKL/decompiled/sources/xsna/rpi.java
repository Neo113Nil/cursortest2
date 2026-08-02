package xsna;

import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class rpi extends wq70<VkGroupHeader.c> {
    public final /* synthetic */ ComposeHeaderVh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpi(ComposeHeaderVh composeHeaderVh) {
        super(null);
        this.b = composeHeaderVh;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, VkGroupHeader.c cVar, VkGroupHeader.c cVar2) {
        this.b.a().setSubtitle(cVar2);
    }
}
