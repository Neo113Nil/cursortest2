package xsna;

import com.vk.core.compose.generated.VkTypographyToken;

/* compiled from: VkParagraphStyle.kt */
/* loaded from: classes17.dex */
public final class uav0 {
    public final VkTypographyToken a;

    public uav0(VkTypographyToken vkTypographyToken) {
        this.a = vkTypographyToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uav0) && this.a == ((uav0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VkParagraphStyle(textStyleToken=" + this.a + ')';
    }
}
