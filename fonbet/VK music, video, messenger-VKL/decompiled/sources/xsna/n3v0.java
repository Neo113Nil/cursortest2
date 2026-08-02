package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkMarketProductTileDefaults.kt */
/* loaded from: classes18.dex */
public interface n3v0 {

    /* compiled from: VkMarketProductTileDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductTileConfig.CtaButtonType.values().length];
            try {
                iArr[MarketProductTileConfig.CtaButtonType.InCart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.ToCart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.Similar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.Write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.ToShop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.Call.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.Booking.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.PartnerLink.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    default lg90 a(MarketProductTileConfig.d dVar, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1176450920);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1176450920, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ownerIconPainter (VkMarketProductTileDefaults.kt:133)");
        }
        if (!dVar.equals(MarketProductTileConfig.d.a.a)) {
            throw alb0.c(992938868, aVar);
        }
        aVar.K(992941586);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
        }
        lg90 a2 = pg90.a(R.drawable.vk_icon_verified_16, 0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    boolean b(MarketProductTileConfig.ProductStatusType productStatusType, boolean z, androidx.compose.runtime.a aVar, int i);

    l5g c(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i);

    default long d(MarketProductTileConfig.CtaButtonType ctaButtonType, androidx.compose.runtime.a aVar, int i) {
        long j;
        aVar.K(73120867);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(73120867, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaIconButtonIconTint (VkMarketProductTileDefaults.kt:59)");
        }
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                aVar.K(1549682421);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().e;
                aVar.j();
                break;
            case 2:
                aVar.K(1549684504);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().k;
                aVar.j();
                break;
            case 3:
                aVar.K(1549686712);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().k;
                aVar.j();
                break;
            case 4:
                aVar.K(1549688856);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.getIcon().k;
                aVar.j();
                break;
            case 5:
                aVar.K(1549691032);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var5.getIcon().k;
                aVar.j();
                break;
            case 6:
                aVar.K(1549693144);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var6.getIcon().k;
                aVar.j();
                break;
            case 7:
                aVar.K(1549695352);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var7 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var7.getIcon().k;
                aVar.j();
                break;
            case 8:
                aVar.K(1549697688);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var8 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var8.getIcon().k;
                aVar.j();
                break;
            default:
                throw alb0.c(1549680776, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    String e(MarketProductTileConfig.e eVar, androidx.compose.runtime.a aVar, int i);

    boolean f(boolean z, androidx.compose.runtime.a aVar, int i);

    long g(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i);

    lg90 h(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i);

    default ButtonStyle i(MarketProductTileConfig.CtaButtonType ctaButtonType, androidx.compose.runtime.a aVar, int i) {
        ButtonStyle buttonStyle;
        aVar.K(-113928069);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-113928069, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaButtonStyle (VkMarketProductTileDefaults.kt:85)");
        }
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                buttonStyle = ButtonStyle.Primary;
                break;
            case 2:
                buttonStyle = ButtonStyle.Primary;
                break;
            case 3:
                buttonStyle = ButtonStyle.Outline;
                break;
            case 4:
                buttonStyle = ButtonStyle.Primary;
                break;
            case 5:
                buttonStyle = ButtonStyle.Primary;
                break;
            case 6:
                buttonStyle = ButtonStyle.Primary;
                break;
            case 7:
                buttonStyle = ButtonStyle.Primary;
                break;
            case 8:
                buttonStyle = ButtonStyle.Primary;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return buttonStyle;
    }

    default lg90 j(MarketProductTileConfig.CtaButtonType ctaButtonType, androidx.compose.runtime.a aVar, int i) {
        lg90 lg90Var;
        aVar.K(-1389872105);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1389872105, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaButtonIcon (VkMarketProductTileDefaults.kt:125)");
        }
        if (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()] == 5) {
            aVar.K(67741533);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1196281598, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Link16> (VkIcons.kt:6462)");
            }
            lg90Var = or.b(aVar, 1213699500, R.drawable.vk_icon_link_16, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            aVar.K(2100014246);
            aVar.j();
            lg90Var = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return lg90Var;
    }

    String k(MarketProductTileConfig.h hVar, MarketProductTileConfig.ProductStatusType productStatusType, boolean z, androidx.compose.runtime.a aVar, int i);

    default String l(MarketProductTileConfig.d dVar, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-844069525);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-844069525, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ownerIconDescription (VkMarketProductTileDefaults.kt:140)");
        }
        if (!dVar.equals(MarketProductTileConfig.d.a.a)) {
            throw alb0.c(598009155, aVar);
        }
        String a2 = zq.a(aVar, 598011532, R.string.community_profile_vk_verified_title, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    boolean m(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i);

    String n(MarketProductTileConfig.e eVar, androidx.compose.runtime.a aVar, int i);

    String o(String str, boolean z, MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i);

    long p(int i, androidx.compose.runtime.a aVar);

    default ButtonAppearance q(MarketProductTileConfig.CtaButtonType ctaButtonType, androidx.compose.runtime.a aVar, int i) {
        ButtonAppearance buttonAppearance;
        aVar.K(459222407);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(459222407, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaButtonAppearance (VkMarketProductTileDefaults.kt:97)");
        }
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                buttonAppearance = ButtonAppearance.Positive;
                break;
            case 2:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            case 3:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            case 4:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            case 5:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            case 6:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            case 7:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            case 8:
                buttonAppearance = ButtonAppearance.Accent;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return buttonAppearance;
    }

    default lg90 r(MarketProductTileConfig.CtaButtonType ctaButtonType, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        aVar.K(-569547472);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-569547472, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaIconButtonIcon (VkMarketProductTileDefaults.kt:46)");
        }
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                aVar.K(-1874268650);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1888582236, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done16> (VkSdkIcons.kt:694)");
                }
                b = or.b(aVar, -1318018545, R.drawable.vk_icon_done_16, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 2:
                aVar.K(-1874267448);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1964331422, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ShoppingCartAddOutline16> (VkIcons.kt:9818)");
                }
                b = pg90.a(R.drawable.vk_icon_shopping_cart_add_outline_16, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 3:
                aVar.K(-1874265569);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-752776034, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SearchOutline16> (VkSdkIcons.kt:3010)");
                }
                b = or.b(aVar, -1926399869, R.drawable.vk_icon_search_outline_16, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 4:
                aVar.K(-1874264128);
                qzu0.a.getClass();
                b = qzu0.L0(aVar);
                aVar.j();
                break;
            case 5:
                aVar.K(-1874262627);
                qzu0.a.getClass();
                b = qzu0.A0(aVar);
                aVar.j();
                break;
            case 6:
                aVar.K(-1874261282);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1195666622, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PhoneOutline16> (VkIcons.kt:8514)");
                }
                b = or.b(aVar, -1940377757, R.drawable.vk_icon_phone_outline_16, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 7:
                aVar.K(-1874259807);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1280632408, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CalendarOutline16> (VkIcons.kt:944)");
                }
                b = or.b(aVar, -874248054, R.drawable.vk_icon_calendar_outline_16, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 8:
                aVar.K(-1874258115);
                qzu0.a.getClass();
                b = qzu0.A0(aVar);
                aVar.j();
                break;
            default:
                throw alb0.c(-1874270040, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b;
    }

    default String s(MarketProductTileConfig.CtaButtonType ctaButtonType, String str, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1524649734);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1524649734, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaButtonText (VkMarketProductTileDefaults.kt:111)");
        }
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                str = zq.a(aVar, 604556826, R.string.ecomm_go_to_cart_cta_button, aVar, 0);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                aVar.K(604555914);
                aVar.j();
                break;
            default:
                throw alb0.c(604550760, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str;
    }

    default long t(MarketProductTileConfig.CtaButtonType ctaButtonType, androidx.compose.runtime.a aVar, int i) {
        long j;
        aVar.K(-377132739);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-377132739, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileDefaults.ctaIconButtonBackground (VkMarketProductTileDefaults.kt:72)");
        }
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                aVar.K(-1647303083);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().i;
                aVar.j();
                break;
            case 2:
                aVar.K(-1647300625);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getBackground().j;
                aVar.j();
                break;
            case 3:
                aVar.K(-1647298321);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getBackground().j;
                aVar.j();
                break;
            case 4:
                aVar.K(-1647296081);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.getBackground().j;
                aVar.j();
                break;
            case 5:
                aVar.K(-1647293809);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var5.getBackground().j;
                aVar.j();
                break;
            case 6:
                aVar.K(-1647291601);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var6.getBackground().j;
                aVar.j();
                break;
            case 7:
                aVar.K(-1647289297);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var7 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var7.getBackground().j;
                aVar.j();
                break;
            case 8:
                aVar.K(-1647286865);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var8 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var8.getBackground().j;
                aVar.j();
                break;
            default:
                throw alb0.c(-1647304893, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }
}
