package com.yandex.go.taxi.order.communications;

import defpackage.akz0;
import defpackage.bvf0;
import defpackage.kpf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemSwitchComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ToggleCommunicationsViewHolder$bindInternal$2$1$1$1", f = "ToggleCommunicationsViewHolder.kt", l = {80, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ToggleCommunicationsViewHolder$bindInternal$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    final /* synthetic */ ListItemSwitchComponent $this_apply;
    final /* synthetic */ akz0 $toggle;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleCommunicationsViewHolder$bindInternal$2$1$1$1(k kVar, akz0 akz0Var, ListItemSwitchComponent listItemSwitchComponent, kpf0 kpf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$toggle = akz0Var;
        this.$this_apply = listItemSwitchComponent;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToggleCommunicationsViewHolder$bindInternal$2$1$1$1(this.this$0, this.$toggle, this.$this_apply, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ToggleCommunicationsViewHolder$bindInternal$2$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (kotlinx.coroutines.a.i(2000, r11) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r12 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0;
            akz0 akz0Var = this.$toggle;
            boolean isChecked = this.$this_apply.isChecked();
            kpf0 kpf0Var = this.$item;
            this.label = 1;
            int i2 = k.l0;
            kVar.getClass();
            Object n = bvf0.n(new ToggleCommunicationsViewHolder$reactOnToggle$2(isChecked, akz0Var, kVar, kpf0Var, null), this);
            if (n != coroutineSingletons) {
                n = zy11Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.$this_apply.stopProgressAnimation();
                this.$this_apply.setEnabled(true);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        this.label = 2;
    }
}
