package com.yandex.plus.core.network.call;

import com.yandex.plus.core.network.error.NetworkException;
import defpackage.ny61;
import defpackage.pz50;
import defpackage.qz50;
import defpackage.sz50;
import defpackage.tls;
import defpackage.w511;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Object a(sz50 sz50Var) {
        if (sz50Var instanceof qz50) {
            return ((qz50) sz50Var).a;
        }
        if (sz50Var instanceof pz50) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final Object b(sz50 sz50Var) {
        if (sz50Var instanceof qz50) {
            return ((qz50) sz50Var).a;
        }
        if (sz50Var instanceof pz50) {
            throw ((pz50) sz50Var).a;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(tls tlsVar, tls tlsVar2, ContinuationImpl continuationImpl) {
        NetworkResultKt$runSuspendCatching$1 networkResultKt$runSuspendCatching$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof NetworkResultKt$runSuspendCatching$1) {
            networkResultKt$runSuspendCatching$1 = (NetworkResultKt$runSuspendCatching$1) continuationImpl;
            int i2 = networkResultKt$runSuspendCatching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkResultKt$runSuspendCatching$1.label = i2 - Integer.MIN_VALUE;
                Object obj = networkResultKt$runSuspendCatching$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkResultKt$runSuspendCatching$1.label;
                if (i != 0) {
                    b.b(obj);
                    networkResultKt$runSuspendCatching$1.L$0 = tlsVar;
                    networkResultKt$runSuspendCatching$1.L$1 = null;
                    networkResultKt$runSuspendCatching$1.L$2 = null;
                    networkResultKt$runSuspendCatching$1.L$3 = null;
                    networkResultKt$runSuspendCatching$1.L$4 = null;
                    networkResultKt$runSuspendCatching$1.L$5 = null;
                    networkResultKt$runSuspendCatching$1.I$0 = 0;
                    networkResultKt$runSuspendCatching$1.I$1 = 0;
                    networkResultKt$runSuspendCatching$1.I$2 = 0;
                    networkResultKt$runSuspendCatching$1.I$3 = 0;
                    networkResultKt$runSuspendCatching$1.label = 1;
                    obj = tlsVar2.invoke(networkResultKt$runSuspendCatching$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) networkResultKt$runSuspendCatching$1.L$0;
                    b.b(obj);
                }
                Object obj3 = new qz50(obj);
                a = Result.a(obj3);
                if (a != null) {
                    obj3 = new pz50((NetworkException) tlsVar.invoke(a));
                }
                return (sz50) obj3;
            }
        }
        networkResultKt$runSuspendCatching$1 = new NetworkResultKt$runSuspendCatching$1(continuationImpl);
        Object obj4 = networkResultKt$runSuspendCatching$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkResultKt$runSuspendCatching$1.label;
        if (i != 0) {
        }
        Object obj32 = new qz50(obj4);
        a = Result.a(obj32);
        if (a != null) {
        }
        return (sz50) obj32;
    }
}
