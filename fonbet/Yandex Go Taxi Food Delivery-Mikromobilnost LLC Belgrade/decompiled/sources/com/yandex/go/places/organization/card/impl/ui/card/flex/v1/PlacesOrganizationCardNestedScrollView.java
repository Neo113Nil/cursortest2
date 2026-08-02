package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v1/PlacesOrganizationCardNestedScrollView;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "threshold", "Lzy11;", "setThreshold", "(I)V", "Landroid/view/View;", "target", "dx", "dy", "", "consumed", "type", "onNestedPreScroll", "(Landroid/view/View;II[II)V", CA20Status.STATUS_USER_I, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlacesOrganizationCardNestedScrollView extends NestedScrollViewAdvanced {
    public static final int $stable = 8;
    private int threshold;

    public /* synthetic */ PlacesOrganizationCardNestedScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.core.widget.NestedScrollView, defpackage.tn50
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        int scrollY = getScrollY();
        int i = this.threshold;
        if (scrollY >= i) {
            super.onNestedPreScroll(target, dx, dy, consumed, type);
            return;
        }
        int i2 = i - scrollY;
        if (dy <= i2) {
            i2 = dy;
        }
        scrollBy(0, i2);
        consumed[1] = i2;
        if (dy - i2 != 0) {
            super.onNestedPreScroll(target, dx, dy, consumed, type);
            consumed[1] = consumed[1] + i2;
        }
    }

    public final void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public PlacesOrganizationCardNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlacesOrganizationCardNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PlacesOrganizationCardNestedScrollView(Context context) {
        this(context, null, 0, 6, null);
    }
}
