package com.yandex.go.taxi.summary.shared.expanded.repository;

import defpackage.b8r;
import defpackage.kb5;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.wu1;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkb5;", "info", "Ldk31;", "<unused var>", "Lmi31;", "<anonymous>", "(Lkb5;Ldk31;)Lmi31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.shared.expanded.repository.TariffPageInfoHolder$verticalTariffFlow$1", f = "TariffPageInfoHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffPageInfoHolder$verticalTariffFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPageInfoHolder$verticalTariffFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffPageInfoHolder$verticalTariffFlow$1 tariffPageInfoHolder$verticalTariffFlow$1 = new TariffPageInfoHolder$verticalTariffFlow$1(this.this$0, (Continuation) obj3);
        tariffPageInfoHolder$verticalTariffFlow$1.L$0 = (kb5) obj;
        return tariffPageInfoHolder$verticalTariffFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var;
        pex0 pex0Var2;
        pex0 pex0Var3;
        ru.yandex.taxi.tariffs.model.a aVar;
        pex0 a;
        kb5 kb5Var = (kb5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mi31 d = b8r.d(this.this$0.b, kb5Var.b, kb5Var.a, 4);
        wu1 wu1Var = kb5Var.c;
        return wu1Var != null ? (d == null || (pex0Var3 = d.a) == null || (aVar = pex0Var3.t0) == null || (a = aVar.a(wu1Var)) == null) ? d : mi31.a(d, a, null, 30) : (d == null || (pex0Var = d.a) == null || (pex0Var2 = pex0Var.M0) == null) ? d : mi31.a(d, pex0Var2, null, 30);
    }
}
