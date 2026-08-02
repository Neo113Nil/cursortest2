package xsna;

import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vk.toggle.data.RecommendationsItemBadgeStyle;
import com.vk.toggle.data.RecommendationsItemImageCornersRoundingStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;

/* compiled from: RecommendationsCarouselItemStyleConfig.kt */
/* loaded from: classes6.dex */
public final class sbf0 {
    public static final sbf0 e = new sbf0(null, 15);
    public final RecommendationsItemBackgroundStyle a;
    public final RecommendationsItemBadgeStyle b;
    public final RecommendationsItemImageStyle c;
    public final RecommendationsItemImageCornersRoundingStyle d;

    /* compiled from: RecommendationsCarouselItemStyleConfig.kt */
    public static final class a {
        public static sbf0 a() {
            return sbf0.e;
        }
    }

    public sbf0() {
        this(null, 15);
    }

    public static sbf0 a(sbf0 sbf0Var, RecommendationsItemImageStyle recommendationsItemImageStyle) {
        RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle = sbf0Var.a;
        RecommendationsItemBadgeStyle recommendationsItemBadgeStyle = sbf0Var.b;
        RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle = sbf0Var.d;
        sbf0Var.getClass();
        return new sbf0(recommendationsItemBackgroundStyle, recommendationsItemBadgeStyle, recommendationsItemImageStyle, recommendationsItemImageCornersRoundingStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbf0)) {
            return false;
        }
        sbf0 sbf0Var = (sbf0) obj;
        return this.a == sbf0Var.a && this.b == sbf0Var.b && this.c == sbf0Var.c && this.d == sbf0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RecommendationsCarouselItemStyleConfig(backgroundStyle=" + this.a + ", badgeStyle=" + this.b + ", imageStyle=" + this.c + ", imageCornersRoundingStyle=" + this.d + ')';
    }

    public sbf0(RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle, RecommendationsItemBadgeStyle recommendationsItemBadgeStyle, RecommendationsItemImageStyle recommendationsItemImageStyle, RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle) {
        this.a = recommendationsItemBackgroundStyle;
        this.b = recommendationsItemBadgeStyle;
        this.c = recommendationsItemImageStyle;
        this.d = recommendationsItemImageCornersRoundingStyle;
    }

    public /* synthetic */ sbf0(RecommendationsItemImageStyle recommendationsItemImageStyle, int i) {
        this(RecommendationsItemBackgroundStyle.GRAY, RecommendationsItemBadgeStyle.DARKBLUR, (i & 4) != 0 ? RecommendationsItemImageStyle.PORTRAIT : recommendationsItemImageStyle, RecommendationsItemImageCornersRoundingStyle.TOP);
    }
}
