package com.yandex.go.taxi.tariffs.internal.interactor;

import defpackage.ae61;
import defpackage.cwd;
import defpackage.mvg;
import defpackage.nrx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.interactor.UpdateTariffsInteractor$saveDisplayableTariffClasses$2", f = "UpdateTariffsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UpdateTariffsInteractor$saveDisplayableTariffClasses$2 extends SuspendLambda implements wls {
    final /* synthetic */ cwd $info;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTariffsInteractor$saveDisplayableTariffClasses$2(f fVar, cwd cwdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$info = cwdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateTariffsInteractor$saveDisplayableTariffClasses$2(this.this$0, this.$info, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UpdateTariffsInteractor$saveDisplayableTariffClasses$2 updateTariffsInteractor$saveDisplayableTariffClasses$2 = (UpdateTariffsInteractor$saveDisplayableTariffClasses$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        updateTariffsInteractor$saveDisplayableTariffClasses$2.invokeSuspend(zy11Var);
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
        ae61 ae61Var = this.this$0.g;
        List list = this.$info.c;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((pex0) it.next()).b);
        }
        ae61Var.a.t(ae61Var.b, hashSet);
        nrx0 nrx0Var = this.this$0.h;
        List list2 = this.$info.d;
        nrx0Var.b.r("PreferenceUtils.FIELD_DISPLAYABLE_TARIFF_OVERRIDES", ((xnt) nrx0Var.a).e(list2, nrx0.c));
        return zy11.a;
    }
}
