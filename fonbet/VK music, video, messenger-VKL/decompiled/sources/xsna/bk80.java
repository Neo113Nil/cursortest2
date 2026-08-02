package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.ad.ux.AdRedirectView;
import one.video.ad.ux.postview.AdPostView;

/* compiled from: OneVideoAdPostViewBinding.java */
/* loaded from: classes8.dex */
public final class bk80 implements xtt0 {

    @NonNull
    public final AdPostView a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final AdRedirectView c;

    @NonNull
    public final AppCompatTextView d;

    public bk80(@NonNull AdPostView adPostView, @NonNull FrameLayout frameLayout, @NonNull AdRedirectView adRedirectView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = adPostView;
        this.b = frameLayout;
        this.c = adRedirectView;
        this.d = appCompatTextView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
