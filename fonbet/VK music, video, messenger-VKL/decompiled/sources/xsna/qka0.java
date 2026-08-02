package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q8z;
import xsna.us2;
import xsna.zra0;

/* compiled from: PictureOverlayState.kt */
/* loaded from: classes5.dex */
public final class qka0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, final gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1249719151);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1249719151, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.ErrorOverlay (PictureOverlayState.kt:71)");
            }
            String N = d370.N(R.string.author_header_loading_error, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            boolean J = M.J(N) | ((i2 & 14) == 4) | M.p(j);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                us2.b bVar = new us2.b();
                int l = bVar.l(new q8z.a("author_header_loading_error_retry", new tjo0(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), (hik0) null, (hik0) null, 14), new i9z() { // from class: xsna.oka0
                    @Override // xsna.i9z
                    public final void a(q8z q8zVar) {
                        gzs.this.invoke();
                    }
                }));
                try {
                    bVar.g(N);
                    s3q0 s3q0Var = s3q0.a;
                    bVar.k(l);
                    x = bVar.n();
                    M.R(x);
                } catch (Throwable th) {
                    bVar.k(l);
                    throw th;
                }
            }
            us2 us2Var = (us2) x;
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(423927554, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Replay28> (VkIcons.kt:9428)");
            }
            lg90 b = or.b(M, 2022076330, R.drawable.vk_icon_replay_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ldv0.d(q630Var, csa0.a(b, ylu0Var2.getIcon().l, 0L, null, null, M, 196616, 28), zra0.a.b(null, null, us2Var, null, M, 196608, 27), null, PlaceholderMode.Overlay, null, false, M, 24582, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t8t(gzsVar, q630Var, i);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1178396207);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1178396207, i, -1, "com.vk.profile.design.compose.header.header.picture.paging.LoadingOverlay (PictureOverlayState.kt:41)");
            }
            q630Var2 = q630Var;
            zfr0.e(q630Var2, 0L, SpinnerSize.Size28, M, 390, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o4e(q630Var2, i, 6);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1133018787);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1133018787, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.TapToPlayOvelay (PictureOverlayState.kt:53)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            qzu0.a.getClass();
            lg90 c1 = qzu0.c1(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, c1, new l5g(ylu0Var.getIcon().c), null, d370.N(R.string.author_header_tap_to_play, 0, M), null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | 1073745328, 0, 0, 4188656);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new au7(gzsVar, q630Var, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d(boolean z, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1771488069, 0, -1, "com.vk.profile.design.compose.header.header.picture.paging.rememberDelayedLoadingVisibility (PictureOverlayState.kt:100)");
        }
        boolean l = aVar.l(z);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (l || x == obj) {
            x = androidx.compose.runtime.k.b(Boolean.FALSE);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        Boolean valueOf = Boolean.valueOf(z);
        boolean l2 = aVar.l(z) | aVar.J(wh50Var);
        Object x2 = aVar.x();
        if (l2 || x2 == obj) {
            x2 = new pka0(null, wh50Var, z);
            aVar.R(x2);
        }
        bap.g(valueOf, (wzs) x2, aVar, 0);
        boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return booleanValue;
    }
}
