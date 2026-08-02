package com.yandex.go.taxi.order.communications;

import defpackage.akz0;
import defpackage.kpf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemSwitchComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ToggleCommunicationsViewHolder$bindInternal$2", f = "ToggleCommunicationsViewHolder.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ToggleCommunicationsViewHolder$bindInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleCommunicationsViewHolder$bindInternal$2(kpf0 kpf0Var, k kVar, Continuation continuation) {
        super(2, continuation);
        this.$item = kpf0Var;
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToggleCommunicationsViewHolder$bindInternal$2(this.$item, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ToggleCommunicationsViewHolder$bindInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d0;
        akz0 akz0Var;
        k kVar;
        ListItemSwitchComponent listItemSwitchComponent;
        kpf0 kpf0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            akz0 akz0Var2 = this.$item.a.g.c;
            if (akz0Var2 == null || this.this$0.c0.isInProgressAnimation()) {
                return zy11Var;
            }
            k kVar2 = this.this$0;
            ListItemSwitchComponent listItemSwitchComponent2 = kVar2.c0;
            kpf0 kpf0Var2 = this.$item;
            listItemSwitchComponent2.setChecked(akz0Var2.a);
            boolean isChecked = listItemSwitchComponent2.isChecked();
            CommunicationItem communicationItem = kpf0Var2.a;
            FormattedText formattedText = communicationItem.b;
            FormattedText formattedText2 = communicationItem.c;
            this.L$0 = akz0Var2;
            this.L$1 = listItemSwitchComponent2;
            this.L$2 = kVar2;
            this.L$3 = kpf0Var2;
            this.L$4 = listItemSwitchComponent2;
            this.label = 1;
            if (isChecked) {
                d0 = kVar2.d0(akz0Var2.b, formattedText, formattedText2, this);
            } else {
                if (isChecked) {
                    w511.b();
                    return null;
                }
                d0 = kVar2.d0(akz0Var2.c, formattedText, formattedText2, this);
            }
            if (d0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            akz0Var = akz0Var2;
            kVar = kVar2;
            listItemSwitchComponent = listItemSwitchComponent2;
            kpf0Var = kpf0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ListItemSwitchComponent listItemSwitchComponent3 = (ListItemSwitchComponent) this.L$4;
            kpf0 kpf0Var3 = (kpf0) this.L$3;
            k kVar3 = (k) this.L$2;
            akz0 akz0Var3 = (akz0) this.L$0;
            kotlin.b.b(obj);
            akz0Var = akz0Var3;
            listItemSwitchComponent = listItemSwitchComponent3;
            kpf0Var = kpf0Var3;
            kVar = kVar3;
        }
        listItemSwitchComponent.setDebounceClickListener(new c(listItemSwitchComponent, kVar, akz0Var, kpf0Var, 1));
        return zy11Var;
    }
}
