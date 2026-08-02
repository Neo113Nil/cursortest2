package com.ybsdk.rconfig.retriever;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechGetRemoteConfigAwaitUpdateResultResult;
import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import defpackage.fcy0;
import defpackage.ffx;
import defpackage.fzw;
import defpackage.gff;
import defpackage.h3y;
import defpackage.i5z0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.v8z0;
import defpackage.xui0;
import defpackage.yui0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class d implements xui0 {
    public final gff a;
    public final f b;
    public final tse c;
    public final com.ybsdk.rconfig.b d;
    public final a e;
    public final h3y f;
    public final AppAnalyticsReporter g;
    public final n0 h = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
    public volatile InternalSdkState i;
    public volatile yui0 j;

    public d(gff gffVar, f fVar, tse tseVar, com.ybsdk.rconfig.b bVar, a aVar, h3y h3yVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = gffVar;
        this.b = fVar;
        this.c = tseVar;
        this.d = bVar;
        this.e = aVar;
        this.f = h3yVar;
        this.g = appAnalyticsReporter;
    }

    public static void c(d dVar, InternalSdkState internalSdkState, RemoteConfigUpdateTrigger remoteConfigUpdateTrigger) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        i5z0.a.a("createRemoteConfigDeferred " + remoteConfigUpdateTrigger, new Object[0]);
        yui0 yui0Var = dVar.j;
        if (yui0Var != null) {
            yui0Var.b.a(null);
        }
        dVar.h.f();
        yui0 yui0Var2 = new yui0(internalSdkState, tje.h(dVar.c, null, coroutineStart, new RemoteConfigRetrieverControllerImpl$createUpdateTask$1(dVar, internalSdkState, remoteConfigUpdateTrigger, null), 1));
        dVar.j = yui0Var2;
        dVar.h.g(yui0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n0 n0Var, ContinuationImpl continuationImpl) {
        RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1 remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1;
        int i;
        if (continuationImpl instanceof RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1) {
            remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1 = (RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1) continuationImpl;
            int i2 = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fzw fzwVar = new fzw(21, n0Var, n0Var);
                    remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.label = 1;
                    obj = e.y(fzwVar, remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1);
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
                return ((Result) obj).getValue();
            }
        }
        remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1 = new RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1(this, continuationImpl);
        Object obj2 = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0064, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        RemoteConfigRetrieverControllerImpl$awaitUpdate$1 remoteConfigRetrieverControllerImpl$awaitUpdate$1;
        int i;
        Object d;
        Object a;
        v8z0 v8z0Var;
        Object obj;
        if (continuationImpl instanceof RemoteConfigRetrieverControllerImpl$awaitUpdate$1) {
            remoteConfigRetrieverControllerImpl$awaitUpdate$1 = (RemoteConfigRetrieverControllerImpl$awaitUpdate$1) continuationImpl;
            int i2 = remoteConfigRetrieverControllerImpl$awaitUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetrieverControllerImpl$awaitUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = remoteConfigRetrieverControllerImpl$awaitUpdate$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetrieverControllerImpl$awaitUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.g.m0.a.a("tech.get_remote_config.await_update.start", null);
                    remoteConfigRetrieverControllerImpl$awaitUpdate$1.label = 1;
                    d = d(remoteConfigRetrieverControllerImpl$awaitUpdate$1);
                } else if (i == 1) {
                    kotlin.b.b(obj2);
                    d = ((Result) obj2).getValue();
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        boolean z = obj instanceof Result.Failure;
                        Object obj4 = obj;
                        if (z) {
                            obj4 = null;
                        }
                        v8z0Var = (v8z0) obj4;
                        if (v8z0Var == null) {
                            v8z0Var = new v8z0(new Result(new Result.Failure(new IllegalStateException("Failed to get remote config fetching result"))), kp50.U(-1, DurationUnit.SECONDS));
                        }
                        fcy0 fcy0Var = this.g.m0;
                        TechEvents$TechGetRemoteConfigAwaitUpdateResultResult techEvents$TechGetRemoteConfigAwaitUpdateResultResult = v8z0Var.a.getValue() instanceof Result.Failure ? TechEvents$TechGetRemoteConfigAwaitUpdateResultResult.OK : TechEvents$TechGetRemoteConfigAwaitUpdateResultResult.ERROR;
                        Throwable a2 = Result.a(v8z0Var.a.getValue());
                        fcy0Var.d(techEvents$TechGetRemoteConfigAwaitUpdateResultResult, a2 != null ? a2.getMessage() : null);
                        return v8z0Var;
                    }
                    kotlin.b.b(obj2);
                    a = ((Result) obj2).getValue();
                    if (a instanceof Result.Failure) {
                        a = null;
                    }
                    if (((v8z0) a) == null || !(!(r9.a.getValue() instanceof Result.Failure))) {
                        c(this, this.i, RemoteConfigUpdateTrigger.RETRY);
                    }
                    n0 n0Var = this.h;
                    remoteConfigRetrieverControllerImpl$awaitUpdate$1.label = 3;
                    Object a3 = a(n0Var, remoteConfigRetrieverControllerImpl$awaitUpdate$1);
                    obj = a3;
                }
                if (!(d instanceof Result.Failure)) {
                    fcy0 fcy0Var2 = this.g.m0;
                    TechEvents$TechGetRemoteConfigAwaitUpdateResultResult techEvents$TechGetRemoteConfigAwaitUpdateResultResult2 = TechEvents$TechGetRemoteConfigAwaitUpdateResultResult.ERROR;
                    Throwable a4 = Result.a(d);
                    fcy0Var2.d(techEvents$TechGetRemoteConfigAwaitUpdateResultResult2, a4 != null ? a4.getMessage() : null);
                    v8z0Var = new v8z0(new Result(d), kp50.U(-1, DurationUnit.SECONDS));
                    fcy0 fcy0Var3 = this.g.m0;
                    if (v8z0Var.a.getValue() instanceof Result.Failure) {
                    }
                    Throwable a22 = Result.a(v8z0Var.a.getValue());
                    fcy0Var3.d(techEvents$TechGetRemoteConfigAwaitUpdateResultResult, a22 != null ? a22.getMessage() : null);
                    return v8z0Var;
                }
                n0 n0Var2 = this.h;
                remoteConfigRetrieverControllerImpl$awaitUpdate$1.label = 2;
                a = a(n0Var2, remoteConfigRetrieverControllerImpl$awaitUpdate$1);
            }
        }
        remoteConfigRetrieverControllerImpl$awaitUpdate$1 = new RemoteConfigRetrieverControllerImpl$awaitUpdate$1(this, continuationImpl);
        Object obj22 = remoteConfigRetrieverControllerImpl$awaitUpdate$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetrieverControllerImpl$awaitUpdate$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        RemoteConfigRetrieverControllerImpl$updateSessionUuid$1 remoteConfigRetrieverControllerImpl$updateSessionUuid$1;
        int i;
        InternalSdkState internalSdkState;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof RemoteConfigRetrieverControllerImpl$updateSessionUuid$1) {
            remoteConfigRetrieverControllerImpl$updateSessionUuid$1 = (RemoteConfigRetrieverControllerImpl$updateSessionUuid$1) continuationImpl;
            int i2 = remoteConfigRetrieverControllerImpl$updateSessionUuid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetrieverControllerImpl$updateSessionUuid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = remoteConfigRetrieverControllerImpl$updateSessionUuid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetrieverControllerImpl$updateSessionUuid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.a.f == null) {
                        com.ybsdk.common.e eVar = (com.ybsdk.common.e) this.f.get();
                        StartSessionCallSource.RemoteConfig remoteConfig = StartSessionCallSource.RemoteConfig.INSTANCE;
                        remoteConfigRetrieverControllerImpl$updateSessionUuid$1.label = 1;
                        obj = eVar.c(remoteConfig, remoteConfigRetrieverControllerImpl$updateSessionUuid$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                internalSdkState = (InternalSdkState) obj;
                if (internalSdkState instanceof InternalSdkState.Error) {
                    return new Result.Failure(((InternalSdkState.Error) internalSdkState).getT());
                }
                return zy11Var;
            }
        }
        remoteConfigRetrieverControllerImpl$updateSessionUuid$1 = new RemoteConfigRetrieverControllerImpl$updateSessionUuid$1(this, continuationImpl);
        Object obj2 = remoteConfigRetrieverControllerImpl$updateSessionUuid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetrieverControllerImpl$updateSessionUuid$1.label;
        if (i != 0) {
        }
        internalSdkState = (InternalSdkState) obj2;
        if (internalSdkState instanceof InternalSdkState.Error) {
        }
        return zy11Var;
    }
}
