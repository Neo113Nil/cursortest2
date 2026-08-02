package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryDto;
import defpackage.hi80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lmi80;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.flex.OrganizationCardFlexInteractor$processGalleryItems$2", f = "OrganizationCardFlexInteractor.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardFlexInteractor$processGalleryItems$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrganizationGalleryDto $dtoItems;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardFlexInteractor$processGalleryItems$2(a aVar, OrganizationGalleryDto organizationGalleryDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dtoItems = organizationGalleryDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardFlexInteractor$processGalleryItems$2(this.this$0, this.$dtoItems, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardFlexInteractor$processGalleryItems$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.organization.card.impl.data.mappers.a aVar = this.this$0.e;
            OrganizationGalleryDto organizationGalleryDto = this.$dtoItems;
            this.label = 1;
            obj = aVar.b(organizationGalleryDto, this);
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
        return ((hi80) obj).a;
    }
}
