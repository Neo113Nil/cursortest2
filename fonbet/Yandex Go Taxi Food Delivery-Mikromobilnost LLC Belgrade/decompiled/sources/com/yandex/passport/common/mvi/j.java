package com.yandex.passport.common.mvi;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.e9;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.m;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.d0;
import com.yandex.passport.internal.ui.bouncer.model.d2;
import com.yandex.passport.internal.ui.bouncer.model.e2;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.g1;
import com.yandex.passport.internal.ui.bouncer.model.g2;
import com.yandex.passport.internal.ui.bouncer.model.h2;
import com.yandex.passport.internal.ui.bouncer.model.i2;
import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.k2;
import com.yandex.passport.internal.ui.bouncer.model.l;
import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.m2;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import com.yandex.passport.internal.ui.bouncer.model.o;
import com.yandex.passport.internal.ui.bouncer.model.o2;
import com.yandex.passport.internal.ui.bouncer.model.p2;
import com.yandex.passport.internal.ui.bouncer.model.q2;
import com.yandex.passport.internal.ui.bouncer.model.r;
import com.yandex.passport.internal.ui.bouncer.model.s;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t;
import com.yandex.passport.internal.ui.bouncer.model.v;
import com.yandex.passport.internal.ui.bouncer.model.x;
import com.yandex.passport.internal.ui.bouncer.model.z;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public j(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Store$bindSource$$inlined$map$1$2$1 store$bindSource$$inlined$map$1$2$1;
        int i;
        Object tVar;
        if (continuation instanceof Store$bindSource$$inlined$map$1$2$1) {
            store$bindSource$$inlined$map$1$2$1 = (Store$bindSource$$inlined$map$1$2$1) continuation;
            int i2 = store$bindSource$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                store$bindSource$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = store$bindSource$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = store$bindSource$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k kVar = this.b;
                    p2 p2Var = kVar.d;
                    o2 o2Var = (o2) obj;
                    s1 s1Var = (s1) kVar.e.getValue();
                    c2 c2Var = s1Var.a;
                    g1 g1Var = s1Var.d;
                    if (o2Var instanceof d2) {
                        LoginProperties loginProperties = ((d2) o2Var).a;
                        tVar = (jl40.l(loginProperties, s1Var.c) || loginProperties.getSelectAccountParams() != null) ? l.b : new r(loginProperties);
                    } else if (o2Var instanceof e2) {
                        if (g1Var != null) {
                            LoginProperties loginProperties2 = g1Var.a;
                            q2 q2Var = ((e2) o2Var).a;
                            if (q2Var != null) {
                                loginProperties2 = LoginProperties.m307copyLjS6rdk$default(loginProperties2, null, false, null, null, null, null, null, false, true, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483391, null);
                            }
                            tVar = new d0(loginProperties2, null, null, null, false, false, q2Var != null ? q2Var.a : null, null, 190);
                        } else {
                            tVar = new o("BouncerWishMapper", "No login properties on AddNewAccount", null);
                        }
                    } else if (o2Var instanceof g2) {
                        tVar = g1Var != null ? new com.yandex.passport.internal.ui.bouncer.model.k(((g2) o2Var).a) : new o("BouncerWishMapper", "No login properties on CreateNewProfile", null);
                    } else if (o2Var.equals(f2.b)) {
                        tVar = new s(k1.a);
                        if (c2Var instanceof z1) {
                            SlothParams slothParams = ((z1) c2Var).a;
                            if (slothParams.getVariant() instanceof com.yandex.passport.sloth.data.s) {
                                m mVar = p2Var.a;
                                String valueOf = String.valueOf(((com.yandex.passport.sloth.data.s) slothParams.getVariant()).a.getValue());
                                mVar.getClass();
                                mVar.f(e9.w, new jd(valueOf, 3));
                            }
                        }
                    } else if (o2Var instanceof l2) {
                        l2 l2Var = (l2) o2Var;
                        tVar = new com.yandex.passport.internal.ui.bouncer.model.d(l2Var.a, l2Var.b);
                    } else if (o2Var instanceof n2) {
                        n2 n2Var = (n2) o2Var;
                        tVar = new com.yandex.passport.internal.ui.bouncer.model.i(n2Var.a, n2Var.b, PassportLoginAction.CAROUSEL);
                    } else if (o2Var instanceof m2) {
                        m2 m2Var = (m2) o2Var;
                        tVar = new z(m2Var.a, m2Var.b);
                    } else if (o2Var instanceof h2) {
                        tVar = new com.yandex.passport.internal.ui.bouncer.model.m(((h2) o2Var).a);
                    } else if (o2Var.equals(f2.a)) {
                        tVar = g1Var != null ? new r(g1Var.a) : new o("BouncerWishMapper", "No login properties on Back", null);
                    } else if (o2Var.equals(f2.c)) {
                        tVar = x.a;
                    } else if (o2Var instanceof j2) {
                        j2 j2Var = (j2) o2Var;
                        tVar = new v(j2Var.a, j2Var.b);
                    } else if (o2Var instanceof i2) {
                        i2 i2Var = (i2) o2Var;
                        if (!i2Var.b) {
                            tVar = new s(n1.a);
                        } else {
                            if (g1Var == null) {
                                ny61.r("internal error: no loginParameters in state");
                                return null;
                            }
                            tVar = new com.yandex.passport.internal.ui.bouncer.model.f(g1Var, i2Var.a, i2Var.c, true);
                        }
                    } else {
                        if (!(o2Var instanceof k2)) {
                            w511.b();
                            return null;
                        }
                        k2 k2Var = (k2) o2Var;
                        tVar = new t(k2Var.a, k2Var.b);
                    }
                    store$bindSource$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tVar, store$bindSource$$inlined$map$1$2$1) == coroutineSingletons) {
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
        store$bindSource$$inlined$map$1$2$1 = new Store$bindSource$$inlined$map$1$2$1(this, continuation);
        Object obj22 = store$bindSource$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = store$bindSource$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
