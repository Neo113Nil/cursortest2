package com.yandex.go.scooters.deeplink;

import android.net.Uri;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.m5u;
import defpackage.m950;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.s4b1;
import defpackage.vu2;
import defpackage.yvf0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes8.dex */
public final class a implements vu2 {
    public final com.yandex.go.lifecycle.a a;
    public final h3y b;
    public final yvf0 c;

    public a(com.yandex.go.lifecycle.a aVar, h3y h3yVar, yvf0 yvf0Var) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = yvf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oep0 oep0Var, Uri uri, Continuation continuation) {
        ScootersAppLinkHandler$process$1 scootersAppLinkHandler$process$1;
        int i;
        odn0 odn0Var;
        oep0 oep0Var2;
        odn0 odn0Var2;
        if (continuation instanceof ScootersAppLinkHandler$process$1) {
            scootersAppLinkHandler$process$1 = (ScootersAppLinkHandler$process$1) continuation;
            int i2 = scootersAppLinkHandler$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAppLinkHandler$process$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersAppLinkHandler$process$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAppLinkHandler$process$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = (q) this.b.get();
                    scootersAppLinkHandler$process$1.L$0 = oep0Var;
                    scootersAppLinkHandler$process$1.L$1 = null;
                    scootersAppLinkHandler$process$1.label = 1;
                    obj = qVar.p(uri, scootersAppLinkHandler$process$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        odn0Var2 = (odn0) scootersAppLinkHandler$process$1.L$2;
                        oep0Var2 = (oep0) scootersAppLinkHandler$process$1.L$0;
                        kotlin.b.b(obj);
                        ((pep0) oep0Var2).f((m950) this.c.get(), s4b1.c(odn0Var2), hxx.a);
                        return new m5u(false, false);
                    }
                    oep0Var = (oep0) scootersAppLinkHandler$process$1.L$0;
                    kotlin.b.b(obj);
                }
                odn0Var = (odn0) obj;
                if (odn0Var != null) {
                    return n5u.a;
                }
                scootersAppLinkHandler$process$1.L$0 = oep0Var;
                scootersAppLinkHandler$process$1.L$1 = null;
                scootersAppLinkHandler$process$1.L$2 = odn0Var;
                scootersAppLinkHandler$process$1.label = 2;
                if (this.a.a(scootersAppLinkHandler$process$1) != coroutineSingletons) {
                    oep0Var2 = oep0Var;
                    odn0Var2 = odn0Var;
                    ((pep0) oep0Var2).f((m950) this.c.get(), s4b1.c(odn0Var2), hxx.a);
                    return new m5u(false, false);
                }
                return coroutineSingletons;
            }
        }
        scootersAppLinkHandler$process$1 = new ScootersAppLinkHandler$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersAppLinkHandler$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAppLinkHandler$process$1.label;
        if (i != 0) {
        }
        odn0Var = (odn0) obj2;
        if (odn0Var != null) {
        }
    }
}
