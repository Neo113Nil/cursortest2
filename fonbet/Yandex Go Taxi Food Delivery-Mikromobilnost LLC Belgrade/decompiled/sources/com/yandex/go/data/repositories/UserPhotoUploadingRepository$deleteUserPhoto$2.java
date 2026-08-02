package com.yandex.go.data.repositories;

import com.yandex.go.utils.UserPhotoDeleteException;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.vpr;
import defpackage.xq21;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lzy11;", "", "it", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.data.repositories.UserPhotoUploadingRepository$deleteUserPhoto$2", f = "UserPhotoUploadingRepository.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserPhotoUploadingRepository$deleteUserPhoto$2 extends SuspendLambda implements zls {
    final /* synthetic */ xq21 $userPhotoUploadingInfo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingRepository$deleteUserPhoto$2(xq21 xq21Var, Continuation continuation) {
        super(3, continuation);
        this.$userPhotoUploadingInfo = xq21Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserPhotoUploadingRepository$deleteUserPhoto$2 userPhotoUploadingRepository$deleteUserPhoto$2 = new UserPhotoUploadingRepository$deleteUserPhoto$2(this.$userPhotoUploadingInfo, (Continuation) obj3);
        userPhotoUploadingRepository$deleteUserPhoto$2.L$0 = (vpr) obj;
        userPhotoUploadingRepository$deleteUserPhoto$2.L$1 = (Throwable) obj2;
        return userPhotoUploadingRepository$deleteUserPhoto$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
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
        if (!s8o.C(th)) {
            UserPhotoDeleteException userPhotoDeleteException = new UserPhotoDeleteException(this.$userPhotoUploadingInfo);
            userPhotoDeleteException.initCause(th);
            throw userPhotoDeleteException;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
