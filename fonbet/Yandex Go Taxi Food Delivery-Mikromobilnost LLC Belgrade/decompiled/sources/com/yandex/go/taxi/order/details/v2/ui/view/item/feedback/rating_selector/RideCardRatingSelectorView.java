package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.c0y;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.kdc;
import defpackage.m810;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qke;
import defpackage.s8o;
import defpackage.v8i0;
import defpackage.w7i0;
import defpackage.w8i0;
import defpackage.x8i0;
import defpackage.zkh0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/rating_selector/RideCardRatingSelectorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rating", "Lzy11;", "setRating", "(I)V", "startSelectionAnimation", "", "hint", "setHint", "(Ljava/lang/String;)V", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", C0553n3.g, "updateBackgroundOnSelect", "(Lru/yandex/taxi/utils/UiStateDrawableWrapper;)V", "Lw8i0;", "itemsDecoration", "updateItemsDecoration", "(Lw8i0;)V", "Lw7i0;", "listener", "addOnRatingBarChangeListener", "(Lw7i0;)V", "removeOnRatingBarChangeListener", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lc0y;", "binding", "Lc0y;", "ratingBarDefaultListener", "Lw7i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardRatingSelectorView extends GoLinearLayout {
    public static final int $stable = 8;
    private final c0y binding;
    private final w7i0 ratingBarDefaultListener;

    public RideCardRatingSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_rating_selector, this);
        int i2 = p8h0.rating_bar;
        RatingBarComponent ratingBarComponent = (RatingBarComponent) cma1.O(i2, this);
        if (ratingBarComponent != null) {
            i2 = p8h0.rating_hint_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                this.binding = new c0y(this, ratingBarComponent, robotoTextView);
                this.ratingBarDefaultListener = new x8i0(1, context);
                ratingBarComponent.setStarScaleType(ImageView.ScaleType.CENTER_INSIDE);
                setOrientation(1);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ratingBarDefaultListener$lambda$0(Context context, float f, boolean z) {
        if (z) {
            qke.E(context, HapticController$Effect.CLICK_MEDIUM, false, 8);
        }
    }

    public final void addOnRatingBarChangeListener(w7i0 listener) {
        this.binding.b.addOnRatingBarChangeListener(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.b.addOnRatingBarChangeListener(this.ratingBarDefaultListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.binding.b.removeOnRatingBarChangeListener(this.ratingBarDefaultListener);
        this.binding.b.stopAnimation();
    }

    public final void removeOnRatingBarChangeListener(w7i0 listener) {
        this.binding.b.removeOnRatingBarChangeListener(listener);
    }

    public final void setHint(String hint) {
        this.binding.c.setText(hint);
        this.binding.c.setVisibility((hint == null || evu0.J(hint)) ? 8 : 0);
    }

    public final void setRating(int rating) {
        c0y c0yVar = this.binding;
        if (m810.b(c0yVar.b.getCurrentRating()) != rating) {
            c0yVar.b.setRating(rating);
        }
    }

    public final void startSelectionAnimation(int rating) {
        this.binding.b.startSelectionAnimation(rating);
    }

    public final void updateBackgroundOnSelect(UiStateDrawableWrapper background) {
        this.binding.b.setSelectedStarsBackground(background != null ? background.getDrawable() : null);
    }

    public final void updateItemsDecoration(w8i0 itemsDecoration) {
        c0y c0yVar = this.binding;
        if (itemsDecoration == null) {
            c0yVar.b.setDefaultStars();
            return;
        }
        v8i0 v8i0Var = itemsDecoration.a;
        kdc kdcVar = v8i0Var.b;
        if (kdcVar != null) {
            c0yVar.b.initWithLottieAnimation(s8o.m(kdcVar, getContext()));
        }
        c0yVar.b.setStarsDrawable(v8i0Var.a, itemsDecoration.b.a);
        c0yVar.b.setAnimationType(RatingBarComponent.AnimationType.ALL_SELECTED);
    }

    public RideCardRatingSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RideCardRatingSelectorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RideCardRatingSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
