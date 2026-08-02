package com.yandex.go.coroutines;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.seu;
import defpackage.tls;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class h {
    public tls a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public volatile Object c = seu.H;

    public h(tls tlsVar) {
        this.a = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r3.a(r1) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:27:0x0067, B:29:0x006d), top: B:26:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        SuspendableLazy$get$1 suspendableLazy$get$1;
        int i;
        Ref$ObjectRef z;
        g050 g050Var;
        g050 g050Var2;
        ?? r5;
        Ref$ObjectRef ref$ObjectRef;
        h hVar;
        seu seuVar = seu.H;
        try {
            if (continuation instanceof SuspendableLazy$get$1) {
                suspendableLazy$get$1 = (SuspendableLazy$get$1) continuation;
                int i2 = suspendableLazy$get$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    suspendableLazy$get$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = suspendableLazy$get$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = suspendableLazy$get$1.label;
                    if (i != 0) {
                        z = qv10.z(obj);
                        ?? r3 = this.c;
                        z.element = r3;
                        if (r3 == seuVar) {
                            g050Var = this.b;
                            suspendableLazy$get$1.L$0 = z;
                            suspendableLazy$get$1.L$1 = g050Var;
                            suspendableLazy$get$1.label = 1;
                        }
                        return z.element;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hVar = (h) suspendableLazy$get$1.L$2;
                        g050Var2 = (g050) suspendableLazy$get$1.L$1;
                        ref$ObjectRef = (Ref$ObjectRef) suspendableLazy$get$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            hVar.c = obj;
                            this.a = null;
                            ref$ObjectRef.element = this.c;
                            z = ref$ObjectRef;
                            g050Var = g050Var2;
                            g050Var.d(null);
                            return z.element;
                        } catch (Throwable th) {
                            th = th;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) suspendableLazy$get$1.L$1;
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) suspendableLazy$get$1.L$0;
                    kotlin.b.b(obj);
                    z = ref$ObjectRef2;
                    r5 = this.c;
                    z.element = r5;
                    if (r5 == seuVar) {
                        tls tlsVar = this.a;
                        suspendableLazy$get$1.L$0 = z;
                        suspendableLazy$get$1.L$1 = g050Var;
                        suspendableLazy$get$1.L$2 = this;
                        suspendableLazy$get$1.label = 2;
                        Object invoke = tlsVar.invoke(suspendableLazy$get$1);
                        if (invoke != coroutineSingletons) {
                            ref$ObjectRef = z;
                            obj = invoke;
                            g050Var2 = g050Var;
                            hVar = this;
                            hVar.c = obj;
                            this.a = null;
                            ref$ObjectRef.element = this.c;
                            z = ref$ObjectRef;
                            g050Var = g050Var2;
                        }
                        return coroutineSingletons;
                    }
                    g050Var.d(null);
                    return z.element;
                }
            }
            r5 = this.c;
            z.element = r5;
            if (r5 == seuVar) {
            }
            g050Var.d(null);
            return z.element;
        } catch (Throwable th2) {
            th = th2;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
        suspendableLazy$get$1 = new SuspendableLazy$get$1(this, continuation);
        Object obj2 = suspendableLazy$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendableLazy$get$1.label;
        if (i != 0) {
        }
    }
}
