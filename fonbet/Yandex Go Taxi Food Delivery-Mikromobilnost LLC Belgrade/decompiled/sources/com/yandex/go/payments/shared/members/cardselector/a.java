package com.yandex.go.payments.shared.members.cardselector;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.payments.paymentlist.domain.PaymentMethodsConfig$OpenReason;
import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.ad5;
import defpackage.bc;
import defpackage.c6a0;
import defpackage.fl8;
import defpackage.hba0;
import defpackage.hst;
import defpackage.il;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ke00;
import defpackage.lea0;
import defpackage.lw90;
import defpackage.pmn;
import defpackage.pwf0;
import defpackage.r5a0;
import defpackage.rn8;
import defpackage.s9a0;
import defpackage.sn8;
import defpackage.t5a0;
import defpackage.tje;
import defpackage.tn8;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.uba0;
import defpackage.uj4;
import defpackage.v9a0;
import defpackage.vnr0;
import defpackage.wma0;
import defpackage.y9p;
import defpackage.z5a0;
import defpackage.zor0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a extends ad5 implements hba0 {
    public static final /* synthetic */ int K = 0;
    public final vnr0 A;
    public final k0 B;
    public final i0 C;
    public final lw90 D;
    public final il E;
    public final SharedPaymentContext F;
    public final tn8 G;
    public final i H;
    public String I;
    public final ArrayList J;
    public final tt2 x;
    public final v y;
    public final zor0 z;

    public a(tt2 tt2Var, sn8 sn8Var, v vVar, zor0 zor0Var, vnr0 vnr0Var, pmn pmnVar, k0 k0Var, i0 i0Var, lw90 lw90Var, v9a0 v9a0Var) {
        super(rn8.class);
        this.x = tt2Var;
        this.y = vVar;
        this.z = zor0Var;
        this.A = vnr0Var;
        this.B = k0Var;
        this.C = i0Var;
        this.D = lw90Var;
        bc bcVar = sn8Var.a;
        this.E = (il) bcVar.c;
        this.F = (SharedPaymentContext) bcVar.w;
        this.G = (tn8) bcVar.b;
        this.H = ((v9a0) v9a0Var.b).a(new s9a0(true, new wma0(EmptyList.a), PaymentsScreen.MENU, false, PaymentMethodsConfig$OpenReason.PREORDER, pwf0.c, null, false, true, null, false, uj4.c), false, pmnVar, uba0.g);
        this.I = (String) bcVar.a;
        this.J = (ArrayList) bcVar.x;
    }

    public static final void Kg(a aVar, Account account, fl8 fl8Var) {
        il ilVar = aVar.E;
        ilVar.a = account;
        vnr0 vnr0Var = aVar.A;
        String str = ilVar.b;
        vnr0Var.l.a(vnr0Var.k(str), str, "true", Boolean.valueOf(aVar.J.contains(fl8Var.a)), aVar.F.getValue(), null);
        aVar.G.C();
    }

    @Override // defpackage.hba0
    public final void Q2(c6a0 c6a0Var) {
        if (jl40.l(c6a0Var, t5a0.a)) {
            return;
        }
        boolean z = c6a0Var instanceof z5a0;
        tn8 tn8Var = this.G;
        il ilVar = this.E;
        vnr0 vnr0Var = this.A;
        if (z) {
            lea0 lea0Var = ((z5a0) c6a0Var).a;
            if (lea0Var instanceof fl8) {
                fl8 fl8Var = (fl8) lea0Var;
                String str = ilVar.b;
                y9p y9pVar = vnr0Var.l;
                String k = vnr0Var.k(str);
                HashMap n = tse0.n(y9pVar);
                if (k != null) {
                    n.put("type_group", k);
                }
                if (str != null) {
                    n.put("group_id", str);
                }
                y9pVar.a.a("FamilyAccount.SelectCard.SelectCreditCardTapped", n, 1, new HashMap());
                if (jl40.l(fl8Var.a, this.I)) {
                    tn8Var.C();
                    return;
                } else {
                    ((rn8) Dg()).l0();
                    tje.N(Jg(), null, null, new CardSelectorPresenter$onCardPaymentOptionSelected$1(this, fl8Var, null), 3);
                    return;
                }
            }
            return;
        }
        if (!(c6a0Var instanceof r5a0)) {
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a == null || !a.b(15)) {
                return;
            }
            a.a(15, null, null, "Unsupported action " + c6a0Var, hstVar.a);
            return;
        }
        String str2 = ilVar.b;
        y9p y9pVar2 = vnr0Var.l;
        String k2 = vnr0Var.k(str2);
        String value = this.F.getValue();
        HashMap n2 = tse0.n(y9pVar2);
        if (k2 != null) {
            n2.put("type_group", k2);
        }
        if (str2 != null) {
            n2.put("group_id", str2);
        }
        if (value != null) {
            n2.put("context", value);
        }
        y9pVar2.a.a("FamilyAccount.SelectCard.AddCreditCardTapped", n2, 1, new HashMap());
        tn8Var.q(this.J);
    }

    public final void onBack() {
        String str = this.E.b;
        vnr0 vnr0Var = this.A;
        y9p y9pVar = vnr0Var.l;
        String k = vnr0Var.k(str);
        String value = this.F.getValue();
        HashMap n = tse0.n(y9pVar);
        if (k != null) {
            n.put("type_group", k);
        }
        if (str != null) {
            n.put("group_id", str);
        }
        if (value != null) {
            n.put("context", value);
        }
        y9pVar.a.a("FamilyAccount.SelectCard.Closed", n, 1, new HashMap());
        this.G.exit();
    }

    @Override // defpackage.hba0
    public final void p6(String str) {
    }
}
