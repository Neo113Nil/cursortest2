package com.yandex.go.payments.sbp.domain;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.data.model.PaymentsBindingInProgress;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        PaymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1 paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1;
        int i;
        String a;
        if (continuation instanceof PaymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1) {
            paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1 = (PaymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1) continuation;
            int i2 = paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Lifecycle lifecycle = bVar.a;
                    Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                    paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.L$0 = list;
                    paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.label = 1;
                    if (ru.yandex.taxi.lifecycle.c.e(lifecycle, event, paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                for (PaymentsBindingInProgress paymentsBindingInProgress : list) {
                    String b = paymentsBindingInProgress.getB();
                    if (b != null && (a = paymentsBindingInProgress.getA()) != null && !bVar.l.containsKey(b)) {
                        tse tseVar = bVar.b;
                        bVar.c.getClass();
                        sjh sjhVar = uyj.a;
                        bVar.l.put(b, tje.N(tseVar, mdh.b, null, new PaymentsBindingStatusController$onLargestContentfulPaint$1$1$1$job$1(bVar, b, a, null), 2));
                    }
                }
                return zy11.a;
            }
        }
        paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1 = new PaymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1(this, continuation);
        Object obj2 = paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsBindingStatusController$onLargestContentfulPaint$1$1$emit$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        while (r6.hasNext()) {
        }
        return zy11.a;
    }
}
