package xsna;

import com.vk.stat.scheme.CommonMarketStat$ProductCardFomoLabels;
import com.vk.stat.scheme.CommonMarketStat$TypeMedia;

/* compiled from: ProductCardGalleryAnalyticParams.kt */
/* loaded from: classes18.dex */
public final class xkd0 {
    public final CommonMarketStat$TypeMedia.Type a;
    public final int b;
    public final int c;
    public final boolean d;
    public final CommonMarketStat$ProductCardFomoLabels e;

    public xkd0(CommonMarketStat$TypeMedia.Type type, int i, int i2, boolean z, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels) {
        this.a = type;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = commonMarketStat$ProductCardFomoLabels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkd0)) {
            return false;
        }
        xkd0 xkd0Var = (xkd0) obj;
        return this.a == xkd0Var.a && this.b == xkd0Var.b && this.c == xkd0Var.c && this.d == xkd0Var.d && epx.f(this.e, xkd0Var.e);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels = this.e;
        return b + (commonMarketStat$ProductCardFomoLabels == null ? 0 : commonMarketStat$ProductCardFomoLabels.hashCode());
    }

    public final String toString() {
        return "ItemParams(type=" + this.a + ", id=" + this.b + ", idx=" + this.c + ", isBlurred=" + this.d + ", labels=" + this.e + ')';
    }
}
