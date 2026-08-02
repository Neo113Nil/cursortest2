package com.yandex.plus.core.debug.panel.internal.presentation.viewModel;

import defpackage.bms;
import defpackage.cfj;
import defpackage.dfz;
import defpackage.hlz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ogf;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Ljzj;", "logs", "", "isEnabled", "Lcfj;", "dialogState", "Lhlz;", "<anonymous>", "(Ljava/util/List;ZLcfj;)Lhlz;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.debug.panel.internal.presentation.viewModel.DebugPanelLogsViewModel$uiState$1", f = "DebugPanelLogsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DebugPanelLogsViewModel$uiState$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPanelLogsViewModel$uiState$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DebugPanelLogsViewModel$uiState$1 debugPanelLogsViewModel$uiState$1 = new DebugPanelLogsViewModel$uiState$1(this.this$0, (Continuation) obj4);
        debugPanelLogsViewModel$uiState$1.L$0 = (List) obj;
        debugPanelLogsViewModel$uiState$1.Z$0 = booleanValue;
        debugPanelLogsViewModel$uiState$1.L$1 = (cfj) obj3;
        return debugPanelLogsViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dfz dfzVar;
        List list = (List) this.L$0;
        boolean z = this.Z$0;
        cfj cfjVar = (cfj) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ogf ogfVar = (ogf) this.this$0.l.getValue();
        int i = 0;
        if (ogfVar != null && (dfzVar = ogfVar.b) != null) {
            i = y6i0.d(dfzVar.a, 0, this.this$0.h.size() - 1);
        }
        return new hlz(list, i, z, cfjVar);
    }
}
