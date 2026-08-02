package com.yandex.go.payments.sbp.domain;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import com.yandex.go.payments.experiments.i;
import defpackage.a60;
import defpackage.b4a0;
import defpackage.evu0;
import defpackage.hga0;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.lz60;
import defpackage.n20;
import defpackage.nud;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.oyr;
import defpackage.pux0;
import defpackage.qyz;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.v770;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class b implements lz60 {
    public final Lifecycle a;
    public final tse b;
    public final tt2 c;
    public final qyz d;
    public final com.yandex.go.payments.sbp.data.e e;
    public final ycq0 f;
    public final hga0 g;
    public final n20 h;
    public final y50 i;
    public final o3h j;
    public final i k;
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public b(Lifecycle lifecycle, tse tseVar, tt2 tt2Var, qyz qyzVar, com.yandex.go.payments.sbp.data.e eVar, ycq0 ycq0Var, hga0 hga0Var, n20 n20Var, y50 y50Var, o3h o3hVar, i iVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = qyzVar;
        this.e = eVar;
        this.f = ycq0Var;
        this.g = hga0Var;
        this.h = n20Var;
        this.i = y50Var;
        this.j = o3hVar;
        this.k = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (r8.i(r11) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r1) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        if (ru.yandex.taxi.lifecycle.c.e(r11, r5, r1) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
    
        if (r11 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013a, code lost:
    
        if (r0.c(r1) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
    
        if (r11 == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0114 -> B:29:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, String str, String str2, ContinuationImpl continuationImpl) {
        PaymentsBindingStatusController$pollBindingStatus$1 paymentsBindingStatusController$pollBindingStatus$1;
        nud nudVar;
        String str3;
        Long l;
        nud nudVar2;
        com.yandex.go.payments.sbp.data.e eVar = bVar.e;
        if (continuationImpl instanceof PaymentsBindingStatusController$pollBindingStatus$1) {
            paymentsBindingStatusController$pollBindingStatus$1 = (PaymentsBindingStatusController$pollBindingStatus$1) continuationImpl;
            int i = paymentsBindingStatusController$pollBindingStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentsBindingStatusController$pollBindingStatus$1.label = i - Integer.MIN_VALUE;
                Object obj = paymentsBindingStatusController$pollBindingStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (paymentsBindingStatusController$pollBindingStatus$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        paymentsBindingStatusController$pollBindingStatus$1.L$0 = str;
                        paymentsBindingStatusController$pollBindingStatus$1.L$1 = str2;
                        paymentsBindingStatusController$pollBindingStatus$1.label = 1;
                        obj = eVar.b(str, str2, paymentsBindingStatusController$pollBindingStatus$1);
                        break;
                    case 1:
                        str2 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$1;
                        str = (String) paymentsBindingStatusController$pollBindingStatus$1.L$0;
                        kotlin.b.b(obj);
                        nudVar = (nud) obj;
                        if (nudVar.e() && !bVar.i(nudVar)) {
                            Long c = nudVar.c();
                            if (c != null) {
                                str3 = str;
                                l = c;
                                if (nudVar.d() == PaymentMethodBindingStatusResponse.BindingStatus.PROCESSING && nudVar.e()) {
                                    long longValue = l.longValue();
                                    paymentsBindingStatusController$pollBindingStatus$1.L$0 = str3;
                                    paymentsBindingStatusController$pollBindingStatus$1.L$1 = str2;
                                    paymentsBindingStatusController$pollBindingStatus$1.L$2 = null;
                                    paymentsBindingStatusController$pollBindingStatus$1.L$3 = l;
                                    paymentsBindingStatusController$pollBindingStatus$1.label = 2;
                                    break;
                                }
                            }
                            nudVar2 = nudVar;
                            bVar.d.a.a();
                            paymentsBindingStatusController$pollBindingStatus$1.L$0 = null;
                            paymentsBindingStatusController$pollBindingStatus$1.L$1 = str2;
                            paymentsBindingStatusController$pollBindingStatus$1.L$2 = nudVar2;
                            paymentsBindingStatusController$pollBindingStatus$1.L$3 = null;
                            paymentsBindingStatusController$pollBindingStatus$1.label = 5;
                            break;
                        }
                        return zy11.a;
                    case 2:
                        l = (Long) paymentsBindingStatusController$pollBindingStatus$1.L$3;
                        str2 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$1;
                        str3 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$0;
                        kotlin.b.b(obj);
                        Lifecycle lifecycle = bVar.a;
                        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                        paymentsBindingStatusController$pollBindingStatus$1.L$0 = str3;
                        paymentsBindingStatusController$pollBindingStatus$1.L$1 = str2;
                        paymentsBindingStatusController$pollBindingStatus$1.L$2 = null;
                        paymentsBindingStatusController$pollBindingStatus$1.L$3 = l;
                        paymentsBindingStatusController$pollBindingStatus$1.label = 3;
                        break;
                    case 3:
                        l = (Long) paymentsBindingStatusController$pollBindingStatus$1.L$3;
                        str2 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$1;
                        str3 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$0;
                        kotlin.b.b(obj);
                        paymentsBindingStatusController$pollBindingStatus$1.L$0 = str3;
                        paymentsBindingStatusController$pollBindingStatus$1.L$1 = str2;
                        paymentsBindingStatusController$pollBindingStatus$1.L$2 = null;
                        paymentsBindingStatusController$pollBindingStatus$1.L$3 = l;
                        paymentsBindingStatusController$pollBindingStatus$1.label = 4;
                        obj = eVar.b(str3, str2, paymentsBindingStatusController$pollBindingStatus$1);
                        break;
                    case 4:
                        l = (Long) paymentsBindingStatusController$pollBindingStatus$1.L$3;
                        str2 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$1;
                        str3 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$0;
                        kotlin.b.b(obj);
                        nudVar = (nud) obj;
                        break;
                    case 5:
                        nudVar2 = (nud) paymentsBindingStatusController$pollBindingStatus$1.L$2;
                        str2 = (String) paymentsBindingStatusController$pollBindingStatus$1.L$1;
                        kotlin.b.b(obj);
                        String b = nudVar2.b();
                        if (b != null && nudVar2.d() == PaymentMethodBindingStatusResponse.BindingStatus.SUCCESS) {
                            PaymentMethod$Type.Companion.getClass();
                            PaymentMethod$Type a = b4a0.a(str2);
                            if (a != null) {
                                if (evu0.J(eVar.d.d)) {
                                    ycq0 ycq0Var = bVar.f;
                                    lv90.Companion.getClass();
                                    ycq0Var.b(kv90.b(b, a));
                                } else {
                                    eVar.d.f.set(new Pair(b, a));
                                }
                            }
                        }
                        paymentsBindingStatusController$pollBindingStatus$1.L$0 = null;
                        paymentsBindingStatusController$pollBindingStatus$1.L$1 = null;
                        paymentsBindingStatusController$pollBindingStatus$1.L$2 = null;
                        paymentsBindingStatusController$pollBindingStatus$1.L$3 = null;
                        paymentsBindingStatusController$pollBindingStatus$1.label = 6;
                        Object j = bVar.j(nudVar2, str2, paymentsBindingStatusController$pollBindingStatus$1);
                        return j == obj2 ? obj2 : j;
                    case 6:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        paymentsBindingStatusController$pollBindingStatus$1 = new PaymentsBindingStatusController$pollBindingStatus$1(bVar, continuationImpl);
        Object obj3 = paymentsBindingStatusController$pollBindingStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (paymentsBindingStatusController$pollBindingStatus$1.label) {
        }
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.b, null, null, new PaymentsBindingStatusController$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PaymentsBindingStatusController";
    }

    public final boolean i(nud nudVar) {
        String a = nudVar.a();
        if (nudVar.d() != PaymentMethodBindingStatusResponse.BindingStatus.PROCESSING || a == null || evu0.J(a)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a));
            intent.setFlags(SelfTester_JCP.IMITA);
            ((a60) this.i).b(intent);
            return true;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r2 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(nud nudVar, String str, ContinuationImpl continuationImpl) {
        PaymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1 paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1;
        int i;
        String b;
        PaymentMethod$Type a;
        Object a2;
        String str2;
        String str3;
        if (continuationImpl instanceof PaymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1) {
            paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1 = (PaymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1) continuationImpl;
            int i2 = paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b = nudVar.b();
                    if (b != null && nudVar.d() == PaymentMethodBindingStatusResponse.BindingStatus.SUCCESS) {
                        PaymentMethod$Type.Companion.getClass();
                        a = b4a0.a(str);
                        if (a != null) {
                            paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$0 = null;
                            paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$1 = str;
                            paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$2 = b;
                            paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$3 = a;
                            paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.label = 1;
                            a2 = this.k.a(a, paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1);
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (PaymentMethod$Type) paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$3;
                    str3 = (String) paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$2;
                    str2 = (String) paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$1;
                    kotlin.b.b(obj);
                    if (kotlin.collections.a.u0((List) obj) != null) {
                        lv90.Companion.getClass();
                        this.g.a.set(kv90.b(str3, a));
                        ((pux0) this.j).getClass();
                        ((a60) this.i).c(oyr.q(pux0.c, "://paymentmethods?payment_type=", str2, "&payment_id=", str3), v770.c);
                    }
                    return zy11Var;
                }
                a = (PaymentMethod$Type) paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$3;
                String str4 = (String) paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$2;
                String str5 = (String) paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$1;
                kotlin.b.b(obj);
                b = str4;
                str = str5;
                a2 = obj;
                if (((Boolean) a2).booleanValue()) {
                    paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$0 = null;
                    paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$1 = str;
                    paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$2 = b;
                    paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.L$3 = a;
                    paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.label = 2;
                    Object k = ((com.yandex.go.taxi.order.provider.a) this.h).k(paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1);
                    if (k != coroutineSingletons) {
                        str2 = str;
                        str3 = b;
                        obj = k;
                        if (kotlin.collections.a.u0((List) obj) != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1 = new PaymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1(this, continuationImpl);
        Object obj2 = paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsBindingStatusController$openPaymentScreenIfHasActiveOrder$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) a2).booleanValue()) {
        }
        return zy11Var2;
    }
}
