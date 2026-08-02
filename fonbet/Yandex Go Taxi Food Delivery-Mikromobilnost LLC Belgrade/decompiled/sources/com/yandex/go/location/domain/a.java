package com.yandex.go.location.domain;

import defpackage.ehe0;
import defpackage.ny61;
import defpackage.r8z;
import defpackage.x8z;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final ehe0 a;
    public final x8z b;

    public a(ehe0 ehe0Var, x8z x8zVar) {
        this.a = ehe0Var;
        this.b = x8zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PreciseLocationErrorStateInteractorImpl$updateErrorState$1 preciseLocationErrorStateInteractorImpl$updateErrorState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PreciseLocationErrorStateInteractorImpl$updateErrorState$1) {
            preciseLocationErrorStateInteractorImpl$updateErrorState$1 = (PreciseLocationErrorStateInteractorImpl$updateErrorState$1) continuationImpl;
            int i2 = preciseLocationErrorStateInteractorImpl$updateErrorState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preciseLocationErrorStateInteractorImpl$updateErrorState$1.label = i2 - Integer.MIN_VALUE;
                obj = preciseLocationErrorStateInteractorImpl$updateErrorState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preciseLocationErrorStateInteractorImpl$updateErrorState$1.label;
                if (i != 0) {
                    b.b(obj);
                    preciseLocationErrorStateInteractorImpl$updateErrorState$1.label = 1;
                    obj = this.a.a.b(preciseLocationErrorStateInteractorImpl$updateErrorState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    x8z x8zVar = this.b;
                    x8zVar.a(((r8z) x8zVar.a.getValue()).a);
                }
                return zy11.a;
            }
        }
        preciseLocationErrorStateInteractorImpl$updateErrorState$1 = new PreciseLocationErrorStateInteractorImpl$updateErrorState$1(this, continuationImpl);
        obj = preciseLocationErrorStateInteractorImpl$updateErrorState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preciseLocationErrorStateInteractorImpl$updateErrorState$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
