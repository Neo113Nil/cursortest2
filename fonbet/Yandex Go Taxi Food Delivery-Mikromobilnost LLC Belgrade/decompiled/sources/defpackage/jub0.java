package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import com.yandex.go.pin.api.v1.AnimatedParams$Index;
import com.yandex.go.pin.api.v1.BasePinView;
import defpackage.itb0;
import defpackage.jub0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class jub0 {
    public final fvb1 a;
    public final nf2 b;
    public AnimatorSet c;

    public jub0(fvb1 fvb1Var, nf2 nf2Var) {
        this.a = fvb1Var;
        this.b = nf2Var;
    }

    public final void a(ArrayList arrayList, mf2 mf2Var) {
        ValueAnimator ofFloat;
        float[] fArr = mf2Var.c;
        float[] fArr2 = mf2Var.b;
        if (fArr == null) {
            ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr2, fArr2.length));
        } else {
            if (fArr.length != fArr2.length) {
                ny61.r("values and fractions have different length");
                return;
            }
            int length = fArr2.length;
            Keyframe[] keyframeArr = new Keyframe[length];
            for (int i = 0; i < length; i++) {
                keyframeArr[i] = Keyframe.ofFloat(fArr[i], mf2Var.b[i]);
            }
            ofFloat = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe((String) null, (Keyframe[]) Arrays.copyOf(keyframeArr, length)));
        }
        ofFloat.addUpdateListener(new vf2(8, this, mf2Var));
        ofFloat.setDuration(mf2Var.e);
        ofFloat.setInterpolator(mf2Var.d);
        if (!mf2Var.f) {
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
        }
        arrayList.add(ofFloat);
    }

    public final void b(nf2 nf2Var, nf2 nf2Var2, final boolean z) {
        itb0 itb0Var;
        itb0 itb0Var2;
        int i;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size = AnimatedParams$Index.a().size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            mf2 mf2Var = this.b.a[i3];
            mf2 mf2Var2 = nf2Var2.a[i3];
            float f = mf2Var.b[i2];
            float[] fArr2 = mf2Var2.b;
            if (f == fArr2[i2]) {
                i = i2;
            } else {
                mf2 mf2Var3 = nf2Var.a[i3];
                float[] fArr3 = mf2Var3.b;
                i = i2;
                if (fArr3.length == 0) {
                    fArr = new float[2];
                    fArr[i] = f;
                    fArr[1] = fArr2[i];
                } else {
                    int length = fArr3.length;
                    float[] fArr4 = new float[length + 2];
                    fArr4[i] = f;
                    fArr4[length + 1] = fArr2[i];
                    System.arraycopy(fArr3, i, fArr4, 1, fArr3.length);
                    fArr = fArr4;
                }
                if (mf2Var3.e > 0) {
                    mf2Var3.b = fArr;
                    a(arrayList, mf2Var3);
                } else {
                    mf2Var.b[i] = mf2Var2.b[i];
                }
            }
            if (mf2Var2.b.length > 1) {
                a(arrayList2, mf2Var2);
            }
            i3++;
            i2 = i;
        }
        boolean isEmpty = arrayList.isEmpty();
        fvb1 fvb1Var = this.a;
        if (!isEmpty) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.pin.api.v1.PinAnimator$animateChanges$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    itb0 itb0Var3;
                    itb0 itb0Var4;
                    animation.removeAllListeners();
                    jub0.this.getClass();
                    itb0Var3 = ((BasePinView) jub0.this.a.a).animationCallback;
                    itb0Var3.v6();
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    jub0 jub0Var = jub0.this;
                    List<Animator> list = arrayList2;
                    boolean z2 = z;
                    jub0Var.getClass();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(list);
                    if (z2) {
                        animatorSet2.start();
                    }
                    BasePinView basePinView = (BasePinView) jub0Var.a.a;
                    itb0Var4 = basePinView.animationCallback;
                    itb0Var4.getClass();
                    basePinView.postInvalidateOnAnimation();
                    jub0Var.d();
                    jub0Var.c = animatorSet2;
                }
            });
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            BasePinView basePinView = (BasePinView) fvb1Var.a;
            itb0Var2 = basePinView.animationCallback;
            itb0Var2.getClass();
            basePinView.postInvalidateOnAnimation();
            d();
            this.c = animatorSet;
            return;
        }
        if (arrayList2.isEmpty()) {
            d();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList2);
        if (z) {
            animatorSet2.start();
        }
        BasePinView basePinView2 = (BasePinView) fvb1Var.a;
        itb0Var = basePinView2.animationCallback;
        itb0Var.getClass();
        basePinView2.postInvalidateOnAnimation();
        d();
        this.c = animatorSet2;
    }

    public final float c(AnimatedParams$Index animatedParams$Index) {
        return this.b.a[animatedParams$Index.ordinal()].b[0];
    }

    public final void d() {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            if (animatorSet.isStarted()) {
                animatorSet.cancel();
            }
            this.c = null;
        }
    }
}
