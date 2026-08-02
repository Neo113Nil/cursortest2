package com.yandex.go.yb;

import android.content.Context;
import com.yandex.go.payments.paymentlist.domain.n;
import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.experiments.SuggestYandexCardInRideExperiment;
import defpackage.aw51;
import defpackage.b4a0;
import defpackage.be9;
import defpackage.bgc;
import defpackage.cv51;
import defpackage.dv51;
import defpackage.fv51;
import defpackage.g8k0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.i130;
import defpackage.jbh;
import defpackage.k7x0;
import defpackage.mv51;
import defpackage.nv51;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.qqo;
import defpackage.qv51;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uv51;
import defpackage.uyj;
import defpackage.yvf0;
import defpackage.zv51;
import java.math.BigDecimal;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes15.dex */
public final class b {
    public final Context a;
    public final tt2 b;
    public final hit c;
    public final n d;
    public final g8k0 e;
    public final yvf0 f;
    public final h g;
    public final pav h;
    public final k7x0 i;
    public final h3y j;
    public final u k;
    public final i130 l;
    public final oep0 m;
    public final qqo n;
    public pzt0 o;
    public pzt0 p;

    public b(Context context, tt2 tt2Var, hit hitVar, n nVar, rqo rqoVar, g8k0 g8k0Var, yvf0 yvf0Var, h hVar, pav pavVar, k7x0 k7x0Var, h3y h3yVar, u uVar, i130 i130Var, oep0 oep0Var) {
        this.a = context;
        this.b = tt2Var;
        this.c = hitVar;
        this.d = nVar;
        this.e = g8k0Var;
        this.f = yvf0Var;
        this.g = hVar;
        this.h = pavVar;
        this.i = k7x0Var;
        this.j = h3yVar;
        this.k = uVar;
        this.l = i130Var;
        this.m = oep0Var;
        this.n = ((jbh) rqoVar).c(SuggestYandexCardInRideExperiment.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, RequiredCardBalance requiredCardBalance, mv51 mv51Var, ContinuationImpl continuationImpl) {
        SuggestYbCardInRideRouterImpl$getDepositIntent$1 suggestYbCardInRideRouterImpl$getDepositIntent$1;
        Object obj;
        int i;
        BigDecimal bigDecimal;
        bVar.getClass();
        if (continuationImpl instanceof SuggestYbCardInRideRouterImpl$getDepositIntent$1) {
            suggestYbCardInRideRouterImpl$getDepositIntent$1 = (SuggestYbCardInRideRouterImpl$getDepositIntent$1) continuationImpl;
            int i2 = suggestYbCardInRideRouterImpl$getDepositIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestYbCardInRideRouterImpl$getDepositIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = suggestYbCardInRideRouterImpl$getDepositIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestYbCardInRideRouterImpl$getDepositIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = bVar.k;
                    BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(requiredCardBalance.a));
                    String str2 = requiredCardBalance.b;
                    suggestYbCardInRideRouterImpl$getDepositIntent$1.L$0 = null;
                    suggestYbCardInRideRouterImpl$getDepositIntent$1.L$1 = requiredCardBalance;
                    suggestYbCardInRideRouterImpl$getDepositIntent$1.L$2 = mv51Var;
                    suggestYbCardInRideRouterImpl$getDepositIntent$1.label = 1;
                    obj = uVar.b(str, bigDecimal2, str2, suggestYbCardInRideRouterImpl$getDepositIntent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mv51Var = (mv51) suggestYbCardInRideRouterImpl$getDepositIntent$1.L$2;
                    requiredCardBalance = (RequiredCardBalance) suggestYbCardInRideRouterImpl$getDepositIntent$1.L$1;
                    kotlin.b.b(obj);
                }
                if (!(((qv51) obj) instanceof nv51)) {
                    return new aw51(null, YbScreenSource.RIDE);
                }
                if (mv51Var == null || (bigDecimal = mv51Var.a) == null) {
                    bigDecimal = new BigDecimal(0);
                }
                BigDecimal subtract = BigDecimal.valueOf(requiredCardBalance.a).subtract(bigDecimal);
                return subtract.compareTo(BigDecimal.ZERO) <= 0 ? new aw51(null, YbScreenSource.RIDE) : new aw51(new zv51(requiredCardBalance.b, subtract), YbScreenSource.RIDE);
            }
        }
        suggestYbCardInRideRouterImpl$getDepositIntent$1 = new SuggestYbCardInRideRouterImpl$getDepositIntent$1(bVar, continuationImpl);
        obj = suggestYbCardInRideRouterImpl$getDepositIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestYbCardInRideRouterImpl$getDepositIntent$1.label;
        if (i != 0) {
        }
        if (!(((qv51) obj) instanceof nv51)) {
        }
    }

    public final void b(o2y0 o2y0Var, RequiredCardBalance requiredCardBalance, be9 be9Var) {
        b bVar;
        be9 be9Var2;
        a aVar;
        pzt0 pzt0Var;
        if (be9Var == null || requiredCardBalance == null) {
            ((dv51) ((cv51) this.j.get())).b(new fv51(new aw51(null, YbScreenSource.RIDE), true), new bgc(12));
            return;
        }
        uv51 W = this.k.c().B.W(be9Var.a, EmptyList.a);
        mv51 a = W != null ? W.a() : null;
        if (be9Var.c && a != null) {
            b4a0 b4a0Var = PaymentMethod$Type.Companion;
            String str = be9Var.b;
            b4a0Var.getClass();
            PaymentMethod$Type a2 = b4a0.a(str);
            if (a2 == PaymentMethod$Type.YB_WALLET) {
                bVar = this;
                be9Var2 = be9Var;
                aVar = new a(bVar, be9Var2, a, a2, o2y0Var);
                pzt0Var = bVar.o;
                if (pzt0Var == null && pzt0Var.isActive()) {
                    return;
                }
                hbp0 hbp0Var = bVar.c.a;
                bVar.b.getClass();
                sjh sjhVar = uyj.a;
                bVar.o = tje.N(hbp0Var, o400.a, null, new SuggestYbCardInRideRouterImpl$openTopupScreen$1(bVar, be9Var2, requiredCardBalance, a, aVar, null), 2);
            }
        }
        bVar = this;
        be9Var2 = be9Var;
        aVar = null;
        pzt0Var = bVar.o;
        if (pzt0Var == null) {
        }
        hbp0 hbp0Var2 = bVar.c.a;
        bVar.b.getClass();
        sjh sjhVar2 = uyj.a;
        bVar.o = tje.N(hbp0Var2, o400.a, null, new SuggestYbCardInRideRouterImpl$openTopupScreen$1(bVar, be9Var2, requiredCardBalance, a, aVar, null), 2);
    }
}
