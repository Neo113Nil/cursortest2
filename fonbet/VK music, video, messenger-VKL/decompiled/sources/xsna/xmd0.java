package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.fnd0;
import xsna.q630;

/* compiled from: ProductCardTopBar.kt */
/* loaded from: classes18.dex */
public final class xmd0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(fnd0 fnd0Var, ml1 ml1Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        fnd0.a aVar3;
        boolean z;
        d.c.C0760d b;
        d.b.a b2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(767849153);
        int i3 = i | (M.J(fnd0Var) ? 4 : 2) | (M.y(ml1Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(767849153, i3, -1, "com.vk.ecomm.market.good.ui.topbar.compose.ProductCardTopBar (ProductCardTopBar.kt:30)");
            }
            boolean z2 = fnd0Var instanceof fnd0.a;
            q630.a aVar4 = q630.a.a;
            if (z2) {
                M.K(-1415279);
                String N = d370.N(R.string.product_card_top_bar_search, 0, M);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new tho0((String) null, 0L, 7);
                    M.R(x);
                }
                tho0 tho0Var = (tho0) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new pey(21);
                    M.R(x2);
                }
                izs izsVar = (izs) x2;
                String N2 = d370.N(R.string.product_card_top_bar_voice_search, 0, M);
                int i4 = i3 & 112;
                boolean z3 = i4 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new dj60(ml1Var, 17);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new qey(28);
                    M.R(x4);
                }
                lkg0 a = vlh0.a(3072, 0, M, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), N2, gzsVar);
                boolean z4 = i4 == 32;
                Object x5 = M.x();
                if (z4 || x5 == c0012a) {
                    x5 = new wmd0(ml1Var, 0);
                    M.R(x5);
                }
                gzs gzsVar2 = (gzs) x5;
                Object x6 = M.x();
                if (x6 == c0012a) {
                    x6 = new nc90(5);
                    M.R(x6);
                }
                TopBar$Middle.b a2 = TopBar$Middle.b.a.a(N, tho0Var, izsVar, a, null, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), false, null, false, M, Tensorflow.FRAME_WIDTH, 384, 3792);
                androidx.compose.runtime.a aVar5 = M;
                q630 g = ahn.E(aVar4, "product_card_top_bar").g(q630Var);
                TopBar$Before.e c = c(ml1Var, aVar5, (i3 >> 3) & 14);
                fnd0.a aVar6 = (fnd0.a) fnd0Var;
                boolean z5 = aVar6.a;
                dnd0 dnd0Var = aVar6.b;
                int i5 = i3 << 3;
                int i6 = i5 & 896;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1446893536, i6, -1, "com.vk.ecomm.market.good.ui.topbar.compose.resolveMainIcon (ProductCardTopBar.kt:99)");
                }
                if (dnd0Var instanceof end0) {
                    aVar5.K(-113286523);
                    if (androidx.compose.runtime.b.d()) {
                        i2 = 0;
                        androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
                    } else {
                        i2 = 0;
                    }
                    lg90 b3 = or.b(aVar5, 1878014662, R.drawable.vk_icon_share_outline_28, aVar5, i2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N3 = d370.N(R.string.product_card_top_bar_share, i2, aVar5);
                    int i7 = (((i6 ^ 384) <= 256 || !aVar5.J(ml1Var)) && (i5 & 384) != 256) ? i2 : 1;
                    Object x7 = aVar5.x();
                    if (i7 != 0 || x7 == c0012a) {
                        x7 = new rf20(ml1Var, 18);
                        aVar5.R(x7);
                    }
                    gzs gzsVar3 = (gzs) x7;
                    Object x8 = aVar5.x();
                    if (x8 == c0012a) {
                        x8 = new gz30(11);
                        aVar5.R(x8);
                    }
                    b = d.c.C0760d.a.a(b3, N3, gzsVar3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x8, 3), aVar5, 1572872, 24);
                    aVar5 = aVar5;
                    aVar5.j();
                    aVar3 = aVar6;
                } else {
                    aVar3 = aVar6;
                    if (dnd0Var instanceof and0) {
                        aVar5.K(-112817462);
                        z = ((i6 ^ 384) > 256 && aVar5.J(ml1Var)) || (i5 & 384) == 256;
                        Object x9 = aVar5.x();
                        if (z || x9 == c0012a) {
                            x9 = new eiz(ml1Var, 23);
                            aVar5.R(x9);
                        }
                        izs izsVar2 = (izs) x9;
                        List<ProductCardTopBarControlAction> list = ((and0) dnd0Var).a;
                        Object x10 = aVar5.x();
                        if (x10 == c0012a) {
                            x10 = new j0r(21);
                            aVar5.R(x10);
                        }
                        com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-666088122, 24576, -1, "com.vk.ecomm.market.good.ui.topbar.compose.ProductCardTopBarActionMenu.Companion.invoke (ProductCardTopBarActionMenu.kt:179)");
                        }
                        Object x11 = aVar5.x();
                        if (x11 == c0012a) {
                            x11 = new vmd0(izsVar2, list, z5, a3);
                            aVar5.R(x11);
                        }
                        vmd0 vmd0Var = (vmd0) x11;
                        ((zak0) vmd0Var.d).setValue(izsVar2);
                        ((zak0) vmd0Var.e).setValue(list);
                        ((zak0) vmd0Var.f).setValue(Boolean.valueOf(z5));
                        ((zak0) vmd0Var.g).setValue(a3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar5.j();
                        b = vmd0Var;
                    } else {
                        if (!(dnd0Var instanceof zmd0)) {
                            throw alb0.c(1104723037, aVar5);
                        }
                        aVar5.K(-112396916);
                        int i8 = ((zmd0) dnd0Var).a;
                        z = ((i6 ^ 384) > 256 && aVar5.J(ml1Var)) || (i5 & 384) == 256;
                        Object x12 = aVar5.x();
                        if (z || x12 == c0012a) {
                            x12 = new pp00(ml1Var, 27);
                            aVar5.R(x12);
                        }
                        gzs gzsVar4 = (gzs) x12;
                        Object x13 = aVar5.x();
                        if (x13 == c0012a) {
                            x13 = new c3v(16);
                            aVar5.R(x13);
                        }
                        b = dx9.b(i8, gzsVar4, (izs) x13, aVar5, 384, 0);
                        aVar5 = aVar5;
                        aVar5.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                d.b.a b4 = b(aVar3.c, ml1Var, aVar5, i4);
                bnd0 bnd0Var = aVar3.d;
                if (bnd0Var == null) {
                    aVar5.K(26778);
                    aVar5.j();
                    b2 = null;
                } else {
                    aVar5.K(26779);
                    b2 = b(bnd0Var, ml1Var, aVar5, i4);
                    aVar5.j();
                }
                androidx.compose.runtime.a aVar7 = aVar5;
                muv0.h(a2, g, null, null, c, null, d.a.a(b, b4, b2, null, aVar7, 24576, 8), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar7, 0, 0, 8108);
                aVar2 = aVar7;
                aVar2.j();
            } else {
                if (!(fnd0Var instanceof fnd0.b)) {
                    throw alb0.c(-831331364, M);
                }
                M.K(162125);
                muv0.h(TopBar$Middle.a.c, txj0.f(aVar4, 1.0f), null, null, c(ml1Var, M, (i3 >> 3) & 14), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 54, 0, 8172);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jqc(i, 4, fnd0Var, ml1Var, q630Var);
        }
    }

    public static final d.b.a b(bnd0 bnd0Var, ml1 ml1Var, androidx.compose.runtime.a aVar, int i) {
        d.b.a a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1736055943, i, -1, "com.vk.ecomm.market.good.ui.topbar.compose.resolveExtraIcon (ProductCardTopBar.kt:143)");
        }
        boolean z = bnd0Var instanceof zmd0;
        boolean z2 = true;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (z) {
            aVar.K(1153818353);
            int i2 = ((zmd0) bnd0Var).a;
            if ((((i & 112) ^ 48) <= 32 || !aVar.J(ml1Var)) && (i & 48) != 32) {
                z2 = false;
            }
            Object x = aVar.x();
            if (z2 || x == c0012a) {
                x = new e550(ml1Var, 14);
                aVar.R(x);
            }
            gzs gzsVar = (gzs) x;
            Object x2 = aVar.x();
            if (x2 == c0012a) {
                x2 = new k990(11);
                aVar.R(x2);
            }
            a = dx9.a(i2, gzsVar, (izs) x2, aVar, 384, 0);
            aVar.j();
        } else if (bnd0Var instanceof cnd0) {
            aVar.K(1154152037);
            int i3 = ((cnd0) bnd0Var).a;
            if ((((i & 112) ^ 48) <= 32 || !aVar.J(ml1Var)) && (i & 48) != 32) {
                z2 = false;
            }
            Object x3 = aVar.x();
            if (z2 || x3 == c0012a) {
                x3 = new c950(ml1Var, 23);
                aVar.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            Object x4 = aVar.x();
            if (x4 == c0012a) {
                x4 = new zos(20);
                aVar.R(x4);
            }
            a = zsq.a(i3, gzsVar2, (izs) x4, aVar, 384, 0);
            aVar.j();
        } else {
            if (!(bnd0Var instanceof end0)) {
                throw alb0.c(-1902444006, aVar);
            }
            aVar.K(1154492882);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
            }
            lg90 b = or.b(aVar, 1878014662, R.drawable.vk_icon_share_outline_28, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.product_card_top_bar_share, 0, aVar);
            if ((((i & 112) ^ 48) <= 32 || !aVar.J(ml1Var)) && (i & 48) != 32) {
                z2 = false;
            }
            Object x5 = aVar.x();
            if (z2 || x5 == c0012a) {
                x5 = new b990(ml1Var, 10);
                aVar.R(x5);
            }
            a = d.b.a.C0757a.a(b, N, (gzs) x5, null, null, null, aVar, 12582920, 120);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final TopBar$Before.e c(ml1 ml1Var, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-97942938, i, -1, "com.vk.ecomm.market.good.ui.topbar.compose.resolveLeft (ProductCardTopBar.kt:80)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        HashSet hashSet = iah0.a;
        TopBar$Before.e eVar = null;
        if (fnj.b(context)) {
            aVar.K(-1534816272);
            aVar.j();
        } else {
            aVar.K(-1535123389);
            String N = d370.N(R.string.product_card_top_bar_back, 0, aVar);
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new oey(19);
                aVar.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            boolean z = (((i & 14) ^ 6) > 4 && aVar.J(ml1Var)) || (i & 6) == 4;
            Object x2 = aVar.x();
            if (z || x2 == c0012a) {
                x2 = new re40(ml1Var, 16);
                aVar.R(x2);
            }
            eVar = e.a.a((gzs) x2, N, null, null, a, aVar, 196608, 12);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return eVar;
    }
}
