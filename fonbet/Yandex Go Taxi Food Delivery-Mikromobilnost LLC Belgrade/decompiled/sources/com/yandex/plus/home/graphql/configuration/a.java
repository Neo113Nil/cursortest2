package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.core.config.Environment;
import com.yandex.plus.home.datasource.openapi.apis.SdkConfigurationControllerApi;
import defpackage.bvf0;
import defpackage.c060;
import defpackage.e3n;
import defpackage.e6d0;
import defpackage.f060;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i6d0;
import defpackage.ike;
import defpackage.jse;
import defpackage.l5d0;
import defpackage.l6d0;
import defpackage.m6d0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o4z;
import defpackage.ome0;
import defpackage.qoh;
import defpackage.rkd0;
import defpackage.tje;
import defpackage.w511;
import defpackage.wwj0;
import defpackage.x3n;
import defpackage.xnp0;
import defpackage.zhf;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final SdkConfigurationControllerApi a;
    public final m6d0 b;
    public final zhf c;
    public final long d;
    public final ike e;
    public final jse f;
    public final rkd0 g;
    public final com.yandex.plus.home.datasource.local.preferences.a h;
    public final com.yandex.plus.home.datasource.local.preferences.a i;
    public final wwj0 j;
    public final kotlinx.coroutines.sync.a k;
    public final r0 l;
    public qoh m;

    public a(ome0 ome0Var, Environment environment, SdkConfigurationControllerApi sdkConfigurationControllerApi, m6d0 m6d0Var, zhf zhfVar, long j, ike ikeVar, jse jseVar, rkd0 rkd0Var) {
        this.a = sdkConfigurationControllerApi;
        this.b = m6d0Var;
        this.c = zhfVar;
        this.d = j;
        this.e = ikeVar;
        this.f = jseVar;
        this.g = rkd0Var;
        this.h = ome0Var.a(environment.name(), o4z.Companion.serializer());
        o430 o430Var = e3n.b;
        this.i = ome0Var.a("RECHANGE_END", x3n.a);
        this.j = new wwj0();
        this.k = gtq0.a();
        this.l = bvf0.c(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:37|38))(2:39|(1:41))|10|11|12|(2:14|(1:16)(2:27|28))(2:29|(1:31)(2:32|33))|17|(1:19)(2:23|(2:25|26))|20|21))|42|6|(0)(0)|10|11|12|(0)(0)|17|(0)(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r12 = new e6d0.a.c(r12.getB(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:12:0x004a, B:14:0x004e, B:16:0x0059, B:27:0x0067, B:28:0x006e, B:29:0x006f, B:32:0x0074, B:33:0x0079), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:12:0x004a, B:14:0x004e, B:16:0x0059, B:27:0x0067, B:28:0x006e, B:29:0x006f, B:32:0x0074, B:33:0x0079), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        SdkConfigurationRepositoryImpl$makeRequest$1 sdkConfigurationRepositoryImpl$makeRequest$1;
        int i;
        l6d0 l6d0Var;
        e6d0 e6d0Var;
        aVar.getClass();
        if (continuationImpl instanceof SdkConfigurationRepositoryImpl$makeRequest$1) {
            sdkConfigurationRepositoryImpl$makeRequest$1 = (SdkConfigurationRepositoryImpl$makeRequest$1) continuationImpl;
            int i2 = sdkConfigurationRepositoryImpl$makeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkConfigurationRepositoryImpl$makeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkConfigurationRepositoryImpl$makeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkConfigurationRepositoryImpl$makeRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    SdkConfigurationControllerApi sdkConfigurationControllerApi = aVar.a;
                    l6d0Var = l6d0.a;
                    sdkConfigurationRepositoryImpl$makeRequest$1.L$0 = l6d0Var;
                    sdkConfigurationRepositoryImpl$makeRequest$1.label = 1;
                    obj = sdkConfigurationControllerApi.a(sdkConfigurationRepositoryImpl$makeRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l6d0 l6d0Var2 = (l6d0) sdkConfigurationRepositoryImpl$makeRequest$1.L$0;
                    b.b(obj);
                    l6d0Var = l6d0Var2;
                }
                e6d0Var = (e6d0) obj;
                if (!(e6d0Var instanceof e6d0.b)) {
                    c060 c060Var = ((f060) ((e6d0.b) e6d0Var).a).b;
                    if (c060Var == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    e6d0Var = new e6d0.b(c060Var, ((e6d0.b) e6d0Var).b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m6d0 m6d0Var = aVar.b;
                l6d0Var.getClass();
                m6d0Var.a(e6d0Var);
                wwj0 wwj0Var = aVar.j;
                if (!(e6d0Var instanceof e6d0.b)) {
                    e6d0.b bVar = (e6d0.b) e6d0Var;
                    c060 c060Var2 = (c060) bVar.a;
                    wwj0Var.getClass();
                    e6d0Var = new e6d0.b(new xnp0(null, null, kotlin.collections.a.N0(c060Var2.a), kotlin.collections.a.N0(c060Var2.b), kotlin.collections.a.N0(c060Var2.c), kotlin.collections.a.N0(c060Var2.d), Integer.valueOf(c060Var2.e), Integer.valueOf(c060Var2.f), null), bVar.b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    w511.b();
                    return null;
                }
                return i6d0.a(e6d0Var);
            }
        }
        sdkConfigurationRepositoryImpl$makeRequest$1 = new SdkConfigurationRepositoryImpl$makeRequest$1(aVar, continuationImpl);
        Object obj2 = sdkConfigurationRepositoryImpl$makeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkConfigurationRepositoryImpl$makeRequest$1.label;
        if (i != 0) {
        }
        e6d0Var = (e6d0) obj2;
        if (!(e6d0Var instanceof e6d0.b)) {
        }
        m6d0 m6d0Var2 = aVar.b;
        l6d0Var.getClass();
        m6d0Var2.a(e6d0Var);
        wwj0 wwj0Var2 = aVar.j;
        if (!(e6d0Var instanceof e6d0.b)) {
        }
        return i6d0.a(e6d0Var);
    }

    public final Object b(Continuation continuation) {
        Object u0 = tje.N(this.e, this.f, null, new SdkConfigurationRepositoryImpl$clearCache$2(this, null), 2).u0(continuation);
        return u0 == CoroutineSingletons.COROUTINE_SUSPENDED ? u0 : zy11.a;
    }

    public final Object c(long j, Continuation continuation) {
        Object u0 = tje.N(this.e, this.f, null, new SdkConfigurationRepositoryImpl$clearCacheAndStorage$2(this, j, null), 2).u0(continuation);
        return u0 == CoroutineSingletons.COROUTINE_SUSPENDED ? u0 : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SdkConfigurationRepositoryImpl$getOrUpdate$1 sdkConfigurationRepositoryImpl$getOrUpdate$1;
        int i;
        try {
            if (continuationImpl instanceof SdkConfigurationRepositoryImpl$getOrUpdate$1) {
                sdkConfigurationRepositoryImpl$getOrUpdate$1 = (SdkConfigurationRepositoryImpl$getOrUpdate$1) continuationImpl;
                int i2 = sdkConfigurationRepositoryImpl$getOrUpdate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sdkConfigurationRepositoryImpl$getOrUpdate$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sdkConfigurationRepositoryImpl$getOrUpdate$1.label;
                    if (i != 0) {
                        b.b(obj);
                        sdkConfigurationRepositoryImpl$getOrUpdate$1.label = 1;
                        obj = f(sdkConfigurationRepositoryImpl$getOrUpdate$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        b.b(obj);
                    }
                    noh nohVar = (noh) obj;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.L$0 = null;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.L$1 = null;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.L$2 = null;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.L$3 = null;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.I$0 = 0;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.I$1 = 0;
                    sdkConfigurationRepositoryImpl$getOrUpdate$1.label = 2;
                    Object k = nohVar.k(sdkConfigurationRepositoryImpl$getOrUpdate$1);
                    return k != obj2 ? obj2 : k;
                }
            }
            if (i != 0) {
            }
            noh nohVar2 = (noh) obj;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.L$0 = null;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.L$1 = null;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.L$2 = null;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.L$3 = null;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.I$0 = 0;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.I$1 = 0;
            sdkConfigurationRepositoryImpl$getOrUpdate$1.label = 2;
            Object k2 = nohVar2.k(sdkConfigurationRepositoryImpl$getOrUpdate$1);
            if (k2 != obj2) {
            }
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        sdkConfigurationRepositoryImpl$getOrUpdate$1 = new SdkConfigurationRepositoryImpl$getOrUpdate$1(this, continuationImpl);
        Object obj3 = sdkConfigurationRepositoryImpl$getOrUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkConfigurationRepositoryImpl$getOrUpdate$1.label;
    }

    public final Object e() {
        xnp0 xnp0Var;
        tje.N(this.e, this.f, null, new SdkConfigurationRepositoryImpl$getOrUpdateAsync$1(this, null), 2);
        try {
            l5d0 l5d0Var = (l5d0) this.l.getValue();
            if (l5d0Var == null || (xnp0Var = (xnp0) l5d0Var.getValue()) == null) {
                throw new IllegalStateException("Sdk config is absent");
            }
            return xnp0Var;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x0046, B:13:0x004a, B:22:0x0057), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        SdkConfigurationRepositoryImpl$getOrUpdateDeferred$1 sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1;
        int i;
        g050 g050Var;
        qoh qohVar;
        try {
            if (continuationImpl instanceof SdkConfigurationRepositoryImpl$getOrUpdateDeferred$1) {
                sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1 = (SdkConfigurationRepositoryImpl$getOrUpdateDeferred$1) continuationImpl;
                int i2 = sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.k;
                        sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.L$0 = aVar;
                        sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.I$0 = 0;
                        sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.label = 1;
                        if (aVar.a(sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.L$0;
                        b.b(obj);
                    }
                    qohVar = this.m;
                    if (qohVar != null) {
                        if (!qohVar.isActive()) {
                            qohVar = null;
                        }
                        if (qohVar == null) {
                        }
                        g050Var.d(null);
                        return qohVar;
                    }
                    qohVar = tje.h(this.e, this.f, null, new SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1(this, null), 2);
                    this.m = qohVar;
                    g050Var.d(null);
                    return qohVar;
                }
            }
            qohVar = this.m;
            if (qohVar != null) {
            }
            qohVar = tje.h(this.e, this.f, null, new SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1(this, null), 2);
            this.m = qohVar;
            g050Var.d(null);
            return qohVar;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1 = new SdkConfigurationRepositoryImpl$getOrUpdateDeferred$1(this, continuationImpl);
        Object obj2 = sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkConfigurationRepositoryImpl$getOrUpdateDeferred$1.label;
        if (i != 0) {
        }
    }
}
