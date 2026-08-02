package com.yandex.go.slot.api.mapper;

import com.yandex.go.slot.dto.SlotItemTrailDto$IconDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;
import com.yandex.go.slot.dto.x2;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pss0;
import defpackage.rss0;
import defpackage.sqs0;
import defpackage.srs0;
import defpackage.tss0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ltss0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.slot.api.mapper.SlotItemReactiveUiStateMapper$trailState$2", f = "SlotItemReactiveUiStateMapper.kt", l = {62, 65, 65, 70, 71, HProv.PROV_GOST_2001_DH, 81, 82, 82, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SlotItemReactiveUiStateMapper$trailState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<x2> $trailDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotItemReactiveUiStateMapper$trailState$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$trailDto = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlotItemReactiveUiStateMapper$trailState$2 slotItemReactiveUiStateMapper$trailState$2 = new SlotItemReactiveUiStateMapper$trailState$2(this.$trailDto, this.this$0, continuation);
        slotItemReactiveUiStateMapper$trailState$2.L$0 = obj;
        return slotItemReactiveUiStateMapper$trailState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlotItemReactiveUiStateMapper$trailState$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0150, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0130, code lost:
    
        if (r0.emit(r12, r9) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        srs0 srs0Var;
        SlotItemReactiveUiStateMapper$trailState$2 slotItemReactiveUiStateMapper$trailState$2;
        SlotItemReactiveUiStateMapper$trailState$2 slotItemReactiveUiStateMapper$trailState$22;
        tss0 tss0Var;
        boolean b;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                b.b(obj);
                Object R = kotlin.collections.a.R(this.$trailDto);
                srs0 srs0Var2 = R instanceof srs0 ? (srs0) R : null;
                this.L$0 = vprVar;
                this.L$1 = srs0Var2;
                this.label = 1;
                if (vprVar.emit(rss0.a, this) != coroutineSingletons) {
                    srs0Var = srs0Var2;
                    if (srs0Var != null) {
                        a aVar = this.this$0;
                        irs0 irs0Var = aVar.a;
                        List<x2> list = this.$trailDto;
                        sqs0 sqs0Var = aVar.b;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = vprVar;
                        this.label = 2;
                        slotItemReactiveUiStateMapper$trailState$22 = this;
                        obj = irs0.b(irs0Var, list, sqs0Var, false, slotItemReactiveUiStateMapper$trailState$22, 12);
                        break;
                    } else {
                        slotItemReactiveUiStateMapper$trailState$2 = this;
                        if (srs0Var instanceof SlotItemTrailDto$IconSpotDto) {
                            irs0 irs0Var2 = slotItemReactiveUiStateMapper$trailState$2.this$0.a;
                            slotItemReactiveUiStateMapper$trailState$2.L$0 = vprVar;
                            slotItemReactiveUiStateMapper$trailState$2.L$1 = srs0Var;
                            slotItemReactiveUiStateMapper$trailState$2.label = 4;
                            obj = ((com.yandex.go.slot.mapper.a) irs0Var2).u((SlotItemTrailDto$IconSpotDto) srs0Var, slotItemReactiveUiStateMapper$trailState$2);
                            break;
                        } else {
                            if (!(srs0Var instanceof SlotItemTrailDto$IconDto)) {
                                w511.b();
                                return null;
                            }
                            a aVar2 = slotItemReactiveUiStateMapper$trailState$2.this$0;
                            irs0 irs0Var3 = aVar2.a;
                            sqs0 sqs0Var2 = aVar2.b;
                            slotItemReactiveUiStateMapper$trailState$2.L$0 = vprVar;
                            slotItemReactiveUiStateMapper$trailState$2.L$1 = srs0Var;
                            slotItemReactiveUiStateMapper$trailState$2.label = 5;
                            obj = ((com.yandex.go.slot.mapper.a) irs0Var3).s((SlotItemTrailDto$IconDto) srs0Var, sqs0Var2, slotItemReactiveUiStateMapper$trailState$2);
                            break;
                        }
                    }
                }
            case 1:
                srs0Var = (srs0) this.L$1;
                b.b(obj);
                if (srs0Var != null) {
                }
            case 2:
                vprVar = (vpr) this.L$2;
                b.b(obj);
                slotItemReactiveUiStateMapper$trailState$22 = this;
                slotItemReactiveUiStateMapper$trailState$22.L$0 = null;
                slotItemReactiveUiStateMapper$trailState$22.L$1 = null;
                slotItemReactiveUiStateMapper$trailState$22.L$2 = null;
                slotItemReactiveUiStateMapper$trailState$22.label = 3;
                return vprVar.emit(obj, slotItemReactiveUiStateMapper$trailState$22) == coroutineSingletons ? coroutineSingletons : zy11Var;
            case 3:
                b.b(obj);
                return zy11Var;
            case 4:
                srs0Var = (srs0) this.L$1;
                b.b(obj);
                slotItemReactiveUiStateMapper$trailState$2 = this;
                tss0Var = (tss0) obj;
                if (!(tss0Var instanceof pss0)) {
                    b = slotItemReactiveUiStateMapper$trailState$2.this$0.c.b(srs0Var);
                    if (b) {
                        slotItemReactiveUiStateMapper$trailState$2.L$0 = vprVar;
                        slotItemReactiveUiStateMapper$trailState$2.L$1 = null;
                        slotItemReactiveUiStateMapper$trailState$2.L$2 = null;
                        slotItemReactiveUiStateMapper$trailState$2.Z$0 = b;
                        slotItemReactiveUiStateMapper$trailState$2.label = 7;
                        break;
                    } else {
                        slotItemReactiveUiStateMapper$trailState$2.L$0 = null;
                        slotItemReactiveUiStateMapper$trailState$2.L$1 = null;
                        slotItemReactiveUiStateMapper$trailState$2.L$2 = null;
                        slotItemReactiveUiStateMapper$trailState$2.Z$0 = b;
                        slotItemReactiveUiStateMapper$trailState$2.label = 10;
                        if (vprVar.emit(tss0Var, slotItemReactiveUiStateMapper$trailState$2) == coroutineSingletons) {
                        }
                    }
                }
                slotItemReactiveUiStateMapper$trailState$2.L$0 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$1 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$2 = null;
                slotItemReactiveUiStateMapper$trailState$2.label = 6;
                if (vprVar.emit(tss0Var, slotItemReactiveUiStateMapper$trailState$2) == coroutineSingletons) {
                }
                break;
            case 5:
                srs0Var = (srs0) this.L$1;
                b.b(obj);
                slotItemReactiveUiStateMapper$trailState$2 = this;
                tss0Var = (tss0) obj;
                if (!(tss0Var instanceof pss0)) {
                }
                break;
            case 6:
            case 9:
            case 10:
                b.b(obj);
                return zy11Var;
            case 7:
                boolean z = this.Z$0;
                b.b(obj);
                slotItemReactiveUiStateMapper$trailState$2 = this;
                b = z;
                a aVar3 = slotItemReactiveUiStateMapper$trailState$2.this$0;
                irs0 irs0Var4 = aVar3.a;
                List<x2> list2 = slotItemReactiveUiStateMapper$trailState$2.$trailDto;
                sqs0 sqs0Var3 = aVar3.b;
                slotItemReactiveUiStateMapper$trailState$2.L$0 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$1 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$2 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$3 = vprVar;
                slotItemReactiveUiStateMapper$trailState$2.Z$0 = b;
                slotItemReactiveUiStateMapper$trailState$2.label = 8;
                obj = irs0.b(irs0Var4, list2, sqs0Var3, false, slotItemReactiveUiStateMapper$trailState$2, 12);
                break;
            case 8:
                boolean z2 = this.Z$0;
                vpr vprVar2 = (vpr) this.L$3;
                b.b(obj);
                slotItemReactiveUiStateMapper$trailState$2 = this;
                b = z2;
                vprVar = vprVar2;
                slotItemReactiveUiStateMapper$trailState$2.L$0 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$1 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$2 = null;
                slotItemReactiveUiStateMapper$trailState$2.L$3 = null;
                slotItemReactiveUiStateMapper$trailState$2.Z$0 = b;
                slotItemReactiveUiStateMapper$trailState$2.label = 9;
                if (vprVar.emit(obj, slotItemReactiveUiStateMapper$trailState$2) == coroutineSingletons) {
                }
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
