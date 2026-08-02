package xsna;

import com.vk.community.design.view.components.compose.CommunityCardImageCornersRoundingStyle;

/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public final class etg {
    public final String a;
    public final CommunityCardImageCornersRoundingStyle b;

    public etg(String str) {
        CommunityCardImageCornersRoundingStyle communityCardImageCornersRoundingStyle = CommunityCardImageCornersRoundingStyle.TOP;
        this.a = str;
        this.b = communityCardImageCornersRoundingStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etg)) {
            return false;
        }
        etg etgVar = (etg) obj;
        return epx.f(this.a, etgVar.a) && this.b == etgVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityCardImage(imageUrl=" + this.a + ", cornersStyle=" + this.b + ')';
    }
}
