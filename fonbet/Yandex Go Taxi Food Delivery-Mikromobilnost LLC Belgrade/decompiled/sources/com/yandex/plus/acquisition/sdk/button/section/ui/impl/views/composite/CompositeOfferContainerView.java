package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.b64;
import defpackage.bb1;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.qoi0;
import defpackage.rkd;
import defpackage.ukd;
import defpackage.wv5;
import defpackage.xi;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/CompositeOfferContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/CompositeProductsLayout;", "compositeProductsContainer$delegate", "Lwv5;", "getCompositeProductsContainer", "()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/CompositeProductsLayout;", "compositeProductsContainer", "Lrkd;", "compositeOffer$delegate", "getCompositeOffer", "()Lrkd;", "compositeOffer", "getContainer", "()Landroid/widget/FrameLayout;", "container", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeOfferContainerView extends FrameLayout implements xi {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("compositeProductsContainer", 0, "getCompositeProductsContainer()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/CompositeProductsLayout;", CompositeOfferContainerView.class), b64.x(qoi0.a, CompositeOfferContainerView.class, "compositeOffer", "getCompositeOffer()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/offer/CompositeOffer;", 0)};

    /* renamed from: compositeOffer$delegate, reason: from kotlin metadata */
    private final wv5 compositeOffer;

    /* renamed from: compositeProductsContainer$delegate, reason: from kotlin metadata */
    private final wv5 compositeProductsContainer;

    public CompositeOfferContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.compositeProductsContainer = new wv5(new ukd(this, p9h0.composite_products_container, 0));
        this.compositeOffer = new wv5(new ukd(this, p9h0.composite_offer_view, 1));
        bb1.v(this, ylh0.acquisition_sdk_view_composite_offer_container, true);
    }

    @Override // defpackage.xi
    public View getCollapsedView() {
        return getCompositeOffer().getView();
    }

    public rkd getCompositeOffer() {
        return (rkd) this.compositeOffer.a($$delegatedProperties[1]);
    }

    public CompositeProductsLayout getCompositeProductsContainer() {
        return (CompositeProductsLayout) this.compositeProductsContainer.a($$delegatedProperties[0]);
    }

    @Override // defpackage.xi
    public FrameLayout getContainer() {
        return this;
    }

    @Override // defpackage.xi
    public View getExpandedView() {
        return getCompositeProductsContainer();
    }

    public CompositeOfferContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CompositeOfferContainerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ CompositeOfferContainerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public CompositeOfferContainerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
