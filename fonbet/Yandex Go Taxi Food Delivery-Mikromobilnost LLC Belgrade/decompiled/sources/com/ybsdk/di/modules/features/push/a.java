package com.ybsdk.di.modules.features.push;

import defpackage.bu51;
import defpackage.hh51;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xt51;
import defpackage.yt51;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final /* synthetic */ hh51 a;

    public a(hh51 hh51Var) {
        this.a = hh51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1 pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1;
        int i;
        if (continuationImpl instanceof PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1) {
            pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1 = (PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1) continuationImpl;
            int i2 = pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    tls tlsVar = this.a.f;
                    if (tlsVar == null) {
                        return xt51.a;
                    }
                    pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.label = 1;
                    obj = tlsVar.invoke(pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1);
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
                bu51 bu51Var = (bu51) obj;
                return bu51Var == null ? new yt51(bu51Var.b(), bu51Var.a().getPlatformString()) : xt51.b;
            }
        }
        pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1 = new PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1(this, continuationImpl);
        Object obj2 = pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1.label;
        if (i != 0) {
        }
        bu51 bu51Var2 = (bu51) obj2;
        if (bu51Var2 == null) {
        }
    }
}
