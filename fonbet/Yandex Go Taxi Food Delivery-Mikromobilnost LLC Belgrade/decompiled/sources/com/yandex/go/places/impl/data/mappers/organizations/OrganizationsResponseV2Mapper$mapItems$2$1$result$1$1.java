package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemV2Dto$OrganizationPreviewItemV2Dto;
import com.yandex.go.places.impl.data.entities.network.organizations.i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lb65;", "<anonymous>", "(Ltse;)Lb65;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseV2Mapper$mapItems$2$1$result$1$1", f = "OrganizationsResponseV2Mapper.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsResponseV2Mapper$mapItems$2$1$result$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ i $dtoItem;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsResponseV2Mapper$mapItems$2$1$result$1$1(g gVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$dtoItem = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsResponseV2Mapper$mapItems$2$1$result$1$1(this.this$0, this.$dtoItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsResponseV2Mapper$mapItems$2$1$result$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0.b;
        OrganizationItemV2Dto$OrganizationPreviewItemV2Dto organizationItemV2Dto$OrganizationPreviewItemV2Dto = (OrganizationItemV2Dto$OrganizationPreviewItemV2Dto) this.$dtoItem;
        this.label = 1;
        Object a = eVar.a(organizationItemV2Dto$OrganizationPreviewItemV2Dto, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
