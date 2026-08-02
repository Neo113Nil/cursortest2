package com.yandex.go.slot.api.mapper;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.k2;
import defpackage.bvf0;
import defpackage.ess0;
import defpackage.fef;
import defpackage.g92;
import defpackage.gss0;
import defpackage.irs0;
import defpackage.jgv;
import defpackage.lnk0;
import defpackage.n7v;
import defpackage.noh;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rol0;
import defpackage.sqs0;
import defpackage.tpr;
import defpackage.wls;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes13.dex */
public abstract class a {
    public final irs0 a;
    public final sqs0 b;
    public final lnk0 c;
    public final jgv d;

    public a(irs0 irs0Var, sqs0 sqs0Var, lnk0 lnk0Var, jgv jgvVar) {
        this.a = irs0Var;
        this.b = sqs0Var;
        this.c = lnk0Var;
        this.d = jgvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v7, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.slot.api.mapper.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [noh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, SlotItemDto slotItemDto, qoh qohVar, nqs0 nqs0Var, SlotItemUiState$Size slotItemUiState$Size, wls wlsVar, ContinuationImpl continuationImpl) {
        SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1 slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        qoh qohVar2;
        rol0 rol0Var;
        tpr tprVar;
        qoh qohVar3;
        wls wlsVar2;
        SlotItemUiState$Size slotItemUiState$Size2;
        nqs0 nqs0Var2;
        aVar.getClass();
        if (continuationImpl instanceof SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1) {
            slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1 = (SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1) continuationImpl;
            int i2 = slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label;
                if (i != 0) {
                    b.b(obj);
                    k2 k2Var = slotItemDto.c;
                    slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$0 = slotItemDto;
                    slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$1 = qohVar;
                    slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$2 = nqs0Var;
                    slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$3 = slotItemUiState$Size;
                    slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$4 = wlsVar;
                    slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label = 1;
                    obj = aVar.b(k2Var, slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1);
                    qohVar2 = qohVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tprVar = (tpr) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$5;
                        wls wlsVar3 = (wls) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$4;
                        SlotItemUiState$Size slotItemUiState$Size3 = (SlotItemUiState$Size) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$3;
                        nqs0 nqs0Var3 = (nqs0) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$2;
                        ?? r11 = (noh) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$1;
                        b.b(obj);
                        nqs0Var2 = nqs0Var3;
                        qohVar3 = r11;
                        slotItemUiState$Size2 = slotItemUiState$Size3;
                        wlsVar2 = wlsVar3;
                        return new m0(tprVar, (tpr) obj, new SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2(wlsVar2, qohVar3, nqs0Var2, slotItemUiState$Size2, null));
                    }
                    wlsVar = (wls) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$4;
                    slotItemUiState$Size = (SlotItemUiState$Size) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$3;
                    nqs0Var = (nqs0) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$2;
                    ?? r9 = (noh) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$1;
                    slotItemDto = (SlotItemDto) slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$0;
                    b.b(obj);
                    qohVar2 = r9;
                }
                tpr tprVar2 = (tpr) obj;
                List list = slotItemDto.e;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$0 = null;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$1 = qohVar2;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$2 = nqs0Var;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$3 = slotItemUiState$Size;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$4 = wlsVar;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$5 = tprVar2;
                slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label = 2;
                rol0Var = new rol0(new SlotItemReactiveUiStateMapper$trailState$2(list, aVar, null));
                if (rol0Var != coroutineSingletons) {
                    obj = rol0Var;
                    tprVar = tprVar2;
                    nqs0 nqs0Var4 = nqs0Var;
                    qohVar3 = qohVar2;
                    wlsVar2 = wlsVar;
                    slotItemUiState$Size2 = slotItemUiState$Size;
                    nqs0Var2 = nqs0Var4;
                    return new m0(tprVar, (tpr) obj, new SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2(wlsVar2, qohVar3, nqs0Var2, slotItemUiState$Size2, null));
                }
                return coroutineSingletons;
            }
        }
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1 = new SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1(aVar, continuationImpl);
        Object obj2 = slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label;
        if (i != 0) {
        }
        tpr tprVar22 = (tpr) obj2;
        List list2 = slotItemDto.e;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$0 = null;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$1 = qohVar2;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$2 = nqs0Var;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$3 = slotItemUiState$Size;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$4 = wlsVar;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.L$5 = tprVar22;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$1.label = 2;
        rol0Var = new rol0(new SlotItemReactiveUiStateMapper$trailState$2(list2, aVar, null));
        if (rol0Var != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k2 k2Var, ContinuationImpl continuationImpl) {
        SlotItemReactiveUiStateMapper$leadState$1 slotItemReactiveUiStateMapper$leadState$1;
        int i;
        n7v a;
        if (continuationImpl instanceof SlotItemReactiveUiStateMapper$leadState$1) {
            slotItemReactiveUiStateMapper$leadState$1 = (SlotItemReactiveUiStateMapper$leadState$1) continuationImpl;
            int i2 = slotItemReactiveUiStateMapper$leadState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotItemReactiveUiStateMapper$leadState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slotItemReactiveUiStateMapper$leadState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotItemReactiveUiStateMapper$leadState$1.label;
                irs0 irs0Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    slotItemReactiveUiStateMapper$leadState$1.L$0 = k2Var;
                    slotItemReactiveUiStateMapper$leadState$1.label = 1;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).j(k2Var, slotItemReactiveUiStateMapper$leadState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k2Var = (k2) slotItemReactiveUiStateMapper$leadState$1.L$0;
                    b.b(obj);
                }
                gss0 gss0Var = (gss0) obj;
                return ((gss0Var instanceof ess0) || !((k2Var != null || (a = k2Var.a()) == null) ? false : this.d.b(a))) ? new g92(2, gss0Var) : new n(((com.yandex.go.slot.mapper.a) irs0Var).i(k2Var), new SlotItemReactiveUiStateMapper$loadingLeadState$1(this, k2Var, null));
            }
        }
        slotItemReactiveUiStateMapper$leadState$1 = new SlotItemReactiveUiStateMapper$leadState$1(this, continuationImpl);
        Object obj2 = slotItemReactiveUiStateMapper$leadState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotItemReactiveUiStateMapper$leadState$1.label;
        irs0 irs0Var2 = this.a;
        if (i != 0) {
        }
        gss0 gss0Var2 = (gss0) obj2;
        if (gss0Var2 instanceof ess0) {
        }
    }

    public final Object c(SlotItemDto slotItemDto, fef fefVar, wls wlsVar, ContinuationImpl continuationImpl) {
        return bvf0.n(new SlotItemReactiveUiStateMapper$stateFlow$2(this, slotItemDto, wlsVar, fefVar, null), continuationImpl);
    }
}
