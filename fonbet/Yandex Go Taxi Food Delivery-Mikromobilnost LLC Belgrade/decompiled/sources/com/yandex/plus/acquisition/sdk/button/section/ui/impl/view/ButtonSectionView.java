package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.a1i0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.e0d0;
import defpackage.k27;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.png0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/view/ButtonSectionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "contentContainer$delegate", "Lwv5;", "getContentContainer", "()Landroid/widget/FrameLayout;", "contentContainer", "Le0d0;", "purchaseButton$delegate", "getPurchaseButton", "()Le0d0;", "purchaseButton", "Landroid/widget/TextView;", "legalsTextView$delegate", "getLegalsTextView", "()Landroid/widget/TextView;", "legalsTextView", "Landroid/widget/ProgressBar;", "progressBar$delegate", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonSectionView extends FrameLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("contentContainer", 0, "getContentContainer()Landroid/widget/FrameLayout;", ButtonSectionView.class), b64.x(qoi0.a, ButtonSectionView.class, "purchaseButton", "getPurchaseButton()Lcom/yandex/plus/acquisition/sdk/button/section/ui/api/PlusAcquisitionPurchaseButton;", 0), new PropertyReference1Impl("legalsTextView", 0, "getLegalsTextView()Landroid/widget/TextView;", ButtonSectionView.class), new PropertyReference1Impl("progressBar", 0, "getProgressBar()Landroid/widget/ProgressBar;", ButtonSectionView.class)};

    /* renamed from: contentContainer$delegate, reason: from kotlin metadata */
    private final wv5 contentContainer;

    /* renamed from: legalsTextView$delegate, reason: from kotlin metadata */
    private final wv5 legalsTextView;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final wv5 progressBar;

    /* renamed from: purchaseButton$delegate, reason: from kotlin metadata */
    private final wv5 purchaseButton;

    public ButtonSectionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.contentContainer = new wv5(new k27(this, p9h0.content_container, 0));
        this.purchaseButton = new wv5(new k27(this, p9h0.purchase_button, 1));
        this.legalsTextView = new wv5(new k27(this, p9h0.legals_text_view, 2));
        this.progressBar = new wv5(new k27(this, p9h0.progress_bar, 3));
        bb1.v(this, ylh0.acquisition_sdk_view_button_section, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public FrameLayout getContentContainer() {
        return (FrameLayout) this.contentContainer.a($$delegatedProperties[0]);
    }

    public TextView getLegalsTextView() {
        return (TextView) this.legalsTextView.a($$delegatedProperties[2]);
    }

    public ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.a($$delegatedProperties[3]);
    }

    public e0d0 getPurchaseButton() {
        return (e0d0) this.purchaseButton.a($$delegatedProperties[1]);
    }

    public View getView() {
        return this;
    }

    public ButtonSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ButtonSectionView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ ButtonSectionView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? png0.acquisition_sdk_buttonSectionStyle : i, (i3 & 8) != 0 ? a1i0.AcquisitionSdk_Widget_ButtonSection : i2);
    }

    public ButtonSectionView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
