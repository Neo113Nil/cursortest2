package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.b64;
import defpackage.bb1;
import defpackage.f6i0;
import defpackage.k8f0;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.xi;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/radio/group/RadioGroupView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/constraintlayout/widget/Guideline;", "guideline$delegate", "Lwv5;", "getGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "guideline", "Landroid/widget/LinearLayout;", "radioButtonsContainer$delegate", "getRadioButtonsContainer", "()Landroid/widget/LinearLayout;", "radioButtonsContainer", "Lk8f0;", "productExpandTexts$delegate", "getProductExpandTexts", "()Lk8f0;", "productExpandTexts", "getContainer", "()Landroid/widget/FrameLayout;", "container", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RadioGroupView extends FrameLayout implements xi {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("guideline", 0, "getGuideline()Landroidx/constraintlayout/widget/Guideline;", RadioGroupView.class), b64.x(qoi0.a, RadioGroupView.class, "radioButtonsContainer", "getRadioButtonsContainer()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl("productExpandTexts", 0, "getProductExpandTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/expand/ProductExpandTexts;", RadioGroupView.class)};

    /* renamed from: guideline$delegate, reason: from kotlin metadata */
    private final wv5 guideline;

    /* renamed from: productExpandTexts$delegate, reason: from kotlin metadata */
    private final wv5 productExpandTexts;

    /* renamed from: radioButtonsContainer$delegate, reason: from kotlin metadata */
    private final wv5 radioButtonsContainer;

    public RadioGroupView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.guideline = new wv5(new f6i0(this, p9h0.guideline, 0));
        this.radioButtonsContainer = new wv5(new f6i0(this, p9h0.radio_buttons_container, 1));
        this.productExpandTexts = new wv5(new f6i0(this, p9h0.product_expand_texts_view, 2));
        bb1.v(this, ylh0.acquisition_sdk_view_radio_group, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // defpackage.xi
    public View getCollapsedView() {
        return getProductExpandTexts().getView();
    }

    @Override // defpackage.xi
    public FrameLayout getContainer() {
        return this;
    }

    @Override // defpackage.xi
    public View getExpandedView() {
        return getRadioButtonsContainer();
    }

    public Guideline getGuideline() {
        return (Guideline) this.guideline.a($$delegatedProperties[0]);
    }

    public k8f0 getProductExpandTexts() {
        return (k8f0) this.productExpandTexts.a($$delegatedProperties[2]);
    }

    public LinearLayout getRadioButtonsContainer() {
        return (LinearLayout) this.radioButtonsContainer.a($$delegatedProperties[1]);
    }

    public RadioGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public RadioGroupView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ RadioGroupView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public RadioGroupView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
