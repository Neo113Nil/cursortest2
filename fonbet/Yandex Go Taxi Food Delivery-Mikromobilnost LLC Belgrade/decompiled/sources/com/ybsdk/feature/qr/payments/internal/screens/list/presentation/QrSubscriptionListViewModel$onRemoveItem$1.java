package com.ybsdk.feature.qr.payments.internal.screens.list.presentation;

import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrDeleteSubscriptionLoadedResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.internal.screens.list.data.entities.SubscriptionEntity$Status;
import defpackage.bsh;
import defpackage.cbg0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.j1v0;
import defpackage.jl40;
import defpackage.m04;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.odf0;
import defpackage.p0v0;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.ssa1;
import defpackage.tse;
import defpackage.ufg0;
import defpackage.wj1;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.z1v0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionListViewModel$onRemoveItem$1", f = "QrSubscriptionListViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrSubscriptionListViewModel$onRemoveItem$1 extends SuspendLambda implements wls {
    final /* synthetic */ p0v0 $item;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrSubscriptionListViewModel$onRemoveItem$1(a aVar, p0v0 p0v0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = p0v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrSubscriptionListViewModel$onRemoveItem$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrSubscriptionListViewModel$onRemoveItem$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String b;
        p0v0 p0v0Var;
        pz40 Y;
        r0 r0Var;
        Object value;
        Object a;
        String str2;
        Object obj2;
        Object obj3;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Object a2 = ((j1v0) this.this$0.X()).a.a();
            z1v0 z1v0Var = a2 instanceof z1v0 ? (z1v0) a2 : null;
            if (z1v0Var != null) {
                p0v0 p0v0Var2 = this.$item;
                Iterator it = z1v0Var.a.iterator();
                loop1: while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    List list = ((wj1) obj3).d;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (jl40.l(((p0v0) it2.next()).a, p0v0Var2.a)) {
                                break loop1;
                            }
                        }
                    }
                }
                wj1 wj1Var = (wj1) obj3;
                if (wj1Var != null) {
                    str = wj1Var.a;
                    m04 m04Var = this.this$0.D;
                    String str3 = this.$item.a;
                    rt1 rt1Var = m04Var.a.Y;
                    b = str == null ? ssa1.b(str) : null;
                    String b2 = ssa1.b(str3);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                    if (b != null) {
                        linkedHashMap.put("agreement_id", b);
                    }
                    linkedHashMap.put("subscription_id", b2);
                    rt1Var.a.a("qr.delete_subscription.initiated", linkedHashMap);
                    a aVar = this.this$0;
                    p0v0Var = this.$item;
                    Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, ((j1v0) value).b(p0v0Var.a, SubscriptionEntity$Status.CHECKING)));
                    com.ybsdk.feature.qr.payments.internal.screens.list.data.a aVar2 = this.this$0.C;
                    String str4 = this.$item.a;
                    this.L$0 = str;
                    this.label = 1;
                    a = aVar2.a(str4, this);
                    if (a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    obj2 = a;
                }
            }
            str = null;
            m04 m04Var2 = this.this$0.D;
            String str32 = this.$item.a;
            rt1 rt1Var2 = m04Var2.a.Y;
            if (str == null) {
            }
            String b22 = ssa1.b(str32);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
            if (b != null) {
            }
            linkedHashMap2.put("subscription_id", b22);
            rt1Var2.a.a("qr.delete_subscription.initiated", linkedHashMap2);
            a aVar3 = this.this$0;
            p0v0Var = this.$item;
            Y = aVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ((j1v0) value).b(p0v0Var.a, SubscriptionEntity$Status.CHECKING)));
            com.ybsdk.feature.qr.payments.internal.screens.list.data.a aVar22 = this.this$0.C;
            String str42 = this.$item.a;
            this.L$0 = str;
            this.label = 1;
            a = aVar22.a(str42, this);
            if (a != coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        p0v0 p0v0Var3 = this.$item;
        if (!(obj2 instanceof Result.Failure)) {
            bsh bshVar = (bsh) obj2;
            aVar4.D.a.Y.w(QrPaymentEvents$QrDeleteSubscriptionLoadedResult.OK, str2 != null ? ssa1.b(str2) : null, ssa1.b(p0v0Var3.a), null);
            Object a3 = ((j1v0) aVar4.X()).a.a();
            z1v0 z1v0Var2 = a3 instanceof z1v0 ? (z1v0) a3 : null;
            Integer num = z1v0Var2 != null ? new Integer(z1v0Var2.a.size()) : null;
            aVar4.a0(new odf0(10, p0v0Var3));
            Object a4 = ((j1v0) aVar4.X()).a.a();
            z1v0 z1v0Var3 = a4 instanceof z1v0 ? (z1v0) a4 : null;
            if (z1v0Var3 != null) {
                List list2 = z1v0Var3.a;
                int size = list2.size();
                if (num != null && size < num.intValue() && str2 != null) {
                    aVar4.D.a.Y.a.a("qr.agreements_subscriptions.hide_agreement", x4e.t(2, "new_agreements_list", kotlin.collections.a.X(list2, ",", null, null, new cbg0(12), 30), "agreement_id", ssa1.b(str2)));
                }
            }
            aVar4.Z(new ufg0(new n0t0(g8e.i(Text.Companion, bshVar.a))));
        }
        a aVar5 = this.this$0;
        p0v0 p0v0Var4 = this.$item;
        Throwable a5 = Result.a(obj2);
        if (a5 != null) {
            m04 m04Var3 = aVar5.D;
            String th = a5.toString();
            String str5 = p0v0Var4.a;
            String str6 = p0v0Var4.a;
            m04Var3.a.Y.w(QrPaymentEvents$QrDeleteSubscriptionLoadedResult.ERROR, str2 != null ? ssa1.b(str2) : null, ssa1.b(str5), th);
            pz40 Y2 = aVar5.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, ((j1v0) value2).b(str6, SubscriptionEntity$Status.DEFAULT)));
            x4c.g("Can't confirm item removal", a5, str6, null, 8);
            aVar5.Z(new ufg0(gao.e(null, null, a5, 3)));
        }
        return zy11.a;
    }
}
