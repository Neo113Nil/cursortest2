package com.yandex.fintechsdk.core.telemetry.impl;

import android.content.Context;
import android.net.NetworkRequest;
import com.yandex.fintechsdk.core.telemetry.api.SpanKind;
import defpackage.glt0;
import defpackage.i3y;
import defpackage.klt0;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.plt0;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tse;
import defpackage.w870;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements w870 {
    public final String a;
    public final String b;
    public final i3y c;
    public final com.yandex.fintechsdk.core.telemetry.impl.queue.a d;
    public final com.yandex.fintechsdk.core.telemetry.impl.queue.b e;

    public b(Context context, final LinkedHashMap linkedHashMap, final String str, tse tseVar, String str2, String str3) {
        this.a = str2;
        this.b = str3;
        i3y a = kotlin.a.a(new sls() { // from class: com.yandex.fintechsdk.core.telemetry.impl.a
            @Override // defpackage.sls
            public final Object invoke() {
                return new plt0(linkedHashMap, str, new OpenTelemetryTracerImpl$dataSource$2$1(2, this, b.class, "errorSending", "errorSending([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            }
        });
        this.c = a;
        this.d = new com.yandex.fintechsdk.core.telemetry.impl.queue.a(tseVar, new OpenTelemetryTracerImpl$queue$1(2, (plt0) a.getValue(), plt0.class, "sendQueue", "sendQueue$impl_release(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
        this.e = new com.yandex.fintechsdk.core.telemetry.impl.queue.b(context, tseVar, new OpenTelemetryTracerImpl$unsentQueue$1(2, this, b.class, "sendUnsentSpan", "sendUnsentSpan(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    public static final void d(b bVar, klt0 klt0Var) {
        kotlinx.coroutines.channels.a aVar;
        com.yandex.fintechsdk.core.telemetry.impl.queue.a aVar2 = bVar.d;
        com.yandex.fintechsdk.core.telemetry.impl.queue.b bVar2 = bVar.e;
        if (!bVar2.c) {
            bVar2.f.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bVar2.g);
            bVar2.c = true;
        }
        aVar2.d();
        if (aVar2.i || (aVar = aVar2.d) == null) {
            return;
        }
        aVar.d(klt0Var);
        ni9 ni9Var = oi9.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b bVar, List list, Continuation continuation) {
        OpenTelemetryTracerImpl$sendUnsentSpan$1 openTelemetryTracerImpl$sendUnsentSpan$1;
        Object obj;
        int i;
        Iterator it;
        boolean hasNext;
        Object obj2;
        bVar.getClass();
        if (continuation instanceof OpenTelemetryTracerImpl$sendUnsentSpan$1) {
            openTelemetryTracerImpl$sendUnsentSpan$1 = (OpenTelemetryTracerImpl$sendUnsentSpan$1) continuation;
            int i2 = openTelemetryTracerImpl$sendUnsentSpan$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openTelemetryTracerImpl$sendUnsentSpan$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = openTelemetryTracerImpl$sendUnsentSpan$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openTelemetryTracerImpl$sendUnsentSpan$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) openTelemetryTracerImpl$sendUnsentSpan$1.L$0;
                    kotlin.b.b(obj3);
                }
                do {
                    hasNext = it.hasNext();
                    obj2 = zy11.a;
                    if (hasNext) {
                        return obj2;
                    }
                    byte[] bArr = (byte[]) it.next();
                    plt0 plt0Var = (plt0) bVar.c.getValue();
                    openTelemetryTracerImpl$sendUnsentSpan$1.L$0 = it;
                    openTelemetryTracerImpl$sendUnsentSpan$1.label = 1;
                    Object a = plt0Var.a.a(bArr, openTelemetryTracerImpl$sendUnsentSpan$1);
                    if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = a;
                    }
                } while (obj2 != obj);
                return obj;
            }
        }
        openTelemetryTracerImpl$sendUnsentSpan$1 = new OpenTelemetryTracerImpl$sendUnsentSpan$1(bVar, continuation);
        Object obj32 = openTelemetryTracerImpl$sendUnsentSpan$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openTelemetryTracerImpl$sendUnsentSpan$1.label;
        if (i != 0) {
        }
        do {
            hasNext = it.hasNext();
            obj2 = zy11.a;
            if (hasNext) {
            }
        } while (obj2 != obj);
        return obj;
    }

    @Override // defpackage.w870
    public final void a() {
        com.yandex.fintechsdk.core.telemetry.impl.queue.b bVar = this.e;
        if (bVar.c) {
            try {
                bVar.f.unregisterNetworkCallback(bVar.g);
                bVar.c = false;
            } catch (Exception unused) {
            }
        }
        com.yandex.fintechsdk.core.telemetry.impl.queue.a aVar = this.d;
        pzt0 pzt0Var = aVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.f = null;
    }

    @Override // defpackage.w870
    public final void b() {
        new OpenTelemetryTracerImpl$startTrace$1(1, this, b.class, "addSpanToQueue", "addSpanToQueue(Lcom/yandex/fintechsdk/core/telemetry/api/Span;)V", 0).invoke(new klt0("New PaymentKit session", this.a, this.b, SpanKind.SPAN_KIND_INTERNAL, null, new LinkedHashMap(), System.currentTimeMillis() * 1000000, System.currentTimeMillis() * 1000000));
        this.d.h = true;
    }

    @Override // defpackage.w870
    public final glt0 c(String str) {
        glt0 glt0Var = new glt0(this.a, str, new OpenTelemetryTracerImpl$spanBuilder$1(1, this, b.class, "addSpanToQueue", "addSpanToQueue(Lcom/yandex/fintechsdk/core/telemetry/api/Span;)V", 0));
        glt0Var.f = this.b;
        return glt0Var;
    }

    @Override // defpackage.w870
    public final void destroy() {
        com.yandex.fintechsdk.core.telemetry.impl.queue.a aVar = this.d;
        pzt0 pzt0Var = aVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.f = null;
        aVar.i = true;
        com.yandex.fintechsdk.core.telemetry.impl.queue.b bVar = this.e;
        if (bVar.c) {
            try {
                bVar.f.unregisterNetworkCallback(bVar.g);
                bVar.c = false;
            } catch (Exception unused) {
            }
        }
        bVar.d.clear();
    }

    @Override // defpackage.w870
    public final boolean isEnabled() {
        return true;
    }
}
