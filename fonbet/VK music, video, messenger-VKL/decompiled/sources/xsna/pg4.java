package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AudioBookFooter.kt */
/* loaded from: classes3.dex */
public final class pg4 {
    public final mtk0<Integer> a;
    public final mtk0<String> b;
    public final mtk0<Integer> c;

    public pg4(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3) {
        this.a = wh50Var;
        this.b = wh50Var2;
        this.c = wh50Var3;
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        String f;
        androidx.compose.runtime.a M = aVar.M(-39339400);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-39339400, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookFooter.Component (AudioBookFooter.kt:34)");
            }
            q630Var2 = q630.a.a;
            float f2 = 20;
            q630 m = hr80.m(rte0.d(txj0.f(q630Var2, 1.0f), vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3)), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            wlb0.i(M).getClass();
            float f3 = tqu0.e;
            q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, m);
            wlb0.i(M).getClass();
            float f4 = tqu0.d;
            wlb0.i(M).getClass();
            q630 H = s200.H(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 5);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i3 = new MusicTrack(0, null, null, null, this.a.getValue().intValue(), 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -17, 1048575, null).f;
            long j = i3 % 60;
            int i4 = (i3 % 3600) / 60;
            int i5 = i3 / 3600;
            if (i5 > 0) {
                f = enj.f(R.plurals.music_hours, i5, context);
                String f5 = enj.f(R.plurals.music_minutes, i4, context);
                if (i4 > 0) {
                    f = v1v.a(' ', f, f5);
                }
            } else {
                f = i4 > 0 ? enj.f(R.plurals.music_minutes, i4, context) : enj.f(R.plurals.music_seconds, (int) j, context);
            }
            rg4.a(48, 0, M, f.toString(), ahn.E(q630Var2, "audiobookDuration"));
            rg4.a(0, 2, M, d370.O(R.string.music_age_limit, new Object[]{this.c.getValue()}, M), null);
            String value = this.b.getValue();
            if (value == null || value.length() == 0) {
                M.K(-952130848);
            } else {
                M.K(-949854022);
                rg4.a(0, 2, M, value, null);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og4(this, q630Var2, i, 0);
        }
    }
}
