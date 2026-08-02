package xsna;

import android.view.View;
import com.vk.im.ui.views.BlurredFrameLayout;
import com.vk.im.ui.views.RestrictionVKEnhancedImageView;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class qs30 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ps30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public qs30(ps30 ps30Var, int i, int i2) {
        this.b = ps30Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ps30 ps30Var = this.b;
        BlurredFrameLayout blurredFrameLayout = ps30Var.i;
        if (blurredFrameLayout == null) {
            blurredFrameLayout = null;
        }
        int width = blurredFrameLayout.getWidth();
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView = ps30Var.f;
        if (restrictionVKEnhancedImageView == null) {
            restrictionVKEnhancedImageView = null;
        }
        if (width == restrictionVKEnhancedImageView.getWidth()) {
            BlurredFrameLayout blurredFrameLayout2 = ps30Var.i;
            if (blurredFrameLayout2 == null) {
                blurredFrameLayout2 = null;
            }
            int height = blurredFrameLayout2.getHeight();
            RestrictionVKEnhancedImageView restrictionVKEnhancedImageView2 = ps30Var.f;
            if (restrictionVKEnhancedImageView2 == null) {
                restrictionVKEnhancedImageView2 = null;
            }
            if (height == restrictionVKEnhancedImageView2.getHeight()) {
                RestrictionVKEnhancedImageView restrictionVKEnhancedImageView3 = ps30Var.f;
                RestrictionVKEnhancedImageView restrictionVKEnhancedImageView4 = restrictionVKEnhancedImageView3 != null ? restrictionVKEnhancedImageView3 : null;
                int i9 = this.c;
                int i10 = this.d;
                restrictionVKEnhancedImageView4.Y0(i9, i9, i10, i10);
                return;
            }
        }
        RestrictionVKEnhancedImageView restrictionVKEnhancedImageView5 = ps30Var.f;
        (restrictionVKEnhancedImageView5 != null ? restrictionVKEnhancedImageView5 : null).Y0(0, 0, 0, 0);
    }
}
