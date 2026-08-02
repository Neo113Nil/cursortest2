package com.yandex.go.taxi.order.change.source.interactor;

import android.content.Context;
import com.yandex.go.taxi.order.change.common.notification.ChangeOrderItemNotification;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.f1h0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ob9;
import defpackage.pm5;
import defpackage.sb0;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wz1;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class e {
    public final Context a;
    public final tj60 b;
    public final pm5 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final tt2 e;

    public e(Context context, tj60 tj60Var, pm5 pm5Var, ru.yandex.taxi.widget.utils.e eVar, tt2 tt2Var) {
        this.a = context;
        this.b = tj60Var;
        this.c = pm5Var;
        this.d = eVar;
        this.e = tt2Var;
    }

    public final Object a(String str, int i, Continuation continuation) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ChangeSourcePointNotificationInteractor$downloadIcon$2(this, str, i, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o2y0 o2y0Var, com.yandex.go.taxi.order.models.api.e eVar, ContinuationImpl continuationImpl) {
        ChangeSourcePointNotificationInteractor$handleNotification$1 changeSourcePointNotificationInteractor$handleNotification$1;
        int i;
        String str;
        e eVar2;
        o2y0 o2y0Var2;
        String str2;
        String str3;
        e eVar3;
        o2y0 o2y0Var3;
        String str4;
        String str5;
        e eVar4;
        o2y0 o2y0Var4;
        String str6;
        String str7;
        OrderChangesDto.Notification notification;
        OrderChangesDto.Notification notification2;
        if (continuationImpl instanceof ChangeSourcePointNotificationInteractor$handleNotification$1) {
            changeSourcePointNotificationInteractor$handleNotification$1 = (ChangeSourcePointNotificationInteractor$handleNotification$1) continuationImpl;
            int i2 = changeSourcePointNotificationInteractor$handleNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointNotificationInteractor$handleNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointNotificationInteractor$handleNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointNotificationInteractor$handleNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (eVar instanceof ChangeOrderState$Success) {
                        OrderChangesDto.Notification notification3 = ((ChangeOrderState$Success) eVar).c;
                        String str8 = notification3 != null ? notification3.b : null;
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str9 = notification3 != null ? notification3.c : null;
                        String str10 = notification3 != null ? notification3.a : null;
                        int i3 = f1h0.ic_success_change;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$0 = null;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$1 = null;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$2 = this;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$3 = o2y0Var;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$4 = str8;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$5 = str9;
                        changeSourcePointNotificationInteractor$handleNotification$1.label = 1;
                        Object a = a(str10, i3, changeSourcePointNotificationInteractor$handleNotification$1);
                        if (a != coroutineSingletons) {
                            eVar4 = this;
                            o2y0Var4 = o2y0Var;
                            str6 = str8;
                            str7 = str9;
                            obj = a;
                            eVar4.c(o2y0Var4, str6, str7, (ob9) obj, ChangeOrderNotificationActionResponse.NONE);
                        }
                    } else if (eVar instanceof ChangeOrderState$Failure) {
                        OrderChangesDto.Notification notification4 = ((ChangeOrderState$Failure) eVar).c;
                        String str11 = notification4 != null ? notification4.b : null;
                        str = str11 != null ? str11 : "";
                        String str12 = notification4 != null ? notification4.c : null;
                        String str13 = notification4 != null ? notification4.a : null;
                        int i4 = f1h0.ic_failed_change;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$0 = null;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$1 = eVar;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$2 = this;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$3 = o2y0Var;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$4 = str;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$5 = str12;
                        changeSourcePointNotificationInteractor$handleNotification$1.label = 2;
                        obj = a(str13, i4, changeSourcePointNotificationInteractor$handleNotification$1);
                        if (obj != coroutineSingletons) {
                            eVar3 = this;
                            o2y0Var3 = o2y0Var;
                            str4 = str;
                            str5 = str12;
                            ob9 ob9Var = (ob9) obj;
                            notification = ((ChangeOrderState$Failure) eVar).c;
                            if (notification != null) {
                            }
                            ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse = ChangeOrderNotificationActionResponse.NONE;
                            eVar3.c(o2y0Var3, str4, str5, ob9Var, changeOrderNotificationActionResponse);
                        }
                    } else if (eVar instanceof ChangeOrderState$Pending) {
                        this.b.c("ChangeSourcePointNotification");
                    } else {
                        if (!(eVar instanceof ChangeOrderState$Unavailable)) {
                            w511.b();
                            return null;
                        }
                        OrderChangesDto.Notification notification5 = ((ChangeOrderState$Unavailable) eVar).b;
                        String str14 = notification5 != null ? notification5.b : null;
                        str = str14 != null ? str14 : "";
                        String str15 = notification5 != null ? notification5.c : null;
                        String str16 = notification5 != null ? notification5.a : null;
                        int i5 = f1h0.ic_failed_change;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$0 = null;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$1 = eVar;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$2 = this;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$3 = o2y0Var;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$4 = str;
                        changeSourcePointNotificationInteractor$handleNotification$1.L$5 = str15;
                        changeSourcePointNotificationInteractor$handleNotification$1.label = 3;
                        obj = a(str16, i5, changeSourcePointNotificationInteractor$handleNotification$1);
                        if (obj != coroutineSingletons) {
                            eVar2 = this;
                            o2y0Var2 = o2y0Var;
                            str2 = str;
                            str3 = str15;
                            ob9 ob9Var2 = (ob9) obj;
                            notification2 = ((ChangeOrderState$Unavailable) eVar).b;
                            if (notification2 != null) {
                            }
                            ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse2 = ChangeOrderNotificationActionResponse.NONE;
                            eVar2.c(o2y0Var2, str2, str3, ob9Var2, changeOrderNotificationActionResponse2);
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    String str17 = (String) changeSourcePointNotificationInteractor$handleNotification$1.L$5;
                    String str18 = (String) changeSourcePointNotificationInteractor$handleNotification$1.L$4;
                    o2y0 o2y0Var5 = (o2y0) changeSourcePointNotificationInteractor$handleNotification$1.L$3;
                    e eVar5 = (e) changeSourcePointNotificationInteractor$handleNotification$1.L$2;
                    kotlin.b.b(obj);
                    str7 = str17;
                    str6 = str18;
                    o2y0Var4 = o2y0Var5;
                    eVar4 = eVar5;
                    eVar4.c(o2y0Var4, str6, str7, (ob9) obj, ChangeOrderNotificationActionResponse.NONE);
                } else if (i == 2) {
                    String str19 = (String) changeSourcePointNotificationInteractor$handleNotification$1.L$5;
                    String str20 = (String) changeSourcePointNotificationInteractor$handleNotification$1.L$4;
                    o2y0 o2y0Var6 = (o2y0) changeSourcePointNotificationInteractor$handleNotification$1.L$3;
                    e eVar6 = (e) changeSourcePointNotificationInteractor$handleNotification$1.L$2;
                    com.yandex.go.taxi.order.models.api.e eVar7 = (com.yandex.go.taxi.order.models.api.e) changeSourcePointNotificationInteractor$handleNotification$1.L$1;
                    kotlin.b.b(obj);
                    str5 = str19;
                    str4 = str20;
                    o2y0Var3 = o2y0Var6;
                    eVar3 = eVar6;
                    eVar = eVar7;
                    ob9 ob9Var3 = (ob9) obj;
                    notification = ((ChangeOrderState$Failure) eVar).c;
                    if (notification != null || (changeOrderNotificationActionResponse = notification.d) == null) {
                        ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse3 = ChangeOrderNotificationActionResponse.NONE;
                    }
                    eVar3.c(o2y0Var3, str4, str5, ob9Var3, changeOrderNotificationActionResponse3);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str21 = (String) changeSourcePointNotificationInteractor$handleNotification$1.L$5;
                    String str22 = (String) changeSourcePointNotificationInteractor$handleNotification$1.L$4;
                    o2y0 o2y0Var7 = (o2y0) changeSourcePointNotificationInteractor$handleNotification$1.L$3;
                    e eVar8 = (e) changeSourcePointNotificationInteractor$handleNotification$1.L$2;
                    com.yandex.go.taxi.order.models.api.e eVar9 = (com.yandex.go.taxi.order.models.api.e) changeSourcePointNotificationInteractor$handleNotification$1.L$1;
                    kotlin.b.b(obj);
                    str3 = str21;
                    str2 = str22;
                    o2y0Var2 = o2y0Var7;
                    eVar2 = eVar8;
                    eVar = eVar9;
                    ob9 ob9Var22 = (ob9) obj;
                    notification2 = ((ChangeOrderState$Unavailable) eVar).b;
                    if (notification2 != null || (changeOrderNotificationActionResponse2 = notification2.d) == null) {
                        ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse22 = ChangeOrderNotificationActionResponse.NONE;
                    }
                    eVar2.c(o2y0Var2, str2, str3, ob9Var22, changeOrderNotificationActionResponse22);
                }
                return zy11.a;
            }
        }
        changeSourcePointNotificationInteractor$handleNotification$1 = new ChangeSourcePointNotificationInteractor$handleNotification$1(this, continuationImpl);
        Object obj2 = changeSourcePointNotificationInteractor$handleNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointNotificationInteractor$handleNotification$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void c(o2y0 o2y0Var, String str, String str2, ob9 ob9Var, ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse) {
        if (str.length() == 0) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        ChangeOrderItemNotification changeOrderItemNotification = new ChangeOrderItemNotification(this.a, "ChangeSourcePointNotification", str, str2, ob9Var, changeOrderNotificationActionResponse);
        ru.yandex.taxi.design.utils.c.z(new sb0(10, this, o2y0Var, changeOrderNotificationActionResponse), changeOrderItemNotification);
        this.b.e(changeOrderItemNotification);
        changeOrderItemNotification.setExpiresListener(new wz1(2, this));
        changeOrderItemNotification.startExpiresTimer(5000L);
    }
}
