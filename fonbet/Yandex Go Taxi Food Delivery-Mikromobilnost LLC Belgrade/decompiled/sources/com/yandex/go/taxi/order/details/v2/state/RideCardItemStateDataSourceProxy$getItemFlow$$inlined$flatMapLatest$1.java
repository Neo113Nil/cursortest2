package com.yandex.go.taxi.order.details.v2.state;

import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qck0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yjk0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1", f = "RideCardItemStateDataSourceProxy.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ a7 $dto$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1(Continuation continuation, a aVar, a7 a7Var) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$dto$inlined = a7Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1 rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1 = new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$dto$inlined);
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr cVar;
        g gVar;
        String str;
        SlotItemDto slotItemDto;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) obj2;
            qck0 qck0Var = (qck0) this.this$0.i.get();
            RideCardItemDto$ActionButtons rideCardItemDto$ActionButtons = (RideCardItemDto$ActionButtons) this.$dto$inlined;
            qck0Var.getClass();
            if (ijk0.b(rideCardItemDto$ActionButtons)) {
                List<SlotButtonDto> list2 = rideCardItemDto$ActionButtons.c;
                ArrayList arrayList = new ArrayList();
                for (SlotButtonDto slotButtonDto : list2) {
                    String str2 = slotButtonDto.a;
                    if (str2 != null) {
                        String str3 = str2.length() > 0 ? str2 : null;
                        if (str3 != null && (str = slotButtonDto.b) != null) {
                            String str4 = str.length() > 0 ? str : null;
                            if (str4 != null && (slotItemDto = slotButtonDto.g) != null) {
                                gVar = qck0Var.a.a(str3, slotButtonDto, str4, slotItemDto, list);
                                if (gVar == null) {
                                    arrayList.add(gVar);
                                }
                            }
                        }
                    }
                    gVar = null;
                    if (gVar == null) {
                    }
                }
                cVar = new com.yandex.go.taxi.order.details.v2.state.elements.buttons.c((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), rideCardItemDto$ActionButtons);
            } else {
                cVar = new g92(2, new yjk0(rideCardItemDto$ActionButtons.a));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(cVar, vprVar, this) == coroutineSingletons) {
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
