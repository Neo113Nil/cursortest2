package com.yandex.go.places.impl.ui.filters;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardClickType;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mqb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rm80;
import defpackage.s95;
import defpackage.t95;
import defpackage.tse;
import defpackage.u95;
import defpackage.um80;
import defpackage.v95;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.filters.OrganizationsFiltersPresenter$onFilterItemClicked$1", f = "OrganizationsFiltersPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsFiltersPresenter$onFilterItemClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ mqb $filterItem;
    int label;
    final /* synthetic */ rm80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsFiltersPresenter$onFilterItemClicked$1(rm80 rm80Var, mqb mqbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rm80Var;
        this.$filterItem = mqbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsFiltersPresenter$onFilterItemClicked$1(this.this$0, this.$filterItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsFiltersPresenter$onFilterItemClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        DiscoveryAnalytics$OrganizationListFiltersCardClickType discoveryAnalytics$OrganizationListFiltersCardClickType = null;
        if (i == 0) {
            kotlin.b.b(obj);
            um80 um80Var = this.this$0.z;
            String str = this.$filterItem.a;
            this.label = 1;
            obj = um80Var.a.b.b(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        v95 v95Var = (v95) obj;
        if (v95Var != null) {
            this.this$0.getClass();
            if (v95Var instanceof u95) {
                discoveryAnalytics$OrganizationListFiltersCardClickType = DiscoveryAnalytics$OrganizationListFiltersCardClickType.FilterToggleChip;
            } else if (v95Var instanceof s95) {
                discoveryAnalytics$OrganizationListFiltersCardClickType = DiscoveryAnalytics$OrganizationListFiltersCardClickType.FilterSelectionChip;
            } else if (!(v95Var instanceof t95)) {
                w511.b();
                return null;
            }
            if (discoveryAnalytics$OrganizationListFiltersCardClickType != null) {
                this.this$0.x.b(discoveryAnalytics$OrganizationListFiltersCardClickType, this.$filterItem.a);
            }
        }
        return zy11.a;
    }
}
