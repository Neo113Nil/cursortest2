package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class os5 implements VkCell.d {
    public final VkAvatar a;

    public os5(Context context) {
        VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
        vkAvatar.setRound(true);
        vkAvatar.setFixedSize(iah0.a(32));
        this.a = vkAvatar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        or5 or5Var = fVar instanceof or5 ? (or5) fVar : null;
        if (or5Var != null) {
            VkAvatarBadge vkAvatarBadge = or5Var.b;
            VkAvatar vkAvatar = this.a;
            if (vkAvatarBadge == null) {
                vkAvatar.S0();
            } else {
                vkAvatar.Q0(vkAvatarBadge);
            }
            hdu0 hdu0Var = or5Var.c;
            if (hdu0Var != null) {
                hdu0Var.a(vkAvatar);
            }
            vkAvatar.o0(or5Var.a, null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
