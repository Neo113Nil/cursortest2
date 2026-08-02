package xsna;

import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes13.dex */
public final class upk extends wuj {
    public final float b = -1.0f;

    @Override // xsna.wuj
    public final void f(@NonNull com.google.android.material.shape.d dVar, float f, float f2) {
        dVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        dVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * d * d2));
    }
}
