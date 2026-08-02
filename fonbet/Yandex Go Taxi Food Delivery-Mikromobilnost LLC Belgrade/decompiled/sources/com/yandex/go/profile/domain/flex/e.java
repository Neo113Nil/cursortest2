package com.yandex.go.profile.domain.flex;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ f b;

    public e(tpr tprVar, f fVar) {
        this.a = tprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProfileRepository$getActionsFlow$$inlined$map$1$1 profileRepository$getActionsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ProfileRepository$getActionsFlow$$inlined$map$1$1) {
            profileRepository$getActionsFlow$$inlined$map$1$1 = (ProfileRepository$getActionsFlow$$inlined$map$1$1) continuation;
            int i2 = profileRepository$getActionsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileRepository$getActionsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileRepository$getActionsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileRepository$getActionsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    profileRepository$getActionsFlow$$inlined$map$1$1.L$0 = null;
                    profileRepository$getActionsFlow$$inlined$map$1$1.L$1 = null;
                    profileRepository$getActionsFlow$$inlined$map$1$1.L$2 = null;
                    profileRepository$getActionsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, profileRepository$getActionsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        profileRepository$getActionsFlow$$inlined$map$1$1 = new ProfileRepository$getActionsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = profileRepository$getActionsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileRepository$getActionsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
