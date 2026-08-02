package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bbi implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ColorFilter porterDuffColorFilter;
        lg90 lg90Var = (lg90) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue = ((Integer) obj5).intValue();
        if ((intValue & 384) == 0) {
            intValue |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
        }
        if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(788418299, intValue, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.ComposableSingletons$ArtistSliderCardKt.lambda$788418299.<anonymous> (ArtistSliderCard.kt:106)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            long c = l5g.c(14, l5g.b, 0.15f);
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(c), z42.a(9));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(c), z42.b(9));
            }
            r0v0.a(lg90Var, d, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(c, 9, porterDuffColorFilter), null, null, aVar, 3128 | ((intValue >> 6) & 14), Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
