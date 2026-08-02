package ru.ok.android.webrtc.rotation;

import com.unity3d.services.UnityAdsConstants;
import xsna.gez0;

/* loaded from: classes9.dex */
public interface RotationProvider {
    public static final RotationProvider DISABLED = new gez0();

    default float currentRotation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
