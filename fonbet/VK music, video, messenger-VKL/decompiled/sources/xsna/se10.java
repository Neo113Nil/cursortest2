package xsna;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.shop_conditions.impl.ui.dovdialog.data.model.ConditionType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.ue10;
import xsna.wra0;
import xsna.zra0;

/* compiled from: MarketShopConditionsUnited.kt */
/* loaded from: classes18.dex */
public final class se10 {

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ pe10 a;

        public a(pe10 pe10Var) {
            this.a = pe10Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            TypedValue typedValue = krv0.a;
            krv0.k(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(jej0 jej0Var, izs<? super ce10, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        us2 us2Var;
        int i5;
        a.C0011a.C0012a c0012a;
        long j;
        lg90 b;
        androidx.compose.runtime.a M = aVar.M(-578545525);
        if ((i & 6) == 0) {
            i2 = (M.J(jej0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-578545525, i2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.ConditionItem (MarketShopConditionsUnited.kt:178)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            lg90 lg90Var = null;
            if (x == c0012a2) {
                TypedValue typedValue = krv0.a;
                x = androidx.compose.runtime.k.b(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            s3q0 s3q0Var = s3q0.a;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = new lc10(1, wh50Var);
                M.R(x2);
            }
            bap.c(s3q0Var, (izs) x2, M, 54);
            int i6 = i2 & 112;
            boolean J = M.J(jej0Var.c) | (i6 == 32);
            Object x3 = M.x();
            if (J || x3 == c0012a2) {
                x3 = ws2.d(jej0Var.c, new re10(izsVar, 0));
                M.R(x3);
            }
            us2 us2Var2 = (us2) x3;
            M.K(-1931435822);
            if (us2Var2.c.length() == 0) {
                us2Var2 = ws2.a(jej0Var.d, M, 0);
            }
            M.j();
            ely elyVar = jej0Var.e;
            if (elyVar == null) {
                M.K(255140225);
                M.j();
                i4 = i6;
                c0012a = c0012a2;
                us2Var = us2Var2;
                i5 = -1;
            } else {
                M.K(255140226);
                i4 = i6;
                us2Var = us2Var2;
                i5 = -1;
                String str = ((Boolean) wh50Var.getValue()).booleanValue() ? elyVar.a : elyVar.b;
                c0012a = c0012a2;
                lg90Var = fwu0.l(str, null, null, null, M, 0, 62);
                M.j();
            }
            if (lg90Var == null) {
                M.K(-1931429503);
                ConditionType conditionType = jej0Var.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1853407217, 0, i5, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.getConditionIconByType (MarketShopConditionsView.kt:145)");
                }
                int i7 = ue10.a.$EnumSwitchMapping$0[conditionType.ordinal()];
                if (i7 == 1) {
                    M.K(1287097021);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1851261886, 0, i5, "com.vk.core.compose.icons.generated.VkIcons.<get-TruckOutline20> (VkIcons.kt:10908)");
                    }
                    b = or.b(M, 732374627, R.drawable.vk_icon_truck_outline_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (i7 == 2) {
                    M.K(1287098819);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2116350434, 0, i5, "com.vk.core.compose.icons.generated.VkIcons.<get-PaymentCardOutline20> (VkIcons.kt:8384)");
                    }
                    b = or.b(M, -1923946308, R.drawable.vk_icon_payment_card_outline_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (i7 == 3) {
                    M.K(1287100774);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1078192538, 0, i5, "com.vk.core.compose.icons.generated.VkIcons.<get-ArrowUturnLeftOutline20> (VkIcons.kt:424)");
                    }
                    b = or.b(M, 1626690996, R.drawable.vk_icon_arrow_uturn_left_outline_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (i7 != 4) {
                    M.K(1287104032);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1024827864, 0, i5, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckShieldBlue20> (VkIcons.kt:1338)");
                    }
                    b = or.b(M, 2019533065, R.drawable.vk_icon_check_shield_blue_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(1287102750);
                    qzu0.a.getClass();
                    b = qzu0.H0(M);
                    M.j();
                }
                lg90Var = b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1931432913);
                M.j();
            }
            q630 E = ahn.E(q630.a.a, jej0Var.a.name());
            ConditionType conditionType2 = jej0Var.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1611559115, 0, i5, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.getConditionTintByType (MarketShopConditionsView.kt:156)");
            }
            int i8 = ue10.a.$EnumSwitchMapping$0[conditionType2.ordinal()];
            if (i8 == 1 || i8 == 2 || i8 == 3) {
                M.K(1774891327);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().a;
                M.j();
            } else {
                M.K(1774892416);
                M.j();
                j = l5g.k;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a2 = com.vk.core.compose.component.cell.content.f.a(lg90Var, Cell$Left.Main.Size.Small, j, null, null, M, 196664, 24);
            com.vk.core.compose.component.cell.content.f1 a3 = RichCell$Middle.h.b.a(jej0Var.b, null, null, null, M, 196608, 30);
            boolean J2 = M.J(us2Var) | (i4 == 32);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new com.vk.libvideo.design.view.video.a(20, us2Var, izsVar);
                M.R(x4);
            }
            i3 = 2;
            ygv0.a(E, a2, RichCell$Middle.b.a(null, a3, null, RichCell$Middle.c.b.b(us2Var, true, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 196656, 12), null, null, null, null, null, M, 0, 2027), null, null, M, 0, 56);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = 2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9c(jej0Var, izsVar, i, i3);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1683053923);
        int i2 = i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1683053923, i2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.ErrorPlaceholder (MarketShopConditionsUnited.kt:99)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 b = ra8.a.b(q630.a.a, dt1.a.f);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            TypedValue typedValue = krv0.a;
            u8p0 s = ad0.s(pg90.a(epx.f(krv0.i(context), Boolean.TRUE) ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56, 0, M), 0L, null, null, null, null, null, M, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            vl20 a2 = zra0.a.a(null, null, d370.N(R.string.market_united_shop_condition_load_error_description, 0, M), null, M, 196608, 27);
            String N = d370.N(R.string.try_one_more_time, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z8c(izsVar, 5);
                M.R(x);
            }
            ldv0.d(b, s, a2, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, null, ButtonStyle.Tertiary, null, false, null, null, null, null, null, null, false, false, null, null, M, 3072, 12582912, 131060), null, null, M, 14), null, null, false, M, 0, 112);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new qed(q630Var, izsVar, i, 9);
        }
    }

    public static final void c(final iej0 iej0Var, final boolean z, final boolean z2, final izs<? super ce10, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-513238381);
        int i4 = (i & 6) == 0 ? (M.J(iej0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-513238381, i4, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.SectionItem (MarketShopConditionsUnited.kt:151)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c = qri.c(M, aVar4);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z2) {
                M.K(1170987940);
                if (z) {
                    M.K(1164612325);
                    M.j();
                } else {
                    M.K(1700342374);
                    ck70.b(aVar4, 12, M, 6);
                }
                b.d dVar = b.d.a;
                int i5 = i4 & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-584889231, i5, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.getConditionSectionTitle (MarketShopConditionsView.kt:167)");
                }
                String N = d370.N(iej0Var.a, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = 0;
                i2 = i4;
                aVar3 = aVar4;
                com.vk.core.compose.component.group.header.g.b(f.a.a(N, null, null, null, null, null, null, null, false, M, 805306368, 510), null, dVar, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                aVar2 = M;
            } else {
                i2 = i4;
                i3 = 0;
                aVar3 = aVar4;
                aVar2 = M;
                aVar2.K(1164612325);
            }
            aVar2.j();
            aVar2.K(1700352075);
            List list = iej0Var.b;
            int size = list.size();
            for (int i6 = i3; i6 < size; i6++) {
                jej0 jej0Var = (jej0) list.get(i6);
                f9t.e(txj0.h(aVar3, 4), aVar2, 6);
                a(jej0Var, izsVar, aVar2, (i2 >> 6) & 112);
            }
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qe10
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    se10.c(iej0.this, z, z2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(mtk0<hej0> mtk0Var, izs<? super ce10, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        iej0 iej0Var;
        boolean z;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-820345845);
        int i3 = (M.J(mtk0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-820345845, i3, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.ShopConditionContentUnited (MarketShopConditionsUnited.kt:70)");
            }
            i160 I = dz5.I(0, 1, M, false);
            q630.a aVar2 = q630.a.a;
            float f = 12;
            q630 d = rte0.d(xp2.a(p490.D(n34.t(aVar2, I, null), p490.x(M), 14), null, 3), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            e(i3 & 112, M, d370.N(R.string.market_united_shop_condition_title, 0, M), izsVar);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(-1053512491);
            int i4 = 0;
            for (Object obj : mtk0Var.getValue().a) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                iej0 iej0Var2 = (iej0) obj;
                if (i4 == 0) {
                    iej0Var = iej0Var2;
                    z = true;
                } else {
                    iej0Var = iej0Var2;
                    z = false;
                }
                List<iej0> list = mtk0Var.getValue().a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (!((iej0) it.next()).b.isEmpty() && (i2 = i2 + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                c(iej0Var, z, (i2 > 1) && !mtk0Var.getValue().a.isEmpty(), izsVar, M, (i3 << 6) & 7168);
                i4 = i5;
            }
            M.j();
            f9t.e(txj0.h(aVar2, 4), M, 6);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f7c(mtk0Var, izsVar, i, 3);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(242971274);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(242971274, i2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.TopBar (MarketShopConditionsUnited.kt:131)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.close, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new tzo(izsVar, 3);
                M.R(x);
            }
            muv0.h(a2, m, null, null, null, TopBar$Before.e.a.a(b, N, (gzs) x, null, null, null, M, 1572872, 56), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8156);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xf4(str, izsVar, i, 7);
        }
    }
}
