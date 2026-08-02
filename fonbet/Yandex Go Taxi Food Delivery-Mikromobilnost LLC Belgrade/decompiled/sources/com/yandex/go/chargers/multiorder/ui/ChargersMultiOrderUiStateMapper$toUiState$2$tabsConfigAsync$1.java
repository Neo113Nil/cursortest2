package com.yandex.go.chargers.multiorder.ui;

import defpackage.h5a;
import defpackage.i5a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u5a;
import defpackage.uda;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu5a;", "<anonymous>", "(Ltse;)Lu5a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toUiState$2$tabsConfigAsync$1", f = "ChargersMultiOrderUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateMapper$toUiState$2$tabsConfigAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ rl9 $activeOrdersState;
    final /* synthetic */ String $selectedModeId;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderUiStateMapper$toUiState$2$tabsConfigAsync$1(g gVar, rl9 rl9Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$activeOrdersState = rl9Var;
        this.$selectedModeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersMultiOrderUiStateMapper$toUiState$2$tabsConfigAsync$1(this.this$0, this.$activeOrdersState, this.$selectedModeId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderUiStateMapper$toUiState$2$tabsConfigAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r5 == null) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        i5a i5aVar = this.$activeOrdersState.b;
        String str = this.$selectedModeId;
        gVar.getClass();
        List list = i5aVar != null ? i5aVar.e : null;
        if (list != null && !list.isEmpty()) {
            if (str == null && (str = i5aVar.d) == null) {
                h5a h5aVar = (h5a) kotlin.collections.a.R(i5aVar.e);
                str = h5aVar != null ? h5aVar.a : null;
            }
            List<h5a> list2 = i5aVar.e;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (h5a h5aVar2 : list2) {
                arrayList.add(new uda(h5aVar2.a, h5aVar2.b, h5aVar2.c));
            }
            return new u5a(arrayList, str);
        }
        return null;
    }
}
