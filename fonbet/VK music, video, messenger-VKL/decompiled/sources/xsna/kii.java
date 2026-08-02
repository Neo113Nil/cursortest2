package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.chs;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kii implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        chs chsVar = (chs) obj2;
        lg90 lg90Var = (lg90) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue = ((Integer) obj5).intValue();
        if ((intValue & 48) == 0) {
            i = (aVar.J(chsVar) ? 32 : 16) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 384) == 0) {
            i |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
        }
        if (aVar.t(i & 1, (i & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(784747727, i, -1, "com.vk.music.stickyplayer.presentation.components.ComposableSingletons$MusicStandaloneBottomPlayerKt.lambda$784747727.<anonymous> (MusicStandaloneBottomPlayer.kt:666)");
            }
            boolean z = chsVar instanceof chs.b;
            q630.a aVar2 = q630.a.a;
            if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                aVar.K(-1771672864);
                nsa0.a(a9p0.b, 54, aVar, txj0.d(aVar2, 1.0f));
                aVar.j();
            } else {
                aVar.K(912932229);
                q630 d = txj0.d(aVar2, 1.0f);
                float f = (float) 0.5d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                y18 a = aqw.a(f, ylu0Var.getImage().a);
                float f2 = a9p0.b;
                vjw.a(lg90Var, null, rte0.d(r18.b(a.a, a.b, d, vog0.b(f2)), vog0.b(f2)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56 | ((i >> 6) & 14), 120);
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
