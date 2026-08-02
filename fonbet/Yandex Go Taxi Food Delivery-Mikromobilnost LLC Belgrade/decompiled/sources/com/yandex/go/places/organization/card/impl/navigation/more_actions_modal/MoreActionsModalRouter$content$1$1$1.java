package com.yandex.go.places.organization.card.impl.navigation.more_actions_modal;

import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import defpackage.agd;
import defpackage.e730;
import defpackage.f730;
import defpackage.fr;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.u1n;
import defpackage.uk10;
import defpackage.uxo;
import defpackage.vxo;
import defpackage.w511;
import defpackage.wls;
import defpackage.wxo;
import defpackage.yfd;
import defpackage.yzh;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.navigation.more_actions_modal.MoreActionsModalRouter$content$1$1$1", f = "MoreActionsModalRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MoreActionsModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wxo $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ f730 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreActionsModalRouter$content$1$1$1(f730 f730Var, wxo wxoVar, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f730Var;
        this.$action = wxoVar;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreActionsModalRouter$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MoreActionsModalRouter$content$1$1$1 moreActionsModalRouter$content$1$1$1 = (MoreActionsModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        moreActionsModalRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        f730 f730Var = this.this$0;
        u1n u1nVar = f730Var.I;
        wxo wxoVar = this.$action;
        uk10 uk10Var = f730Var.J;
        OrganizationCardAnalyticsParams organizationCardAnalyticsParams = ((e730) ((agd) this.$this_buildContent).a).c;
        u1nVar.getClass();
        if (jl40.l(wxoVar, uxo.a)) {
            ((f730) uk10Var.a).r(new qu(9));
        } else {
            if (!(wxoVar instanceof vxo)) {
                w511.b();
                return null;
            }
            fr frVar = ((vxo) wxoVar).a.c;
            ((yzh) u1nVar.c).p(organizationCardAnalyticsParams, frVar);
            ((com.yandex.go.places.impl.domain.interactors.a) u1nVar.b).a(frVar, null);
        }
        return zy11.a;
    }
}
