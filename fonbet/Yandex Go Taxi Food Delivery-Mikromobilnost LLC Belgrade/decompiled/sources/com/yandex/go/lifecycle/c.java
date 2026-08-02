package com.yandex.go.lifecycle;

import defpackage.ir60;
import defpackage.j1;
import defpackage.noh;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.tse;
import defpackage.w511;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class c {
    public final AtomicReference a = new AtomicReference();

    public abstract tse a();

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r9.u0(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ObtainType obtainType, ContinuationImpl continuationImpl) {
        ObtainInstanceListener$obtain$1 obtainInstanceListener$obtain$1;
        int i;
        noh nohVar;
        if (continuationImpl instanceof ObtainInstanceListener$obtain$1) {
            obtainInstanceListener$obtain$1 = (ObtainInstanceListener$obtain$1) continuationImpl;
            int i2 = obtainInstanceListener$obtain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                obtainInstanceListener$obtain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = obtainInstanceListener$obtain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = obtainInstanceListener$obtain$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            nohVar = (noh) obtainInstanceListener$obtain$1.L$1;
                            kotlin.b.b(obj);
                        } else if (i == 3) {
                        } else if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                int i3 = ir60.a[obtainType.ordinal()];
                AtomicReference atomicReference = this.a;
                if (i3 == 1) {
                    noh nohVar2 = (noh) atomicReference.updateAndGet(new b(this));
                    obtainInstanceListener$obtain$1.L$0 = null;
                    obtainInstanceListener$obtain$1.label = 1;
                    Object k = nohVar2.k(obtainInstanceListener$obtain$1);
                    if (k != coroutineSingletons) {
                        return k;
                    }
                } else if (i3 == 2) {
                    nohVar = (noh) atomicReference.updateAndGet(new b(this));
                    s8x a = kotlinx.coroutines.a.a();
                    nohVar.w(new j1(18, a));
                    obtainInstanceListener$obtain$1.L$0 = null;
                    obtainInstanceListener$obtain$1.L$1 = nohVar;
                    obtainInstanceListener$obtain$1.L$2 = null;
                    obtainInstanceListener$obtain$1.label = 2;
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    ObtainInstanceListener$obtain$2 obtainInstanceListener$obtain$2 = new ObtainInstanceListener$obtain$2(this, null);
                    obtainInstanceListener$obtain$1.L$0 = null;
                    obtainInstanceListener$obtain$1.label = 4;
                    Object u = kotlinx.coroutines.a.u(30000L, obtainInstanceListener$obtain$2, obtainInstanceListener$obtain$1);
                    if (u != coroutineSingletons) {
                        return u;
                    }
                }
                obtainInstanceListener$obtain$1.L$0 = null;
                obtainInstanceListener$obtain$1.L$1 = null;
                obtainInstanceListener$obtain$1.L$2 = null;
                obtainInstanceListener$obtain$1.label = 3;
                Object k2 = nohVar.k(obtainInstanceListener$obtain$1);
                return k2 != coroutineSingletons ? coroutineSingletons : k2;
            }
        }
        obtainInstanceListener$obtain$1 = new ObtainInstanceListener$obtain$1(this, continuationImpl);
        Object obj2 = obtainInstanceListener$obtain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = obtainInstanceListener$obtain$1.label;
        if (i == 0) {
        }
        obtainInstanceListener$obtain$1.L$0 = null;
        obtainInstanceListener$obtain$1.L$1 = null;
        obtainInstanceListener$obtain$1.L$2 = null;
        obtainInstanceListener$obtain$1.label = 3;
        Object k22 = nohVar.k(obtainInstanceListener$obtain$1);
        if (k22 != coroutineSingletons2) {
        }
    }

    public abstract Object c(Continuation continuation);
}
