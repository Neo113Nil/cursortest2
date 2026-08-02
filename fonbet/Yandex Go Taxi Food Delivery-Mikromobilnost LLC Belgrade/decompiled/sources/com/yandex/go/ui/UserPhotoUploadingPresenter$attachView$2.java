package com.yandex.go.ui;

import defpackage.eci0;
import defpackage.egv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$attachView$2", f = "UserPhotoUploadingPresenter.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$attachView$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$attachView$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPhotoUploadingPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar2 = this.this$0;
            eci0 eci0Var = dVar2.A.g;
            this.L$0 = dVar2;
            this.label = 1;
            Object A = e.A(eci0Var, this);
            if (A == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = A;
            dVar = dVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = (d) this.L$0;
            kotlin.b.b(obj);
        }
        dVar.P = (egv) obj;
        return zy11.a;
    }
}
