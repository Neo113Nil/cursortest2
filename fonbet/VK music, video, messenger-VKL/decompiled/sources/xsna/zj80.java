package xsna;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.ad.ux.AdRedirectView;
import one.video.ad.ux.ShoppableAdView;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import one.video.ad.ux.motion.view.OneVideoMotionView;
import one.video.ad.ux.postview.AdPostView;

/* compiled from: OneVideoAdControlsViewNewBinding.java */
/* loaded from: classes8.dex */
public final class zj80 implements xtt0 {

    @NonNull
    public final OneVideoAdControlsViewNew a;

    @NonNull
    public final AdPostView b;

    @NonNull
    public final AppCompatImageView c;

    @NonNull
    public final AppCompatTextView d;

    @NonNull
    public final ProgressBar e;

    @NonNull
    public final AdRedirectView f;

    @NonNull
    public final ShoppableAdView g;

    @NonNull
    public final AppCompatTextView h;

    @NonNull
    public final AppCompatTextView i;

    @NonNull
    public final OneVideoMotionView j;

    public zj80(@NonNull OneVideoAdControlsViewNew oneVideoAdControlsViewNew, @NonNull AdPostView adPostView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ProgressBar progressBar, @NonNull AdRedirectView adRedirectView, @NonNull ShoppableAdView shoppableAdView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull OneVideoMotionView oneVideoMotionView) {
        this.a = oneVideoAdControlsViewNew;
        this.b = adPostView;
        this.c = appCompatImageView;
        this.d = appCompatTextView;
        this.e = progressBar;
        this.f = adRedirectView;
        this.g = shoppableAdView;
        this.h = appCompatTextView2;
        this.i = appCompatTextView3;
        this.j = oneVideoMotionView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
