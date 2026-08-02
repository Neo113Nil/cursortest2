package com.yandex.go.yb.domain;

import android.content.Context;
import defpackage.i1h0;
import defpackage.mdh;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.py51;
import defpackage.qq51;
import defpackage.rq51;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.x3z;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

/* loaded from: classes15.dex */
public final class q {
    public final Context a;
    public final tse b;
    public final tt2 c;
    public final tj60 d;
    public final py51 e;
    public final com.yandex.go.yb.data.i f;

    public q(Context context, tse tseVar, tt2 tt2Var, tj60 tj60Var, py51 py51Var, com.yandex.go.yb.data.i iVar) {
        this.a = context;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = tj60Var;
        this.e = py51Var;
        this.f = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, qq51 qq51Var, Continuation continuation) {
        YbCardStatusNotificationController$showNotificationIfNeed$1 ybCardStatusNotificationController$showNotificationIfNeed$1;
        int i;
        boolean booleanValue;
        int i2;
        qVar.getClass();
        if (continuation instanceof YbCardStatusNotificationController$showNotificationIfNeed$1) {
            ybCardStatusNotificationController$showNotificationIfNeed$1 = (YbCardStatusNotificationController$showNotificationIfNeed$1) continuation;
            int i3 = ybCardStatusNotificationController$showNotificationIfNeed$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ybCardStatusNotificationController$showNotificationIfNeed$1.label = i3 - Integer.MIN_VALUE;
                Object obj = ybCardStatusNotificationController$showNotificationIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybCardStatusNotificationController$showNotificationIfNeed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qVar.c.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1 ybCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1 = new YbCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1(qVar, qq51Var, null);
                    ybCardStatusNotificationController$showNotificationIfNeed$1.L$0 = qq51Var;
                    ybCardStatusNotificationController$showNotificationIfNeed$1.label = 1;
                    obj = tje.k0(mdhVar, ybCardStatusNotificationController$showNotificationIfNeed$shouldShowNotification$1, ybCardStatusNotificationController$showNotificationIfNeed$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qq51Var = (qq51) ybCardStatusNotificationController$showNotificationIfNeed$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(qVar.a, null, 0, 6, null);
                int i4 = rq51.a[qq51Var.d.ordinal()];
                if (i4 == 1) {
                    i2 = i1h0.ic_yb_card_opened;
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    i2 = i1h0.ic_payment_yb_wallet;
                }
                x3z x3zVar = new x3z();
                x3zVar.d = qq51Var.a;
                x3zVar.a = qq51Var.b;
                x3zVar.b = qq51Var.c;
                x3zVar.c = i2;
                localNotificationItemComponent.init(x3zVar.a());
                qVar.d.e(localNotificationItemComponent);
                return zy11Var;
            }
        }
        ybCardStatusNotificationController$showNotificationIfNeed$1 = new YbCardStatusNotificationController$showNotificationIfNeed$1(qVar, continuation);
        Object obj2 = ybCardStatusNotificationController$showNotificationIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybCardStatusNotificationController$showNotificationIfNeed$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }

    public final void b() {
        String a = py51.a((nw51) this.e.a.t.getValue());
        if (a == null || a.length() == 0) {
            tje.N(this.b, null, null, new YbCardStatusNotificationController$onStart$1(this, null), 3);
        }
    }
}
