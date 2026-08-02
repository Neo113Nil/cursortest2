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
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.a60;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.cma1;
import defpackage.cmt;
import defpackage.d4;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.g8e;
import defpackage.g9a0;
import defpackage.gf41;
import defpackage.h55;
import defpackage.hd0;
import defpackage.hg0;
import defpackage.hga0;
import defpackage.i3y;
import defpackage.jd0;
import defpackage.kv90;
import defpackage.kyh0;
import defpackage.lv90;
import defpackage.m950;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.p0;
import defpackage.po21;
import defpackage.pux0;
import defpackage.qu;
import defpackage.r1e0;
import defpackage.raa0;
import defpackage.sy60;
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
import defpackage.yvf0;
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
public final class c extends h55 {
    public final Context D;
    public final wnt E;
    public final y50 F;
    public final zuj0 G;
    public final po21 H;
    public final gf41 I;
    public final yvf0 J;
    public final i K;
    public final g9a0 L;
    public final wi0 M;
    public final BindUniversalPaymentMethodApi N;
    public final raa0 O;
    public final hg0 P;
    public final n20 Q;
    public final hga0 R;
    public final o3h S;
    public final i3y T;

    public c(Context context, wnt wntVar, y50 y50Var, zuj0 zuj0Var, po21 po21Var, gf41 gf41Var, yvf0 yvf0Var, i iVar, g9a0 g9a0Var, wi0 wi0Var, BindUniversalPaymentMethodApi bindUniversalPaymentMethodApi, raa0 raa0Var, hg0 hg0Var, n20 n20Var, hga0 hga0Var, o3h o3hVar) {
        super(null);
        this.D = context;
        this.E = wntVar;
        this.F = y50Var;
        this.G = zuj0Var;
        this.H = po21Var;
        this.I = gf41Var;
        this.J = yvf0Var;
        this.K = iVar;
        this.L = g9a0Var;
        this.M = wi0Var;
        this.N = bindUniversalPaymentMethodApi;
        this.O = raa0Var;
        this.P = hg0Var;
        this.Q = n20Var;
        this.R = hga0Var;
        this.S = o3hVar;
        this.T = kotlin.a.a(new d4(11, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d0, code lost:
    
        if (r11 == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ef, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r4) == r5) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0240 -> B:14:0x024a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(c cVar, String str, uh0 uh0Var, tls tlsVar, tls tlsVar2, ContinuationImpl continuationImpl) {
        AddFastshiftAccountBaseRouter$pollBindingStatus$1 addFastshiftAccountBaseRouter$pollBindingStatus$1;
        int i;
        String str2;
        tls tlsVar3;
        tls tlsVar4;
        AddFastshiftAccountBaseRouter$pollBindingStatus$1 addFastshiftAccountBaseRouter$pollBindingStatus$12;
        uh0 uh0Var2;
        String str3;
        uh0 uh0Var3;
        tls tlsVar5;
        tls tlsVar6;
        int i2;
        String h;
        Object b;
        zuj0 zuj0Var = cVar.G;
        g9a0 g9a0Var = cVar.L;
        if (continuationImpl instanceof AddFastshiftAccountBaseRouter$pollBindingStatus$1) {
            addFastshiftAccountBaseRouter$pollBindingStatus$1 = (AddFastshiftAccountBaseRouter$pollBindingStatus$1) continuationImpl;
            int i3 = addFastshiftAccountBaseRouter$pollBindingStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                addFastshiftAccountBaseRouter$pollBindingStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = addFastshiftAccountBaseRouter$pollBindingStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFastshiftAccountBaseRouter$pollBindingStatus$1.label;
                Object obj3 = zy11.a;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str2 = str;
                    tlsVar3 = tlsVar;
                    tlsVar4 = tlsVar2;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12 = addFastshiftAccountBaseRouter$pollBindingStatus$1;
                    uh0Var2 = uh0Var;
                    String code = PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode();
                    jd0 jd0Var = (jd0) cVar.x;
                    cmt<PaymentMethodBindingStatusResponse> b2 = cVar.N.b(new PaymentMethodBindingStatusRequest(str2, code, jd0Var != null ? jd0Var.b : null, "binding_home"));
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$0 = str2;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$1 = uh0Var2;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$2 = tlsVar3;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$3 = tlsVar4;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$4 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$5 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$6 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$7 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.label = i4;
                    b = ru.yandex.taxi.network.api.a.b(b2, null, addFastshiftAccountBaseRouter$pollBindingStatus$12);
                    if (b != obj2) {
                    }
                    return obj2;
                }
                if (i == 1) {
                    tlsVar6 = (tls) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$3;
                    tlsVar5 = (tls) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$2;
                    uh0Var3 = (uh0) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$1;
                    str3 = (String) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$0;
                    kotlin.b.b(obj);
                    fmt fmtVar = (fmt) obj;
                    r1e0 n = wwg.n(fmtVar);
                    if (n == null) {
                    }
                    PaymentMethodBindingStatusResponse paymentMethodBindingStatusResponse = (PaymentMethodBindingStatusResponse) fmtVar.a;
                    i2 = hd0.a[paymentMethodBindingStatusResponse.a.ordinal()];
                    if (i2 == i4) {
                    }
                    return obj2;
                }
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj3;
                }
                if (i != 3) {
                    if (i == 4) {
                        kotlin.b.b(obj);
                        cVar.r(new qu(9));
                        return obj3;
                    }
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tls tlsVar7 = (tls) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$3;
                    tls tlsVar8 = (tls) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$2;
                    uh0 uh0Var4 = (uh0) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$1;
                    String str4 = (String) addFastshiftAccountBaseRouter$pollBindingStatus$1.L$0;
                    kotlin.b.b(obj);
                    addFastshiftAccountBaseRouter$pollBindingStatus$12 = addFastshiftAccountBaseRouter$pollBindingStatus$1;
                    uh0Var2 = uh0Var4;
                    str3 = str4;
                    tlsVar4 = tlsVar7;
                    tlsVar3 = tlsVar8;
                    char c = 3;
                    str2 = str3;
                    i4 = 1;
                    String code2 = PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode();
                    jd0 jd0Var2 = (jd0) cVar.x;
                    cmt<PaymentMethodBindingStatusResponse> b22 = cVar.N.b(new PaymentMethodBindingStatusRequest(str2, code2, jd0Var2 != null ? jd0Var2.b : null, "binding_home"));
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$0 = str2;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$1 = uh0Var2;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$2 = tlsVar3;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$3 = tlsVar4;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$4 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$5 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$6 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.L$7 = null;
                    addFastshiftAccountBaseRouter$pollBindingStatus$12.label = i4;
                    b = ru.yandex.taxi.network.api.a.b(b22, null, addFastshiftAccountBaseRouter$pollBindingStatus$12);
                    if (b != obj2) {
                        AddFastshiftAccountBaseRouter$pollBindingStatus$1 addFastshiftAccountBaseRouter$pollBindingStatus$13 = addFastshiftAccountBaseRouter$pollBindingStatus$12;
                        uh0Var3 = uh0Var2;
                        addFastshiftAccountBaseRouter$pollBindingStatus$1 = addFastshiftAccountBaseRouter$pollBindingStatus$13;
                        tls tlsVar9 = tlsVar4;
                        tlsVar5 = tlsVar3;
                        tlsVar6 = tlsVar9;
                        str3 = str2;
                        obj = b;
                        fmt fmtVar2 = (fmt) obj;
                        r1e0 n2 = wwg.n(fmtVar2);
                        Long l = n2 == null ? n2.b : null;
                        PaymentMethodBindingStatusResponse paymentMethodBindingStatusResponse2 = (PaymentMethodBindingStatusResponse) fmtVar2.a;
                        i2 = hd0.a[paymentMethodBindingStatusResponse2.a.ordinal()];
                        if (i2 == i4) {
                            jd0 jd0Var3 = (jd0) cVar.x;
                            String str5 = jd0Var3 != null ? jd0Var3.a : null;
                            g9a0Var.c(xe91.i(str5 != null ? str5 : ""), PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode(), "success");
                            String str6 = paymentMethodBindingStatusResponse2.b;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$0 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$1 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$2 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$3 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$4 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$5 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$6 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$7 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.label = 2;
                            if (cVar.U(str6, addFastshiftAccountBaseRouter$pollBindingStatus$1) != obj2) {
                                return obj3;
                            }
                        } else if (i2 == 2) {
                            c = 3;
                            m0 m0Var = paymentMethodBindingStatusResponse2.c;
                            if (m0Var instanceof PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction) {
                                String str7 = ((PaymentMethodBindingStatusResponse.AsyncApplicationUserInteraction) m0Var).b;
                                if (!evu0.J(str7)) {
                                    if (tlsVar5 != null) {
                                        tlsVar5.invoke(str7);
                                        return obj3;
                                    }
                                    cVar.V(str7);
                                    return obj3;
                                }
                            }
                            long longValue = l != null ? l.longValue() : 2000L;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$0 = str3;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$1 = uh0Var3;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$2 = tlsVar5;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$3 = tlsVar6;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$4 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$5 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$6 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$7 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.label = 5;
                            if (kotlinx.coroutines.a.i(longValue, addFastshiftAccountBaseRouter$pollBindingStatus$1) != obj2) {
                                uh0 uh0Var5 = uh0Var3;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12 = addFastshiftAccountBaseRouter$pollBindingStatus$1;
                                uh0Var2 = uh0Var5;
                                tls tlsVar10 = tlsVar5;
                                tlsVar4 = tlsVar6;
                                tlsVar3 = tlsVar10;
                                str2 = str3;
                                i4 = 1;
                                String code22 = PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode();
                                jd0 jd0Var22 = (jd0) cVar.x;
                                cmt<PaymentMethodBindingStatusResponse> b222 = cVar.N.b(new PaymentMethodBindingStatusRequest(str2, code22, jd0Var22 != null ? jd0Var22.b : null, "binding_home"));
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$0 = str2;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$1 = uh0Var2;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$2 = tlsVar3;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$3 = tlsVar4;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$4 = null;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$5 = null;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$6 = null;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.L$7 = null;
                                addFastshiftAccountBaseRouter$pollBindingStatus$12.label = i4;
                                b = ru.yandex.taxi.network.api.a.b(b222, null, addFastshiftAccountBaseRouter$pollBindingStatus$12);
                                if (b != obj2) {
                                }
                            }
                        } else {
                            if (i2 != 3 && i2 != 4) {
                                w511.b();
                                return null;
                            }
                            jd0 jd0Var4 = (jd0) cVar.x;
                            String str8 = jd0Var4 != null ? jd0Var4.a : null;
                            g9a0Var.c(xe91.i(str8 != null ? str8 : ""), PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode(), "fail");
                            if (tlsVar6 != null) {
                                String str9 = paymentMethodBindingStatusResponse2.d;
                                if (str9 == null) {
                                    str9 = ((avj0) zuj0Var).h(kyh0.add_payment_method_preparing_failed_text);
                                }
                                tlsVar6.invoke(str9);
                                return obj3;
                            }
                            if (uh0Var3 == null || (h = uh0Var3.b) == null) {
                                h = ((avj0) zuj0Var).h(kyh0.add_payment_method_preparing_failed_text);
                            }
                            wi0 wi0Var = cVar.M;
                            ai0 ai0Var = new ai0(h, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$0 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$1 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$2 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$3 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$4 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$5 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$6 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$7 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.L$8 = null;
                            addFastshiftAccountBaseRouter$pollBindingStatus$1.label = 3;
                            wi0Var.a(ai0Var, addFastshiftAccountBaseRouter$pollBindingStatus$1);
                        }
                    }
                    return obj2;
                }
                kotlin.b.b(obj);
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$0 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$1 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$2 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$3 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$4 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$5 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$6 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$7 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.L$8 = null;
                addFastshiftAccountBaseRouter$pollBindingStatus$1.label = 4;
            }
        }
        addFastshiftAccountBaseRouter$pollBindingStatus$1 = new AddFastshiftAccountBaseRouter$pollBindingStatus$1(cVar, continuationImpl);
        Object obj4 = addFastshiftAccountBaseRouter$pollBindingStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFastshiftAccountBaseRouter$pollBindingStatus$1.label;
        Object obj32 = zy11.a;
        int i42 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r3 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(c cVar, uh0 uh0Var, Throwable th, ContinuationImpl continuationImpl) {
        AddFastshiftAccountBaseRouter$showSpinnerError$1 addFastshiftAccountBaseRouter$showSpinnerError$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof AddFastshiftAccountBaseRouter$showSpinnerError$1) {
            addFastshiftAccountBaseRouter$showSpinnerError$1 = (AddFastshiftAccountBaseRouter$showSpinnerError$1) continuationImpl;
            int i2 = addFastshiftAccountBaseRouter$showSpinnerError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFastshiftAccountBaseRouter$showSpinnerError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addFastshiftAccountBaseRouter$showSpinnerError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFastshiftAccountBaseRouter$showSpinnerError$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g9a0 g9a0Var = cVar.L;
                    jd0 jd0Var = (jd0) cVar.x;
                    String str = jd0Var != null ? jd0Var.a : null;
                    if (str == null) {
                        str = "";
                    }
                    g9a0Var.c(xe91.i(str), PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode(), "fail");
                    String T = cVar.T(th);
                    if (T == null) {
                        T = uh0Var != null ? uh0Var.b : null;
                        if (T == null) {
                            T = ((avj0) cVar.G).h(kyh0.add_payment_method_preparing_failed_text);
                        }
                    }
                    wi0 wi0Var = cVar.M;
                    ai0 ai0Var = new ai0(T, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
                    addFastshiftAccountBaseRouter$showSpinnerError$1.L$0 = null;
                    addFastshiftAccountBaseRouter$showSpinnerError$1.L$1 = null;
                    addFastshiftAccountBaseRouter$showSpinnerError$1.L$2 = null;
                    addFastshiftAccountBaseRouter$showSpinnerError$1.L$3 = null;
                    addFastshiftAccountBaseRouter$showSpinnerError$1.label = 1;
                    wi0Var.a(ai0Var, addFastshiftAccountBaseRouter$showSpinnerError$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        cVar.r(new qu(9));
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                addFastshiftAccountBaseRouter$showSpinnerError$1.L$0 = null;
                addFastshiftAccountBaseRouter$showSpinnerError$1.L$1 = null;
                addFastshiftAccountBaseRouter$showSpinnerError$1.L$2 = null;
                addFastshiftAccountBaseRouter$showSpinnerError$1.L$3 = null;
                addFastshiftAccountBaseRouter$showSpinnerError$1.label = 2;
            }
        }
        addFastshiftAccountBaseRouter$showSpinnerError$1 = new AddFastshiftAccountBaseRouter$showSpinnerError$1(cVar, continuationImpl);
        Object obj2 = addFastshiftAccountBaseRouter$showSpinnerError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFastshiftAccountBaseRouter$showSpinnerError$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        addFastshiftAccountBaseRouter$showSpinnerError$1.L$0 = null;
        addFastshiftAccountBaseRouter$showSpinnerError$1.L$1 = null;
        addFastshiftAccountBaseRouter$showSpinnerError$1.L$2 = null;
        addFastshiftAccountBaseRouter$showSpinnerError$1.L$3 = null;
        addFastshiftAccountBaseRouter$showSpinnerError$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(c cVar, uh0 uh0Var, ContinuationImpl continuationImpl) {
        AddFastshiftAccountBaseRouter$showSpinnerLoading$1 addFastshiftAccountBaseRouter$showSpinnerLoading$1;
        int i;
        String h;
        cVar.getClass();
        if (continuationImpl instanceof AddFastshiftAccountBaseRouter$showSpinnerLoading$1) {
            addFastshiftAccountBaseRouter$showSpinnerLoading$1 = (AddFastshiftAccountBaseRouter$showSpinnerLoading$1) continuationImpl;
            int i2 = addFastshiftAccountBaseRouter$showSpinnerLoading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFastshiftAccountBaseRouter$showSpinnerLoading$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addFastshiftAccountBaseRouter$showSpinnerLoading$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFastshiftAccountBaseRouter$showSpinnerLoading$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (uh0Var == null || (h = uh0Var.a) == null) {
                        h = ((avj0) cVar.G).h(kyh0.add_payment_method_preparing_loading_text);
                    }
                    wi0 wi0Var = cVar.M;
                    ai0 ai0Var = new ai0(h, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
                    addFastshiftAccountBaseRouter$showSpinnerLoading$1.L$0 = null;
                    addFastshiftAccountBaseRouter$showSpinnerLoading$1.L$1 = null;
                    addFastshiftAccountBaseRouter$showSpinnerLoading$1.label = 1;
                    wi0Var.a(ai0Var, addFastshiftAccountBaseRouter$showSpinnerLoading$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cVar.z((m950) cVar.J.get(), sy60.Q2);
                return zy11Var;
            }
        }
        addFastshiftAccountBaseRouter$showSpinnerLoading$1 = new AddFastshiftAccountBaseRouter$showSpinnerLoading$1(cVar, continuationImpl);
        Object obj2 = addFastshiftAccountBaseRouter$showSpinnerLoading$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFastshiftAccountBaseRouter$showSpinnerLoading$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        cVar.z((m950) cVar.J.get(), sy60.Q2);
        return zy11Var2;
    }

    public static final void S(c cVar, List list, uh0 uh0Var, com.yandex.go.payments.addmethod.ui.home.b bVar, com.yandex.go.payments.addmethod.ui.home.a aVar) {
        cVar.getClass();
        AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1 addFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1 = new AddFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1(cVar, list, bVar, uh0Var, aVar, null);
        if (bVar != null) {
            tje.N(cVar.o(), null, null, new AddFastshiftAccountBaseRouter$startBindFastshiftAccount$1(addFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1, cVar, aVar, null), 3);
        } else {
            tje.N(cVar.o(), null, null, new AddFastshiftAccountBaseRouter$withSpinner$1(cVar, uh0Var, addFastshiftAccountBaseRouter$startBindFastshiftAccount$bindAction$1, null), 3);
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new AddFastshiftAccountBaseRouter$onLaunch$1(this, (jd0) obj, null), 3);
    }

    public final String T(Throwable th) {
        GoApiHttpException goApiHttpException = th instanceof GoApiHttpException ? (GoApiHttpException) th : null;
        if (goApiHttpException != null && goApiHttpException.getCode() == 422) {
            try {
                BufferedInputStream body = goApiHttpException.getBody();
                if (body != null) {
                    String str = ((ApiError) ((xnt) this.E).c(cma1.x0(new BufferedReader(new InputStreamReader(body, Charset.defaultCharset()), 8192)), ApiError.Companion.serializer())).b;
                    if (evu0.J(str)) {
                        return null;
                    }
                    return str;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(String str, ContinuationImpl continuationImpl) {
        AddFastshiftAccountBaseRouter$onBindSuccess$1 addFastshiftAccountBaseRouter$onBindSuccess$1;
        Object obj;
        int i;
        if (continuationImpl instanceof AddFastshiftAccountBaseRouter$onBindSuccess$1) {
            addFastshiftAccountBaseRouter$onBindSuccess$1 = (AddFastshiftAccountBaseRouter$onBindSuccess$1) continuationImpl;
            int i2 = addFastshiftAccountBaseRouter$onBindSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFastshiftAccountBaseRouter$onBindSuccess$1.label = i2 - Integer.MIN_VALUE;
                obj = addFastshiftAccountBaseRouter$onBindSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFastshiftAccountBaseRouter$onBindSuccess$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addFastshiftAccountBaseRouter$onBindSuccess$1.L$0 = str;
                    addFastshiftAccountBaseRouter$onBindSuccess$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.Q).k(addFastshiftAccountBaseRouter$onBindSuccess$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) addFastshiftAccountBaseRouter$onBindSuccess$1.L$0;
                    kotlin.b.b(obj);
                }
                if (kotlin.collections.a.u0((List) obj) != null || str == null) {
                    r(new qu(9));
                } else {
                    kv90 kv90Var = lv90.Companion;
                    PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.FASTSHIFT_ACCOUNT;
                    kv90Var.getClass();
                    this.R.a.set(kv90.b(str, paymentMethod$Type));
                    r(new qu(9));
                    ((pux0) this.S).getClass();
                    ((a60) this.F).c(g8e.p(pux0.c, "://paymentmethods?payment_type=fastshift_account&payment_id=", str), v770.c);
                }
                return zy11.a;
            }
        }
        addFastshiftAccountBaseRouter$onBindSuccess$1 = new AddFastshiftAccountBaseRouter$onBindSuccess$1(this, continuationImpl);
        obj = addFastshiftAccountBaseRouter$onBindSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFastshiftAccountBaseRouter$onBindSuccess$1.label;
        if (i != 0) {
        }
        if (kotlin.collections.a.u0((List) obj) != null) {
        }
        r(new qu(9));
        return zy11.a;
    }

    public final void V(String str) {
        if (evu0.J(str)) {
            return;
        }
        jd0 jd0Var = (jd0) this.x;
        String str2 = jd0Var != null ? jd0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        this.L.c(xe91.i(str2), PaymentMethod$Type.FASTSHIFT_ACCOUNT.getCode(), "success");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(SelfTester_JCP.IMITA);
        if (intent.resolveActivity(this.D.getPackageManager()) == null) {
            throw new ActivityNotFoundException(g8e.o("No app found for ", str));
        }
        ((a60) this.F).b(intent);
        r(new p0(18));
    }
}
