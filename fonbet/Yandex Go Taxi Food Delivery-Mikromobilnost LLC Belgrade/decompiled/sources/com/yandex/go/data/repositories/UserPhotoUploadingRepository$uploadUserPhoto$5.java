package com.yandex.go.data.repositories;

import com.yandex.go.data.entities.network.UserPhotoStateResponse;
import com.yandex.go.repositories.AvatarStatus;
import defpackage.jl40;
import defpackage.md21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/data/entities/network/UserPhotoStateResponse;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/data/entities/network/UserPhotoStateResponse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.data.repositories.UserPhotoUploadingRepository$uploadUserPhoto$5", f = "UserPhotoUploadingRepository.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserPhotoUploadingRepository$uploadUserPhoto$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingRepository$uploadUserPhoto$5(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserPhotoUploadingRepository$uploadUserPhoto$5 userPhotoUploadingRepository$uploadUserPhoto$5 = new UserPhotoUploadingRepository$uploadUserPhoto$5(this.this$0, continuation);
        userPhotoUploadingRepository$uploadUserPhoto$5.L$0 = obj;
        return userPhotoUploadingRepository$uploadUserPhoto$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingRepository$uploadUserPhoto$5) create((UserPhotoStateResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        UserPhotoStateResponse userPhotoStateResponse = (UserPhotoStateResponse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h hVar = this.this$0;
        String str = userPhotoStateResponse.d.c;
        this.L$0 = null;
        this.label = 1;
        if (hVar.f && jl40.l(str, AvatarStatus.APPROVED.getText())) {
            r0 r0Var = ((md21) hVar.g.get()).a.a;
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            r0Var.getClass();
            r0Var.m(null, valueOf);
            obj2 = hVar.k.emit(zy11Var, this);
        } else {
            obj2 = zy11Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
