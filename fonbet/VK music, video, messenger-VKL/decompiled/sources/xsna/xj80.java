package xsna;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.ad.ux.ShoppableAdView;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import one.video.ad.ux.motion.view.OneVideoMotionView;

/* compiled from: OneVideoAdControlsViewBinding.java */
/* loaded from: classes8.dex */
public final class xj80 implements xtt0 {

    @NonNull
    public final OneVideoAdControlsView a;

    @NonNull
    public final ProgressBar b;

    @NonNull
    public final AppCompatTextView c;

    @NonNull
    public final ShoppableAdView d;

    @NonNull
    public final AppCompatTextView e;

    @NonNull
    public final AppCompatTextView f;

    @NonNull
    public final OneVideoMotionView g;

    public xj80(@NonNull OneVideoAdControlsView oneVideoAdControlsView, @NonNull ProgressBar progressBar, @NonNull AppCompatTextView appCompatTextView, @NonNull ShoppableAdView shoppableAdView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull OneVideoMotionView oneVideoMotionView) {
        this.a = oneVideoAdControlsView;
        this.b = progressBar;
        this.c = appCompatTextView;
        this.d = shoppableAdView;
        this.e = appCompatTextView2;
        this.f = appCompatTextView3;
        this.g = oneVideoMotionView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
