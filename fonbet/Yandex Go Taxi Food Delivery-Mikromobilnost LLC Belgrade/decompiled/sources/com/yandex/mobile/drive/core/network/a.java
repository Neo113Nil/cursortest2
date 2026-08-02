package com.yandex.mobile.drive.core.network;

import android.location.Location;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.cms;
import defpackage.d5j0;
import defpackage.dvj0;
import defpackage.dvw;
import defpackage.dw60;
import defpackage.h0w;
import defpackage.h2b1;
import defpackage.j1;
import defpackage.j18;
import defpackage.jvj0;
import defpackage.keu;
import defpackage.meu;
import defpackage.ny61;
import defpackage.p0;
import defpackage.qgn0;
import defpackage.qsr;
import defpackage.t4j0;
import defpackage.tls;
import defpackage.yf7;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(int i, yf7 yf7Var, int i2, boolean z) {
        LinkedHashMap l = kotlin.collections.b.l(new Pair("attempt", Integer.valueOf(i)), new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(i2)), new Pair("success", Boolean.valueOf(z)));
        d5j0 k = yf7Var.k();
        l.putAll(kotlin.collections.b.i(new Pair("method", k.b), new Pair("url", k.a.i)));
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("retry_policy", l);
        }
    }

    public static final void b(keu keuVar) {
        Location location = com.yandex.mobile.drive.drive_native_features.b.A.b;
        if (location != null) {
            keuVar.a("lat", String.valueOf(location.getLatitude()));
            keuVar.a("lon", String.valueOf(location.getLongitude()));
            keuVar.a("location-accuracy", String.valueOf(location.getAccuracy()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:28)(1:62)|29|30|31|(1:33)(4:35|13|14|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:9|(3:10|11|12)|13|14|(2:16|(7:18|19|20|(1:22)(1:68)|23|24|(2:63|(2:65|66)(1:67))(5:(1:28)(1:62)|29|30|31|(1:33)(4:35|13|14|(0)))))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0169, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016a, code lost:
    
        r14 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016e, code lost:
    
        r1 = r13.k().a.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0178, code lost:
    
        if ((r0 instanceof java.net.UnknownServiceException) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0189, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01aa, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e7, code lost:
    
        r1.n("retry_policy", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        r0 = r5;
        r1 = r14;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018f, code lost:
    
        if (r1.length() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0191, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019c, code lost:
    
        r1 = "debug_network_error".concat(r1);
        r2 = defpackage.h2b1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a4, code lost:
    
        if (r2 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a6, code lost:
    
        r2.o(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0194, code lost:
    
        r1 = defpackage.oyr.p(ru.CryptoPro.JCP.tools.CertReader.Extension.O_BRAKE_SPACE, r1, ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ac, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0139, code lost:
    
        if (r5 < r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        r16 = r14;
        r14 = r1;
        r1 = r3;
        r3 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011c -> B:13:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(t4j0 t4j0Var, qsr qsrVar, String str, p0 p0Var, ContinuationImpl continuationImpl) {
        APIKt$fetchResponse$1 aPIKt$fetchResponse$1;
        int i;
        meu d;
        yf7 newCall;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj;
        cms cmsVar;
        yf7 yf7Var;
        Object obj2;
        yf7 yf7Var2;
        int i6;
        int i7;
        APIKt$fetchResponse$1 aPIKt$fetchResponse$12;
        int i8;
        if (continuationImpl instanceof APIKt$fetchResponse$1) {
            aPIKt$fetchResponse$1 = (APIKt$fetchResponse$1) continuationImpl;
            int i9 = aPIKt$fetchResponse$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                aPIKt$fetchResponse$1.label = i9 - Integer.MIN_VALUE;
                Object obj3 = aPIKt$fetchResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aPIKt$fetchResponse$1.label;
                int i10 = 1;
                int i11 = 0;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    OkHttpClient okHttpClient = (OkHttpClient) dw60.a.getValue();
                    if (str == null) {
                        keu d2 = qsrVar.c.d();
                        b(d2);
                        d = d2.d();
                    } else {
                        keu d3 = qsrVar.c.d();
                        b(d3);
                        d3.g("content-type", "video/mp4");
                        d = d3.d();
                    }
                    t4j0Var.getClass();
                    t4j0Var.c = d.d();
                    newCall = okHttpClient.newCall(new d5j0(t4j0Var));
                    i2 = 3;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    obj = null;
                    cmsVar = p0Var;
                    if (obj == null) {
                    }
                    jvj0 jvj0Var = (jvj0) obj;
                    if (jvj0Var == null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = aPIKt$fetchResponse$1.I$3;
                    int i13 = aPIKt$fetchResponse$1.I$2;
                    i5 = aPIKt$fetchResponse$1.I$1;
                    i2 = aPIKt$fetchResponse$1.I$0;
                    yf7 yf7Var3 = (yf7) aPIKt$fetchResponse$1.L$9;
                    obj = aPIKt$fetchResponse$1.L$8;
                    newCall = (yf7) aPIKt$fetchResponse$1.L$7;
                    cms cmsVar2 = (tls) aPIKt$fetchResponse$1.L$3;
                    try {
                        kotlin.b.b(obj3);
                        APIKt$fetchResponse$1 aPIKt$fetchResponse$13 = aPIKt$fetchResponse$1;
                        i8 = i12;
                        cmsVar = cmsVar2;
                        yf7Var = newCall;
                        obj2 = obj;
                        yf7Var2 = yf7Var3;
                        i6 = i2;
                        i7 = i5;
                        aPIKt$fetchResponse$12 = aPIKt$fetchResponse$13;
                    } catch (IOException e) {
                        IOException e2 = e;
                        if (i12 == 0) {
                        }
                        LinkedHashMap l = kotlin.collections.b.l(new Pair("attempt", Integer.valueOf(i13)));
                        d5j0 k = yf7Var3.k();
                        l.putAll(kotlin.collections.b.i(new Pair("method", k.b), new Pair("url", k.a.i)));
                        qgn0 qgn0Var = h2b1.c;
                        if (qgn0Var != null) {
                        }
                        i3 = i13;
                        cmsVar = cmsVar2;
                        i10 = 1;
                        if (obj == null) {
                        }
                        jvj0 jvj0Var2 = (jvj0) obj;
                        if (jvj0Var2 == null) {
                        }
                    }
                    Pair pair = (Pair) obj3;
                    int intValue = ((Number) pair.c()).intValue();
                    if (200 <= intValue) {
                        if (intValue < 500) {
                            obj2 = pair.f();
                            a(i13, yf7Var2, ((Number) pair.c()).intValue(), obj2 != null ? i10 : 0);
                            i4 = i8;
                            i3 = i13;
                            aPIKt$fetchResponse$1 = aPIKt$fetchResponse$12;
                            i5 = i7;
                            i2 = i6;
                            obj = obj2;
                            newCall = yf7Var;
                            if (obj == null || i3 >= i2) {
                                jvj0 jvj0Var22 = (jvj0) obj;
                                return jvj0Var22 == null ? dvj0.b : jvj0Var22;
                            }
                            yf7Var3 = i3 > 0 ? newCall.clone() : newCall;
                            i13 = i3 + 1;
                            aPIKt$fetchResponse$1.L$0 = null;
                            aPIKt$fetchResponse$1.L$1 = null;
                            aPIKt$fetchResponse$1.L$2 = null;
                            aPIKt$fetchResponse$1.L$3 = cmsVar;
                            aPIKt$fetchResponse$1.L$4 = null;
                            aPIKt$fetchResponse$1.L$5 = null;
                            aPIKt$fetchResponse$1.L$6 = null;
                            aPIKt$fetchResponse$1.L$7 = newCall;
                            aPIKt$fetchResponse$1.L$8 = obj;
                            aPIKt$fetchResponse$1.L$9 = yf7Var3;
                            aPIKt$fetchResponse$1.L$10 = yf7Var3;
                            aPIKt$fetchResponse$1.I$0 = i2;
                            aPIKt$fetchResponse$1.I$1 = i5;
                            aPIKt$fetchResponse$1.I$2 = i13;
                            aPIKt$fetchResponse$1.I$3 = i4;
                            aPIKt$fetchResponse$1.I$4 = 0;
                            aPIKt$fetchResponse$1.I$5 = 0;
                            aPIKt$fetchResponse$1.label = i10;
                            j18 j18Var = new j18(i10, dvw.b(aPIKt$fetchResponse$1));
                            j18Var.u();
                            j18Var.w(new j1(i11, yf7Var3));
                            yf7Var3.I(new h0w(2, j18Var, cmsVar));
                            Object s = j18Var.s();
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (s == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            yf7Var = newCall;
                            obj2 = obj;
                            yf7Var2 = yf7Var3;
                            i6 = i2;
                            i7 = i5;
                            aPIKt$fetchResponse$12 = aPIKt$fetchResponse$1;
                            i8 = i4;
                            obj3 = s;
                            Pair pair2 = (Pair) obj3;
                            int intValue2 = ((Number) pair2.c()).intValue();
                            if (200 <= intValue2) {
                            }
                        }
                    }
                }
            }
        }
        aPIKt$fetchResponse$1 = new APIKt$fetchResponse$1(continuationImpl);
        Object obj32 = aPIKt$fetchResponse$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aPIKt$fetchResponse$1.label;
        int i102 = 1;
        int i112 = 0;
        if (i != 0) {
        }
    }
}
