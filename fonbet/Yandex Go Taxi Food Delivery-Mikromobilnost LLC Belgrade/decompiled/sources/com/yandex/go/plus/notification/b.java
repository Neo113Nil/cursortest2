package com.yandex.go.plus.notification;

import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.ky2;
import defpackage.ny61;
import defpackage.p1g0;
import defpackage.xww0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes13.dex */
public final class b implements xww0 {
    public final ky2 a;
    public final h3y b;
    public final h3y c;

    public b(ky2 ky2Var, h3y h3yVar, h3y h3yVar2) {
        this.a = ky2Var;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r9 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        PlusSubscriptionActivationStatusPushHandler$handle$1 plusSubscriptionActivationStatusPushHandler$handle$1;
        int i;
        String str;
        String str2;
        Boolean bool;
        String str3;
        if (continuationImpl instanceof PlusSubscriptionActivationStatusPushHandler$handle$1) {
            plusSubscriptionActivationStatusPushHandler$handle$1 = (PlusSubscriptionActivationStatusPushHandler$handle$1) continuationImpl;
            int i2 = plusSubscriptionActivationStatusPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionActivationStatusPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionActivationStatusPushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionActivationStatusPushHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(map.get("type"), "plus_subscription_activation_status") && this.a.a) {
                        String str4 = (String) map.get(FcmNotificationService.KEY_TITLE);
                        if (str4 != null) {
                            if (evu0.J(str4)) {
                                str4 = null;
                            }
                        }
                        str4 = (String) map.get("title");
                        if (str4 == null || evu0.J(str4)) {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str = (String) map.get(FcmNotificationService.KEY_BODY);
                            if (str == null || evu0.J(str)) {
                                str = null;
                            }
                            if (str == null) {
                                str = (String) map.get("body");
                                if (str == null || evu0.J(str)) {
                                    str = null;
                                }
                                if (str == null) {
                                    return Boolean.FALSE;
                                }
                            }
                        } else {
                            str = str4;
                        }
                        if (str4 != null) {
                            Object obj2 = map.get(FcmNotificationService.KEY_BODY);
                            String str5 = (String) obj2;
                            if (str5 == null || evu0.J(str5)) {
                                obj2 = null;
                            }
                            str2 = (String) obj2;
                        } else {
                            str2 = null;
                        }
                        a aVar = (a) this.b.get();
                        String str6 = (String) map.get("image_tag");
                        plusSubscriptionActivationStatusPushHandler$handle$1.L$0 = map;
                        plusSubscriptionActivationStatusPushHandler$handle$1.L$1 = null;
                        plusSubscriptionActivationStatusPushHandler$handle$1.L$2 = null;
                        plusSubscriptionActivationStatusPushHandler$handle$1.L$3 = null;
                        plusSubscriptionActivationStatusPushHandler$handle$1.label = 1;
                        obj = aVar.a(str, str2, str6, plusSubscriptionActivationStatusPushHandler$handle$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = (Map) plusSubscriptionActivationStatusPushHandler$handle$1.L$0;
                kotlin.b.b(obj);
                bool = (Boolean) obj;
                if (bool.booleanValue() && (str3 = (String) map.get("id")) != null) {
                    ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) this.c.get()).a.get()).b(str3, PushAckStatus.SHOWN);
                }
                return bool;
            }
        }
        plusSubscriptionActivationStatusPushHandler$handle$1 = new PlusSubscriptionActivationStatusPushHandler$handle$1(this, continuationImpl);
        Object obj3 = plusSubscriptionActivationStatusPushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionActivationStatusPushHandler$handle$1.label;
        if (i != 0) {
        }
        bool = (Boolean) obj3;
        if (bool.booleanValue()) {
            ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) this.c.get()).a.get()).b(str3, PushAckStatus.SHOWN);
        }
        return bool;
    }
}
