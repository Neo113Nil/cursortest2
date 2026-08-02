package com.yandex.go.repositories;

import defpackage.bgv;
import defpackage.jl40;
import defpackage.jq21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljq21;", "launchUserPhoto", "Lbgv;", "currentUserPhoto", "<anonymous>", "(Ljq21;Lbgv;)Lbgv;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.repositories.UserPhotoStateRepository$photoUrlFlowInternal$4", f = "UserPhotoStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserPhotoStateRepository$photoUrlFlowInternal$4 extends SuspendLambda implements zls {
    final /* synthetic */ String $passportAvatar;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoStateRepository$photoUrlFlowInternal$4(String str, Continuation continuation) {
        super(3, continuation);
        this.$passportAvatar = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserPhotoStateRepository$photoUrlFlowInternal$4 userPhotoStateRepository$photoUrlFlowInternal$4 = new UserPhotoStateRepository$photoUrlFlowInternal$4(this.$passportAvatar, (Continuation) obj3);
        userPhotoStateRepository$photoUrlFlowInternal$4.L$0 = (jq21) obj;
        userPhotoStateRepository$photoUrlFlowInternal$4.L$1 = (bgv) obj2;
        return userPhotoStateRepository$photoUrlFlowInternal$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        jq21 jq21Var = (jq21) this.L$0;
        bgv bgvVar = (bgv) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str2 = jq21Var != null ? jq21Var.b : null;
        String str3 = bgvVar.a;
        if (str3 == null) {
            str3 = str2 == null ? this.$passportAvatar : str2;
        }
        if (jl40.l(str3, str2)) {
            if (jq21Var == null || (str = jq21Var.c) == null) {
                str = AvatarStatus.NOT_FOUND_STATUS.getText();
            }
        } else if (jl40.l(str3, this.$passportAvatar)) {
            str = AvatarStatus.APPROVED.getText();
        } else {
            str = bgvVar.b;
            if (str == null) {
                str = AvatarStatus.NOT_FOUND_STATUS.getText();
            }
        }
        return new bgv(str3, str);
    }
}
