package com.yandex.messaging.ui.main.telemessenger.connection;

import defpackage.m0t0;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.connection.ConnectionStatusContentKt$ConnectionStatusContent$1$1", f = "ConnectionStatusContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ConnectionStatusContentKt$ConnectionStatusContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ysm $snackbarState;
    final /* synthetic */ m3u0 $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionStatusContentKt$ConnectionStatusContent$1$1(ysm ysmVar, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$snackbarState = ysmVar;
        this.$state$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionStatusContentKt$ConnectionStatusContent$1$1(this.$snackbarState, this.$state$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ConnectionStatusContentKt$ConnectionStatusContent$1$1 connectionStatusContentKt$ConnectionStatusContent$1$1 = (ConnectionStatusContentKt$ConnectionStatusContent$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        connectionStatusContentKt$ConnectionStatusContent$1$1.invokeSuspend(zy11Var);
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
        boolean booleanValue = ((Boolean) ((m0t0) this.$state$delegate.getValue()).f.getValue()).booleanValue();
        ysm ysmVar = this.$snackbarState;
        if (booleanValue) {
            ysmVar.a.setValue(Boolean.TRUE);
        } else {
            ysmVar.a.setValue(Boolean.FALSE);
        }
        return zy11.a;
    }
}
