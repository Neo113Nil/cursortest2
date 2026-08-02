package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AudioBookSubtitles.kt */
/* loaded from: classes3.dex */
public final class xj4 implements aab0 {
    public final mtk0<String> a;
    public final mtk0<Integer> b;
    public final mtk0<Boolean> c;
    public final mtk0<Boolean> d;
    public final gzs<s3q0> e;

    public xj4(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4, gzs gzsVar) {
        this.a = wh50Var;
        this.b = wh50Var2;
        this.c = wh50Var3;
        this.d = wh50Var4;
        this.e = gzsVar;
    }

    @Override // xsna.aab0
    public final void a(q630 q630Var, dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String f;
        androidx.compose.runtime.a M = aVar.M(-1788990560);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1788990560, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookSubtitles.Component (AudioBookSubtitles.kt:36)");
            }
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, bVar, M, (((i2 & 14) | ((i2 << 3) & 896)) >> 3) & 112);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i3 = new MusicTrack(0, null, null, null, this.b.getValue().intValue(), 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -17, 1048575, null).f;
            long j = i3 % 60;
            int i4 = (i3 % 3600) / 60;
            int i5 = i3 / 3600;
            if (i5 > 0) {
                f = enj.f(R.plurals.music_hours, i5, context);
                String f2 = enj.f(R.plurals.music_minutes, i4, context);
                if (i4 > 0) {
                    f = v1v.a(' ', f, f2);
                }
            } else {
                f = i4 > 0 ? enj.f(R.plurals.music_minutes, i4, context) : enj.f(R.plurals.music_seconds, (int) j, context);
            }
            String str = this.a.getValue() + ' ' + d370.N(R.string.dot_separator, 0, M) + ' ' + f.toString();
            q630.a aVar3 = q630.a.a;
            q630 a2 = o19.a(aVar3, 0.72f);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new pr1(1);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(a2, false, null, null, (gzs) x, 14), "audiobookSubtitle");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.b0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var.getText().d, null, null, 0, 3, null, 2, false, 0, 1, null, frv0Var, M, 100663296, 48, 5816);
            M = M;
            if (this.d.getValue().booleanValue()) {
                M.K(-1470855508);
            } else {
                M.K(-1468349530);
                ah4.a(48, M, this.e, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), this.c.getValue().booleanValue());
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
            s.d = new ni1(this, q630Var, bVar, i);
        }
    }
}
