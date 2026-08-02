package com.yandex.go.payments.shared.wizard.welcome;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.payments.shared.v;
import defpackage.ad5;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.jst;
import defpackage.jz21;
import defpackage.mbp;
import defpackage.o3f;
import defpackage.p3f;
import defpackage.pzt0;
import defpackage.q3f;
import defpackage.qqo;
import defpackage.r3f;
import defpackage.rqo;
import defpackage.rx2;
import defpackage.s3f;
import defpackage.tje;
import defpackage.tmr0;
import defpackage.tor0;
import defpackage.vnr0;
import defpackage.zor0;
import java.util.HashMap;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.sharedpayments.c;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final vnr0 A;
    public final g B;
    public final c C;
    public final qqo D;
    public pzt0 E;
    public String F;
    public boolean G;
    public final q3f x;
    public final v y;
    public final zor0 z;

    public a(q3f q3fVar, v vVar, zor0 zor0Var, vnr0 vnr0Var, g gVar, c cVar, rqo rqoVar) {
        super(p3f.class);
        this.x = q3fVar;
        this.y = vVar;
        this.z = zor0Var;
        this.A = vnr0Var;
        this.B = gVar;
        this.C = cVar;
        this.D = ((jbh) rqoVar).c(ForceZaloginForFamilyExperiment.f);
        this.F = "";
    }

    public static final void Kg(a aVar, Throwable th) {
        aVar.getClass();
        jst.e.k(th, "Failed to create a shared account");
        if (!(th instanceof ValidationException)) {
            tor0 tor0Var = aVar.x.b;
            tor0Var.a.n(aVar.z.a(th), true);
            return;
        }
        ValidationException validationException = (ValidationException) th;
        for (jz21 jz21Var : validationException.getErrors()) {
            if ("name".equals(jz21Var.a)) {
                aVar.F = jz21Var.b;
            } else {
                jst.e.w(new IllegalStateException("Unknown field name: ".concat(jz21Var.a), validationException));
            }
        }
        aVar.Ng();
    }

    public final void Lg() {
        pzt0 pzt0Var = this.E;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.G = true;
            Ng();
            q3f q3fVar = this.x;
            this.E = tje.N(Jg(), null, null, new CreateAccountPresenter$createAccount$1(this, new o3f(q3fVar.c, q3fVar.a, null, null), null), 3);
        }
    }

    public final void Mg() {
        q3f q3fVar = this.x;
        tmr0 tmr0Var = q3fVar.a;
        boolean z = tmr0Var.f;
        String str = tmr0Var.a;
        vnr0 vnr0Var = this.A;
        if (z) {
            boolean z2 = true;
            if (z) {
                String str2 = q3fVar.c;
                z2 = true ^ (str2 == null || evu0.J(str2));
            }
            vnr0Var.l.b(str, Boolean.valueOf(z2));
        } else {
            vnr0Var.l.b(str, null);
        }
        if (!this.B.a.Mg()) {
            Lg();
            return;
        }
        ForceZaloginForFamilyExperiment forceZaloginForFamilyExperiment = (ForceZaloginForFamilyExperiment) this.D.b();
        if (!forceZaloginForFamilyExperiment.b) {
            Lg();
            return;
        }
        ForceZaloginForFamilyExperiment.Screen c = forceZaloginForFamilyExperiment.c(forceZaloginForFamilyExperiment.d.b);
        if (c == null) {
            return;
        }
        this.C.c(SharedPaymentContext.CREATE_ACCOUNT, new mbp(d6z.Y(forceZaloginForFamilyExperiment, c.a), d6z.Y(forceZaloginForFamilyExperiment, c.b), c.c, d6z.Y(forceZaloginForFamilyExperiment, c.d)), new r3f(this, 0));
    }

    public final void Ng() {
        q3f q3fVar = this.x;
        String str = q3fVar.c;
        ((p3f) Dg()).l2(new s3f(this.G, q3fVar.a.f, str, this.F));
    }

    public final void onDismiss() {
        q3f q3fVar = this.x;
        q3fVar.b.a.d();
        String str = q3fVar.a.a;
        rx2 rx2Var = this.A.m;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("type_group", str);
        }
        rx2Var.a.a("CreateFamilyAccount.CardClosed", hashMap, 1, new HashMap());
    }
}
