package com.yandex.go.ui;

import com.yandex.go.domain.entities.UserPhotoButtonAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$onDeletePhotoClicked$1", f = "UserPhotoUploadingPresenter.kt", l = {290, 291, 294, 294}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$onDeletePhotoClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ xq21 $userPhotoUploadingInfo;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$onDeletePhotoClicked$1(d dVar, xq21 xq21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$userPhotoUploadingInfo = xq21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPhotoUploadingPresenter$onDeletePhotoClicked$1(this.this$0, this.$userPhotoUploadingInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingPresenter$onDeletePhotoClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (Throwable th) {
            r0 r0Var = this.this$0.M;
            Boolean bool = Boolean.FALSE;
            this.L$0 = th;
            this.label = 4;
            r0Var.emit(bool, this);
            if (zy11Var != coroutineSingletons) {
                throw th;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var2 = this.this$0.M;
            Boolean bool2 = Boolean.TRUE;
            this.label = 1;
            r0Var2.emit(bool2, this);
            if (zy11Var == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    this.this$0.G.b(UserPhotoButtonAction.DELETE_PHOTO, true);
                    r0 r0Var3 = this.this$0.M;
                    Boolean bool3 = Boolean.FALSE;
                    this.label = 3;
                    r0Var3.emit(bool3, this);
                    return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.L$0;
                kotlin.b.b(obj);
                throw th2;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.domain.interactor.d dVar = this.this$0.z;
        xq21 xq21Var = this.$userPhotoUploadingInfo;
        this.label = 2;
        if (dVar.b.c(xq21Var, this) == coroutineSingletons) {
        }
        this.this$0.G.b(UserPhotoButtonAction.DELETE_PHOTO, true);
        r0 r0Var32 = this.this$0.M;
        Boolean bool32 = Boolean.FALSE;
        this.label = 3;
        r0Var32.emit(bool32, this);
        if (zy11Var != coroutineSingletons) {
        }
    }
}
