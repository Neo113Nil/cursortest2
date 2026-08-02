package defpackage;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.details.c;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.y;
import defpackage.fga0;
import defpackage.jst;
import defpackage.mk;
import defpackage.tje;
import defpackage.unr0;
import defpackage.vnr0;
import defpackage.y9p;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;

/* loaded from: classes13.dex */
public final /* synthetic */ class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ ok(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y9p y9pVar;
        int i = this.a;
        final c cVar = this.b;
        switch (i) {
            case 0:
                vnr0 vnr0Var = cVar.B;
                String str = cVar.x.c;
                fga0 fga0Var = vnr0Var.b;
                SharedAccount o = fga0Var.o(str);
                if (o != null) {
                    y9p y9pVar2 = vnr0Var.l;
                    String str2 = o.b;
                    boolean e = o.e(fga0Var.w());
                    y9pVar2.getClass();
                    y9p.c(y9pVar2, "FamilyAccount.DeleteGroupNotification.RefuseButtonTapped", str2, str, e, null, null, 48);
                    break;
                } else {
                    unr0.D(new Object[]{str, "FamilyAccount.DeleteGroupNotification.RefuseButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                    break;
                }
            case 1:
                ((mk) cVar.Dg()).U8();
                break;
            case 2:
                nk nkVar = cVar.x;
                vor0 vor0Var = nkVar.b;
                il ilVar = nkVar.a;
                y yVar = vor0Var.a;
                qor0 a = yVar.c.a();
                ynr0 ynr0Var = vor0Var.b;
                a.c(new jor0(new vor0(yVar, ynr0Var), ilVar, ynr0Var.b));
                break;
            case 3:
                vnr0 vnr0Var2 = cVar.B;
                nk nkVar2 = cVar.x;
                vnr0Var2.a(nkVar2.c, SharedPaymentContext.DETAILS);
                nkVar2.b.a.d();
                break;
            case 4:
                vnr0 vnr0Var3 = cVar.B;
                nk nkVar3 = cVar.x;
                String str3 = nkVar3.c;
                fga0 fga0Var2 = vnr0Var3.b;
                y9p y9pVar3 = vnr0Var3.l;
                SharedAccount o2 = fga0Var2.o(str3);
                if (o2 == null) {
                    unr0.D(new Object[]{str3, "FamilyAccount.DeleteButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                    y9pVar = y9pVar3;
                } else {
                    String str4 = o2.b;
                    boolean e2 = o2.e(fga0Var2.w());
                    y9pVar3.getClass();
                    y9pVar = y9pVar3;
                    y9p.c(y9pVar, "FamilyAccount.DeleteButtonTapped", str4, str3, e2, null, null, 48);
                }
                cVar.D.a().setTitle(kyh0.shared_payments_remove_account_dialog_title).setMessage(kyh0.shared_payments_remove_account_dialog_body).setPositiveButton(kyh0.delete_card_dialog_confirm, new Runnable() { // from class: com.yandex.go.payments.shared.details.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar2 = c.this;
                        vnr0 vnr0Var4 = cVar2.B;
                        String str5 = cVar2.x.c;
                        fga0 fga0Var3 = vnr0Var4.b;
                        SharedAccount o3 = fga0Var3.o(str5);
                        if (o3 == null) {
                            unr0.D(new Object[]{str5, "FamilyAccount.DeleteGroupNotification.DeleteButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                        } else {
                            y9p y9pVar4 = vnr0Var4.l;
                            String str6 = o3.b;
                            boolean e3 = o3.e(fga0Var3.w());
                            y9pVar4.getClass();
                            y9p.c(y9pVar4, "FamilyAccount.DeleteGroupNotification.DeleteButtonTapped", str6, str5, e3, null, null, 48);
                        }
                        ((mk) cVar2.Dg()).l0();
                        tje.N(cVar2.Jg(), null, null, new AccountDetailsPresenter$onAccountRemoveConfirmed$1(cVar2, null), 3);
                    }
                }, SharedPaymentAnalytics$Button.DELETE.getAnalyticsName()).setNegativeButton(kyh0.delete_card_dialog_cancel, new ok(cVar, 0), SharedPaymentAnalytics$Button.CANCEL.getAnalyticsName()).setDismissListener(new ok(cVar, 1)).setAnalyticsContext(new e32("FamilyAccount.DeleteGroupNotification", AnalyticsContext$ElementState.CARD, nsa1.d())).setAnalyticsParamsProvider(cVar).show();
                String str5 = nkVar3.c;
                fga0 fga0Var3 = vnr0Var3.b;
                SharedAccount o3 = fga0Var3.o(str5);
                if (o3 != null) {
                    String str6 = o3.b;
                    boolean e3 = o3.e(fga0Var3.w());
                    y9pVar.getClass();
                    y9p.c(y9pVar, "FamilyAccount.DeleteGroupNotification.Shown", str6, str5, e3, null, null, 48);
                    break;
                } else {
                    unr0.D(new Object[]{str5, "FamilyAccount.DeleteGroupNotification.Shown"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                    break;
                }
            case 5:
                vnr0 vnr0Var4 = cVar.B;
                nk nkVar4 = cVar.x;
                vnr0Var4.q(nkVar4.a.b().a, SharedPaymentContext.DETAILS);
                vor0 vor0Var2 = nkVar4.b;
                y.b(vor0Var2.a, nkVar4.a, MemberListMode.DETAILS, vor0Var2.b);
                break;
            case 6:
                vnr0 vnr0Var5 = cVar.B;
                nk nkVar5 = cVar.x;
                String str7 = nkVar5.c;
                SharedPaymentContext sharedPaymentContext = SharedPaymentContext.DETAILS;
                vnr0Var5.c(str7, sharedPaymentContext);
                vor0 vor0Var3 = nkVar5.b;
                il ilVar2 = nkVar5.a;
                y yVar2 = vor0Var3.a;
                yVar2.c.a().c(new sn8(new bc(ilVar2.a != null ? ilVar2.b().e.b : null, new uor0(yVar2), ilVar2, sharedPaymentContext)));
                break;
            default:
                vnr0 vnr0Var6 = cVar.B;
                nk nkVar6 = cVar.x;
                String str8 = nkVar6.c;
                SharedPaymentContext sharedPaymentContext2 = SharedPaymentContext.DETAILS;
                vnr0Var6.c(str8, sharedPaymentContext2);
                vor0 vor0Var4 = nkVar6.b;
                il ilVar3 = nkVar6.a;
                y yVar3 = vor0Var4.a;
                yVar3.c.a().c(new sn8(new bc(ilVar3.a != null ? ilVar3.b().e.b : null, new uor0(yVar3), ilVar3, sharedPaymentContext2)));
                break;
        }
    }
}
