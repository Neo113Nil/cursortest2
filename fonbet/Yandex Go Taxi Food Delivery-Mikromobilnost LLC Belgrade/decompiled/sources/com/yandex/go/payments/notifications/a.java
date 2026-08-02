package com.yandex.go.payments.notifications;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.data.model.response.PaymentsNotification;
import com.yandex.go.payments.data.model.response.j1;
import defpackage.g9a0;
import defpackage.k7x0;
import defpackage.lz60;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qn5;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.x3z;
import defpackage.y50;
import defpackage.yj70;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

/* loaded from: classes8.dex */
public final class a implements lz60 {
    public final Context a;
    public final Lifecycle b;
    public final tse c;
    public final tj60 d;
    public final d e;
    public final k7x0 f;
    public final g9a0 g;
    public final pav h;
    public final tt2 i;
    public final y50 j;
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();

    public a(Context context, Lifecycle lifecycle, tse tseVar, tj60 tj60Var, d dVar, k7x0 k7x0Var, g9a0 g9a0Var, pav pavVar, tt2 tt2Var, y50 y50Var) {
        this.a = context;
        this.b = lifecycle;
        this.c = tseVar;
        this.d = tj60Var;
        this.e = dVar;
        this.f = k7x0Var;
        this.g = g9a0Var;
        this.h = pavVar;
        this.i = tt2Var;
        this.j = y50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a aVar, List list, LinkedHashSet linkedHashSet, Continuation continuation) {
        PaymentsNotificationController$syncNotifications$1 paymentsNotificationController$syncNotifications$1;
        int i;
        Iterator it;
        Set set;
        aVar.getClass();
        if (continuation instanceof PaymentsNotificationController$syncNotifications$1) {
            paymentsNotificationController$syncNotifications$1 = (PaymentsNotificationController$syncNotifications$1) continuation;
            int i2 = paymentsNotificationController$syncNotifications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsNotificationController$syncNotifications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsNotificationController$syncNotifications$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsNotificationController$syncNotifications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet2.add(((PaymentsNotification) it2.next()).getA());
                    }
                    for (String str : v4r0.g(linkedHashSet, linkedHashSet2)) {
                        aVar.d.c(str);
                        linkedHashSet.remove(str);
                    }
                    it = list2.iterator();
                    set = linkedHashSet;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) paymentsNotificationController$syncNotifications$1.L$5;
                    Set set2 = (Set) paymentsNotificationController$syncNotifications$1.L$1;
                    kotlin.b.b(obj);
                    set = set2;
                }
                while (it.hasNext()) {
                    PaymentsNotification paymentsNotification = (PaymentsNotification) it.next();
                    paymentsNotificationController$syncNotifications$1.L$0 = null;
                    paymentsNotificationController$syncNotifications$1.L$1 = set;
                    paymentsNotificationController$syncNotifications$1.L$2 = null;
                    paymentsNotificationController$syncNotifications$1.L$3 = null;
                    paymentsNotificationController$syncNotifications$1.L$4 = null;
                    paymentsNotificationController$syncNotifications$1.L$5 = it;
                    paymentsNotificationController$syncNotifications$1.L$6 = null;
                    paymentsNotificationController$syncNotifications$1.L$7 = null;
                    paymentsNotificationController$syncNotifications$1.label = 1;
                    if (aVar.i(paymentsNotification, set, paymentsNotificationController$syncNotifications$1) == obj2) {
                        return obj2;
                    }
                }
                return zy11.a;
            }
        }
        paymentsNotificationController$syncNotifications$1 = new PaymentsNotificationController$syncNotifications$1(aVar, continuation);
        Object obj3 = paymentsNotificationController$syncNotifications$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsNotificationController$syncNotifications$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    @Override // defpackage.lz60
    public final void g() {
        PaymentsNotificationController$onLargestContentfulPaint$1 paymentsNotificationController$onLargestContentfulPaint$1 = new PaymentsNotificationController$onLargestContentfulPaint$1(this, null);
        tse tseVar = this.c;
        tje.N(tseVar, null, null, paymentsNotificationController$onLargestContentfulPaint$1, 3);
        tje.N(tseVar, null, null, new PaymentsNotificationController$onLargestContentfulPaint$2(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PaymentsNotificationController";
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        if (r2 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(PaymentsNotification paymentsNotification, Set set, ContinuationImpl continuationImpl) {
        PaymentsNotificationController$showNotificationIfNeed$1 paymentsNotificationController$showNotificationIfNeed$1;
        int i;
        Set set2;
        boolean booleanValue;
        PaymentsNotification paymentsNotification2;
        Set set3;
        String a;
        PaymentsNotification paymentsNotification3 = paymentsNotification;
        if (continuationImpl instanceof PaymentsNotificationController$showNotificationIfNeed$1) {
            paymentsNotificationController$showNotificationIfNeed$1 = (PaymentsNotificationController$showNotificationIfNeed$1) continuationImpl;
            int i2 = paymentsNotificationController$showNotificationIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsNotificationController$showNotificationIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsNotificationController$showNotificationIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsNotificationController$showNotificationIfNeed$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.i.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1 paymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1 = new PaymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1(this, paymentsNotification3, null);
                    paymentsNotificationController$showNotificationIfNeed$1.L$0 = paymentsNotification3;
                    set2 = set;
                    paymentsNotificationController$showNotificationIfNeed$1.L$1 = set2;
                    paymentsNotificationController$showNotificationIfNeed$1.label = 1;
                    obj = tje.k0(mdhVar, paymentsNotificationController$showNotificationIfNeed$shouldShowNotification$1, paymentsNotificationController$showNotificationIfNeed$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        set3 = (Set) paymentsNotificationController$showNotificationIfNeed$1.L$1;
                        paymentsNotification2 = (PaymentsNotification) paymentsNotificationController$showNotificationIfNeed$1.L$0;
                        kotlin.b.b(obj);
                        String e = paymentsNotification2.getE();
                        String a2 = e == null ? ((m7x0) this.f).a(e) : null;
                        j1 h = paymentsNotification2.getH();
                        PaymentsNotification.DeeplinkTapAction deeplinkTapAction = !(h instanceof PaymentsNotification.DeeplinkTapAction) ? (PaymentsNotification.DeeplinkTapAction) h : null;
                        a = deeplinkTapAction == null ? deeplinkTapAction.getA() : null;
                        LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
                        x3z x3zVar = new x3z();
                        x3zVar.d(paymentsNotification2.getA());
                        x3zVar.g(paymentsNotification2.getC());
                        x3zVar.e(paymentsNotification2.getD());
                        x3zVar.c(a2);
                        x3zVar.b(paymentsNotification2.getG());
                        x3zVar.f(a);
                        localNotificationItemComponent.init(x3zVar.a(), this.h);
                        if (a != null) {
                            localNotificationItemComponent.setTapDeeplinkListener(new yj70(this));
                        }
                        this.d.e(localNotificationItemComponent);
                        String b = paymentsNotification2.getB();
                        g9a0 g9a0Var = this.g;
                        g9a0Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", b);
                        g9a0Var.a.a("PaymentMethods.Notification.Shown", hashMap, 1, new HashMap());
                        if (paymentsNotification2.getG()) {
                            set3.add(paymentsNotification2.getA());
                            return zy11Var;
                        }
                        Long l = paymentsNotification2.getF() != null ? new Long(TimeUnit.SECONDS.toMillis(r1.intValue())) : null;
                        if (l != null && l.longValue() > 0) {
                            localNotificationItemComponent.startExpiresTimer(l.longValue());
                            localNotificationItemComponent.setExpiresListener(new qn5(11, this, paymentsNotification2));
                        }
                        return zy11Var;
                    }
                    Set set4 = (Set) paymentsNotificationController$showNotificationIfNeed$1.L$1;
                    PaymentsNotification paymentsNotification4 = (PaymentsNotification) paymentsNotificationController$showNotificationIfNeed$1.L$0;
                    kotlin.b.b(obj);
                    set2 = set4;
                    paymentsNotification3 = paymentsNotification4;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                    paymentsNotificationController$showNotificationIfNeed$1.L$0 = paymentsNotification3;
                    paymentsNotificationController$showNotificationIfNeed$1.L$1 = set2;
                    paymentsNotificationController$showNotificationIfNeed$1.Z$0 = booleanValue;
                    paymentsNotificationController$showNotificationIfNeed$1.label = 2;
                    if (ru.yandex.taxi.lifecycle.c.e(this.b, event, paymentsNotificationController$showNotificationIfNeed$1) != coroutineSingletons) {
                        paymentsNotification2 = paymentsNotification3;
                        set3 = set2;
                        String e2 = paymentsNotification2.getE();
                        if (e2 == null) {
                        }
                        j1 h2 = paymentsNotification2.getH();
                        if (!(h2 instanceof PaymentsNotification.DeeplinkTapAction)) {
                        }
                        if (deeplinkTapAction == null) {
                        }
                        LocalNotificationItemComponent localNotificationItemComponent2 = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
                        x3z x3zVar2 = new x3z();
                        x3zVar2.d(paymentsNotification2.getA());
                        x3zVar2.g(paymentsNotification2.getC());
                        x3zVar2.e(paymentsNotification2.getD());
                        x3zVar2.c(a2);
                        x3zVar2.b(paymentsNotification2.getG());
                        x3zVar2.f(a);
                        localNotificationItemComponent2.init(x3zVar2.a(), this.h);
                        if (a != null) {
                        }
                        this.d.e(localNotificationItemComponent2);
                        String b2 = paymentsNotification2.getB();
                        g9a0 g9a0Var2 = this.g;
                        g9a0Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("type", b2);
                        g9a0Var2.a.a("PaymentMethods.Notification.Shown", hashMap2, 1, new HashMap());
                        if (paymentsNotification2.getG()) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        paymentsNotificationController$showNotificationIfNeed$1 = new PaymentsNotificationController$showNotificationIfNeed$1(this, continuationImpl);
        Object obj2 = paymentsNotificationController$showNotificationIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsNotificationController$showNotificationIfNeed$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return zy11Var2;
    }
}
