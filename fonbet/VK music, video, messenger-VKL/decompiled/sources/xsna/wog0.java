package xsna;

import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes.dex */
public final class wog0 extends wuj {
    public final float b = -1.0f;

    @Override // xsna.wuj
    public final void f(@NonNull com.google.android.material.shape.d dVar, float f, float f2) {
        dVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        dVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3, 180.0f, 90.0f);
    }
}
