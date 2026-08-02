package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingRedesignDraggingAnimator.kt */
/* loaded from: classes18.dex */
public class pkc0 {
    public final gzs<s3q0> a;
    public final gzs<s3q0> b;

    static {
        cn70.a();
    }

    public pkc0(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public static List a(View view) {
        return e43.l(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public List<ObjectAnimator> b(View view) {
        return e43.l(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.03f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.03f));
    }

    public List<ObjectAnimator> c(View view) {
        return e43.l(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.8f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.94f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.94f));
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c((View) it.next()));
        }
        f(c5g.v(arrayList2), false);
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((View) it.next()));
        }
        f(c5g.v(arrayList2), false);
    }

    public final void f(Collection<? extends Animator> collection, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addUpdateListener(new l7d(this, 3));
        animatorSet.playTogether(j5g.v0(ofFloat, collection));
        animatorSet.setDuration(100L);
        if (z) {
            d3m.g(animatorSet, new ko00(this, 25));
        }
        animatorSet.start();
    }
}
