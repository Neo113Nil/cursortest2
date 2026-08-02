package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.ad.ux.ShoppableCardView;

/* compiled from: OneVideoShoppableCardViewBinding.java */
/* loaded from: classes8.dex */
public final class mn80 implements xtt0 {

    @NonNull
    public final ShoppableCardView a;

    @NonNull
    public final View b;

    @NonNull
    public final AppCompatTextView c;

    @NonNull
    public final AppCompatImageView d;

    @NonNull
    public final AppCompatTextView e;

    @NonNull
    public final AppCompatTextView f;

    public mn80(@NonNull ShoppableCardView shoppableCardView, @NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.a = shoppableCardView;
        this.b = view;
        this.c = appCompatTextView;
        this.d = appCompatImageView;
        this.e = appCompatTextView2;
        this.f = appCompatTextView3;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
