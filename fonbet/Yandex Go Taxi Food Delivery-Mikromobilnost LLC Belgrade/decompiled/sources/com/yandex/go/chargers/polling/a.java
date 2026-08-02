package com.yandex.go.chargers.polling;

import androidx.lifecycle.Lifecycle;
import defpackage.a2e0;
import defpackage.b2e0;
import defpackage.bvf0;
import defpackage.c06;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sme0;
import defpackage.tls;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.ysa;
import defpackage.zy11;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final String a;
    public final Lifecycle b;
    public final tse c;
    public final c06 d;
    public final a2e0 e;
    public final r0 f = bvf0.c(null);
    public final String g;
    public final String h;
    public pzt0 i;

    public a(String str, Lifecycle lifecycle, tse tseVar, c06 c06Var, a2e0 a2e0Var) {
        this.a = str;
        this.b = lifecycle;
        this.c = tseVar;
        this.d = c06Var;
        this.e = a2e0Var;
        String str2 = a2e0Var.a;
        this.g = str2;
        this.h = g8e.p(str2, ":", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: all -> 0x003c, CancellationException -> 0x00ed, TryCatch #2 {CancellationException -> 0x00ed, all -> 0x003c, blocks: (B:14:0x0038, B:15:0x005e, B:17:0x006f, B:19:0x0090, B:27:0x004b, B:30:0x0056), top: B:13:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[Catch: all -> 0x003c, CancellationException -> 0x00ed, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00ed, all -> 0x003c, blocks: (B:14:0x0038, B:15:0x005e, B:17:0x006f, B:19:0x0090, B:27:0x004b, B:30:0x0056), top: B:13:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ea -> B:25:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ChargersPolling$poll$1 chargersPolling$poll$1;
        int i;
        String str = aVar.h;
        c06 c06Var = aVar.d;
        r0 r0Var = aVar.f;
        a2e0 a2e0Var = aVar.e;
        if (continuationImpl instanceof ChargersPolling$poll$1) {
            chargersPolling$poll$1 = (ChargersPolling$poll$1) continuationImpl;
            int i2 = chargersPolling$poll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPolling$poll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPolling$poll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPolling$poll$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    if (i == 1) {
                        try {
                            kotlin.b.b(obj);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            b2e0 b2e0Var = a2e0Var.b;
                            if (!((Boolean) b2e0Var.c.invoke(th)).booleanValue()) {
                                Result.Failure failure = new Result.Failure(th);
                                Result result = new Result(failure);
                                r0Var.getClass();
                                r0Var.m(null, result);
                                ysa ysaVar = (ysa) c06Var.b;
                                sme0 sme0Var = ysaVar.d;
                                kgx[] kgxVarArr = ysa.e;
                                ysaVar.d.setValue(ysaVar, kgxVarArr[1], v4r0.f((Set) sme0Var.getValue(ysaVar, kgxVarArr[1]), str));
                                tls tlsVar = b2e0Var.d;
                                if (tlsVar != null) {
                                    tlsVar.invoke(new Result(failure));
                                }
                            }
                        }
                        Result result2 = new Result(obj);
                        r0Var.getClass();
                        r0Var.m(null, result2);
                        if (!a2e0Var.a(obj)) {
                            ysa ysaVar2 = (ysa) c06Var.b;
                            sme0 sme0Var2 = ysaVar2.d;
                            kgx[] kgxVarArr2 = ysa.e;
                            ysaVar2.d.setValue(ysaVar2, kgxVarArr2[1], v4r0.f((Set) sme0Var2.getValue(ysaVar2, kgxVarArr2[1]), str));
                            tls tlsVar2 = a2e0Var.b.d;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(new Result(obj));
                            }
                            return zy11Var;
                        }
                        long j = a2e0Var.c;
                        chargersPolling$poll$1.label = 2;
                        if (kotlinx.coroutines.a.i(j, chargersPolling$poll$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (kotlinx.coroutines.a.p(chargersPolling$poll$1.get_context())) {
                            String str2 = aVar.a;
                            chargersPolling$poll$1.label = 1;
                            wls wlsVar = a2e0Var.b.a;
                            if (wlsVar == null) {
                                wlsVar = null;
                            }
                            obj = wlsVar.invoke(str2, chargersPolling$poll$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Result result22 = new Result(obj);
                            r0Var.getClass();
                            r0Var.m(null, result22);
                            if (!a2e0Var.a(obj)) {
                            }
                            long j2 = a2e0Var.c;
                            chargersPolling$poll$1.label = 2;
                            if (kotlinx.coroutines.a.i(j2, chargersPolling$poll$1) == coroutineSingletons) {
                            }
                            if (kotlinx.coroutines.a.p(chargersPolling$poll$1.get_context())) {
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(chargersPolling$poll$1.get_context())) {
                }
                return zy11Var;
            }
        }
        chargersPolling$poll$1 = new ChargersPolling$poll$1(aVar, continuationImpl);
        Object obj2 = chargersPolling$poll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPolling$poll$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kotlin.b.b(obj2);
        if (kotlinx.coroutines.a.p(chargersPolling$poll$1.get_context())) {
        }
        return zy11Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return jl40.l(this.h, ((a) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
