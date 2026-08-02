package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ErrorButtonAction;
import defpackage.avj0;
import defpackage.g92;
import defpackage.gyu;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sc31;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z9o;
import defpackage.zls;
import defpackage.zrm;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1", f = "VerticalHubV1UiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $filters$inlined;
    final /* synthetic */ List $items$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1(Continuation continuation, List list, List list2, c cVar) {
        super(3, continuation);
        this.$items$inlined = list;
        this.$filters$inlined = list2;
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1 verticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1 = new VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1((Continuation) obj3, this.$items$inlined, this.$filters$inlined, this.this$0);
        verticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gyu gyuVar = (gyu) obj2;
            if (this.$items$inlined.isEmpty()) {
                List list = this.$filters$inlined;
                if (list == null || list.isEmpty()) {
                    avj0 avj0Var = (avj0) this.this$0.h.g;
                    g92Var = new g92(2, new sc31(EmptyList.a, null, new z9o(avj0Var.h(kyh0.mt_no_routes), avj0Var.h(kyh0.mt_try_other_addresses), new zrm(10, avj0Var.h(kyh0.mt_routes_button_change_address), ErrorButtonAction.OPEN_ADDRESS_SELECTOR))));
                } else {
                    c cVar = this.this$0;
                    g92Var = e.I(cVar.i.b, new VerticalHubV1UiStateInteractor$mapLoadedState$2$1(cVar, gyuVar, null));
                }
            } else {
                g92Var = new g92(2, new sc31(this.$items$inlined, gyuVar, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
