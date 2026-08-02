package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.chs;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nji implements a0t {
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
                androidx.compose.runtime.b.f(-1639658071, i, -1, "com.vk.music.playlist.display.presentation.ComposableSingletons$PlaylistOwnerKt.lambda$-1639658071.<anonymous> (PlaylistOwner.kt:91)");
            }
            if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a)) {
                aVar.K(-390406512);
                zbb0.c(0, aVar);
                aVar.j();
            } else {
                aVar.K(-390296493);
                vjw.a(lg90Var, null, rte0.d(txj0.q(q630.a.a, 16), vog0.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56 | ((i >> 6) & 14), 120);
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
