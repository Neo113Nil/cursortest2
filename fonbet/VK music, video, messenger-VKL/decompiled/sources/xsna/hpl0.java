package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.gl.tf.Tensorflow;
import xsna.dt1;
import xsna.f7p0;
import xsna.q630;

/* compiled from: StorefrontTopBar.kt */
/* loaded from: classes18.dex */
public final class hpl0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(izs izsVar, wh50 wh50Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(76607963);
        if ((i & 6) == 0) {
            i2 = i | (M.y(izsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wh50Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(76607963, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.CreatePopup (StorefrontTopBar.kt:168)");
            }
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            dt1.a.getClass();
            boolean z = false;
            ty6 ty6Var = dt1.a.d;
            if ((i3 & 112) == 32) {
                z = true;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ai80(1, wh50Var);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            oqu0.b(booleanValue, (gzs) x, aVar3, ty6Var, 0L, null, null, false, null, kai.c(833959905, new tp7(3, wh50Var, izsVar), M), aVar2, (i3 & 896) | 3072, 6, 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pgx(i, 1, izsVar, wh50Var, q630Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ipl0 ipl0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        f7p0.c cVar;
        int i3;
        a.C0011a.C0012a c0012a;
        int i4;
        androidx.compose.runtime.a aVar2;
        d.c.C0760d c0760d;
        f7p0.c cVar2;
        int i5;
        int i6;
        f7p0.c cVar3;
        Object x;
        a.C0011a.C0012a c0012a2;
        boolean z;
        Object x2;
        a.C0011a.C0012a c0012a3;
        int i7;
        int i8;
        d.b.a aVar3;
        d.b.a aVar4;
        f7p0.c cVar4;
        int i9 = ipl0Var.c;
        int i10 = ipl0Var.d;
        boolean z2 = ipl0Var.b;
        boolean z3 = ipl0Var.a;
        androidx.compose.runtime.a M = aVar.M(-466228421);
        int i11 = i | (M.J(ipl0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i11 & 1, (i11 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-466228421, i11, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontTopBar (StorefrontTopBar.kt:34)");
            }
            Object x3 = M.x();
            a.C0011a.C0012a c0012a4 = a.C0011a.a;
            if (x3 == c0012a4) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var = (wh50) x3;
            int i12 = i11 & 112;
            boolean z4 = i12 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a4) {
                x4 = new o87(izsVar, 12);
                M.R(x4);
            }
            TopBar$Before.e a = e.a.a((gzs) x4, null, null, null, null, M, 196608, 30);
            String N = d370.N(R.string.community_market_search, 0, M);
            Object x5 = M.x();
            if (x5 == c0012a4) {
                x5 = new tho0((String) null, 0L, 7);
                M.R(x5);
            }
            tho0 tho0Var = (tho0) x5;
            Object x6 = M.x();
            if (x6 == c0012a4) {
                x6 = new h3e0(6);
                M.R(x6);
            }
            izs izsVar2 = (izs) x6;
            boolean z5 = i12 == 32;
            Object x7 = M.x();
            if (z5 || x7 == c0012a4) {
                x7 = new mnc(izsVar, 5);
                M.R(x7);
            }
            TopBar$Middle.b a2 = TopBar$Middle.b.a.a(N, tho0Var, izsVar2, null, null, (gzs) x7, null, null, null, false, null, false, M, Tensorflow.FRAME_WIDTH, 384, 4056);
            int i13 = (i11 & 14) | 384 | i12;
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(1727551874, i13, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.getMainIcon (StorefrontTopBar.kt:79)");
            } else {
                i2 = -1;
            }
            if (z3) {
                M.K(-1974984537);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1869183844, 0, i2, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                }
                lg90 b = or.b(M, -604730424, R.drawable.vk_icon_add_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object x8 = M.x();
                if (x8 == c0012a4) {
                    x8 = new di80(1, wh50Var);
                    M.R(x8);
                }
                gzs gzsVar = (gzs) x8;
                Object x9 = M.x();
                if (x9 == c0012a4) {
                    x9 = new q8w(22);
                    M.R(x9);
                }
                d.c.C0760d a3 = d.c.C0760d.a.a(b, null, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x9, 3), M, 1572872, 26);
                aVar2 = M;
                aVar2.j();
                i3 = i10;
                c0760d = a3;
                c0012a = c0012a4;
            } else if (z2) {
                M.K(-1094661154);
                qzu0.a.getClass();
                lg90 m1 = qzu0.m1(M);
                String N2 = d370.N(R.string.community_market_cart, 0, M);
                if (i10 > 0) {
                    M.K(-1974967710);
                    f7p0.c a4 = f7p0.c.a.a(ipl0Var.d, null, null, null, M, 24576, 14);
                    M.j();
                    cVar2 = a4;
                } else {
                    M.K(-1094401189);
                    M.j();
                    cVar2 = null;
                }
                Object x10 = M.x();
                if (x10 == c0012a4) {
                    x10 = new fuh0(1);
                    M.R(x10);
                }
                com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3);
                boolean z6 = (((i13 & 112) ^ 48) > 32 && M.J(izsVar)) || (i13 & 48) == 32;
                Object x11 = M.x();
                if (z6 || x11 == c0012a4) {
                    x11 = new z8c(izsVar, 10);
                    M.R(x11);
                }
                d.c.C0760d a6 = d.c.C0760d.a.a(m1, N2, (gzs) x11, cVar2, null, a5, M, 1572872, 16);
                aVar2 = M;
                aVar2.j();
                i3 = i10;
                c0760d = a6;
                c0012a = c0012a4;
            } else {
                M.K(-1094113446);
                lg90 a7 = pg90.a(R.drawable.vk_icon_bookmark_outline_28, 0, M);
                String N3 = d370.N(R.string.community_market_bookmarks, 0, M);
                if (i9 > 0) {
                    M.K(-1974948409);
                    f7p0.c a8 = f7p0.c.a.a(ipl0Var.c, null, null, null, M, 24576, 14);
                    M.j();
                    cVar = a8;
                } else {
                    M.K(-1093798053);
                    M.j();
                    cVar = null;
                }
                Object x12 = M.x();
                if (x12 == c0012a4) {
                    x12 = new c3v(25);
                    M.R(x12);
                }
                com.vk.core.compose.component.semantics.a a9 = com.vk.core.compose.component.semantics.b.a(null, (izs) x12, 3);
                boolean z7 = (((i13 & 112) ^ 48) > 32 && M.J(izsVar)) || (i13 & 48) == 32;
                Object x13 = M.x();
                if (z7 || x13 == c0012a4) {
                    x13 = new tzo(izsVar, 8);
                    M.R(x13);
                }
                i3 = i10;
                c0012a = c0012a4;
                i4 = R.drawable.vk_icon_bookmark_outline_28;
                d.c.C0760d a10 = d.c.C0760d.a.a(a7, N3, (gzs) x13, cVar, null, a9, M, 1572872, 16);
                aVar2 = M;
                aVar2.j();
                c0760d = a10;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i5 = i11 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                if (androidx.compose.runtime.b.d()) {
                    i6 = -1;
                } else {
                    i6 = -1;
                    androidx.compose.runtime.b.f(-666290139, i5, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.getExtraIcon (StorefrontTopBar.kt:121)");
                }
                if (!z3 || z2) {
                    aVar2.K(1889550423);
                    lg90 a11 = pg90.a(i4, 0, aVar2);
                    String N4 = d370.N(R.string.community_market_bookmarks, 0, aVar2);
                    if (i9 <= 0) {
                        aVar2.K(-354680534);
                        f7p0.c a12 = f7p0.c.a.a(ipl0Var.c, null, null, null, aVar2, 24576, 14);
                        aVar2.j();
                        cVar3 = a12;
                    } else {
                        aVar2.K(1889865816);
                        aVar2.j();
                        cVar3 = null;
                    }
                    x = aVar2.x();
                    c0012a2 = c0012a;
                    if (x == c0012a2) {
                        x = new oey(27);
                        aVar2.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a13 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    z = ((i12 ^ 48) <= 32 && aVar2.J(izsVar)) || (i11 & 48) == 32;
                    x2 = aVar2.x();
                    if (!z || x2 == c0012a2) {
                        x2 = new nse(izsVar, 13);
                        aVar2.R(x2);
                    }
                    gzs gzsVar2 = (gzs) x2;
                    androidx.compose.runtime.a aVar5 = aVar2;
                    c0012a3 = c0012a2;
                    i7 = i5;
                    i8 = i6;
                    d.b.a a14 = d.b.a.C0757a.a(a11, N4, gzsVar2, cVar3, null, a13, aVar5, 12582920, 80);
                    aVar2 = aVar5;
                    aVar2.j();
                    aVar3 = a14;
                } else {
                    aVar2.K(1890127704);
                    aVar2.j();
                    i7 = i5;
                    i8 = i6;
                    c0012a3 = c0012a;
                    aVar3 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1169093905, i7, i8, "com.vk.ecomm.storefront.impl.community.presentation.ui.getSecondExtraIcon (StorefrontTopBar.kt:144)");
                }
                if (z3 || !z2) {
                    aVar2.K(587449836);
                    aVar2.j();
                    aVar4 = null;
                } else {
                    aVar2.K(586974421);
                    qzu0.a.getClass();
                    lg90 m12 = qzu0.m1(aVar2);
                    if (i3 > 0) {
                        aVar2.K(-1782176143);
                        f7p0.c a15 = f7p0.c.a.a(ipl0Var.d, null, null, null, aVar2, 24576, 14);
                        aVar2.j();
                        cVar4 = a15;
                    } else {
                        aVar2.K(587174060);
                        aVar2.j();
                        cVar4 = null;
                    }
                    Object x14 = aVar2.x();
                    a.C0011a.C0012a c0012a5 = c0012a3;
                    if (x14 == c0012a5) {
                        x14 = new pyz(28);
                        aVar2.R(x14);
                    }
                    com.vk.core.compose.component.semantics.a a16 = com.vk.core.compose.component.semantics.b.a(null, (izs) x14, 3);
                    boolean z8 = ((i12 ^ 48) > 32 && aVar2.J(izsVar)) || (i11 & 48) == 32;
                    Object x15 = aVar2.x();
                    if (z8 || x15 == c0012a5) {
                        x15 = new s3(izsVar, 6);
                        aVar2.R(x15);
                    }
                    androidx.compose.runtime.a aVar6 = aVar2;
                    aVar4 = d.b.a.C0757a.a(m12, null, (gzs) x15, cVar4, null, a16, aVar6, 12582920, 82);
                    aVar2 = aVar6;
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar7 = aVar2;
                muv0.h(a2, q630Var, null, null, a, null, d.a.a(c0760d, aVar3, aVar4, null, aVar2, 24576, 8), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar7, 48, 0, 8108);
                M = aVar7;
                a(izsVar, wh50Var, null, M, ((i11 >> 3) & 14) | 48);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            i4 = R.drawable.vk_icon_bookmark_outline_28;
            if (androidx.compose.runtime.b.d()) {
            }
            i5 = i11 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
            }
            if (z3) {
            }
            aVar2.K(1889550423);
            lg90 a112 = pg90.a(i4, 0, aVar2);
            String N42 = d370.N(R.string.community_market_bookmarks, 0, aVar2);
            if (i9 <= 0) {
            }
            x = aVar2.x();
            c0012a2 = c0012a;
            if (x == c0012a2) {
            }
            com.vk.core.compose.component.semantics.a a132 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            if ((i12 ^ 48) <= 32) {
            }
            x2 = aVar2.x();
            if (!z) {
            }
            x2 = new nse(izsVar, 13);
            aVar2.R(x2);
            gzs gzsVar22 = (gzs) x2;
            androidx.compose.runtime.a aVar52 = aVar2;
            c0012a3 = c0012a2;
            i7 = i5;
            i8 = i6;
            d.b.a a142 = d.b.a.C0757a.a(a112, N42, gzsVar22, cVar3, null, a132, aVar52, 12582920, 80);
            aVar2 = aVar52;
            aVar2.j();
            aVar3 = a142;
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            if (z3) {
            }
            aVar2.K(587449836);
            aVar2.j();
            aVar4 = null;
            if (androidx.compose.runtime.b.d()) {
            }
            androidx.compose.runtime.a aVar72 = aVar2;
            muv0.h(a2, q630Var, null, null, a, null, d.a.a(c0760d, aVar3, aVar4, null, aVar2, 24576, 8), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar72, 48, 0, 8108);
            M = aVar72;
            a(izsVar, wh50Var, null, M, ((i11 >> 3) & 14) | 48);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nnc(i, 3, ipl0Var, izsVar, q630Var);
        }
    }
}
