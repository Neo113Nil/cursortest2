package com.ybsdk.feature.qr.payments.internal.screens.list.presentation;

import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrLoadSubscriptionsLoadedResult;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.bqg;
import defpackage.cbg0;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.fwn;
import defpackage.j1v0;
import defpackage.m04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wfg0;
import defpackage.wj1;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z1v0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionListViewModel$loadSubscriptions$1", f = "QrSubscriptionListViewModel.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrSubscriptionListViewModel$loadSubscriptions$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrSubscriptionListViewModel$loadSubscriptions$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrSubscriptionListViewModel$loadSubscriptions$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrSubscriptionListViewModel$loadSubscriptions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r8j0 r8j0Var;
        PageHeaderEntity pageHeaderEntity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.D.a.Y.a.a("qr.load_subscriptions.initiated", null);
            com.ybsdk.feature.qr.payments.internal.screens.list.data.a aVar = this.this$0.C;
            this.label = 1;
            b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            Object obj2 = (dqg) b;
            if (obj2 instanceof cqg) {
                m04 m04Var = aVar2.D;
                Object obj3 = ((cqg) obj2).a;
                rt1 rt1Var = m04Var.a.Y;
                QrPaymentEvents$QrLoadSubscriptionsLoadedResult qrPaymentEvents$QrLoadSubscriptionsLoadedResult = QrPaymentEvents$QrLoadSubscriptionsLoadedResult.OK;
                ArrayList arrayList = ((wfg0) obj3).a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((wj1) it.next()).d.size()));
                }
                String X = kotlin.collections.a.X(arrayList2, ",", null, null, null, 62);
                String X2 = kotlin.collections.a.X(arrayList, ",", null, null, new cbg0(11), 30);
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((wj1) it2.next()).d.size();
                }
                rt1.y(rt1Var, qrPaymentEvents$QrLoadSubscriptionsLoadedResult, X2, Integer.valueOf(i2), X, null, 16);
                pz40 Y = aVar2.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                    j1v0 j1v0Var = (j1v0) value3;
                    wfg0 wfg0Var = (wfg0) obj3;
                    ArrayList arrayList3 = wfg0Var.a;
                    fwn fwnVar = wfg0Var.c;
                    wj1 wj1Var = (wj1) kotlin.collections.a.R(arrayList3);
                    r8j0Var = new r8j0(new z1v0(arrayList3, fwnVar, wj1Var != null ? wj1Var.a : null), null, 14);
                    pageHeaderEntity = ((wfg0) obj3).b;
                    j1v0Var.getClass();
                } while (!r0Var3.k(value3, new j1v0(r8j0Var, pageHeaderEntity)));
            } else {
                if (!(obj2 instanceof bqg)) {
                    w511.b();
                    return null;
                }
                rt1.y(aVar2.D.a.Y, QrPaymentEvents$QrLoadSubscriptionsLoadedResult.ERROR, null, null, null, ((bqg) obj2).a, 14);
                pz40 Y2 = aVar2.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, j1v0.a((j1v0) value2, new s8j0(new FailDataException((ct11) obj2)))));
            }
        } else {
            rt1.y(aVar2.D.a.Y, QrPaymentEvents$QrLoadSubscriptionsLoadedResult.ERROR, null, null, null, a.toString(), 14);
            x4c.g("Can't load subscriptions list", a, null, null, 12);
            pz40 Y3 = aVar2.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, j1v0.a((j1v0) value, new s8j0(a))));
        }
        return zy11.a;
    }
}
