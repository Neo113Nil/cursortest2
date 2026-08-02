package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DisplayOnType;
import defpackage.dzg0;
import defpackage.gdc;
import defpackage.hsc;
import defpackage.kpf0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vy4;
import defpackage.w511;
import defpackage.wls;
import defpackage.ypf0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.BaseCommunicationsViewHolder$bindInternal$2", f = "BaseCommunicationsViewHolder.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BaseCommunicationsViewHolder$bindInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCommunicationsViewHolder$bindInternal$2(f fVar, kpf0 kpf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseCommunicationsViewHolder$bindInternal$2(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseCommunicationsViewHolder$bindInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            kpf0 kpf0Var = this.$item;
            ListItemComponent listItemComponent = fVar.O;
            CommunicationItem communicationItem = kpf0Var.a;
            PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType = kpf0Var.c;
            ConfigurationType a = communicationItem.i.a();
            ConfigurationType configurationType = ConfigurationType.BUBBLE;
            if (a == configurationType && f.Y(kpf0Var)) {
                listItemComponent.setBackgroundResource(n4h0.bg_communication_bubble_ripple);
            } else if (kpf0Var.a.i.a() == configurationType) {
                listItemComponent.setBackgroundResource(n4h0.bg_communication_bubble);
            } else if (promoPlaqueItem$DisplayOnType == PromoPlaqueItem$DisplayOnType.MULTI_ORDER && f.Y(kpf0Var)) {
                listItemComponent.setBackgroundResource(dzg0.control_minor_ripple);
            } else if (promoPlaqueItem$DisplayOnType == PromoPlaqueItem$DisplayOnType.DETAILS && f.Y(kpf0Var)) {
                listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
            } else {
                listItemComponent.setBackgroundColor(new gdc(mqg0.transparent));
            }
            switch (vy4.a[this.$item.b.ordinal()]) {
                case 1:
                    this.this$0.O.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
                    break;
                case 2:
                    this.this$0.O.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
                    break;
                case 3:
                    this.this$0.O.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                    break;
                case 4:
                    this.this$0.O.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
                    break;
                case 5:
                    this.this$0.O.setDividers(DividerPosition.TOP, DividerType.NORMAL);
                    break;
                case 6:
                    ListItemComponent listItemComponent2 = this.this$0.O;
                    DividerPosition dividerPosition = DividerPosition.TOP;
                    DividerType dividerType = DividerType.NONE;
                    listItemComponent2.setDividers(dividerPosition, dividerType);
                    this.this$0.O.setDividers(DividerPosition.BOTTOM, dividerType);
                    break;
                default:
                    w511.b();
                    return null;
            }
            f fVar2 = this.this$0;
            CommunicationItem communicationItem2 = this.$item.a;
            this.label = 1;
            if (f.W(fVar2, communicationItem2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        f fVar3 = this.this$0;
        ypf0 ypf0Var = fVar3.R;
        ListItemComponent listItemComponent3 = fVar3.O;
        CommunicationItem communicationItem3 = this.$item.a;
        ypf0Var.getClass();
        Map map = communicationItem3.k;
        if (map != null && !map.isEmpty()) {
            ypf0Var.j.put(listItemComponent3, new hsc(communicationItem3));
        }
        return zy11.a;
    }
}
