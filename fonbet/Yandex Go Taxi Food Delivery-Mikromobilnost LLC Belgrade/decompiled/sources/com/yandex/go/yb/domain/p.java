package com.yandex.go.yb.domain;

import defpackage.jst;
import defpackage.ny61;
import defpackage.xby;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class p {
    public final com.yandex.go.yb.data.u a;
    public final o b;

    public p(com.yandex.go.yb.data.u uVar, o oVar) {
        this.a = uVar;
        this.b = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        YbBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1 ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1;
        int i;
        boolean booleanValue;
        BigDecimal bigDecimal2;
        String str3;
        String str4;
        boolean z;
        if (continuationImpl instanceof YbBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1) {
            ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1 = (YbBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1) continuationImpl;
            int i2 = ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$0 = str;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$1 = bigDecimal;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$2 = str2;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label = 1;
                    obj = b(ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        z = ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.Z$0;
                        str3 = (String) ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$2;
                        bigDecimal2 = (BigDecimal) ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$1;
                        str4 = (String) ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$0;
                        kotlin.b.b(obj);
                        ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$0 = null;
                        ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$1 = null;
                        ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$2 = null;
                        ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.Z$0 = z;
                        ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label = 3;
                        Object b = this.a.b(str4, bigDecimal2, str3, ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1);
                        return b != obj2 ? obj2 : b;
                    }
                    str2 = (String) ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$2;
                    bigDecimal = (BigDecimal) ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$1;
                    str = (String) ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    return null;
                }
                ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$0 = str;
                ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$1 = bigDecimal;
                ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$2 = str2;
                ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.Z$0 = booleanValue;
                ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label = 2;
                if (this.b.c(ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1) != obj2) {
                    String str5 = str2;
                    bigDecimal2 = bigDecimal;
                    str3 = str5;
                    str4 = str;
                    z = booleanValue;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$0 = null;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$1 = null;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.L$2 = null;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.Z$0 = z;
                    ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label = 3;
                    Object b2 = this.a.b(str4, bigDecimal2, str3, ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1);
                    if (b2 != obj2) {
                    }
                }
            }
        }
        ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1 = new YbBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1(this, continuationImpl);
        Object obj3 = ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybBackgroundCardReceiveInteractor$activateSdkAndCheckPayment$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        YbBackgroundCardReceiveInteractor$tryActivateSdk$1 ybBackgroundCardReceiveInteractor$tryActivateSdk$1;
        int i;
        try {
            if (continuationImpl instanceof YbBackgroundCardReceiveInteractor$tryActivateSdk$1) {
                ybBackgroundCardReceiveInteractor$tryActivateSdk$1 = (YbBackgroundCardReceiveInteractor$tryActivateSdk$1) continuationImpl;
                int i2 = ybBackgroundCardReceiveInteractor$tryActivateSdk$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ybBackgroundCardReceiveInteractor$tryActivateSdk$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = ybBackgroundCardReceiveInteractor$tryActivateSdk$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ybBackgroundCardReceiveInteractor$tryActivateSdk$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.go.yb.data.u uVar = this.a;
                        ybBackgroundCardReceiveInteractor$tryActivateSdk$1.label = 1;
                        obj = uVar.c().h(ybBackgroundCardReceiveInteractor$tryActivateSdk$1);
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
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    return bool;
                }
            }
            if (i != 0) {
            }
            Boolean bool2 = (Boolean) obj;
            bool2.getClass();
            return bool2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "FINTECH.FORCE_ACTIVATION", null, th, "error while force activation", 2);
            return Boolean.FALSE;
        }
        ybBackgroundCardReceiveInteractor$tryActivateSdk$1 = new YbBackgroundCardReceiveInteractor$tryActivateSdk$1(this, continuationImpl);
        Object obj2 = ybBackgroundCardReceiveInteractor$tryActivateSdk$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybBackgroundCardReceiveInteractor$tryActivateSdk$1.label;
    }
}
