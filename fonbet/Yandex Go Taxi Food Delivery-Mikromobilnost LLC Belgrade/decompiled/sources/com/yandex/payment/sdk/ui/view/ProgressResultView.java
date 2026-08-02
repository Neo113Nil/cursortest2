package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import defpackage.cma1;
import defpackage.e350;
import defpackage.exg0;
import defpackage.fx90;
import defpackage.iqa0;
import defpackage.jx90;
import defpackage.ljf0;
import defpackage.mjf0;
import defpackage.njb;
import defpackage.njf0;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.ojf0;
import defpackage.ong0;
import defpackage.phd;
import defpackage.pjf0;
import defpackage.sls;
import defpackage.tyh0;
import defpackage.w511;
import defpackage.xlh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/ProgressResultView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "action", "setCloseCallback", "(Lsls;)V", "listener", "setOnCloseButtonVisible", "setOnProgressBarVisible", "setExitButtonCallback", "Lpjf0;", ClidProvider.STATE, "setState", "(Lpjf0;)V", "", "visible", "setBrandIconVisible", "(Z)V", "Liqa0;", "binding", "Liqa0;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressResultView extends LinearLayout {
    private final iqa0 binding;

    public ProgressResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_view_progress_result_full, this);
        int i2 = o9h0.brand_image;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = o9h0.close_button;
            PaymentButtonView paymentButtonView = (PaymentButtonView) cma1.O(i2, this);
            if (paymentButtonView != null) {
                i2 = o9h0.exitButtonView;
                ImageView imageView2 = (ImageView) cma1.O(i2, this);
                if (imageView2 != null) {
                    i2 = o9h0.header_layout;
                    if (((FrameLayout) cma1.O(i2, this)) != null) {
                        i2 = o9h0.progress_bar;
                        ProgressBar progressBar = (ProgressBar) cma1.O(i2, this);
                        if (progressBar != null) {
                            i2 = o9h0.result_image;
                            ImageView imageView3 = (ImageView) cma1.O(i2, this);
                            if (imageView3 != null) {
                                i2 = o9h0.result_subtitle;
                                TextView textView = (TextView) cma1.O(i2, this);
                                if (textView != null) {
                                    i2 = o9h0.result_text;
                                    TextView textView2 = (TextView) cma1.O(i2, this);
                                    if (textView2 != null) {
                                        i2 = o9h0.root_layout;
                                        if (((ConstraintLayout) cma1.O(i2, this)) != null) {
                                            this.binding = new iqa0(this, imageView, paymentButtonView, imageView2, progressBar, imageView3, textView, textView2);
                                            setOrientation(1);
                                            setGravity(1);
                                            paymentButtonView.setState(new jx90(fx90.b));
                                            PaymentButtonView.setText$default(paymentButtonView, context.getString(tyh0.paymentsdk_prebuilt_close), null, null, 6, null);
                                            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                                            if (layoutParams2 != null) {
                                                Resources.Theme theme = context.getTheme();
                                                int i3 = ong0.paymentsdk_progressResultCenterBrandIcon;
                                                TypedValue typedValue = new TypedValue();
                                                TypedValue typedValue2 = theme.resolveAttribute(i3, typedValue, true) ? typedValue : null;
                                                layoutParams2.gravity = (typedValue2 == null || typedValue2.data == 0) ? 8388611 : 1;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnCloseButtonVisible$lambda$0(sls slsVar, View view) {
        if (view.getVisibility() == 0) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnProgressBarVisible$lambda$0(sls slsVar, View view) {
        if (view.getVisibility() == 0) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    public final void setBrandIconVisible(boolean visible) {
        this.binding.b.setVisibility(visible ? 0 : 8);
    }

    public final void setCloseCallback(sls action) {
        this.binding.c.setOnClickListener(new njb(23, action));
    }

    public final void setExitButtonCallback(sls action) {
        this.binding.d.setOnClickListener(new njb(22, action));
    }

    public final void setOnCloseButtonVisible(sls listener) {
        PaymentButtonView paymentButtonView = this.binding.c;
        paymentButtonView.getViewTreeObserver().addOnGlobalLayoutListener(new phd(3, paymentButtonView, new e350(11, listener)));
    }

    public final void setOnProgressBarVisible(sls listener) {
        ProgressBar progressBar = this.binding.e;
        progressBar.getViewTreeObserver().addOnGlobalLayoutListener(new phd(3, progressBar, new e350(12, listener)));
    }

    public final void setState(pjf0 state) {
        if (state instanceof njf0) {
            this.binding.d.setVisibility(0);
            this.binding.e.setVisibility(0);
            this.binding.f.setVisibility(8);
            njf0 njf0Var = (njf0) state;
            this.binding.c.setVisibility(njf0Var.b ? 0 : 8);
            this.binding.h.setText(njf0Var.a);
            this.binding.g.setVisibility(8);
            return;
        }
        if (state instanceof ojf0) {
            this.binding.d.setVisibility(8);
            this.binding.e.setVisibility(8);
            this.binding.f.setVisibility(0);
            this.binding.c.setVisibility(8);
            this.binding.g.setVisibility(8);
            this.binding.f.setImageResource(exg0.paymentsdk_ic_result_success);
            this.binding.h.setText(((ojf0) state).a);
            return;
        }
        if (!(state instanceof mjf0)) {
            if (!(state instanceof ljf0)) {
                w511.b();
                return;
            }
            this.binding.d.setVisibility(8);
            this.binding.e.setVisibility(8);
            this.binding.f.setVisibility(0);
            this.binding.c.setVisibility(8);
            this.binding.g.setVisibility(8);
            this.binding.f.setImageResource(exg0.paymentsdk_ic_result_failure);
            this.binding.h.setText(((ljf0) state).a);
            return;
        }
        this.binding.d.setVisibility(8);
        this.binding.e.setVisibility(8);
        this.binding.f.setVisibility(0);
        this.binding.c.setVisibility(8);
        this.binding.f.setImageResource(exg0.paymentsdk_ic_result_failure);
        TextView textView = this.binding.h;
        mjf0 mjf0Var = (mjf0) state;
        Integer num = mjf0Var.b;
        textView.setText(mjf0Var.a);
        if (num != null) {
            this.binding.g.setVisibility(0);
            this.binding.g.setText(num.intValue());
        }
    }

    public ProgressResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ProgressResultView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ProgressResultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
