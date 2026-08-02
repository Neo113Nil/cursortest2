package com.yandex.go.taxi.order.communications.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.dzg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.summary.promotions.ui.PromotionCircularProgressView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/taxi/order/communications/view/PromoCounterTrailView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "current", "total", "Lzy11;", "bind", "(II)V", "Lru/yandex/taxi/summary/promotions/ui/PromotionCircularProgressView;", "progressView", "Lru/yandex/taxi/summary/promotions/ui/PromotionCircularProgressView;", "Landroidx/appcompat/widget/AppCompatImageView;", "arrowView", "Landroidx/appcompat/widget/AppCompatImageView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoCounterTrailView extends LinearLayout {
    public static final int $stable = 8;
    private final AppCompatImageView arrowView;
    private final PromotionCircularProgressView progressView;

    public PromoCounterTrailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PromotionCircularProgressView promotionCircularProgressView = new PromotionCircularProgressView(context, null, 0, 6, null);
        this.progressView = promotionCircularProgressView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(dzg0.chevron_next);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMain, appCompatImageView.getContext())));
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams((int) tje.x(appCompatImageView.getContext(), 24.0f), (int) tje.x(appCompatImageView.getContext(), 24.0f)));
        int x = (int) tje.x(appCompatImageView.getContext(), 7.0f);
        appCompatImageView.setPadding(x, x, x, x);
        this.arrowView = appCompatImageView;
        setOrientation(0);
        setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) tje.x(getContext(), 6.0f));
        layoutParams.setMarginEnd((int) tje.x(getContext(), 6.0f));
        setLayoutParams(layoutParams);
        addView(promotionCircularProgressView);
        addView(appCompatImageView);
    }

    public final void bind(int current, int total) {
        this.progressView.setProgress(current, total);
    }

    public PromoCounterTrailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PromoCounterTrailView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PromoCounterTrailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
