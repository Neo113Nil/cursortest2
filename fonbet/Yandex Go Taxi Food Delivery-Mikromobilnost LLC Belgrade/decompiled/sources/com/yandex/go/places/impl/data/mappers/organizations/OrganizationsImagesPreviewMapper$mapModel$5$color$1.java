package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewSliderItemDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkdc;", "<anonymous>", "(Ltse;)Lkdc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsImagesPreviewMapper$mapModel$5$color$1", f = "OrganizationsImagesPreviewMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsImagesPreviewMapper$mapModel$5$color$1 extends SuspendLambda implements wls {
    final /* synthetic */ OrganizationPreviewSliderItemDto $dto;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsImagesPreviewMapper$mapModel$5$color$1(b bVar, OrganizationPreviewSliderItemDto organizationPreviewSliderItemDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$dto = organizationPreviewSliderItemDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsImagesPreviewMapper$mapModel$5$color$1(this.this$0, this.$dto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsImagesPreviewMapper$mapModel$5$color$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return ((ufu) this.this$0.a).b(((OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto) this.$dto.c).a);
    }
}
