package com.yandex.mob.datastore;

import defpackage.ny61;
import defpackage.tm20;
import defpackage.vpr;
import defpackage.xr20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TypedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1 typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof TypedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1) {
            typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1 = (TypedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    tm20 tm20Var = ((xr20) obj).o;
                    if (tm20Var != null) {
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(tm20Var, typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1 = new TypedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobConfigStorage$configFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
