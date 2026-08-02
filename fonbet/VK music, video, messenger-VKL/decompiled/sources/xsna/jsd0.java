package xsna;

import android.content.Context;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.isd0;

/* compiled from: ProductTileCtaButtonConfigFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class jsd0 implements isd0 {

    /* compiled from: ProductTileCtaButtonConfigFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductTileCtaButtonType.values().length];
            try {
                iArr[ProductTileCtaButtonType.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTileCtaButtonType.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductTileCtaButtonType.CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductTileCtaButtonType.ADD_TO_CART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductTileCtaButtonType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductTileCtaButtonType.SIMILAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductTileCtaButtonType.GO_TO_CART.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductTileCtaButtonType.PARTNER_LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.isd0
    public final hsd0 a(Context context, isd0.b bVar) {
        String str = bVar.b;
        ProductTileCtaButtonType.a aVar = ProductTileCtaButtonType.Companion;
        int i = bVar.a;
        aVar.getClass();
        ProductTileCtaButtonType a2 = ProductTileCtaButtonType.a.a(i);
        switch (a.$EnumSwitchMapping$0[a2.ordinal()]) {
            case 1:
                return new hsd0(a2, (String) null, false, 6);
            case 2:
            case 3:
                return new hsd0(a2, str, true, 4);
            case 4:
                return new hsd0(a2, context.getString(R.string.market_cta_button_add_to_cart), true, 4);
            case 5:
                return new hsd0(a2, str, Integer.valueOf(R.drawable.vk_icon_link_16), true);
            case 6:
                return new hsd0(a2, str, true, 4);
            case 7:
                return new hsd0(a2, context.getString(R.string.market_cta_button_in_cart), true, 4);
            case 8:
                return new hsd0(a2, str, true, 4);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
