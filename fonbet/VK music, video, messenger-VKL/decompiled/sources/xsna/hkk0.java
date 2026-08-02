package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.seek.WheelSeekView;

/* compiled from: SpeedValueMapper.kt */
/* loaded from: classes16.dex */
public final class hkk0 implements WheelSeekView.a {

    /* compiled from: SpeedValueMapper.kt */
    public static final class a {
        public static Float a(float f) {
            if (f >= 0.1f && f < 1.0f) {
                return Float.valueOf(f / 4);
            }
            if (f >= 1.0f && f < 2.0f) {
                return Float.valueOf(f / 4);
            }
            if (f >= 2.0f && f < 5.0f) {
                return Float.valueOf((((f - 2.0f) / 3.0f) * 0.25f) + 0.5f);
            }
            if (5.0f > f || f > 10.0f) {
                return null;
            }
            return Float.valueOf((((f - 5.0f) / 5.0f) * 0.25f) + 0.75f);
        }
    }

    @Override // com.vk.clips.design.view.seek.WheelSeekView.a
    public final float a(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 0.25f) {
            return (f < 0.25f || f >= 0.5f) ? (f < 0.5f || f >= 0.75f) ? (0.75f > f || f > 1.0f) ? f : (((f - 0.75f) / 0.25f) * 5.0f) + 5.0f : (((f - 0.5f) / 0.25f) * 3.0f) + 2.0f : f * 4;
        }
        float f2 = f * 4;
        if (f2 < 0.1f) {
            return 0.1f;
        }
        return f2;
    }
}
