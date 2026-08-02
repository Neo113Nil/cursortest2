package com.yandex.paymentsdk.opentelemetry.sender;

import defpackage.d5j0;
import defpackage.l5j0;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wls;
import defpackage.wms;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final wls b;
    public final OkHttpClient c = new OkHttpClient();

    public a(String str, wls wlsVar) {
        this.a = str;
        this.b = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(byte[] bArr, Continuation continuation) {
        SpanHttpSender$sendHttpRequest$1 spanHttpSender$sendHttpRequest$1;
        int i;
        if (continuation instanceof SpanHttpSender$sendHttpRequest$1) {
            spanHttpSender$sendHttpRequest$1 = (SpanHttpSender$sendHttpRequest$1) continuation;
            int i2 = spanHttpSender$sendHttpRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spanHttpSender$sendHttpRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = spanHttpSender$sendHttpRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spanHttpSender$sendHttpRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    try {
                        int i3 = m5j0.a;
                        Regex regex = wg10.e;
                        l5j0 b = wms.b(6, qje.o("application/x-protobuf"), bArr);
                        t4j0 t4j0Var = new t4j0();
                        t4j0Var.h(this.a);
                        t4j0Var.e("POST", b);
                        ((nci0) this.c.newCall(new d5j0(t4j0Var))).execute();
                    } catch (Exception unused) {
                        spanHttpSender$sendHttpRequest$1.L$0 = null;
                        spanHttpSender$sendHttpRequest$1.L$1 = null;
                        spanHttpSender$sendHttpRequest$1.label = 1;
                        if (this.b.invoke(bArr, spanHttpSender$sendHttpRequest$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        spanHttpSender$sendHttpRequest$1 = new SpanHttpSender$sendHttpRequest$1(this, continuation);
        Object obj2 = spanHttpSender$sendHttpRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spanHttpSender$sendHttpRequest$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
