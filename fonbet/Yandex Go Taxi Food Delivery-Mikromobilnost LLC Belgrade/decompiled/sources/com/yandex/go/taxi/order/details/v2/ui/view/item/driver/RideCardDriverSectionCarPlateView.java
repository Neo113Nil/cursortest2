package com.yandex.go.taxi.order.details.v2.ui.view.item.driver;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.b;
import com.yandex.go.superapp.plate_number.PlateNumberView;
import defpackage.bi;
import defpackage.kyh0;
import defpackage.vuc0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\tÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/driver/RideCardDriverSectionCarPlateView;", "Lcom/yandex/go/superapp/plate_number/PlateNumberView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSectionCarPlateView extends PlateNumberView {
    public static final int $stable = 8;

    public RideCardDriverSectionCarPlateView(Context context, AttributeSet attributeSet, int i) {
        super(vuc0.d, context, attributeSet, i, 0, 16, null);
        b.p(this, new bi(getContext().getString(kyh0.open_copy_menu), 1));
    }

    public RideCardDriverSectionCarPlateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RideCardDriverSectionCarPlateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RideCardDriverSectionCarPlateView(Context context) {
        this(context, null, 0, 6, null);
    }
}
