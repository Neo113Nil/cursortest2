package com.yandex.go.taxi.tariffs.interactor;

import defpackage.c5r;
import defpackage.dwj0;
import defpackage.g7j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.prx0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "Lg7j0;", "Ldwj0;", "Lc5r;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Triple;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.RefreshTariffsInfoInteractor$refreshTariffs$2$2", f = "RefreshTariffsInfoInteractor.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class RefreshTariffsInfoInteractor$refreshTariffs$2$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTariffsInfoInteractor$refreshTariffs$2$2(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RefreshTariffsInfoInteractor$refreshTariffs$2$2 refreshTariffsInfoInteractor$refreshTariffs$2$2 = new RefreshTariffsInfoInteractor$refreshTariffs$2$2(this.this$0, continuation);
        refreshTariffsInfoInteractor$refreshTariffs$2$2.L$0 = obj;
        return refreshTariffsInfoInteractor$refreshTariffs$2$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RefreshTariffsInfoInteractor$refreshTariffs$2$2) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g7j0 g7j0Var = (g7j0) triple.getFirst();
            dwj0 dwj0Var = (dwj0) triple.getSecond();
            c5r c5rVar = (c5r) triple.getThird();
            prx0.a.a();
            v vVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (vVar.d(g7j0Var, dwj0Var, false, c5rVar, this) == coroutineSingletons) {
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
