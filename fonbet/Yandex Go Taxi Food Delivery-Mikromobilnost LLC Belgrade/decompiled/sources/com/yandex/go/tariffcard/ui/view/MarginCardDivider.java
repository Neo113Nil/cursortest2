package com.yandex.go.tariffcard.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yandex.go.design.divider.CardDivider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\n2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/tariffcard/ui/view/MarginCardDivider;", "Lcom/yandex/go/design/divider/CardDivider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyMargins", "()V", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "top", "bottom", "updateMargins", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "originalTopMargin", "Ljava/lang/Integer;", "originalBottomMargin", "localTopMargin", "localBottomMargin", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarginCardDivider extends CardDivider {
    private Integer localBottomMargin;
    private Integer localTopMargin;
    private Integer originalBottomMargin;
    private Integer originalTopMargin;

    public /* synthetic */ MarginCardDivider(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void applyMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Integer num = this.originalTopMargin;
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = this.localTopMargin;
            marginLayoutParams.topMargin = intValue + (num2 != null ? num2.intValue() : 0);
            Integer num3 = this.originalBottomMargin;
            int intValue2 = num3 != null ? num3.intValue() : 0;
            Integer num4 = this.localBottomMargin;
            marginLayoutParams.bottomMargin = intValue2 + (num4 != null ? num4.intValue() : 0);
        }
    }

    public static /* synthetic */ void updateMargins$default(MarginCardDivider marginCardDivider, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        marginCardDivider.updateMargins(num, num2);
    }

    @Override // com.yandex.go.design.divider.CardDivider, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        boolean z = params instanceof ViewGroup.MarginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = z ? (ViewGroup.MarginLayoutParams) params : null;
        this.originalTopMargin = marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.topMargin) : null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = z ? (ViewGroup.MarginLayoutParams) params : null;
        this.originalBottomMargin = marginLayoutParams2 != null ? Integer.valueOf(marginLayoutParams2.bottomMargin) : null;
        applyMargins();
    }

    public final void updateMargins(Integer top, Integer bottom) {
        this.localTopMargin = top;
        this.localBottomMargin = bottom;
        applyMargins();
    }

    public MarginCardDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MarginCardDivider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MarginCardDivider(Context context) {
        this(context, null, 0, 6, null);
    }
}
