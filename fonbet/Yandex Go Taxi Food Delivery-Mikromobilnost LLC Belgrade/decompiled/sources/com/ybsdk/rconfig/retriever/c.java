package com.ybsdk.rconfig.retriever;

import defpackage.hnr0;
import defpackage.lrp0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.v8z0;
import defpackage.vpr;
import defpackage.x4c;
import defpackage.yui0;
import defpackage.zy11;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, hnr0 hnr0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:29|30|(2:32|27))|19|20|(1:24)|25))|35|6|7|(0)(0)|19|20|(2:22|24)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0039, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        r9 = new kotlin.Result.Failure(r8);
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, vpr] */
    /* JADX WARN: Type inference failed for: r7v8, types: [vpr] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1 remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1;
        int i;
        Throwable a;
        if (continuation instanceof RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1) {
            remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1 = (RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1) continuation;
            int i2 = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ?? r7 = this.a;
                    noh nohVar = ((yui0) obj).b;
                    remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.L$0 = r7;
                    remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label = 1;
                    obj2 = nohVar.k(remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1);
                    this = r7;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r72 = (vpr) remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.L$0;
                    kotlin.b.b(obj2);
                    this = r72;
                }
                Object failure = (v8z0) obj2;
                vpr vprVar = this;
                a = Result.a(failure);
                if (a != null && !(a instanceof CancellationException)) {
                    x4c.g("Failed to fetch result of remote config UpdateTask", a, null, Collections.singletonList(lrp0.y), 4);
                }
                Result result = new Result(failure);
                remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.L$0 = null;
                remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label = 2;
            }
        }
        remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1 = new RemoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1(this, continuation);
        Object obj22 = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Object failure2 = (v8z0) obj22;
        vpr vprVar2 = this;
        a = Result.a(failure2);
        if (a != null) {
            x4c.g("Failed to fetch result of remote config UpdateTask", a, null, Collections.singletonList(lrp0.y), 4);
        }
        Result result2 = new Result(failure2);
        remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.L$0 = null;
        remoteConfigRetrieverControllerImpl$awaitFirstFetchingResultgIAlus$$inlined$map$1$2$1.label = 2;
    }
}
