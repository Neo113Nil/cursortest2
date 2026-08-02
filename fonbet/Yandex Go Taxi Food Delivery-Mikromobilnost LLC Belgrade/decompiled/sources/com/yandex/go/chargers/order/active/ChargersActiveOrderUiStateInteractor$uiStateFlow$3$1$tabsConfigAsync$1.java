package com.yandex.go.chargers.order.active;

import defpackage.fl9;
import defpackage.il9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uda;
import defpackage.wls;
import defpackage.x8y;
import defpackage.y8y;
import defpackage.z8y;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfl9;", "<anonymous>", "(Ltse;)Lfl9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$tabsConfigAsync$1", f = "ChargersActiveOrderUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$tabsConfigAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $actualSelectedModeId;
    final /* synthetic */ z8y $order;
    int label;
    final /* synthetic */ il9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$tabsConfigAsync$1(il9 il9Var, z8y z8yVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = il9Var;
        this.$order = z8yVar;
        this.$actualSelectedModeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$tabsConfigAsync$1(this.this$0, this.$order, this.$actualSelectedModeId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$tabsConfigAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0.d;
        y8y y8yVar = this.$order.n;
        String str = this.$actualSelectedModeId;
        fVar.getClass();
        if (y8yVar != null) {
            ArrayList<x8y> arrayList = y8yVar.b;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (x8y x8yVar : arrayList) {
                    arrayList2.add(new uda(x8yVar.a, x8yVar.b, x8yVar.c));
                }
                return new fl9(arrayList2, str);
            }
        }
        return null;
    }
}
