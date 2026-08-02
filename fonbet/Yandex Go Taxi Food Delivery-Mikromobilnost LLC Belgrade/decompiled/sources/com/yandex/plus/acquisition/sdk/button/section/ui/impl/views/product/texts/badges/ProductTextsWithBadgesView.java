package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.badges;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b64;
import defpackage.bb1;
import defpackage.f9f0;
import defpackage.k9f0;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.xn4;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/badges/ProductTextsWithBadgesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lf9f0;", "productTexts$delegate", "Lwv5;", "getProductTexts", "()Lf9f0;", "productTexts", "Lxn4;", "badges$delegate", "getBadges", "()Lxn4;", "badges", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductTextsWithBadgesView extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("productTexts", 0, "getProductTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTexts;", ProductTextsWithBadgesView.class), b64.x(qoi0.a, ProductTextsWithBadgesView.class, "badges", "getBadges()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/badges/Badges;", 0)};

    /* renamed from: badges$delegate, reason: from kotlin metadata */
    private final wv5 badges;

    /* renamed from: productTexts$delegate, reason: from kotlin metadata */
    private final wv5 productTexts;

    public ProductTextsWithBadgesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.productTexts = new wv5(new k9f0(this, p9h0.product_texts_view, 0));
        this.badges = new wv5(new k9f0(this, p9h0.badges_view, 1));
        bb1.v(this, ylh0.acquisition_sdk_view_product_texts_with_badges, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public xn4 getBadges() {
        return (xn4) this.badges.a($$delegatedProperties[1]);
    }

    public f9f0 getProductTexts() {
        return (f9f0) this.productTexts.a($$delegatedProperties[0]);
    }

    public View getView() {
        return this;
    }

    public ProductTextsWithBadgesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ProductTextsWithBadgesView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ ProductTextsWithBadgesView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public ProductTextsWithBadgesView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
