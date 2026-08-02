package ru.ok.gl.objects;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class GLFrame extends GLObject {
    private static final float[] vertexArray = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private static final float[] texArray = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f};

    public GLFrame(int i, int i2) {
        super(vertexArray, i, texArray, i2, 2, 5, 4);
    }
}
