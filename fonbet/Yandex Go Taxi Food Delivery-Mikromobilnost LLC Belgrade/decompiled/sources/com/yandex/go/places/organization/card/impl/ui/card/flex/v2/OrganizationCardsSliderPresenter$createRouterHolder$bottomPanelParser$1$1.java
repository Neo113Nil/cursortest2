package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import defpackage.be6;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nh80;
import defpackage.ny61;
import defpackage.rg80;
import defpackage.ti80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1", f = "OrganizationCardsSliderPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ OrganizationCardAnalyticsParams $analyticsParams;
    final /* synthetic */ be6 $bottomPanel;
    final /* synthetic */ rg80 $holder;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1(rg80 rg80Var, g gVar, OrganizationCardAnalyticsParams organizationCardAnalyticsParams, be6 be6Var, Continuation continuation) {
        super(2, continuation);
        this.$holder = rg80Var;
        this.this$0 = gVar;
        this.$analyticsParams = organizationCardAnalyticsParams;
        this.$bottomPanel = be6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1(this.$holder, this.this$0, this.$analyticsParams, this.$bottomPanel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1 organizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1 = (OrganizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationCardsSliderPresenter$createRouterHolder$bottomPanelParser$1$1.invokeSuspend(zy11Var);
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
        ti80 ti80Var = this.$holder.h;
        g gVar = this.this$0;
        if (ti80Var != null) {
            gVar.g0.put(ti80Var, this.$analyticsParams);
            if (jl40.l(this.this$0.a0.a, ti80Var)) {
                g gVar2 = this.this$0;
                gVar2.f0 = this.$analyticsParams;
                gVar2.Lg();
            }
        } else {
            gVar.f0 = this.$analyticsParams;
        }
        ((nh80) this.this$0.Dg()).Ja(this.$holder, this.$bottomPanel);
        return zy11.a;
    }
}
