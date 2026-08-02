package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.chs;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zfi implements a0t {
    public final /* synthetic */ int b;

    public /* synthetic */ zfi(int i) {
        this.b = i;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        chs chsVar = (chs) obj2;
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 384) == 0) {
                    intValue |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
                }
                if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1536715842, intValue, -1, "com.vk.games.presentation.components.sections.ComposableSingletons$GamesAchievementsBlockHolderKt.lambda$-1536715842.<anonymous> (GamesAchievementsBlockHolder.kt:305)");
                    }
                    vjw.a(lg90Var, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56 | ((intValue >> 6) & 14), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                lg90 lg90Var2 = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 48) == 0) {
                    i = (aVar2.J(chsVar) ? 32 : 16) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 384) == 0) {
                    i |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var2) : aVar2.y(lg90Var2) ? 256 : 128;
                }
                if (aVar2.t(i & 1, (i & 1169) != 1168)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(201551097, i, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.ComposableSingletons$MusicTrackKt.lambda$201551097.<anonymous> (MusicTrack.kt:120)");
                    }
                    boolean z = chsVar instanceof chs.b;
                    q630.a aVar3 = q630.a.a;
                    if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                        aVar2.K(417082241);
                        fc50.b(txj0.d(aVar3, 1.0f), aVar2, 6);
                        aVar2.j();
                    } else {
                        aVar2.K(44732742);
                        q630 d = txj0.d(aVar3, 1.0f);
                        float f = (float) 0.5d;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a = aqw.a(f, ylu0Var.getImage().a);
                        vjw.a(lg90Var2, null, r18.b(a.a, a.b, d, vog0.b(ya50.b)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 56 | ((i >> 6) & 14), 120);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
