package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes14.dex */
public final class cp70 implements epq0 {
    public final /* synthetic */ f a;
    public final /* synthetic */ o2y0 b;

    public cp70(o2y0 o2y0Var, f fVar) {
        this.a = fVar;
        this.b = o2y0Var;
    }

    @Override // defpackage.epq0
    public final void H2(cjm0 cjm0Var) {
        f fVar = this.a;
        rp70 rp70Var = fVar.C1;
        o2y0 o2y0Var = this.b;
        p370 p370Var = new p370(6, fVar, o2y0Var, cjm0Var);
        rp70Var.getClass();
        tdj tdjVar = new tdj(o2y0Var);
        tdjVar.b = rp70Var.b(kyh0.no_connection_title);
        tdjVar.c = rp70Var.b(kyh0.no_connection_check_prompt);
        tdjVar.a(new h2r(20, p370Var, o2y0Var));
        rp70Var.c.n(tdjVar, new pp70(null, "showNoNetwork"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    @Override // defpackage.epq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Je(final String str, final String str2) {
        final int i;
        String b;
        int i2;
        f fVar = this.a;
        final rp70 rp70Var = fVar.C1;
        o2y0 o2y0Var = this.b;
        final at20 at20Var = new at20(o2y0Var, fVar);
        rp70Var.getClass();
        int i3 = 0;
        if (str != null && !evu0.J(str)) {
            switch (str.hashCode()) {
                case -1712092169:
                    if (str.equals("DEBT_USER")) {
                        i2 = kyh0.dialog_title_debt_user;
                        i = i2;
                        break;
                    }
                    break;
                case -901744194:
                    if (str.equals("UNUSABLE_CARD")) {
                        i2 = kyh0.order_unknown_problem;
                        i = i2;
                        break;
                    }
                    break;
                case 278016787:
                    if (str.equals("CARD_NOT_SUPPORTED")) {
                        i2 = kyh0.dialog_title_card_not_supported;
                        i = i2;
                        break;
                    }
                    break;
                case 1027046917:
                    if (str.equals("UNKNOWN_CARD")) {
                        i2 = kyh0.order_unknown_card;
                        i = i2;
                        break;
                    }
                    break;
            }
            final boolean z = i == 0;
            b = !z ? rp70Var.b(i) : str2;
            if (b != null || evu0.J(b)) {
                b = null;
            }
            if (b == null) {
                b = rp70Var.b(kyh0.dialog_title_pls_update_app);
            }
            final sd30 sd30Var = new sd30(10, str, at20Var);
            if (str != null && !evu0.J(str) && (str.equals("DISABLED_PAYMENT_TYPE_PERSONAL_WALLET_IF_NO_YA_PLUS") || str.equals("DISABLED_PAYMENT_TYPE_PERSONAL_WALLET_IF_NO_CASHBACK_PLUS"))) {
                i3 = kyh0.dialog_title_subscription_required;
            }
            tdj tdjVar = new tdj(o2y0Var);
            tdjVar.c = b;
            tdjVar.a(new rdj() { // from class: lp70
                @Override // defpackage.rdj
                public final void k(AlertDialog alertDialog) {
                    boolean z2 = z;
                    sd30 sd30Var2 = sd30Var;
                    if (z2) {
                        alertDialog.setMessage(i).setPositiveButton(kyh0.dialog_ok_pay_with_cash, new sf30(29, at20Var)).setNegativeButton(kyh0.dialog_cancel_order, sd30Var2).setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL);
                    } else {
                        rp70Var.getClass();
                        String str3 = str;
                        alertDialog.setPositiveButton((str3 == null || evu0.J(str3)) ? kyh0.dialog_common_ok : (str3.equals("DISABLED_PAYMENT_TYPE_PERSONAL_WALLET_IF_NO_YA_PLUS") || str3.equals("DISABLED_PAYMENT_TYPE_PERSONAL_WALLET_IF_NO_CASHBACK_PLUS")) ? kyh0.common_got_it : kyh0.dialog_common_ok, sd30Var2);
                        String str4 = str2;
                        if (str4 == null || evu0.J(str4)) {
                            alertDialog.setMessage(kyh0.dialog_title_pls_update_app);
                        } else {
                            alertDialog.setMessage(str4);
                        }
                    }
                    alertDialog.setCancelable(false).setCancelableOnTouchOutside(false);
                }
            });
            if (i3 != 0) {
                tdjVar.b = rp70Var.b(i3);
            }
            rp70Var.c.n(tdjVar, new pp70(o2y0Var, g8e.o("NotAcceptable: ", str)));
        }
        i = 0;
        if (i == 0) {
        }
        if (!z) {
        }
        if (b != null) {
        }
        b = null;
        if (b == null) {
        }
        final sd30 sd30Var2 = new sd30(10, str, at20Var);
        if (str != null) {
            i3 = kyh0.dialog_title_subscription_required;
        }
        tdj tdjVar2 = new tdj(o2y0Var);
        tdjVar2.c = b;
        tdjVar2.a(new rdj() { // from class: lp70
            @Override // defpackage.rdj
            public final void k(AlertDialog alertDialog) {
                boolean z2 = z;
                sd30 sd30Var22 = sd30Var2;
                if (z2) {
                    alertDialog.setMessage(i).setPositiveButton(kyh0.dialog_ok_pay_with_cash, new sf30(29, at20Var)).setNegativeButton(kyh0.dialog_cancel_order, sd30Var22).setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL);
                } else {
                    rp70Var.getClass();
                    String str3 = str;
                    alertDialog.setPositiveButton((str3 == null || evu0.J(str3)) ? kyh0.dialog_common_ok : (str3.equals("DISABLED_PAYMENT_TYPE_PERSONAL_WALLET_IF_NO_YA_PLUS") || str3.equals("DISABLED_PAYMENT_TYPE_PERSONAL_WALLET_IF_NO_CASHBACK_PLUS")) ? kyh0.common_got_it : kyh0.dialog_common_ok, sd30Var22);
                    String str4 = str2;
                    if (str4 == null || evu0.J(str4)) {
                        alertDialog.setMessage(kyh0.dialog_title_pls_update_app);
                    } else {
                        alertDialog.setMessage(str4);
                    }
                }
                alertDialog.setCancelable(false).setCancelableOnTouchOutside(false);
            }
        });
        if (i3 != 0) {
        }
        rp70Var.c.n(tdjVar2, new pp70(o2y0Var, g8e.o("NotAcceptable: ", str)));
    }

    @Override // defpackage.epq0
    public final void P9(TaxiOrder taxiOrder) {
        f fVar = this.a;
        fVar.y0(this.b);
        fVar.w0();
        fVar.T.c(taxiOrder);
        yea0 yea0Var = fVar.s0;
        yea0Var.getClass();
        lv90 lv90Var = taxiOrder.W().w;
        boolean z = taxiOrder.W().a0;
        if (lv90Var != null && z) {
            yea0Var.a.b(lv90Var);
        }
        yea0Var.b.h();
    }

    @Override // defpackage.epq0
    public final void Pa() {
        ysg ysgVar = this.a.J;
        TaxiOrder b = this.b.b();
        ysgVar.getClass();
        synchronized (b) {
            b.l = b.l.G();
        }
        b.O(false);
        ysgVar.g(b);
    }

    @Override // defpackage.epq0
    public final void Uc() {
        f fVar = this.a;
        rp70 rp70Var = fVar.C1;
        o2y0 o2y0Var = this.b;
        rp70Var.d(o2y0Var, kyh0.google_pay_payment_temporary_unavailable, new yo70(fVar, o2y0Var, 4), "GOOGLE_PAY_UNAVAILABLE_DIALOG_TAG", null);
    }

    @Override // defpackage.epq0
    public final void W1() {
        f fVar = this.a;
        rp70 rp70Var = fVar.C1;
        o2y0 o2y0Var = this.b;
        rp70Var.d(o2y0Var, kyh0.common_unknown_error, new yo70(o2y0Var, fVar), null, null);
    }

    @Override // defpackage.epq0
    public final void c2() {
        f.V(this.a);
    }

    @Override // defpackage.epq0
    public final void m8() {
        f fVar = this.a;
        rp70 rp70Var = fVar.C1;
        o2y0 o2y0Var = this.b;
        rp70Var.d(o2y0Var, kyh0.common_unknown_error, new yo70(o2y0Var, fVar), null, null);
    }

    @Override // defpackage.epq0
    public final void pb() {
        f fVar = this.a;
        rp70 rp70Var = fVar.C1;
        o2y0 o2y0Var = this.b;
        rp70Var.d(o2y0Var, kyh0.order_too_often_message, new yo70(fVar, o2y0Var, 3), null, null);
    }

    @Override // defpackage.epq0
    public final void r9() {
        f.V(this.a);
    }
}
