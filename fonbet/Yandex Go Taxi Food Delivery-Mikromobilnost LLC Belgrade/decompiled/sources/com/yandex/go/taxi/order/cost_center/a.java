package com.yandex.go.taxi.order.cost_center;

import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.a20;
import defpackage.avj0;
import defpackage.cmt;
import defpackage.ff60;
import defpackage.if60;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qyy0;
import defpackage.spk0;
import defpackage.ud30;
import defpackage.wnt;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.HttpException;

/* loaded from: classes14.dex */
public final class a extends a20 {
    public final o2y0 c;
    public final /* synthetic */ b d;

    public a(b bVar, o2y0 o2y0Var) {
        this.d = bVar;
        this.c = o2y0Var;
    }

    @Override // defpackage.a20
    public final String a() {
        return "corp cost center";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (defpackage.evu0.J(r4) == false) goto L22;
     */
    @Override // defpackage.a20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Throwable th) {
        String str;
        if60.a aVar;
        spk0 spk0Var = (spk0) obj;
        o2y0 o2y0Var = this.c;
        b bVar = this.d;
        super.b(spk0Var, th);
        if (this.b != null) {
            return;
        }
        TaxiOrder b = o2y0Var.b();
        synchronized (b) {
            str = null;
            b.i = b.i.j(null);
        }
        bVar.d.g(o2y0Var.b());
        if ((th instanceof HttpException) && ((HttpException) th).a() == 406) {
            ff60 ff60Var = if60.Companion;
            wnt wntVar = bVar.f;
            ff60Var.getClass();
            if60 a = ff60.a(wntVar, th);
            if (a != null && (aVar = a.a) != null) {
                str = aVar.b;
            }
            if (str != null) {
            }
        }
        str = ((avj0) bVar.h).h(kyh0.common_server_error);
        ((RideCostCenterUpdaterImpl$update$1) spk0Var.b).invoke(str);
        ((c) bVar.e).p();
        qyy0.b(new ud30(27, bVar, this, str));
    }

    @Override // defpackage.a20
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj, Continuation continuation) {
        return e((spk0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(spk0 spk0Var, ContinuationImpl continuationImpl) {
        RideCostCenterUpdaterImpl$CostCenterDelegate$update$1 rideCostCenterUpdaterImpl$CostCenterDelegate$update$1;
        int i;
        if (continuationImpl instanceof RideCostCenterUpdaterImpl$CostCenterDelegate$update$1) {
            rideCostCenterUpdaterImpl$CostCenterDelegate$update$1 = (RideCostCenterUpdaterImpl$CostCenterDelegate$update$1) continuationImpl;
            int i2 = rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<OrderChangesDto.PendingChangeDto> e = this.d.b.e(spk0Var.a);
                    rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.L$0 = null;
                    rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.L$1 = null;
                    rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(e, null, rideCostCenterUpdaterImpl$CostCenterDelegate$update$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        rideCostCenterUpdaterImpl$CostCenterDelegate$update$1 = new RideCostCenterUpdaterImpl$CostCenterDelegate$update$1(this, continuationImpl);
        Object obj2 = rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCostCenterUpdaterImpl$CostCenterDelegate$update$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
