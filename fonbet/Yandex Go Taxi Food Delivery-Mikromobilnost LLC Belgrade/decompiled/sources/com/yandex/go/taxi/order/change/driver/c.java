package com.yandex.go.taxi.order.change.driver;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final Context a;
    public final tj60 b;
    public final e c;
    public final tt2 d;

    public c(Context context, tj60 tj60Var, e eVar, tt2 tt2Var) {
        this.a = context;
        this.b = tj60Var;
        this.c = eVar;
        this.d = tt2Var;
    }

    public static Object b(c cVar, String str, String str2, ob9 ob9Var, Continuation continuation) {
        cVar.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new ChangeDriverNotificationInteractor$showNotification$2(cVar, str, str2, ob9Var, 5000L, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.go.taxi.order.models.api.e eVar, ContinuationImpl continuationImpl) {
        ChangeDriverNotificationInteractor$handleNotification$1 changeDriverNotificationInteractor$handleNotification$1;
        int i;
        OrderChangesDto.Notification notification;
        String str;
        OrderChangesDto.Notification notification2;
        String str2;
        String str3;
        if (continuationImpl instanceof ChangeDriverNotificationInteractor$handleNotification$1) {
            changeDriverNotificationInteractor$handleNotification$1 = (ChangeDriverNotificationInteractor$handleNotification$1) continuationImpl;
            int i2 = changeDriverNotificationInteractor$handleNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeDriverNotificationInteractor$handleNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeDriverNotificationInteractor$handleNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeDriverNotificationInteractor$handleNotification$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = eVar instanceof ChangeOrderState$Success;
                    tt2 tt2Var = this.d;
                    if (z) {
                        OrderChangesDto.Notification notification3 = ((ChangeOrderState$Success) eVar).c;
                        if (notification3 != null) {
                            String str4 = notification3.b;
                            if (str4.length() != 0) {
                                String str5 = notification3.a;
                                int i3 = f1h0.ic_success_change;
                                changeDriverNotificationInteractor$handleNotification$1.L$0 = null;
                                changeDriverNotificationInteractor$handleNotification$1.L$1 = notification3;
                                changeDriverNotificationInteractor$handleNotification$1.L$2 = str4;
                                changeDriverNotificationInteractor$handleNotification$1.label = 1;
                                tt2Var.getClass();
                                sjh sjhVar = uyj.a;
                                Object k0 = tje.k0(mdh.b, new ChangeDriverNotificationInteractor$downloadIcon$2(this, str5, i3, null), changeDriverNotificationInteractor$handleNotification$1);
                                if (k0 != coroutineSingletons) {
                                    notification2 = notification3;
                                    str2 = str4;
                                    obj = k0;
                                    str3 = notification2.c;
                                    changeDriverNotificationInteractor$handleNotification$1.L$0 = null;
                                    changeDriverNotificationInteractor$handleNotification$1.L$1 = null;
                                    changeDriverNotificationInteractor$handleNotification$1.L$2 = null;
                                    changeDriverNotificationInteractor$handleNotification$1.L$3 = null;
                                    changeDriverNotificationInteractor$handleNotification$1.label = 2;
                                    if (b(this, str2, str3, (ob9) obj, changeDriverNotificationInteractor$handleNotification$1) != coroutineSingletons) {
                                    }
                                }
                            }
                        }
                    }
                    if (!(eVar instanceof ChangeOrderState$Failure)) {
                        if ((eVar instanceof ChangeOrderState$Pending) || (eVar instanceof ChangeOrderState$Unavailable)) {
                            this.b.c("ReorderItemNotification");
                            return zy11Var;
                        }
                        w511.b();
                        return null;
                    }
                    OrderChangesDto.Notification notification4 = ((ChangeOrderState$Failure) eVar).c;
                    if (notification4 != null) {
                        String str6 = notification4.b;
                        if (str6.length() != 0) {
                            String str7 = notification4.a;
                            int i4 = f1h0.ic_failed_change;
                            changeDriverNotificationInteractor$handleNotification$1.L$0 = null;
                            changeDriverNotificationInteractor$handleNotification$1.L$1 = notification4;
                            changeDriverNotificationInteractor$handleNotification$1.L$2 = str6;
                            changeDriverNotificationInteractor$handleNotification$1.label = 3;
                            tt2Var.getClass();
                            sjh sjhVar2 = uyj.a;
                            Object k02 = tje.k0(mdh.b, new ChangeDriverNotificationInteractor$downloadIcon$2(this, str7, i4, null), changeDriverNotificationInteractor$handleNotification$1);
                            if (k02 != coroutineSingletons) {
                                notification = notification4;
                                str = str6;
                                obj = k02;
                                String str8 = notification.c;
                                changeDriverNotificationInteractor$handleNotification$1.L$0 = null;
                                changeDriverNotificationInteractor$handleNotification$1.L$1 = null;
                                changeDriverNotificationInteractor$handleNotification$1.L$2 = null;
                                changeDriverNotificationInteractor$handleNotification$1.L$3 = null;
                                changeDriverNotificationInteractor$handleNotification$1.label = 4;
                                if (b(this, str, str8, (ob9) obj, changeDriverNotificationInteractor$handleNotification$1) != coroutineSingletons) {
                                }
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    str = (String) changeDriverNotificationInteractor$handleNotification$1.L$2;
                    notification = (OrderChangesDto.Notification) changeDriverNotificationInteractor$handleNotification$1.L$1;
                    kotlin.b.b(obj);
                    String str82 = notification.c;
                    changeDriverNotificationInteractor$handleNotification$1.L$0 = null;
                    changeDriverNotificationInteractor$handleNotification$1.L$1 = null;
                    changeDriverNotificationInteractor$handleNotification$1.L$2 = null;
                    changeDriverNotificationInteractor$handleNotification$1.L$3 = null;
                    changeDriverNotificationInteractor$handleNotification$1.label = 4;
                    return b(this, str, str82, (ob9) obj, changeDriverNotificationInteractor$handleNotification$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                str2 = (String) changeDriverNotificationInteractor$handleNotification$1.L$2;
                notification2 = (OrderChangesDto.Notification) changeDriverNotificationInteractor$handleNotification$1.L$1;
                kotlin.b.b(obj);
                str3 = notification2.c;
                changeDriverNotificationInteractor$handleNotification$1.L$0 = null;
                changeDriverNotificationInteractor$handleNotification$1.L$1 = null;
                changeDriverNotificationInteractor$handleNotification$1.L$2 = null;
                changeDriverNotificationInteractor$handleNotification$1.L$3 = null;
                changeDriverNotificationInteractor$handleNotification$1.label = 2;
                if (b(this, str2, str3, (ob9) obj, changeDriverNotificationInteractor$handleNotification$1) != coroutineSingletons) {
                }
            }
        }
        changeDriverNotificationInteractor$handleNotification$1 = new ChangeDriverNotificationInteractor$handleNotification$1(this, continuationImpl);
        Object obj2 = changeDriverNotificationInteractor$handleNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeDriverNotificationInteractor$handleNotification$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
