package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.ror;

/* compiled from: PostingRedesignDraggingAnimator.kt */
/* loaded from: classes4.dex */
public class okc0 implements kho {
    public static final float g = cn70.a() * 8.0f;
    public final float b;
    public final float c;
    public final gzs<cvj> d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;

    /* JADX WARN: Multi-variable type inference failed */
    public okc0(float f, float f2, gzs<? extends cvj> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        this.b = f;
        this.c = f2;
        this.d = gzsVar;
        this.e = gzsVar2;
        this.f = gzsVar3;
    }

    @Override // xsna.kho
    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(i((View) it.next()));
        }
        j(c5g.v(arrayList2), false);
    }

    @Override // xsna.kho
    public final void b(View view) {
        j(g(view), true);
    }

    @Override // xsna.kho
    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(g((View) it.next()));
        }
        j(c5g.v(arrayList2), false);
    }

    @Override // xsna.kho
    public final void d(View view) {
        j(h(view), false);
    }

    public final ValueAnimator e(final View view, final boolean z) {
        a6t a6tVar;
        uzt0 uzt0Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ror.c cVar = layoutParams instanceof ror.c ? (ror.c) layoutParams : null;
        if (cVar == null || (a6tVar = cVar.a) == null || (uzt0Var = a6tVar.a) == null) {
            return null;
        }
        boolean z2 = uzt0Var.a;
        float f = this.b;
        float f2 = this.c;
        final float f3 = z2 ? f2 : f;
        final float f4 = uzt0Var.b ? f2 : f;
        final float f5 = uzt0Var.d ? f2 : f;
        final float f6 = uzt0Var.c ? f2 : f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.nkc0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f7;
                float f8;
                float f9;
                float f10;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = 1.0f - floatValue;
                boolean z3 = z;
                float f12 = f3;
                okc0 okc0Var = this;
                float f13 = f4;
                float f14 = f6;
                float f15 = f5;
                if (z3) {
                    f7 = (okc0Var.f() * f11) + (f12 * floatValue);
                    f8 = (okc0Var.f() * f11) + (f13 * floatValue);
                    f9 = (okc0Var.f() * f11) + (f14 * floatValue);
                    f10 = (okc0Var.f() * f11) + (f15 * floatValue);
                } else {
                    f7 = (okc0Var.f() * floatValue) + (f12 * f11);
                    f8 = (okc0Var.f() * floatValue) + (f13 * f11);
                    f9 = (okc0Var.f() * floatValue) + (f14 * f11);
                    f10 = (f15 * f11) + (okc0Var.f() * floatValue);
                }
                okc0Var.d.invoke().d(view, f7, f8, f9, f10, null);
            }
        });
        return ofFloat;
    }

    public float f() {
        return g;
    }

    public final List<ValueAnimator> g(View view) {
        return j5g.V(rl3.y0(new ValueAnimator[]{ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f), e(view, false), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)}));
    }

    public List<ValueAnimator> h(View view) {
        return j5g.V(rl3.y0(new ValueAnimator[]{ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.03f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.03f), e(view, true)}));
    }

    public List<ValueAnimator> i(View view) {
        return j5g.V(rl3.y0(new ValueAnimator[]{ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.8f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.94f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.94f), e(view, true)}));
    }

    public final void j(Collection<? extends Animator> collection, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addUpdateListener(new lrb0(this, 2));
        animatorSet.playTogether(j5g.v0(ofFloat, collection));
        animatorSet.setDuration(100L);
        if (z) {
            d3m.g(animatorSet, new wt30(this, 10));
        }
        animatorSet.start();
    }
}
