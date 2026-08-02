package com.yandex.go.navigator.repository;

import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (r9.emit(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigationInstanceRepository$special$$inlined$map$1$2$1 navigationInstanceRepository$special$$inlined$map$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        vpr vprVar2;
        if (continuation instanceof NavigationInstanceRepository$special$$inlined$map$1$2$1) {
            navigationInstanceRepository$special$$inlined$map$1$2$1 = (NavigationInstanceRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = navigationInstanceRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationInstanceRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = navigationInstanceRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationInstanceRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    obj2 = (Navigation) obj;
                    vprVar = this.a;
                    if (obj2 == null) {
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$0 = null;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$1 = null;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$2 = null;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$3 = null;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$4 = vprVar;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$5 = null;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.L$6 = null;
                        navigationInstanceRepository$special$$inlined$map$1$2$1.label = 1;
                        Object a = f.a(this.b, navigationInstanceRepository$special$$inlined$map$1$2$1);
                        if (a != coroutineSingletons) {
                            obj3 = a;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$0 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$1 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$2 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$3 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$4 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$5 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.L$6 = null;
                    navigationInstanceRepository$special$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) navigationInstanceRepository$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                obj2 = obj3;
                vprVar = vprVar2;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$0 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$1 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$2 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$3 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$4 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$5 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.L$6 = null;
                navigationInstanceRepository$special$$inlined$map$1$2$1.label = 2;
            }
        }
        navigationInstanceRepository$special$$inlined$map$1$2$1 = new NavigationInstanceRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj32 = navigationInstanceRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationInstanceRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        obj2 = obj32;
        vprVar = vprVar2;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$0 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$1 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$2 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$3 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$4 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$5 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.L$6 = null;
        navigationInstanceRepository$special$$inlined$map$1$2$1.label = 2;
    }
}
