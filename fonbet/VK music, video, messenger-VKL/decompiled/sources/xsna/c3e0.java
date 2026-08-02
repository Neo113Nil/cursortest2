package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.d4k0;
import xsna.q630;
import xsna.tlo0;

/* compiled from: ProgressModal.kt */
/* loaded from: classes7.dex */
public final class c3e0 {
    public static final void a(final d3e0 d3e0Var, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-401059696);
        int i2 = i | (M.J(d3e0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-401059696, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.modal.progress.ProgressModal (ProgressModal.kt:41)");
            }
            boolean z = d3e0Var != null;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new bqt(21);
                M.R(x);
            }
            fdj0 G = nr2.G(54, 0, M, (izs) x);
            Boolean valueOf = Boolean.valueOf(z);
            boolean l = M.l(z) | M.J(G);
            Object x2 = M.x();
            if (l || x2 == obj) {
                x2 = new b3e0(z, G, null);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, 0);
            q630.a aVar4 = q630.a.a;
            if (d3e0Var != null) {
                M.K(630089509);
                Mode mode = Mode.FullScreen;
                boolean z2 = (i2 & 112) == 32;
                Object x3 = M.x();
                if (z2 || x3 == obj) {
                    x3 = new th2(izsVar, 9);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = new c24(0);
                    M.R(x4);
                }
                aVar3 = aVar4;
                a030.b(mode, gzsVar, aVar3, G, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, (gzs) x4, null, false, null, null, kai.c(1539840841, new yzs() { // from class: xsna.a3e0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar5.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1539840841, intValue, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.modal.progress.ProgressModal.<anonymous> (ProgressModal.kt:62)");
                            }
                            c3e0.b(d3e0.this, izsVar, aVar5, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar5.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 805306758, 100666752, 249328);
                aVar2 = M;
            } else {
                aVar3 = aVar4;
                aVar2 = M;
                aVar2.K(627943410);
            }
            aVar2.j();
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
            s.d = new jk1(i, 5, d3e0Var, izsVar, q630Var2);
        }
    }

    public static final void b(d3e0 d3e0Var, izs<? super d4k0.f, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        izs<? super d4k0.f, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(1130558038);
        int i2 = i | (M.J(d3e0Var) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1130558038, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.modal.progress.ProgressModalContent (ProgressModal.kt:74)");
            }
            String obj = tlo0.b.a(d3e0Var.a, (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new oey(20);
                M.R(x);
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(obj, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14), null, null, null, M, 14);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new nse(izsVar2, 11);
                M.R(x2);
            }
            muv0.h(a, null, null, null, null, TopBar$Before.d.a.a(null, (gzs) x2, null, null, M, 24576, 13), null, null, false, wlb0.h(M).getBackground().r, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 7646);
            String N = d370.N(R.string.smart_crop_modal_progress_description, 0, M);
            q630.a aVar3 = q630.a.a;
            float f = 12;
            yqv0.c(N, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).T, M, 48, 0, 8120);
            float f2 = 16;
            bev0.a(d3e0Var.b, 48, 0, wlb0.h(M).m().b, M, s200.H(txj0.f(aVar3, 1.0f), f2, 20, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
            StringBuilder sb = new StringBuilder();
            sb.append(swe0.g(an10.b(d3e0Var.b * 100), 0, 100));
            sb.append('%');
            yqv0.c(sb.toString(), s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).T, M, 48, 0, 8120);
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new ln7(izsVar, 9);
                M.R(x3);
            }
            izsVar2 = izsVar;
            bhu0.e((gzs) x3, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, s200.G(txj0.f(aVar3, 1.0f), f2, 32, f2, f), null, false, false, null, null, null, d370.N(R.string.smart_crop_modal_progress_button_cancel, 0, M), null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
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
            s.d = new e5l(d3e0Var, izsVar2, i, 3);
        }
    }
}
