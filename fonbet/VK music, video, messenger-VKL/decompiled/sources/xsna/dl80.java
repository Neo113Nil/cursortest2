package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.video.controls.view.faskseek.FastSeekView;

/* compiled from: OneVideoFastSeekViewBinding.java */
/* loaded from: classes8.dex */
public final class dl80 implements xtt0 {

    @NonNull
    public final FastSeekView a;

    @NonNull
    public final View b;

    @NonNull
    public final ConstraintLayout c;

    @NonNull
    public final AppCompatTextView d;

    @NonNull
    public final View e;

    @NonNull
    public final ConstraintLayout f;

    @NonNull
    public final AppCompatTextView g;

    public dl80(@NonNull FastSeekView fastSeekView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull AppCompatImageView appCompatImageView6, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = fastSeekView;
        this.b = view;
        this.c = constraintLayout;
        this.d = appCompatTextView;
        this.e = view2;
        this.f = constraintLayout2;
        this.g = appCompatTextView2;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
