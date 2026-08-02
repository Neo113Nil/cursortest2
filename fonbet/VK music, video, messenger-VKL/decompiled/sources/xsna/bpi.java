package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: ComposeAudioBookSliderVh.kt */
/* loaded from: classes16.dex */
public final class bpi {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(59043776);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(59043776, i2, -1, "com.vk.catalog2.feature.music.holders.audiobook.FreeBadge (ComposeAudioBookSliderVh.kt:198)");
            }
            float f = 2;
            aVar2 = M;
            yqv0.c(d370.N(R.string.audio_book_free_badge, 0, M), s200.E(hr80.m(rte0.d(txj0.j(18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.v(q630Var, 36)), vog0.b(4)), wlb0.h(M).getBackground().b, androidx.compose.ui.graphics.e.a), f, f), wlb0.h(M).getText().d, null, null, 0, 3, null, 0, false, 0, 1, null, wlb0.l(M).u0, aVar2, 0, 48, 6072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p2h(q630Var, i, 1);
        }
    }
}
