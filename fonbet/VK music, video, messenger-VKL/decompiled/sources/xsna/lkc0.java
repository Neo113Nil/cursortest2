package xsna;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: PostingRedesignCarouselDraggingAnimator.kt */
/* loaded from: classes4.dex */
public final class lkc0 extends okc0 {
    public static final float i = cn70.a() * 8.0f;
    public static final float j = cn70.a() * 10.0f;
    public final ndc0 h;

    public lkc0(float f, float f2, m2g m2gVar, dnh dnhVar, p5h p5hVar, ndc0 ndc0Var) {
        super(f, f2, m2gVar, dnhVar, p5hVar);
        this.h = ndc0Var;
    }

    @Override // xsna.okc0
    public final float f() {
        return this.h.a ? j : i;
    }

    @Override // xsna.okc0
    public final List<ValueAnimator> h(View view) {
        return j5g.V(rl3.y0(new ValueAnimator[]{ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.94f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.94f), e(view, true), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.75f)}));
    }

    @Override // xsna.okc0
    public final List<ValueAnimator> i(View view) {
        return j5g.V(Collections.singleton(e(view, true)));
    }
}
