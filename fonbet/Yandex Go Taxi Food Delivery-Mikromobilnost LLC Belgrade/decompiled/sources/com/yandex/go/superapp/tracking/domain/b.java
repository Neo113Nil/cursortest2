package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTextDto;
import defpackage.fef;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ FormattedText c;
    public final /* synthetic */ fef w;
    public final /* synthetic */ TrackingCardStatusTextDto x;

    public b(tpr tprVar, e eVar, FormattedText formattedText, fef fefVar, TrackingCardStatusTextDto trackingCardStatusTextDto) {
        this.a = tprVar;
        this.b = eVar;
        this.c = formattedText;
        this.w = fefVar;
        this.x = trackingCardStatusTextDto;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1 trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1;
        int i;
        if (continuation instanceof TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1) {
            trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1 = (TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1) continuation;
            int i2 = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c, this.w, this.x);
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.L$0 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.L$1 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.L$2 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1) == coroutineSingletons) {
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
        trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1 = new TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1(this, continuation);
        Object obj2 = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
