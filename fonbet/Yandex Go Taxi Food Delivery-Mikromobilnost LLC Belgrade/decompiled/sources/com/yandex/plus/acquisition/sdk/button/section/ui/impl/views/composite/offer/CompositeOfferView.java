package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconsLayout;
import defpackage.b64;
import defpackage.bb1;
import defpackage.f9f0;
import defpackage.hqd;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.qoi0;
import defpackage.rkd;
import defpackage.wv5;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/composite/offer/CompositeOfferView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lrkd;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lf9f0;", "productTexts$delegate", "Lwv5;", "getProductTexts", "()Lf9f0;", "productTexts", "Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/icons/ProductIconsLayout;", "productIconsContainer$delegate", "getProductIconsContainer", "()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/icons/ProductIconsLayout;", "productIconsContainer", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeOfferView extends ConstraintLayout implements rkd {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("productTexts", 0, "getProductTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTexts;", CompositeOfferView.class), b64.x(qoi0.a, CompositeOfferView.class, "productIconsContainer", "getProductIconsContainer()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/icons/ProductIconsLayout;", 0)};

    /* renamed from: productIconsContainer$delegate, reason: from kotlin metadata */
    private final wv5 productIconsContainer;

    /* renamed from: productTexts$delegate, reason: from kotlin metadata */
    private final wv5 productTexts;

    public CompositeOfferView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.productTexts = new wv5(new hqd(this, p9h0.product_texts_view, 0));
        this.productIconsContainer = new wv5(new hqd(this, p9h0.product_icons_container, 1));
        bb1.v(this, ylh0.acquisition_sdk_view_composite_offer, true);
    }

    @Override // defpackage.rkd
    public ProductIconsLayout getProductIconsContainer() {
        return (ProductIconsLayout) this.productIconsContainer.a($$delegatedProperties[1]);
    }

    @Override // defpackage.rkd
    public f9f0 getProductTexts() {
        return (f9f0) this.productTexts.a($$delegatedProperties[0]);
    }

    @Override // defpackage.rkd
    public View getView() {
        return this;
    }

    public CompositeOfferView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CompositeOfferView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ CompositeOfferView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public CompositeOfferView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
