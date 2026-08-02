package xsna;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: InterestingStoriesBlockItemHolderView.kt */
/* loaded from: classes4.dex */
public final class bex extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ float[] b;

    public bex(int[] iArr, float[] fArr) {
        this.a = iArr;
        this.b = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, this.a, this.b, Shader.TileMode.CLAMP);
    }
}
