package com.yandex.go.address.search.common.presenter;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.internal.repository.o;
import defpackage.bjd;
import defpackage.cwh;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.wiq0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1", f = "CompositeSuggestionsPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ bjd $mvpView$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1(Continuation continuation, bjd bjdVar, a aVar) {
        super(3, continuation);
        this.$mvpView$inlined = bjdVar;
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1 compositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1 = new CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1((Continuation) obj3, this.$mvpView$inlined, this.this$0);
        compositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        compositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1.L$1 = obj2;
        return compositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            String q8 = this.$mvpView$inlined.q8(PointType.SOURCE);
            a aVar = this.this$0;
            mrj mrjVar = aVar.I;
            pv0 pv0Var = aVar.V;
            cwh cwhVar = (cwh) mrjVar.c;
            com.yandex.go.navigation.screen.c cVar = cwhVar.d;
            boolean z = cVar.e() || cVar.b() == Screen.ORDERS_LIST;
            wiq0 wiq0Var = cwhVar.a;
            com.yandex.go.address.search.common.models.b bVar = new com.yandex.go.address.search.common.models.b(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.logistics.address.f(z ? new o(((k) wiq0Var).j.b) : ((k) wiq0Var).g(), cwhVar)), pv0Var, q8, booleanValue, mrjVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(bVar, vprVar, this) == coroutineSingletons) {
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
