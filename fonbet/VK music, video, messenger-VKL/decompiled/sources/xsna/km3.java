package xsna;

import com.vk.core.compose.component.VkHorizontalArrowDirection;
import com.vk.core.compose.component.VkHorizontalArrowSize;

/* compiled from: ArrowScreenContent.kt */
/* loaded from: classes18.dex */
public final class km3 {
    public final VkHorizontalArrowSize a;
    public final VkHorizontalArrowDirection b;

    public km3(VkHorizontalArrowSize vkHorizontalArrowSize, VkHorizontalArrowDirection vkHorizontalArrowDirection) {
        this.a = vkHorizontalArrowSize;
        this.b = vkHorizontalArrowDirection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km3)) {
            return false;
        }
        km3 km3Var = (km3) obj;
        return this.a == km3Var.a && this.b == km3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArrowVariant(size=" + this.a + ", direction=" + this.b + ')';
    }
}
