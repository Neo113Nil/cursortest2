package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: GoodSectionHeaderHolder.kt */
/* loaded from: classes18.dex */
public final class l8u extends vif0<k8u> {
    public final VkGroupHeader n;

    public l8u(ViewGroup viewGroup) {
        super(new VkGroupHeader(viewGroup.getContext(), null, 6), viewGroup);
        this.n = (VkGroupHeader) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(k8u k8uVar) {
        k8u k8uVar2 = k8uVar;
        VkGroupHeader.Size size = VkGroupHeader.Size.Medium;
        VkGroupHeader vkGroupHeader = this.n;
        vkGroupHeader.setSize(size);
        if (k8uVar2 != null) {
            vkGroupHeader.setTitle(new VkGroupHeader.d(u11.f(tlo0.Companion, k8uVar2.a), null, null, null, 0, 510));
            gzs<s3q0> gzsVar = k8uVar2.b;
            if (gzsVar != null) {
                vkGroupHeader.setRight(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(this.itemView.getContext().getString(R.string.show_all), gzsVar), null, null, 6));
            }
        }
    }
}
