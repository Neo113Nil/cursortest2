package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.b64;
import defpackage.bb1;
import defpackage.d6i0;
import defpackage.f9f0;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.xn4;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/radio/button/RadioButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/constraintlayout/widget/Guideline;", "guideline$delegate", "Lwv5;", "getGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "guideline", "checkableContainer$delegate", "getCheckableContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "checkableContainer", "Lf9f0;", "productTexts$delegate", "getProductTexts", "()Lf9f0;", "productTexts", "Landroid/widget/ImageView;", "indicatorImageView$delegate", "getIndicatorImageView", "()Landroid/widget/ImageView;", "indicatorImageView", "Lxn4;", "badges$delegate", "getBadges", "()Lxn4;", "badges", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RadioButtonView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("guideline", 0, "getGuideline()Landroidx/constraintlayout/widget/Guideline;", RadioButtonView.class), b64.x(qoi0.a, RadioButtonView.class, "checkableContainer", "getCheckableContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new PropertyReference1Impl("productTexts", 0, "getProductTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTexts;", RadioButtonView.class), new PropertyReference1Impl("indicatorImageView", 0, "getIndicatorImageView()Landroid/widget/ImageView;", RadioButtonView.class), new PropertyReference1Impl("badges", 0, "getBadges()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/badges/Badges;", RadioButtonView.class)};

    /* renamed from: badges$delegate, reason: from kotlin metadata */
    private final wv5 badges;

    /* renamed from: checkableContainer$delegate, reason: from kotlin metadata */
    private final wv5 checkableContainer;

    /* renamed from: guideline$delegate, reason: from kotlin metadata */
    private final wv5 guideline;

    /* renamed from: indicatorImageView$delegate, reason: from kotlin metadata */
    private final wv5 indicatorImageView;

    /* renamed from: productTexts$delegate, reason: from kotlin metadata */
    private final wv5 productTexts;

    public RadioButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.guideline = new wv5(new d6i0(this, p9h0.guideline, 0));
        this.checkableContainer = new wv5(new d6i0(this, p9h0.checkable_container, 1));
        this.productTexts = new wv5(new d6i0(this, p9h0.product_texts_view, 2));
        this.indicatorImageView = new wv5(new d6i0(this, p9h0.indicator_image_view, 3));
        this.badges = new wv5(new d6i0(this, p9h0.badges_view, 4));
        bb1.v(this, ylh0.acquisition_sdk_view_radio_button, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public xn4 getBadges() {
        return (xn4) this.badges.a($$delegatedProperties[4]);
    }

    public ConstraintLayout getCheckableContainer() {
        return (ConstraintLayout) this.checkableContainer.a($$delegatedProperties[1]);
    }

    public Guideline getGuideline() {
        return (Guideline) this.guideline.a($$delegatedProperties[0]);
    }

    public ImageView getIndicatorImageView() {
        return (ImageView) this.indicatorImageView.a($$delegatedProperties[3]);
    }

    public f9f0 getProductTexts() {
        return (f9f0) this.productTexts.a($$delegatedProperties[2]);
    }

    public View getView() {
        return this;
    }

    public RadioButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public RadioButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ RadioButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public RadioButtonView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
