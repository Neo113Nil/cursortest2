package com.apollographql.apollo3.network.http;

import defpackage.ny61;
import defpackage.ovu;
import defpackage.tko;
import defpackage.to2;
import defpackage.uo2;
import defpackage.vo2;
import defpackage.vpr;
import defpackage.xvu;
import defpackage.zy11;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ to2 c;
    public final /* synthetic */ xvu w;

    public a(vpr vprVar, c cVar, to2 to2Var, xvu xvuVar, long j) {
        this.a = vprVar;
        this.b = cVar;
        this.c = to2Var;
        this.w = xvuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1) {
            httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 = (HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    UUID uuid = this.c.b;
                    this.b.getClass();
                    uo2 a = ((vo2) obj).a();
                    a.c = uuid;
                    xvu xvuVar = this.w;
                    a.x = ((tko) a.x).b(new ovu(xvuVar.a, xvuVar.b));
                    vo2 a2 = a.a();
                    httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a2, httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 = new HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
