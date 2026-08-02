package com.yandex.go.taxi.order.promotions.notification.ui;

import android.content.Context;
import defpackage.lsc;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class b {
    public final Context a;
    public final a b;
    public final tt2 c;

    public b(Context context, a aVar, tt2 tt2Var) {
        this.a = context;
        this.b = aVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CommunicationItem communicationItem, ContinuationImpl continuationImpl) {
        PromoblockNotificationFactory$create$1 promoblockNotificationFactory$create$1;
        int i;
        if (continuationImpl instanceof PromoblockNotificationFactory$create$1) {
            promoblockNotificationFactory$create$1 = (PromoblockNotificationFactory$create$1) continuationImpl;
            int i2 = promoblockNotificationFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoblockNotificationFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoblockNotificationFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoblockNotificationFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    PromoblockNotificationFactory$create$state$1 promoblockNotificationFactory$create$state$1 = new PromoblockNotificationFactory$create$state$1(this, communicationItem, null);
                    promoblockNotificationFactory$create$1.L$0 = null;
                    promoblockNotificationFactory$create$1.label = 1;
                    obj = tje.k0(sjhVar, promoblockNotificationFactory$create$state$1, promoblockNotificationFactory$create$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new PromoblockNotification(this.a, (lsc) obj);
            }
        }
        promoblockNotificationFactory$create$1 = new PromoblockNotificationFactory$create$1(this, continuationImpl);
        Object obj2 = promoblockNotificationFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoblockNotificationFactory$create$1.label;
        if (i != 0) {
        }
        return new PromoblockNotification(this.a, (lsc) obj2);
    }
}
