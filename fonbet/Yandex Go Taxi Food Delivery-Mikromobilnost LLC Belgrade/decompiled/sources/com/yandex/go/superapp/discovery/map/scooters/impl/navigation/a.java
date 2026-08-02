package com.yandex.go.superapp.discovery.map.scooters.impl.navigation;

import com.yandex.go.scooters.domain.p;
import com.yandex.go.superapp.discovery.map.scooters.impl.experiments.c;
import defpackage.avv0;
import defpackage.cin0;
import defpackage.cyx;
import defpackage.epb;
import defpackage.fif;
import defpackage.h55;
import defpackage.jgc0;
import defpackage.khn;
import defpackage.kwv0;
import defpackage.l30;
import defpackage.m950;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.r3v;
import defpackage.rxn0;
import defpackage.tje;
import defpackage.wvn0;
import defpackage.xun0;
import defpackage.yio0;
import defpackage.yvf0;
import defpackage.yz4;
import defpackage.zuo0;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final cin0 D;
    public final rxn0 E;
    public final c F;
    public final yz4 G;
    public final avv0 H;
    public final yvf0 I;
    public final cyx J;
    public final fif K;
    public final p L;
    public final r3v M;
    public final kwv0 N;
    public khn O;
    public l30 P;

    public a(cin0 cin0Var, rxn0 rxn0Var, c cVar, yz4 yz4Var, avv0 avv0Var, yvf0 yvf0Var, cyx cyxVar, fif fifVar, p pVar, r3v r3vVar) {
        super(null);
        this.D = cin0Var;
        this.E = rxn0Var;
        this.F = cVar;
        this.G = yz4Var;
        this.H = avv0Var;
        this.I = yvf0Var;
        this.J = cyxVar;
        this.K = fifVar;
        this.L = pVar;
        this.M = r3vVar;
        this.N = new kwv0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1 superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1;
        int i;
        List list;
        aVar.getClass();
        if (continuationImpl instanceof SuperAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1) {
            superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1 = (SuperAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1) continuationImpl;
            int i2 = superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.label;
                if (i != 0) {
                    b.b(obj);
                    SuperAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$2 superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$2 = new SuperAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$2(aVar, null);
                    superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.label = 1;
                    obj = kotlinx.coroutines.a.w(1000L, superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$2, superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                list = (List) obj;
                if (list == null) {
                    return (zuo0) kotlin.collections.a.R(list);
                }
                return null;
            }
        }
        superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1 = new SuperAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1(aVar, continuationImpl);
        Object obj2 = superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapScootersRouterImpl$getActiveScootersSessionOrNull$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list == null) {
        }
    }

    public static final void Q(a aVar, wvn0 wvn0Var) {
        aVar.E.a.pollLast();
        khn khnVar = aVar.O;
        if (khnVar != null) {
            aVar.j(new epb(khnVar));
        }
        ((jgc0) aVar.M).detach();
        aVar.G.d();
        aVar.H.a(qoi0.a(xun0.class));
        aVar.D((m950) aVar.I.get(), wvn0Var, new yio0(18, aVar));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new SuperAppDiscoveryMapScootersRouterImpl$onAttach$1(this, null), 1);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.E.a.pollLast();
        khn khnVar = this.O;
        if (khnVar != null) {
            j(new epb(khnVar));
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.E.a.pollLast();
        this.O = null;
        l30 l30Var = this.P;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.P = null;
    }
}
