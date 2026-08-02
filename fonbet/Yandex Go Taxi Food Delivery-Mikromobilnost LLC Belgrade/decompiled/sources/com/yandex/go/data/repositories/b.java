package com.yandex.go.data.repositories;

import com.yandex.go.data.entities.network.UserPhotoStateResponse;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public b(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1 userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof UserPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1) {
            userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1 = (UserPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1) continuation;
            int i2 = userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.data.mappers.a aVar = this.b.b;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$0 = null;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$1 = null;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$2 = null;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$4 = vprVar;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$5 = null;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$6 = null;
                    userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label = 1;
                    obj2 = aVar.a((UserPhotoStateResponse) obj, userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$0 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$1 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$2 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$3 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$4 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$5 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$6 = null;
                userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label = 2;
            }
        }
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1 = new UserPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$0 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$1 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$2 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$3 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$4 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$5 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.L$6 = null;
        userPhotoUploadingRepository$collectUserPhotoUploadingState$$inlined$map$1$2$1.label = 2;
    }
}
