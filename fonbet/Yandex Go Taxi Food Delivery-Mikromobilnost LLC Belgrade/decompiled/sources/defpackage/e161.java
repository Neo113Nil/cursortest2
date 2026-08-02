package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.educations.internal.ui.ShadowView;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;

/* loaded from: classes3.dex */
public final class e161 implements zo31 {
    public final DivEducationsV2View a;
    public final AppCompatImageButton b;
    public final YbDivView c;
    public final ShadowView d;
    public final AppCompatImageView e;
    public final FrameLayout f;
    public final YbDivView g;

    public e161(DivEducationsV2View divEducationsV2View, AppCompatImageButton appCompatImageButton, YbDivView ybDivView, ShadowView shadowView, AppCompatImageView appCompatImageView, FrameLayout frameLayout, YbDivView ybDivView2) {
        this.a = divEducationsV2View;
        this.b = appCompatImageButton;
        this.c = ybDivView;
        this.d = shadowView;
        this.e = appCompatImageView;
        this.f = frameLayout;
        this.g = ybDivView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
