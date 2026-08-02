package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkMiniUserStack;

/* compiled from: InterestingStoriesBlockItemHolderView.kt */
/* loaded from: classes4.dex */
public final class xzq0 {
    public final ConstraintLayout a;
    public final VkMiniUserStack b;
    public final VkText c;

    public xzq0(ConstraintLayout constraintLayout, VkMiniUserStack vkMiniUserStack, VkText vkText) {
        this.a = constraintLayout;
        this.b = vkMiniUserStack;
        this.c = vkText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzq0)) {
            return false;
        }
        xzq0 xzq0Var = (xzq0) obj;
        return epx.f(this.a, xzq0Var.a) && epx.f(this.b, xzq0Var.b) && epx.f(this.c, xzq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UserStackViews(container=" + this.a + ", avatar=" + this.b + ", title=" + this.c + ')';
    }
}
