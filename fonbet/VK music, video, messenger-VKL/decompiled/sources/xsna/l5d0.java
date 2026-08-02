package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.CarouselRatio;

/* compiled from: PreviewRatioProvider.kt */
/* loaded from: classes4.dex */
public final class l5d0 {
    public final zbc0 a;
    public final boolean b;
    public CarouselRatio c = new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);

    public l5d0(zbc0 zbc0Var, boolean z) {
        this.a = zbc0Var;
        this.b = z;
    }
}
