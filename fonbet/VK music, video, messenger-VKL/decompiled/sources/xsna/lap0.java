package xsna;

import com.vk.core.compose.generated.VkColorToken;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class lap0 {
    public final VkColorToken a;

    public lap0(VkColorToken vkColorToken) {
        this.a = vkColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lap0) && this.a == ((lap0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopshelfCardContainerAppearance(placeholderColor=" + this.a + ')';
    }
}
