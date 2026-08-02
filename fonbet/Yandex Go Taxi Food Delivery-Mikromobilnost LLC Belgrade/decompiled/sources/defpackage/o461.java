package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ImageViewWithAspectRatio;
import com.ybsdk.widgets.common.banners.CloseBannerButtonView;

/* loaded from: classes4.dex */
public final class o461 implements zo31 {
    public final ConstraintLayout a;
    public final CloseBannerButtonView b;

    public o461(ConstraintLayout constraintLayout, CloseBannerButtonView closeBannerButtonView, ImageViewWithAspectRatio imageViewWithAspectRatio, TextView textView) {
        this.a = constraintLayout;
        this.b = closeBannerButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
