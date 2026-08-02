package com.yandex.passport.internal.methods.requester;

import com.yandex.passport.internal.methods.x2;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class h {
    public final f a;

    public h(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        MethodRequester$requestMethod$1 methodRequester$requestMethod$1;
        int i;
        f fVar;
        if (continuationImpl instanceof MethodRequester$requestMethod$1) {
            methodRequester$requestMethod$1 = (MethodRequester$requestMethod$1) continuationImpl;
            int i2 = methodRequester$requestMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                methodRequester$requestMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = methodRequester$requestMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = methodRequester$requestMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f fVar2 = this.a;
                    methodRequester$requestMethod$1.L$0 = fVar2;
                    methodRequester$requestMethod$1.label = 1;
                    Object b = b(obj);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        fVar = fVar2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = (f) methodRequester$requestMethod$1.L$0;
                kotlin.b.b(obj2);
                methodRequester$requestMethod$1.L$0 = null;
                methodRequester$requestMethod$1.label = 2;
                Object d = fVar.d((x2) obj2, methodRequester$requestMethod$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        methodRequester$requestMethod$1 = new MethodRequester$requestMethod$1(this, continuationImpl);
        Object obj22 = methodRequester$requestMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = methodRequester$requestMethod$1.label;
        if (i != 0) {
        }
        methodRequester$requestMethod$1.L$0 = null;
        methodRequester$requestMethod$1.label = 2;
        Object d2 = fVar.d((x2) obj22, methodRequester$requestMethod$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    public abstract Object b(Object obj);
}
