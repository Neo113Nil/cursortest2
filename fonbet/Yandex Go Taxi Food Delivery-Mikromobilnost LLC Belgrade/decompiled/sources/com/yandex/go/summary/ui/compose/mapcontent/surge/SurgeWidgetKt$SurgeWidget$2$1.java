package com.yandex.go.summary.ui.compose.mapcontent.surge;

import defpackage.fow0;
import defpackage.mvg;
import defpackage.nww0;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.mapcontent.surge.SurgeWidgetKt$SurgeWidget$2$1", f = "SurgeWidget.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SurgeWidgetKt$SurgeWidget$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $previousSurgeWasBlizzard;
    final /* synthetic */ nww0 $surgeWidgetUiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeWidgetKt$SurgeWidget$2$1(nww0 nww0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$surgeWidgetUiState = nww0Var;
        this.$previousSurgeWasBlizzard = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeWidgetKt$SurgeWidget$2$1(this.$surgeWidgetUiState, this.$previousSurgeWasBlizzard, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SurgeWidgetKt$SurgeWidget$2$1 surgeWidgetKt$SurgeWidget$2$1 = (SurgeWidgetKt$SurgeWidget$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        surgeWidgetKt$SurgeWidget$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        fow0 fow0Var = this.$surgeWidgetUiState.c;
        oz40 oz40Var = this.$previousSurgeWasBlizzard;
        if (fow0Var != null) {
            oz40Var.setValue(Boolean.TRUE);
        } else if (((Boolean) oz40Var.getValue()).booleanValue()) {
            this.$previousSurgeWasBlizzard.setValue(Boolean.FALSE);
        }
        return zy11.a;
    }
}
