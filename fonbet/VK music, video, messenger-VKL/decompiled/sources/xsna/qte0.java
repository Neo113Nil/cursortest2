package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: RadioBigPlayerScaffold.kt */
/* loaded from: classes3.dex */
public final class qte0 {
    public static final void a(final vue0 vue0Var, final h17 h17Var, final dlv0 dlv0Var, final mtk0 mtk0Var, q630 q630Var, final s7k0 s7k0Var, final izs izsVar, final jai jaiVar, final jai jaiVar2, final jai jaiVar3, final zzs zzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1078060542);
        int i2 = i | (M.J(vue0Var) ? 4 : 2) | (M.J(h17Var) ? 32 : 16) | (M.J(mtk0Var) ? 2048 : 1024) | 24576 | (M.J(s7k0Var) ? 131072 : 65536) | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1078060542, i2, 6, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerScaffold (RadioBigPlayerScaffold.kt:33)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 16;
            aVar2 = M;
            f17.a(ahn.E(aVar3, "player"), zzsVar, jaiVar, jaiVar2, jaiVar3, kai.c(439757847, new qm7(6, vue0Var, izsVar), M), kai.c(-1138546294, new f8k(dlv0Var, s7k0Var, izsVar), M), h17Var, false, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mtk0Var, bw40.b, null, aVar2, 1797552 | ((i2 << 18) & 29360128), ((i2 >> 6) & 112) | 384, 9472);
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
            s.d = new wzs(h17Var, dlv0Var, mtk0Var, q630Var2, s7k0Var, izsVar, jaiVar, jaiVar2, jaiVar3, zzsVar, i) { // from class: xsna.pte0
                public final /* synthetic */ h17 c;
                public final /* synthetic */ dlv0 d;
                public final /* synthetic */ mtk0 e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ s7k0 g;
                public final /* synthetic */ izs h;
                public final /* synthetic */ jai i;
                public final /* synthetic */ jai j;
                public final /* synthetic */ jai k;
                public final /* synthetic */ zzs l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(918552961);
                    qte0.a(vue0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
