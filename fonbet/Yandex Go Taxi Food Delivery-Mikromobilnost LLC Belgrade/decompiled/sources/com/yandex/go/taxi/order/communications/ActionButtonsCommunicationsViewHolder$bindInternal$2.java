package com.yandex.go.taxi.order.communications;

import android.view.View;
import android.view.ViewGroup;
import defpackage.kpf0;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qk30;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/design/ListItemComponent;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/design/ListItemComponent;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ActionButtonsCommunicationsViewHolder$bindInternal$2", f = "ActionButtonsCommunicationsViewHolder.kt", l = {106, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ActionButtonsCommunicationsViewHolder$bindInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ kpf0 $item;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonsCommunicationsViewHolder$bindInternal$2(e eVar, kpf0 kpf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActionButtonsCommunicationsViewHolder$bindInternal$2(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionButtonsCommunicationsViewHolder$bindInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        ActionButtonsCommunicationsViewHolder$bindInternal$2 actionButtonsCommunicationsViewHolder$bindInternal$2;
        e eVar;
        kpf0 kpf0Var;
        ListItemComponent listItemComponent2;
        List list;
        ListItemComponent listItemComponent3;
        ListItemComponent listItemComponent4;
        ListItemComponent listItemComponent5;
        List list2;
        e eVar2;
        kpf0 kpf0Var2;
        View trailViewAs;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar3 = this.this$0;
            listItemComponent = eVar3.c0;
            kpf0 kpf0Var3 = this.$item;
            CommunicationItem communicationItem = kpf0Var3.a;
            CommunicationItem.a aVar = communicationItem.g;
            List list3 = aVar != null ? aVar.e : null;
            if (list3 == null) {
                list3 = EmptyList.a;
            }
            ru.yandex.taxi.widget.c cVar = eVar3.d0;
            FormattedText formattedText = communicationItem.b;
            this.L$0 = listItemComponent;
            this.L$1 = kpf0Var3;
            this.L$2 = eVar3;
            this.L$3 = listItemComponent;
            this.L$4 = list3;
            this.L$5 = listItemComponent;
            this.label = 1;
            Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
            actionButtonsCommunicationsViewHolder$bindInternal$2 = this;
            if (e != coroutineSingletons) {
                eVar = eVar3;
                kpf0Var = kpf0Var3;
                obj = e;
                listItemComponent2 = listItemComponent;
                list = list3;
                listItemComponent3 = listItemComponent2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listItemComponent4 = (ListItemComponent) this.L$5;
            list2 = (List) this.L$4;
            listItemComponent5 = (ListItemComponent) this.L$3;
            eVar2 = (e) this.L$2;
            kpf0Var2 = (kpf0) this.L$1;
            listItemComponent2 = (ListItemComponent) this.L$0;
            kotlin.b.b(obj);
            listItemComponent4.setSubtitle((CharSequence) obj);
            CommunicationItem communicationItem2 = kpf0Var2.a;
            int i3 = e.w0;
            eVar2.getClass();
            ArrayList arrayList = new ArrayList();
            ListItemComponent listItemComponent6 = eVar2.c0;
            trailViewAs = listItemComponent6.getTrailViewAs(ListButtonComponent.class);
            if (trailViewAs == null) {
                View listButtonComponent = new ListButtonComponent(listItemComponent6.getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(0, 0, tje.r(mrg0.go_design_s_space, listItemComponent6.getContext()), 0);
                listButtonComponent.setLayoutParams(marginLayoutParams);
                listItemComponent6.setTrailView(listButtonComponent);
                trailViewAs = listButtonComponent;
            }
            ((ListButtonComponent) trailViewAs).addButtons(list2, new qk30(i2, arrayList, eVar2, communicationItem2));
            listItemComponent5.invalidateComponent();
            return listItemComponent2;
        }
        ListItemComponent listItemComponent7 = (ListItemComponent) this.L$5;
        List list4 = (List) this.L$4;
        ListItemComponent listItemComponent8 = (ListItemComponent) this.L$3;
        e eVar4 = (e) this.L$2;
        kpf0 kpf0Var4 = (kpf0) this.L$1;
        ListItemComponent listItemComponent9 = (ListItemComponent) this.L$0;
        kotlin.b.b(obj);
        listItemComponent3 = listItemComponent7;
        listItemComponent = listItemComponent8;
        list = list4;
        actionButtonsCommunicationsViewHolder$bindInternal$2 = this;
        eVar = eVar4;
        kpf0Var = kpf0Var4;
        listItemComponent2 = listItemComponent9;
        listItemComponent3.setTitle((CharSequence) obj);
        ru.yandex.taxi.widget.c cVar2 = eVar.d0;
        FormattedText formattedText2 = kpf0Var.a.c;
        actionButtonsCommunicationsViewHolder$bindInternal$2.L$0 = listItemComponent2;
        actionButtonsCommunicationsViewHolder$bindInternal$2.L$1 = kpf0Var;
        actionButtonsCommunicationsViewHolder$bindInternal$2.L$2 = eVar;
        actionButtonsCommunicationsViewHolder$bindInternal$2.L$3 = listItemComponent;
        actionButtonsCommunicationsViewHolder$bindInternal$2.L$4 = list;
        actionButtonsCommunicationsViewHolder$bindInternal$2.L$5 = listItemComponent;
        actionButtonsCommunicationsViewHolder$bindInternal$2.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, actionButtonsCommunicationsViewHolder$bindInternal$2, 30);
        if (obj != coroutineSingletons) {
            listItemComponent4 = listItemComponent;
            listItemComponent5 = listItemComponent4;
            list2 = list;
            eVar2 = eVar;
            kpf0Var2 = kpf0Var;
            listItemComponent4.setSubtitle((CharSequence) obj);
            CommunicationItem communicationItem22 = kpf0Var2.a;
            int i32 = e.w0;
            eVar2.getClass();
            ArrayList arrayList2 = new ArrayList();
            ListItemComponent listItemComponent62 = eVar2.c0;
            trailViewAs = listItemComponent62.getTrailViewAs(ListButtonComponent.class);
            if (trailViewAs == null) {
            }
            ((ListButtonComponent) trailViewAs).addButtons(list2, new qk30(i2, arrayList2, eVar2, communicationItem22));
            listItemComponent5.invalidateComponent();
            return listItemComponent2;
        }
        return coroutineSingletons;
    }
}
