package com.yandex.go.user_profile.ui.primary;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pcf0;
import defpackage.sgf0;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsgf0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lsgf0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.primary.ProfileRouter$provideModalView$1", f = "ProfileRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileRouter$provideModalView$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleAction;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRouter$provideModalView$1(c cVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$handleAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileRouter$provideModalView$1 profileRouter$provideModalView$1 = new ProfileRouter$provideModalView$1(this.this$0, this.$handleAction, continuation);
        profileRouter$provideModalView$1.L$0 = obj;
        return profileRouter$provideModalView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProfileRouter$provideModalView$1 profileRouter$provideModalView$1 = (ProfileRouter$provideModalView$1) create((sgf0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        profileRouter$provideModalView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sgf0 sgf0Var = (sgf0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        tls tlsVar = this.$handleAction;
        cVar.getClass();
        tlsVar.invoke(new pcf0(sgf0Var.m, sgf0Var.e, sgf0Var.d));
        return zy11.a;
    }
}
