package com.yandex.go.settings.domain;

import defpackage.gyt0;
import defpackage.mvg;
import defpackage.n3x0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.domain.SystemNotificationsStateRepository$notificationsEnabled$1", f = "SystemNotificationsStateRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SystemNotificationsStateRepository$notificationsEnabled$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemNotificationsStateRepository$notificationsEnabled$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SystemNotificationsStateRepository$notificationsEnabled$1 systemNotificationsStateRepository$notificationsEnabled$1 = new SystemNotificationsStateRepository$notificationsEnabled$1(this.this$0, continuation);
        systemNotificationsStateRepository$notificationsEnabled$1.L$0 = obj;
        return systemNotificationsStateRepository$notificationsEnabled$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SystemNotificationsStateRepository$notificationsEnabled$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n3x0 n3x0Var = new n3x0(y6f0Var, this.this$0);
            this.this$0.b.b(n3x0Var, n3x0Var);
            gyt0 gyt0Var = new gyt0(23, this.this$0, n3x0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, gyt0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
