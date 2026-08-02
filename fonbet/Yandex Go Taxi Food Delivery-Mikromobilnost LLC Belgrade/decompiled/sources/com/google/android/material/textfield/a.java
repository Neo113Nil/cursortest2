package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;
import defpackage.bk;
import defpackage.ci8;
import defpackage.cxg0;
import defpackage.eng0;
import defpackage.kp50;
import defpackage.kxh0;
import defpackage.mj2;
import defpackage.v4a;

/* loaded from: classes11.dex */
public final class a extends g {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final ci8 j;
    public final bk k;
    public AnimatorSet l;
    public ValueAnimator m;

    public a(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.j = new ci8(9, this);
        this.k = new bk(8, this);
        this.e = kp50.O(endCompoundLayout.getContext(), eng0.motionDurationShort3, 100);
        this.f = kp50.O(endCompoundLayout.getContext(), eng0.motionDurationShort3, 150);
        this.g = kp50.P(endCompoundLayout.getContext(), eng0.motionEasingLinearInterpolator, mj2.a);
        this.h = kp50.P(endCompoundLayout.getContext(), eng0.motionEasingEmphasizedInterpolator, mj2.d);
    }

    @Override // com.google.android.material.textfield.g
    public final void a() {
        if (this.b.getSuffixText() != null) {
            return;
        }
        s(t());
    }

    @Override // com.google.android.material.textfield.g
    public final int c() {
        return kxh0.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.g
    public final int d() {
        return cxg0.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.g
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.g
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.g
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.g
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // com.google.android.material.textfield.g
    public final void o(boolean z) {
        if (this.b.getSuffixText() == null) {
            return;
        }
        s(z);
    }

    @Override // com.google.android.material.textfield.g
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j1c
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        aVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = aVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j1c
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = aVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.b.setEndIconVisible(true);
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j1c
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = aVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.b.setEndIconVisible(false);
            }
        });
    }

    @Override // com.google.android.material.textfield.g
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new v4a(13, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.isEndIconVisible() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.d.hasFocus()) && ((this.i.getText().length() > 0) || (this.b.getSuffixText() != null));
    }
}
