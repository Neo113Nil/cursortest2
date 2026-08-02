package com.yandex.go.yb.lack_of_order.domain;

import com.yandex.go.yb.domain.model.LackOfMoneyPushNotificationInfo;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.xww0;
import java.util.Arrays;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* loaded from: classes15.dex */
public final class a implements xww0 {
    public final wnt a;
    public final b b;

    public a(wnt wntVar, b bVar) {
        this.a = wntVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        LackOfMoneyPushHandlerImpl$handle$1 lackOfMoneyPushHandlerImpl$handle$1;
        int i;
        Object obj;
        LackOfMoneyPushNotificationInfo lackOfMoneyPushNotificationInfo;
        if (continuationImpl instanceof LackOfMoneyPushHandlerImpl$handle$1) {
            lackOfMoneyPushHandlerImpl$handle$1 = (LackOfMoneyPushHandlerImpl$handle$1) continuationImpl;
            int i2 = lackOfMoneyPushHandlerImpl$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lackOfMoneyPushHandlerImpl$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lackOfMoneyPushHandlerImpl$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lackOfMoneyPushHandlerImpl$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!jl40.l((String) map.get("type"), "topup_yandex_wallet")) {
                        return Boolean.FALSE;
                    }
                    wnt wntVar = this.a;
                    String str = (String) map.get("extra");
                    KSerializer serializer = LackOfMoneyPushNotificationInfo.Companion.serializer();
                    if (str != null && str.length() != 0) {
                        try {
                            obj = ((xnt) wntVar).c(str, serializer);
                        } catch (SerializationException e) {
                            jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str}, 1)));
                        }
                        lackOfMoneyPushNotificationInfo = (LackOfMoneyPushNotificationInfo) obj;
                        String str2 = (String) map.get("id");
                        if (lackOfMoneyPushNotificationInfo != null) {
                            lackOfMoneyPushHandlerImpl$handle$1.L$0 = null;
                            lackOfMoneyPushHandlerImpl$handle$1.L$1 = null;
                            lackOfMoneyPushHandlerImpl$handle$1.L$2 = null;
                            lackOfMoneyPushHandlerImpl$handle$1.L$3 = null;
                            lackOfMoneyPushHandlerImpl$handle$1.label = 1;
                            if (this.b.a(lackOfMoneyPushNotificationInfo, str2, lackOfMoneyPushHandlerImpl$handle$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    obj = null;
                    lackOfMoneyPushNotificationInfo = (LackOfMoneyPushNotificationInfo) obj;
                    String str22 = (String) map.get("id");
                    if (lackOfMoneyPushNotificationInfo != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return Boolean.TRUE;
            }
        }
        lackOfMoneyPushHandlerImpl$handle$1 = new LackOfMoneyPushHandlerImpl$handle$1(this, continuationImpl);
        Object obj22 = lackOfMoneyPushHandlerImpl$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lackOfMoneyPushHandlerImpl$handle$1.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
