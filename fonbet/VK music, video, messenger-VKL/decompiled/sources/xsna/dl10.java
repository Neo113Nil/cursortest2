package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import xsna.cri;
import xsna.dt1;
import xsna.iev;
import xsna.pox0;
import xsna.q630;

/* compiled from: MatchWidgetContent.kt */
/* loaded from: classes17.dex */
public final class dl10 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final pox0.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(-2145114365);
        if ((i & 6) == 0) {
            i3 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                M.h();
            } else {
                q630.a aVar2 = q630.a.a;
                if (i4 != 0) {
                    q630Var2 = aVar2;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2145114365, i3, -1, "com.vk.community.design.compose.widget.match.MatchWidgetContent (MatchWidgetContent.kt:28)");
                }
                al10 al10Var = dVar.b;
                if (al10Var == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s != null) {
                        wzsVar = new wzs() { // from class: xsna.bl10
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                int I = ne7.I(i | 1);
                                dl10.a(pox0.d.this, q630Var2, (androidx.compose.runtime.a) obj, I, i2);
                                return s3q0.a;
                            }
                        };
                        s.d = wzsVar;
                        return;
                    }
                    return;
                }
                t7o0 t7o0Var = al10Var.a;
                t7o0 t7o0Var2 = al10Var.b;
                q630 m = hr80.m(s200.F(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2), l5g.k, androidx.compose.ui.graphics.e.a);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, m);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                String str = null;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                tpg0 tpg0Var = tpg0.a;
                c(t7o0Var, tpg0Var.b(1.0f, aVar2, true), M, 0);
                q630 b = tpg0Var.b(1.0f, aVar2, true);
                Integer num = al10Var.e;
                Integer num2 = al10Var.d;
                if (num2 != null && num != null) {
                    str = num2 + " : " + num;
                }
                if (str == null) {
                    str = "—";
                }
                b(0, M, str, al10Var.f, b);
                c(t7o0Var2, tpg0Var.b(1.0f, aVar2, true), M, 0);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                wzsVar = new wzs() { // from class: xsna.cl10
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int I = ne7.I(i | 1);
                        dl10.a(pox0.d.this, q630Var2, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                s.d = wzsVar;
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1408055138);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1408055138, i2, -1, "com.vk.community.design.compose.widget.match.ScoreContent (MatchWidgetContent.kt:70)");
            }
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7);
            a.j g = androidx.compose.foundation.layout.a.g(6);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            rnu0.c(ContentBadgeSize.Large, ContentBadgeMode.Secondary, ContentBadgeAppearance.Design.Neutral, null, null, null, str, null, null, null, false, null, false, null, M, ((i2 << 18) & 3670016) | 438, 0, 16312);
            M = M;
            if (str2 == null) {
                M.K(1415003711);
            } else {
                M.K(1415003712);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.i0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str2, null, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8122);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(i, 6, str, str2, q630Var);
        }
    }

    public static final void c(t7o0 t7o0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        HorizontalListItem$VisualContent horizontalListItem$VisualContent;
        androidx.compose.runtime.a M = aVar.M(1292614670);
        int i2 = (M.J(t7o0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1292614670, i2, -1, "com.vk.community.design.compose.widget.match.TeamTile (MatchWidgetContent.kt:50)");
            }
            String str = t7o0Var.c;
            String str2 = t7o0Var.b;
            if (str == null) {
                M.K(-393015454);
                M.j();
                horizontalListItem$VisualContent = null;
            } else {
                M.K(-393015453);
                lg90 l = fwu0.l(null, str, null, null, M, 0, 61);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1670845044, 56, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.Image.invoke (HorizontalListItem.kt:47)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new shw(l);
                    M.R(x);
                }
                shw shwVar = (shw) x;
                ((zak0) shwVar.a).setValue(l);
                ((zak0) shwVar.b).setValue(Boolean.FALSE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                horizontalListItem$VisualContent = shwVar;
            }
            if (horizontalListItem$VisualContent == null) {
                horizontalListItem$VisualContent = HorizontalListItem$VisualContent.b.a;
            }
            HorizontalListItem$VisualContent horizontalListItem$VisualContent2 = horizontalListItem$VisualContent;
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
            String str3 = t7o0Var.a;
            if (str3 == null) {
                str3 = "";
            }
            q630Var2 = q630Var;
            azu0.b(withPicture, horizontalListItem$VisualContent2, iev.c.a(str3, (str2 == null || drm0.N(str2)) ? null : str2, 0, null, M, 0, 57), q630Var2, null, M, 6 | ((i2 << 6) & 7168), 16);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(t7o0Var, q630Var2, i, 7);
        }
    }
}
