package com.yandex.go.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r40;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr40;", "it", "Lzy11;", "<anonymous>", "(Lr40;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$attachView$8", f = "UserPhotoUploadingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$attachView$8 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$attachView$8(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserPhotoUploadingPresenter$attachView$8 userPhotoUploadingPresenter$attachView$8 = new UserPhotoUploadingPresenter$attachView$8(this.this$0, continuation);
        userPhotoUploadingPresenter$attachView$8.L$0 = obj;
        return userPhotoUploadingPresenter$attachView$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserPhotoUploadingPresenter$attachView$8 userPhotoUploadingPresenter$attachView$8 = (UserPhotoUploadingPresenter$attachView$8) create((r40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userPhotoUploadingPresenter$attachView$8.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r40 r40Var = (r40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        AtomicReference atomicReference = this.this$0.C.a;
        r40 r40Var2 = (r40) atomicReference.get();
        if (r40Var2 != null && r40Var2.b == 131) {
        }
        this.this$0.Og(r40Var);
        return zy11.a;
    }
}
