package xsna;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h8h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ i8h b;
    public final /* synthetic */ w8h c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;

    public /* synthetic */ h8h(i8h i8hVar, w8h w8hVar, View view, View view2) {
        this.b = i8hVar;
        this.c = w8hVar;
        this.d = view;
        this.e = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.b(this.c, this.d, this.e, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
