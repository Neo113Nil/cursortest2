package com.yandex.go.payments.shared.details;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.ad5;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.lq31;
import defpackage.mk;
import defpackage.nk;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.uq1;
import defpackage.vnr0;
import defpackage.x42;
import defpackage.zor0;
import defpackage.zuj0;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.taxi.am.o;

/* loaded from: classes13.dex */
public final class c extends ad5 implements x42 {
    public final zor0 A;
    public final vnr0 B;
    public final o C;
    public final uq1 D;
    public final zuj0 E;
    public pzt0 F;
    public final nk x;
    public final a y;
    public final v z;

    public c(nk nkVar, a aVar, v vVar, zor0 zor0Var, vnr0 vnr0Var, o oVar, uq1 uq1Var, zuj0 zuj0Var) {
        super(mk.class);
        this.x = nkVar;
        this.y = aVar;
        this.z = vVar;
        this.A = zor0Var;
        this.B = vnr0Var;
        this.C = oVar;
        this.D = uq1Var;
        this.E = zuj0Var;
    }

    public static final void Kg(c cVar) {
        nk nkVar = cVar.x;
        nkVar.b.a.d();
        nkVar.b.a.n(((avj0) cVar.E).h(kyh0.shared_payments_remove_account_success_message), false);
    }

    public final void Lg(Account account) {
        this.B.b(account.a, SharedPaymentContext.DETAILS);
        this.x.a.a = account;
        tje.N(Jg(), null, null, new AccountDetailsPresenter$updateView$1(this, null), 3);
    }

    @Override // defpackage.x42
    public final Map getEventAnalyticsParams(lq31 lq31Var) {
        String str = this.x.c;
        vnr0 vnr0Var = this.B;
        LinkedHashMap linkedHashMap = vnr0Var.r;
        vnr0Var.v(str, linkedHashMap);
        return linkedHashMap;
    }
}
