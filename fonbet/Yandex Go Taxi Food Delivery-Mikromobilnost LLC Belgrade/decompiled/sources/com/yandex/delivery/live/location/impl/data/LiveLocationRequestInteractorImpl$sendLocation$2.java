package com.yandex.delivery.live.location.impl.data;

import defpackage.a0t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vng;
import defpackage.zy11;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1clientgeo.ClientGeoRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/Responses$ClientGeoResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.live.location.impl.data.LiveLocationRequestInteractorImpl$sendLocation$2", f = "LiveLocationRequestInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LiveLocationRequestInteractorImpl$sendLocation$2 extends SuspendLambda implements tls {
    final /* synthetic */ a0t $geoPointModel;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationRequestInteractorImpl$sendLocation$2(a aVar, a0t a0tVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$geoPointModel = a0tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LiveLocationRequestInteractorImpl$sendLocation$2(this.this$0, this.$geoPointModel, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((LiveLocationRequestInteractorImpl$sendLocation$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        LiveLocationApi liveLocationApi = (LiveLocationApi) this.this$0.i.get();
        a aVar = this.this$0;
        a0t a0tVar = this.$geoPointModel;
        aVar.getClass();
        return liveLocationApi.a(new ClientGeoRequestDto(new ClientGeoRequestDto.GeoPositionDto(a0tVar.c, a0tVar.a, a0tVar.b, LocalDateTime.ofInstant(Instant.ofEpochMilli(vng.I()), TimeZone.getDefault().toZoneId()).format(DateTimeFormatter.ISO_DATE_TIME))));
    }
}
