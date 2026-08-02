package com.yandex.passport.common.mvi;

import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.p2;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public abstract class k {
    public final h1 a;
    public final com.yandex.passport.internal.ui.bouncer.model.middleware.a b;
    public final com.yandex.passport.internal.ui.bouncer.model.middleware.b c;
    public final p2 d;
    public final r0 e;
    public final n0 f = ffx.c(0, 5, null, 5);

    public k(h1 h1Var, com.yandex.passport.internal.ui.bouncer.model.middleware.a aVar, com.yandex.passport.internal.ui.bouncer.model.middleware.b bVar, p2 p2Var, s1 s1Var) {
        this.a = h1Var;
        this.b = aVar;
        this.c = bVar;
        this.d = p2Var;
        this.e = bvf0.c(s1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(f fVar, ContinuationImpl continuationImpl) {
        Store$bindRenderer$1 store$bindRenderer$1;
        int i;
        if (continuationImpl instanceof Store$bindRenderer$1) {
            store$bindRenderer$1 = (Store$bindRenderer$1) continuationImpl;
            int i2 = store$bindRenderer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                store$bindRenderer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = store$bindRenderer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = store$bindRenderer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(0, fVar);
                    store$bindRenderer$1.label = 1;
                    if (this.e.collect(iVar, store$bindRenderer$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        store$bindRenderer$1 = new Store$bindRenderer$1(this, continuationImpl);
        Object obj2 = store$bindRenderer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = store$bindRenderer$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
