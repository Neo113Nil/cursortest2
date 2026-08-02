package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import android.os.Message;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.provider.communication.HostResponse;
import com.yandex.passport.internal.provider.communication.IPCCommand;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class k implements i {
    public final u a;
    public final l b;

    public k(u uVar, l lVar) {
        this.a = uVar;
        this.b = lVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(1:16))(5:37|38|(3:48|(3:51|(3:53|54|(2:56|34))(1:57)|49)|58)(1:42)|43|(1:47)(2:45|46))|17|(1:19)(10:20|(1:22)|23|(1:25)|26|(1:28)(1:36)|29|(1:31)|32|(1:34)(1:35))))|61|6|7|(0)(0)|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0027, B:16:0x0034, B:17:0x0079, B:20:0x007e, B:22:0x008b, B:23:0x008f, B:26:0x0094, B:28:0x0098, B:29:0x009e, B:31:0x00a8, B:32:0x00c0, B:38:0x003b, B:40:0x0045, B:48:0x0050, B:49:0x0054, B:51:0x005a, B:54:0x0062), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PushPlatform pushPlatform, ContinuationImpl continuationImpl) {
        IPCImpl$getPushToken$1 iPCImpl$getPushToken$1;
        int i;
        Bundle bundle;
        if (continuationImpl instanceof IPCImpl$getPushToken$1) {
            iPCImpl$getPushToken$1 = (IPCImpl$getPushToken$1) continuationImpl;
            int i2 = iPCImpl$getPushToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iPCImpl$getPushToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = iPCImpl$getPushToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iPCImpl$getPushToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = this.b.a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((PushPlatform) it.next()) == pushPlatform) {
                                u uVar = this.a;
                                Message message = new IPCCommand.PushTokenCommand(pushPlatform).toMessage();
                                iPCImpl$getPushToken$1.label = 1;
                                uVar.getClass();
                                obj = a.b(uVar, message, iPCImpl$getPushToken$1);
                                if (obj == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    Result.Failure failure = null;
                    if (failure != null) {
                        return null;
                    }
                    return failure;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bundle = (Bundle) obj;
                if (bundle != null) {
                    return null;
                }
                HostResponse.Companion.getClass();
                Object a = g.a(bundle);
                if (!(a instanceof Result.Failure)) {
                    a = (HostResponse.PushTokenResponse) ((HostResponse) a);
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                HostResponse.PushTokenResponse pushTokenResponse = (HostResponse.PushTokenResponse) a;
                String token = pushTokenResponse != null ? pushTokenResponse.getToken() : null;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "start getPushToken token: " + token, 8);
                }
                o430 o430Var = e3n.b;
                long U = kp50.U(5, DurationUnit.SECONDS);
                IPCImpl$getPushToken$2$3 iPCImpl$getPushToken$2$3 = new IPCImpl$getPushToken$2$3(token, null);
                iPCImpl$getPushToken$1.label = 2;
                Object x = kotlinx.coroutines.a.x(U, iPCImpl$getPushToken$2$3, iPCImpl$getPushToken$1);
                return x == coroutineSingletons ? coroutineSingletons : x;
            }
        }
        iPCImpl$getPushToken$1 = new IPCImpl$getPushToken$1(this, continuationImpl);
        Object obj2 = iPCImpl$getPushToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iPCImpl$getPushToken$1.label;
        if (i != 0) {
        }
        bundle = (Bundle) obj2;
        if (bundle != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(VpnStatus vpnStatus, ContinuationImpl continuationImpl) {
        IPCImpl$notifyVpnStatusChanged$1 iPCImpl$notifyVpnStatusChanged$1;
        int i;
        if (continuationImpl instanceof IPCImpl$notifyVpnStatusChanged$1) {
            iPCImpl$notifyVpnStatusChanged$1 = (IPCImpl$notifyVpnStatusChanged$1) continuationImpl;
            int i2 = iPCImpl$notifyVpnStatusChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iPCImpl$notifyVpnStatusChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = iPCImpl$notifyVpnStatusChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iPCImpl$notifyVpnStatusChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = this.a;
                    Message message = new IPCCommand.VpnStatusChangedCommand(vpnStatus).toMessage();
                    iPCImpl$notifyVpnStatusChanged$1.label = 1;
                    uVar.getClass();
                    obj = a.b(uVar, message, iPCImpl$notifyVpnStatusChanged$1);
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
                return zy11.a;
            }
        }
        iPCImpl$notifyVpnStatusChanged$1 = new IPCImpl$notifyVpnStatusChanged$1(this, continuationImpl);
        Object obj2 = iPCImpl$notifyVpnStatusChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iPCImpl$notifyVpnStatusChanged$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
