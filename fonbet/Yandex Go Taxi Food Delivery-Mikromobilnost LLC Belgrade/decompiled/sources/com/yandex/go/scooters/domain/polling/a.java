package com.yandex.go.scooters.domain.polling;

import androidx.lifecycle.Lifecycle;
import defpackage.a2e0;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.ist;
import defpackage.jl40;
import defpackage.kdd0;
import defpackage.ke00;
import defpackage.kko0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final String a;
    public final Lifecycle b;
    public final tse c;
    public final kdd0 d;
    public final a2e0 e;
    public final Long f;
    public final sls g;
    public final String h;
    public final String i;
    public volatile boolean j;
    public final long k;
    public final r0 l;
    public pzt0 m;

    public a(String str, Lifecycle lifecycle, tse tseVar, kdd0 kdd0Var, a2e0 a2e0Var, Long l, sls slsVar) {
        this.a = str;
        this.b = lifecycle;
        this.c = tseVar;
        this.d = kdd0Var;
        this.e = a2e0Var;
        this.f = l;
        this.g = slsVar;
        this.h = a2e0Var.a;
        Map map = kko0.a;
        this.i = evu0.d0(str, ":", str);
        this.k = kdd0Var.l(str);
        this.l = bvf0.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098 A[Catch: all -> 0x003b, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x003b, blocks: (B:15:0x0037, B:16:0x0092, B:18:0x0098, B:22:0x009c, B:23:0x009e, B:39:0x0080, B:42:0x008b), top: B:14:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[Catch: all -> 0x003b, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x003b, blocks: (B:15:0x0037, B:16:0x0092, B:18:0x0098, B:22:0x009c, B:23:0x009e, B:39:0x0080, B:42:0x008b), top: B:14:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d2 -> B:27:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ScootersPolling$poll$1 scootersPolling$poll$1;
        int i;
        Object value;
        Long l = aVar.f;
        a2e0 a2e0Var = aVar.e;
        if (continuationImpl instanceof ScootersPolling$poll$1) {
            scootersPolling$poll$1 = (ScootersPolling$poll$1) continuationImpl;
            int i2 = scootersPolling$poll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPolling$poll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPolling$poll$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPolling$poll$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i == 2) {
                        try {
                            kotlin.b.b(obj);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            if (!((Boolean) a2e0Var.b.c.invoke(th)).booleanValue()) {
                                aVar.c(new Result.Failure(th));
                            }
                        }
                        if (a2e0Var.a(obj)) {
                            aVar.c(obj);
                            return zy11Var;
                        }
                        r0 r0Var = aVar.l;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, new Result(obj)));
                        long j = a2e0Var.c;
                        scootersPolling$poll$1.label = 3;
                        if (kotlinx.coroutines.a.i(j, scootersPolling$poll$1) == obj2) {
                            return obj2;
                        }
                        if (kotlinx.coroutines.a.p(scootersPolling$poll$1.get_context())) {
                            if (l != null) {
                                long longValue = ((Number) aVar.g.invoke()).longValue() - aVar.k;
                                if (longValue < 0) {
                                    longValue = aVar.f.longValue();
                                }
                                if (longValue >= l.longValue()) {
                                    scootersPolling$poll$1.label = 1;
                                    if (aVar.d(scootersPolling$poll$1) == obj2) {
                                        return obj2;
                                    }
                                }
                            }
                            String str = aVar.i;
                            scootersPolling$poll$1.label = 2;
                            wls wlsVar = a2e0Var.b.a;
                            if (wlsVar == null) {
                                wlsVar = null;
                            }
                            obj = wlsVar.invoke(str, scootersPolling$poll$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            if (a2e0Var.a(obj)) {
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(scootersPolling$poll$1.get_context())) {
                }
                return zy11Var;
            }
        }
        scootersPolling$poll$1 = new ScootersPolling$poll$1(aVar, continuationImpl);
        Object obj3 = scootersPolling$poll$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPolling$poll$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kotlin.b.b(obj3);
        if (kotlinx.coroutines.a.p(scootersPolling$poll$1.get_context())) {
        }
        return zy11Var2;
    }

    public final String b(long j) {
        StringBuilder v = b64.v("Scooters polling timed out: service=", this.h, ", operation_id=", this.i, ", timeout_ms=");
        v.append(this.f);
        v.append(", elapsed_ms=");
        v.append(j);
        return v.toString();
    }

    public final void c(Object obj) {
        Object value;
        r0 r0Var = this.l;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new Result(obj)));
        this.j = true;
        this.d.o(this.a);
        tls tlsVar = this.e.b.d;
        if (tlsVar != null) {
            tlsVar.invoke(new Result(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x002c, CancellationException -> 0x00a4, TryCatch #2 {CancellationException -> 0x00a4, all -> 0x002c, blocks: (B:10:0x0028, B:11:0x004b, B:13:0x0051, B:16:0x0055, B:18:0x0064, B:20:0x006c, B:23:0x0088, B:24:0x0082, B:25:0x0092, B:30:0x0038, B:33:0x0044), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x002c, CancellationException -> 0x00a4, TryCatch #2 {CancellationException -> 0x00a4, all -> 0x002c, blocks: (B:10:0x0028, B:11:0x004b, B:13:0x0051, B:16:0x0055, B:18:0x0064, B:20:0x006c, B:23:0x0088, B:24:0x0082, B:25:0x0092, B:30:0x0038, B:33:0x0044), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersPolling$handleTimeoutReached$1 scootersPolling$handleTimeoutReached$1;
        Object obj;
        int i;
        zy11 zy11Var;
        a2e0 a2e0Var;
        try {
            if (continuationImpl instanceof ScootersPolling$handleTimeoutReached$1) {
                scootersPolling$handleTimeoutReached$1 = (ScootersPolling$handleTimeoutReached$1) continuationImpl;
                int i2 = scootersPolling$handleTimeoutReached$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPolling$handleTimeoutReached$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersPolling$handleTimeoutReached$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPolling$handleTimeoutReached$1.label;
                    wls wlsVar = null;
                    zy11Var = zy11.a;
                    a2e0Var = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String str = this.i;
                        scootersPolling$handleTimeoutReached$1.label = 1;
                        wls wlsVar2 = a2e0Var.b.a;
                        if (wlsVar2 != null) {
                            wlsVar = wlsVar2;
                        }
                        obj = wlsVar.invoke(str, scootersPolling$handleTimeoutReached$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    if (a2e0Var.a(obj)) {
                        c(obj);
                        return zy11Var;
                    }
                    ScootersPollingTimeoutException scootersPollingTimeoutException = new ScootersPollingTimeoutException();
                    ist istVar = zgz.a;
                    ke00 a = istVar.b.a();
                    if (a != null && a.b(15)) {
                        long longValue = ((Number) this.g.invoke()).longValue() - this.k;
                        if (longValue < 0) {
                            longValue = this.f.longValue();
                        }
                        a.a(15, null, scootersPollingTimeoutException, b(longValue), istVar.a);
                    }
                    c(new Result.Failure(scootersPollingTimeoutException));
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            if (a2e0Var.a(obj)) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c(new Result.Failure(th));
            return zy11Var;
        }
        scootersPolling$handleTimeoutReached$1 = new ScootersPolling$handleTimeoutReached$1(this, continuationImpl);
        obj = scootersPolling$handleTimeoutReached$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPolling$handleTimeoutReached$1.label;
        wls wlsVar3 = null;
        zy11Var = zy11.a;
        a2e0Var = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return jl40.l(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
