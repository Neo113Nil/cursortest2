package com.yandex.go.taxi.order.communications;

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
@mvg(c = "com.yandex.go.taxi.order.communications.ListCommunicationsViewHolder$bindInternal$2", f = "ListCommunicationsViewHolder.kt", l = {44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ListCommunicationsViewHolder$bindInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCommunicationsViewHolder$bindInternal$2(j jVar, kpf0 kpf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListCommunicationsViewHolder$bindInternal$2(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ListCommunicationsViewHolder$bindInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j jVar;
        ListItemComponent listItemComponent;
        kpf0 kpf0Var;
        ListCommunicationsViewHolder$bindInternal$2 listCommunicationsViewHolder$bindInternal$2;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        ListItemComponent listItemComponent4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jVar = this.this$0;
            listItemComponent = jVar.c0;
            kpf0Var = this.$item;
            ru.yandex.taxi.widget.c cVar = jVar.g0;
            FormattedText formattedText = kpf0Var.a.b;
            this.L$0 = listItemComponent;
            this.L$1 = jVar;
            this.L$2 = kpf0Var;
            this.L$3 = listItemComponent;
            this.L$4 = listItemComponent;
            this.label = 1;
            listCommunicationsViewHolder$bindInternal$2 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, listCommunicationsViewHolder$bindInternal$2, 30);
            if (obj != coroutineSingletons) {
                listItemComponent2 = listItemComponent;
                listItemComponent3 = listItemComponent2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listItemComponent4 = (ListItemComponent) this.L$2;
            listItemComponent = (ListItemComponent) this.L$1;
            listItemComponent2 = (ListItemComponent) this.L$0;
            kotlin.b.b(obj);
            listItemComponent4.setSubtitle((CharSequence) obj);
            listItemComponent.invalidateComponent();
            return listItemComponent2;
        }
        ListItemComponent listItemComponent5 = (ListItemComponent) this.L$4;
        ListItemComponent listItemComponent6 = (ListItemComponent) this.L$3;
        kpf0Var = (kpf0) this.L$2;
        jVar = (j) this.L$1;
        ListItemComponent listItemComponent7 = (ListItemComponent) this.L$0;
        kotlin.b.b(obj);
        listItemComponent3 = listItemComponent5;
        listItemComponent = listItemComponent6;
        listCommunicationsViewHolder$bindInternal$2 = this;
        listItemComponent2 = listItemComponent7;
        listItemComponent3.setTitle((CharSequence) obj);
        ru.yandex.taxi.widget.c cVar2 = jVar.g0;
        FormattedText formattedText2 = kpf0Var.a.c;
        listCommunicationsViewHolder$bindInternal$2.L$0 = listItemComponent2;
        listCommunicationsViewHolder$bindInternal$2.L$1 = listItemComponent;
        listCommunicationsViewHolder$bindInternal$2.L$2 = listItemComponent;
        listCommunicationsViewHolder$bindInternal$2.L$3 = null;
        listCommunicationsViewHolder$bindInternal$2.L$4 = null;
        listCommunicationsViewHolder$bindInternal$2.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, listCommunicationsViewHolder$bindInternal$2, 30);
        if (obj != coroutineSingletons) {
            listItemComponent4 = listItemComponent;
            listItemComponent4.setSubtitle((CharSequence) obj);
            listItemComponent.invalidateComponent();
            return listItemComponent2;
        }
        return coroutineSingletons;
    }
}
