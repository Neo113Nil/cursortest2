package com.yandex.go.superapp.tracking.api.dependencies;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1 defaultTrackingSourceInteractor$start$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1) {
            defaultTrackingSourceInteractor$start$$inlined$map$1$2$1 = (DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1) continuation;
            int i2 = defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$0 = null;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$1 = null;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$2 = null;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$4 = vprVar2;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$5 = null;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$6 = null;
                    defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label = 1;
                    Object a = this.b.a(obj, defaultTrackingSourceInteractor$start$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$0 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$1 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$2 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$3 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$4 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$5 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$6 = null;
                defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label = 2;
            }
        }
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1 = new DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1(this, continuation);
        Object obj22 = defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$0 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$1 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$2 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$3 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$4 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$5 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.L$6 = null;
        defaultTrackingSourceInteractor$start$$inlined$map$1$2$1.label = 2;
    }
}
