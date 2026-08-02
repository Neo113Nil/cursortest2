package com.yandex.go.agreement.trackable.repository;

import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zy11;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class b {
    public final wnt a;
    public final tt2 b;
    public final cne0 d;
    public final r0 c = bvf0.c(EmptySet.a);
    public final kotlinx.coroutines.sync.a e = gtq0.a();

    public b(tt2 tt2Var, wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.d = dne0Var.a("com.yandex.go.agreement.TrackableAcceptancesCacheRepository");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TrackableAcceptancesCacheRepositoryImpl$clearCache$1 trackableAcceptancesCacheRepositoryImpl$clearCache$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof TrackableAcceptancesCacheRepositoryImpl$clearCache$1) {
                trackableAcceptancesCacheRepositoryImpl$clearCache$1 = (TrackableAcceptancesCacheRepositoryImpl$clearCache$1) continuationImpl;
                int i2 = trackableAcceptancesCacheRepositoryImpl$clearCache$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    trackableAcceptancesCacheRepositoryImpl$clearCache$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = trackableAcceptancesCacheRepositoryImpl$clearCache$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackableAcceptancesCacheRepositoryImpl$clearCache$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.e;
                        trackableAcceptancesCacheRepositoryImpl$clearCache$1.L$0 = aVar;
                        trackableAcceptancesCacheRepositoryImpl$clearCache$1.label = 1;
                        if (aVar.a(trackableAcceptancesCacheRepositoryImpl$clearCache$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) trackableAcceptancesCacheRepositoryImpl$clearCache$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.d.a();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.d.a();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        trackableAcceptancesCacheRepositoryImpl$clearCache$1 = new TrackableAcceptancesCacheRepositoryImpl$clearCache$1(this, continuationImpl);
        Object obj2 = trackableAcceptancesCacheRepositoryImpl$clearCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptancesCacheRepositoryImpl$clearCache$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        TrackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1 trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof TrackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1) {
                trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1 = (TrackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1) continuationImpl;
                int i2 = trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.e;
                        trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.L$0 = aVar;
                        trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.label = 1;
                        if (aVar.a(trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.L$0;
                        kotlin.b.b(obj);
                    }
                    Set M0 = kotlin.collections.a.M0(this.d.e());
                    M0.addAll((Collection) this.c.getValue());
                    return M0;
                }
            }
            Set M02 = kotlin.collections.a.M0(this.d.e());
            M02.addAll((Collection) this.c.getValue());
            return M02;
        } finally {
            g050Var.d(null);
        }
        trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1 = new TrackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1(this, continuationImpl);
        Object obj2 = trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptancesCacheRepositoryImpl$getAllCachedIds$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:23|24))(1:25))(1:36)|26|27|(4:30|14|15|16)|29))|45|6|7|(0)(0)|26|27|(0)|29|(2:(0)|(1:41))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.agreement.trackable.repository.b, g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TrackableAcceptancesCacheRepositoryImpl$getCached$1 trackableAcceptancesCacheRepositoryImpl$getCached$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Object k0;
        Object obj;
        try {
            if (continuationImpl instanceof TrackableAcceptancesCacheRepositoryImpl$getCached$1) {
                trackableAcceptancesCacheRepositoryImpl$getCached$1 = (TrackableAcceptancesCacheRepositoryImpl$getCached$1) continuationImpl;
                int i2 = trackableAcceptancesCacheRepositoryImpl$getCached$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    trackableAcceptancesCacheRepositoryImpl$getCached$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = trackableAcceptancesCacheRepositoryImpl$getCached$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackableAcceptancesCacheRepositoryImpl$getCached$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        aVar = this.e;
                        trackableAcceptancesCacheRepositoryImpl$getCached$1.L$0 = aVar;
                        trackableAcceptancesCacheRepositoryImpl$getCached$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) trackableAcceptancesCacheRepositoryImpl$getCached$1.L$0;
                            try {
                                kotlin.b.b(obj2);
                                obj = (Set) obj2;
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable unused) {
                                obj = EmptySet.a;
                                g050Var.d(null);
                                return obj;
                            }
                            g050Var.d(null);
                            return obj;
                        }
                        ?? r2 = (g050) trackableAcceptancesCacheRepositoryImpl$getCached$1.L$0;
                        kotlin.b.b(obj2);
                        aVar = r2;
                    }
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1 trackableAcceptancesCacheRepositoryImpl$getCached$2$1$1 = new TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1(this, null);
                    trackableAcceptancesCacheRepositoryImpl$getCached$1.L$0 = aVar;
                    trackableAcceptancesCacheRepositoryImpl$getCached$1.label = 2;
                    k0 = tje.k0(mdhVar, trackableAcceptancesCacheRepositoryImpl$getCached$2$1$1, trackableAcceptancesCacheRepositoryImpl$getCached$1);
                    if (k0 != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj2 = k0;
                        g050Var = aVar2;
                        obj = (Set) obj2;
                        g050Var.d(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            this.b.getClass();
            sjh sjhVar2 = uyj.a;
            mdh mdhVar2 = mdh.b;
            TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1 trackableAcceptancesCacheRepositoryImpl$getCached$2$1$12 = new TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1(this, null);
            trackableAcceptancesCacheRepositoryImpl$getCached$1.L$0 = aVar;
            trackableAcceptancesCacheRepositoryImpl$getCached$1.label = 2;
            k0 = tje.k0(mdhVar2, trackableAcceptancesCacheRepositoryImpl$getCached$2$1$12, trackableAcceptancesCacheRepositoryImpl$getCached$1);
            if (k0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                d(null);
                throw th2;
            }
        }
        trackableAcceptancesCacheRepositoryImpl$getCached$1 = new TrackableAcceptancesCacheRepositoryImpl$getCached$1(this, continuationImpl);
        Object obj22 = trackableAcceptancesCacheRepositoryImpl$getCached$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptancesCacheRepositoryImpl$getCached$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|(1:(1:(5:10|11|12|13|14)(2:29|30))(1:31))(3:41|(1:43)|35)|32|33))|44|6|(0)(0)|32|33|(4:(0)|(1:24)|(1:20)|(3:36|13|14))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (defpackage.tje.k0(r9, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        r6 = r8;
        r8 = r7;
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(CachedTrackableAcceptance cachedTrackableAcceptance, ContinuationImpl continuationImpl) {
        TrackableAcceptancesCacheRepositoryImpl$saveToCache$1 trackableAcceptancesCacheRepositoryImpl$saveToCache$1;
        int i;
        CachedTrackableAcceptance cachedTrackableAcceptance2;
        g050 g050Var;
        g050 g050Var2;
        if (continuationImpl instanceof TrackableAcceptancesCacheRepositoryImpl$saveToCache$1) {
            trackableAcceptancesCacheRepositoryImpl$saveToCache$1 = (TrackableAcceptancesCacheRepositoryImpl$saveToCache$1) continuationImpl;
            int i2 = trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackableAcceptancesCacheRepositoryImpl$saveToCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$0 = cachedTrackableAcceptance;
                    kotlinx.coroutines.sync.a aVar = this.e;
                    trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$1 = aVar;
                    trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label = 1;
                    if (aVar.a(trackableAcceptancesCacheRepositoryImpl$saveToCache$1) != coroutineSingletons) {
                        cachedTrackableAcceptance2 = cachedTrackableAcceptance;
                        g050Var = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e) {
                        CancellationException e2 = e;
                        try {
                            throw e2;
                        } finally {
                        }
                    } catch (Throwable unused) {
                    }
                    g050Var2.d(null);
                    return zy11.a;
                }
                g050Var = (g050) trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$1;
                cachedTrackableAcceptance2 = (CachedTrackableAcceptance) trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$0;
                kotlin.b.b(obj);
                this.b.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1 trackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1 = new TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1(this, cachedTrackableAcceptance2, null);
                trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$0 = null;
                trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$1 = g050Var;
                trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label = 2;
            }
        }
        trackableAcceptancesCacheRepositoryImpl$saveToCache$1 = new TrackableAcceptancesCacheRepositoryImpl$saveToCache$1(this, continuationImpl);
        Object obj2 = trackableAcceptancesCacheRepositoryImpl$saveToCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label;
        if (i != 0) {
        }
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1 trackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$12 = new TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1(this, cachedTrackableAcceptance2, null);
        trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$0 = null;
        trackableAcceptancesCacheRepositoryImpl$saveToCache$1.L$1 = g050Var;
        trackableAcceptancesCacheRepositoryImpl$saveToCache$1.label = 2;
        g050Var2 = g050Var;
        g050Var2.d(null);
        return zy11.a;
    }
}
