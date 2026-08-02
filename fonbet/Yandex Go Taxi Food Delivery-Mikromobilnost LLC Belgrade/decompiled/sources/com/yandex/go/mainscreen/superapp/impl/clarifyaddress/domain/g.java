package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.lwz0;
import defpackage.nwz0;
import defpackage.ny61;
import defpackage.p8z;
import defpackage.q8z;
import defpackage.r8z;
import defpackage.rbc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
    
        if (r6.emit(r2, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CollectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1 collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        Object obj3;
        vpr vprVar2;
        if (continuation instanceof CollectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1) {
            collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1 = (CollectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1) continuation;
            int i2 = collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    r8z r8zVar = (r8z) obj;
                    boolean z = r8zVar instanceof p8z;
                    obj2 = lwz0.a;
                    vprVar = this.a;
                    if (z) {
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$0 = null;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$1 = null;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$2 = null;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$3 = null;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$5 = null;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$6 = null;
                        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label = 1;
                        i iVar = this.b;
                        iVar.getClass();
                        int i3 = rbc.a[((p8z) r8zVar).a.ordinal()];
                        if (i3 == 1) {
                            obj3 = nwz0.a;
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3 && i3 != 4 && i3 != 5) {
                                    w511.b();
                                    return null;
                                }
                                obj4 = obj2;
                                if (obj4 != coroutineSingletons) {
                                    vprVar2 = vprVar;
                                }
                                return coroutineSingletons;
                            }
                            obj3 = iVar.a(collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1);
                        }
                        obj4 = obj3;
                        if (obj4 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (!(r8zVar instanceof q8z)) {
                        w511.b();
                        return null;
                    }
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$0 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$1 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$2 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$3 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$4 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$5 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$6 = null;
                    collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj4);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj4);
                }
                vprVar = vprVar2;
                obj2 = obj4;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$0 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$1 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$2 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$3 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$4 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$5 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$6 = null;
                collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1 = new CollectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj42 = collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        vprVar = vprVar2;
        obj2 = obj42;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$0 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$1 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$2 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$3 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$4 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$5 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.L$6 = null;
        collectLocationErrorsInteractor$locationErrorsFlow$$inlined$map$1$2$1.label = 2;
    }
}
