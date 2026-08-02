package com.ybsdk.common;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ StartSessionCallSource w;
    public final /* synthetic */ String x;

    public d(vpr vprVar, e eVar, String str, StartSessionCallSource startSessionCallSource, String str2) {
        this.a = vprVar;
        this.b = eVar;
        this.c = str;
        this.w = startSessionCallSource;
        this.x = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r12.emit(r14, r8) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1 sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof SdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1) {
            sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1 = (SdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1) continuation;
            int i2 = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                SdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1 sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12 = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1;
                Object obj2 = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar2 = this.a;
                    sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.L$0 = vprVar2;
                    sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.label = 1;
                    Object d = this.b.d((Long) obj, this.c, null, false, this.w, this.x, sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12);
                    if (d != coroutineSingletons) {
                        obj2 = d;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.L$0;
                kotlin.b.b(obj2);
                sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.L$0 = null;
                sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$12.label = 2;
            }
        }
        sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1 = new SdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1(this, continuation);
        SdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1 sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$122 = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$1;
        Object obj22 = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$122.L$0 = null;
        sdkStateDispatcher$authorizeAndSendState$$inlined$map$1$2$122.label = 2;
    }
}
