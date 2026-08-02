package com.yandex.go.user_profile.ui.am;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.am.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.am.AmProfileRouter$InnerNavigator$showLogoutDialog$1", f = "AmProfileRouter.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AmProfileRouter$InnerNavigator$showLogoutDialog$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmProfileRouter$InnerNavigator$showLogoutDialog$1(s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AmProfileRouter$InnerNavigator$showLogoutDialog$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AmProfileRouter$InnerNavigator$showLogoutDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b0 b0Var = this.this$0.J;
            this.label = 1;
            b = b0Var.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        s sVar = this.this$0;
        if (!(b instanceof Result.Failure) && ((Boolean) b).booleanValue()) {
            sVar.r(new qu(9));
        }
        Throwable a = Result.a(b);
        if (a != null) {
            xby.l(jst.e, "PROFILE_FRAGMENT:LOGOUT_EXCEPTION", null, a, "Failed to logout from account", 2);
        }
        return zy11.a;
    }
}
