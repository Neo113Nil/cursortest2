package com.yandex.go.taxi.order.details.v2.state.elements.companion;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ComboCompanion;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.k;
import defpackage.crg;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.ny61;
import defpackage.qzo;
import defpackage.tpr;
import defpackage.yjk0;
import java.util.Date;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final com.yandex.go.taxi.order.details.v2.state.elements.companion.animation.a b;
    public final com.yandex.go.taxi.order.details.v2.state.elements.companion.icon.a c;
    public final crg d;
    public final k e;

    public a(c cVar, com.yandex.go.taxi.order.details.v2.state.elements.companion.animation.a aVar, com.yandex.go.taxi.order.details.v2.state.elements.companion.icon.a aVar2, crg crgVar, k kVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = crgVar;
        this.e = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion, ContinuationImpl continuationImpl) {
        RideCardCompanionItemDataSource$stateFlow$1 rideCardCompanionItemDataSource$stateFlow$1;
        int i;
        tpr g92Var;
        tpr tprVar;
        if (continuationImpl instanceof RideCardCompanionItemDataSource$stateFlow$1) {
            rideCardCompanionItemDataSource$stateFlow$1 = (RideCardCompanionItemDataSource$stateFlow$1) continuationImpl;
            int i2 = rideCardCompanionItemDataSource$stateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCompanionItemDataSource$stateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardCompanionItemDataSource$stateFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCompanionItemDataSource$stateFlow$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!ijk0.b(rideCardItemDto$ComboCompanion)) {
                        return new g92(2, new yjk0(rideCardItemDto$ComboCompanion.a));
                    }
                    FormattedText formattedText = rideCardItemDto$ComboCompanion.c;
                    if (formattedText == null) {
                        g92Var = new g92(2, FormattedText.c);
                    } else {
                        RideCardTimerDto rideCardTimerDto = rideCardItemDto$ComboCompanion.g;
                        RideCardTimerDto.TimerType timerType = rideCardTimerDto != null ? rideCardTimerDto.a : null;
                        Date c = this.d.c(rideCardTimerDto != null ? rideCardTimerDto.b : null);
                        Long valueOf = c != null ? Long.valueOf(c.getTime()) : null;
                        g92Var = (timerType == null || valueOf == null) ? new g92(2, formattedText) : e.I(this.e.c(qzo.a(timerType), valueOf.longValue()), new RideCardCompanionItemDataSource$getTitleFlow$1(formattedText, null));
                    }
                    g I = e.I(g92Var, new RideCardCompanionItemDataSource$getBodyFlow$1(this, rideCardItemDto$ComboCompanion, null));
                    rideCardCompanionItemDataSource$stateFlow$1.L$0 = rideCardItemDto$ComboCompanion;
                    rideCardCompanionItemDataSource$stateFlow$1.L$1 = I;
                    rideCardCompanionItemDataSource$stateFlow$1.label = 1;
                    m0 m0Var = new m0(this.b.b(rideCardItemDto$ComboCompanion.f), this.c.b(rideCardItemDto$ComboCompanion.e), new RideCardCompanionItemDataSource$getTrailFlow$2(rideCardItemDto$ComboCompanion, null));
                    if (m0Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tprVar = I;
                    obj = m0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tprVar = (tpr) rideCardCompanionItemDataSource$stateFlow$1.L$1;
                    rideCardItemDto$ComboCompanion = (RideCardItemDto$ComboCompanion) rideCardCompanionItemDataSource$stateFlow$1.L$0;
                    b.b(obj);
                }
                return new m0(tprVar, (tpr) obj, new RideCardCompanionItemDataSource$stateFlow$2(rideCardItemDto$ComboCompanion, null));
            }
        }
        rideCardCompanionItemDataSource$stateFlow$1 = new RideCardCompanionItemDataSource$stateFlow$1(this, continuationImpl);
        Object obj2 = rideCardCompanionItemDataSource$stateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCompanionItemDataSource$stateFlow$1.label;
        if (i != 0) {
        }
        return new m0(tprVar, (tpr) obj2, new RideCardCompanionItemDataSource$stateFlow$2(rideCardItemDto$ComboCompanion, null));
    }
}
