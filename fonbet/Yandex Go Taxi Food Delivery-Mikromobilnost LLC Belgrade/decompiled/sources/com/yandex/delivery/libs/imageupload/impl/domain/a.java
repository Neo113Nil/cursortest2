package com.yandex.delivery.libs.imageupload.impl.domain;

import defpackage.ac21;
import defpackage.bc21;
import defpackage.cc21;
import defpackage.dc21;
import defpackage.ec21;
import defpackage.fc21;
import defpackage.gc21;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink.Responses$GenerateUploadLinkResponseDto;

/* loaded from: classes11.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Responses$GenerateUploadLinkResponseDto b;

    public a(vpr vprVar, Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto) {
        this.a = vprVar;
        this.b = responses$GenerateUploadLinkResponseDto;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1 uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        Object gc21Var;
        if (continuation instanceof UploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1) {
            uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1 = (UploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dc21 dc21Var = (dc21) obj;
                    if (dc21Var instanceof ac21) {
                        gc21Var = new fc21(((ac21) dc21Var).a);
                    } else if (dc21Var instanceof bc21) {
                        bc21 bc21Var = (bc21) dc21Var;
                        gc21Var = new ec21(bc21Var.a, bc21Var.b);
                    } else {
                        if (!jl40.l(dc21Var, cc21.a)) {
                            w511.b();
                            return null;
                        }
                        Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto = this.b;
                        gc21Var = new gc21(responses$GenerateUploadLinkResponseDto.getPath(), responses$GenerateUploadLinkResponseDto.getDownloadUrl());
                    }
                    uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                    uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(gc21Var, uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1 = new UploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uploadImageTaskImpl$invokeWithProgress$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
