package com.yandex.go.flex.main_screen.data.widgets.tracking;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.w131;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1 trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1) {
            trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1 = (TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    w131 w131Var = new w131("tracking_list_counters", new JSONObject((Map) obj));
                    trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(w131Var, trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1 = new TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingListCountersVariableLcpListener$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
