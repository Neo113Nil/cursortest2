package com.yandex.go.slot.api.mapper;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import defpackage.css0;
import defpackage.gss0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.tss0;
import defpackage.wls;
import defpackage.xss0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00028\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"T", "Lgss0;", "lead", "Ltss0;", "trail", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.slot.api.mapper.SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2", f = "SlotItemReactiveUiStateMapper.kt", l = {54, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ nqs0 $action;
    final /* synthetic */ noh $body;
    final /* synthetic */ SlotItemUiState$Size $size;
    final /* synthetic */ wls $stateProvider;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2(wls wlsVar, noh nohVar, nqs0 nqs0Var, SlotItemUiState$Size slotItemUiState$Size, Continuation continuation) {
        super(3, continuation);
        this.$stateProvider = wlsVar;
        this.$body = nohVar;
        this.$action = nqs0Var;
        this.$size = slotItemUiState$Size;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2 slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2 = new SlotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2(this.$stateProvider, this.$body, this.$action, this.$size, (Continuation) obj3);
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2.L$0 = (gss0) obj;
        slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2.L$1 = (tss0) obj2;
        return slotItemReactiveUiStateMapper$leadAndTrailStatesFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r11 == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        gss0 gss0Var = (gss0) this.L$0;
        tss0 tss0Var = (tss0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wlsVar = this.$stateProvider;
            noh nohVar = this.$body;
            this.L$0 = null;
            this.L$1 = tss0Var;
            this.L$2 = wlsVar;
            this.L$3 = gss0Var;
            this.label = 1;
            obj = nohVar.k(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gss0Var = (gss0) this.L$3;
            wlsVar = (wls) this.L$2;
            b.b(obj);
        }
        gss0 gss0Var2 = gss0Var;
        wls wlsVar2 = wlsVar;
        xss0 xss0Var = new xss0(gss0Var2, (css0) obj, tss0Var, this.$action, this.$size);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        Object invoke = wlsVar2.invoke(xss0Var, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
