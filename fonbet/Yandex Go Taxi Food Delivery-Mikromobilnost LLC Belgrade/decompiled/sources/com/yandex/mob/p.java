package com.yandex.mob;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public abstract class p {
    public static final kotlinx.coroutines.sync.a a = gtq0.a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(String str, ContinuationImpl continuationImpl) {
        TracerouteKt$traceRoute$1 tracerouteKt$traceRoute$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof TracerouteKt$traceRoute$1) {
                tracerouteKt$traceRoute$1 = (TracerouteKt$traceRoute$1) continuationImpl;
                int i2 = tracerouteKt$traceRoute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tracerouteKt$traceRoute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = tracerouteKt$traceRoute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = tracerouteKt$traceRoute$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        tracerouteKt$traceRoute$1.L$0 = str;
                        aVar = a;
                        tracerouteKt$traceRoute$1.L$1 = aVar;
                        tracerouteKt$traceRoute$1.I$0 = 0;
                        tracerouteKt$traceRoute$1.label = 1;
                        if (aVar.a(tracerouteKt$traceRoute$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (g050) tracerouteKt$traceRoute$1.L$1;
                        String str2 = (String) tracerouteKt$traceRoute$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r5;
                        str = str2;
                    }
                    NativeTraceroute nativeTraceroute = NativeTraceroute.INSTANCE;
                    nativeTraceroute.clearResult();
                    return nativeTraceroute.traceRoute(str);
                }
            }
            NativeTraceroute nativeTraceroute2 = NativeTraceroute.INSTANCE;
            nativeTraceroute2.clearResult();
            return nativeTraceroute2.traceRoute(str);
        } finally {
            aVar.d(null);
        }
        tracerouteKt$traceRoute$1 = new TracerouteKt$traceRoute$1(continuationImpl);
        Object obj2 = tracerouteKt$traceRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tracerouteKt$traceRoute$1.label;
        if (i != 0) {
        }
    }
}
