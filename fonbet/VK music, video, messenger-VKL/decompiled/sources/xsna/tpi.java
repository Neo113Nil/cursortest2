package xsna;

import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class tpi extends wq70<VkGroupHeader.Right> {
    public final /* synthetic */ ComposeHeaderVh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpi(ComposeHeaderVh composeHeaderVh) {
        super(null);
        this.b = composeHeaderVh;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, VkGroupHeader.Right right, VkGroupHeader.Right right2) {
        this.b.a().setRight(right2);
    }
}
