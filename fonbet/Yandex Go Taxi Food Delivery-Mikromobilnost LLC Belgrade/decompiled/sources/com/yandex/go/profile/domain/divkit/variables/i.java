package com.yandex.go.profile.domain.divkit.variables;

import defpackage.ny61;
import defpackage.u131;
import defpackage.vpr;
import defpackage.xv11;
import defpackage.yv11;
import defpackage.z131;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class i implements vpr {
    public final /* synthetic */ yv11 a;

    public i(yv11 yv11Var) {
        this.a = yv11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UltimaVariableHandler$init$$inlined$safeCollectIn$1$2$1 ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1;
        int i;
        boolean booleanValue;
        String str;
        if (continuation instanceof UltimaVariableHandler$init$$inlined$safeCollectIn$1$2$1) {
            ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1 = (UltimaVariableHandler$init$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.label;
                yv11 yv11Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    booleanValue = ((Boolean) obj).booleanValue();
                    xv11 xv11Var = (xv11) yv11Var.b.get();
                    ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.Z$0 = booleanValue;
                    ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = ((com.yandex.go.ultima_mode.domain.c) xv11Var).b(ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    booleanValue = ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.Z$0;
                    kotlin.b.b(obj2);
                }
                str = (String) obj2;
                u131 u131Var = new u131("superapp.profile.ultima_available", booleanValue);
                if (str == null) {
                    str = "";
                }
                yv11Var.b(u131Var, new z131("superapp.profile.ultima_state", str));
                return zy11.a;
            }
        }
        ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1 = new UltimaVariableHandler$init$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ultimaVariableHandler$init$$inlined$safeCollectIn$1$2$1.label;
        yv11 yv11Var2 = this.a;
        if (i != 0) {
        }
        str = (String) obj22;
        u131 u131Var2 = new u131("superapp.profile.ultima_available", booleanValue);
        if (str == null) {
        }
        yv11Var2.b(u131Var2, new z131("superapp.profile.ultima_state", str));
        return zy11.a;
    }
}
