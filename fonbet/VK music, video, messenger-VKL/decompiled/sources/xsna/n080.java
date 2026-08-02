package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.models.autoplay.RepeatMode;
import xsna.a080;
import xsna.c280;
import xsna.chs;
import xsna.cri;
import xsna.d280;
import xsna.dt1;
import xsna.q630;

/* compiled from: OldUserOnBoardingStateContentView.kt */
/* loaded from: classes5.dex */
public final class n080 {
    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c280 c280Var, q630 q630Var, frv0 frv0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        q630.a aVar4;
        androidx.compose.runtime.a M = aVar.M(-1603771956);
        int i2 = i | (M.J(c280Var) ? 4 : 2) | (M.J(frv0Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1603771956, i2, -1, "com.vk.profile.core.onboarding.mvi.view.DescriptionContent (OldUserOnBoardingStateContentView.kt:161)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = c280Var instanceof c280.c;
            q630.a aVar6 = q630.a.a;
            if (z) {
                c280.c cVar = (c280.c) c280Var;
                if (cVar.d != null) {
                    M.K(191025175);
                    rwr rwrVar = new rwr();
                    q630 b = mxr.b(3, jvi.d(s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), rwrVar), false);
                    boolean J = M.J(rwrVar);
                    Object x = M.x();
                    if (J || x == a.C0011a.a) {
                        x = new d2y(rwrVar, 13);
                        M.R(x);
                    }
                    q630 o = egi.o(b, (izs) x);
                    String str = cVar.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var2 = wuv0Var.w0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().p;
                    aVar4 = aVar6;
                    yqv0.c(str, o, j, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var2, M, 0, 0, 8120);
                    aVar3 = M;
                    aVar3.j();
                    frv0 frv0Var3 = wlb0.l(aVar3).w;
                    String title = c280Var.getTitle();
                    if (frv0Var != null) {
                        frv0Var3 = frv0Var3.a(frv0Var);
                    }
                    frv0 frv0Var4 = frv0Var3;
                    float f = 16;
                    aVar2 = aVar3;
                    yqv0.c(title, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), wlb0.h(aVar3).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var4, aVar2, 48, 0, 8120);
                    yqv0.c(c280Var.getDescription(), s200.H(aVar4, f, 12, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), wlb0.h(aVar2).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).X, aVar2, 0, 0, 8120);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            aVar3 = M;
            aVar4 = aVar6;
            aVar3.K(183700960);
            aVar3.j();
            frv0 frv0Var32 = wlb0.l(aVar3).w;
            String title2 = c280Var.getTitle();
            if (frv0Var != null) {
            }
            frv0 frv0Var42 = frv0Var32;
            float f2 = 16;
            aVar2 = aVar3;
            yqv0.c(title2, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), wlb0.h(aVar3).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var42, aVar2, 48, 0, 8120);
            yqv0.c(c280Var.getDescription(), s200.H(aVar4, f2, 12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), wlb0.h(aVar2).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).X, aVar2, 0, 0, 8120);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fo3(i, 3, c280Var, q630Var, frv0Var);
        }
    }

    public static final void b(d280.a aVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(865221480);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(865221480, i2, -1, "com.vk.profile.core.onboarding.mvi.view.ImageContent (OldUserOnBoardingStateContentView.kt:242)");
            }
            fwu0.c(q630Var, null, aVar.a, null, null, null, null, kai.c(-1599222215, new a0t() { // from class: xsna.m080
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    qa8 qa8Var = (qa8) obj;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar3.J(qa8Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar3.J(chsVar) ? 32 : 16;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar3.J(lg90Var) : aVar3.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar3.t(i3 & 1, (i3 & 1171) != 1170)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1599222215, i3, -1, "com.vk.profile.core.onboarding.mvi.view.ImageContent.<anonymous> (OldUserOnBoardingStateContentView.kt:247)");
                        }
                        q630.a aVar4 = q630.a.a;
                        vjw.a(lg90Var, null, txj0.d(aVar4, 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 440 | ((i3 >> 6) & 14), 120);
                        if (chsVar instanceof chs.c) {
                            aVar3.K(1643433796);
                            SpinnerState spinnerState = SpinnerState.Loading;
                            dt1.a.getClass();
                            zfr0.f(spinnerState, qa8Var.b(aVar4, dt1.a.f), null, 0L, SpinnerSize.Size36, null, aVar3, 24582, 44);
                            aVar3 = aVar3;
                        } else {
                            aVar3.K(1633214057);
                        }
                        aVar3.j();
                        boolean z = chsVar instanceof chs.e;
                        izs izsVar2 = izs.this;
                        if (z) {
                            izsVar2.invoke(a080.c.b);
                        }
                        if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a)) {
                            izsVar2.invoke(a080.b.b);
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 6) & 14) | 100663296, 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w70(aVar, izsVar, q630Var, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(d280.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1884792680);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1884792680, i2, -1, "com.vk.profile.core.onboarding.mvi.view.VideoContent (OldUserOnBoardingStateContentView.kt:205)");
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
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            q630.a aVar3 = q630.a.a;
            q630 a = o19.a(txj0.d(aVar3, 1.0f), ((Number) wh50Var2.getValue()).floatValue());
            VideoFileOld videoFileOld = bVar.a;
            com.vk.libvideo.autoplay.a aVar4 = new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, true, false, false, null, null, null, null, null, null, false, null, 524221);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new m9(25, wh50Var, wh50Var2);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new vkb(izsVar, wh50Var, wh50Var2, 4);
                M.R(x4);
            }
            izs izsVar3 = (izs) x4;
            boolean z2 = i3 == 32;
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                x5 = new pmg(2, izsVar, wh50Var2);
                M.R(x5);
            }
            gdu0.a(videoFileOld, a, aVar4, false, false, null, izsVar2, izsVar3, null, null, null, null, (wzs) x5, null, null, null, null, M, 1573376, 126776);
            M = M;
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1581856975);
                zfr0.f(SpinnerState.Loading, ra8.a.b(aVar3, dt1.a.f), null, 0L, SpinnerSize.Size36, null, M, 24582, 44);
            } else {
                M.K(1572314772);
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
            s.d = new ss0(i, 3, bVar, izsVar, q630Var);
        }
    }
}
