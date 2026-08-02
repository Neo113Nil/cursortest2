package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a0j0;
import defpackage.a3y0;
import defpackage.cmt;
import defpackage.hst;
import defpackage.jst;
import defpackage.lqi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o58;
import defpackage.ozi0;
import defpackage.ri1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ReorderController$reorder$2", f = "ReorderController.kt", l = {41, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ReorderController$reorder$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $decisionId;
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ozi0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderController$reorder$2(ozi0 ozi0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ozi0Var;
        this.$orderId = str;
        this.$decisionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReorderController$reorder$2(this.this$0, this.$orderId, this.$decisionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReorderController$reorder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder;
        TaxiOrder taxiOrder2;
        String str;
        HashSet hashSet;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.g.getClass();
            a3y0.h(new String[]{"reorder"});
            hst hstVar = jst.e;
            TaxiOrder a = this.this$0.d.a(this.$orderId);
            ozi0 ozi0Var = this.this$0;
            if (a != null) {
                ri1 ri1Var = ozi0Var.f;
                String str2 = this.$orderId;
                String str3 = this.$decisionId;
                HashSet hashSet2 = ri1Var.b;
                if (hashSet2.contains(str2)) {
                    hashSet2.add(str3);
                }
                String str4 = this.$decisionId;
                if (str4 != null && str4.length() != 0) {
                    synchronized (a) {
                        a.l = a.l.a(str4);
                    }
                }
                a.O(false);
                this.this$0.d.g(a);
            } else {
                a3y0.d(ozi0Var.g, "reorder", null, new lqi0(9), 2);
            }
            ru.yandex.taxi.launch.c cVar = this.this$0.b;
            this.L$0 = a;
            this.label = 1;
            Object c = cVar.c(this);
            if (c != coroutineSingletons) {
                taxiOrder = a;
                obj = c;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            taxiOrder2 = (TaxiOrder) this.L$0;
            kotlin.b.b(obj);
            ozi0 ozi0Var2 = this.this$0;
            str = this.$orderId;
            String str5 = this.$decisionId;
            hashSet = ozi0Var2.f.b;
            if (hashSet.contains(str)) {
                hashSet.add(str5);
            }
            return ozi0Var2.e.a.f(str, str5, new o58(2, taxiOrder2, str));
        }
        taxiOrder = (TaxiOrder) this.L$0;
        kotlin.b.b(obj);
        cmt<zy11> c2 = this.this$0.c.c(new a0j0((String) obj, this.$orderId, this.$decisionId));
        this.L$0 = taxiOrder;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (ru.yandex.taxi.network.api.a.a(c2, null, this) != coroutineSingletons) {
            taxiOrder2 = taxiOrder;
            ozi0 ozi0Var22 = this.this$0;
            str = this.$orderId;
            String str52 = this.$decisionId;
            hashSet = ozi0Var22.f.b;
            if (hashSet.contains(str)) {
            }
            return ozi0Var22.e.a.f(str, str52, new o58(2, taxiOrder2, str));
        }
        return coroutineSingletons;
    }
}
