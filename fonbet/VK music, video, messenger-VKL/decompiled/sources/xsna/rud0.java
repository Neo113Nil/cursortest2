package xsna;

import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;

/* compiled from: InterestingStoriesBlockItemHolderView.kt */
/* loaded from: classes4.dex */
public final class rud0 {
    public final LinearLayout a;
    public final xzq0 b;
    public final VkText c;
    public final VkButton d;

    public rud0(LinearLayout linearLayout, xzq0 xzq0Var, VkText vkText, VkButton vkButton) {
        this.a = linearLayout;
        this.b = xzq0Var;
        this.c = vkText;
        this.d = vkButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rud0)) {
            return false;
        }
        rud0 rud0Var = (rud0) obj;
        return epx.f(this.a, rud0Var.a) && epx.f(this.b, rud0Var.b) && epx.f(this.c, rud0Var.c) && epx.f(this.d, rud0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileContainerViews(container=" + this.a + ", userStackViews=" + this.b + ", userNameView=" + this.c + ", openProfileButton=" + this.d + ')';
    }
}
