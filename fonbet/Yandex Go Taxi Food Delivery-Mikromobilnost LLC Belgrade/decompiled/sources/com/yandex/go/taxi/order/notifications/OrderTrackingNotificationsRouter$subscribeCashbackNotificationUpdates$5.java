package com.yandex.go.taxi.order.notifications;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.payments.domain.l;
import com.yandex.go.plus.notification.CashbackTimedNotificationItem;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TextNotification;
import defpackage.a49;
import defpackage.c29;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.iu30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj60;
import defpackage.tls;
import defpackage.wls;
import defpackage.wrr;
import defpackage.xh60;
import defpackage.yf60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5", f = "OrderTrackingNotificationsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5 orderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5 = new OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5(this.this$0, continuation);
        orderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5.L$0 = obj;
        return orderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5 orderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5 = (OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        TaxiOrder taxiOrder = (TaxiOrder) pair.getFirst();
        boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
        wrr wrrVar = this.this$0.b;
        wrrVar.getClass();
        xh60 b = taxiOrder.V().P.b("cashback");
        if (b == null) {
            if (booleanValue) {
                wrrVar.g();
            }
        } else if (!taxiOrder.l.j) {
            c29 c29Var = (c29) wrrVar.x;
            TextNotification textNotification = (TextNotification) b.b;
            ief iefVar = taxiOrder.V().K;
            c29Var.getClass();
            String str = textNotification.a;
            CharSequence a = (str == null || iefVar == null) ? "" : ((l) c29Var.b).a(gwk0.h(iefVar), str);
            yf60 yf60Var = new yf60();
            yf60Var.a = a;
            CharSequence charSequence = yf60Var.a;
            a49 a49Var = (a49) wrrVar.y;
            final Context context = (Context) wrrVar.b;
            final String valueOf = String.valueOf(charSequence);
            final tj60 tj60Var = (tj60) wrrVar.w;
            final iu30 iu30Var = new iu30(26, wrrVar, taxiOrder);
            String str2 = a49Var.b.a().e.b;
            final int i = 0;
            tls tlsVar = new tls() { // from class: z39
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    tj60 tj60Var2 = tj60Var;
                    iu30 iu30Var2 = iu30Var;
                    String str3 = valueOf;
                    Context context2 = context;
                    switch (i2) {
                        case 0:
                            CashbackTimedNotificationItem cashbackTimedNotificationItem = new CashbackTimedNotificationItem(context2, str3, "CashbackNotification", null);
                            iu30Var2.invoke(cashbackTimedNotificationItem, cashbackTimedNotificationItem.getListItemComponent());
                            tj60Var2.e(cashbackTimedNotificationItem);
                            break;
                        default:
                            CashbackTimedNotificationItem cashbackTimedNotificationItem2 = new CashbackTimedNotificationItem(context2, str3, "CashbackNotification", (Bitmap) obj2);
                            iu30Var2.invoke(cashbackTimedNotificationItem2, cashbackTimedNotificationItem2.getListItemComponent());
                            tj60Var2.e(cashbackTimedNotificationItem2);
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i2 = 1;
            a49Var.a(str2, tlsVar, new tls() { // from class: z39
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    tj60 tj60Var2 = tj60Var;
                    iu30 iu30Var2 = iu30Var;
                    String str3 = valueOf;
                    Context context2 = context;
                    switch (i22) {
                        case 0:
                            CashbackTimedNotificationItem cashbackTimedNotificationItem = new CashbackTimedNotificationItem(context2, str3, "CashbackNotification", null);
                            iu30Var2.invoke(cashbackTimedNotificationItem, cashbackTimedNotificationItem.getListItemComponent());
                            tj60Var2.e(cashbackTimedNotificationItem);
                            break;
                        default:
                            CashbackTimedNotificationItem cashbackTimedNotificationItem2 = new CashbackTimedNotificationItem(context2, str3, "CashbackNotification", (Bitmap) obj2);
                            iu30Var2.invoke(cashbackTimedNotificationItem2, cashbackTimedNotificationItem2.getListItemComponent());
                            tj60Var2.e(cashbackTimedNotificationItem2);
                            break;
                    }
                    return zy11Var;
                }
            });
            r0 r0Var = (r0) wrrVar.z;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
        }
        return zy11.a;
    }
}
