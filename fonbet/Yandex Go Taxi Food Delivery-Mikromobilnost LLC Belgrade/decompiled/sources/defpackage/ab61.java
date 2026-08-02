package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import com.ybsdk.widgets.common.YbSdkScalableTextView;

/* loaded from: classes3.dex */
public final class ab61 implements zo31 {
    public final SavingsCardView a;
    public final YbSdkScalableTextView b;
    public final TextView c;
    public final YbDivView d;
    public final TextView e;
    public final ImageViewWithCustomScaleTypes f;
    public final AppCompatImageView g;
    public final TextView h;
    public final ConstraintLayout i;
    public final SpoilerFrameLayout j;
    public final TextView k;
    public final SpoilerTextView l;

    public ab61(SavingsCardView savingsCardView, YbSdkScalableTextView ybSdkScalableTextView, TextView textView, YbDivView ybDivView, TextView textView2, ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes, AppCompatImageView appCompatImageView, TextView textView3, ConstraintLayout constraintLayout, SpoilerFrameLayout spoilerFrameLayout, TextView textView4, SpoilerTextView spoilerTextView) {
        this.a = savingsCardView;
        this.b = ybSdkScalableTextView;
        this.c = textView;
        this.d = ybDivView;
        this.e = textView2;
        this.f = imageViewWithCustomScaleTypes;
        this.g = appCompatImageView;
        this.h = textView3;
        this.i = constraintLayout;
        this.j = spoilerFrameLayout;
        this.k = textView4;
        this.l = spoilerTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
