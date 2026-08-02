package com.yandex.go.taxi.order.details.v2.ui.view.item.companion_buffer_serch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import defpackage.bts0;
import defpackage.grs0;
import defpackage.nek0;
import defpackage.tje;
import defpackage.wug0;
import defpackage.yss0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/companion_buffer_serch/RideCardCompanionBufferSearchView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILbts0;)V", "Lnek0;", "uiState", "Lzy11;", "render", "(Lnek0;)V", "Lyss0;", "headerItemView", "Lyss0;", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/companion_buffer_serch/BufferSearchAnimationItemView;", "bufferSearchAnimationItemView", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/companion_buffer_serch/BufferSearchAnimationItemView;", "headerItemViewHeight", CA20Status.STATUS_USER_I, "bufferViewHorizontalMargin", "bufferViewBottomMargin", "bufferSearchAnimationItemViewHeight", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCompanionBufferSearchView extends GoLinearLayout {
    public static final int $stable = 8;
    private final BufferSearchAnimationItemView bufferSearchAnimationItemView;
    private final int bufferSearchAnimationItemViewHeight;
    private final int bufferViewBottomMargin;
    private final int bufferViewHorizontalMargin;
    private final yss0 headerItemView;
    private final int headerItemViewHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionBufferSearchView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var) {
        super(context, attributeSet, i, 0, 8, null);
        int i2 = 0;
        AttributeSet attributeSet2 = null;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, attributeSet2, i2, ((grs0) bts0Var).a, 6, null);
        headerItemView$lambda$0(slotItemViewComponent);
        this.headerItemView = slotItemViewComponent;
        BufferSearchAnimationItemView bufferSearchAnimationItemView = new BufferSearchAnimationItemView(context, attributeSet2, i2, 6, null);
        this.bufferSearchAnimationItemView = bufferSearchAnimationItemView;
        int r = tje.r(wug0.companion_buffer_header_height, getContext());
        this.headerItemViewHeight = r;
        int r2 = tje.r(wug0.companion_buffer_search_horizontal_margin, getContext());
        this.bufferViewHorizontalMargin = r2;
        int r3 = tje.r(wug0.companion_buffer_search_bottom_margin, getContext());
        this.bufferViewBottomMargin = r3;
        int r4 = tje.r(wug0.companion_buffer_search_cursor_size, getContext());
        this.bufferSearchAnimationItemViewHeight = r4;
        addView(slotItemViewComponent.asView(), new LinearLayout.LayoutParams(-1, r));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, r4);
        marginLayoutParams.setMargins(r2, 0, r2, r3);
        setImportantForAccessibility(2);
        addView(bufferSearchAnimationItemView, marginLayoutParams);
    }

    private static final zy11 headerItemView$lambda$0(View view) {
        return zy11.a;
    }

    public final void render(nek0 uiState) {
        this.headerItemView.renderBody(uiState.c.b);
        this.bufferSearchAnimationItemView.render(uiState.d);
    }

    public RideCardCompanionBufferSearchView(Context context, AttributeSet attributeSet, bts0 bts0Var) {
        this(context, attributeSet, 0, bts0Var, 4, null);
    }

    public RideCardCompanionBufferSearchView(Context context, bts0 bts0Var) {
        this(context, null, 0, bts0Var, 6, null);
    }

    public /* synthetic */ RideCardCompanionBufferSearchView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bts0Var);
    }
}
