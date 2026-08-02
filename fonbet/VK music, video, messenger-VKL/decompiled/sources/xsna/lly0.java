package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class lly0 extends ViewGroup {
    public final TextView b;
    public final kdy0 c;
    public final TextView d;
    public final LinearLayout e;
    public final qpk0 f;
    public final TextView g;
    public final TextView h;
    public final Button i;
    public final whz0 j;
    public final c1z0 k;
    public final s8z0 l;
    public final int m;
    public final int n;
    public final int o;
    public z9z0 p;
    public boolean q;

    public lly0(Context context, c1z0 c1z0Var) {
        super(context);
        this.l = new s8z0(new gwn0(this, 13));
        this.p = new y9z0();
        this.q = false;
        this.k = c1z0Var;
        Button button = new Button(context);
        this.i = button;
        c1z0.n(button, "cta_button");
        whz0 whz0Var = new whz0(context);
        this.j = whz0Var;
        c1z0.n(whz0Var, "icon_image");
        this.c = new kdy0(context);
        TextView textView = new TextView(context);
        this.b = textView;
        c1z0.n(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.d = textView2;
        c1z0.n(textView2, "disclaimer_text");
        this.e = new LinearLayout(context);
        qpk0 qpk0Var = new qpk0(context);
        this.f = qpk0Var;
        c1z0.n(qpk0Var, "stars_view");
        TextView textView3 = new TextView(context);
        this.g = textView3;
        c1z0.n(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.h = textView4;
        c1z0.n(textView4, "domain_text");
        this.m = c1z0Var.b(16);
        this.o = c1z0Var.b(8);
        this.n = c1z0Var.b(64);
    }

    public final void a(int i, View... viewArr) {
        whz0 whz0Var = this.j;
        int height = whz0Var.getHeight();
        int height2 = getHeight();
        Button button = this.i;
        int width = button.getWidth();
        int height3 = button.getHeight();
        int width2 = whz0Var.getWidth();
        whz0Var.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        whz0Var.setPivotY(height / 2.0f);
        button.setPivotX(width);
        button.setPivotY(height3 / 2.0f);
        float f = height2 * 0.3f;
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 0.7f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property2, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(whz0Var, (Property<whz0, Float>) property, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(whz0Var, (Property<whz0, Float>) property2, 0.7f));
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        TextView textView = this.b;
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr));
        float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        TextView textView2 = this.d;
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
        LinearLayout linearLayout = this.e;
        if (linearLayout.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property3, 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<lly0, Float>) property3, 0.6f));
        float f2 = -(width2 * 0.3f);
        kdy0 kdy0Var = this.c;
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(kdy0Var, (Property<kdy0, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property4, f2));
        TextView textView3 = this.h;
        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, f2));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<lly0, Float>) property5, f));
        float f3 = (-f) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property5, f3));
        arrayList.add(ObjectAnimator.ofFloat(whz0Var, (Property<whz0, Float>) property5, f3));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property5, f));
        }
        if (linearLayout.isEnabled()) {
            linearLayout.setVisibility(0);
        }
        if (textView3.isEnabled()) {
            textView3.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(i);
        animatorSet.start();
    }

    public final void b(k6z0 k6z0Var, bj50 bj50Var) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        boolean z = k6z0Var.j;
        boolean z2 = k6z0Var.f;
        boolean z3 = k6z0Var.e;
        boolean z4 = k6z0Var.b;
        boolean z5 = k6z0Var.c;
        boolean z6 = k6z0Var.h;
        boolean z7 = k6z0Var.a;
        boolean z8 = k6z0Var.l;
        boolean z9 = k6z0Var.m;
        boolean z10 = k6z0Var.g;
        boolean z11 = this.q;
        TextView textView = this.h;
        TextView textView2 = this.g;
        qpk0 qpk0Var = this.f;
        TextView textView3 = this.b;
        whz0 whz0Var = this.j;
        kdy0 kdy0Var = this.c;
        Button button = this.i;
        if (!z11) {
            l38 l38Var = new l38(3, this, bj50Var);
            if (z9) {
                setOnClickListener(l38Var);
                button.setOnClickListener(l38Var);
                return;
            }
            if (z10) {
                button.setOnClickListener(l38Var);
            } else {
                button.setEnabled(false);
            }
            if (z8) {
                setOnClickListener(l38Var);
                onClickListener = null;
            } else {
                onClickListener = null;
                setOnClickListener(null);
            }
            if (z7) {
                kdy0Var.getLeftText().setOnClickListener(l38Var);
            } else {
                kdy0Var.getLeftText().setOnClickListener(onClickListener);
            }
            if (z6) {
                kdy0Var.getRightBorderedView().setOnClickListener(l38Var);
            } else {
                kdy0Var.getRightBorderedView().setOnClickListener(onClickListener);
            }
            if (z5) {
                whz0Var.setOnClickListener(l38Var);
            } else {
                whz0Var.setOnClickListener(onClickListener);
            }
            if (z4) {
                textView3.setOnClickListener(l38Var);
            } else {
                textView3.setOnClickListener(onClickListener);
            }
            if (z3) {
                qpk0Var.setOnClickListener(l38Var);
            } else {
                qpk0Var.setOnClickListener(onClickListener);
            }
            if (z2) {
                textView2.setOnClickListener(l38Var);
            } else {
                textView2.setOnClickListener(onClickListener);
            }
            if (z) {
                textView.setOnClickListener(l38Var);
                return;
            } else {
                textView.setOnClickListener(onClickListener);
                return;
            }
        }
        dd20 dd20Var = new dd20(1, this, bj50Var);
        s8z0 s8z0Var = this.l;
        setOnTouchListener(s8z0Var);
        button.setOnTouchListener(s8z0Var);
        kdy0Var.getLeftText().setOnTouchListener(s8z0Var);
        kdy0Var.getRightBorderedView().setOnTouchListener(s8z0Var);
        whz0Var.setOnTouchListener(s8z0Var);
        textView3.setOnTouchListener(s8z0Var);
        qpk0Var.setOnTouchListener(s8z0Var);
        textView2.setOnTouchListener(s8z0Var);
        textView.setOnTouchListener(s8z0Var);
        if (z10 || z9) {
            button.setOnClickListener(dd20Var);
        } else {
            button.setEnabled(false);
        }
        if (z8 || z9) {
            onClickListener2 = null;
            setOnClickListener(dd20Var);
        } else {
            onClickListener2 = null;
            setOnClickListener(null);
        }
        if (z7 || z9) {
            kdy0Var.getLeftText().setOnClickListener(dd20Var);
        } else {
            kdy0Var.getLeftText().setOnClickListener(onClickListener2);
        }
        if (z6 || z9) {
            kdy0Var.getRightBorderedView().setOnClickListener(dd20Var);
        } else {
            kdy0Var.getRightBorderedView().setOnClickListener(onClickListener2);
        }
        if (z5 || z9) {
            whz0Var.setOnClickListener(dd20Var);
        } else {
            whz0Var.setOnClickListener(onClickListener2);
        }
        if (z4 || z9) {
            textView3.setOnClickListener(dd20Var);
        } else {
            textView3.setOnClickListener(onClickListener2);
        }
        if (z3 || z9) {
            qpk0Var.setOnClickListener(dd20Var);
        } else {
            qpk0Var.setOnClickListener(onClickListener2);
        }
        if (z2 || z9) {
            textView2.setOnClickListener(dd20Var);
        } else {
            textView2.setOnClickListener(onClickListener2);
        }
        if (z || z9) {
            textView.setOnClickListener(dd20Var);
        } else {
            textView.setOnClickListener(onClickListener2);
        }
    }

    public final void c(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Button button = this.i;
        Property property = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 1.0f));
        Property property2 = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property2, 1.0f));
        whz0 whz0Var = this.j;
        arrayList.add(ObjectAnimator.ofFloat(whz0Var, (Property<whz0, Float>) property, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(whz0Var, (Property<whz0, Float>) property2, 1.0f));
        TextView textView = this.b;
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f));
        TextView textView2 = this.d;
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
        LinearLayout linearLayout = this.e;
        if (linearLayout.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<lly0, Float>) property3, 1.0f));
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        kdy0 kdy0Var = this.c;
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(kdy0Var, (Property<kdy0, Float>) property4, fArr));
        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<TextView, Float>) property4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<lly0, Float>) property5, fArr2));
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(whz0Var, (Property<whz0, Float>) property5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        if (!TextUtils.isEmpty(textView2.getText().toString())) {
            textView2.setVisibility(0);
        }
        textView.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new mly0(this));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        whz0 whz0Var = this.j;
        int measuredHeight2 = whz0Var.getMeasuredHeight();
        int measuredWidth2 = whz0Var.getMeasuredWidth();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        int i6 = this.m;
        whz0Var.layout(i6, i5, i6 + measuredWidth2, measuredHeight2 + i5);
        Button button = this.i;
        int measuredWidth3 = button.getMeasuredWidth();
        int measuredHeight3 = button.getMeasuredHeight();
        int i7 = (measuredHeight - measuredHeight3) / 2;
        button.layout((measuredWidth - measuredWidth3) - i6, i7, measuredWidth - i6, measuredHeight3 + i7);
        int i8 = measuredWidth2 + i6 + i6;
        kdy0 kdy0Var = this.c;
        int measuredWidth4 = kdy0Var.getMeasuredWidth() + i8;
        int measuredHeight4 = kdy0Var.getMeasuredHeight();
        int i9 = this.o;
        kdy0Var.layout(i8, i9, measuredWidth4, measuredHeight4 + i9);
        int bottom = kdy0Var.getBottom();
        LinearLayout linearLayout = this.e;
        linearLayout.layout(i8, bottom, linearLayout.getMeasuredWidth() + i8, linearLayout.getMeasuredHeight() + kdy0Var.getBottom());
        int bottom2 = kdy0Var.getBottom();
        TextView textView = this.h;
        textView.layout(i8, bottom2, textView.getMeasuredWidth() + i8, textView.getMeasuredHeight() + kdy0Var.getBottom());
        int bottom3 = kdy0Var.getBottom();
        TextView textView2 = this.b;
        textView2.layout(i8, bottom3, textView2.getMeasuredWidth() + i8, textView2.getMeasuredHeight() + kdy0Var.getBottom());
        int bottom4 = textView2.getBottom();
        TextView textView3 = this.d;
        textView3.layout(i8, bottom4, textView3.getMeasuredWidth() + i8, textView3.getMeasuredHeight() + textView2.getBottom());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2) / 4;
        int i3 = this.m;
        int i4 = size - (i3 * 2);
        int i5 = this.o;
        int i6 = size2 - (i5 * 2);
        int min = Math.min(i6, this.n);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        whz0 whz0Var = this.j;
        whz0Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(min - (i5 * 2), 1073741824);
        Button button = this.i;
        button.measure(makeMeasureSpec3, makeMeasureSpec4);
        int measuredWidth = ((i4 - whz0Var.getMeasuredWidth()) - button.getMeasuredWidth()) - (i3 * 2);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        kdy0 kdy0Var = this.c;
        kdy0Var.measure(makeMeasureSpec5, makeMeasureSpec6);
        int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int makeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.e;
        linearLayout.measure(makeMeasureSpec7, makeMeasureSpec8);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        int makeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int makeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(i6 - kdy0Var.getMeasuredHeight(), Integer.MIN_VALUE);
        TextView textView = this.b;
        textView.measure(makeMeasureSpec9, makeMeasureSpec10);
        int makeMeasureSpec11 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int makeMeasureSpec12 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        TextView textView2 = this.d;
        textView2.measure(makeMeasureSpec11, makeMeasureSpec12);
        int max = (i5 * 2) + Math.max(textView.getMeasuredHeight(), linearLayout.getMeasuredHeight()) + kdy0Var.getMeasuredHeight();
        if (textView2.getVisibility() == 0) {
            max += textView2.getMeasuredHeight();
        }
        setMeasuredDimension(size, (i5 * 2) + Math.max(button.getMeasuredHeight(), Math.max(whz0Var.getMeasuredHeight(), max)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r2.equals("webform") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBanner(@NonNull tez0 tez0Var) {
        kdy0 kdy0Var = this.c;
        kdy0Var.getLeftText().setText(tez0Var.f);
        this.b.setText(tez0Var.c);
        String str = tez0Var.g;
        this.q = tez0Var.T.c;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.d;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        kiw kiwVar = tez0Var.u;
        whz0 whz0Var = this.j;
        if (kiwVar != null) {
            whz0Var.setVisibility(0);
            whz0Var.setImageData(kiwVar);
        } else {
            whz0Var.setVisibility(8);
        }
        String n = tez0Var.n();
        Button button = this.i;
        button.setText(n);
        if ("".equals(tez0Var.h)) {
            kdy0Var.getRightBorderedView().setVisibility(8);
        } else {
            kdy0Var.getRightBorderedView().setText(tez0Var.h);
        }
        char c = 2;
        c1z0.o(button, -16733198, -16746839, this.k.b(2));
        button.setTextColor(-1);
        String str2 = tez0Var.p;
        str2.getClass();
        switch (str2.hashCode()) {
            case 117588:
                if (str2.equals("web")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                if (str2.equals(X3.i.U)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1223953944:
                break;
            default:
                c = 65535;
                break;
        }
        LinearLayout linearLayout = this.e;
        TextView textView2 = this.h;
        switch (c) {
            case 0:
            case 2:
                String str3 = tez0Var.o;
                if (TextUtils.isEmpty(str3)) {
                    textView2.setEnabled(false);
                    textView2.setVisibility(8);
                } else {
                    textView2.setEnabled(true);
                    textView2.setText(str3);
                }
                linearLayout.setEnabled(false);
                break;
            case 1:
                if (tez0Var.f() == 0 || tez0Var.c() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    linearLayout.setEnabled(false);
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setEnabled(true);
                    this.f.setRating(tez0Var.c());
                    this.g.setText(String.valueOf(tez0Var.f()));
                }
                textView2.setEnabled(false);
                break;
        }
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var == null || !lgz0Var.h0) {
            linearLayout.setVisibility(8);
            textView2.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            lly0 lly0Var = lly0.this;
            lly0Var.d.setVisibility(8);
            lly0Var.b.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
