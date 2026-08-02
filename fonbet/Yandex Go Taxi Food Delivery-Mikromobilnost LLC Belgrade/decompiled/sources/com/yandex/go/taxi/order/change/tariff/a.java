package com.yandex.go.taxi.order.change.tariff;

import android.content.Context;
import com.yandex.go.taxi.order.change.common.notification.ChangeOrderItemNotification;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.f1h0;
import defpackage.ju8;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ob9;
import defpackage.sg9;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wz1;
import defpackage.yxx0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a implements sg9 {
    public final Context a;
    public final tj60 b;
    public final tt2 c;
    public final e d;
    public final yxx0 e;

    public a(Context context, tj60 tj60Var, tt2 tt2Var, e eVar, yxx0 yxx0Var) {
        this.a = context;
        this.b = tj60Var;
        this.c = tt2Var;
        this.d = eVar;
        this.e = yxx0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r0 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r0 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o2y0 o2y0Var, com.yandex.go.taxi.order.models.api.e eVar, ContinuationImpl continuationImpl) {
        ChangeTariffNotificationInteractorImpl$handleNotification$1 changeTariffNotificationInteractorImpl$handleNotification$1;
        int i;
        OrderChangesDto.Notification notification;
        String str;
        Object k0;
        OrderChangesDto.Notification notification2;
        String str2;
        Object k02;
        if (continuationImpl instanceof ChangeTariffNotificationInteractorImpl$handleNotification$1) {
            changeTariffNotificationInteractorImpl$handleNotification$1 = (ChangeTariffNotificationInteractorImpl$handleNotification$1) continuationImpl;
            int i2 = changeTariffNotificationInteractorImpl$handleNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeTariffNotificationInteractorImpl$handleNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeTariffNotificationInteractorImpl$handleNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeTariffNotificationInteractorImpl$handleNotification$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        String str3 = (String) changeTariffNotificationInteractorImpl$handleNotification$1.L$3;
                        notification2 = (OrderChangesDto.Notification) changeTariffNotificationInteractorImpl$handleNotification$1.L$2;
                        o2y0 o2y0Var2 = (o2y0) changeTariffNotificationInteractorImpl$handleNotification$1.L$0;
                        b.b(obj);
                        str2 = str3;
                        o2y0Var = o2y0Var2;
                        k02 = obj;
                        c(o2y0Var, true);
                        b(str2, notification2.c, (ob9) k02);
                        return zy11Var;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) changeTariffNotificationInteractorImpl$handleNotification$1.L$3;
                    notification = (OrderChangesDto.Notification) changeTariffNotificationInteractorImpl$handleNotification$1.L$2;
                    o2y0 o2y0Var3 = (o2y0) changeTariffNotificationInteractorImpl$handleNotification$1.L$0;
                    b.b(obj);
                    str = str4;
                    o2y0Var = o2y0Var3;
                    k0 = obj;
                    c(o2y0Var, false);
                    b(str, notification.c, (ob9) k0);
                    return zy11Var;
                }
                b.b(obj);
                boolean z = eVar instanceof ChangeOrderState$Success;
                tt2 tt2Var = this.c;
                if (z) {
                    notification2 = ((ChangeOrderState$Success) eVar).c;
                    if (notification2 != null) {
                        str2 = notification2.b;
                        if (str2.length() != 0) {
                            String str5 = notification2.a;
                            int i3 = f1h0.ic_success_change;
                            changeTariffNotificationInteractorImpl$handleNotification$1.L$0 = o2y0Var;
                            changeTariffNotificationInteractorImpl$handleNotification$1.L$1 = null;
                            changeTariffNotificationInteractorImpl$handleNotification$1.L$2 = notification2;
                            changeTariffNotificationInteractorImpl$handleNotification$1.L$3 = str2;
                            changeTariffNotificationInteractorImpl$handleNotification$1.label = 1;
                            tt2Var.getClass();
                            sjh sjhVar = uyj.a;
                            k02 = tje.k0(mdh.b, new ChangeTariffNotificationInteractorImpl$downloadIcon$2(this, str5, i3, null), changeTariffNotificationInteractorImpl$handleNotification$1);
                        }
                    }
                    return zy11Var;
                }
                if (!(eVar instanceof ChangeOrderState$Failure)) {
                    if ((eVar instanceof ChangeOrderState$Pending) || (eVar instanceof ChangeOrderState$Unavailable)) {
                        this.b.c("TariffChangeNotification");
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                notification = ((ChangeOrderState$Failure) eVar).c;
                if (notification != null) {
                    str = notification.b;
                    if (str.length() != 0) {
                        String str6 = notification.a;
                        int i4 = f1h0.ic_failed_change;
                        changeTariffNotificationInteractorImpl$handleNotification$1.L$0 = o2y0Var;
                        changeTariffNotificationInteractorImpl$handleNotification$1.L$1 = null;
                        changeTariffNotificationInteractorImpl$handleNotification$1.L$2 = notification;
                        changeTariffNotificationInteractorImpl$handleNotification$1.L$3 = str;
                        changeTariffNotificationInteractorImpl$handleNotification$1.label = 2;
                        tt2Var.getClass();
                        sjh sjhVar2 = uyj.a;
                        k0 = tje.k0(mdh.b, new ChangeTariffNotificationInteractorImpl$downloadIcon$2(this, str6, i4, null), changeTariffNotificationInteractorImpl$handleNotification$1);
                    }
                }
                return zy11Var;
            }
        }
        changeTariffNotificationInteractorImpl$handleNotification$1 = new ChangeTariffNotificationInteractorImpl$handleNotification$1(this, continuationImpl);
        Object obj2 = changeTariffNotificationInteractorImpl$handleNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeTariffNotificationInteractorImpl$handleNotification$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final void b(String str, String str2, ob9 ob9Var) {
        if (str.length() == 0) {
            return;
        }
        ChangeOrderItemNotification changeOrderItemNotification = new ChangeOrderItemNotification(this.a, "TariffChangeNotification", str, str2, ob9Var, ChangeOrderNotificationActionResponse.NONE);
        c.z(new ju8(17, this), changeOrderItemNotification);
        this.b.e(changeOrderItemNotification);
        changeOrderItemNotification.setExpiresListener(new wz1(3, this));
        changeOrderItemNotification.startExpiresTimer(5000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(o2y0 o2y0Var, boolean z) {
        List list;
        String str = o2y0Var.b().a;
        TariffsSuggestDto tariffsSuggestDto = o2y0Var.b().V().v0;
        EmptyList emptyList = null;
        String str2 = tariffsSuggestDto != null ? tariffsSuggestDto.e : null;
        TariffsSuggestDto tariffsSuggestDto2 = o2y0Var.b().V().v0;
        if (tariffsSuggestDto2 != null && (list = tariffsSuggestDto2.c) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((TariffsSuggestDto.TariffDetailsDto) obj).g) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TariffsSuggestDto.TariffDetailsDto) it.next()).a);
            }
            emptyList = arrayList2;
        }
        if (emptyList == null) {
            emptyList = EmptyList.a;
        }
        if (str2 != null) {
            yxx0 yxx0Var = this.e;
            if (z) {
                yxx0.b(yxx0Var, str, emptyList, str2);
            } else {
                yxx0.c(yxx0Var, str, emptyList, str2);
            }
        }
    }
}
