package com.yandex.go.payments.design.composite;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.payments.payment.PaymentInfo$PaymentInfoTitle;
import defpackage.ard;
import defpackage.cma1;
import defpackage.d6h0;
import defpackage.evu0;
import defpackage.g1a0;
import defpackage.g8e;
import defpackage.h3i0;
import defpackage.kuh0;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.t0a0;
import defpackage.xng0;
import defpackage.z0a0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u000f\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J3\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b \u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/yandex/go/payments/design/composite/CompositePaymentIconsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lt0a0;", "paymentOptionInfo", "Lz0a0;", "iconLoader", "Lzy11;", "setBaseIcon", "(Lt0a0;Lz0a0;)V", "setComplementaryIcon", "", "isComposite", "setIsComposite", "(Z)V", "visible", "setTitleVisible", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "setComplementIcon", "Lm1a0;", "paymentInfo", "updateContentDescription", "contentDescriptionPrefix", "update", "(Lm1a0;Lz0a0;ZI)V", "", "(Lm1a0;Lz0a0;ZLjava/lang/String;)V", "Lard;", "binding", "Lard;", "Landroid/widget/ImageView;", "topIcon", "Landroid/widget/ImageView;", "getTopIcon", "()Landroid/widget/ImageView;", "bottomIcon", "errorIcon", "Lru/yandex/taxi/widget/RobotoTextView;", "title", "Lru/yandex/taxi/widget/RobotoTextView;", "titleVisible", "Z", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompositePaymentIconsView extends FrameLayout {
    private final ard binding;
    private final ImageView bottomIcon;
    private final ImageView errorIcon;
    private final RobotoTextView title;
    private boolean titleVisible;
    private final ImageView topIcon;

    public CompositePaymentIconsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(kuh0.composite_payment_icon_group, this);
        int i2 = d6h0.composite_icons_group;
        if (((GoFrameLayout) cma1.O(i2, this)) != null) {
            i2 = d6h0.composite_payment_error;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = d6h0.composite_payment_primary;
                ImageView imageView2 = (ImageView) cma1.O(i2, this);
                if (imageView2 != null) {
                    i2 = d6h0.composite_payment_secondary;
                    ImageView imageView3 = (ImageView) cma1.O(i2, this);
                    if (imageView3 != null) {
                        i2 = d6h0.composite_payment_title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                        if (robotoTextView != null) {
                            this.binding = new ard(this, imageView, imageView2, imageView3, robotoTextView);
                            this.topIcon = imageView2;
                            this.bottomIcon = imageView3;
                            this.errorIcon = imageView;
                            this.title = robotoTextView;
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3i0.CompositePaymentIcons, i, 0);
                            setTitleVisible(obtainStyledAttributes.getBoolean(h3i0.CompositePaymentIcons_titleVisible, false));
                            obtainStyledAttributes.recycle();
                            setIsComposite(true);
                            robotoTextView.setTextTypeface(3);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setBaseIcon(t0a0 paymentOptionInfo, z0a0 iconLoader) {
        ((g1a0) iconLoader).b(this.topIcon, paymentOptionInfo);
    }

    private final void setComplementaryIcon(t0a0 paymentOptionInfo, z0a0 iconLoader) {
        ((g1a0) iconLoader).b(this.bottomIcon, paymentOptionInfo);
    }

    private final void setIsComposite(boolean isComposite) {
        this.bottomIcon.setVisibility(isComposite ? 0 : 8);
    }

    public static /* synthetic */ void update$default(CompositePaymentIconsView compositePaymentIconsView, m1a0 m1a0Var, z0a0 z0a0Var, boolean z, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        compositePaymentIconsView.update(m1a0Var, z0a0Var, z, str);
    }

    public final ImageView getTopIcon() {
        return this.topIcon;
    }

    public final void setComplementIcon(Drawable drawable) {
        this.bottomIcon.setImageDrawable(drawable);
    }

    public final void setTitleVisible(boolean visible) {
        this.titleVisible = visible;
        this.title.setVisibility(visible ? 0 : 8);
    }

    public final void update(m1a0 paymentInfo, z0a0 iconLoader, boolean updateContentDescription, String contentDescriptionPrefix) {
        PaymentInfo$PaymentInfoTitle paymentInfo$PaymentInfoTitle = paymentInfo.g;
        String str = paymentInfo.b;
        if (updateContentDescription) {
            String p = (contentDescriptionPrefix == null || evu0.J(contentDescriptionPrefix)) ? g8e.p(paymentInfo.a(), " ", str) : oyr.q(contentDescriptionPrefix, Extension.FIX_SPACE, paymentInfo.a(), " ", str);
            String str2 = paymentInfo$PaymentInfoTitle != null ? paymentInfo$PaymentInfoTitle.c : null;
            if (str2 == null) {
                str2 = "";
            }
            setContentDescription(p.concat(str2));
        }
        setBaseIcon(paymentInfo.c, iconLoader);
        setComplementaryIcon(paymentInfo.d, iconLoader);
        setIsComposite(paymentInfo.f);
        this.title.setText(paymentInfo$PaymentInfoTitle != null ? paymentInfo$PaymentInfoTitle.a : null);
        this.title.setVisibility((paymentInfo$PaymentInfoTitle != null ? paymentInfo$PaymentInfoTitle.a : null) != null && this.titleVisible ? 0 : 8);
        PaymentInfo$PaymentInfoTitle.PaymentTitleState paymentTitleState = paymentInfo$PaymentInfoTitle != null ? paymentInfo$PaymentInfoTitle.b : null;
        PaymentInfo$PaymentInfoTitle.PaymentTitleState paymentTitleState2 = PaymentInfo$PaymentInfoTitle.PaymentTitleState.ERROR;
        RobotoTextView robotoTextView = this.title;
        if (paymentTitleState == paymentTitleState2) {
            robotoTextView.setTextColorAttr(xng0.error);
            this.errorIcon.setVisibility(0);
        } else {
            robotoTextView.setTextColorAttr(xng0.textMain);
            this.errorIcon.setVisibility(8);
        }
    }

    public final void setBaseIcon(Drawable drawable) {
        this.topIcon.setImageDrawable(drawable);
    }

    public CompositePaymentIconsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CompositePaymentIconsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CompositePaymentIconsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void update(m1a0 m1a0Var, z0a0 z0a0Var, boolean z) {
        update$default(this, m1a0Var, z0a0Var, z, null, 8, null);
    }

    public final void update(m1a0 paymentInfo, z0a0 iconLoader, boolean updateContentDescription, int contentDescriptionPrefix) {
        update(paymentInfo, iconLoader, updateContentDescription, getContext().getString(contentDescriptionPrefix));
    }
}
