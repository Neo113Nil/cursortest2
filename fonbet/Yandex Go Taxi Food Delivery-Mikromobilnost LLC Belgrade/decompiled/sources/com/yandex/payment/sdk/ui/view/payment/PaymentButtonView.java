package com.yandex.payment.sdk.ui.view.payment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.exg0;
import defpackage.gqa0;
import defpackage.gx90;
import defpackage.hx90;
import defpackage.ix90;
import defpackage.jx90;
import defpackage.kx90;
import defpackage.lx90;
import defpackage.m991;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.ong0;
import defpackage.opg0;
import defpackage.tyh0;
import defpackage.w511;
import defpackage.xlh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u00023\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u001e\u0010,\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u001e\u0010/\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010'R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/payment/PaymentButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llx90;", "getCurrentState", "()Llx90;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "setBrandIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "totalText", "subTotalText", "setText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "resId", "setTextAppearance", "(I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "setTotalTextAppearance", "setSubTotalTextAppearance", ClidProvider.STATE, "setState", "(Llx90;)V", "Lgqa0;", "binding", "Lgqa0;", "defaultBackgroundResource", CA20Status.STATUS_USER_I, "sbpBackgroundResourceLight", "sbpBackgroundResourceDark", "Landroid/content/res/ColorStateList;", "kotlin.jvm.PlatformType", "defaultPrimaryTextColor", "Landroid/content/res/ColorStateList;", "defaultTotalTextColor", "defaultSubtotalTextColor", "sbpMainColor", "currentState", "Llx90;", "m991", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentButtonView extends ConstraintLayout {
    private final gqa0 binding;
    private lx90 currentState;
    private final int defaultBackgroundResource;
    private ColorStateList defaultPrimaryTextColor;
    private ColorStateList defaultSubtotalTextColor;
    private ColorStateList defaultTotalTextColor;
    private final int sbpBackgroundResourceDark;
    private final int sbpBackgroundResourceLight;
    private final int sbpMainColor;

    public PaymentButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_view_payment_button, this);
        int i2 = o9h0.brand_icon;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = o9h0.pay_subtotal_text;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = o9h0.pay_text;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    i2 = o9h0.pay_total_text;
                    TextView textView3 = (TextView) cma1.O(i2, this);
                    if (textView3 != null) {
                        i2 = o9h0.progress_bar;
                        ProgressBar progressBar = (ProgressBar) cma1.O(i2, this);
                        if (progressBar != null) {
                            i2 = o9h0.sbp_icon;
                            ImageView imageView2 = (ImageView) cma1.O(i2, this);
                            if (imageView2 != null) {
                                this.binding = new gqa0(this, imageView, textView, textView2, textView3, progressBar, imageView2);
                                Resources.Theme theme = context.getTheme();
                                int i3 = ong0.paymentsdk_payButtonBackground;
                                TypedValue typedValue = new TypedValue();
                                TypedValue typedValue2 = theme.resolveAttribute(i3, typedValue, true) ? typedValue : null;
                                int i4 = typedValue2 != null ? typedValue2.resourceId : 0;
                                this.defaultBackgroundResource = i4;
                                this.sbpBackgroundResourceLight = exg0.paymentsdk_pay_button_sbp_light;
                                this.sbpBackgroundResourceDark = exg0.paymentsdk_pay_button_sbp_dark;
                                this.defaultPrimaryTextColor = textView2.getTextColors();
                                this.defaultTotalTextColor = textView3.getTextColors();
                                this.defaultSubtotalTextColor = textView.getTextColors();
                                this.sbpMainColor = getResources().getColor(opg0.paymentsdk_sbp_main_color);
                                setBackgroundResource(i4);
                                textView.setPaintFlags(textView.getPaintFlags() | 16);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static /* synthetic */ void setText$default(PaymentButtonView paymentButtonView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        paymentButtonView.setText(str, str2, str3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "javaClass";
    }

    public final lx90 getCurrentState() {
        return this.currentState;
    }

    public final void setBrandIcon(Drawable drawable) {
        this.binding.b.setImageDrawable(drawable);
    }

    public final void setState(lx90 state) {
        if (state.equals(this.currentState)) {
            return;
        }
        lx90 lx90Var = this.currentState;
        if ((lx90Var instanceof jx90) && (((jx90) lx90Var).a instanceof hx90)) {
            setBackgroundResource(this.defaultBackgroundResource);
            this.binding.d.setTextColor(this.defaultPrimaryTextColor);
            this.binding.e.setTextColor(this.defaultTotalTextColor);
            this.binding.c.setTextColor(this.defaultSubtotalTextColor);
        }
        boolean z = state instanceof jx90;
        if (z) {
            m991 m991Var = ((jx90) state).a;
            if (m991Var instanceof hx90) {
                if (((hx90) m991Var).b) {
                    setBackgroundResource(this.sbpBackgroundResourceLight);
                    this.binding.g.setImageResource(exg0.paymentsdk_ic_sbp_logo_light);
                    this.binding.d.setTextColor(this.defaultPrimaryTextColor);
                    this.binding.e.setTextColor(this.defaultTotalTextColor);
                    this.binding.c.setTextColor(this.defaultSubtotalTextColor);
                } else {
                    setBackgroundResource(this.sbpBackgroundResourceDark);
                    this.binding.g.setImageResource(exg0.paymentsdk_ic_sbp_logo_dark);
                    this.binding.d.setTextColor(this.sbpMainColor);
                    this.binding.e.setTextColor(this.sbpMainColor);
                    this.binding.c.setTextColor(this.sbpMainColor);
                }
            }
        }
        this.currentState = state;
        if (state instanceof ix90) {
            setEnabled(false);
            this.binding.f.setVisibility(8);
            this.binding.d.setEnabled(false);
            this.binding.e.setEnabled(false);
            this.binding.c.setEnabled(false);
            this.binding.b.setVisibility(0);
            this.binding.b.setEnabled(false);
            this.binding.g.setVisibility(8);
            return;
        }
        if (z) {
            setEnabled(true);
            this.binding.f.setVisibility(8);
            this.binding.d.setEnabled(true);
            this.binding.e.setEnabled(true);
            this.binding.c.setEnabled(true);
            ImageView imageView = this.binding.b;
            m991 m991Var2 = ((jx90) state).a;
            imageView.setVisibility(m991Var2 instanceof gx90 ? 0 : 8);
            this.binding.b.setEnabled(true);
            this.binding.g.setVisibility(m991Var2 instanceof hx90 ? 0 : 8);
            return;
        }
        if (!(state instanceof kx90)) {
            w511.b();
            return;
        }
        setEnabled(false);
        this.binding.f.setVisibility(0);
        this.binding.d.setEnabled(false);
        this.binding.e.setEnabled(false);
        this.binding.c.setEnabled(false);
        this.binding.b.setVisibility(8);
        this.binding.g.setVisibility(8);
    }

    public final void setSubTotalTextAppearance(int resId) {
        this.binding.c.setTextAppearance(resId);
        this.defaultSubtotalTextColor = this.binding.c.getTextColors();
    }

    public final void setText(String text, String totalText, String subTotalText) {
        setContentDescription(getContext().getString(tyh0.paymentsdk_prebuilt_button_text_content_description, text));
        this.binding.d.setText(text);
        this.binding.e.setText(totalText);
        int i = 8;
        this.binding.e.setVisibility((totalText == null || totalText.length() == 0) ? 8 : 0);
        this.binding.c.setText(subTotalText);
        TextView textView = this.binding.c;
        if (subTotalText != null && subTotalText.length() != 0) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final void setTextAppearance(int resId) {
        this.binding.d.setTextAppearance(resId);
        this.defaultPrimaryTextColor = this.binding.d.getTextColors();
    }

    public final void setTotalTextAppearance(int resId) {
        this.binding.e.setTextAppearance(resId);
        this.defaultTotalTextColor = this.binding.e.getTextColors();
    }

    public PaymentButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PaymentButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PaymentButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
