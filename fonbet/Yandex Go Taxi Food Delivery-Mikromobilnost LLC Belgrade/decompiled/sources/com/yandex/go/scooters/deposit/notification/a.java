package com.yandex.go.scooters.deposit.notification;

import android.content.Context;
import com.yandex.go.scooters.deposit.notification.ui.ScootersDepositNotification;
import defpackage.cen0;
import defpackage.een0;
import defpackage.fen0;
import defpackage.h55;
import defpackage.j6m0;
import defpackage.kgx;
import defpackage.m950;
import defpackage.ny61;
import defpackage.qdx;
import defpackage.qu;
import defpackage.qwo0;
import defpackage.rdn0;
import defpackage.tig0;
import defpackage.tj60;
import defpackage.tje;
import defpackage.u8w;
import defpackage.wz1;
import defpackage.yxm0;
import defpackage.z4k0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes13.dex */
public final class a extends h55 implements m950 {
    public final tj60 D;
    public final cen0 E;
    public final com.yandex.go.scooters.deposit.notification.domain.a F;
    public final fen0 G;
    public String H;

    public a(tj60 tj60Var, cen0 cen0Var, com.yandex.go.scooters.deposit.notification.domain.a aVar, fen0 fen0Var) {
        super(null);
        this.D = tj60Var;
        this.E = cen0Var;
        this.F = aVar;
        this.G = fen0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ContinuationImpl continuationImpl) {
        ScootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1 scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1;
        int i;
        boolean booleanValue;
        zy11 zy11Var;
        rdn0 rdn0Var;
        com.yandex.go.scooters.deposit.notification.domain.a aVar2 = aVar.F;
        if (continuationImpl instanceof ScootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1) {
            scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1 = (ScootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1) continuationImpl;
            int i2 = scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.label = 1;
                    obj = aVar2.a(scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11Var = zy11.a;
                if (booleanValue || (rdn0Var = (rdn0) aVar2.b.a.getValue()) == null) {
                    aVar.r(new qu(9));
                    return zy11Var;
                }
                tj60 tj60Var = aVar.D;
                cen0 cen0Var = aVar.E;
                fen0 fen0Var = aVar.G;
                ScootersDepositNotificationRouterImpl$showDepositNotification$1 scootersDepositNotificationRouterImpl$showDepositNotification$1 = new ScootersDepositNotificationRouterImpl$showDepositNotification$1(0, aVar, a.class, "openDepositInfo", "openDepositInfo()V", 0);
                j6m0 j6m0Var = new j6m0(29, aVar);
                tig0 tig0Var = fen0Var.a;
                ScootersDepositNotification scootersDepositNotification = new ScootersDepositNotification((Context) cen0Var.a.a.get(), new een0((u8w) ((yxm0) tig0Var.a).get(), (com.yandex.go.scooters.deposit.notification.ui.a) ((z4k0) tig0Var.b).get(), rdn0Var, scootersDepositNotificationRouterImpl$showDepositNotification$1, j6m0Var));
                scootersDepositNotification.setExpiresListener(new wz1(14, aVar));
                aVar.H = scootersDepositNotification.getCurrentNotificationId();
                NotificationStackComponent notificationStackComponent = tj60Var.a;
                if (notificationStackComponent != null) {
                    notificationStackComponent.showNotification(scootersDepositNotification);
                }
                scootersDepositNotification.startExpiresTimer(6000L);
                aVar2.b.a.l(null);
                qwo0 qwo0Var = aVar2.a;
                qdx qdxVar = qwo0Var.g;
                kgx[] kgxVarArr = qwo0.B;
                qwo0Var.g.setValue(qwo0Var, kgxVarArr[5], Integer.valueOf(((Number) qdxVar.getValue(qwo0Var, kgxVarArr[5])).intValue() + 1));
                return zy11Var;
            }
        }
        scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1 = new ScootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1(aVar, continuationImpl);
        Object obj2 = scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDepositNotificationRouterImpl$showDepositNotificationIfNeededOrGoBack$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11Var = zy11.a;
        if (booleanValue) {
        }
        aVar.r(new qu(9));
        return zy11Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ScootersDepositNotificationRouterImpl$onAttach$1(this, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        String str = this.H;
        if (str != null) {
            this.D.c(str);
        }
    }
}
