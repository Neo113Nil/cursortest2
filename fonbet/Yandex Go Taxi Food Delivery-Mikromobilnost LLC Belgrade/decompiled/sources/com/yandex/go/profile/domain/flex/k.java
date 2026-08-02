package com.yandex.go.profile.domain.flex;

import defpackage.kgf0;
import defpackage.kj;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProfileStateRepository$special$$inlined$map$2$2$1 profileStateRepository$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof ProfileStateRepository$special$$inlined$map$2$2$1) {
            profileStateRepository$special$$inlined$map$2$2$1 = (ProfileStateRepository$special$$inlined$map$2$2$1) continuation;
            int i2 = profileStateRepository$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileStateRepository$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = profileStateRepository$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileStateRepository$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kj kjVar = (kj) obj;
                    kgf0 kgf0Var = new kgf0(kjVar != null ? kjVar.a : 0L);
                    profileStateRepository$special$$inlined$map$2$2$1.L$0 = null;
                    profileStateRepository$special$$inlined$map$2$2$1.L$1 = null;
                    profileStateRepository$special$$inlined$map$2$2$1.L$2 = null;
                    profileStateRepository$special$$inlined$map$2$2$1.L$3 = null;
                    profileStateRepository$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(kgf0Var, profileStateRepository$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        profileStateRepository$special$$inlined$map$2$2$1 = new ProfileStateRepository$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = profileStateRepository$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileStateRepository$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
