package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemDto$OrganizationPreviewItemDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La65;", "<anonymous>", "(Ltse;)La65;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsResponseMapper$mapItems$2$1$result$1$1", f = "OrganizationsResponseMapper.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsResponseMapper$mapItems$2$1$result$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.places.impl.data.entities.network.organizations.f $dtoItem;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsResponseMapper$mapItems$2$1$result$1$1(f fVar, com.yandex.go.places.impl.data.entities.network.organizations.f fVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$dtoItem = fVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsResponseMapper$mapItems$2$1$result$1$1(this.this$0, this.$dtoItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsResponseMapper$mapItems$2$1$result$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0.b;
        OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto = (OrganizationItemDto$OrganizationPreviewItemDto) this.$dtoItem;
        this.label = 1;
        Object a = dVar.a(organizationItemDto$OrganizationPreviewItemDto, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
