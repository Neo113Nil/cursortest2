package xsna;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VerticalizationBannerView.kt */
/* loaded from: classes6.dex */
public final class gpr0 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ float[] b;

    public gpr0(int[] iArr, float[] fArr) {
        this.a = iArr;
        this.b = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, this.a, this.b, Shader.TileMode.CLAMP);
    }
}
