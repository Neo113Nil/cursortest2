package com.yandex.go.repositories;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ e b;

    public d(r0 r0Var, e eVar) {
        this.a = r0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1 userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1;
        int i;
        if (continuation instanceof UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1) {
            userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1 = (UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1) continuation;
            int i2 = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.L$0 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.L$1 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.L$2 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1 = new UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1(this, continuation);
        Object obj2 = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
