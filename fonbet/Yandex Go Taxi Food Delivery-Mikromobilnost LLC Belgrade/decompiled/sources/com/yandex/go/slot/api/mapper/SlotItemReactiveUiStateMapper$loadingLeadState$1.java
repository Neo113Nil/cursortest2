package com.yandex.go.slot.api.mapper;

import com.yandex.go.slot.dto.k2;
import defpackage.fss0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lgss0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.slot.api.mapper.SlotItemReactiveUiStateMapper$loadingLeadState$1", f = "SlotItemReactiveUiStateMapper.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SlotItemReactiveUiStateMapper$loadingLeadState$1 extends SuspendLambda implements wls {
    final /* synthetic */ k2 $leadDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotItemReactiveUiStateMapper$loadingLeadState$1(a aVar, k2 k2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$leadDto = k2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlotItemReactiveUiStateMapper$loadingLeadState$1 slotItemReactiveUiStateMapper$loadingLeadState$1 = new SlotItemReactiveUiStateMapper$loadingLeadState$1(this.this$0, this.$leadDto, continuation);
        slotItemReactiveUiStateMapper$loadingLeadState$1.L$0 = obj;
        return slotItemReactiveUiStateMapper$loadingLeadState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlotItemReactiveUiStateMapper$loadingLeadState$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        boolean a = this.this$0.c.a(this.$leadDto);
        if (a) {
            fss0 fss0Var = new fss0(((com.yandex.go.slot.mapper.a) this.this$0.a).f(), false);
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = a;
            this.label = 1;
            if (vprVar.emit(fss0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
