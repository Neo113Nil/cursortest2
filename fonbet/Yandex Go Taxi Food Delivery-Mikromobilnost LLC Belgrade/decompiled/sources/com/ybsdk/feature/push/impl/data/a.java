package com.ybsdk.feature.push.impl.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.push.impl.network.PushNotificationsApi;
import com.ybsdk.feature.push.impl.network.dto.SubscribeRequest;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final PushNotificationsApi a;

    public a(PushNotificationsApi pushNotificationsApi) {
        this.a = pushNotificationsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PushNotificationsRepository$sendPushReceived$1 pushNotificationsRepository$sendPushReceived$1;
        int i;
        if (continuationImpl instanceof PushNotificationsRepository$sendPushReceived$1) {
            pushNotificationsRepository$sendPushReceived$1 = (PushNotificationsRepository$sendPushReceived$1) continuationImpl;
            int i2 = pushNotificationsRepository$sendPushReceived$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsRepository$sendPushReceived$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushNotificationsRepository$sendPushReceived$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsRepository$sendPushReceived$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                PushNotificationsRepository$sendPushReceived$2 pushNotificationsRepository$sendPushReceived$2 = new PushNotificationsRepository$sendPushReceived$2(this, str, null);
                pushNotificationsRepository$sendPushReceived$1.label = 1;
                Object c = c.c(pushNotificationsRepository$sendPushReceived$2, pushNotificationsRepository$sendPushReceived$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        pushNotificationsRepository$sendPushReceived$1 = new PushNotificationsRepository$sendPushReceived$1(this, continuationImpl);
        Object obj2 = pushNotificationsRepository$sendPushReceived$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsRepository$sendPushReceived$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        PushNotificationsRepository$subscribeToPushes$1 pushNotificationsRepository$subscribeToPushes$1;
        int i;
        if (continuationImpl instanceof PushNotificationsRepository$subscribeToPushes$1) {
            pushNotificationsRepository$subscribeToPushes$1 = (PushNotificationsRepository$subscribeToPushes$1) continuationImpl;
            int i2 = pushNotificationsRepository$subscribeToPushes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsRepository$subscribeToPushes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushNotificationsRepository$subscribeToPushes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsRepository$subscribeToPushes$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                PushNotificationsRepository$subscribeToPushes$2 pushNotificationsRepository$subscribeToPushes$2 = new PushNotificationsRepository$subscribeToPushes$2(this, new SubscribeRequest(str, str3, str2, str4), null);
                pushNotificationsRepository$subscribeToPushes$1.label = 1;
                Object c = c.c(pushNotificationsRepository$subscribeToPushes$2, pushNotificationsRepository$subscribeToPushes$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        pushNotificationsRepository$subscribeToPushes$1 = new PushNotificationsRepository$subscribeToPushes$1(this, continuationImpl);
        Object obj2 = pushNotificationsRepository$subscribeToPushes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsRepository$subscribeToPushes$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PushNotificationsRepository$unsubscribeFromPushes$1 pushNotificationsRepository$unsubscribeFromPushes$1;
        int i;
        if (continuationImpl instanceof PushNotificationsRepository$unsubscribeFromPushes$1) {
            pushNotificationsRepository$unsubscribeFromPushes$1 = (PushNotificationsRepository$unsubscribeFromPushes$1) continuationImpl;
            int i2 = pushNotificationsRepository$unsubscribeFromPushes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsRepository$unsubscribeFromPushes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushNotificationsRepository$unsubscribeFromPushes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsRepository$unsubscribeFromPushes$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                PushNotificationsRepository$unsubscribeFromPushes$2 pushNotificationsRepository$unsubscribeFromPushes$2 = new PushNotificationsRepository$unsubscribeFromPushes$2(this, str, null);
                pushNotificationsRepository$unsubscribeFromPushes$1.label = 1;
                Object c = c.c(pushNotificationsRepository$unsubscribeFromPushes$2, pushNotificationsRepository$unsubscribeFromPushes$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        pushNotificationsRepository$unsubscribeFromPushes$1 = new PushNotificationsRepository$unsubscribeFromPushes$1(this, continuationImpl);
        Object obj2 = pushNotificationsRepository$unsubscribeFromPushes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsRepository$unsubscribeFromPushes$1.label;
        if (i == 0) {
        }
    }
}
