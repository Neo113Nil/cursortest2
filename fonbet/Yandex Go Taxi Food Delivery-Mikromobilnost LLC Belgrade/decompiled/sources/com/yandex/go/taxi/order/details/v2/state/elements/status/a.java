package com.yandex.go.taxi.order.details.v2.state.elements.status;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Status;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.k;
import defpackage.bvf0;
import defpackage.crg;
import defpackage.css0;
import defpackage.fef;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.irs0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qzo;
import defpackage.rnk0;
import defpackage.sqs0;
import defpackage.vfk0;
import defpackage.yjk0;
import java.util.Date;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a {
    public static final Regex f = new Regex(":?\\s?\\d{0,4}:?\\d{2}:\\d{2}");
    public final irs0 a;
    public final sqs0 b;
    public final k c;
    public final crg d;
    public final pdc e;

    public a(irs0 irs0Var, sqs0 sqs0Var, k kVar, crg crgVar, pdc pdcVar) {
        this.a = irs0Var;
        this.b = sqs0Var;
        this.c = kVar;
        this.d = crgVar;
        this.e = pdcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, RideCardTimerDto rideCardTimerDto, fef fefVar, ContinuationImpl continuationImpl) {
        RideCardStatusItemDataSource$getBodyDescriptionStateFlow$1 rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof RideCardStatusItemDataSource$getBodyDescriptionStateFlow$1) {
            rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1 = (RideCardStatusItemDataSource$getBodyDescriptionStateFlow$1) continuationImpl;
            int i2 = rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.label;
                if (i != 0) {
                    b.b(obj);
                    RideCardTimerDto.TimerType timerType = rideCardTimerDto != null ? rideCardTimerDto.a : null;
                    Date c = aVar.d.c(rideCardTimerDto != null ? rideCardTimerDto.b : null);
                    Long l = c != null ? new Long(c.getTime()) : null;
                    if (timerType != null && l != null) {
                        return e.I(aVar.c.c(qzo.a(timerType), l.longValue()), new RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2(list, aVar, fefVar, null));
                    }
                    irs0 irs0Var = aVar.a;
                    rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.L$0 = null;
                    rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.L$1 = null;
                    rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.L$2 = null;
                    rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.L$3 = null;
                    rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.L$4 = null;
                    rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.label = 1;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).k(list, fefVar, rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1);
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
                return new g92(2, new rnk0((css0) obj, null));
            }
        }
        rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1 = new RideCardStatusItemDataSource$getBodyDescriptionStateFlow$1(aVar, continuationImpl);
        Object obj2 = rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardStatusItemDataSource$getBodyDescriptionStateFlow$1.label;
        if (i != 0) {
        }
        return new g92(2, new rnk0((css0) obj2, null));
    }

    public final Object b(RideCardItemDto$Status rideCardItemDto$Status, fef fefVar, vfk0 vfk0Var, SuspendLambda suspendLambda) {
        SlotItemDto slotItemDto;
        boolean b = ijk0.b(rideCardItemDto$Status);
        String str = rideCardItemDto$Status.a;
        if (b && (slotItemDto = rideCardItemDto$Status.b) != null) {
            return bvf0.n(new RideCardStatusItemDataSource$stateFlow$2(this, rideCardItemDto$Status, slotItemDto, fefVar, vfk0Var, null), suspendLambda);
        }
        return new g92(2, new yjk0(str));
    }
}
