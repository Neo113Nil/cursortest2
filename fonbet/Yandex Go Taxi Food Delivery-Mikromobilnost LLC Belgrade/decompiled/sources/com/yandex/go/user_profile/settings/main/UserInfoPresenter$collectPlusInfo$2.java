package com.yandex.go.user_profile.settings.main;

import defpackage.h8b0;
import defpackage.lk51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.on21;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.cashback.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llk51;", "yaPlusInfo", "Lh8b0;", "personalWallet", "<anonymous>", "(Llk51;Lh8b0;)Llk51;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.settings.main.UserInfoPresenter$collectPlusInfo$2", f = "UserInfoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserInfoPresenter$collectPlusInfo$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ on21 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoPresenter$collectPlusInfo$2(on21 on21Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = on21Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserInfoPresenter$collectPlusInfo$2 userInfoPresenter$collectPlusInfo$2 = new UserInfoPresenter$collectPlusInfo$2(this.this$0, (Continuation) obj3);
        userInfoPresenter$collectPlusInfo$2.L$0 = (lk51) obj;
        userInfoPresenter$collectPlusInfo$2.L$1 = (h8b0) obj2;
        return userInfoPresenter$collectPlusInfo$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lk51 lk51Var = (lk51) this.L$0;
        h8b0 h8b0Var = (h8b0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (h8b0Var == null || !((l) this.this$0.J).a().b) ? lk51Var : lk51.e;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
