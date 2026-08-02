package com.yandex.passport.user_id.ui;

import com.yandex.passport.api.a3;
import com.yandex.passport.user_id.models.g;
import com.yandex.passport.user_id.models.h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.user_id.ui.UserIdExternalUiKt$UserId$6$1", f = "UserIdExternalUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UserIdExternalUiKt$UserId$6$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $events;
    final /* synthetic */ h $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIdExternalUiKt$UserId$6$1(h hVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = hVar;
        this.$events = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserIdExternalUiKt$UserId$6$1(this.$state, this.$events, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserIdExternalUiKt$UserId$6$1 userIdExternalUiKt$UserId$6$1 = (UserIdExternalUiKt$UserId$6$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userIdExternalUiKt$UserId$6$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$state instanceof g) {
            this.$events.invoke(a3.a);
        }
        return zy11.a;
    }
}
