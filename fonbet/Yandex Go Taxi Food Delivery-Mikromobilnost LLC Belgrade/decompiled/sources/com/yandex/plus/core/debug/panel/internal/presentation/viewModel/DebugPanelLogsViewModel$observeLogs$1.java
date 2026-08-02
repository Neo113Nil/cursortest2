package com.yandex.plus.core.debug.panel.internal.presentation.viewModel;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "Lrvg;", "it", "Lzy11;", "<anonymous>", "(Ltse;Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.debug.panel.internal.presentation.viewModel.DebugPanelLogsViewModel$observeLogs$1", f = "DebugPanelLogsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DebugPanelLogsViewModel$observeLogs$1 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPanelLogsViewModel$observeLogs$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DebugPanelLogsViewModel$observeLogs$1 debugPanelLogsViewModel$observeLogs$1 = new DebugPanelLogsViewModel$observeLogs$1(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        debugPanelLogsViewModel$observeLogs$1.invokeSuspend(zy11Var);
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
        bVar.a();
        bVar.b();
        return zy11.a;
    }
}
