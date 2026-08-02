package com.yandex.go.yb.lack_of_order.domain;

import com.yandex.go.taxi.order.models.api.objects.LackOfMoneyNotificationDto;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.go.yb.api.domain.model.YbSdkCheckPaymentCondition;
import com.yandex.go.yb.data.u;
import defpackage.a630;
import defpackage.aw51;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.lv90;
import defpackage.mv51;
import defpackage.ny61;
import defpackage.pv51;
import defpackage.q3y0;
import defpackage.qv51;
import defpackage.uv51;
import defpackage.v0a1;
import defpackage.xh60;
import defpackage.zv51;
import java.math.BigDecimal;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class l {
    public final u a;
    public final com.yandex.go.taxi.order.repositories.c b;
    public final com.yandex.go.superapp.order.multi.old.provider.g c;
    public final h3y d;

    public l(u uVar, com.yandex.go.taxi.order.repositories.c cVar, com.yandex.go.superapp.order.multi.old.provider.g gVar, h3y h3yVar) {
        this.a = uVar;
        this.b = cVar;
        this.c = gVar;
        this.d = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, q3y0 q3y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderMoneyLackIntentInteractor$getIntent$1 taxiOrderMoneyLackIntentInteractor$getIntent$1;
        int i;
        aw51 aw51Var;
        lVar.getClass();
        if (continuationImpl instanceof TaxiOrderMoneyLackIntentInteractor$getIntent$1) {
            taxiOrderMoneyLackIntentInteractor$getIntent$1 = (TaxiOrderMoneyLackIntentInteractor$getIntent$1) continuationImpl;
            int i2 = taxiOrderMoneyLackIntentInteractor$getIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderMoneyLackIntentInteractor$getIntent$1.label = i2 - Integer.MIN_VALUE;
                TaxiOrderMoneyLackIntentInteractor$getIntent$1 taxiOrderMoneyLackIntentInteractor$getIntent$12 = taxiOrderMoneyLackIntentInteractor$getIntent$1;
                Object obj = taxiOrderMoneyLackIntentInteractor$getIntent$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderMoneyLackIntentInteractor$getIntent$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lv90 c = q3y0Var.c();
                    String str = c.b;
                    int i3 = c.a == PaymentMethod$Type.YB_WALLET ? 1 : 0;
                    xh60 a = q3y0Var.a();
                    if (str == null || i3 == 0 || a == null) {
                        jst.e.getClass();
                        return null;
                    }
                    uv51 W = lVar.a.c().B.W(str, EmptyList.a);
                    mv51 a2 = W != null ? W.a() : null;
                    if (a2 != null) {
                        mv51 mv51Var = mv51.f;
                        if (!a2.equals(v0a1.d())) {
                            jst.e.getClass();
                            String b = q3y0Var.b();
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.L$0 = null;
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.L$1 = null;
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.L$2 = null;
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.L$3 = null;
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.L$4 = null;
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.I$0 = i3;
                            taxiOrderMoneyLackIntentInteractor$getIntent$12.label = 1;
                            obj = lVar.b(b, a2, str, a, taxiOrderMoneyLackIntentInteractor$getIntent$12);
                            if (obj == obj2) {
                                return obj2;
                            }
                        }
                    }
                    jst.e.getClass();
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                aw51Var = (aw51) obj;
                if (aw51Var != null) {
                    return null;
                }
                hst hstVar = jst.e;
                aw51Var.toString();
                hstVar.getClass();
                return aw51Var;
            }
        }
        taxiOrderMoneyLackIntentInteractor$getIntent$1 = new TaxiOrderMoneyLackIntentInteractor$getIntent$1(lVar, continuationImpl);
        TaxiOrderMoneyLackIntentInteractor$getIntent$1 taxiOrderMoneyLackIntentInteractor$getIntent$122 = taxiOrderMoneyLackIntentInteractor$getIntent$1;
        Object obj3 = taxiOrderMoneyLackIntentInteractor$getIntent$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderMoneyLackIntentInteractor$getIntent$122.label;
        if (i != 0) {
        }
        aw51Var = (aw51) obj3;
        if (aw51Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, mv51 mv51Var, String str2, xh60 xh60Var, ContinuationImpl continuationImpl) {
        TaxiOrderMoneyLackIntentInteractor$getNotification$1 taxiOrderMoneyLackIntentInteractor$getNotification$1;
        int i;
        zv51 zv51Var;
        LackOfMoneyNotificationDto.RequiredCardBalance c;
        mv51 mv51Var2;
        LackOfMoneyNotificationDto.Informer informer;
        String str3;
        LackOfMoneyNotificationDto.RequiredCardBalance requiredCardBalance;
        qv51 qv51Var;
        if (continuationImpl instanceof TaxiOrderMoneyLackIntentInteractor$getNotification$1) {
            taxiOrderMoneyLackIntentInteractor$getNotification$1 = (TaxiOrderMoneyLackIntentInteractor$getNotification$1) continuationImpl;
            int i2 = taxiOrderMoneyLackIntentInteractor$getNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderMoneyLackIntentInteractor$getNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderMoneyLackIntentInteractor$getNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderMoneyLackIntentInteractor$getNotification$1.label;
                zv51Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LackOfMoneyNotificationDto.Informer c2 = ((LackOfMoneyNotificationDto) xh60Var.a()).getC();
                    if (c2 != null && (c = ((LackOfMoneyNotificationDto) xh60Var.a()).c()) != null) {
                        String str4 = (String) ((LackOfMoneyNotificationDto) xh60Var.a()).getB().get(c2.getA());
                        if (str4 == null || evu0.J(str4) || evu0.J(c.getB()) || c.getA() <= 0.0d) {
                            jst.e.getClass();
                            return null;
                        }
                        BigDecimal bigDecimal = new BigDecimal(c.getA());
                        String b = c.getB();
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$0 = str;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$1 = mv51Var;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$2 = null;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$3 = null;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$4 = c2;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$5 = c;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$6 = null;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.L$7 = null;
                        taxiOrderMoneyLackIntentInteractor$getNotification$1.label = 1;
                        Object b2 = this.a.b(str2, bigDecimal, b, taxiOrderMoneyLackIntentInteractor$getNotification$1);
                        if (b2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mv51Var2 = mv51Var;
                        informer = c2;
                        obj = b2;
                        str3 = str;
                        requiredCardBalance = c;
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                requiredCardBalance = (LackOfMoneyNotificationDto.RequiredCardBalance) taxiOrderMoneyLackIntentInteractor$getNotification$1.L$5;
                informer = (LackOfMoneyNotificationDto.Informer) taxiOrderMoneyLackIntentInteractor$getNotification$1.L$4;
                mv51Var2 = (mv51) taxiOrderMoneyLackIntentInteractor$getNotification$1.L$1;
                str3 = (String) taxiOrderMoneyLackIntentInteractor$getNotification$1.L$0;
                kotlin.b.b(obj);
                qv51Var = (qv51) obj;
                hst hstVar = jst.e;
                Objects.toString(qv51Var);
                hstVar.getClass();
                if ((qv51Var instanceof pv51) && ((pv51) qv51Var).a() == YbSdkCheckPaymentCondition.TOPUP) {
                    if (informer.getE()) {
                        BigDecimal a = mv51Var2.a();
                        String b3 = mv51Var2.b();
                        BigDecimal subtract = BigDecimal.valueOf(requiredCardBalance.getA()).subtract(a);
                        if (subtract.compareTo(BigDecimal.ZERO) > 0) {
                            zv51Var = new zv51(b3, subtract);
                        }
                    }
                    ((a630) this.d.get()).b(str3);
                    return new aw51(zv51Var, YbScreenSource.OVERDRAFT_INFORMER);
                }
                return null;
            }
        }
        taxiOrderMoneyLackIntentInteractor$getNotification$1 = new TaxiOrderMoneyLackIntentInteractor$getNotification$1(this, continuationImpl);
        Object obj2 = taxiOrderMoneyLackIntentInteractor$getNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderMoneyLackIntentInteractor$getNotification$1.label;
        zv51Var = null;
        if (i != 0) {
        }
        qv51Var = (qv51) obj2;
        hst hstVar2 = jst.e;
        Objects.toString(qv51Var);
        hstVar2.getClass();
        if (qv51Var instanceof pv51) {
            if (informer.getE()) {
            }
            ((a630) this.d.get()).b(str3);
            return new aw51(zv51Var, YbScreenSource.OVERDRAFT_INFORMER);
        }
        return null;
    }
}
