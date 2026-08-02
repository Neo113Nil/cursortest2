package com.yandex.go.taxi.order.communications;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
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
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/design/ListItemComponent;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/design/ListItemComponent;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.TrailTextViewHolder$bindInternal$2", f = "TrailTextViewHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrailTextViewHolder$bindInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailTextViewHolder$bindInternal$2(l lVar, kpf0 kpf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrailTextViewHolder$bindInternal$2(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrailTextViewHolder$bindInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        kpf0 kpf0Var;
        TrailTextViewHolder$bindInternal$2 trailTextViewHolder$bindInternal$2;
        l lVar;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        ListItemComponent listItemComponent4;
        ListItemComponent listItemComponent5;
        kpf0 kpf0Var2;
        l lVar2;
        ListItemComponent listItemComponent6;
        ListItemComponent listItemComponent7;
        ListItemComponent listItemComponent8;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar3 = this.this$0;
            listItemComponent = lVar3.c0;
            kpf0Var = this.$item;
            ru.yandex.taxi.widget.c cVar = lVar3.g0;
            FormattedText formattedText = kpf0Var.a.b;
            this.L$0 = listItemComponent;
            this.L$1 = lVar3;
            this.L$2 = kpf0Var;
            this.L$3 = listItemComponent;
            this.L$4 = listItemComponent;
            this.label = 1;
            trailTextViewHolder$bindInternal$2 = this;
            Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, trailTextViewHolder$bindInternal$2, 30);
            if (e != coroutineSingletons) {
                obj = e;
                lVar = lVar3;
                listItemComponent2 = listItemComponent;
                listItemComponent3 = listItemComponent2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listItemComponent8 = (ListItemComponent) this.L$1;
                listItemComponent6 = (ListItemComponent) this.L$0;
                kotlin.b.b(obj);
                listItemComponent8.invalidateComponent();
                return listItemComponent6;
            }
            listItemComponent4 = (ListItemComponent) this.L$4;
            listItemComponent5 = (ListItemComponent) this.L$3;
            kpf0Var2 = (kpf0) this.L$2;
            lVar2 = (l) this.L$1;
            ListItemComponent listItemComponent9 = (ListItemComponent) this.L$0;
            kotlin.b.b(obj);
            trailTextViewHolder$bindInternal$2 = this;
            listItemComponent6 = listItemComponent9;
            listItemComponent4.setSubtitle((CharSequence) obj);
            listItemComponent7 = lVar2.c0;
            trailTextViewHolder$bindInternal$2.L$0 = listItemComponent6;
            trailTextViewHolder$bindInternal$2.L$1 = listItemComponent5;
            trailTextViewHolder$bindInternal$2.L$2 = null;
            trailTextViewHolder$bindInternal$2.L$3 = null;
            trailTextViewHolder$bindInternal$2.L$4 = null;
            trailTextViewHolder$bindInternal$2.label = 3;
            if (l.d0(lVar2, listItemComponent7, kpf0Var2, trailTextViewHolder$bindInternal$2) != coroutineSingletons) {
                listItemComponent8 = listItemComponent5;
                listItemComponent8.invalidateComponent();
                return listItemComponent6;
            }
            return coroutineSingletons;
        }
        listItemComponent = (ListItemComponent) this.L$4;
        listItemComponent2 = (ListItemComponent) this.L$3;
        kpf0Var = (kpf0) this.L$2;
        l lVar4 = (l) this.L$1;
        ListItemComponent listItemComponent10 = (ListItemComponent) this.L$0;
        kotlin.b.b(obj);
        trailTextViewHolder$bindInternal$2 = this;
        lVar = lVar4;
        listItemComponent3 = listItemComponent10;
        listItemComponent.setTitle((CharSequence) obj);
        ru.yandex.taxi.widget.c cVar2 = lVar.g0;
        FormattedText formattedText2 = kpf0Var.a.c;
        trailTextViewHolder$bindInternal$2.L$0 = listItemComponent3;
        trailTextViewHolder$bindInternal$2.L$1 = lVar;
        trailTextViewHolder$bindInternal$2.L$2 = kpf0Var;
        trailTextViewHolder$bindInternal$2.L$3 = listItemComponent2;
        trailTextViewHolder$bindInternal$2.L$4 = listItemComponent2;
        trailTextViewHolder$bindInternal$2.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, trailTextViewHolder$bindInternal$2, 30);
        if (obj != coroutineSingletons) {
            listItemComponent4 = listItemComponent2;
            listItemComponent5 = listItemComponent4;
            kpf0Var2 = kpf0Var;
            lVar2 = lVar;
            listItemComponent6 = listItemComponent3;
            listItemComponent4.setSubtitle((CharSequence) obj);
            listItemComponent7 = lVar2.c0;
            trailTextViewHolder$bindInternal$2.L$0 = listItemComponent6;
            trailTextViewHolder$bindInternal$2.L$1 = listItemComponent5;
            trailTextViewHolder$bindInternal$2.L$2 = null;
            trailTextViewHolder$bindInternal$2.L$3 = null;
            trailTextViewHolder$bindInternal$2.L$4 = null;
            trailTextViewHolder$bindInternal$2.label = 3;
            if (l.d0(lVar2, listItemComponent7, kpf0Var2, trailTextViewHolder$bindInternal$2) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
