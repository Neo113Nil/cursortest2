package com.yandex.go.order.state.instructions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.vnm0;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/state/instructions/ScheduledOrderItemAction;", "", "Companion", "$serializer", "com/yandex/go/order/state/instructions/c", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ScheduledOrderItemAction {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(1)), null};
    public final ScheduledOrderItemActionType a;
    public final Calendar b;

    public /* synthetic */ ScheduledOrderItemAction(int i, ScheduledOrderItemActionType scheduledOrderItemActionType, Calendar calendar) {
        this.a = (i & 1) == 0 ? ScheduledOrderItemActionType.UNSUPPORTED : scheduledOrderItemActionType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = calendar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduledOrderItemAction)) {
            return false;
        }
        ScheduledOrderItemAction scheduledOrderItemAction = (ScheduledOrderItemAction) obj;
        return this.a == scheduledOrderItemAction.a && jl40.l(this.b, scheduledOrderItemAction.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Calendar calendar = this.b;
        return hashCode + (calendar == null ? 0 : calendar.hashCode());
    }

    public final String toString() {
        return "ScheduledOrderItemAction(type=" + this.a + ", timeSlot=" + this.b + Extension.C_BRAKE;
    }

    public ScheduledOrderItemAction(ScheduledOrderItemActionType scheduledOrderItemActionType, Calendar calendar) {
        this.a = scheduledOrderItemActionType;
        this.b = calendar;
    }

    public ScheduledOrderItemAction() {
        this(ScheduledOrderItemActionType.UNSUPPORTED, null);
    }
}
