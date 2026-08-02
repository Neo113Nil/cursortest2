package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: ProfileGiftsFragment.kt */
/* loaded from: classes15.dex */
public final class xs5 implements VkCell.f {
    public final String a;
    public final Drawable b;

    public xs5(Drawable drawable, String str) {
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs5)) {
            return false;
        }
        xs5 xs5Var = (xs5) obj;
        return epx.f(this.a, xs5Var.a) && epx.f(this.b, xs5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "AvatarViewParams(avatarUri=" + this.a + ", placeholder=" + this.b + ')';
    }
}
