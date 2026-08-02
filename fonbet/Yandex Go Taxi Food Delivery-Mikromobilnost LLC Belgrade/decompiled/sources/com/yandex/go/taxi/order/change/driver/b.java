package com.yandex.go.taxi.order.change.driver;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.e;
import defpackage.a3y0;
import defpackage.ju8;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sjh;
import defpackage.tb9;
import defpackage.tje;
import defpackage.uyj;
import defpackage.va9;
import defpackage.w511;
import defpackage.wa9;
import defpackage.xa9;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final com.yandex.go.taxi.order.change.common.domain.d a;
    public final d b;
    public final a3y0 c = new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "ChangeDriverInteractor");

    public b(com.yandex.go.taxi.order.change.common.domain.d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        ChangeDriverInteractor$triggerReorder$1 changeDriverInteractor$triggerReorder$1;
        int i;
        xa9 xa9Var;
        if (continuationImpl instanceof ChangeDriverInteractor$triggerReorder$1) {
            changeDriverInteractor$triggerReorder$1 = (ChangeDriverInteractor$triggerReorder$1) continuationImpl;
            int i2 = changeDriverInteractor$triggerReorder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeDriverInteractor$triggerReorder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeDriverInteractor$triggerReorder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeDriverInteractor$triggerReorder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = this.b;
                    changeDriverInteractor$triggerReorder$1.L$0 = o2y0Var;
                    changeDriverInteractor$triggerReorder$1.label = 1;
                    dVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new ChangeDriverRepository$triggerReorder$2(dVar, o2y0Var, null), changeDriverInteractor$triggerReorder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var = (o2y0) changeDriverInteractor$triggerReorder$1.L$0;
                    kotlin.b.b(obj);
                }
                xa9Var = (xa9) obj;
                if (!(xa9Var instanceof wa9)) {
                    wa9 wa9Var = (wa9) xa9Var;
                    List e = o2y0Var.b().i.e();
                    if (!(e instanceof Collection) || !e.isEmpty()) {
                        Iterator it = e.iterator();
                        while (it.hasNext()) {
                            if (((e) it.next()).getB() == ChangeOrderState$Source.DRIVER) {
                                break;
                            }
                        }
                    }
                    com.yandex.go.taxi.order.change.common.domain.d dVar2 = this.a;
                    dVar2.a.h(new tb9(o2y0Var.b().a, wa9Var.b, ChangeOrderState$Source.DRIVER));
                } else {
                    if (!(xa9Var instanceof va9)) {
                        w511.b();
                        return null;
                    }
                    a3y0.d(this.c, "handleError", null, new ju8(11, (va9) xa9Var), 2);
                }
                return zy11.a;
            }
        }
        changeDriverInteractor$triggerReorder$1 = new ChangeDriverInteractor$triggerReorder$1(this, continuationImpl);
        Object obj2 = changeDriverInteractor$triggerReorder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeDriverInteractor$triggerReorder$1.label;
        if (i != 0) {
        }
        xa9Var = (xa9) obj2;
        if (!(xa9Var instanceof wa9)) {
        }
        return zy11.a;
    }
}
