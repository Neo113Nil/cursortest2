package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.ad.ux.AdRedirectView;

/* compiled from: OneVideoAdRedirectViewBinding.java */
/* loaded from: classes8.dex */
public final class ck80 implements xtt0 {

    @NonNull
    public final AdRedirectView a;

    @NonNull
    public final AppCompatImageView b;

    @NonNull
    public final FrameLayout c;

    @NonNull
    public final ProgressBar d;

    @NonNull
    public final AppCompatTextView e;

    @NonNull
    public final FrameLayout f;

    @NonNull
    public final AppCompatTextView g;

    public ck80(@NonNull AdRedirectView adRedirectView, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar, @NonNull AppCompatTextView appCompatTextView, @NonNull FrameLayout frameLayout2, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = adRedirectView;
        this.b = appCompatImageView;
        this.c = frameLayout;
        this.d = progressBar;
        this.e = appCompatTextView;
        this.f = frameLayout2;
        this.g = appCompatTextView2;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
