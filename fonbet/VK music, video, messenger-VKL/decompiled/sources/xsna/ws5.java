package xsna;

import com.vk.core.view.components.cell.VkCell;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public final class ws5 implements VkCell.f {
    public final String a;

    public ws5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws5) && epx.f(this.a, ((ws5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
    }
}
