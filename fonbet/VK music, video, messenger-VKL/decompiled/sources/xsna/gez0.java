package xsna;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.rotation.RotationProvider;

/* loaded from: classes8.dex */
public final class gez0 implements RotationProvider {
    @Override // ru.ok.android.webrtc.rotation.RotationProvider
    public final float currentRotation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
