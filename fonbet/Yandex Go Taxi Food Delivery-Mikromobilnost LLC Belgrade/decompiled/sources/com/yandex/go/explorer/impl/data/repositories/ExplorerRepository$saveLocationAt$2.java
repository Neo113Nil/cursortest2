package com.yandex.go.explorer.impl.data.repositories;

import android.location.Location;
import com.yandex.go.explorer.impl.data.models.CoordinateDto;
import com.yandex.go.explorer.impl.data.models.LocationEntryDto;
import defpackage.duo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.data.repositories.ExplorerRepository$saveLocationAt$2", f = "ExplorerRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRepository$saveLocationAt$2 extends SuspendLambda implements wls {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    final /* synthetic */ Location $reference;
    final /* synthetic */ long $timeSeconds;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRepository$saveLocationAt$2(c cVar, Location location, double d, double d2, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$reference = location;
        this.$latitude = d;
        this.$longitude = d2;
        this.$timeSeconds = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRepository$saveLocationAt$2(this.this$0, this.$reference, this.$latitude, this.$longitude, this.$timeSeconds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRepository$saveLocationAt$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            duo duoVar = this.this$0.b;
            Location location = this.$reference;
            duoVar.getClass();
            LocationEntryDto a = duo.a(location);
            LocationEntryDto locationEntryDto = new LocationEntryDto(new CoordinateDto(this.$latitude, this.$longitude), this.$timeSeconds, a.c, a.d, a.e, a.f, a.g);
            com.yandex.go.explorer.impl.data.storage.a aVar = this.this$0.a;
            this.L$0 = null;
            this.label = 1;
            if (aVar.c(locationEntryDto, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
