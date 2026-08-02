package com.yandex.go.taxi.order.promotions.modal_default.mapper;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.TotwPromotionWidgets;
import com.yandex.go.taxi.order.models.api.response.q3;
import com.yandex.go.taxi.order.promotions.modal_default.model.ModalDefaultAction;
import defpackage.c4v;
import defpackage.jl40;
import defpackage.kr70;
import defpackage.lr70;
import defpackage.nr70;
import defpackage.ny61;
import defpackage.or70;
import defpackage.pr70;
import defpackage.qos0;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.communications.model.widgets.d;
import ru.yandex.taxi.communications.model.widgets.e0;
import ru.yandex.taxi.communications.model.widgets.l0;
import ru.yandex.taxi.communications.model.widgets.m0;
import ru.yandex.taxi.communications.model.widgets.n0;
import ru.yandex.taxi.communications.model.widgets.q;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public static ModalDefaultAction b(b bVar) {
        if (jl40.l(bVar, e0.INSTANCE)) {
            return ModalDefaultAction.Order;
        }
        if (jl40.l(bVar, m0.INSTANCE) || jl40.l(bVar, n0.INSTANCE) || jl40.l(bVar, x.INSTANCE) || jl40.l(bVar, l0.INSTANCE) || (bVar instanceof ActionButton.g) || jl40.l(bVar, d.INSTANCE) || (bVar instanceof ActionButton.k) || (bVar instanceof ActionButton.f) || (bVar instanceof ActionButton.d) || (bVar instanceof ActionButton.h) || (bVar instanceof ActionButton.i) || (bVar instanceof ActionButton.j) || (bVar instanceof ActionButton.a) || (bVar instanceof ActionButton.l) || (bVar instanceof ActionButton.b) || (bVar instanceof ActionButton.c) || (bVar instanceof q) || bVar == null) {
            return ModalDefaultAction.Close;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x006c, code lost:
    
        if (r5 == r4) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ModalItemDto$DefaultItem modalItemDto$DefaultItem, ContinuationImpl continuationImpl) {
        OrderDefaultModalMapper$map$1 orderDefaultModalMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Object i2;
        Object i3;
        ModalItemDto$DefaultItem modalItemDto$DefaultItem2;
        String str2;
        CharSequence charSequence;
        q3 q3Var;
        Pair pair;
        List list;
        ModalItemDto$DefaultItem modalItemDto$DefaultItem3 = modalItemDto$DefaultItem;
        if (continuationImpl instanceof OrderDefaultModalMapper$map$1) {
            orderDefaultModalMapper$map$1 = (OrderDefaultModalMapper$map$1) continuationImpl;
            int i4 = orderDefaultModalMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                orderDefaultModalMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = orderDefaultModalMapper$map$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDefaultModalMapper$map$1.label;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str = modalItemDto$DefaultItem3.a;
                    FormattedText formattedText = modalItemDto$DefaultItem3.b;
                    orderDefaultModalMapper$map$1.L$0 = modalItemDto$DefaultItem3;
                    orderDefaultModalMapper$map$1.L$1 = str;
                    orderDefaultModalMapper$map$1.label = 1;
                    i2 = c.i(cVar, formattedText, null, orderDefaultModalMapper$map$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence2 = (CharSequence) orderDefaultModalMapper$map$1.L$2;
                        String str3 = (String) orderDefaultModalMapper$map$1.L$1;
                        modalItemDto$DefaultItem2 = (ModalItemDto$DefaultItem) orderDefaultModalMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        charSequence = charSequence2;
                        str2 = str3;
                        CharSequence charSequence3 = (CharSequence) obj;
                        q3Var = modalItemDto$DefaultItem2.h;
                        c4v c4vVar = modalItemDto$DefaultItem2.g;
                        if (q3Var.a()) {
                            String str4 = c4vVar.b;
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str5 = c4vVar.a;
                            if (str5 == null) {
                                str5 = "";
                            }
                            pair = new Pair(str4, str5);
                        } else {
                            String b = q3Var.getB();
                            if (b == null) {
                                b = "";
                            }
                            String a = q3Var.getA();
                            if (a == null) {
                                a = "";
                            }
                            pair = new Pair(b, a);
                        }
                        or70 or70Var = new or70((String) pair.getFirst(), (String) pair.getSecond(), q3Var.a());
                        List list2 = modalItemDto$DefaultItem2.i;
                        int i5 = modalItemDto$DefaultItem2.d.a;
                        TotwPromotionWidgets totwPromotionWidgets = modalItemDto$DefaultItem2.e;
                        List list3 = totwPromotionWidgets.a;
                        list = totwPromotionWidgets.c;
                        qos0 qos0Var = totwPromotionWidgets.b;
                        ?? r3 = EmptyList.a;
                        if (list == null) {
                            if (qos0Var != null) {
                                String str6 = qos0Var.b;
                                String str7 = qos0Var.c;
                                r3 = Collections.singletonList(new lr70(str6, b(qos0Var.a), str7 != null ? str7 : ""));
                            } else if (!list3.isEmpty()) {
                                List<ActionButton> list4 = list3;
                                r3 = new ArrayList(tcc.n(list4, 10));
                                for (ActionButton actionButton : list4) {
                                    r3.add(new kr70(actionButton.b, b(actionButton.e)));
                                }
                            }
                        }
                        List list5 = r3;
                        pr70 pr70Var = new pr70(str2, charSequence, charSequence3, or70Var, list2, i5, list5, new nr70(0));
                        if (charSequence != null || charSequence.length() == 0 || list2.isEmpty() || list5.isEmpty() || str2 == null || str2.length() == 0 || i5 <= 0) {
                            return null;
                        }
                        return pr70Var;
                    }
                    String str8 = (String) orderDefaultModalMapper$map$1.L$1;
                    ModalItemDto$DefaultItem modalItemDto$DefaultItem4 = (ModalItemDto$DefaultItem) orderDefaultModalMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    str = str8;
                    modalItemDto$DefaultItem3 = modalItemDto$DefaultItem4;
                    i2 = obj;
                }
                CharSequence charSequence4 = (CharSequence) i2;
                FormattedText formattedText2 = modalItemDto$DefaultItem3.f;
                orderDefaultModalMapper$map$1.L$0 = modalItemDto$DefaultItem3;
                orderDefaultModalMapper$map$1.L$1 = str;
                orderDefaultModalMapper$map$1.L$2 = charSequence4;
                orderDefaultModalMapper$map$1.label = 2;
                i3 = c.i(cVar, formattedText2, null, orderDefaultModalMapper$map$1, 30);
                if (i3 != coroutineSingletons) {
                    modalItemDto$DefaultItem2 = modalItemDto$DefaultItem3;
                    str2 = str;
                    charSequence = charSequence4;
                    obj = i3;
                    CharSequence charSequence32 = (CharSequence) obj;
                    q3Var = modalItemDto$DefaultItem2.h;
                    c4v c4vVar2 = modalItemDto$DefaultItem2.g;
                    if (q3Var.a()) {
                    }
                    or70 or70Var2 = new or70((String) pair.getFirst(), (String) pair.getSecond(), q3Var.a());
                    List list22 = modalItemDto$DefaultItem2.i;
                    int i52 = modalItemDto$DefaultItem2.d.a;
                    TotwPromotionWidgets totwPromotionWidgets2 = modalItemDto$DefaultItem2.e;
                    List list32 = totwPromotionWidgets2.a;
                    list = totwPromotionWidgets2.c;
                    qos0 qos0Var2 = totwPromotionWidgets2.b;
                    ?? r32 = EmptyList.a;
                    if (list == null) {
                    }
                    List list52 = r32;
                    pr70 pr70Var2 = new pr70(str2, charSequence, charSequence32, or70Var2, list22, i52, list52, new nr70(0));
                    if (charSequence != null) {
                    }
                    return null;
                }
                return coroutineSingletons;
            }
        }
        orderDefaultModalMapper$map$1 = new OrderDefaultModalMapper$map$1(this, continuationImpl);
        Object obj2 = orderDefaultModalMapper$map$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDefaultModalMapper$map$1.label;
        c cVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) i2;
        FormattedText formattedText22 = modalItemDto$DefaultItem3.f;
        orderDefaultModalMapper$map$1.L$0 = modalItemDto$DefaultItem3;
        orderDefaultModalMapper$map$1.L$1 = str;
        orderDefaultModalMapper$map$1.L$2 = charSequence42;
        orderDefaultModalMapper$map$1.label = 2;
        i3 = c.i(cVar2, formattedText22, null, orderDefaultModalMapper$map$1, 30);
        if (i3 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
