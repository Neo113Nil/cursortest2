package com.yandex.plus.core.debug.panel.internal.presentation.view;

import defpackage.hlz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ukz;
import defpackage.wls;
import defpackage.zvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhlz;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lhlz;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView$observe$3", f = "DebugPanelLogsView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DebugPanelLogsView$observe$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebugPanelLogsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPanelLogsView$observe$3(DebugPanelLogsView debugPanelLogsView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = debugPanelLogsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DebugPanelLogsView$observe$3 debugPanelLogsView$observe$3 = new DebugPanelLogsView$observe$3(this.this$0, continuation);
        debugPanelLogsView$observe$3.L$0 = obj;
        return debugPanelLogsView$observe$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DebugPanelLogsView$observe$3 debugPanelLogsView$observe$3 = (DebugPanelLogsView$observe$3) create((hlz) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        debugPanelLogsView$observe$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ukz ukzVar;
        hlz hlzVar = (hlz) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.updateMatchButtonsState(hlzVar.c);
        ukzVar = this.this$0.logsAdapter;
        ukzVar.submitList(hlzVar.a, new zvg(0, this.this$0, hlzVar));
        return zy11.a;
    }
}
