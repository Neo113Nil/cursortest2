package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import defpackage.sls;

/* loaded from: classes7.dex */
public final class auo implements wp61 {
    public float a;
    public final Object b;
    public Object c;

    public auo(float f) {
        hm61 hm61Var = new hm61();
        ewi ewiVar = new ewi(f);
        this.a = f;
        this.b = hm61Var;
        this.c = ewiVar;
    }

    public void a(float f, final sls slsVar) {
        if (this.a == f) {
            if (slsVar != null) {
                slsVar.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, f);
        ofFloat.setDuration(450L);
        ofFloat.addUpdateListener(new yso(2, this));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.explorer.impl.ui.map.animation.ExplorerLayerAnimator$animateTo$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sls slsVar2 = sls.this;
                if (slsVar2 != null) {
                    slsVar2.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.c = ofFloat;
    }

    @Override // defpackage.wp61
    public hm61 l(int i, int i2) {
        ewi ewiVar = (ewi) this.c;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int round = Math.round(size / ewiVar.a);
            if (mode2 == Integer.MIN_VALUE) {
                round = (int) Math.min(size2, round);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int round2 = Math.round(size2 * ewiVar.a);
            if (mode == Integer.MIN_VALUE) {
                round2 = (int) Math.min(size, round2);
            }
            i = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            float f = size;
            float f2 = size2;
            if (f / f2 > this.a) {
                i = View.MeasureSpec.makeMeasureSpec(Math.round(f2 * ewiVar.a), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int round3 = Math.round(f / ewiVar.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(round3, 1073741824);
                i = makeMeasureSpec;
            }
        }
        hm61 hm61Var = (hm61) this.b;
        hm61Var.a = i;
        hm61Var.b = i2;
        return hm61Var;
    }

    public auo(tls tlsVar) {
        this.b = tlsVar;
    }
}
