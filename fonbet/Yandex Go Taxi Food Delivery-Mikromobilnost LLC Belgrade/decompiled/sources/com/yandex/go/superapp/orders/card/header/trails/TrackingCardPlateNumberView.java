package com.yandex.go.superapp.orders.card.header.trails;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.go.superapp.plate_number.PlateNumberView;
import defpackage.wuc0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/trails/TrackingCardPlateNumberView;", "Lcom/yandex/go/superapp/plate_number/PlateNumberView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardPlateNumberView extends PlateNumberView {
    public /* synthetic */ TrackingCardPlateNumberView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TrackingCardPlateNumberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackingCardPlateNumberView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TrackingCardPlateNumberView(Context context, AttributeSet attributeSet, int i) {
        super(wuc0.d, context, attributeSet, i, 0, 16, null);
    }
}
