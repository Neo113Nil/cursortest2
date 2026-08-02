package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.IconViewState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Screen.kt */
/* loaded from: classes7.dex */
public final class kch0 {

    /* compiled from: Screen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconViewState.values().length];
            try {
                iArr[IconViewState.ARROW_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconViewState.CHECK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconViewState.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ldh0 ldh0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs izsVar2;
        q630 q630Var2;
        int i3;
        q630.a aVar2;
        ra8 ra8Var;
        int i4;
        a.C0011a.C0012a c0012a;
        int i5;
        androidx.compose.runtime.a M = aVar.M(104573265);
        if ((i & 6) == 0) {
            i2 = i | (M.J(ldh0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if (M.t(i6 & 1, (i6 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(104573265, i6, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.Screen (Screen.kt:30)");
            }
            int i7 = i6 & 112;
            boolean z = i7 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                x = new nq0(izsVar, 6);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            q630 c = ojc.c(aVar3, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (ldh0Var.b == null) {
                M.K(-869077114);
            } else {
                M.K(-869077113);
                y4b0.b(txj0.d(aVar3, 1.0f), ldh0Var.b, null, M, 6);
            }
            M.j();
            IconViewState iconViewState = ldh0Var.c;
            boolean z2 = i7 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a2) {
                x2 = new z8c(izsVar, 9);
                M.R(x2);
            }
            ra8 ra8Var2 = ra8.a;
            q630 b = ra8Var2.b(aVar3, ty6Var);
            float f = 8;
            b(iconViewState, (gzs) x2, s200.H(b, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), M, 0);
            IconViewState iconViewState2 = ldh0Var.d;
            boolean z3 = i7 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a2) {
                x3 = new v67(izsVar, 7);
                M.R(x3);
            }
            b(iconViewState2, (gzs) x3, ahn.E(s200.H(ra8Var2.b(aVar3, dt1.a.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), "ScreenTags.ICON_RIGHT"), M, 0);
            if (ldh0Var.e) {
                M.K(-868304345);
                boolean z4 = i7 == 32;
                Object x4 = M.x();
                if (z4 || x4 == c0012a2) {
                    x4 = new r0(izsVar, 5);
                    M.R(x4);
                }
                gzs gzsVar = (gzs) x4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(327477500, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-PlayButton64> (VkSdkIcons.kt:2890)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_play_button_64, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i4 = 0;
                i3 = i7;
                aVar2 = aVar3;
                ra8Var = ra8Var2;
                c0012a = c0012a2;
                i5 = 1;
                nzu0.c(gzsVar, a2, d370.N(R.string.video_viewer_icon_play_talkback, 0, M), ra8Var2.b(aVar3, dt1.a.f), 64, 0L, false, null, false, null, null, M, 24640, 2016);
            } else {
                i3 = i7;
                aVar2 = aVar3;
                ra8Var = ra8Var2;
                i4 = 0;
                c0012a = c0012a2;
                i5 = 1;
                M.K(-870562261);
            }
            M.j();
            q630 b2 = ra8Var.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 50, i5, aVar2), dt1.a.i);
            long j = ldh0Var.g;
            long j2 = ldh0Var.f;
            if (i3 != 32) {
                i5 = i4;
            }
            Object x5 = M.x();
            if (i5 != 0 || x5 == c0012a) {
                izsVar2 = izsVar;
                x5 = new c9g0(izsVar2, 1);
                M.R(x5);
            } else {
                izsVar2 = izsVar;
            }
            f4i0.a(j, j2, b2, (izs) x5, M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            izsVar2 = izsVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new efd0(ldh0Var, izsVar2, q630Var2, i, 2);
        }
    }

    public static final void b(IconViewState iconViewState, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> k77Var;
        q630 q630Var2;
        lg90 b;
        String N;
        androidx.compose.runtime.a M = aVar.M(598473345);
        int i2 = i | (M.o(iconViewState == null ? -1 : iconViewState.ordinal()) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(598473345, i2, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.VideoViewerIcon (Screen.kt:87)");
            }
            int i3 = iconViewState == null ? -1 : a.$EnumSwitchMapping$0[iconViewState.ordinal()];
            if (i3 == 1) {
                q630Var2 = q630Var;
                M.K(710419264);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                }
                b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                N = d370.N(R.string.video_viewer_toolbar_icon_back_talkback, 0, M);
                M.j();
            } else if (i3 == 2) {
                q630Var2 = q630Var;
                M.K(710611309);
                qzu0.a.getClass();
                b = qzu0.G(M);
                N = d370.N(R.string.video_viewer_toolbar_icon_attach_talkback, 0, M);
                M.j();
            } else {
                if (i3 != 3) {
                    if (oq.h(710962043, M)) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s != null) {
                        k77Var = new qi1(i, 4, iconViewState, gzsVar, q630Var);
                        s.d = k77Var;
                    }
                    return;
                }
                q630Var2 = q630Var;
                M.K(710792163);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                N = d370.N(R.string.video_viewer_toolbar_icon_back_talkback, 0, M);
                M.j();
            }
            q630 q = txj0.q(q630Var2, 36);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q, ylu0Var.j().b, vog0.a);
            float f = 44;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b, N, m, f, ylu0Var2.getIcon().c, false, null, false, null, null, M, ((i2 >> 3) & 14) | 24640, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            k77Var = new k77(i, 4, iconViewState, gzsVar, q630Var);
            s.d = k77Var;
        }
    }
}
