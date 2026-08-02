package com.yandex.passport.internal.ui.social.authenticators;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.usecase.ui.k;
import com.yandex.passport.internal.usecase.ui.l;
import com.yandex.passport.internal.util.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.social.authenticators.AuthSocialViewModel$onBrowserMailSuccess$1", f = "AuthSocialViewModel.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSocialViewModel$onBrowserMailSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSocialViewModel$onBrowserMailSuccess$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$taskId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSocialViewModel$onBrowserMailSuccess$1(this.this$0, this.$taskId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthSocialViewModel$onBrowserMailSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            l lVar = cVar.E;
            k kVar = new k(p.u(cVar.b.getFilter().getPrimaryEnvironment()), this.$taskId, this.this$0.c.getProviderCode());
            this.label = 1;
            obj = lVar.a(kVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        c cVar2 = this.this$0;
        if (!(value instanceof Result.Failure)) {
            cVar2.e0((ModernAccount) value);
        }
        c cVar3 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            cVar3.c0(a);
        }
        return zy11.a;
    }
}
