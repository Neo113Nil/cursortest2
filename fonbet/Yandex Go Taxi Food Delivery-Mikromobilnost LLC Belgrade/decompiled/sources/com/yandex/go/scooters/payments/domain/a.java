package com.yandex.go.scooters.payments.domain;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.scooters.payments.api.exception.ScootersPaymentUnavailableException;
import com.yandex.go.scooters.payments.data.c;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h0a0;
import defpackage.hfa0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.ngo0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.po21;
import defpackage.tf91;
import defpackage.tpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes8.dex */
public final class a {
    public final po21 a;
    public final ngo0 b;
    public final c c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();

    public a(po21 po21Var, ngo0 ngo0Var, c cVar) {
        this.a = po21Var;
        this.b = ngo0Var;
        this.c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:26:0x005b, B:27:0x00ac, B:28:0x00b2, B:33:0x0085, B:36:0x0099, B:39:0x00c6, B:41:0x00d0, B:43:0x00d6), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        ScootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1 scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1;
        int i;
        Throwable th;
        g050 g050Var;
        zzs zzsVar2;
        g050 g050Var2;
        oea0 b;
        g050 g050Var3;
        c cVar = aVar.c;
        try {
            if (continuationImpl instanceof ScootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1) {
                scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1 = (ScootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1) continuationImpl;
                int i2 = scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar2 = aVar.d;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$0 = zzsVar;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1 = aVar2;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label = 1;
                        if (aVar2.a(scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1) != obj2) {
                            zzsVar2 = zzsVar;
                            g050Var2 = aVar2;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                ((Result) obj).getClass();
                                g050Var3 = g050Var;
                                g050Var2 = g050Var3;
                                g050Var2.d(null);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        g050Var2 = (g050) scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1;
                        kotlin.b.b(obj);
                        zzsVar2 = ((mo21) obj).a();
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$0 = null;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1 = g050Var2;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$2 = null;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$3 = null;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label = 3;
                        if (aVar.f(zzsVar2, scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1) != obj2) {
                            g050Var3 = g050Var2;
                            g050Var2 = g050Var3;
                            g050Var2.d(null);
                            return zy11.a;
                        }
                        return obj2;
                    }
                    g050Var2 = (g050) scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1;
                    zzsVar2 = (zzs) scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$0;
                    kotlin.b.b(obj);
                    b = aVar.b.b().b("no_feature");
                    if (b.a()) {
                        m6a0 c = cVar.c();
                        hfa0 c2 = tf91.c(b, c);
                        if (c == null && c2.d() != null) {
                            cVar.a(c2.d());
                        }
                        g050Var2.d(null);
                        return zy11.a;
                    }
                    if (zzsVar2 == null) {
                        po21 po21Var = aVar.a;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$0 = null;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1 = g050Var2;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$2 = null;
                        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label = 2;
                        obj = ((e) po21Var).h(scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        zzsVar2 = ((mo21) obj).a();
                    }
                    scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$0 = null;
                    scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$1 = g050Var2;
                    scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$2 = null;
                    scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.L$3 = null;
                    scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label = 3;
                    if (aVar.f(zzsVar2, scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1) != obj2) {
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            b = aVar.b.b().b("no_feature");
            if (b.a()) {
            }
        } catch (Throwable th3) {
            th = th3;
            g050Var = zzsVar;
        }
        scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1 = new ScootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1(aVar, continuationImpl);
        Object obj3 = scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentPaymentMethodInteractorImpl$invalidateCurrentPaymentOptionIfNeeded$1.label;
    }

    public final void b(m6a0 m6a0Var) {
        c cVar = this.c;
        if (jl40.l(cVar.c(), m6a0Var)) {
            return;
        }
        cVar.a(m6a0Var);
    }

    public final hfa0 c() {
        return this.c.b();
    }

    public final tpr d(zzs zzsVar, boolean z) {
        return com.yandex.go.coroutines.b.d(this.c.d(z), new ScootersCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1(this, zzsVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(zzs zzsVar, ContinuationImpl continuationImpl) {
        ScootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1 scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1;
        int i;
        c cVar = this.c;
        try {
            if (continuationImpl instanceof ScootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1) {
                scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1 = (ScootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1) continuationImpl;
                int i2 = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1.label = i2 - Integer.MIN_VALUE;
                    ScootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1 scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$12 = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1;
                    Object obj = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        l0 b = this.b.b();
                        h0a0 h0a0Var = new h0a0(zzsVar);
                        scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$12.L$0 = null;
                        scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$12.label = 1;
                        obj = l0.d(b, h0a0Var, "no_feature", true, scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$12, 24);
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
                    hfa0 c = tf91.c((oea0) obj, cVar.c());
                    cVar.a(c.d());
                    return c;
                }
            }
            if (i != 0) {
            }
            hfa0 c2 = tf91.c((oea0) obj, cVar.c());
            cVar.a(c2.d());
            return c2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.c(String.format("Error while requesting current payment options for scooters", Arrays.copyOf(new Object[]{th}, 1)));
            return new Result.Failure(new ScootersPaymentUnavailableException());
        }
        scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1 = new ScootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1(this, continuationImpl);
        ScootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1 scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$122 = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$1;
        Object obj2 = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentPaymentMethodInteractorImpl$requestCurrentPaymentOptions$122.label;
    }
}
