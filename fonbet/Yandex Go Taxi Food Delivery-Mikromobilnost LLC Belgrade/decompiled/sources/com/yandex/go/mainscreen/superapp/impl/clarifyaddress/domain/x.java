package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.ny61;
import defpackage.tig0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class x implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ tig0 c;

    public x(m0 m0Var, tls tlsVar, tig0 tig0Var) {
        this.a = m0Var;
        this.b = tlsVar;
        this.c = tig0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1 superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1) {
            superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1 = (SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1) continuation;
            int i2 = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w wVar = new w(vprVar, this.b, this.c);
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.L$0 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.L$1 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.L$2 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.label = 1;
                    if (this.a.collect(wVar, superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1 = new SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1(this, continuation);
        Object obj2 = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
