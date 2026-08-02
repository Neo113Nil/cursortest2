package xsna;

import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;

/* compiled from: ProductTileCtaButtonConfig.kt */
/* loaded from: classes18.dex */
public final class hsd0 {
    public final ProductTileCtaButtonType a;
    public final String b;
    public final Integer c;
    public final boolean d;

    public hsd0(ProductTileCtaButtonType productTileCtaButtonType, String str, Integer num, boolean z) {
        this.a = productTileCtaButtonType;
        this.b = str;
        this.c = num;
        this.d = z;
    }

    public /* synthetic */ hsd0(ProductTileCtaButtonType productTileCtaButtonType, String str, boolean z, int i) {
        this((i & 1) != 0 ? ProductTileCtaButtonType.DISABLED : productTileCtaButtonType, (i & 2) != 0 ? null : str, (Integer) null, (i & 8) != 0 ? false : z);
    }
}
