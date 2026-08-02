package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTextDto;
import defpackage.d9s;
import defpackage.fef;
import defpackage.ny61;
import defpackage.q401;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ FormattedText c;
    public final /* synthetic */ fef w;
    public final /* synthetic */ TrackingCardStatusTextDto x;

    public a(vpr vprVar, e eVar, FormattedText formattedText, fef fefVar, TrackingCardStatusTextDto trackingCardStatusTextDto) {
        this.a = vprVar;
        this.b = eVar;
        this.c = formattedText;
        this.w = fefVar;
        this.x = trackingCardStatusTextDto;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1 trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1) {
            trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1 = (TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1) continuation;
            int i2 = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) obj;
                    FormattedText formattedText = new FormattedText(e.g(this.c.a));
                    if (str != null) {
                        formattedText = d9s.b("$TIMER$", str, formattedText);
                    }
                    fef fefVar = this.w;
                    if (fefVar != null) {
                        formattedText = d9s.c(formattedText, this.b.e, fefVar, true);
                    }
                    q401 q401Var = new q401(formattedText, this.x.b);
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.L$0 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.L$1 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.L$2 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.L$3 = null;
                    trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q401Var, trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1 = new TrackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardDtoInteractorImpl$getStatusText$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
