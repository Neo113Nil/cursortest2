package com.yandex.messaging.ui.main.telemessenger.connection;

import defpackage.a6t0;
import defpackage.j73;
import defpackage.k5e;
import defpackage.lgv;
import defpackage.m0t0;
import defpackage.mgv;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.qnm;
import defpackage.r5e;
import defpackage.rzo;
import defpackage.tm91;
import defpackage.tse0;
import defpackage.uq90;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xk91;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import skeletor.render.SkeletonContentView;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar, r5e r5eVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ConnectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1 connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1;
        int i;
        k5e k5eVar = k5e.f;
        k5e k5eVar2 = k5e.i;
        if (continuation instanceof ConnectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1) {
            connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1 = (ConnectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1) continuation;
            int i2 = connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.label;
                mgv mgvVar = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k5e k5eVar3 = (k5e) obj;
                    Integer c = k5eVar3.c();
                    k5e k5eVar4 = k5e.c;
                    if (!k5eVar3.equals(k5eVar4) && !k5eVar3.equals(k5eVar2) && !k5eVar3.equals(k5e.d) && !k5eVar3.equals(k5e.k) && !k5eVar3.equals(k5eVar)) {
                        if (k5eVar3.equals(k5e.h)) {
                            qnm qnmVar = qnm.a;
                            mgvVar = tm91.a;
                            if (mgvVar == null) {
                                lgv lgvVar = new lgv("WifiOffOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                                uq90 e = nnm.e(6.5f, 2.0f);
                                e.d(7.867f, 3.953f, 9.024f, 5.629f, 10.077f, 7.166f);
                                e.h(15.977f, 15.838f);
                                e.d(17.031f, 17.375f, 18.188f, 19.052f, 19.555f, 21.005f);
                                e.f(17.055f);
                                e.h(14.56f, 17.372f);
                                e.h(12.005f, 20.0f);
                                e.h(9.252f, 17.168f);
                                e.d(9.955f, 16.448f, 10.925f, 16.003f, 11.995f, 16.003f);
                                e.d(12.737f, 16.003f, 13.431f, 16.216f, 14.021f, 16.587f);
                                e.h(12.248f, 14.007f);
                                e.h(11.995f, 14.003f);
                                e.d(10.387f, 14.003f, 8.931f, 14.672f, 7.876f, 15.754f);
                                e.h(6.501f, 14.339f);
                                e.d(7.669f, 13.14f, 9.207f, 12.321f, 10.923f, 12.077f);
                                e.h(9.716f, 10.32f);
                                e.d(7.942f, 10.715f, 6.403f, 11.614f, 5.126f, 12.925f);
                                e.h(3.751f, 11.51f);
                                e.d(5.109f, 10.115f, 6.687f, 9.12f, 8.519f, 8.577f);
                                e.h(7.333f, 6.852f);
                                e.d(5.449f, 7.545f, 3.779f, 8.653f, 2.375f, 10.096f);
                                e.h(1.0f, 8.681f);
                                e.d(2.493f, 7.147f, 4.201f, 5.939f, 6.154f, 5.136f);
                                e.h(4.0f, 2.0f);
                                e.f(6.5f);
                                e.c();
                                e.j(15.665f, 12.946f);
                                e.d(16.343f, 13.32f, 16.96f, 13.794f, 17.499f, 14.349f);
                                tse0.u(e, 16.993f, 14.869f, 15.665f, 12.946f);
                                e.j(12.251f, 8.004f);
                                e.d(15.373f, 8.073f, 18.194f, 9.403f, 20.25f, 11.519f);
                                e.h(18.874f, 12.934f);
                                e.d(17.505f, 11.524f, 15.729f, 10.533f, 13.742f, 10.162f);
                                e.h(12.251f, 8.004f);
                                e.c();
                                e.j(11.995f, 4.0f);
                                e.d(16.293f, 4.0f, 20.184f, 5.793f, 23.0f, 8.69f);
                                e.h(21.625f, 10.104f);
                                e.d(19.161f, 7.569f, 15.756f, 6.001f, 11.995f, 6.001f);
                                e.d(11.626f, 6.001f, 11.26f, 6.015f, 10.898f, 6.045f);
                                e.h(9.614f, 4.187f);
                                e.d(10.391f, 4.064f, 11.186f, 4.0f, 11.995f, 4.0f);
                                e.c();
                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                mgvVar = lgvVar.d();
                                tm91.a = mgvVar;
                            }
                        } else {
                            if (!k5eVar3.equals(k5e.g) && !k5eVar3.equals(k5e.j) && !k5eVar3.equals(k5e.e) && !k5eVar3.equals(k5e.l)) {
                                w511.b();
                                return null;
                            }
                            qnm qnmVar2 = qnm.a;
                            mgvVar = xk91.b();
                        }
                    }
                    m0t0 m0t0Var = new m0t0(c, mgvVar, k5eVar3.b(), k5eVar3.a(), j73.y(new k5e[]{k5eVar4, k5eVar2, k5eVar}, k5eVar3));
                    connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(m0t0Var, connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1) == coroutineSingletons) {
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
        connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1 = new ConnectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1(this, continuation);
        Object obj22 = connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = connectionStatusViewModel$getDisplayedConnectionStatus$$inlined$map$1$2$1.label;
        mgv mgvVar2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
