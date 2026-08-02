package com.yandex.go.payments.deeplink;

import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.cba0;
import defpackage.h3y;
import defpackage.hb0;
import defpackage.hxx;
import defpackage.la0;
import defpackage.m2v;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.sls;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.go.lifecycle.a a;
    public final yvf0 b;
    public final hb0 c;
    public final h3y d;

    public a(com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, hb0 hb0Var, h3y h3yVar) {
        this.a = aVar;
        this.b = yvf0Var;
        this.c = hb0Var;
        this.d = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, v770 v770Var, sls slsVar, ContinuationImpl continuationImpl) {
        AddCreditCardDeeplinkLauncherImpl$launch$1 addCreditCardDeeplinkLauncherImpl$launch$1;
        int i;
        if (continuationImpl instanceof AddCreditCardDeeplinkLauncherImpl$launch$1) {
            addCreditCardDeeplinkLauncherImpl$launch$1 = (AddCreditCardDeeplinkLauncherImpl$launch$1) continuationImpl;
            int i2 = addCreditCardDeeplinkLauncherImpl$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addCreditCardDeeplinkLauncherImpl$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addCreditCardDeeplinkLauncherImpl$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addCreditCardDeeplinkLauncherImpl$launch$1.label;
                if (i != 0) {
                    b.b(obj);
                    addCreditCardDeeplinkLauncherImpl$launch$1.L$0 = oep0Var;
                    addCreditCardDeeplinkLauncherImpl$launch$1.L$1 = v770Var;
                    addCreditCardDeeplinkLauncherImpl$launch$1.L$2 = slsVar;
                    addCreditCardDeeplinkLauncherImpl$launch$1.label = 1;
                    if (this.a.a(addCreditCardDeeplinkLauncherImpl$launch$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar = (sls) addCreditCardDeeplinkLauncherImpl$launch$1.L$2;
                    v770Var = (v770) addCreditCardDeeplinkLauncherImpl$launch$1.L$1;
                    oep0Var = (oep0) addCreditCardDeeplinkLauncherImpl$launch$1.L$0;
                    b.b(obj);
                }
                boolean z = !((i) ((cba0) this.d.get())).f();
                m2v m2vVar = new m2v(((i) this.c.a).v.a());
                m2vVar.A(z);
                ((pep0) oep0Var).f((m950) this.b.get(), new la0(m2vVar.e(), v770Var, slsVar), hxx.a);
                return zy11.a;
            }
        }
        addCreditCardDeeplinkLauncherImpl$launch$1 = new AddCreditCardDeeplinkLauncherImpl$launch$1(this, continuationImpl);
        Object obj2 = addCreditCardDeeplinkLauncherImpl$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addCreditCardDeeplinkLauncherImpl$launch$1.label;
        if (i != 0) {
        }
        boolean z2 = !((i) ((cba0) this.d.get())).f();
        m2v m2vVar2 = new m2v(((i) this.c.a).v.a());
        m2vVar2.A(z2);
        ((pep0) oep0Var).f((m950) this.b.get(), new la0(m2vVar2.e(), v770Var, slsVar), hxx.a);
        return zy11.a;
    }
}
