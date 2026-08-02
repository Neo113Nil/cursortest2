package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ErrorButtonAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import defpackage.avj0;
import defpackage.g92;
import defpackage.gxu;
import defpackage.iyu;
import defpackage.jxu;
import defpackage.khq0;
import defpackage.kyh0;
import defpackage.le31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u1n;
import defpackage.vpr;
import defpackage.y9o;
import defpackage.z0v;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1", f = "VerticalHubV2UiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $filters$inlined;
    final /* synthetic */ boolean $hasAppliedFilters$inlined;
    final /* synthetic */ List $items$inlined;
    final /* synthetic */ HubLeadingItemKind $leadingItemKind$inlined;
    final /* synthetic */ khq0 $selectedOfferData$inlined;
    final /* synthetic */ HubOfferType $selectedOfferType$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1(Continuation continuation, List list, HubOfferType hubOfferType, q qVar, HubLeadingItemKind hubLeadingItemKind, List list2, boolean z, khq0 khq0Var) {
        super(3, continuation);
        this.$items$inlined = list;
        this.$selectedOfferType$inlined = hubOfferType;
        this.this$0 = qVar;
        this.$leadingItemKind$inlined = hubLeadingItemKind;
        this.$filters$inlined = list2;
        this.$hasAppliedFilters$inlined = z;
        this.$selectedOfferData$inlined = khq0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1 verticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1 = new VerticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1((Continuation) obj3, this.$items$inlined, this.$selectedOfferType$inlined, this.this$0, this.$leadingItemKind$inlined, this.$filters$inlined, this.$hasAppliedFilters$inlined, this.$selectedOfferData$inlined);
        verticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalHubV2UiStateInteractor$mapLoadedState$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        HubOfferType hubOfferType;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            iyu iyuVar = (iyu) obj2;
            if (this.$items$inlined.isEmpty() || (hubOfferType = this.$selectedOfferType$inlined) == null) {
                List list = this.$filters$inlined;
                if (list == null || list.isEmpty() || !this.$hasAppliedFilters$inlined) {
                    avj0 avj0Var = (avj0) this.this$0.e.e;
                    y9o y9oVar = new y9o(avj0Var.h(kyh0.hub_no_route_by_filter_title), null, new u1n(8, avj0Var.h(kyh0.mt_routes_button_change_address), ErrorButtonAction.OPEN_ADDRESS_SELECTOR));
                    HubOfferType hubOfferType2 = this.$selectedOfferType$inlined;
                    khq0 khq0Var = this.$selectedOfferData$inlined;
                    jxu a = khq0Var != null ? q.a(this.this$0, khq0Var) : gxu.a;
                    khq0 khq0Var2 = this.$selectedOfferData$inlined;
                    g92Var = new g92(2, new le31(EmptyList.a, null, y9oVar, hubOfferType2, z0v.a, false, a, khq0Var2 != null ? khq0Var2.a : null));
                } else {
                    q qVar = this.this$0;
                    g92Var = kotlinx.coroutines.flow.e.I(qVar.f.e, new VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2(qVar, iyuVar, null));
                }
            } else {
                g92Var = new g(q.b(this.this$0, false, hubOfferType, this.$leadingItemKind$inlined), this.$items$inlined, iyuVar, this.$selectedOfferType$inlined, this.this$0, this.$selectedOfferData$inlined);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
