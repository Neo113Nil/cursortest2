package xsna;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes13.dex */
public final class kuw {

    @Nullable
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;

    @NonNull
    public final TimeInterpolator d;

    @NonNull
    public final TimeInterpolator e;

    @NonNull
    public final TimeInterpolator f;
    public final Context g;

    @NonNull
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;

    @Nullable
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;

    @Nullable
    public CharSequence p;
    public boolean q;

    @Nullable
    public AppCompatTextView r;

    @Nullable
    public CharSequence s;
    public int t;
    public int u;

    @Nullable
    public ColorStateList v;
    public CharSequence w;
    public boolean x;

    @Nullable
    public AppCompatTextView y;
    public int z;

    /* compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int b;
        public final /* synthetic */ TextView c;
        public final /* synthetic */ int d;
        public final /* synthetic */ TextView e;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.b = i;
            this.c = textView;
            this.d = i2;
            this.e = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i = this.b;
            kuw kuwVar = kuw.this;
            kuwVar.n = i;
            kuwVar.l = null;
            TextView textView = this.c;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.d == 1 && (appCompatTextView = kuwVar.r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.e;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public kuw(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
        this.a = tb30.c(R$attr.motionDurationShort4, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, context);
        this.b = tb30.c(R$attr.motionDurationMedium4, 167, context);
        this.c = tb30.c(R$attr.motionDurationShort4, 167, context);
        this.d = tb30.d(context, R$attr.motionEasingEmphasizedDecelerateInterpolator, rq2.d);
        int i = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = rq2.a;
        this.e = tb30.d(context, i, linearInterpolator);
        this.f = tb30.d(context, R$attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i) {
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
            this.k.addView(appCompatTextView);
        } else {
            this.i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
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
                boolean e = qm10.e(context);
                LinearLayout linearLayout = this.i;
                int i = R$dimen.material_helper_text_font_1_3_padding_horizontal;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                int paddingStart = editText.getPaddingStart();
                if (e) {
                    paddingStart = context.getResources().getDimensionPixelSize(i);
                }
                int i2 = R$dimen.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.material_helper_text_default_padding_top);
                if (e) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                }
                int i3 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (e) {
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

    public final void d(@NonNull ArrayList arrayList, boolean z, @Nullable AppCompatTextView appCompatTextView, int i, int i2, int i3) {
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
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat2.setDuration(this.a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    @Nullable
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

    public final void g(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(@Nullable AppCompatTextView appCompatTextView, @NonNull CharSequence charSequence) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.o == this.n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i2, boolean z) {
        TextView e;
        TextView e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.x, this.y, 2, i, i2);
            d(arrayList, this.q, this.r, 1, i, i2);
            nr2.E(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            this.n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z, false);
        textInputLayout.x();
    }
}
