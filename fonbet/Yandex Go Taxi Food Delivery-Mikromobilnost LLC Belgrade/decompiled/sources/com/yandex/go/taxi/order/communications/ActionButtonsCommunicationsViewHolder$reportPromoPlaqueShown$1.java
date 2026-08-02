package com.yandex.go.taxi.order.communications;

import defpackage.dpf0;
import defpackage.ipf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1", f = "ActionButtonsCommunicationsViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ CommunicationItem $item;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1(CommunicationItem communicationItem, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$item = communicationItem;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1(this.$item, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1 actionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1 = (ActionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        actionButtonsCommunicationsViewHolder$reportPromoPlaqueShown$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DriveState c;
        String name;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Iterable iterable = this.$item.g.e;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ru.yandex.taxi.communications.model.widgets.b bVar = ((ActionButton) it.next()).e;
            ActionButton.ButtonActionType b = bVar != null ? bVar.b() : null;
            if (b != null) {
                arrayList.add(b);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ActionButton.ButtonActionType) it2.next()).name().toLowerCase(Locale.ROOT));
        }
        e eVar = this.this$0;
        ipf0 ipf0Var = eVar.n0;
        String str2 = this.$item.a;
        int G = eVar.G();
        o2y0 o2y0Var = this.this$0.r0;
        String str3 = o2y0Var != null ? o2y0Var.b().a : null;
        o2y0 o2y0Var2 = this.this$0.r0;
        if (o2y0Var2 != null && (c = o2y0Var2.c()) != null && (name = c.name()) != null) {
            str = name.toLowerCase(Locale.ROOT);
        }
        ipf0Var.b(new dpf0(str2, str3, str, G, arrayList2, this.$item.k), this.this$0.t0);
        return zy11.a;
    }
}
