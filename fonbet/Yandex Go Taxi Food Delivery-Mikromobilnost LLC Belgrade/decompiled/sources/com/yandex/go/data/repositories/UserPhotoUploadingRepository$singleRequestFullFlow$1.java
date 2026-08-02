package com.yandex.go.data.repositories;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lcmt;", "it", "Lfmt;", "<anonymous>", "(Lcmt;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.data.repositories.UserPhotoUploadingRepository$singleRequestFullFlow$1", f = "UserPhotoUploadingRepository.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserPhotoUploadingRepository$singleRequestFullFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserPhotoUploadingRepository$singleRequestFullFlow$1 userPhotoUploadingRepository$singleRequestFullFlow$1 = new UserPhotoUploadingRepository$singleRequestFullFlow$1(2, continuation);
        userPhotoUploadingRepository$singleRequestFullFlow$1.L$0 = obj;
        return userPhotoUploadingRepository$singleRequestFullFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingRepository$singleRequestFullFlow$1) create((cmt) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cmt cmtVar = (cmt) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.L$0 = null;
        this.label = 1;
        Object a = cmtVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
