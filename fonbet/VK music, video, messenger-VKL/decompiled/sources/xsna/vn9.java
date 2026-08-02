package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.HorizontalScrollView;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class vn9 extends AnimatorListenerAdapter {
    public final /* synthetic */ HorizontalScrollView b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gzs<s3q0> f;

    public vn9(HorizontalScrollView horizontalScrollView, float f, float f2, boolean z, gzs<s3q0> gzsVar) {
        this.b = horizontalScrollView;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.c;
        HorizontalScrollView horizontalScrollView = this.b;
        horizontalScrollView.setAlpha(f);
        horizontalScrollView.setTranslationY(this.d);
        horizontalScrollView.setVisibility(this.e ? 0 : 8);
        gzs<s3q0> gzsVar = this.f;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
