package xsna;

import com.vk.core.view.components.cell.VkCell;

/* compiled from: AdsSubscribeBannerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class us5 implements VkCell.f {
    public final String a;

    public us5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us5) && epx.f(this.a, ((us5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
    }
}
