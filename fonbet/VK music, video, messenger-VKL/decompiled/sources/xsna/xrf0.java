package xsna;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RelatedAudioCoverShape.kt */
/* loaded from: classes7.dex */
public final class xrf0 implements r5j0 {
    public final float a;
    public final float b;
    public final float c;

    public xrf0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float I0 = azlVar.I0(this.a);
        float I02 = azlVar.I0(this.b);
        float I03 = azlVar.I0(this.c);
        Path path = a.a;
        a.a(I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a.c(intBitsToFloat - I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f = 2;
        float f2 = f * I0;
        float f3 = intBitsToFloat - f2;
        if (a.b == null) {
            a.b = new RectF();
        }
        a.b.set(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, f2);
        path.arcTo(a.b, 270.0f, 90.0f, false);
        float f4 = intBitsToFloat2 - I02;
        float f5 = f * I03;
        a.c(intBitsToFloat, f4 - f5);
        float f6 = intBitsToFloat - f5;
        float f7 = 3 * I03;
        float f8 = f4 - f7;
        float f9 = f4 - I03;
        if (a.b == null) {
            a.b = new RectF();
        }
        a.b.set(f6, f8, intBitsToFloat, f9);
        path.arcTo(a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        float f10 = intBitsToFloat - I02;
        float f11 = f10 - I03;
        float f12 = (intBitsToFloat + I02) - I03;
        float f13 = (I02 + intBitsToFloat2) - I03;
        if (a.b == null) {
            a.b = new RectF();
        }
        a.b.set(f11, f9, f12, f13);
        path.arcTo(a.b, 270.0f, -90.0f, false);
        float f14 = f10 - f7;
        float f15 = intBitsToFloat2 - f5;
        if (a.b == null) {
            a.b = new RectF();
        }
        a.b.set(f14, f15, f11, intBitsToFloat2);
        path.arcTo(a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        a.c(I0, intBitsToFloat2);
        float f16 = intBitsToFloat2 - f2;
        if (a.b == null) {
            a.b = new RectF();
        }
        a.b.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16, f2, intBitsToFloat2);
        path.arcTo(a.b, 90.0f, 90.0f, false);
        a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, I0);
        if (a.b == null) {
            a.b = new RectF();
        }
        a.b.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2);
        path.arcTo(a.b, 180.0f, 90.0f, false);
        a.close();
        return new c.a(a);
    }
}
