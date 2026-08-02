package com.yandex.go.transfer_requirement.ui.flight_input;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/flight_input/FlightNumberInputComponent;", "Lru/yandex/taxi/design/AnimatedListItemInputComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorAttr", "Lzy11;", "setDividerColor", "(I)V", "", "animated", "applyState", "(Z)V", "dividerColorAttr", "Ljava/lang/Integer;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlightNumberInputComponent extends AnimatedListItemInputComponent {
    private Integer dividerColorAttr;

    public /* synthetic */ FlightNumberInputComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.animatedListItemInputComponentStyle : i);
    }

    @Override // ru.yandex.taxi.design.AnimatedListItemInputComponent
    public void applyState(boolean animated) {
        super.applyState(animated);
        Integer num = this.dividerColorAttr;
        if (num != null) {
            getBottomDivider().updateColorAttr(num.intValue());
        }
    }

    public final void setDividerColor(int colorAttr) {
        this.dividerColorAttr = Integer.valueOf(colorAttr);
        getBottomDivider().updateColorAttr(colorAttr);
    }

    public FlightNumberInputComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FlightNumberInputComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FlightNumberInputComponent(Context context) {
        this(context, null, 0, 6, null);
    }
}
