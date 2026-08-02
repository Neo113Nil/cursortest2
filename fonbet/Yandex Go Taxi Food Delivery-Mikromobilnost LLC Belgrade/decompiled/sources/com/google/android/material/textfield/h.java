package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.ck2;
import defpackage.eng0;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.org0;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class h {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public AppCompatTextView y;
    public int z;

    public h(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(org0.design_textinput_caption_translate_y);
        this.a = kp50.O(context, eng0.motionDurationShort4, 217);
        this.b = kp50.O(context, eng0.motionDurationMedium4, 167);
        this.c = kp50.O(context, eng0.motionDurationShort4, 167);
        this.d = kp50.P(context, eng0.motionEasingEmphasizedDecelerateInterpolator, mj2.d);
        int i = eng0.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = mj2.a;
        this.e = kp50.P(context, i, linearInterpolator);
        this.f = kp50.P(context, eng0.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i) {
        if (this.i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean z = jx81.z(context);
                LinearLayout linearLayout = this.i;
                int i = org0.material_helper_text_font_1_3_padding_horizontal;
                int paddingStart = editText.getPaddingStart();
                if (z) {
                    paddingStart = context.getResources().getDimensionPixelSize(i);
                }
                int i2 = org0.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(org0.material_helper_text_default_padding_top);
                if (z) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                }
                int i3 = org0.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (z) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i3);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.c;
            ofFloat.setDuration(z2 ? this.b : i4);
            ofFloat.setInterpolator(z2 ? this.e : this.f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
            ofFloat2.setDuration(this.a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.r;
        }
        if (i != 2) {
            return null;
        }
        return this.y;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        i(this.n, this.o, h(this.r, ""));
    }

    public final void g(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.o == this.n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(final int i, final int i2, boolean z) {
        final h hVar;
        TextView e;
        TextView e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            hVar = this;
            hVar.d(arrayList, this.x, this.y, 2, i, i2);
            hVar.d(arrayList, hVar.q, hVar.r, 1, i, i2);
            ck2.a(animatorSet, arrayList);
            final TextView e3 = hVar.e(i);
            final TextView e4 = hVar.e(i2);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AppCompatTextView appCompatTextView;
                    h hVar2 = h.this;
                    hVar2.n = i2;
                    hVar2.l = null;
                    TextView textView = e3;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i == 1 && (appCompatTextView = h.this.r) != null) {
                            appCompatTextView.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = e4;
                    if (textView2 != null) {
                        textView2.setTranslationY(0.0f);
                        e4.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TextView textView = e4;
                    if (textView != null) {
                        textView.setVisibility(0);
                        e4.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else {
            hVar = this;
            if (i != i2) {
                if (i2 != 0 && (e2 = hVar.e(i2)) != null) {
                    e2.setVisibility(0);
                    e2.setAlpha(1.0f);
                }
                if (i != 0 && (e = hVar.e(i)) != null) {
                    e.setVisibility(4);
                    if (i == 1) {
                        e.setText((CharSequence) null);
                    }
                }
                hVar.n = i2;
            }
        }
        TextInputLayout textInputLayout = hVar.h;
        textInputLayout.updateEditTextBackground();
        textInputLayout.updateLabelState(z);
        textInputLayout.updateTextInputBoxState();
    }
}
