package xsna;

import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MarkerEdgeTreatment.java */
/* loaded from: classes13.dex */
public final class ho00 extends ryo {
    public final float b;

    public ho00(float f) {
        this.b = f - 0.001f;
    }

    @Override // xsna.ryo
    public final void b(float f, float f2, float f3, @NonNull com.google.android.material.shape.d dVar) {
        double d = this.b;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(sqrt, 2.0d));
        dVar.e(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        dVar.d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        dVar.d(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
