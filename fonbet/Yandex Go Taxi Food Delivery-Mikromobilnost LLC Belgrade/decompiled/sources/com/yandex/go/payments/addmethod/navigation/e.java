package com.yandex.go.payments.addmethod.navigation;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusRequest;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import com.yandex.go.payments.addmethod.data.model.m0;
import com.yandex.go.payments.data.model.response.ApiError;
import defpackage.a60;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.cma1;
import defpackage.cmt;
import defpackage.d4;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.g9a0;
import defpackage.gk0;
import defpackage.h55;
import defpackage.hga0;
import defpackage.hk0;
import defpackage.i3y;
import defpackage.ik0;
import defpackage.kv90;
import defpackage.kyh0;
import defpackage.lv90;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.oyr;
import defpackage.p0;
import defpackage.pux0;
import defpackage.qu;
import defpackage.r1e0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uh0;
import defpackage.v770;
import defpackage.w511;
import defpackage.wi0;
import defpackage.wnt;
import defpackage.wwg;
import defpackage.xe91;
import defpackage.xnt;
import defpackage.y50;
import defpackage.zuj0;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes13.dex */
public abstract class e extends h55 {
    public final ik0 D;
    public final i3y E;

    public e(ik0 ik0Var) {
        super(null);
        this.D = ik0Var;
        this.E = kotlin.a.a(new d4(15, this));
    }

    public static final String P(e eVar, Throwable th) {
        eVar.getClass();
        if (!(th instanceof GoApiHttpException) || ((GoApiHttpException) th).getCode() != 422) {
            return null;
        }
        try {
            BufferedInputStream body = ((GoApiHttpException) th).getBody();
            if (body == null) {
                return null;
            }
            String x0 = cma1.x0(new BufferedReader(new InputStreamReader(body, Charset.defaultCharset()), 8192));
            String str = ((ApiError) ((xnt) ((wnt) eVar.D.b)).c(x0, ApiError.Companion.serializer())).b;
            if (evu0.J(str)) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ed, code lost:
    
        if (r7 == r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020e, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r3) == r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027e, code lost:
    
        if (kotlinx.coroutines.a.i(2000, r3) == r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x025f, code lost:
    
        r5 = r11;
        r1 = r13;
        r11 = r3;
        r3 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(e eVar, String str, uh0 uh0Var, tls tlsVar, tls tlsVar2, ContinuationImpl continuationImpl) {
        AddWalletBindingBaseRouter$pollBindingStatus$1 addWalletBindingBaseRouter$pollBindingStatus$1;
        int i;
        String str2;
        tls tlsVar3;
        tls tlsVar4;
        AddWalletBindingBaseRouter$pollBindingStatus$1 addWalletBindingBaseRouter$pollBindingStatus$12;
        uh0 uh0Var2;
        PaymentMethod$Type paymentMethod$Type;
        tls tlsVar5;
        uh0 uh0Var3;
        String str3;
        Object obj;
        int i2;
        String h;
        Object b;
        ik0 ik0Var = eVar.D;
        if (continuationImpl instanceof AddWalletBindingBaseRouter$pollBindingStatus$1) {
            addWalletBindingBaseRouter$pollBindingStatus$1 = (AddWalletBindingBaseRouter$pollBindingStatus$1) continuationImpl;
            int i3 = addWalletBindingBaseRouter$pollBindingStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                addWalletBindingBaseRouter$pollBindingStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = addWalletBindingBaseRouter$pollBindingStatus$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addWalletBindingBaseRouter$pollBindingStatus$1.label;
                Object obj4 = zy11.a;
                tls tlsVar6 = null;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        str2 = str;
                        tlsVar3 = tlsVar;
                        tlsVar4 = tlsVar2;
                        addWalletBindingBaseRouter$pollBindingStatus$12 = addWalletBindingBaseRouter$pollBindingStatus$1;
                        uh0Var2 = uh0Var;
                        PaymentMethod$Type U = eVar.U();
                        String code = U.getCode();
                        hk0 hk0Var = (hk0) eVar.x;
                        cmt<PaymentMethodBindingStatusResponse> b2 = ((BindUniversalPaymentMethodApi) ik0Var.k).b(new PaymentMethodBindingStatusRequest(str2, code, hk0Var != null ? hk0Var.getService() : tlsVar6, "binding_home"));
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$0 = str2;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$1 = uh0Var2;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$2 = tlsVar3;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$3 = tlsVar4;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$4 = U;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$5 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$6 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$7 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$8 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.label = 1;
                        b = ru.yandex.taxi.network.api.a.b(b2, tlsVar6, addWalletBindingBaseRouter$pollBindingStatus$12);
                        if (b != obj3) {
                            uh0Var3 = uh0Var2;
                            addWalletBindingBaseRouter$pollBindingStatus$1 = addWalletBindingBaseRouter$pollBindingStatus$12;
                            tlsVar5 = tlsVar3;
                            paymentMethod$Type = U;
                            str3 = str2;
                            obj2 = b;
                            fmt fmtVar = (fmt) obj2;
                            r1e0 n = wwg.n(fmtVar);
                            Long l = n == null ? n.b : tlsVar6;
                            PaymentMethodBindingStatusResponse paymentMethodBindingStatusResponse = (PaymentMethodBindingStatusResponse) fmtVar.a;
                            i2 = gk0.a[paymentMethodBindingStatusResponse.a.ordinal()];
                            Object obj5 = tlsVar6;
                            if (i2 == 1) {
                                g9a0 g9a0Var = (g9a0) ik0Var.i;
                                hk0 hk0Var2 = (hk0) eVar.x;
                                String screen = hk0Var2 != null ? hk0Var2.getScreen() : null;
                                g9a0Var.c(xe91.i(screen != null ? screen : ""), paymentMethod$Type.getCode(), "success");
                                String str4 = paymentMethodBindingStatusResponse.b;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$0 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$1 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$2 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$3 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$4 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$5 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$6 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$7 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.L$8 = null;
                                addWalletBindingBaseRouter$pollBindingStatus$1.label = 2;
                                if (eVar.S(str4, addWalletBindingBaseRouter$pollBindingStatus$1) != obj3) {
                                    return obj4;
                                }
                            } else if (i2 == 2) {
                                m0 m0Var = paymentMethodBindingStatusResponse.c;
                                if (m0Var instanceof PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction) {
                                    String str5 = ((PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction) m0Var).b;
                                    if (!evu0.J(str5)) {
                                        if (tlsVar5 != null) {
                                            tlsVar5.invoke(str5);
                                            return obj4;
                                        }
                                        eVar.T(str5);
                                        return obj4;
                                    }
                                }
                                if (l == 0) {
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$0 = str3;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$1 = uh0Var3;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$2 = tlsVar5;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$3 = tlsVar4;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$4 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$5 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$6 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$7 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$8 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.label = 6;
                                    break;
                                } else {
                                    long longValue = l.longValue();
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$0 = str3;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$1 = uh0Var3;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$2 = tlsVar5;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$3 = tlsVar4;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$4 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$5 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$6 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$7 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$8 = null;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.label = 5;
                                    if (kotlinx.coroutines.a.i(longValue, addWalletBindingBaseRouter$pollBindingStatus$1) != obj3) {
                                        tlsVar3 = tlsVar5;
                                        str2 = str3;
                                        addWalletBindingBaseRouter$pollBindingStatus$12 = addWalletBindingBaseRouter$pollBindingStatus$1;
                                        uh0Var2 = uh0Var3;
                                        tlsVar6 = null;
                                    }
                                }
                                PaymentMethod$Type U2 = eVar.U();
                                String code2 = U2.getCode();
                                hk0 hk0Var3 = (hk0) eVar.x;
                                cmt<PaymentMethodBindingStatusResponse> b22 = ((BindUniversalPaymentMethodApi) ik0Var.k).b(new PaymentMethodBindingStatusRequest(str2, code2, hk0Var3 != null ? hk0Var3.getService() : tlsVar6, "binding_home"));
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$0 = str2;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$1 = uh0Var2;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$2 = tlsVar3;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$3 = tlsVar4;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$4 = U2;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$5 = tlsVar6;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$6 = tlsVar6;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$7 = tlsVar6;
                                addWalletBindingBaseRouter$pollBindingStatus$12.L$8 = tlsVar6;
                                addWalletBindingBaseRouter$pollBindingStatus$12.label = 1;
                                b = ru.yandex.taxi.network.api.a.b(b22, tlsVar6, addWalletBindingBaseRouter$pollBindingStatus$12);
                                if (b != obj3) {
                                }
                            } else {
                                if (i2 != 3 && i2 != 4) {
                                    w511.b();
                                    return obj5;
                                }
                                g9a0 g9a0Var2 = (g9a0) ik0Var.i;
                                zuj0 zuj0Var = (zuj0) ik0Var.d;
                                hk0 hk0Var4 = (hk0) eVar.x;
                                Object screen2 = hk0Var4 != null ? hk0Var4.getScreen() : obj5;
                                g9a0Var2.c(xe91.i(screen2 != null ? screen2 : ""), paymentMethod$Type.getCode(), "fail");
                                if (tlsVar4 == null) {
                                    if (uh0Var3 == null || (h = uh0Var3.b) == null) {
                                        h = ((avj0) zuj0Var).h(kyh0.add_payment_method_preparing_failed_text);
                                    }
                                    wi0 wi0Var = (wi0) ik0Var.j;
                                    ai0 ai0Var = new ai0(h, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                                    obj = obj5;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$0 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$1 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$2 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$3 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$4 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$5 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$6 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$7 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$8 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.L$9 = obj;
                                    addWalletBindingBaseRouter$pollBindingStatus$1.label = 3;
                                    wi0Var.a(ai0Var, addWalletBindingBaseRouter$pollBindingStatus$1);
                                    break;
                                } else {
                                    String str6 = paymentMethodBindingStatusResponse.d;
                                    if (str6 == null) {
                                        str6 = ((avj0) zuj0Var).h(kyh0.add_payment_method_preparing_failed_text);
                                    }
                                    tlsVar4.invoke(str6);
                                    return obj4;
                                }
                            }
                        }
                        return obj3;
                    case 1:
                        paymentMethod$Type = (PaymentMethod$Type) addWalletBindingBaseRouter$pollBindingStatus$1.L$4;
                        tlsVar4 = (tls) addWalletBindingBaseRouter$pollBindingStatus$1.L$3;
                        tlsVar5 = (tls) addWalletBindingBaseRouter$pollBindingStatus$1.L$2;
                        uh0Var3 = (uh0) addWalletBindingBaseRouter$pollBindingStatus$1.L$1;
                        str3 = (String) addWalletBindingBaseRouter$pollBindingStatus$1.L$0;
                        kotlin.b.b(obj2);
                        fmt fmtVar2 = (fmt) obj2;
                        r1e0 n2 = wwg.n(fmtVar2);
                        if (n2 == null) {
                        }
                        PaymentMethodBindingStatusResponse paymentMethodBindingStatusResponse2 = (PaymentMethodBindingStatusResponse) fmtVar2.a;
                        i2 = gk0.a[paymentMethodBindingStatusResponse2.a.ordinal()];
                        Object obj52 = tlsVar6;
                        if (i2 == 1) {
                        }
                        return obj3;
                    case 2:
                        kotlin.b.b(obj2);
                        return obj4;
                    case 3:
                        kotlin.b.b(obj2);
                        obj = null;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$0 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$1 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$2 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$3 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$4 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$5 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$6 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$7 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$8 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.L$9 = obj;
                        addWalletBindingBaseRouter$pollBindingStatus$1.label = 4;
                        break;
                    case 4:
                        kotlin.b.b(obj2);
                        eVar.r(new qu(9));
                        return obj4;
                    case 5:
                    case 6:
                        tls tlsVar7 = (tls) addWalletBindingBaseRouter$pollBindingStatus$1.L$3;
                        tls tlsVar8 = (tls) addWalletBindingBaseRouter$pollBindingStatus$1.L$2;
                        uh0 uh0Var4 = (uh0) addWalletBindingBaseRouter$pollBindingStatus$1.L$1;
                        String str7 = (String) addWalletBindingBaseRouter$pollBindingStatus$1.L$0;
                        kotlin.b.b(obj2);
                        addWalletBindingBaseRouter$pollBindingStatus$12 = addWalletBindingBaseRouter$pollBindingStatus$1;
                        uh0Var2 = uh0Var4;
                        tlsVar4 = tlsVar7;
                        tlsVar3 = tlsVar8;
                        str2 = str7;
                        tlsVar6 = null;
                        PaymentMethod$Type U22 = eVar.U();
                        String code22 = U22.getCode();
                        hk0 hk0Var32 = (hk0) eVar.x;
                        cmt<PaymentMethodBindingStatusResponse> b222 = ((BindUniversalPaymentMethodApi) ik0Var.k).b(new PaymentMethodBindingStatusRequest(str2, code22, hk0Var32 != null ? hk0Var32.getService() : tlsVar6, "binding_home"));
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$0 = str2;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$1 = uh0Var2;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$2 = tlsVar3;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$3 = tlsVar4;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$4 = U22;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$5 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$6 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$7 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.L$8 = tlsVar6;
                        addWalletBindingBaseRouter$pollBindingStatus$12.label = 1;
                        b = ru.yandex.taxi.network.api.a.b(b222, tlsVar6, addWalletBindingBaseRouter$pollBindingStatus$12);
                        if (b != obj3) {
                        }
                        return obj3;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        addWalletBindingBaseRouter$pollBindingStatus$1 = new AddWalletBindingBaseRouter$pollBindingStatus$1(eVar, continuationImpl);
        Object obj22 = addWalletBindingBaseRouter$pollBindingStatus$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addWalletBindingBaseRouter$pollBindingStatus$1.label;
        Object obj42 = zy11.a;
        tls tlsVar62 = null;
        switch (i) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new AddWalletBindingBaseRouter$onLaunch$1(this, (hk0) obj, null), 3);
    }

    public abstract PaymentMethod$Type R();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(String str, ContinuationImpl continuationImpl) {
        AddWalletBindingBaseRouter$onBindSuccess$1 addWalletBindingBaseRouter$onBindSuccess$1;
        Object obj;
        int i;
        int i2;
        if (continuationImpl instanceof AddWalletBindingBaseRouter$onBindSuccess$1) {
            addWalletBindingBaseRouter$onBindSuccess$1 = (AddWalletBindingBaseRouter$onBindSuccess$1) continuationImpl;
            int i3 = addWalletBindingBaseRouter$onBindSuccess$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                addWalletBindingBaseRouter$onBindSuccess$1.label = i3 - Integer.MIN_VALUE;
                obj = addWalletBindingBaseRouter$onBindSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addWalletBindingBaseRouter$onBindSuccess$1.label;
                ik0 ik0Var = this.D;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = (n20) ik0Var.n;
                    addWalletBindingBaseRouter$onBindSuccess$1.L$0 = str;
                    addWalletBindingBaseRouter$onBindSuccess$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).k(addWalletBindingBaseRouter$onBindSuccess$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) addWalletBindingBaseRouter$onBindSuccess$1.L$0;
                    kotlin.b.b(obj);
                }
                i2 = 9;
                if (kotlin.collections.a.u0((List) obj) != null || str == null) {
                    r(new qu(i2));
                } else {
                    PaymentMethod$Type U = U();
                    lv90.Companion.getClass();
                    ((hga0) ik0Var.o).a.set(kv90.b(str, U));
                    r(new qu(i2));
                    ((pux0) ((o3h) ik0Var.p)).getClass();
                    String str2 = pux0.c;
                    ((a60) ((y50) ik0Var.c)).c(oyr.q(str2, "://paymentmethods?payment_type=", U.getCode(), "&payment_id=", str), v770.c);
                }
                return zy11.a;
            }
        }
        addWalletBindingBaseRouter$onBindSuccess$1 = new AddWalletBindingBaseRouter$onBindSuccess$1(this, continuationImpl);
        obj = addWalletBindingBaseRouter$onBindSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addWalletBindingBaseRouter$onBindSuccess$1.label;
        ik0 ik0Var2 = this.D;
        if (i != 0) {
        }
        i2 = 9;
        if (kotlin.collections.a.u0((List) obj) != null) {
        }
        r(new qu(i2));
        return zy11.a;
    }

    public final void T(String str) {
        if (evu0.J(str)) {
            return;
        }
        ik0 ik0Var = this.D;
        g9a0 g9a0Var = (g9a0) ik0Var.i;
        hk0 hk0Var = (hk0) this.x;
        String screen = hk0Var != null ? hk0Var.getScreen() : null;
        if (screen == null) {
            screen = "";
        }
        g9a0Var.c(xe91.i(screen), U().getCode(), "success");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(SelfTester_JCP.IMITA);
        if (intent.resolveActivity(((Context) ik0Var.a).getPackageManager()) == null) {
            throw new ActivityNotFoundException("No app found for ".concat(str));
        }
        ((a60) ((y50) ik0Var.c)).b(intent);
        r(new p0(27));
    }

    public final PaymentMethod$Type U() {
        PaymentMethod$Type a;
        hk0 hk0Var = (hk0) this.x;
        return (hk0Var == null || (a = hk0Var.a()) == null) ? R() : a;
    }
}
