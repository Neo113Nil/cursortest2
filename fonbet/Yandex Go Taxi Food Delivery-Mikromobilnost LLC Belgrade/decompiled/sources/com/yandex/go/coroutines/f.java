package com.yandex.go.coroutines;

import defpackage.ny61;
import defpackage.p9o;
import defpackage.tls;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class f {
    public final int a;
    public final p9o b;
    public final tls c;
    public final tls d;
    public int e;

    public f(int i, p9o p9oVar, tls tlsVar, tls tlsVar2) {
        this.a = i;
        this.b = p9oVar;
        this.c = tlsVar;
        this.d = tlsVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|14|15|(2:19|(3:24|25|(2:27|(3:29|(4:31|32|33|(3:35|15|(0)(1:17)))|40)(1:41))(2:42|(1:46)(2:44|45)))(1:23))(0))(2:52|53))(5:54|32|33|(0)|40))(2:55|56))(3:57|58|(1:40)(1:60))))|70|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0110, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008d, code lost:
    
        if (((java.lang.Boolean) r6.invoke(r0)).booleanValue() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0093, code lost:
    
        r4 = new kotlin.jvm.internal.Ref$ObjectRef();
        r11 = r17.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00dc -> B:15:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ErrorRetryHandler$execute$1 errorRetryHandler$execute$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        p9o p9oVar;
        Throwable th;
        long j;
        Ref$ObjectRef ref$ObjectRef2;
        p9o p9oVar2;
        if (continuationImpl instanceof ErrorRetryHandler$execute$1) {
            errorRetryHandler$execute$1 = (ErrorRetryHandler$execute$1) continuationImpl;
            int i2 = errorRetryHandler$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                errorRetryHandler$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = errorRetryHandler$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = errorRetryHandler$execute$1.label;
                int i3 = this.a;
                tls tlsVar = this.d;
                tls tlsVar2 = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e++;
                    errorRetryHandler$execute$1.label = 1;
                    Object invoke = tlsVar2.invoke(errorRetryHandler$execute$1);
                    return invoke == coroutineSingletons ? coroutineSingletons : invoke;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i == 2) {
                    long j2 = errorRetryHandler$execute$1.J$0;
                    p9oVar2 = (p9o) errorRetryHandler$execute$1.L$3;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) errorRetryHandler$execute$1.L$2;
                    th = (Throwable) errorRetryHandler$execute$1.L$0;
                    kotlin.b.b(obj);
                    ref$ObjectRef2 = ref$ObjectRef3;
                    j = j2;
                    errorRetryHandler$execute$1.L$0 = th;
                    errorRetryHandler$execute$1.L$1 = null;
                    errorRetryHandler$execute$1.L$2 = ref$ObjectRef2;
                    errorRetryHandler$execute$1.L$3 = p9oVar2;
                    errorRetryHandler$execute$1.J$0 = j;
                    errorRetryHandler$execute$1.label = 3;
                    obj = tlsVar2.invoke(errorRetryHandler$execute$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p9oVar2 = (p9o) errorRetryHandler$execute$1.L$3;
                ref$ObjectRef2 = (Ref$ObjectRef) errorRetryHandler$execute$1.L$2;
                Throwable th2 = (Throwable) errorRetryHandler$execute$1.L$0;
                try {
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th3) {
                    ref$ObjectRef2.element = th3;
                    p9oVar = p9oVar2;
                    ref$ObjectRef = ref$ObjectRef2;
                    obj = null;
                }
                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                p9oVar = p9oVar2;
                ref$ObjectRef = ref$ObjectRef4;
                if (obj != null) {
                    Throwable th4 = (Throwable) ref$ObjectRef.element;
                    if (th4 != null && !((Boolean) tlsVar.invoke(th4)).booleanValue()) {
                        throw th4;
                    }
                    th = th2;
                    if (!p9oVar.hasNext()) {
                        Throwable th5 = (Throwable) ref$ObjectRef.element;
                        if (th5 == null) {
                            throw th;
                        }
                        throw th5;
                    }
                    j = ((Number) p9oVar.next()).longValue();
                    int i4 = this.e;
                    if (i4 >= i3) {
                        throw th;
                    }
                    this.e = i4 + 1;
                    errorRetryHandler$execute$1.L$0 = th;
                    errorRetryHandler$execute$1.L$1 = null;
                    errorRetryHandler$execute$1.L$2 = ref$ObjectRef;
                    errorRetryHandler$execute$1.L$3 = p9oVar;
                    errorRetryHandler$execute$1.J$0 = j;
                    errorRetryHandler$execute$1.label = 2;
                    if (kotlinx.coroutines.a.i(j, errorRetryHandler$execute$1) != coroutineSingletons) {
                        p9o p9oVar3 = p9oVar;
                        ref$ObjectRef2 = ref$ObjectRef;
                        p9oVar2 = p9oVar3;
                        th = th;
                        try {
                        } catch (Throwable th6) {
                            th2 = th;
                            ref$ObjectRef2.element = th6;
                            Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                            p9oVar = p9oVar2;
                            ref$ObjectRef = ref$ObjectRef5;
                            obj = null;
                        }
                        errorRetryHandler$execute$1.L$0 = th;
                        errorRetryHandler$execute$1.L$1 = null;
                        errorRetryHandler$execute$1.L$2 = ref$ObjectRef2;
                        errorRetryHandler$execute$1.L$3 = p9oVar2;
                        errorRetryHandler$execute$1.J$0 = j;
                        errorRetryHandler$execute$1.label = 3;
                        obj = tlsVar2.invoke(errorRetryHandler$execute$1);
                        if (obj != coroutineSingletons) {
                            th2 = th;
                            Ref$ObjectRef ref$ObjectRef42 = ref$ObjectRef2;
                            p9oVar = p9oVar2;
                            ref$ObjectRef = ref$ObjectRef42;
                            if (obj != null) {
                                return obj;
                            }
                        }
                    }
                }
            }
        }
        errorRetryHandler$execute$1 = new ErrorRetryHandler$execute$1(this, continuationImpl);
        Object obj2 = errorRetryHandler$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = errorRetryHandler$execute$1.label;
        int i32 = this.a;
        tls tlsVar3 = this.d;
        tls tlsVar22 = this.c;
        if (i != 0) {
        }
    }
}
