package com.yandex.go.data.repositories;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;
    public final /* synthetic */ xq21 c;

    public f(vpr vprVar, h hVar, xq21 xq21Var) {
        this.a = vprVar;
        this.b = hVar;
        this.c = xq21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1 userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1) {
            userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1 = (UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1) continuation;
            int i2 = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$0 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$1 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$2 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$4 = vprVar2;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$5 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$6 = null;
                    userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label = 1;
                    Object a = h.a(this.b, (byte[]) obj, this.c, userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1);
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
                vprVar = (vpr) userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$0 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$1 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$2 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$3 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$4 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$5 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$6 = null;
                userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label = 2;
            }
        }
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1 = new UserPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$0 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$1 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$2 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$3 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$4 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$5 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.L$6 = null;
        userPhotoUploadingRepository$uploadUserPhoto$$inlined$map$1$2$1.label = 2;
    }
}
