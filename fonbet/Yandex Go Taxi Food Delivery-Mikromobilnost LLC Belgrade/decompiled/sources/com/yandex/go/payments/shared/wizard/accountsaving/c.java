package com.yandex.go.payments.shared.wizard.accountsaving;

import android.content.Context;
import android.view.View;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.wizard.accountsaving.b;
import com.yandex.go.payments.shared.wizard.accountsaving.c;
import com.yandex.go.payments.shared.y;
import defpackage.e6h0;
import defpackage.eaj0;
import defpackage.evu0;
import defpackage.g1a0;
import defpackage.hxj0;
import defpackage.izl0;
import defpackage.lzl0;
import defpackage.mqg0;
import defpackage.rp31;
import defpackage.t0a0;
import defpackage.tje;
import defpackage.tl;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class c extends ru.yandex.taxi.transition.b implements izl0 {
    public final ListItemComponent A;
    public final ListItemSwitchComponent B;
    public final b c;
    public final g1a0 w;
    public final SaveAccountView x;
    public final ListTitleComponent y;
    public final ListItemComponent z;

    public c(Context context, b bVar, g1a0 g1a0Var) {
        this.c = bVar;
        this.w = g1a0Var;
        SaveAccountView saveAccountView = new SaveAccountView(context, new hxj0(21, bVar), bVar);
        this.x = saveAccountView;
        int i = e6h0.shared_payment_save_account_name;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.y = (ListTitleComponent) ((View) rp31.d(saveAccountView, i));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(saveAccountView, e6h0.shared_payment_save_account_members));
        this.z = listItemComponent;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(saveAccountView, e6h0.shared_payment_save_account_payment_method));
        this.A = listItemComponent2;
        ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) ((View) rp31.d(saveAccountView, e6h0.shared_payment_save_account_set_default_switch));
        this.B = listItemSwitchComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(saveAccountView, e6h0.shared_payment_save_account_save));
        final int i2 = 2;
        listItemComponent2.setTrailMode(2);
        final int i3 = 0;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: kzl0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                c cVar = this.b;
                switch (i4) {
                    case 0:
                        b bVar2 = cVar.c;
                        vnr0 vnr0Var = bVar2.B;
                        il ilVar = bVar2.E;
                        vnr0Var.q(ilVar.b().a, SharedPaymentContext.WIZARD);
                        tor0 tor0Var = bVar2.x.b;
                        y.b(tor0Var.a, ilVar, MemberListMode.WIZARD_EDIT_ACCOUNT, tor0Var.b);
                        break;
                    case 1:
                        b bVar3 = cVar.c;
                        vnr0 vnr0Var2 = bVar3.B;
                        il ilVar2 = bVar3.E;
                        String str = ilVar2.b().a;
                        SharedPaymentContext sharedPaymentContext = SharedPaymentContext.WIZARD;
                        vnr0Var2.c(str, sharedPaymentContext);
                        tor0 tor0Var2 = bVar3.x.b;
                        y yVar = tor0Var2.a;
                        ynr0 ynr0Var = tor0Var2.b;
                        yVar.getClass();
                        yVar.c.a().c(new sn8(new bc(ilVar2.a != null ? ilVar2.b().e.b : null, new amp0(yVar, ilVar2, ynr0Var), ilVar2, sharedPaymentContext)));
                        break;
                    default:
                        b bVar4 = cVar.c;
                        il ilVar3 = bVar4.E;
                        jzl0 jzl0Var = bVar4.x;
                        if (jzl0Var.c) {
                            ycq0 ycq0Var = bVar4.C;
                            kv90 kv90Var = lv90.Companion;
                            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
                            String str2 = ilVar3.b().a;
                            kv90Var.getClass();
                            ycq0Var.a(kv90.b(str2, paymentMethod$Type));
                        }
                        vnr0 vnr0Var3 = bVar4.B;
                        String str3 = ilVar3.b().a;
                        fga0 fga0Var = vnr0Var3.b;
                        SharedAccount o = fga0Var.o(str3);
                        if (o == null) {
                            unr0.D(new Object[]{str3, "FamilyAccount.SaveChangesButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                        } else {
                            y9p y9pVar = vnr0Var3.l;
                            String str4 = o.b;
                            boolean e = o.e(fga0Var.w());
                            y9pVar.getClass();
                            y9p.c(y9pVar, "FamilyAccount.SaveChangesButtonTapped", str4, str3, e, null, null, 48);
                        }
                        boolean b = bVar4.z.b();
                        tor0 tor0Var3 = jzl0Var.b;
                        y yVar2 = tor0Var3.a;
                        if (!b) {
                            yVar2.d();
                            ((f600) bVar4.D.get()).g();
                            break;
                        } else {
                            yVar2.getClass();
                            uor0 uor0Var = new uor0(yVar2);
                            yVar2.c.a().d(new cor0(uor0Var, new krl0(uor0Var, (f600) yVar2.g.get()), tor0Var3.b.c));
                            break;
                        }
                }
            }
        });
        final int i4 = 1;
        listItemComponent2.setDebounceClickListener(new Runnable(this) { // from class: kzl0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i4;
                c cVar = this.b;
                switch (i42) {
                    case 0:
                        b bVar2 = cVar.c;
                        vnr0 vnr0Var = bVar2.B;
                        il ilVar = bVar2.E;
                        vnr0Var.q(ilVar.b().a, SharedPaymentContext.WIZARD);
                        tor0 tor0Var = bVar2.x.b;
                        y.b(tor0Var.a, ilVar, MemberListMode.WIZARD_EDIT_ACCOUNT, tor0Var.b);
                        break;
                    case 1:
                        b bVar3 = cVar.c;
                        vnr0 vnr0Var2 = bVar3.B;
                        il ilVar2 = bVar3.E;
                        String str = ilVar2.b().a;
                        SharedPaymentContext sharedPaymentContext = SharedPaymentContext.WIZARD;
                        vnr0Var2.c(str, sharedPaymentContext);
                        tor0 tor0Var2 = bVar3.x.b;
                        y yVar = tor0Var2.a;
                        ynr0 ynr0Var = tor0Var2.b;
                        yVar.getClass();
                        yVar.c.a().c(new sn8(new bc(ilVar2.a != null ? ilVar2.b().e.b : null, new amp0(yVar, ilVar2, ynr0Var), ilVar2, sharedPaymentContext)));
                        break;
                    default:
                        b bVar4 = cVar.c;
                        il ilVar3 = bVar4.E;
                        jzl0 jzl0Var = bVar4.x;
                        if (jzl0Var.c) {
                            ycq0 ycq0Var = bVar4.C;
                            kv90 kv90Var = lv90.Companion;
                            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
                            String str2 = ilVar3.b().a;
                            kv90Var.getClass();
                            ycq0Var.a(kv90.b(str2, paymentMethod$Type));
                        }
                        vnr0 vnr0Var3 = bVar4.B;
                        String str3 = ilVar3.b().a;
                        fga0 fga0Var = vnr0Var3.b;
                        SharedAccount o = fga0Var.o(str3);
                        if (o == null) {
                            unr0.D(new Object[]{str3, "FamilyAccount.SaveChangesButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                        } else {
                            y9p y9pVar = vnr0Var3.l;
                            String str4 = o.b;
                            boolean e = o.e(fga0Var.w());
                            y9pVar.getClass();
                            y9p.c(y9pVar, "FamilyAccount.SaveChangesButtonTapped", str4, str3, e, null, null, 48);
                        }
                        boolean b = bVar4.z.b();
                        tor0 tor0Var3 = jzl0Var.b;
                        y yVar2 = tor0Var3.a;
                        if (!b) {
                            yVar2.d();
                            ((f600) bVar4.D.get()).g();
                            break;
                        } else {
                            yVar2.getClass();
                            uor0 uor0Var = new uor0(yVar2);
                            yVar2.c.a().d(new cor0(uor0Var, new krl0(uor0Var, (f600) yVar2.g.get()), tor0Var3.b.c));
                            break;
                        }
                }
            }
        });
        listItemSwitchComponent.setOnClickListener(new eaj0(3, this));
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: kzl0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i2;
                c cVar = this.b;
                switch (i42) {
                    case 0:
                        b bVar2 = cVar.c;
                        vnr0 vnr0Var = bVar2.B;
                        il ilVar = bVar2.E;
                        vnr0Var.q(ilVar.b().a, SharedPaymentContext.WIZARD);
                        tor0 tor0Var = bVar2.x.b;
                        y.b(tor0Var.a, ilVar, MemberListMode.WIZARD_EDIT_ACCOUNT, tor0Var.b);
                        break;
                    case 1:
                        b bVar3 = cVar.c;
                        vnr0 vnr0Var2 = bVar3.B;
                        il ilVar2 = bVar3.E;
                        String str = ilVar2.b().a;
                        SharedPaymentContext sharedPaymentContext = SharedPaymentContext.WIZARD;
                        vnr0Var2.c(str, sharedPaymentContext);
                        tor0 tor0Var2 = bVar3.x.b;
                        y yVar = tor0Var2.a;
                        ynr0 ynr0Var = tor0Var2.b;
                        yVar.getClass();
                        yVar.c.a().c(new sn8(new bc(ilVar2.a != null ? ilVar2.b().e.b : null, new amp0(yVar, ilVar2, ynr0Var), ilVar2, sharedPaymentContext)));
                        break;
                    default:
                        b bVar4 = cVar.c;
                        il ilVar3 = bVar4.E;
                        jzl0 jzl0Var = bVar4.x;
                        if (jzl0Var.c) {
                            ycq0 ycq0Var = bVar4.C;
                            kv90 kv90Var = lv90.Companion;
                            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
                            String str2 = ilVar3.b().a;
                            kv90Var.getClass();
                            ycq0Var.a(kv90.b(str2, paymentMethod$Type));
                        }
                        vnr0 vnr0Var3 = bVar4.B;
                        String str3 = ilVar3.b().a;
                        fga0 fga0Var = vnr0Var3.b;
                        SharedAccount o = fga0Var.o(str3);
                        if (o == null) {
                            unr0.D(new Object[]{str3, "FamilyAccount.SaveChangesButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
                        } else {
                            y9p y9pVar = vnr0Var3.l;
                            String str4 = o.b;
                            boolean e = o.e(fga0Var.w());
                            y9pVar.getClass();
                            y9p.c(y9pVar, "FamilyAccount.SaveChangesButtonTapped", str4, str3, e, null, null, 48);
                        }
                        boolean b = bVar4.z.b();
                        tor0 tor0Var3 = jzl0Var.b;
                        y yVar2 = tor0Var3.a;
                        if (!b) {
                            yVar2.d();
                            ((f600) bVar4.D.get()).g();
                            break;
                        } else {
                            yVar2.getClass();
                            uor0 uor0Var = new uor0(yVar2);
                            yVar2.c.a().d(new cor0(uor0Var, new krl0(uor0Var, (f600) yVar2.g.get()), tor0Var3.b.c));
                            break;
                        }
                }
            }
        });
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        b bVar = this.c;
        bVar.Bg(this);
        bVar.Kg();
        tje.N(bVar.Jg(), null, null, new SaveAccountPresenter$loadAccountDetails$1(bVar, null), 3);
        this.w.a();
    }

    @Override // defpackage.izl0
    public final void Kc(lzl0 lzl0Var) {
        String str = lzl0Var.a;
        ListTitleComponent listTitleComponent = this.y;
        listTitleComponent.setTitle(str);
        listTitleComponent.setLeadImage(lzl0Var.e.a(this.x.getContext()));
        tl tlVar = lzl0Var.c;
        String str2 = tlVar.b;
        String str3 = tlVar.c;
        if (str2 == null) {
            str2 = "";
        }
        ListItemComponent listItemComponent = this.A;
        listItemComponent.setSubtitle(str2);
        if (evu0.J(str3 == null ? "" : str3)) {
            a7(tlVar.a, false);
        } else {
            if (str3 == null) {
                str3 = "";
            }
            a7(str3, true);
        }
        t0a0 t0a0Var = tlVar.d;
        if (t0a0Var == null) {
            listItemComponent.clearLeadView();
        } else {
            this.w.b(listItemComponent.getLeadImageView(), t0a0Var);
        }
        this.z.setTrailCompanionText(lzl0Var.b);
        this.B.setCheckedWithAnimation(lzl0Var.d);
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        this.c.Cg();
        this.w.d();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.x;
    }

    public final void a7(String str, boolean z) {
        ListItemComponent listItemComponent = this.A;
        listItemComponent.setTitle(str);
        listItemComponent.title().setVisibility((str == null || str.length() == 0) ? 8 : 0);
        SaveAccountView saveAccountView = this.x;
        if (z) {
            listItemComponent.setTitleTextColor(saveAccountView.getContext().getColor(mqg0.component_red_normal));
        } else {
            listItemComponent.setTitleTextColor(saveAccountView.getContext().getColor(mqg0.component_gray_300));
        }
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.x;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.x.requestFocus();
    }
}
