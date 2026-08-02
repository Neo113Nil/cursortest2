package xsna;

import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class ppi extends wq70<VkGroupHeader.Right> {
    public final /* synthetic */ ComposeHeaderShowAllVh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppi(ComposeHeaderShowAllVh composeHeaderShowAllVh) {
        super(null);
        this.b = composeHeaderShowAllVh;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, VkGroupHeader.Right right, VkGroupHeader.Right right2) {
        qcy<Object>[] qcyVarArr = ComposeHeaderShowAllVh.x;
        this.b.a().setRight(right2);
    }
}
