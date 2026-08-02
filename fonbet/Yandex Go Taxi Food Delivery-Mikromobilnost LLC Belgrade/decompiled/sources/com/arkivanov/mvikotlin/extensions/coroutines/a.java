package com.arkivanov.mvikotlin.extensions.coroutines;

import defpackage.bvf0;
import defpackage.n1k;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tls;
import defpackage.vpr;
import defpackage.wkh;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class a implements n4u0 {
    public final wkh a;

    public a(wkh wkhVar) {
        this.a = wkhVar;
    }

    @Override // defpackage.hnr0
    public final List b() {
        return Collections.singletonList(this.a.f.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        StoreStateFlow$collect$1 storeStateFlow$collect$1;
        int i;
        try {
            if (continuation instanceof StoreStateFlow$collect$1) {
                storeStateFlow$collect$1 = (StoreStateFlow$collect$1) continuation;
                int i2 = storeStateFlow$collect$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    storeStateFlow$collect$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = storeStateFlow$collect$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = storeStateFlow$collect$1.label;
                    if (i != 0) {
                        b.b(obj);
                        final r0 c = bvf0.c(this.a.f.c);
                        wkh wkhVar = this.a;
                        n1k d = wkhVar.f.d(qje.K(new tls() { // from class: com.arkivanov.mvikotlin.extensions.coroutines.StoreStateFlow$collect$disposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                r0 r0Var = (r0) c;
                                r0Var.getClass();
                                r0Var.m(null, obj2);
                                return zy11.a;
                            }
                        }));
                        storeStateFlow$collect$1.L$0 = d;
                        storeStateFlow$collect$1.label = 1;
                        this = d;
                        if (c.collect(vprVar, storeStateFlow$collect$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n1k n1kVar = (n1k) storeStateFlow$collect$1.L$0;
                        b.b(obj);
                        this = n1kVar;
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.a.invoke(this);
            throw th;
        }
        storeStateFlow$collect$1 = new StoreStateFlow$collect$1(this, continuation);
        Object obj2 = storeStateFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storeStateFlow$collect$1.label;
    }

    @Override // defpackage.n4u0
    public final Object getValue() {
        return this.a.f.c;
    }
}
