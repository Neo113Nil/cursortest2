package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b64;
import defpackage.bb1;
import defpackage.f9f0;
import defpackage.h9f0;
import defpackage.kgx;
import defpackage.p9h0;
import defpackage.qoi0;
import defpackage.wv5;
import defpackage.ylh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTextsView;", "Landroid/widget/LinearLayout;", "Lf9f0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/TextView;", "titleTextView$delegate", "Lwv5;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "subtitleTextView$delegate", "getSubtitleTextView", "subtitleTextView", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductTextsView extends LinearLayout implements f9f0 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", ProductTextsView.class), b64.x(qoi0.a, ProductTextsView.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0)};

    /* renamed from: subtitleTextView$delegate, reason: from kotlin metadata */
    private final wv5 subtitleTextView;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    private final wv5 titleTextView;

    public ProductTextsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.titleTextView = new wv5(new h9f0(this, p9h0.title_text_view, 0));
        this.subtitleTextView = new wv5(new h9f0(this, p9h0.subtitle_text_view, 1));
        bb1.v(this, ylh0.acquisition_sdk_view_product_texts, true);
        setOrientation(1);
    }

    @Override // defpackage.f9f0
    public TextView getSubtitleTextView() {
        return (TextView) this.subtitleTextView.a($$delegatedProperties[1]);
    }

    @Override // defpackage.f9f0
    public TextView getTitleTextView() {
        return (TextView) this.titleTextView.a($$delegatedProperties[0]);
    }

    @Override // defpackage.f9f0
    public View getView() {
        return this;
    }

    public ProductTextsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ProductTextsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ ProductTextsView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public ProductTextsView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
