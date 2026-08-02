package xsna;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.StencilLayout;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class h0l0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ StencilLayout b;

    public h0l0(StencilLayout stencilLayout) {
        this.b = stencilLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        StencilLayout stencilLayout = this.b;
        if (stencilLayout.getMeasuredWidth() == 0 || stencilLayout.getMeasuredHeight() == 0) {
            return;
        }
        Paint paint = new Paint();
        paint.setShader(new RadialGradient(stencilLayout.getMeasuredWidth() / 2.0f, stencilLayout.getMeasuredHeight() / 2.0f, Integer.min(stencilLayout.getMeasuredWidth(), stencilLayout.getMeasuredHeight()) / 2.0f, new int[]{-16777216, 0}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, Shader.TileMode.CLAMP));
        stencilLayout.h = paint;
        stencilLayout.f = true;
        stencilLayout.invalidate();
    }
}
