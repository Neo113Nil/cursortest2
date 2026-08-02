package com.yandex.plus.home.plusstate;

import com.yandex.plus.home.graphql.plusstate.c;
import defpackage.imd0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements imd0 {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r3 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusStateInteractorImpl$updatePlusState$1 plusStateInteractorImpl$updatePlusState$1;
        int i;
        if (continuationImpl instanceof PlusStateInteractorImpl$updatePlusState$1) {
            plusStateInteractorImpl$updatePlusState$1 = (PlusStateInteractorImpl$updatePlusState$1) continuationImpl;
            int i2 = plusStateInteractorImpl$updatePlusState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusStateInteractorImpl$updatePlusState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusStateInteractorImpl$updatePlusState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusStateInteractorImpl$updatePlusState$1.label;
                zy11 zy11Var = zy11.a;
                c cVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    plusStateInteractorImpl$updatePlusState$1.label = 1;
                    cVar.b();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    }
                    b.b(obj);
                }
                plusStateInteractorImpl$updatePlusState$1.label = 2;
                return cVar.e(plusStateInteractorImpl$updatePlusState$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        plusStateInteractorImpl$updatePlusState$1 = new PlusStateInteractorImpl$updatePlusState$1(this, continuationImpl);
        Object obj2 = plusStateInteractorImpl$updatePlusState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusStateInteractorImpl$updatePlusState$1.label;
        zy11 zy11Var2 = zy11.a;
        c cVar2 = this.a;
        if (i != 0) {
        }
        plusStateInteractorImpl$updatePlusState$1.label = 2;
        if (cVar2.e(plusStateInteractorImpl$updatePlusState$1) != coroutineSingletons2) {
        }
    }
}
