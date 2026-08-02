package com.yandex.go.data.repositories;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class g implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ h b;
    public final /* synthetic */ xq21 c;

    public g(rol0 rol0Var, h hVar, xq21 xq21Var) {
        this.a = rol0Var;
        this.b = hVar;
        this.c = xq21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1 userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1;
        int i;
        if (continuation instanceof UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1) {
            userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1 = (UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1) continuation;
            int i2 = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b, this.c);
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.L$0 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.L$1 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.L$2 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1) == coroutineSingletons) {
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
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1 = new UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1(this, continuation);
        Object obj2 = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
