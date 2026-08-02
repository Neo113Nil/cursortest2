package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: UserProfileGiftsAdapter.kt */
/* loaded from: classes5.dex */
public final class vs5 implements VkCell.f {
    public final String a;
    public final Drawable b;

    public vs5(Drawable drawable, String str) {
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs5)) {
            return false;
        }
        vs5 vs5Var = (vs5) obj;
        return epx.f(this.a, vs5Var.a) && epx.f(this.b, vs5Var.b);
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
