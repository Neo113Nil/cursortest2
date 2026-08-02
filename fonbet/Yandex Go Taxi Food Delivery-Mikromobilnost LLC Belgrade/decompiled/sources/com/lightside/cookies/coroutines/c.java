package com.lightside.cookies.coroutines;

import defpackage.n4u0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tpr;
import defpackage.vpr;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes11.dex */
public final class c implements n4u0 {
    public final sls a;
    public final tpr b;

    public c(tpr tprVar, sls slsVar) {
        this.a = slsVar;
        this.b = tprVar;
    }

    @Override // defpackage.hnr0
    public final List b() {
        return Collections.singletonList(this.a.invoke());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransformedStateFlow$collect$1 transformedStateFlow$collect$1;
        int i;
        if (continuation instanceof TransformedStateFlow$collect$1) {
            transformedStateFlow$collect$1 = (TransformedStateFlow$collect$1) continuation;
            int i2 = transformedStateFlow$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transformedStateFlow$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transformedStateFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transformedStateFlow$collect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transformedStateFlow$collect$1.label = 1;
                    if (this.b.collect(vprVar, transformedStateFlow$collect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                throw new CancellationException();
            }
        }
        transformedStateFlow$collect$1 = new TransformedStateFlow$collect$1(this, continuation);
        Object obj2 = transformedStateFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transformedStateFlow$collect$1.label;
        if (i != 0) {
        }
        throw new CancellationException();
    }

    @Override // defpackage.n4u0
    public final Object getValue() {
        return this.a.invoke();
    }
}
