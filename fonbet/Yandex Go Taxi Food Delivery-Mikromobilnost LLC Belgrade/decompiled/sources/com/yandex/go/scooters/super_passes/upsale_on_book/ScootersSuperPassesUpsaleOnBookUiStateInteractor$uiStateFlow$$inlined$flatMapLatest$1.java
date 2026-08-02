package com.yandex.go.scooters.super_passes.upsale_on_book;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import defpackage.abo0;
import defpackage.g92;
import defpackage.ha2;
import defpackage.l0p0;
import defpackage.m2p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2p0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.super_passes.upsale_on_book.ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "ScootersSuperPassesUpsaleOnBookUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ p2p0 $upsaleWindow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ m2p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(Continuation continuation, p2p0 p2p0Var, m2p0 m2p0Var) {
        super(3, continuation);
        this.$upsaleWindow$inlined = p2p0Var;
        this.this$0 = m2p0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 scootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.$upsaleWindow$inlined, this.this$0);
        scootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g92 g92Var = new g92(2, this.$upsaleWindow$inlined);
            l0p0 l0p0Var = this.this$0.d;
            ScootersSuperPassLegalTermsExperiment.Companion.getClass();
            ha2 n = e.n(g92Var, com.yandex.go.scooters.utils.a.a(l0p0Var, ScootersSuperPassLegalTermsExperiment.g), new d(this.this$0.b.a), new ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$1$1(4, this.this$0.c, abo0.class, "mapToUiState", "mapToUiState(Lru/yandex/taxi/scooters/domain/model/ScootersSuperPassesUpsaleWindow;Lcom/yandex/go/scooters/passes/data/model/ScootersSuperPassLegalTermsExperiment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(n, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
