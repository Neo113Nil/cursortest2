package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import one.video.ad.ux.ShoppableAdView;
import one.video.ad.ux.ShoppableCardView;

/* compiled from: OneVideoShoppableAdViewBinding.java */
/* loaded from: classes8.dex */
public final class ln80 implements xtt0 {

    @NonNull
    public final ShoppableAdView a;

    @NonNull
    public final ShoppableCardView b;

    @NonNull
    public final ShoppableCardView c;

    public ln80(@NonNull ShoppableAdView shoppableAdView, @NonNull ShoppableCardView shoppableCardView, @NonNull ShoppableCardView shoppableCardView2) {
        this.a = shoppableAdView;
        this.b = shoppableCardView;
        this.c = shoppableCardView2;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
