package com.yandex.go.scooters;

import android.content.Context;
import com.yandex.go.scooters.background.ScootersBackgroundModalView;
import defpackage.alo0;
import defpackage.blo0;
import defpackage.c0g;
import defpackage.c21;
import defpackage.d6o0;
import defpackage.da0;
import defpackage.e6o0;
import defpackage.ewn0;
import defpackage.f6o0;
import defpackage.fko0;
import defpackage.fva0;
import defpackage.g6o0;
import defpackage.i5m;
import defpackage.jl40;
import defpackage.jvn0;
import defpackage.kvn0;
import defpackage.len0;
import defpackage.lvn0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.mvn0;
import defpackage.nvn0;
import defpackage.ny61;
import defpackage.ouo0;
import defpackage.ovn0;
import defpackage.p7g;
import defpackage.pvn0;
import defpackage.q5z;
import defpackage.qvn0;
import defpackage.rvn0;
import defpackage.svn0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvn0;
import defpackage.uvn0;
import defpackage.vu8;
import defpackage.vvn0;
import defpackage.w030;
import defpackage.w511;
import defpackage.wko0;
import defpackage.wls;
import defpackage.wvn0;
import defpackage.xko0;
import defpackage.xzm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ScootersRouterImpl$onAttach$1", f = "ScootersRouterImpl.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ wvn0 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRouterImpl$onAttach$1(d dVar, wvn0 wvn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = wvn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRouterImpl$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object T;
        g6o0 e6o0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        c21 c21Var = sy60.Q2;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            dVar.getClass();
            ((ewn0) dVar.N.get()).c();
            ((ewn0) this.this$0.O.get()).c();
            d dVar2 = this.this$0;
            wvn0 wvn0Var = this.$payload;
            this.label = 1;
            tje.N(dVar2.o(), null, null, new ScootersRouterImpl$fetchUserPosition$1(dVar2, null), 3);
            boolean z = wvn0Var instanceof qvn0;
            if (!z && !(wvn0Var instanceof pvn0)) {
                p7g Q = dVar2.Q();
                c0g c0gVar = (c0g) Q.a;
                w030 C2 = c0gVar.C2();
                q5z.h(C2);
                Context e2 = c0gVar.e2();
                q5z.h(e2);
                dVar2.z(new da0(19, C2, new ScootersBackgroundModalView(e2), (xzm0) Q.y2.get()), c21Var);
                p7g Q2 = dVar2.Q();
                c0g c0gVar2 = (c0g) Q2.a;
                Context e22 = c0gVar2.e2();
                q5z.h(e22);
                fva0 F2 = c0gVar2.F2();
                q5z.h(F2);
                c0g c0gVar3 = c0gVar2.A.a.b;
                dVar2.z(new vu8(e22, F2, new fko0(i5m.a(c0gVar3.V5), i5m.a(c0gVar3.be)), (xzm0) Q2.y2.get()), c21Var);
            }
            if (jl40.l(wvn0Var, vvn0.b)) {
                T = dVar2.U(this);
            } else {
                if (wvn0Var instanceof ovn0) {
                    ovn0 ovn0Var = (ovn0) wvn0Var;
                    nvn0 nvn0Var = ovn0Var.c;
                    if (jl40.l(nvn0Var, kvn0.a)) {
                        e6o0Var = d6o0.a;
                    } else if (nvn0Var instanceof lvn0) {
                        e6o0Var = new e6o0(new len0(((lvn0) nvn0Var).a));
                    } else if (nvn0Var instanceof mvn0) {
                        e6o0Var = new f6o0(((mvn0) nvn0Var).a);
                    } else {
                        if (nvn0Var != null) {
                            w511.b();
                            return null;
                        }
                        e6o0Var = new e6o0(null);
                    }
                    d.W(dVar2, e6o0Var, ovn0Var.b, null, 4);
                } else if (wvn0Var instanceof rvn0) {
                    d.X(dVar2, wvn0Var, null, null, 30);
                } else if (wvn0Var instanceof tvn0) {
                    dVar2.V(new blo0(wvn0Var.a), new ScootersRouterImpl$realScanQrLaunch$1(0, dVar2, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                } else if (wvn0Var instanceof uvn0) {
                    uvn0 uvn0Var = (uvn0) wvn0Var;
                    dVar2.V(new alo0(uvn0Var.a, uvn0Var.b, uvn0Var.c), new ScootersRouterImpl$handleLaunchMode$2(0, dVar2, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                } else if (wvn0Var instanceof jvn0) {
                    T = dVar2.R((jvn0) wvn0Var, this);
                } else if (wvn0Var instanceof svn0) {
                    T = dVar2.T((svn0) wvn0Var, this);
                } else if (z) {
                    qvn0 qvn0Var = (qvn0) wvn0Var;
                    dVar2.V(new xko0(qvn0Var.a, null, qvn0Var.b), new ScootersRouterImpl$handleDirectSuperPassesLaunch$1(0, dVar2, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                } else {
                    if (!(wvn0Var instanceof pvn0)) {
                        w511.b();
                        return null;
                    }
                    pvn0 pvn0Var = (pvn0) wvn0Var;
                    dVar2.V(new wko0(pvn0Var.a, pvn0Var.b), new ScootersRouterImpl$handleDirectActiveSuperPassesLaunch$1(0, dVar2, d.class, "exitToDiscoveryOrGoBack", "exitToDiscoveryOrGoBack()V", 0));
                }
                T = zy11Var;
            }
            if (T == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        d dVar3 = this.this$0;
        dVar3.z((m950) dVar3.K.get(), c21Var);
        this.this$0.M.a.a(ouo0.a(this.$payload));
        return zy11Var;
    }
}
