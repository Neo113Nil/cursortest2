package com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import defpackage.bts0;
import defpackage.grs0;
import defpackage.tje;
import defpackage.yss0;
import defpackage.zlk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/progress_bar/RideCardProgressBarItemView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILbts0;)V", "Lzlk0;", "progressBarData", "Lzy11;", "setProgressBar", "(Lzlk0;)V", "Lyss0;", "slotItem", "Lyss0;", "getSlotItem", "()Lyss0;", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/progress_bar/ProgressBarView;", "progressBar", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/progress_bar/ProgressBarView;", "getProgressBar", "()Lcom/yandex/go/taxi/order/details/v2/ui/view/item/progress_bar/ProgressBarView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardProgressBarItemView extends GoFrameLayout {
    public static final int $stable = 8;
    private final ProgressBarView progressBar;
    private final yss0 slotItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardProgressBarItemView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var) {
        super(context, attributeSet, i, 0, 8, null);
        int i2 = 0;
        AttributeSet attributeSet2 = null;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, attributeSet2, i2, ((grs0) bts0Var).a, 6, null);
        slotItem$lambda$0(slotItemViewComponent);
        addView(slotItemViewComponent.asView());
        this.slotItem = slotItemViewComponent;
        ProgressBarView progressBarView = new ProgressBarView(context, attributeSet2, i2, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        progressBarView.setLayoutParams(layoutParams);
        progressBarView.setPadding(tje.u(4, progressBarView.getContext()), 0, tje.u(4, progressBarView.getContext()), 0);
        addView(progressBarView);
        this.progressBar = progressBarView;
    }

    private static final zy11 slotItem$lambda$0(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return zy11.a;
    }

    public final ProgressBarView getProgressBar() {
        return this.progressBar;
    }

    public final yss0 getSlotItem() {
        return this.slotItem;
    }

    public final void setProgressBar(zlk0 progressBarData) {
        long j = progressBarData.d;
        this.progressBar.setStrokeColorAttr(progressBarData.b);
        this.progressBar.setIncrease(progressBarData.c);
        this.progressBar.start(j - progressBarData.a, j, false, System.currentTimeMillis());
    }

    public /* synthetic */ RideCardProgressBarItemView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bts0Var);
    }
}
