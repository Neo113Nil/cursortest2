package com.yandex.go.ui;

import com.yandex.go.utils.UserPhotoDeleteException;
import com.yandex.go.utils.UserPhotoException;
import com.yandex.go.utils.UserPhotoUploadingException;
import defpackage.bms;
import defpackage.eq21;
import defpackage.ir21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qr21;
import defpackage.rr21;
import defpackage.w511;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Result;", "Lxq21;", ClidProvider.STATE, "", "isUploading", "Lir21;", "permissions", "Ltr21;", "<anonymous>", "(Lkotlin/Result;ZLir21;)Ltr21;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$attachView$3", f = "UserPhotoUploadingPresenter.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$attachView$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$attachView$3(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        UserPhotoUploadingPresenter$attachView$3 userPhotoUploadingPresenter$attachView$3 = new UserPhotoUploadingPresenter$attachView$3(this.this$0, (Continuation) obj4);
        userPhotoUploadingPresenter$attachView$3.L$0 = (Result) obj;
        userPhotoUploadingPresenter$attachView$3.Z$0 = booleanValue;
        userPhotoUploadingPresenter$attachView$3.L$1 = (ir21) obj3;
        return userPhotoUploadingPresenter$attachView$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object qr21Var;
        qr21 qr21Var2;
        Result result = (Result) this.L$0;
        boolean z = this.Z$0;
        ir21 ir21Var = (ir21) this.L$1;
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
        d dVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = z;
        this.label = 1;
        dVar.getClass();
        if (result == null) {
            qr21Var = rr21.a;
        } else if (z) {
            Object value = result.getValue();
            qr21Var = dVar.Qg((xq21) (value instanceof Result.Failure ? null : value), ir21Var, this);
        } else if (result.getValue() instanceof Result.Failure) {
            boolean z2 = result.getValue() instanceof Result.Failure;
            eq21 eq21Var = dVar.G;
            if (z2) {
                Throwable a = Result.a(result.getValue());
                eq21Var.f();
                if (a instanceof UserPhotoException) {
                    UserPhotoException userPhotoException = (UserPhotoException) a;
                    if (userPhotoException instanceof UserPhotoUploadingException) {
                        qr21Var2 = new qr21(new a(dVar, userPhotoException, 0));
                    } else {
                        if (!(userPhotoException instanceof UserPhotoDeleteException)) {
                            w511.b();
                            return null;
                        }
                        qr21Var2 = new qr21(new a(dVar, userPhotoException, 1));
                    }
                    qr21Var = qr21Var2;
                } else {
                    qr21Var = new qr21(new UserPhotoUploadingPresenter$onFailureState$3(0, dVar, d.class, "onRetryButtonClicked", "onRetryButtonClicked()V", 0));
                }
            } else {
                eq21Var.f();
                qr21Var = new qr21(new UserPhotoUploadingPresenter$processUserPhotoUploadingInfo$2(0, dVar, d.class, "onRetryButtonClicked", "onRetryButtonClicked()V", 0));
            }
        } else {
            Object value2 = result.getValue();
            kotlin.b.b(value2);
            qr21Var = dVar.Pg((xq21) value2, ir21Var, this);
        }
        return qr21Var == coroutineSingletons ? coroutineSingletons : qr21Var;
    }
}
