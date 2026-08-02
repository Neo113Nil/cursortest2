package com.yandex.go.taxi.order.infosharing.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$ShareOrderItem;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.bdc;
import defpackage.jsq0;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.r2y0;
import defpackage.s2y0;
import defpackage.t2y0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls2y0;", "<anonymous>", "(Ltse;)Ls2y0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.domain.TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2", f = "TaxiOrderInfoSharingPayloadInteractor.kt", l = {44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ CommunicationItem.DisplayOnType $type;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ t2y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2(TaxiOrder taxiOrder, CommunicationItem.DisplayOnType displayOnType, t2y0 t2y0Var, Continuation continuation) {
        super(2, continuation);
        this.$order = taxiOrder;
        this.$type = displayOnType;
        this.this$0 = t2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2 taxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2 = new TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2(this.$order, this.$type, this.this$0, continuation);
        taxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2.L$0 = obj;
        return taxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jsq0 jsq0Var;
        noh h;
        r2y0 r2y0Var;
        ActionButton.ButtonActionType b;
        String str;
        String str2;
        String str3;
        r2y0 r2y0Var2;
        String str4;
        String str5;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderStatusInfo.ModalsContent modalsContent = this.$order.V().s0;
            if (modalsContent != null) {
                List list = modalsContent.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OrderStatusInfo.Modal) it.next()).a);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof ModalItemDto$ShareOrderItem) {
                        arrayList2.add(next);
                    }
                }
                ModalItemDto$ShareOrderItem modalItemDto$ShareOrderItem = (ModalItemDto$ShareOrderItem) kotlin.collections.a.R(arrayList2);
                if (modalItemDto$ShareOrderItem != null && (jsq0Var = modalItemDto$ShareOrderItem.c) != null && jsq0Var.contains(this.$type) && !modalItemDto$ShareOrderItem.b.a.isEmpty() && !modalItemDto$ShareOrderItem.f.a.isEmpty()) {
                    qoh h2 = tje.h(tseVar, null, null, new TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2$title$1(this.this$0, modalItemDto$ShareOrderItem, null), 3);
                    h = tje.h(tseVar, null, null, new TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2$text$1(this.this$0, modalItemDto$ShareOrderItem, null), 3);
                    ru.yandex.taxi.widget.utils.e eVar = this.this$0.a;
                    ActionButton actionButton = (ActionButton) kotlin.collections.a.R(modalItemDto$ShareOrderItem.e.a);
                    if (actionButton == null) {
                        r2y0Var = null;
                    } else {
                        String str6 = actionButton.b;
                        kdc a = eVar.a(actionButton.d);
                        if (a == null) {
                            a = new bdc(xng0.textOnControl);
                        }
                        kdc v = eVar.v(actionButton.c);
                        if (v == null) {
                            v = new bdc(xng0.controlMain);
                        }
                        ru.yandex.taxi.communications.model.widgets.b bVar = actionButton.e;
                        String analyticsName = (bVar == null || (b = bVar.b()) == null) ? null : b.getAnalyticsName();
                        if (analyticsName == null) {
                            analyticsName = "";
                        }
                        r2y0Var = new r2y0(str6, a, v, analyticsName);
                    }
                    if (r2y0Var != null && (str = modalItemDto$ShareOrderItem.g.a) != null) {
                        String str7 = modalItemDto$ShareOrderItem.a;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = h;
                        this.L$5 = r2y0Var;
                        this.L$6 = str;
                        this.L$7 = str7;
                        this.label = 1;
                        Object s = h2.s(this);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s != coroutineSingletons) {
                            str2 = str7;
                            obj = s;
                            str3 = str;
                            r2y0Var2 = r2y0Var;
                        }
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$8;
            str4 = (String) this.L$7;
            String str8 = (String) this.L$6;
            r2y0 r2y0Var3 = (r2y0) this.L$5;
            kotlin.b.b(obj);
            str5 = str8;
            r2y0Var2 = r2y0Var3;
            charSequence = charSequence2;
            return new s2y0(str4, charSequence, (CharSequence) obj, r2y0Var2, str5);
        }
        str2 = (String) this.L$7;
        str3 = (String) this.L$6;
        r2y0Var2 = (r2y0) this.L$5;
        h = (noh) this.L$4;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = r2y0Var2;
        this.L$6 = str3;
        this.L$7 = str2;
        this.L$8 = charSequence3;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str4 = str2;
            str5 = str3;
            charSequence = charSequence3;
            obj = k;
            return new s2y0(str4, charSequence, (CharSequence) obj, r2y0Var2, str5);
        }
        return coroutineSingletons;
    }
}
