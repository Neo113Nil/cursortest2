package com.yandex.go.taxi.order.notifications;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$3 extends AdaptedFunctionReference implements zls {
    public static final OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$3 a = new OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$3(3, 4, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return new Pair((TaxiOrder) obj, bool);
    }
}
