package com.yandex.messaging.ui.settings;

import defpackage.ds31;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u9u0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lij60;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.NotificationSettingsViewModel$uiState$1", f = "NotificationSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationSettingsViewModel$uiState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModel$uiState$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationSettingsViewModel$uiState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NotificationSettingsViewModel$uiState$1 notificationSettingsViewModel$uiState$1 = (NotificationSettingsViewModel$uiState$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        notificationSettingsViewModel$uiState$1.invokeSuspend(zy11Var);
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
        b bVar = this.this$0;
        boolean z = ((u9u0) bVar.b.get()).w;
        zy11 zy11Var = zy11.a;
        if (!z) {
            return zy11Var;
        }
        kotlinx.coroutines.flow.e.H(ds31.a(bVar), new jqr(bVar.c.a(zy11Var), new NotificationSettingsViewModel$loadInitialState$1(bVar, null), 3));
        return zy11Var;
    }
}
