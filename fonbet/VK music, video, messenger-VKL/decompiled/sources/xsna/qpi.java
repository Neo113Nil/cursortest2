package xsna;

import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class qpi extends wq70<VkGroupHeader.d> {
    public final /* synthetic */ ComposeHeaderVh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpi(VkGroupHeader.d dVar, ComposeHeaderVh composeHeaderVh) {
        super(dVar);
        this.b = composeHeaderVh;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, VkGroupHeader.d dVar, VkGroupHeader.d dVar2) {
        this.b.a().setTitle(dVar2);
    }
}
