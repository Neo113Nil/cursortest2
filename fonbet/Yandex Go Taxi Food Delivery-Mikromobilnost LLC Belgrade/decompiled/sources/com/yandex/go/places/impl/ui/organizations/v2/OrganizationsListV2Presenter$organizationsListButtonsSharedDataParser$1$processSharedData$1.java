package com.yandex.go.places.impl.ui.organizations.v2;

import com.yandex.go.places.impl.data.entities.flex.organizations_list.OrganizationsListButtonsSharedData;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rn80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1", f = "OrganizationsListV2Presenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1 extends SuspendLambda implements wls {
    final /* synthetic */ OrganizationsListButtonsSharedData $buttons;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1(f fVar, OrganizationsListButtonsSharedData organizationsListButtonsSharedData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$buttons = organizationsListButtonsSharedData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1(this.this$0, this.$buttons, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1 organizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1 = (OrganizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationsListV2Presenter$organizationsListButtonsSharedDataParser$1$processSharedData$1.invokeSuspend(zy11Var);
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
        if (this.this$0.Eg()) {
            ((rn80) this.this$0.Dg()).Bd(this.$buttons.a);
        }
        return zy11.a;
    }
}
