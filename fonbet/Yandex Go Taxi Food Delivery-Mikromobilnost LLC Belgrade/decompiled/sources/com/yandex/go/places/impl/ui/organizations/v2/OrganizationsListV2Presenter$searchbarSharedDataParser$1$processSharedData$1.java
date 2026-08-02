package com.yandex.go.places.impl.ui.organizations.v2;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsListSearchbarDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oec0;
import defpackage.rn80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2Presenter$searchbarSharedDataParser$1$processSharedData$1", f = "OrganizationsListV2Presenter.kt", l = {196}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsListV2Presenter$searchbarSharedDataParser$1$processSharedData$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $data;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsListV2Presenter$searchbarSharedDataParser$1$processSharedData$1(Object obj, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$data = obj;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsListV2Presenter$searchbarSharedDataParser$1$processSharedData$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsListV2Presenter$searchbarSharedDataParser$1$processSharedData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        f fVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = this.$data;
            OrganizationsListSearchbarDto organizationsListSearchbarDto = obj2 instanceof OrganizationsListSearchbarDto ? (OrganizationsListSearchbarDto) obj2 : null;
            if (organizationsListSearchbarDto != null) {
                f fVar3 = this.this$0;
                this.L$0 = fVar3;
                this.L$1 = null;
                this.L$2 = fVar3;
                this.label = 1;
                obj = f.Lg(fVar3, organizationsListSearchbarDto, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fVar = fVar3;
                fVar2 = fVar;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fVar2 = (f) this.L$2;
        fVar = (f) this.L$0;
        kotlin.b.b(obj);
        fVar2.e0 = (oec0) obj;
        ((rn80) fVar.Dg()).renderSearchbar(fVar.e0);
        return zy11.a;
    }
}
