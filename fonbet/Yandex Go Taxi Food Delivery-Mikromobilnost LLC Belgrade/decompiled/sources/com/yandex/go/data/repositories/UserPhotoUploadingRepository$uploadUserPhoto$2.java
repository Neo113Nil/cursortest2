package com.yandex.go.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.data.repositories.UserPhotoUploadingRepository$uploadUserPhoto$2", f = "UserPhotoUploadingRepository.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserPhotoUploadingRepository$uploadUserPhoto$2 extends SuspendLambda implements wls {
    final /* synthetic */ byte[] $photoByteArray;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingRepository$uploadUserPhoto$2(byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.$photoByteArray = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserPhotoUploadingRepository$uploadUserPhoto$2 userPhotoUploadingRepository$uploadUserPhoto$2 = new UserPhotoUploadingRepository$uploadUserPhoto$2(this.$photoByteArray, continuation);
        userPhotoUploadingRepository$uploadUserPhoto$2.L$0 = obj;
        return userPhotoUploadingRepository$uploadUserPhoto$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingRepository$uploadUserPhoto$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            byte[] bArr = this.$photoByteArray;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(bArr, this) == coroutineSingletons) {
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
