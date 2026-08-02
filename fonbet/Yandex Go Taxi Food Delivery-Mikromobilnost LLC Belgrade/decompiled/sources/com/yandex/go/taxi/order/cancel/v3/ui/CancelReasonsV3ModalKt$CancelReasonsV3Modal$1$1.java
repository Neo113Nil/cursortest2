package com.yandex.go.taxi.order.cancel.v3.ui;

import defpackage.bz7;
import defpackage.cz7;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.ty7;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v3.ui.CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1", f = "CancelReasonsV3Modal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ cz7 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1(cz7 cz7Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$uiState = cz7Var;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1(this.$uiState, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1 cancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1 = (CancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cancelReasonsV3ModalKt$CancelReasonsV3Modal$1$1.invokeSuspend(zy11Var);
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
        ArrayList<bz7> arrayList = this.$uiState.b;
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (bz7 bz7Var : arrayList) {
            String str = bz7Var.a;
            ArrayList arrayList2 = bz7Var.c;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((zy7) it.next()).a);
            }
            linkedHashMap.put(str, arrayList3);
        }
        this.$action.invoke(new ty7(linkedHashMap, this.$uiState.c != null));
        return zy11.a;
    }
}
