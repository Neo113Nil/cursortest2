package defpackage;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.y;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class dm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ em b;

    public /* synthetic */ dm(em emVar, int i) {
        this.a = i;
        this.b = emVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        em emVar = this.b;
        switch (i) {
            case 0:
                cm cmVar = emVar.c;
                cm cmVar2 = cmVar != null ? cmVar : null;
                vnr0 vnr0Var = cmVar2.y;
                bm bmVar = cmVar2.w;
                String str = bmVar.a.b().a;
                y9p y9pVar = vnr0Var.l;
                String k = vnr0Var.k(str);
                HashMap n = tse0.n(y9pVar);
                if (k != null) {
                    n.put("type_group", k);
                }
                if (str != null) {
                    n.put("group_id", str);
                }
                y9pVar.a.a("FamilyAccount.Card.ParticipantsButtonTapped", n, 1, new HashMap());
                tor0 tor0Var = bmVar.b;
                y.b(tor0Var.a, bmVar.a, MemberListMode.WIZARD_ADD_PARTICIPANTS_STEP, tor0Var.b);
                break;
            default:
                cm cmVar3 = emVar.c;
                if (cmVar3 == null) {
                    cmVar3 = null;
                }
                vnr0 vnr0Var2 = cmVar3.y;
                bm bmVar2 = cmVar3.w;
                String str2 = bmVar2.a.b().a;
                y9p y9pVar2 = vnr0Var2.l;
                String k2 = vnr0Var2.k(str2);
                HashMap n2 = tse0.n(y9pVar2);
                if (k2 != null) {
                    n2.put("type_group", k2);
                }
                if (str2 != null) {
                    n2.put("group_id", str2);
                }
                y9pVar2.a.a("FamilyAccount.Card.SelectCreditCardTapped", n2, 1, new HashMap());
                tor0 tor0Var2 = bmVar2.b;
                il ilVar = bmVar2.a;
                y yVar = tor0Var2.a;
                ynr0 ynr0Var = tor0Var2.b;
                yVar.getClass();
                yVar.c.a().c(new sn8(new bc(ilVar.a != null ? ilVar.b().e.b : null, new amp0(yVar, ilVar, ynr0Var), ilVar, SharedPaymentContext.WIZARD)));
                break;
        }
    }
}
