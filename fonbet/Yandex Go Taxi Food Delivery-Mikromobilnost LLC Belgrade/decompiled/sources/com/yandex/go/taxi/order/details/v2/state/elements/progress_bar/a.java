package com.yandex.go.taxi.order.details.v2.state.elements.progress_bar;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;
import com.yandex.go.slot.dto.k2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ProgressBarItem;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.k;
import defpackage.bvf0;
import defpackage.crg;
import defpackage.ess0;
import defpackage.fef;
import defpackage.g92;
import defpackage.gss0;
import defpackage.ibk0;
import defpackage.irs0;
import defpackage.jgv;
import defpackage.lnk0;
import defpackage.n7v;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pss0;
import defpackage.qzo;
import defpackage.rol0;
import defpackage.sqs0;
import defpackage.tpr;
import defpackage.tss0;
import java.util.Date;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public final class a {
    public final irs0 a;
    public final k b;
    public final jgv c;
    public final lnk0 d;
    public final pdc e;
    public final sqs0 f;
    public final crg g;

    public a(irs0 irs0Var, k kVar, jgv jgvVar, lnk0 lnk0Var, pdc pdcVar, sqs0 sqs0Var, crg crgVar) {
        this.a = irs0Var;
        this.b = kVar;
        this.c = jgvVar;
        this.d = lnk0Var;
        this.e = pdcVar;
        this.f = sqs0Var;
        this.g = crgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r15 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v5, types: [nqs0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, SlotItemDto slotItemDto, ibk0 ibk0Var, SlotItemUiState$Size slotItemUiState$Size, RideCardTimerDto rideCardTimerDto, fef fefVar, ContinuationImpl continuationImpl) {
        RideCardProgressBarItemDataSource$slotItemUiStateFlow$1 rideCardProgressBarItemDataSource$slotItemUiStateFlow$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ibk0 ibk0Var2;
        Object d;
        nqs0 nqs0Var;
        SlotItemUiState$Size slotItemUiState$Size2;
        tpr tprVar;
        tpr tprVar2;
        aVar.getClass();
        if (continuationImpl instanceof RideCardProgressBarItemDataSource$slotItemUiStateFlow$1) {
            rideCardProgressBarItemDataSource$slotItemUiStateFlow$1 = (RideCardProgressBarItemDataSource$slotItemUiStateFlow$1) continuationImpl;
            int i2 = rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label;
                if (i != 0) {
                    b.b(obj);
                    k2 k2Var = slotItemDto.c;
                    rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$0 = slotItemDto;
                    rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$1 = ibk0Var;
                    rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$2 = slotItemUiState$Size;
                    rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$3 = rideCardTimerDto;
                    rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$4 = fefVar;
                    rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label = 1;
                    obj = aVar.b(k2Var, rideCardProgressBarItemDataSource$slotItemUiStateFlow$1);
                    ibk0Var2 = ibk0Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tprVar2 = (tpr) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$6;
                        tprVar = (tpr) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$5;
                        slotItemUiState$Size2 = (SlotItemUiState$Size) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$2;
                        nqs0Var = (nqs0) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$1;
                        b.b(obj);
                        return e.n(tprVar, tprVar2, (tpr) obj, new RideCardProgressBarItemDataSource$slotItemUiStateFlow$2(nqs0Var, slotItemUiState$Size2, null));
                    }
                    fefVar = (fef) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$4;
                    rideCardTimerDto = (RideCardTimerDto) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$3;
                    slotItemUiState$Size = (SlotItemUiState$Size) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$2;
                    ?? r11 = (nqs0) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$1;
                    slotItemDto = (SlotItemDto) rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$0;
                    b.b(obj);
                    ibk0Var2 = r11;
                }
                tpr tprVar3 = (tpr) obj;
                List list = slotItemDto.d;
                RideCardTimerDto.TimerType timerType = rideCardTimerDto == null ? rideCardTimerDto.a : null;
                Date c = aVar.g.c(rideCardTimerDto == null ? rideCardTimerDto.b : null);
                Long valueOf = c == null ? Long.valueOf(c.getTime()) : null;
                tpr rol0Var = (timerType != null || valueOf == null) ? new rol0(new RideCardProgressBarItemDataSource$bodyState$2(aVar, list, fefVar, null)) : e.I(aVar.b.c(qzo.a(timerType), valueOf.longValue()), new RideCardProgressBarItemDataSource$bodyState$1(aVar, list, fefVar, null));
                List list2 = slotItemDto.e;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$0 = null;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$1 = ibk0Var2;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$2 = slotItemUiState$Size;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$3 = null;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$4 = null;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$5 = tprVar3;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$6 = rol0Var;
                rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label = 2;
                d = aVar.d(list2, rideCardProgressBarItemDataSource$slotItemUiStateFlow$1);
                if (d != coroutineSingletons) {
                    SlotItemUiState$Size slotItemUiState$Size3 = slotItemUiState$Size;
                    nqs0Var = ibk0Var2;
                    slotItemUiState$Size2 = slotItemUiState$Size3;
                    tprVar = tprVar3;
                    obj = d;
                    tprVar2 = rol0Var;
                    return e.n(tprVar, tprVar2, (tpr) obj, new RideCardProgressBarItemDataSource$slotItemUiStateFlow$2(nqs0Var, slotItemUiState$Size2, null));
                }
                return coroutineSingletons;
            }
        }
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1 = new RideCardProgressBarItemDataSource$slotItemUiStateFlow$1(aVar, continuationImpl);
        Object obj2 = rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label;
        if (i != 0) {
        }
        tpr tprVar32 = (tpr) obj2;
        List list3 = slotItemDto.d;
        if (rideCardTimerDto == null) {
        }
        Date c2 = aVar.g.c(rideCardTimerDto == null ? rideCardTimerDto.b : null);
        if (c2 == null) {
        }
        if (timerType != null) {
        }
        List list22 = slotItemDto.e;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$0 = null;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$1 = ibk0Var2;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$2 = slotItemUiState$Size;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$3 = null;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$4 = null;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$5 = tprVar32;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.L$6 = rol0Var;
        rideCardProgressBarItemDataSource$slotItemUiStateFlow$1.label = 2;
        d = aVar.d(list22, rideCardProgressBarItemDataSource$slotItemUiStateFlow$1);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k2 k2Var, ContinuationImpl continuationImpl) {
        RideCardProgressBarItemDataSource$leadState$1 rideCardProgressBarItemDataSource$leadState$1;
        int i;
        n7v a;
        if (continuationImpl instanceof RideCardProgressBarItemDataSource$leadState$1) {
            rideCardProgressBarItemDataSource$leadState$1 = (RideCardProgressBarItemDataSource$leadState$1) continuationImpl;
            int i2 = rideCardProgressBarItemDataSource$leadState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardProgressBarItemDataSource$leadState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardProgressBarItemDataSource$leadState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardProgressBarItemDataSource$leadState$1.label;
                irs0 irs0Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    rideCardProgressBarItemDataSource$leadState$1.L$0 = k2Var;
                    rideCardProgressBarItemDataSource$leadState$1.label = 1;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).j(k2Var, rideCardProgressBarItemDataSource$leadState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k2Var = (k2) rideCardProgressBarItemDataSource$leadState$1.L$0;
                    b.b(obj);
                }
                gss0 gss0Var = (gss0) obj;
                return ((gss0Var instanceof ess0) || !((k2Var != null || (a = k2Var.a()) == null) ? false : this.c.b(a))) ? new g92(2, gss0Var) : new n(((com.yandex.go.slot.mapper.a) irs0Var).i(k2Var), new RideCardProgressBarItemDataSource$loadingLeadState$1(this, k2Var, null));
            }
        }
        rideCardProgressBarItemDataSource$leadState$1 = new RideCardProgressBarItemDataSource$leadState$1(this, continuationImpl);
        Object obj2 = rideCardProgressBarItemDataSource$leadState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardProgressBarItemDataSource$leadState$1.label;
        irs0 irs0Var2 = this.a;
        if (i != 0) {
        }
        gss0 gss0Var2 = (gss0) obj2;
        if (gss0Var2 instanceof ess0) {
        }
    }

    public final Object c(RideCardItemDto$ProgressBarItem rideCardItemDto$ProgressBarItem, fef fefVar, SuspendLambda suspendLambda) {
        return bvf0.n(new RideCardProgressBarItemDataSource$stateFlow$2(rideCardItemDto$ProgressBarItem, this, fefVar, null), suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        RideCardProgressBarItemDataSource$trailState$1 rideCardProgressBarItemDataSource$trailState$1;
        int i;
        SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto;
        SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto2;
        tss0 tss0Var;
        if (continuationImpl instanceof RideCardProgressBarItemDataSource$trailState$1) {
            rideCardProgressBarItemDataSource$trailState$1 = (RideCardProgressBarItemDataSource$trailState$1) continuationImpl;
            int i2 = rideCardProgressBarItemDataSource$trailState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardProgressBarItemDataSource$trailState$1.label = i2 - Integer.MIN_VALUE;
                RideCardProgressBarItemDataSource$trailState$1 rideCardProgressBarItemDataSource$trailState$12 = rideCardProgressBarItemDataSource$trailState$1;
                Object obj = rideCardProgressBarItemDataSource$trailState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardProgressBarItemDataSource$trailState$12.label;
                if (i != 0) {
                    b.b(obj);
                    Object R = kotlin.collections.a.R(list);
                    SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto3 = R instanceof SlotItemTrailDto$IconSpotDto ? (SlotItemTrailDto$IconSpotDto) R : null;
                    rideCardProgressBarItemDataSource$trailState$12.L$0 = null;
                    rideCardProgressBarItemDataSource$trailState$12.L$1 = slotItemTrailDto$IconSpotDto3;
                    rideCardProgressBarItemDataSource$trailState$12.label = 1;
                    Object b = irs0.b(this.a, list, this.f, false, rideCardProgressBarItemDataSource$trailState$12, 12);
                    if (b != coroutineSingletons) {
                        SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto4 = slotItemTrailDto$IconSpotDto3;
                        obj = b;
                        slotItemTrailDto$IconSpotDto = slotItemTrailDto$IconSpotDto4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tss0Var = (tss0) rideCardProgressBarItemDataSource$trailState$12.L$2;
                    slotItemTrailDto$IconSpotDto2 = (SlotItemTrailDto$IconSpotDto) rideCardProgressBarItemDataSource$trailState$12.L$1;
                    b.b(obj);
                    tss0 tss0Var2 = (tss0) obj;
                    return ((tss0Var2 instanceof pss0) || !this.d.b(slotItemTrailDto$IconSpotDto2)) ? new g92(2, tss0Var) : new n(new g92(2, tss0Var), new RideCardProgressBarItemDataSource$trailState$2(tss0Var2, null));
                }
                slotItemTrailDto$IconSpotDto = (SlotItemTrailDto$IconSpotDto) rideCardProgressBarItemDataSource$trailState$12.L$1;
                b.b(obj);
                tss0 tss0Var3 = (tss0) obj;
                if (slotItemTrailDto$IconSpotDto != null) {
                    return new g92(2, tss0Var3);
                }
                rideCardProgressBarItemDataSource$trailState$12.L$0 = null;
                rideCardProgressBarItemDataSource$trailState$12.L$1 = slotItemTrailDto$IconSpotDto;
                rideCardProgressBarItemDataSource$trailState$12.L$2 = tss0Var3;
                rideCardProgressBarItemDataSource$trailState$12.label = 2;
                Object u = ((com.yandex.go.slot.mapper.a) this.a).u(slotItemTrailDto$IconSpotDto, rideCardProgressBarItemDataSource$trailState$12);
                if (u != coroutineSingletons) {
                    slotItemTrailDto$IconSpotDto2 = slotItemTrailDto$IconSpotDto;
                    tss0Var = tss0Var3;
                    obj = u;
                    tss0 tss0Var22 = (tss0) obj;
                    if (tss0Var22 instanceof pss0) {
                    }
                }
                return coroutineSingletons;
            }
        }
        rideCardProgressBarItemDataSource$trailState$1 = new RideCardProgressBarItemDataSource$trailState$1(this, continuationImpl);
        RideCardProgressBarItemDataSource$trailState$1 rideCardProgressBarItemDataSource$trailState$122 = rideCardProgressBarItemDataSource$trailState$1;
        Object obj2 = rideCardProgressBarItemDataSource$trailState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardProgressBarItemDataSource$trailState$122.label;
        if (i != 0) {
        }
        tss0 tss0Var32 = (tss0) obj2;
        if (slotItemTrailDto$IconSpotDto != null) {
        }
    }
}
