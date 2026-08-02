package xsna;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.StencilLayout;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class g0l0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ StencilLayout b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int[] d;

    public g0l0(StencilLayout stencilLayout, float f, int[] iArr) {
        this.b = stencilLayout;
        this.c = f;
        this.d = iArr;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        Paint paint = new Paint();
        paint.setStrokeWidth(this.c);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        StencilLayout stencilLayout = this.b;
        paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, stencilLayout.getMeasuredWidth(), stencilLayout.getMeasuredHeight(), this.d, (float[]) null, Shader.TileMode.CLAMP));
        stencilLayout.g = paint;
        stencilLayout.f = true;
        stencilLayout.invalidate();
    }
}
