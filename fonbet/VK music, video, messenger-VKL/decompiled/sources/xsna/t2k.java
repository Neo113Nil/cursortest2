package xsna;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.u2k;
import xsna.wkj;

/* compiled from: CoverImage.kt */
/* loaded from: classes7.dex */
public final class t2k {
    public static final void a(u2k u2kVar, final wkj wkjVar, gzs gzsVar, final r5j0 r5j0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        Uri g;
        androidx.compose.runtime.a M = aVar.M(1827751824);
        if ((i & 6) == 0) {
            i2 = (M.J(u2kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wkjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(r5j0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1827751824, i2, -1, "com.vk.video.ui.upload.impl.common.presentation.compose.coverimage.CoverFrescoImage (CoverImage.kt:99)");
            }
            Object x = M.x();
            String str = null;
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            chs chsVar = (chs) wh50Var.getValue();
            boolean J = M.J(chsVar) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new s2k(chsVar, gzsVar, null);
                M.R(x2);
            }
            bap.g(chsVar, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j = ylu0Var.getImage().c;
            u2k.d dVar = u2kVar instanceof u2k.d ? (u2k.d) u2kVar : null;
            String str2 = dVar != null ? dVar.a : null;
            u2k.b bVar = u2kVar instanceof u2k.b ? (u2k.b) u2kVar : null;
            if (bVar != null && (g = jeq0.g(bVar.a)) != null) {
                str = g.toString();
            }
            boolean p = M.p(j);
            Object x3 = M.x();
            if (p || x3 == obj) {
                x3 = new izs() { // from class: xsna.p2k
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        ((ojt) obj2).d = new ColorDrawable(f870.H(j));
                        return s3q0.a;
                    }
                };
                M.R(x3);
            }
            fwu0.c(q630Var2, str, str2, null, null, (izs) x3, null, kai.c(1738335777, new a0t() { // from class: xsna.q2k
                @Override // xsna.a0t
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i3;
                    chs chsVar2 = (chs) obj3;
                    lg90 lg90Var = (lg90) obj4;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    if ((intValue & 48) == 0) {
                        i3 = (aVar2.J(chsVar2) ? 32 : 16) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 1169) != 1168)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1738335777, i3, -1, "com.vk.video.ui.upload.impl.common.presentation.compose.coverimage.CoverFrescoImage.<anonymous> (CoverImage.kt:117)");
                        }
                        wh50.this.setValue(chsVar2);
                        t2k.c(lg90Var, wkjVar, r5j0Var, null, aVar2, 8 | ((i3 >> 6) & 14), 8);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 12) & 14) | 100663296, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b74(u2kVar, wkjVar, gzsVar, r5j0Var, q630Var, i, 2);
        }
    }

    public static final void b(u2k u2kVar, r5j0 r5j0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1411074415);
        int i2 = i | (M.J(u2kVar) ? 4 : 2) | (M.J(r5j0Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1411074415, i2, -1, "com.vk.video.ui.upload.impl.common.presentation.compose.coverimage.CoverImage (CoverImage.kt:29)");
            }
            if (u2kVar instanceof u2k.a) {
                M.K(1822215558);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c(new y6g(ylu0Var.getImage().c), wkj.a.f, r5j0Var, q630Var, M, 56 | ((i2 << 3) & 896) | (i2 & 7168), 0);
                M = M;
                M.j();
            } else {
                boolean z = u2kVar instanceof u2k.c;
                wkj.a.b bVar = wkj.a.g;
                if (z) {
                    M.K(1822523357);
                    c(k9q0.d(((u2k.c) u2kVar).a), bVar, r5j0Var, q630Var, M, ((i2 << 3) & 896) | 56 | (i2 & 7168), 0);
                    M = M;
                    M.j();
                } else if (u2kVar instanceof u2k.b) {
                    M.K(1822807441);
                    a(u2kVar, bVar, gzsVar, r5j0Var, q630Var, M, (i2 & 896) | 48 | ((i2 << 6) & 7168) | ((i2 << 3) & 57344));
                    M.j();
                } else {
                    if (!(u2kVar instanceof u2k.d)) {
                        throw alb0.c(1167159077, M);
                    }
                    M.K(1823103863);
                    a(u2kVar, wkj.a.a, gzsVar, r5j0Var, q630Var, M, (i2 & 896) | 48 | ((i2 << 6) & 7168) | ((i2 << 3) & 57344));
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bl0(u2kVar, r5j0Var, gzsVar, q630Var, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final lg90 lg90Var, final wkj wkjVar, final r5j0 r5j0Var, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(809162292);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(wkjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(r5j0Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(809162292, i3, -1, "com.vk.video.ui.upload.impl.common.presentation.compose.coverimage.CoverPainterImage (CoverImage.kt:77)");
                }
                q630 d = rte0.d(q630Var4, r5j0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vjw.a(lg90Var, null, r18.a((float) 0.5d, ylu0Var.getImage().a, d, r5j0Var), null, wkjVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, (i3 & 14) | 56 | ((i3 << 9) & 57344), 104);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.r2k
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2k.c(lg90.this, wkjVar, r5j0Var, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
