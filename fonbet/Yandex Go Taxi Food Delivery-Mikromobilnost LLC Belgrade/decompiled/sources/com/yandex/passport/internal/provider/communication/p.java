package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import android.os.Message;
import com.yandex.passport.data.network.fa;
import defpackage.cma1;
import defpackage.i5m;
import defpackage.ny61;
import defpackage.xvf0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class p {
    public static com.yandex.passport.internal.flags.experiments.o a;

    public static com.yandex.passport.internal.flags.experiments.o a() {
        com.yandex.passport.internal.flags.experiments.o oVar = new com.yandex.passport.internal.flags.experiments.o();
        xvf0 c = i5m.c(c.a);
        oVar.a = c;
        oVar.b = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(c, 12)));
        oVar.c = i5m.b(cma1.i(new fa((xvf0) oVar.a, 26)));
        return oVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(q qVar, IPCCommand iPCCommand, ContinuationImpl continuationImpl) {
        MessagePerformer$performMethod$1 messagePerformer$performMethod$1;
        int i;
        Throwable a2;
        if (continuationImpl instanceof MessagePerformer$performMethod$1) {
            messagePerformer$performMethod$1 = (MessagePerformer$performMethod$1) continuationImpl;
            int i2 = messagePerformer$performMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messagePerformer$performMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messagePerformer$performMethod$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messagePerformer$performMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    messagePerformer$performMethod$1.label = 1;
                    obj = qVar.a(iPCCommand, messagePerformer$performMethod$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object failure = (HostResponse) obj;
                a2 = Result.a(failure);
                if (a2 != null) {
                    return ((HostResponse) failure).toMessage();
                }
                HostResponse.Companion.getClass();
                Bundle bundle = new Bundle();
                bundle.putSerializable(Constants.KEY_EXCEPTION, a2);
                return Message.obtain(null, 110, bundle);
            }
        }
        messagePerformer$performMethod$1 = new MessagePerformer$performMethod$1(continuationImpl);
        Object obj3 = messagePerformer$performMethod$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messagePerformer$performMethod$1.label;
        if (i != 0) {
        }
        Object failure2 = (HostResponse) obj3;
        a2 = Result.a(failure2);
        if (a2 != null) {
        }
    }
}
