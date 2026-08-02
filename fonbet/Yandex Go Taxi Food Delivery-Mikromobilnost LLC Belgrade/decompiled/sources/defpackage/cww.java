package defpackage;

import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.payments.shared.v;
import java.util.Map;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.sharedpayments.c;

/* loaded from: classes13.dex */
public final class cww extends ad5 {
    public final c A;
    public final gww B;
    public final String C;
    public final qqo D;
    public final v x;
    public final ycq0 y;
    public final g z;

    public cww(xnr0 xnr0Var, hdu hduVar, v vVar, ycq0 ycq0Var, rqo rqoVar, g gVar, c cVar) {
        super(bww.class);
        String str;
        String h;
        String str2;
        String h2;
        String str3;
        String h3;
        this.x = vVar;
        this.y = ycq0Var;
        this.z = gVar;
        this.A = cVar;
        gww gwwVar = new gww();
        SharedAccount sharedAccount = xnr0Var.a;
        Map h4 = hduVar.h();
        zuj0 zuj0Var = (zuj0) hduVar.b;
        SharedAccountType n = sharedAccount.n();
        SharedAccount.Details details = sharedAccount.h;
        int[] iArr = dww.a;
        int i = iArr[n.ordinal()];
        if (i == 1) {
            str = "common_strings.shared_payment.Accept_invite_family_screen_title";
        } else if (i == 2) {
            str = "common_strings.shared_payment.Accept_invite_business_screen_title";
        } else {
            if (i != 3) {
                w511.b();
                throw null;
            }
            str = "common_strings.shared_payment.Accept_invite_unknown_screen_title";
        }
        int i2 = iArr[sharedAccount.n().ordinal()];
        if (i2 == 1) {
            h = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_family_screen_title);
        } else if (i2 == 2) {
            h = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_business_screen_title);
        } else {
            if (i2 != 3) {
                w511.b();
                throw null;
            }
            h = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_unknown_screen_title);
        }
        gwwVar.b = cvu0.v((String) h4.getOrDefault(str, h), "VALUE", details.a, false);
        SharedAccountType n2 = sharedAccount.n();
        Map h5 = hduVar.h();
        int i3 = iArr[n2.ordinal()];
        if (i3 == 1) {
            str2 = "common_strings.shared_payment.Accept_invite_family_info_text";
        } else if (i3 == 2) {
            str2 = "common_strings.shared_payment.Accept_invite_business_info_text";
        } else {
            if (i3 != 3) {
                w511.b();
                throw null;
            }
            str2 = "common_strings.shared_payment.Accept_invite_unknown_info_text";
        }
        int i4 = iArr[n2.ordinal()];
        if (i4 == 1) {
            h2 = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_family_info_text);
        } else if (i4 == 2) {
            h2 = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_business_info_text);
        } else {
            if (i4 != 3) {
                w511.b();
                throw null;
            }
            h2 = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_unknown_info_text);
        }
        gwwVar.c = (String) h5.getOrDefault(str2, h2);
        gwwVar.a = oe91.e(sharedAccount.n());
        gwwVar.e = true;
        SharedAccountType n3 = sharedAccount.n();
        Map h6 = hduVar.h();
        int i5 = iArr[n3.ordinal()];
        if (i5 == 1) {
            str3 = "common_strings.shared_payment.Accept_invite_family_need_select_as_payment_method_title";
        } else if (i5 == 2) {
            str3 = "common_strings.shared_payment.Accept_invite_business_need_select_as_payment_method_title";
        } else {
            if (i5 != 3) {
                w511.b();
                throw null;
            }
            str3 = "common_strings.shared_payment.Accept_invite_other_need_select_as_payment_method_title";
        }
        int i6 = iArr[n3.ordinal()];
        if (i6 == 1) {
            h3 = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_family_need_select_as_payment_method_title);
        } else if (i6 == 2) {
            h3 = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_business_need_select_as_payment_method_title);
        } else {
            if (i6 != 3) {
                w511.b();
                throw null;
            }
            h3 = ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_other_need_select_as_payment_method_title);
        }
        gwwVar.d = (String) h6.getOrDefault(str3, h3);
        gwwVar.f = (String) hduVar.h().getOrDefault("common_strings.shared_payment.Accept_invite_screen_done_title", ((avj0) zuj0Var).h(kyh0.shared_payment_accept_invite_screen_done_title));
        gwwVar.g = details.c;
        this.B = gwwVar;
        this.C = xnr0Var.a.a;
        this.D = ((jbh) rqoVar).c(ForceZaloginForFamilyExperiment.f);
    }
}
