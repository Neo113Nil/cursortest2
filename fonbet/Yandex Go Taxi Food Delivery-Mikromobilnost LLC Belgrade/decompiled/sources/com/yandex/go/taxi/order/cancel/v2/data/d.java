package com.yandex.go.taxi.order.cancel.v2.data;

import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.gci0;
import defpackage.hj70;
import defpackage.ief;
import defpackage.jj70;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kdc;
import defpackage.kub1;
import defpackage.lj70;
import defpackage.mdh;
import defpackage.nk70;
import defpackage.ny61;
import defpackage.oj70;
import defpackage.ol70;
import defpackage.pdc;
import defpackage.pl70;
import defpackage.qj70;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sk70;
import defpackage.tk70;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uk70;
import defpackage.uvb1;
import defpackage.uyj;
import defpackage.xdf;
import defpackage.xj70;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d implements uk70 {
    public final xdf a;
    public final c b;
    public final b c;
    public final xj70 d;
    public final tt2 e;
    public final r0 f;
    public final gci0 g;

    public d(xdf xdfVar, c cVar, b bVar, xj70 xj70Var, tt2 tt2Var) {
        this.a = xdfVar;
        this.b = cVar;
        this.c = bVar;
        this.d = xj70Var;
        this.e = tt2Var;
        r0 c = bvf0.c(null);
        this.f = c;
        this.g = e.d(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v0, types: [pl70] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v9, types: [tpr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, OrderCancelNotification orderCancelNotification, ief iefVar, List list, ContinuationImpl continuationImpl) {
        OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1 orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1;
        int i;
        g X;
        sk70 sk70Var;
        String str3;
        String str4;
        Object X2;
        Iterator it;
        Continuation pl70Var;
        OrderCancelNotification orderCancelNotification2 = orderCancelNotification;
        ief iefVar2 = iefVar;
        if (continuationImpl instanceof OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1) {
            orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1 = (OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1) continuationImpl;
            int i2 = orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    OrderCancelNotification.Style style = orderCancelNotification2.b;
                    OrderCancelNotification.Style.IconAlignment iconAlignment = style != null ? style.a : null;
                    OrderCancelNotification.IconWithBadge iconWithBadge = orderCancelNotification2.c;
                    c cVar = this.b;
                    X = e.X(cVar.b.a(), new OrderCancelHeaderImageRepository$headerImageFlow$1(iconWithBadge, cVar, iconAlignment, null));
                    String str5 = orderCancelNotification2.d;
                    xdf xdfVar = this.a;
                    sk70Var = new sk70(kub1.e(xdfVar, iefVar2, str5), kub1.e(xdfVar, iefVar2, orderCancelNotification2.e));
                    List list2 = orderCancelNotification2.f;
                    str3 = str;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$0 = str3;
                    str4 = str2;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$1 = str4;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$2 = orderCancelNotification2;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$3 = iefVar2;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$4 = null;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$5 = X;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$6 = null;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$7 = null;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$8 = sk70Var;
                    orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.label = 1;
                    b bVar = this.c;
                    X2 = e.X(e.I(bVar.b.a(), new OrderCancelActionItemsRepository$listItemsFlow$2(bVar, list2, list, null)), new OrderCancelActionItemsRepository$listItemsFlow$3(bVar, null));
                    if (X2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sk70 sk70Var2 = (sk70) orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$8;
                    ?? r2 = (tpr) orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$5;
                    ief iefVar3 = (ief) orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$3;
                    OrderCancelNotification orderCancelNotification3 = (OrderCancelNotification) orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$2;
                    String str6 = (String) orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$1;
                    String str7 = (String) orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.L$0;
                    kotlin.b.b(obj);
                    sk70Var = sk70Var2;
                    orderCancelNotification2 = orderCancelNotification3;
                    str4 = str6;
                    str3 = str7;
                    X2 = obj;
                    X = r2;
                    iefVar2 = iefVar3;
                }
                tpr tprVar = (tpr) X2;
                OrderCancelNotification.Buttons buttons = orderCancelNotification2.g;
                xj70 xj70Var = this.d;
                xj70Var.getClass();
                List list3 = buttons.b;
                ArrayList arrayList = new ArrayList();
                it = list3.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        ?? r17 = continuation;
                        scc.m();
                        throw r17;
                    }
                    OrderCancelNotification.Button button = (OrderCancelNotification.Button) next;
                    boolean z = i3 == scc.f(buttons.b);
                    pdc pdcVar = xj70Var.b;
                    xdf xdfVar2 = xj70Var.a;
                    Continuation continuation2 = continuation;
                    String str8 = button.d;
                    Iterator it2 = it;
                    String str9 = button.b;
                    String e = kub1.e(xdfVar2, iefVar2, str8);
                    kdc bdcVar = z ? new bdc(xng0.controlMain) : new bdc(xng0.controlMinor);
                    if (str9 != null && str9.length() != 0) {
                        bdcVar = ((ufu) pdcVar).e(str9);
                    }
                    qj70 j = uvb1.j(button.f);
                    if (((j instanceof hj70) && ((hj70) j).a.length() == 0) || (((j instanceof oj70) && evu0.J(((oj70) j).a)) || ((j instanceof jj70) && evu0.J(((jj70) j).a)))) {
                        pl70Var = continuation2;
                    } else {
                        ufu ufuVar = (ufu) pdcVar;
                        pl70Var = new pl70(button.a, e, bdcVar != null ? Integer.valueOf(s8o.m(bdcVar, xj70Var.c)) : continuation2, ufuVar.i(button.c), ufuVar.i(button.e), j);
                    }
                    if (pl70Var != null) {
                        arrayList.add(pl70Var);
                    }
                    it = it2;
                    i3 = i4;
                    continuation = continuation2;
                }
                jqr jqrVar = new jqr(new m0(X, tprVar, new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2(str3, str4, sk70Var, new nk70(buttons.a, arrayList), null)), new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3(this, continuation), 3);
                this.e.getClass();
                sjh sjhVar = uyj.a;
                return e.F(jqrVar, mdh.b);
            }
        }
        orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1 = new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1(this, continuationImpl);
        Object obj2 = orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$1.label;
        Continuation continuation3 = null;
        if (i != 0) {
        }
        tpr tprVar2 = (tpr) X2;
        OrderCancelNotification.Buttons buttons2 = orderCancelNotification2.g;
        xj70 xj70Var2 = this.d;
        xj70Var2.getClass();
        List list32 = buttons2.b;
        ArrayList arrayList2 = new ArrayList();
        it = list32.iterator();
        int i32 = 0;
        while (it.hasNext()) {
        }
        jqr jqrVar2 = new jqr(new m0(X, tprVar2, new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$2(str3, str4, sk70Var, new nk70(buttons2.a, arrayList2), null)), new OrderCancelModalContentRepositoryImpl$getModalViewContentUpdateFlow$3(this, continuation3), 3);
        this.e.getClass();
        sjh sjhVar2 = uyj.a;
        return e.F(jqrVar2, mdh.b);
    }

    public final boolean b(String str) {
        tk70 tk70Var = (tk70) this.f.getValue();
        if (tk70Var == null || !jl40.l(tk70Var.a, str)) {
            return false;
        }
        List list = tk70Var.e.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((ol70) it.next()).c, lj70.a)) {
                return true;
            }
        }
        return false;
    }
}
