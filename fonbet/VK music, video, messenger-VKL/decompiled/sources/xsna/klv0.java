package xsna;

import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;

/* compiled from: VkSpanStyle.kt */
/* loaded from: classes17.dex */
public final class klv0 {
    public final VkTypographyToken a;
    public final VkColorToken b;

    public klv0(VkTypographyToken vkTypographyToken, VkColorToken vkColorToken) {
        this.a = vkTypographyToken;
        this.b = vkColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klv0)) {
            return false;
        }
        klv0 klv0Var = (klv0) obj;
        return this.a == klv0Var.a && this.b == klv0Var.b;
    }

    public final int hashCode() {
        VkTypographyToken vkTypographyToken = this.a;
        return this.b.hashCode() + ((vkTypographyToken == null ? 0 : vkTypographyToken.hashCode()) * 31);
    }

    public final String toString() {
        return "VkSpanStyle(textStyleToken=" + this.a + ", colorToken=" + this.b + ')';
    }
}
