package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PlaybackSpeedButton.kt */
/* loaded from: classes3.dex */
public final class rya0 {
    public static final void a(final float f, final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-677743331);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-677743331, i2, -1, "com.vk.music.stickyplayer.presentation.components.controls.PlaybackSpeedButton (PlaybackSpeedButton.kt:35)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new DecimalFormat("#.#x");
                M.R(x);
            }
            DecimalFormat decimalFormat = (DecimalFormat) x;
            Object obj2 = (View) M.r(AndroidCompositionLocals_androidKt.f);
            String O = d370.O(R.string.music_talkback_playback_speed, new Object[]{Float.valueOf(f)}, M);
            q630.a aVar3 = q630.a.a;
            float f2 = 24;
            q630 a = o19.a(txj0.u(s200.D(aVar3, 10), f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), f == 1.0f ? 0.64f : 1.0f);
            boolean y = M.y(obj2) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new d5(18, obj2, izsVar);
                M.R(x2);
            }
            q630 c = ojc.c(a, true, null, null, (gzs) x2, 14);
            boolean J = M.J(O);
            Object x3 = M.x();
            if (J || x3 == obj) {
                x3 = new wj2(O, 3);
                M.R(x3);
            }
            q630 a2 = egi0.a(c, (izs) x3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a2);
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
            String format = decimalFormat.format(f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.b0;
            q630 E = ahn.E(aVar3, "playbackSpeedButton");
            q630 b = ra8.a.b(aVar3, dt1.a.f);
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new bws(8);
                M.R(x4);
            }
            q630Var2 = aVar3;
            aVar2 = M;
            yqv0.c(format, E.g(egi0.a(b, (izs) x4)), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(f, i, izsVar, q630Var2) { // from class: xsna.qya0
                public final /* synthetic */ float b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;

                {
                    this.c = izsVar;
                    this.d = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(49);
                    rya0.a(this.b, I, (androidx.compose.runtime.a) obj3, this.c, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
