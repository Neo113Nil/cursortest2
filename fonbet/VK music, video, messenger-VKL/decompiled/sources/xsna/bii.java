package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bii implements a0t {
    public final /* synthetic */ int b;

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ColorFilter porterDuffColorFilter;
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
                        androidx.compose.runtime.b.f(1700211934, intValue, -1, "com.vk.catalog2.feature.music.holders.ComposableSingletons$MusicDynamicGridItemVhKt.lambda$1700211934.<anonymous> (MusicDynamicGridItemVh.kt:70)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new dh5(14);
                        aVar.R(x);
                    }
                    vjw.a(lg90Var, null, egi0.b(d, false, (izs) x), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 24632 | ((intValue >> 6) & 14), 104);
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
                if ((intValue2 & 384) == 0) {
                    intValue2 |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var2) : aVar2.y(lg90Var2) ? 256 : 128;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-233628240, intValue2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.ComposableSingletons$RecommendedPlaylistCardKt.lambda$-233628240.<anonymous> (RecommendedPlaylistCard.kt:130)");
                    }
                    q630 d2 = txj0.d(q630.a.a, 1.0f);
                    long c = l5g.c(14, l5g.b, 0.15f);
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(c), z42.a(9));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(c), z42.b(9));
                    }
                    r0v0.a(lg90Var2, d2, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(c, 9, porterDuffColorFilter), null, null, aVar2, 3128 | ((intValue2 >> 6) & 14), Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
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
