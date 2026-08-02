package xsna;

import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class or5 implements VkCell.f {
    public final String a;
    public final VkAvatarBadge b;
    public final hdu0 c;

    public or5(String str, VkAvatarBadge vkAvatarBadge, hdu0 hdu0Var) {
        this.a = str;
        this.b = vkAvatarBadge;
        this.c = hdu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or5)) {
            return false;
        }
        or5 or5Var = (or5) obj;
        return epx.f(this.a, or5Var.a) && epx.f(this.b, or5Var.b) && epx.f(this.c, or5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        VkAvatarBadge vkAvatarBadge = this.b;
        int hashCode2 = (hashCode + (vkAvatarBadge == null ? 0 : vkAvatarBadge.hashCode())) * 31;
        hdu0 hdu0Var = this.c;
        return hashCode2 + (hdu0Var != null ? hdu0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarImageParams(avatarUri=" + this.a + ", badge=" + this.b + ", border=" + this.c + ')';
    }
}
