package com.yandex.go.superapp.discovery.map.scooters.impl.navigation;

import com.yandex.go.superapp.discovery.map.scooters.impl.experiments.SuperAppDiscoveryMapScootersExperiment;
import com.yandex.go.superapp.discovery.map.scooters.impl.experiments.c;
import defpackage.ain0;
import defpackage.bin0;
import defpackage.cin0;
import defpackage.dhn;
import defpackage.evu0;
import defpackage.khn;
import defpackage.l76;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ovn0;
import defpackage.p4g0;
import defpackage.pxm0;
import defpackage.qu;
import defpackage.tse;
import defpackage.vgn;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.scooters.impl.navigation.SuperAppDiscoveryMapScootersRouterImpl$onAttach$1", f = "SuperAppDiscoveryMapScootersRouterImpl.kt", l = {56, 62, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapScootersRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapScootersRouterImpl$onAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapScootersRouterImpl$onAttach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapScootersRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r15 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r15 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0042, code lost:
    
        if (r15 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        SuperAppDiscoveryMapScootersRouterImpl$onAttach$1 superAppDiscoveryMapScootersRouterImpl$onAttach$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            c cVar = this.this$0.F;
            this.label = 1;
            obj = cVar.a.b(this);
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                superAppDiscoveryMapScootersRouterImpl$onAttach$1 = this;
                zuo0 zuo0Var = (zuo0) obj;
                a aVar2 = superAppDiscoveryMapScootersRouterImpl$onAttach$1.this$0;
                if (zuo0Var != null) {
                    a.Q(aVar2, new ovn0(new pxm0("superapp_discovery_map", "detailed_order"), zuo0Var.getSessionId(), null));
                    return zy11Var;
                }
                aVar2.E.a.offer(aVar2.N);
                khn khnVar = aVar2.O;
                if (khnVar != null) {
                    aVar2.z(khnVar, new p4g0(aVar2, 14));
                }
                return zy11Var;
            }
            aVar = (a) this.L$1;
            b.b(obj);
            superAppDiscoveryMapScootersRouterImpl$onAttach$1 = this;
            vgn vgnVar = (vgn) obj;
            aVar.O = vgnVar != null ? vgnVar.a : null;
            a aVar3 = superAppDiscoveryMapScootersRouterImpl$onAttach$1.this$0;
            superAppDiscoveryMapScootersRouterImpl$onAttach$1.L$0 = null;
            superAppDiscoveryMapScootersRouterImpl$onAttach$1.L$1 = null;
            superAppDiscoveryMapScootersRouterImpl$onAttach$1.label = 3;
            obj = a.P(aVar3, superAppDiscoveryMapScootersRouterImpl$onAttach$1);
        }
        SuperAppDiscoveryMapScootersExperiment superAppDiscoveryMapScootersExperiment = (SuperAppDiscoveryMapScootersExperiment) obj;
        boolean b = superAppDiscoveryMapScootersExperiment.getB();
        SuperAppDiscoveryMapScootersExperiment.EboksParams eboksParams = superAppDiscoveryMapScootersExperiment.c;
        boolean z = (!b || evu0.J(eboksParams.a) || evu0.J(eboksParams.b)) ? false : true;
        aVar = this.this$0;
        if (!z) {
            aVar.r(new qu(9));
            return zy11Var;
        }
        cin0 cin0Var = aVar.D;
        String str = eboksParams.a;
        String str2 = eboksParams.b;
        this.L$0 = null;
        this.L$1 = aVar;
        this.label = 2;
        superAppDiscoveryMapScootersRouterImpl$onAttach$1 = this;
        obj = cin0Var.a.a(new dhn(str, str2), new ain0(), new bin0(cin0Var), l76.C, superAppDiscoveryMapScootersRouterImpl$onAttach$1);
    }
}
