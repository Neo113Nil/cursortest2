package com.yandex.go.places.map.data.mappers;

import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$UniversalPinDto;
import com.yandex.go.places.models.data.entities.network.map.u;
import defpackage.bvf0;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfo00;", "<anonymous>", "(Ltse;)Lfo00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper$mapUniversalPin$defaultStyleDeferred$1", f = "MapObjectItemMapper.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$mapUniversalPin$defaultStyleDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ MapObjectItemDto$UniversalPinDto $dto;
    final /* synthetic */ boolean $isFavorite;
    final /* synthetic */ hbc0 $pinImages;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$mapUniversalPin$defaultStyleDeferred$1(hbc0 hbc0Var, a aVar, MapObjectItemDto$UniversalPinDto mapObjectItemDto$UniversalPinDto, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dto = mapObjectItemDto$UniversalPinDto;
        this.$pinImages = hbc0Var;
        this.$isFavorite = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectItemMapper$mapUniversalPin$defaultStyleDeferred$1(this.$pinImages, this.this$0, this.$dto, continuation, this.$isFavorite);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectItemMapper$mapUniversalPin$defaultStyleDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        u uVar = this.$dto.f;
        hbc0 hbc0Var = this.$pinImages;
        boolean z = this.$isFavorite;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new MapObjectItemMapper$mapPinStyle$2(uVar, aVar, hbc0Var, z, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
