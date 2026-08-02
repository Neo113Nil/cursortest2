package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.b8o0;
import defpackage.l8o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8o0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1", f = "ScootersPackagesPurchaseScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ p8o0 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1(tls tlsVar, p8o0 p8o0Var, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.$uiState = p8o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1(this.$action, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1 scootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1 = (ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1.invokeSuspend(zy11Var);
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
        tls tlsVar = this.$action;
        List list = this.$uiState.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((l8o0) it.next()).a);
        }
        tlsVar.invoke(new b8o0(arrayList));
        return zy11.a;
    }
}
