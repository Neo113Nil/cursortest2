package com.yandex.go.repositories;

import defpackage.bgv;
import defpackage.egv;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1 userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1) {
            userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1 = (UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1) continuation;
            int i2 = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    egv egvVar = (egv) obj;
                    String b = egvVar != null ? egvVar.b() : null;
                    this.b.getClass();
                    if (b == null || evu0.J(b)) {
                        b = null;
                    }
                    bgv bgvVar = new bgv(b, egvVar != null ? egvVar.a() : null);
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.L$0 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.L$1 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.L$2 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.L$3 = null;
                    userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(bgvVar, userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1 = new UserPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1(this, continuation);
        Object obj22 = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoStateRepository$photoUrlFlowInternal$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
