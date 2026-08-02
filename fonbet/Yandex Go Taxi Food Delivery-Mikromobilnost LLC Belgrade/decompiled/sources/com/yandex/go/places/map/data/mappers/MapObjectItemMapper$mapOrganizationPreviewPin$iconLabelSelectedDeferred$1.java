package com.yandex.go.places.map.data.mappers;

import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$OrganizationPreviewPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;
import defpackage.bvf0;
import defpackage.fo00;
import defpackage.hbc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfo00;", "<anonymous>", "(Ltse;)Lfo00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper$mapOrganizationPreviewPin$iconLabelSelectedDeferred$1", f = "MapObjectItemMapper.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$mapOrganizationPreviewPin$iconLabelSelectedDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ MapObjectItemDto$OrganizationPreviewPinDto $dto;
    final /* synthetic */ hbc0 $pinImages;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$mapOrganizationPreviewPin$iconLabelSelectedDeferred$1(MapObjectItemDto$OrganizationPreviewPinDto mapObjectItemDto$OrganizationPreviewPinDto, a aVar, hbc0 hbc0Var, Continuation continuation) {
        super(2, continuation);
        this.$dto = mapObjectItemDto$OrganizationPreviewPinDto;
        this.this$0 = aVar;
        this.$pinImages = hbc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectItemMapper$mapOrganizationPreviewPin$iconLabelSelectedDeferred$1(this.$dto, this.this$0, this.$pinImages, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectItemMapper$mapOrganizationPreviewPin$iconLabelSelectedDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto = this.$dto.e;
            if (mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto == null) {
                return null;
            }
            a aVar = this.this$0;
            hbc0 hbc0Var = this.$pinImages;
            this.L$0 = null;
            this.label = 1;
            aVar.getClass();
            obj = bvf0.n(new MapObjectItemMapper$mapPinStyle$2(mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto, aVar, hbc0Var, false, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (fo00) obj;
    }
}
