package com.yandex.payment.sdk.network;

import defpackage.b5j0;
import defpackage.d5j0;
import defpackage.evu0;
import defpackage.jwu;
import defpackage.keu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.t4j0;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class a {
    public final OkHttpClient a;

    public a(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b5j0 b5j0Var, String str, Double d, ContinuationImpl continuationImpl) {
        OkHttpRequestExecutor$executeRequest$1 okHttpRequestExecutor$executeRequest$1;
        int i;
        kwu kwuVar;
        if (continuationImpl instanceof OkHttpRequestExecutor$executeRequest$1) {
            okHttpRequestExecutor$executeRequest$1 = (OkHttpRequestExecutor$executeRequest$1) continuationImpl;
            int i2 = okHttpRequestExecutor$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okHttpRequestExecutor$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = okHttpRequestExecutor$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = okHttpRequestExecutor$executeRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    try {
                        jwu jwuVar = new jwu();
                        jwuVar.i(null, str);
                        kwuVar = jwuVar.e();
                    } catch (IllegalArgumentException unused) {
                        kwuVar = null;
                    } catch (Exception e) {
                        throw e;
                    }
                    if (kwuVar == null) {
                        ny61.g("Invalid base URL: ".concat(str));
                        return null;
                    }
                    jwu g = kwuVar.g();
                    g.c(evu0.Q("/", b5j0Var.c()), false);
                    for (Map.Entry entry : b5j0Var.e().entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (str3 != null) {
                            g.d(str2, str3);
                        }
                    }
                    keu keuVar = new keu();
                    for (Map.Entry entry2 : b5j0Var.d().entrySet()) {
                        keuVar.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    t4j0 t4j0Var = new t4j0();
                    t4j0Var.a = g.e();
                    t4j0Var.c = keuVar.d().d();
                    t4j0Var.e(b5j0Var.b().name(), b5j0Var.a());
                    d5j0 d5j0Var = new d5j0(t4j0Var);
                    double doubleValue = (d != null ? d.doubleValue() : 30.0d) * 1000.0d;
                    if (d == null) {
                        return ((nci0) this.a.newCall(d5j0Var)).execute();
                    }
                    OkHttpRequestExecutor$executeRequest$2 okHttpRequestExecutor$executeRequest$2 = new OkHttpRequestExecutor$executeRequest$2(this, d5j0Var, null);
                    okHttpRequestExecutor$executeRequest$1.L$0 = null;
                    okHttpRequestExecutor$executeRequest$1.L$1 = null;
                    okHttpRequestExecutor$executeRequest$1.L$2 = null;
                    okHttpRequestExecutor$executeRequest$1.L$3 = null;
                    okHttpRequestExecutor$executeRequest$1.L$4 = null;
                    okHttpRequestExecutor$executeRequest$1.L$5 = null;
                    okHttpRequestExecutor$executeRequest$1.D$0 = doubleValue;
                    okHttpRequestExecutor$executeRequest$1.label = 1;
                    obj = kotlinx.coroutines.a.u((long) doubleValue, okHttpRequestExecutor$executeRequest$2, okHttpRequestExecutor$executeRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (kvj0) obj;
            }
        }
        okHttpRequestExecutor$executeRequest$1 = new OkHttpRequestExecutor$executeRequest$1(this, continuationImpl);
        Object obj2 = okHttpRequestExecutor$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttpRequestExecutor$executeRequest$1.label;
        if (i != 0) {
        }
        return (kvj0) obj2;
    }
}
