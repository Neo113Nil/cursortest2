package com.ybsdk.screens.registration.applicationstatus.presentation;

import com.ybsdk.api.YBSdkScenarioResultReceiver$RegistrationResult;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import defpackage.bqi0;
import defpackage.jl40;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.o2e0;
import defpackage.p2e0;
import defpackage.pz40;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.tls;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ wls a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ tls x;

    public b(wls wlsVar, c cVar, String str, tls tlsVar, tls tlsVar2) {
        this.a = wlsVar;
        this.b = cVar;
        this.c = str;
        this.w = tlsVar;
        this.x = tlsVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(s2e0 s2e0Var, Continuation continuation) {
        RegistrationApplicationStatusViewModel$pollStatus$6$emit$1 registrationApplicationStatusViewModel$pollStatus$6$emit$1;
        int i;
        r0 r0Var;
        Object value;
        YBProduct product;
        String e0;
        String str;
        if (continuation instanceof RegistrationApplicationStatusViewModel$pollStatus$6$emit$1) {
            registrationApplicationStatusViewModel$pollStatus$6$emit$1 = (RegistrationApplicationStatusViewModel$pollStatus$6$emit$1) continuation;
            int i2 = registrationApplicationStatusViewModel$pollStatus$6$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationApplicationStatusViewModel$pollStatus$6$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationApplicationStatusViewModel$pollStatus$6$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationApplicationStatusViewModel$pollStatus$6$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (s2e0Var instanceof q2e0) {
                        registrationApplicationStatusViewModel$pollStatus$6$emit$1.L$0 = s2e0Var;
                        registrationApplicationStatusViewModel$pollStatus$6$emit$1.label = 1;
                        if (this.a.invoke(s2e0Var, registrationApplicationStatusViewModel$pollStatus$6$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (s2e0Var instanceof n2e0) {
                        Throwable th = ((n2e0) s2e0Var).a;
                        ApplicationStatusFailedException applicationStatusFailedException = th instanceof ApplicationStatusFailedException ? (ApplicationStatusFailedException) th : null;
                        if (applicationStatusFailedException != null) {
                            this.x.invoke(applicationStatusFailedException);
                        }
                    } else if (jl40.l(s2e0Var, r2e0.a)) {
                        c cVar = this.b;
                        pz40 Y = cVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                            product = cVar.B.getProduct();
                            e0 = cVar.e0(null);
                            str = this.c;
                        } while (!r0Var.k(value, new bqi0(str, product, e0)));
                        cVar.H.b(YBSdkScenarioResultReceiver$RegistrationResult.FAIL, str);
                    } else if (!jl40.l(s2e0Var, o2e0.a) && !(s2e0Var instanceof p2e0)) {
                        w511.b();
                        return null;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s2e0Var = (s2e0) registrationApplicationStatusViewModel$pollStatus$6$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                this.w.invoke(s2e0Var);
                return zy11.a;
            }
        }
        registrationApplicationStatusViewModel$pollStatus$6$emit$1 = new RegistrationApplicationStatusViewModel$pollStatus$6$emit$1(this, continuation);
        Object obj2 = registrationApplicationStatusViewModel$pollStatus$6$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationApplicationStatusViewModel$pollStatus$6$emit$1.label;
        if (i != 0) {
        }
        this.w.invoke(s2e0Var);
        return zy11.a;
    }
}
