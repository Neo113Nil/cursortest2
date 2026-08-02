package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.design.compose.MarketDiscountBadgeStyle;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: MarketDiscountBadge.kt */
/* loaded from: classes18.dex */
public final class sw00 {

    /* compiled from: MarketDiscountBadge.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketDiscountBadgeStyle.values().length];
            try {
                iArr[MarketDiscountBadgeStyle.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketDiscountBadgeStyle.Contrast.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final int i, final q630 q630Var, MarketDiscountBadgeStyle marketDiscountBadgeStyle, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        final MarketDiscountBadgeStyle marketDiscountBadgeStyle2;
        androidx.compose.runtime.a M = aVar.M(1728550472);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(q630Var) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= M.o(marketDiscountBadgeStyle == null ? -1 : marketDiscountBadgeStyle.ordinal()) ? 256 : 128;
        }
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                marketDiscountBadgeStyle = MarketDiscountBadgeStyle.Accent;
            }
            MarketDiscountBadgeStyle marketDiscountBadgeStyle3 = marketDiscountBadgeStyle;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1728550472, i4, -1, "com.vk.ecomm.design.compose.MarketDiscountBadge (MarketDiscountBadge.kt:39)");
            }
            String O = d370.O(R.string.ecomm_design_product_discount_temp, new Object[]{Integer.valueOf(Math.abs(i))}, M);
            String O2 = d370.O(R.string.ecomm_design_product_discount_content_description, new Object[]{Integer.valueOf(Math.abs(i))}, M);
            boolean J = M.J(O2);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new ow00(O2, 0);
                M.R(x);
            }
            b(O, egi0.b(q630Var, false, (izs) x), marketDiscountBadgeStyle3, M, i4 & 896, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            marketDiscountBadgeStyle2 = marketDiscountBadgeStyle3;
        } else {
            M.h();
            marketDiscountBadgeStyle2 = marketDiscountBadgeStyle;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pw00
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sw00.a(i, q630Var, marketDiscountBadgeStyle2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, q630 q630Var, final MarketDiscountBadgeStyle marketDiscountBadgeStyle, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(1833417606);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= M.o(marketDiscountBadgeStyle == null ? -1 : marketDiscountBadgeStyle.ordinal()) ? 256 : 128;
            }
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1833417606, i3, -1, "com.vk.ecomm.design.compose.MarketDiscountBadge (MarketDiscountBadge.kt:71)");
                }
                int i5 = (i3 >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-470501534, i5, -1, "com.vk.ecomm.design.compose.color (MarketDiscountBadge.kt:97)");
                }
                int[] iArr = a.$EnumSwitchMapping$0;
                int i6 = iArr[marketDiscountBadgeStyle.ordinal()];
                if (i6 == 1) {
                    M.K(-1180402453);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.q().m;
                    M.j();
                } else {
                    if (i6 != 2) {
                        throw alb0.c(-1180404806, M);
                    }
                    M.K(-1180399852);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getBackground().j;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 E = s200.E(hr80.m(q630Var4, j, vog0.b(6)), kqu0.s, kqu0.q);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(824756527, i5, -1, "com.vk.ecomm.design.compose.textColor (MarketDiscountBadge.kt:106)");
                }
                int i7 = iArr[marketDiscountBadgeStyle.ordinal()];
                if (i7 == 1) {
                    M.K(-1977921605);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var3.getText().d;
                    M.j();
                } else {
                    if (i7 != 2) {
                        throw alb0.c(-1977923899, M);
                    }
                    M.K(-1977919100);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var4.getText().o;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i8 = (i3 & 14) | 100663296;
                q630Var3 = q630Var4;
                aVar2 = M;
                yqv0.c(str, E, j2, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.v0, aVar2, i8, 48, 5880);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.qw00
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sw00.b(str, q630Var3, marketDiscountBadgeStyle, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 384) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
