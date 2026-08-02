package com.yandex.go.payments.cards.data;

import android.os.SystemClock;
import defpackage.l2e0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zls;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class e {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0150 -> B:11:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zls zlsVar, l2e0 l2e0Var, Object obj, tls tlsVar, tls tlsVar2, ContinuationImpl continuationImpl) {
        PollingRetryInterceptor$retryHandlingSuspend$1 pollingRetryInterceptor$retryHandlingSuspend$1;
        int i;
        Ref$IntRef ref$IntRef;
        PollingRetryInterceptor$retryHandlingSuspend$1 pollingRetryInterceptor$retryHandlingSuspend$12;
        Ref$ObjectRef ref$ObjectRef;
        long j;
        zls zlsVar2;
        l2e0 l2e0Var2;
        tls tlsVar3;
        tls tlsVar4;
        zls zlsVar3;
        l2e0 l2e0Var3;
        Object obj2;
        tls tlsVar5;
        tls tlsVar6;
        Ref$IntRef ref$IntRef2;
        long j2;
        Ref$ObjectRef ref$ObjectRef2;
        Throwable th;
        long j3;
        long longValue;
        Object obj3;
        if (continuationImpl instanceof PollingRetryInterceptor$retryHandlingSuspend$1) {
            pollingRetryInterceptor$retryHandlingSuspend$1 = (PollingRetryInterceptor$retryHandlingSuspend$1) continuationImpl;
            int i2 = pollingRetryInterceptor$retryHandlingSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollingRetryInterceptor$retryHandlingSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = pollingRetryInterceptor$retryHandlingSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollingRetryInterceptor$retryHandlingSuspend$1.label;
                Object obj5 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    T t = obj;
                    ref$ObjectRef3.element = t;
                    ref$IntRef = ref$IntRef3;
                    pollingRetryInterceptor$retryHandlingSuspend$12 = pollingRetryInterceptor$retryHandlingSuspend$1;
                    ref$ObjectRef = ref$ObjectRef3;
                    j = uptimeMillis;
                    zlsVar2 = zlsVar;
                    l2e0Var2 = l2e0Var;
                    tlsVar3 = tlsVar;
                    tlsVar4 = tlsVar2;
                    obj3 = t;
                    Object obj6 = ref$ObjectRef.element;
                    Integer num = new Integer(ref$IntRef.element);
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$0 = zlsVar2;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$1 = l2e0Var2;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$2 = obj3;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$3 = tlsVar3;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$4 = tlsVar4;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$5 = ref$IntRef;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$6 = ref$ObjectRef;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$7 = obj5;
                    pollingRetryInterceptor$retryHandlingSuspend$12.L$8 = obj5;
                    pollingRetryInterceptor$retryHandlingSuspend$12.J$0 = j;
                    pollingRetryInterceptor$retryHandlingSuspend$12.label = 1;
                    Object invoke = zlsVar2.invoke(obj6, num, pollingRetryInterceptor$retryHandlingSuspend$12);
                    if (invoke == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j4 = pollingRetryInterceptor$retryHandlingSuspend$1.J$0;
                        Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) pollingRetryInterceptor$retryHandlingSuspend$1.L$6;
                        Ref$IntRef ref$IntRef4 = (Ref$IntRef) pollingRetryInterceptor$retryHandlingSuspend$1.L$5;
                        tls tlsVar7 = (tls) pollingRetryInterceptor$retryHandlingSuspend$1.L$4;
                        tls tlsVar8 = (tls) pollingRetryInterceptor$retryHandlingSuspend$1.L$3;
                        Object obj7 = pollingRetryInterceptor$retryHandlingSuspend$1.L$2;
                        l2e0 l2e0Var4 = (l2e0) pollingRetryInterceptor$retryHandlingSuspend$1.L$1;
                        zls zlsVar4 = (zls) pollingRetryInterceptor$retryHandlingSuspend$1.L$0;
                        kotlin.b.b(obj4);
                        char c = 2;
                        boolean z = true;
                        pollingRetryInterceptor$retryHandlingSuspend$12 = pollingRetryInterceptor$retryHandlingSuspend$1;
                        zlsVar2 = zlsVar4;
                        Object obj8 = obj7;
                        ref$ObjectRef = ref$ObjectRef4;
                        l2e0Var2 = l2e0Var4;
                        j = j4;
                        tlsVar4 = tlsVar7;
                        tlsVar3 = tlsVar8;
                        ref$IntRef = ref$IntRef4;
                        obj3 = obj8;
                        obj5 = null;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            long j5 = j;
                            zlsVar3 = zlsVar2;
                            l2e0Var3 = l2e0Var2;
                            pollingRetryInterceptor$retryHandlingSuspend$1 = pollingRetryInterceptor$retryHandlingSuspend$12;
                            ref$ObjectRef2 = ref$ObjectRef;
                            tlsVar5 = tlsVar3;
                            obj2 = obj3;
                            ref$IntRef2 = ref$IntRef;
                            tlsVar6 = tlsVar4;
                            j2 = j5;
                            ?? a = l2e0Var3.a(th, obj2, ref$IntRef2.element);
                            ref$ObjectRef2.element = a;
                            Long l = (Long) tlsVar5.invoke(a);
                            long longValue2 = l == null ? l.longValue() : this.a;
                            Long l2 = (Long) tlsVar6.invoke(ref$ObjectRef2.element);
                            Object obj9 = obj5;
                            j3 = j2;
                            longValue = l2 == null ? l2.longValue() : 180000L;
                            if (SystemClock.uptimeMillis() <= j3 + longValue) {
                                return obj9;
                            }
                            z = true;
                            ref$IntRef2.element++;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$0 = zlsVar3;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$1 = l2e0Var3;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$2 = obj2;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$3 = tlsVar5;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$4 = tlsVar6;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$5 = ref$IntRef2;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$6 = ref$ObjectRef2;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$7 = obj9;
                            pollingRetryInterceptor$retryHandlingSuspend$1.L$8 = obj9;
                            Ref$IntRef ref$IntRef5 = ref$IntRef2;
                            pollingRetryInterceptor$retryHandlingSuspend$1.J$0 = j3;
                            pollingRetryInterceptor$retryHandlingSuspend$1.J$1 = longValue2;
                            pollingRetryInterceptor$retryHandlingSuspend$1.J$2 = longValue;
                            c = 2;
                            pollingRetryInterceptor$retryHandlingSuspend$1.label = 2;
                            if (kotlinx.coroutines.a.i(longValue2, pollingRetryInterceptor$retryHandlingSuspend$1) != coroutineSingletons) {
                                tlsVar3 = tlsVar5;
                                pollingRetryInterceptor$retryHandlingSuspend$12 = pollingRetryInterceptor$retryHandlingSuspend$1;
                                zlsVar2 = zlsVar3;
                                tls tlsVar9 = tlsVar6;
                                ref$IntRef = ref$IntRef5;
                                obj8 = obj2;
                                ref$ObjectRef = ref$ObjectRef2;
                                l2e0Var2 = l2e0Var3;
                                j = j3;
                                tlsVar4 = tlsVar9;
                                obj3 = obj8;
                                obj5 = null;
                                Object obj62 = ref$ObjectRef.element;
                                Integer num2 = new Integer(ref$IntRef.element);
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$0 = zlsVar2;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$1 = l2e0Var2;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$2 = obj3;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$3 = tlsVar3;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$4 = tlsVar4;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$5 = ref$IntRef;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$6 = ref$ObjectRef;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$7 = obj5;
                                pollingRetryInterceptor$retryHandlingSuspend$12.L$8 = obj5;
                                pollingRetryInterceptor$retryHandlingSuspend$12.J$0 = j;
                                pollingRetryInterceptor$retryHandlingSuspend$12.label = 1;
                                Object invoke2 = zlsVar2.invoke(obj62, num2, pollingRetryInterceptor$retryHandlingSuspend$12);
                                if (invoke2 == coroutineSingletons) {
                                }
                            }
                        }
                        Object obj622 = ref$ObjectRef.element;
                        Integer num22 = new Integer(ref$IntRef.element);
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$0 = zlsVar2;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$1 = l2e0Var2;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$2 = obj3;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$3 = tlsVar3;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$4 = tlsVar4;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$5 = ref$IntRef;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$6 = ref$ObjectRef;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$7 = obj5;
                        pollingRetryInterceptor$retryHandlingSuspend$12.L$8 = obj5;
                        pollingRetryInterceptor$retryHandlingSuspend$12.J$0 = j;
                        pollingRetryInterceptor$retryHandlingSuspend$12.label = 1;
                        Object invoke22 = zlsVar2.invoke(obj622, num22, pollingRetryInterceptor$retryHandlingSuspend$12);
                        return invoke22 == coroutineSingletons ? coroutineSingletons : invoke22;
                    }
                    j2 = pollingRetryInterceptor$retryHandlingSuspend$1.J$0;
                    ref$ObjectRef2 = (Ref$ObjectRef) pollingRetryInterceptor$retryHandlingSuspend$1.L$6;
                    ref$IntRef2 = (Ref$IntRef) pollingRetryInterceptor$retryHandlingSuspend$1.L$5;
                    tlsVar6 = (tls) pollingRetryInterceptor$retryHandlingSuspend$1.L$4;
                    tlsVar5 = (tls) pollingRetryInterceptor$retryHandlingSuspend$1.L$3;
                    obj2 = pollingRetryInterceptor$retryHandlingSuspend$1.L$2;
                    l2e0Var3 = (l2e0) pollingRetryInterceptor$retryHandlingSuspend$1.L$1;
                    zlsVar3 = (zls) pollingRetryInterceptor$retryHandlingSuspend$1.L$0;
                    try {
                        try {
                            kotlin.b.b(obj4);
                            return obj4;
                        } catch (Throwable th3) {
                            th = th3;
                            ?? a2 = l2e0Var3.a(th, obj2, ref$IntRef2.element);
                            ref$ObjectRef2.element = a2;
                            Long l3 = (Long) tlsVar5.invoke(a2);
                            if (l3 == null) {
                            }
                            Long l22 = (Long) tlsVar6.invoke(ref$ObjectRef2.element);
                            Object obj92 = obj5;
                            j3 = j2;
                            longValue = l22 == null ? l22.longValue() : 180000L;
                            if (SystemClock.uptimeMillis() <= j3 + longValue) {
                            }
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                }
            }
        }
        pollingRetryInterceptor$retryHandlingSuspend$1 = new PollingRetryInterceptor$retryHandlingSuspend$1(this, continuationImpl);
        Object obj42 = pollingRetryInterceptor$retryHandlingSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollingRetryInterceptor$retryHandlingSuspend$1.label;
        Object obj52 = null;
        if (i != 0) {
        }
    }

    public e() {
        this((Object) null);
    }

    public /* synthetic */ e(Object obj) {
        this(3000);
    }
}
