package com.yandex.go.taxi.order.cancel.similar.notification;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.f1h0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ob9;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final tj60 b;
    public final e c;
    public final tt2 d;

    public a(Context context, tj60 tj60Var, e eVar, tt2 tt2Var) {
        this.a = context;
        this.b = tj60Var;
        this.c = eVar;
        this.d = tt2Var;
    }

    public static Object b(a aVar, String str, String str2, ob9 ob9Var, Continuation continuation) {
        aVar.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new CancelSimilarOrdersNotificationInteractor$showNotification$2(aVar, str, str2, ob9Var, 5000L, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChangeOrderState$Success changeOrderState$Success, ContinuationImpl continuationImpl) {
        CancelSimilarOrdersNotificationInteractor$handleNotification$1 cancelSimilarOrdersNotificationInteractor$handleNotification$1;
        int i;
        OrderChangesDto.Notification notification;
        String str;
        if (continuationImpl instanceof CancelSimilarOrdersNotificationInteractor$handleNotification$1) {
            cancelSimilarOrdersNotificationInteractor$handleNotification$1 = (CancelSimilarOrdersNotificationInteractor$handleNotification$1) continuationImpl;
            int i2 = cancelSimilarOrdersNotificationInteractor$handleNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelSimilarOrdersNotificationInteractor$handleNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelSimilarOrdersNotificationInteractor$handleNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelSimilarOrdersNotificationInteractor$handleNotification$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    tt2 tt2Var = this.d;
                    if (changeOrderState$Success == null) {
                        w511.b();
                        return null;
                    }
                    notification = changeOrderState$Success.c;
                    if (notification != null) {
                        str = notification.b;
                        if (str.length() != 0) {
                            String str2 = notification.a;
                            int i3 = f1h0.ic_success_change;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$0 = null;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$1 = notification;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$2 = str;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.label = 1;
                            tt2Var.getClass();
                            sjh sjhVar = uyj.a;
                            obj = tje.k0(mdh.b, new CancelSimilarOrdersNotificationInteractor$downloadIcon$2(this, str2, i3, null), cancelSimilarOrdersNotificationInteractor$handleNotification$1);
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            String str3 = (String) cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$2;
                            OrderChangesDto.Notification notification2 = (OrderChangesDto.Notification) cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$1;
                            b.b(obj);
                            String str4 = notification2.c;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$0 = null;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$1 = null;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$2 = null;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$3 = null;
                            cancelSimilarOrdersNotificationInteractor$handleNotification$1.label = 4;
                            return b(this, str3, str4, (ob9) obj, cancelSimilarOrdersNotificationInteractor$handleNotification$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    b.b(obj);
                    return zy11Var;
                }
                str = (String) cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$2;
                notification = (OrderChangesDto.Notification) cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$1;
                b.b(obj);
                String str5 = notification.c;
                cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$0 = null;
                cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$1 = null;
                cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$2 = null;
                cancelSimilarOrdersNotificationInteractor$handleNotification$1.L$3 = null;
                cancelSimilarOrdersNotificationInteractor$handleNotification$1.label = 2;
                if (b(this, str, str5, (ob9) obj, cancelSimilarOrdersNotificationInteractor$handleNotification$1) == coroutineSingletons) {
                }
            }
        }
        cancelSimilarOrdersNotificationInteractor$handleNotification$1 = new CancelSimilarOrdersNotificationInteractor$handleNotification$1(this, continuationImpl);
        Object obj2 = cancelSimilarOrdersNotificationInteractor$handleNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelSimilarOrdersNotificationInteractor$handleNotification$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
