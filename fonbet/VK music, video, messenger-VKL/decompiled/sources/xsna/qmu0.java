package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VkCompositeActionButtonView.kt */
/* loaded from: classes18.dex */
public final class qmu0 extends FrameLayout {
    public final ViewGroup b;
    public mmu0 c;
    public final ViewGroup d;
    public AppCompatTextView e;
    public final ViewGroup f;
    public q8u0 g;

    public qmu0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.pds_composite_action_button, (ViewGroup) this, true);
        this.b = (ViewGroup) findViewById(R.id.pds_composite_action_button_left);
        this.d = (ViewGroup) findViewById(R.id.pds_composite_action_button_middle);
        this.f = (ViewGroup) findViewById(R.id.pds_composite_action_button_right);
    }

    private final void setupButton(pmu0 pmu0Var) {
        q8u0 q8u0Var = this.g;
        if (q8u0Var == null) {
            q8u0Var = new q8u0(getContext());
            q8u0Var.setId(R.id.pds_composite_action_button_end_button);
            this.g = q8u0Var;
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            this.f.addView(q8u0Var, 0, a);
        }
        bwt0.p0(q8u0Var, true);
        q8u0Var.setText(pmu0Var.a);
        tlo0.h hVar = pmu0Var.f;
        q8u0Var.setContentDescription(hVar != null ? tlo0.b.a(hVar, q8u0Var.getContext()) : null);
        int i = pmu0Var.c;
        int i2 = pmu0Var.d;
        boolean z = pmu0Var.e;
        VkText vkText = q8u0Var.b;
        GradientDrawable gradientDrawable = q8u0Var.d;
        int f = e3m.f(i, q8u0Var.getContext());
        int f2 = e3m.f(i2, q8u0Var.getContext());
        AnimatorSet animatorSet = q8u0Var.c;
        animatorSet.cancel();
        if (!z || q8u0Var.f == 0) {
            q8u0Var.f = f;
            gradientDrawable.setColor(f);
            vkText.setTextColor(f2);
        } else {
            ColorStateList color = gradientDrawable.getColor();
            int defaultColor = color != null ? color.getDefaultColor() : q8u0Var.f;
            int currentTextColor = vkText.getCurrentTextColor();
            ValueAnimator ofArgb = ValueAnimator.ofArgb(defaultColor, f);
            ofArgb.setDuration(500L);
            ofArgb.addUpdateListener(new tlc(q8u0Var, 2));
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor, f2);
            ofArgb2.setDuration(500L);
            ofArgb2.addUpdateListener(new gs6(q8u0Var, 2));
            animatorSet.playTogether(ofArgb, ofArgb2);
            animatorSet.start();
        }
        q8u0Var.setOnClickListener(new mo3(pmu0Var, 19));
    }

    private final void setupDatePic(nmu0 nmu0Var) {
        mmu0 mmu0Var = this.c;
        if (mmu0Var == null) {
            mmu0Var = new mmu0(getContext());
            mmu0Var.setId(R.id.pds_composite_action_button_date_pic);
            this.c = mmu0Var;
            float f = 32;
            FrameLayout.LayoutParams a = cpy.a(iah0.a(f), iah0.a(f), 0, 0, 0, 0, 60);
            a.gravity = 16;
            this.b.addView(mmu0Var, 0, a);
        }
        bwt0.p0(mmu0Var, true);
        mmu0Var.setDay(nmu0Var.a);
        mmu0Var.setMonth(nmu0Var.b);
        mmu0Var.setWidgetColor(nmu0Var.c);
        mmu0Var.setContentDescription(nmu0Var.d);
    }

    private final void setupMiddleTitle(omu0 omu0Var) {
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setId(R.id.pds_composite_action_button_title);
            this.e = appCompatTextView;
            appCompatTextView.setIncludeFontPadding(false);
            appCompatTextView.setTextAppearance(R.style.VkUiTypography_ParagraphNormal);
            jno0.c(appCompatTextView, R.attr.vk_ui_text_primary);
            appCompatTextView.setHorizontallyScrolling(true);
            appCompatTextView.setHorizontalFadingEdgeEnabled(true);
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            this.d.addView(appCompatTextView, 0, a);
        }
        bwt0.p0(appCompatTextView, true);
        appCompatTextView.setText(omu0Var.a.a(appCompatTextView.getContext()));
    }

    public final void a(nmu0 nmu0Var) {
        bwt0.p0(this.b, nmu0Var != null);
        if (nmu0Var != null) {
            mmu0 mmu0Var = this.c;
            if (mmu0Var != null) {
                f4m.j(mmu0Var);
            }
            setupDatePic(nmu0Var);
        }
    }

    public final void b(omu0 omu0Var) {
        bwt0.p0(this.d, true);
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView != null) {
            f4m.j(appCompatTextView);
        }
        setupMiddleTitle(omu0Var);
    }

    public final void c(pmu0 pmu0Var) {
        bwt0.p0(this.f, pmu0Var != null);
        if (pmu0Var != null) {
            q8u0 q8u0Var = this.g;
            if (q8u0Var != null) {
                f4m.j(q8u0Var);
            }
            setupButton(pmu0Var);
        }
    }
}
