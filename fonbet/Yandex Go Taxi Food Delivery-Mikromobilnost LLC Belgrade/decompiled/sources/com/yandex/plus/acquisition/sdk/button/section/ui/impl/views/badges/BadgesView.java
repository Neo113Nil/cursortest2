package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b64;
import defpackage.bb1;
import defpackage.kgx;
import defpackage.lvg0;
import defpackage.mvg0;
import defpackage.p9h0;
import defpackage.ppg0;
import defpackage.qoi0;
import defpackage.vng;
import defpackage.wv5;
import defpackage.xn4;
import defpackage.ylh0;
import defpackage.zn4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/badges/BadgesView;", "Landroid/widget/LinearLayout;", "Lxn4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "createPointsBadgeDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/shapes/RoundRectShape;", "roundRectShape", "color", "blurRadius", "createShadowDrawable", "(Landroid/graphics/drawable/shapes/RoundRectShape;II)Landroid/graphics/drawable/Drawable;", "createContentDrawable", "(Landroid/graphics/drawable/shapes/RoundRectShape;I)Landroid/graphics/drawable/Drawable;", "Landroid/widget/TextView;", "discountBadgeTextView$delegate", "Lwv5;", "getDiscountBadgeTextView", "()Landroid/widget/TextView;", "discountBadgeTextView", "plusPointsBadgeContainer$delegate", "getPlusPointsBadgeContainer", "()Landroid/widget/LinearLayout;", "plusPointsBadgeContainer", "plusPointsBadgeTextView$delegate", "getPlusPointsBadgeTextView", "plusPointsBadgeTextView", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "acquisition-sdk-button-section-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BadgesView extends LinearLayout implements xn4 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("discountBadgeTextView", 0, "getDiscountBadgeTextView()Landroid/widget/TextView;", BadgesView.class), b64.x(qoi0.a, BadgesView.class, "plusPointsBadgeContainer", "getPlusPointsBadgeContainer()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl("plusPointsBadgeTextView", 0, "getPlusPointsBadgeTextView()Landroid/widget/TextView;", BadgesView.class)};

    /* renamed from: discountBadgeTextView$delegate, reason: from kotlin metadata */
    private final wv5 discountBadgeTextView;

    /* renamed from: plusPointsBadgeContainer$delegate, reason: from kotlin metadata */
    private final wv5 plusPointsBadgeContainer;

    /* renamed from: plusPointsBadgeTextView$delegate, reason: from kotlin metadata */
    private final wv5 plusPointsBadgeTextView;

    public BadgesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int s;
        int i3;
        this.discountBadgeTextView = new wv5(new zn4(this, p9h0.discount_badge_text_view, 0));
        this.plusPointsBadgeContainer = new wv5(new zn4(this, p9h0.plus_points_badge_container, 1));
        this.plusPointsBadgeTextView = new wv5(new zn4(this, p9h0.plus_points_badge_text_view, 2));
        bb1.v(this, ylh0.acquisition_sdk_view_badges, true);
        if (getOrientation() == 0) {
            setGravity(0);
            i3 = vng.s(mvg0.acquisition_sdk_dimension_size_50, context);
            s = 0;
        } else {
            setGravity(8388613);
            s = vng.s(mvg0.acquisition_sdk_dimension_size_50, context);
            i3 = 0;
        }
        TextView discountBadgeTextView = getDiscountBadgeTextView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getDiscountBadgeTextView().getLayoutParams().width, getDiscountBadgeTextView().getLayoutParams().height);
        layoutParams.setMarginEnd(i3);
        layoutParams.bottomMargin = s;
        discountBadgeTextView.setLayoutParams(layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        getPlusPointsBadgeContainer().setBackground(createPointsBadgeDrawable(context));
    }

    private final Drawable createContentDrawable(RoundRectShape roundRectShape, int color) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private final Drawable createPointsBadgeDrawable(Context context) {
        float s = vng.s(lvg0.acquisition_sdk_badge_corner_radius, context);
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{s, s, s, s, s, s, s, s}, null, null);
        return new LayerDrawable(new Drawable[]{createShadowDrawable(roundRectShape, context.getColor(ppg0.acquisition_sdk_color_shadow_main), vng.s(mvg0.acquisition_sdk_dimension_size_50, context)), createShadowDrawable(roundRectShape, context.getColor(ppg0.acquisition_sdk_color_shadow_secondary), vng.s(mvg0.acquisition_sdk_dimension_size_125, context)), createContentDrawable(roundRectShape, context.getColor(ppg0.acquisition_sdk_color_bg_brand))});
    }

    private final Drawable createShadowDrawable(RoundRectShape roundRectShape, int color, int blurRadius) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(color);
        shapeDrawable.getPaint().setShadowLayer(blurRadius, 0.0f, vng.s(mvg0.acquisition_sdk_dimension_size_15, getContext()), color);
        return shapeDrawable;
    }

    @Override // defpackage.xn4
    public TextView getDiscountBadgeTextView() {
        return (TextView) this.discountBadgeTextView.a($$delegatedProperties[0]);
    }

    @Override // defpackage.xn4
    public LinearLayout getPlusPointsBadgeContainer() {
        return (LinearLayout) this.plusPointsBadgeContainer.a($$delegatedProperties[1]);
    }

    @Override // defpackage.xn4
    public TextView getPlusPointsBadgeTextView() {
        return (TextView) this.plusPointsBadgeTextView.a($$delegatedProperties[2]);
    }

    @Override // defpackage.xn4
    public View getView() {
        return this;
    }

    public BadgesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BadgesView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ BadgesView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public BadgesView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
