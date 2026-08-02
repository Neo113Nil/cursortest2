package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.demo.presentation.screens.ecomm.tile.ImageCount;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.efu;
import xsna.vid0;

/* compiled from: MarketProductTileComposeContent.kt */
/* loaded from: classes18.dex */
public final class sc10 {

    /* compiled from: MarketProductTileComposeContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MarketProductTileConfig.CtaButtonType.values().length];
            try {
                iArr[MarketProductTileConfig.CtaButtonType.ToCart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProductTileConfig.CtaButtonType.InCart.ordinal()] = 2;
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[jqi.values().length];
            try {
                iArr2[jqi.NORMAL_FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[jqi.NORMAL_CAN_BE_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[jqi.NORMAL_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[jqi.NORMAL_NO_PICTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[jqi.NORMAL_A_FEW_PICTURES.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_IN_CART.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_TO_CART.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_SIMILAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_WRITE.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_TO_SHOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_CALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[jqi.NORMAL_CTA_BUTTON_BOOKING.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[jqi.NORMAL_CUSTOM_STATUS_BADGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[jqi.OWNER_IS_VERIFIED.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[jqi.LONG_OWNER_IS_VERIFIED.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[jqi.ONE_BADGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[jqi.TWO_BADGES.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[jqi.DISCOUNT.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[jqi.OUT_OF_STOCK.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[jqi.SOFT_BLOCK.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[jqi.HARD_BLOCK.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[jqi.REMODERATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[jqi.BLUR_18.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[jqi.ARCHIVE.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[jqi.HARDBLOCK_BLUR_18.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[jqi.OUT_OF_STOCK_BLUR_18.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[jqi.NOPICTURE_BLUR_18.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public static final void a(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        String str;
        MarketProductTileConfig.ViewerType[] viewerTypeArr;
        MarketProductTileConfig a2;
        ?? M = aVar.M(-2046313996);
        int i2 = (M.l(z) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2046313996, i2, -1, "com.vk.design.demo.presentation.screens.ecomm.tile.MarketProductTileComposeContent (MarketProductTileComposeContent.kt:37)");
            }
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                String str2 = "1 500 ₽";
                MarketProductTileConfig marketProductTileConfig = new MarketProductTileConfig("uuid:", MarketProductTileConfig.ViewerType.Bayer, MarketProductTileConfig.ProductStatusType.Normal, z ? MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE : MarketProductTileConfig.DisplayCtaButtonType.BOTTOM, wc10.b(ImageCount.OneImage), null, false, new MarketProductTileConfig.e("1 500 ₽", (String) null, 4), "Пижама, название не помещается в строку, надеюсь этого хватит", new MarketProductTileConfig.c("Рога и копыта", null), null, new MarketProductTileConfig.g(4.5f, "8 отзывов"), null, null, null, 125136);
                ArrayList arrayList = new ArrayList();
                jqi[] values = jqi.values();
                int length = values.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    jqi jqiVar = values[i3];
                    boolean z3 = 0;
                    MarketProductTileConfig.ViewerType[] values2 = MarketProductTileConfig.ViewerType.values();
                    int length2 = values2.length;
                    int i5 = i4;
                    jqi[] jqiVarArr = values;
                    int i6 = 0;
                    while (i6 < length2) {
                        int i7 = length2;
                        int i8 = i6;
                        MarketProductTileConfig a3 = MarketProductTileConfig.a(marketProductTileConfig, z23.b(i5, marketProductTileConfig.a, new StringBuilder()), values2[i6], null, null, false, null, null, false, null, null, null, null, null, null, null, 131068);
                        switch (a.$EnumSwitchMapping$1[jqiVar.ordinal()]) {
                            case 1:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, new MarketProductTileConfig.i.b(false), null, null, null, null, 129023);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 2:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, MarketProductTileConfig.i.a.a, null, null, null, null, 129023);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 3:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, new MarketProductTileConfig.i.c(z3), null, null, null, null, 129023);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 4:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, EmptyList.b, null, false, null, null, null, null, null, null, null, 131039);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 5:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, wc10.b(ImageCount.TwoImages), null, false, null, null, null, null, null, null, null, 131039);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 6:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.InCart), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 7:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.ToCart), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 8:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.Similar), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 9:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.Write), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 10:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.ToShop), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 11:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.Call), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 12:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, null, b(MarketProductTileConfig.CtaButtonType.Booking), 98303);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 13:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, new MarketProductTileConfig.h.b("1 шт."), false, null, null, null, null, null, null, null, 131007);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 14:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, new MarketProductTileConfig.c("Рога и копыта", MarketProductTileConfig.d.a.a), null, null, null, null, null, 130047);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 15:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, new MarketProductTileConfig.c("Длинное название владельца, длинное название владельца", MarketProductTileConfig.d.a.a), null, null, null, null, null, 130047);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 16:
                                str = str2;
                                viewerTypeArr = values2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, new MarketProductTileConfig.a(Collections.singletonList(vid0.c.a)), null, 114687);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 17:
                                viewerTypeArr = values2;
                                vid0.a aVar2 = new vid0.a("−30%");
                                str = str2;
                                vid0[] vid0VarArr = new vid0[2];
                                vid0VarArr[z3] = vid0.c.a;
                                vid0VarArr[1] = aVar2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, null, null, null, null, null, new MarketProductTileConfig.a(e43.l(vid0VarArr)), null, 114687);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 18:
                                viewerTypeArr = values2;
                                str = str2;
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, false, new MarketProductTileConfig.e(str2, "1 800 ₽", 4), null, null, null, null, new MarketProductTileConfig.a(Collections.singletonList(new vid0.a("−30%"))), null, 114431);
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 19:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.OutOfStock, null, false, null, null, false, null, null, null, null, null, null, null, 131067);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 20:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.SoftBlock, null, false, null, null, false, null, null, null, null, null, null, null, 131067);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 21:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.HardBlock, null, false, null, null, false, null, null, null, null, null, null, null, 131067);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 22:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.Moderation, null, false, null, null, false, null, null, null, null, null, null, null, 131067);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 23:
                                a2 = MarketProductTileConfig.a(a3, null, null, null, null, false, null, null, true, null, null, null, null, null, null, null, 130943);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 24:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.Archive, null, false, null, null, false, null, null, null, null, null, null, null, 131067);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 25:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.HardBlock, null, false, null, null, true, null, null, null, null, null, null, null, 130939);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 26:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.OutOfStock, null, false, null, null, true, null, null, null, null, null, null, null, 130939);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            case 27:
                                a2 = MarketProductTileConfig.a(a3, null, null, MarketProductTileConfig.ProductStatusType.OutOfStock, null, false, null, null, true, null, null, null, null, null, null, null, 130907);
                                str = str2;
                                viewerTypeArr = values2;
                                arrayList.add(new jtk0(jqiVar, a2));
                                i5++;
                                i6 = i8 + 1;
                                length2 = i7;
                                values2 = viewerTypeArr;
                                str2 = str;
                                z3 = 0;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    i3++;
                    values = jqiVarArr;
                    i4 = i5;
                }
                x = androidx.compose.runtime.k.b(new wow(arrayList));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.d(q630Var, 1.0f));
            efu.b bVar = new efu.b(2);
            boolean J = M.J(wh50Var);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new lc10(0, wh50Var);
                M.R(x2);
            }
            uqy.b(bVar, F, null, null, null, null, null, false, null, (izs) x2, M, 0, 0, 1020);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, q630Var, z) { // from class: xsna.mc10
                public final /* synthetic */ q630 b;
                public final /* synthetic */ boolean c;

                {
                    this.b = q630Var;
                    this.c = z;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    sc10.a(ne7.I(7), (androidx.compose.runtime.a) obj2, this.b, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public static final MarketProductTileConfig.b b(MarketProductTileConfig.CtaButtonType ctaButtonType) {
        String str;
        switch (a.$EnumSwitchMapping$0[ctaButtonType.ordinal()]) {
            case 1:
                str = "В корзину";
                break;
            case 2:
                str = "В корзине";
                break;
            case 3:
                str = "Похожие";
                break;
            case 4:
                str = "Написать";
                break;
            case 5:
                str = "В магазин";
                break;
            case 6:
                str = "Позвонить";
                break;
            case 7:
                str = "Записаться";
                break;
            default:
                str = "";
                break;
        }
        return new MarketProductTileConfig.b(ctaButtonType, str, true);
    }
}
