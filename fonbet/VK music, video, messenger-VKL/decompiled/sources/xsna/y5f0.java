package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.f2f0;

/* compiled from: ReactionsOpenAnimator.kt */
/* loaded from: classes18.dex */
public final class y5f0 {
    public static final float h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public final m3r a;
    public final k6f0 b;
    public final x2f0 c;
    public final List<f2f0> d;
    public final float e;
    public final yv6 f;
    public final AnimatorSet g;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        h = -hbh0.a(context, 8.0f);
        i = an10.c(64.0f);
        j = an10.c(21.119999f);
        double d = 106.88f;
        k = an10.c(d);
        l = an10.c(181.12f);
        m = an10.c(d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y5f0(m3r m3rVar, k6f0 k6f0Var, y6f0 y6f0Var, x2f0 x2f0Var, List<? extends f2f0> list) {
        int i2;
        f3r f3rVar;
        this.a = m3rVar;
        this.b = k6f0Var;
        this.c = x2f0Var;
        this.d = list;
        this.e = y6f0Var.b / y6f0Var.c;
        int i3 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setStartDelay(0L);
        ofFloat.setDuration(l);
        ofFloat.setInterpolator(new pkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.w5f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3r m3rVar2 = y5f0.this.a;
                m3rVar2.setPopupScale$design_release((0.57142854f * floatValue) + 0.42857143f);
                m3rVar2.setPopupHeight$design_release(an10.b(((m3rVar2.getDialogHeight$design_release() - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * floatValue) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                m3rVar2.setPopupWidth$design_release(an10.b(((m3rVar2.getDialogWidth$design_release() - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * floatValue) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                m3rVar2.invalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.setStartDelay(0L);
        ofFloat2.setDuration(m);
        ofFloat2.setInterpolator(new LinearInterpolator());
        int i4 = 0;
        ofFloat2.addUpdateListener(new x5f0(this, i4));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat);
        int length = k6f0Var.getReactionViews().length;
        int i5 = 0;
        while (i5 < length) {
            f3r f3rVar2 = (f3r) rl3.S(i5, this.b.getReactionViews());
            if (f3rVar2 == null) {
                i2 = i4;
            } else {
                List<f2f0> list2 = this.d;
                int size = list2.size() - 1;
                long j2 = k;
                long j3 = j;
                if (i5 == size) {
                    List<f2f0> list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((f2f0) it.next()) instanceof f2f0.a) {
                                View reactionsSeparator = this.b.getReactionsSeparator();
                                if (reactionsSeparator != null) {
                                    reactionsSeparator.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    i2 = i4;
                                    f3rVar = f3rVar2;
                                    ofFloat3.setStartDelay(i5 * j3);
                                    ofFloat3.setDuration(j2);
                                    ofFloat3.addUpdateListener(new hl7(reactionsSeparator, 3));
                                    arrayList.add(ofFloat3);
                                    arrayList.add(a(i5, reactionsSeparator));
                                }
                            }
                        }
                    }
                }
                i2 = i4;
                f3rVar = f3rVar2;
                float f = this.e;
                float[] fArr = new float[2];
                fArr[i2] = 0.0f;
                fArr[1] = f;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr);
                ofFloat4.setStartDelay(i5 * j3);
                ofFloat4.setDuration(j2);
                ofFloat4.setInterpolator(new pkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f));
                f3r f3rVar3 = f3rVar;
                ofFloat4.addUpdateListener(new sda0(f3rVar3, i3));
                arrayList.add(ofFloat4);
                arrayList.add(a(i5, f3rVar3));
            }
            i5++;
            i4 = i2;
        }
        this.f = new yv6(this, 6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.g = animatorSet;
    }

    public static ValueAnimator a(int i2, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setStartDelay((j * i2) + i);
        ofFloat.setDuration(k);
        ofFloat.setInterpolator(new pkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f));
        ofFloat.addUpdateListener(new frb(view, 2));
        return ofFloat;
    }
}
