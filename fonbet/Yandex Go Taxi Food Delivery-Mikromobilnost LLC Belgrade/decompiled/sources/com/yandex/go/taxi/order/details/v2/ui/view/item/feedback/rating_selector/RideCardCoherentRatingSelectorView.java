package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.kdc;
import defpackage.m810;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qdk0;
import defpackage.qke;
import defpackage.qvq;
import defpackage.s8o;
import defpackage.tje;
import defpackage.v8i0;
import defpackage.w7i0;
import defpackage.w8i0;
import defpackage.wug0;
import defpackage.wzx;
import defpackage.zkh0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010\u0015R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/rating_selector/RideCardCoherentRatingSelectorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rating", "Lzy11;", "setRating", "(I)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "updateHeader", "()V", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", C0553n3.g, "updateBackgroundOnSelect", "(Lru/yandex/taxi/utils/UiStateDrawableWrapper;)V", "Lw8i0;", "itemsDecoration", "updateItemsDecoration", "(Lw8i0;)V", "Lw7i0;", "listener", "addOnRatingBarChangeListener", "(Lw7i0;)V", "removeOnRatingBarChangeListener", "onAttachedToWindow", "onDetachedFromWindow", "Lwzx;", "binding", "Lwzx;", "ratingBarDefaultListener", "Lw7i0;", "Companion", "qdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCoherentRatingSelectorView extends GoLinearLayout {
    public static final int $stable = 8;
    public static final qdk0 Companion = new qdk0();
    private static final float RATING_TITLE_LINE_SPACE_MULTIPLIER = 0.85f;
    private final wzx binding;
    private final w7i0 ratingBarDefaultListener;

    public RideCardCoherentRatingSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_coherent_rating_selector, this);
        int i2 = p8h0.header;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i2, this);
        if (goLinearLayout != null) {
            i2 = p8h0.rating_bar;
            RatingBarComponent ratingBarComponent = (RatingBarComponent) cma1.O(i2, this);
            if (ratingBarComponent != null) {
                i2 = p8h0.rating_subtitle_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView != null) {
                    i2 = p8h0.rating_title_text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                    if (robotoTextView2 != null) {
                        this.binding = new wzx(this, goLinearLayout, ratingBarComponent, robotoTextView, robotoTextView2);
                        this.ratingBarDefaultListener = new qvq(this, context);
                        ratingBarComponent.setStarScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        robotoTextView2.setLineSpacing(0.0f, RATING_TITLE_LINE_SPACE_MULTIPLIER);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ratingBarDefaultListener$lambda$0(RideCardCoherentRatingSelectorView rideCardCoherentRatingSelectorView, Context context, float f, boolean z) {
        if (z) {
            rideCardCoherentRatingSelectorView.binding.c.startSelectionAnimation((int) f);
            qke.E(context, HapticController$Effect.CLICK_MEDIUM, false, 8);
        }
    }

    public final void addOnRatingBarChangeListener(w7i0 listener) {
        this.binding.c.addOnRatingBarChangeListener(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.c.addOnRatingBarChangeListener(this.ratingBarDefaultListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.binding.c.removeOnRatingBarChangeListener(this.ratingBarDefaultListener);
        this.binding.c.stopAnimation();
    }

    public final void removeOnRatingBarChangeListener(w7i0 listener) {
        this.binding.c.removeOnRatingBarChangeListener(listener);
    }

    public final void setRating(int rating) {
        wzx wzxVar = this.binding;
        if (m810.b(wzxVar.c.getCurrentRating()) != rating) {
            wzxVar.c.setRating(rating);
        }
    }

    public final void setSubtitle(CharSequence subtitle) {
        wzx wzxVar = this.binding;
        wzxVar.d.setText(subtitle);
        RobotoTextView robotoTextView = wzxVar.d;
        robotoTextView.setVisibility((subtitle == null || evu0.J(subtitle)) ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = wzxVar.e.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = robotoTextView.getVisibility() == 0 ? tje.r(wug0.coherent_rating_title_margin_bottom, getContext()) : 0;
        }
    }

    public final void setTitle(CharSequence title) {
        wzx wzxVar = this.binding;
        wzxVar.e.setText(title);
        wzxVar.e.setVisibility((title == null || evu0.J(title)) ? 8 : 0);
    }

    public final void updateBackgroundOnSelect(UiStateDrawableWrapper background) {
        this.binding.c.setSelectedStarsBackground(background != null ? background.getDrawable() : null);
    }

    public final void updateHeader() {
        wzx wzxVar = this.binding;
        wzxVar.b.setVisibility((wzxVar.e.getVisibility() == 0 || wzxVar.d.getVisibility() == 0) ? 0 : 8);
    }

    public final void updateItemsDecoration(w8i0 itemsDecoration) {
        wzx wzxVar = this.binding;
        if (itemsDecoration == null) {
            wzxVar.c.setDefaultStars();
            return;
        }
        v8i0 v8i0Var = itemsDecoration.a;
        kdc kdcVar = v8i0Var.b;
        if (kdcVar != null) {
            wzxVar.c.initWithLottieAnimation(s8o.m(kdcVar, getContext()));
        }
        wzxVar.c.setStarsDrawable(v8i0Var.a, itemsDecoration.b.a);
        wzxVar.c.setAnimationType(RatingBarComponent.AnimationType.ALL_SELECTED);
    }

    public RideCardCoherentRatingSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RideCardCoherentRatingSelectorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RideCardCoherentRatingSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
