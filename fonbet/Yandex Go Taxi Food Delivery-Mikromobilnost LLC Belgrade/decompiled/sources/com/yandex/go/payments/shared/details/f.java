package com.yandex.go.payments.shared.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.details.c;
import com.yandex.go.payments.shared.details.f;
import defpackage.bi41;
import defpackage.d4;
import defpackage.dp41;
import defpackage.e6h0;
import defpackage.ffe;
import defpackage.fwf;
import defpackage.g1a0;
import defpackage.id00;
import defpackage.il;
import defpackage.jmr0;
import defpackage.k7x0;
import defpackage.kyh0;
import defpackage.luh0;
import defpackage.m7x0;
import defpackage.mk;
import defpackage.ms41;
import defpackage.ok;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.rg7;
import defpackage.rk;
import defpackage.rp31;
import defpackage.sc;
import defpackage.t0a0;
import defpackage.t61;
import defpackage.tje;
import defpackage.tk;
import defpackage.tl;
import defpackage.to41;
import defpackage.tse;
import defpackage.vnr0;
import defpackage.w7o;
import defpackage.y4;
import defpackage.yes0;
import defpackage.zm41;
import java.util.HashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.plus.badge.CashbackAmountView;
import ru.yandex.taxi.plus.sdk.badge.analytics.PlusHomeOpenReason;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public final class f extends ru.yandex.taxi.transition.b implements mk {
    public final c A;
    public final g1a0 B;
    public final fwf C;
    public final zm41 D;
    public final AccountDetailsView E;
    public final ListItemComponent F;
    public final ListTitleComponent G;
    public final ListItemComponent H;
    public final ListItemComponent I;
    public final ListItemComponent J;
    public final ListItemComponent K;
    public final AutoDividerComponentList L;
    public final Group M;
    public final Group N;
    public final Group O;
    public final RoundedCornersImageView P;
    public final RobotoTextView Q;
    public final RobotoTextView R;
    public boolean S;
    public pzt0 T;
    public final Context c;
    public final tse w;
    public final pav x;
    public final k7x0 y;
    public final ffe z;

    public f(Context context, tse tseVar, pav pavVar, k7x0 k7x0Var, ffe ffeVar, c cVar, g1a0 g1a0Var, fwf fwfVar, zm41 zm41Var) {
        this.c = context;
        this.w = tseVar;
        this.x = pavVar;
        this.y = k7x0Var;
        this.z = ffeVar;
        this.A = cVar;
        this.B = g1a0Var;
        this.C = fwfVar;
        this.D = zm41Var;
        AccountDetailsView accountDetailsView = new AccountDetailsView(context, new ok(cVar, 3), cVar);
        this.E = accountDetailsView;
        int i = e6h0.shared_payment_account_remove;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(accountDetailsView, i));
        this.F = listItemComponent;
        this.G = (ListTitleComponent) ((View) rp31.d(accountDetailsView, e6h0.account_details_name));
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(accountDetailsView, e6h0.shared_payment_account_members));
        this.H = listItemComponent2;
        ListItemComponent listItemComponent3 = (ListItemComponent) ((View) rp31.d(accountDetailsView, e6h0.shared_payment_account_settings));
        this.I = listItemComponent3;
        ListItemComponent listItemComponent4 = (ListItemComponent) ((View) rp31.d(accountDetailsView, e6h0.shared_payment_account_payment_method));
        this.J = listItemComponent4;
        ListItemComponent listItemComponent5 = (ListItemComponent) ((View) rp31.d(accountDetailsView, e6h0.shared_payment_account_payment_method_with_error));
        this.K = listItemComponent5;
        this.L = (AutoDividerComponentList) ((View) rp31.d(accountDetailsView, e6h0.yango_pay_actions_container));
        this.M = (Group) ((View) rp31.d(accountDetailsView, e6h0.shared_payment_account_details_loader));
        this.N = (Group) ((View) rp31.d(accountDetailsView, e6h0.shared_payment_account_details));
        this.O = (Group) ((View) rp31.d(accountDetailsView, e6h0.plus_multi_banner_group));
        this.P = (RoundedCornersImageView) ((View) rp31.d(accountDetailsView, e6h0.plus_multi_banner));
        this.Q = (RobotoTextView) ((View) rp31.d(accountDetailsView, e6h0.plus_multi_banner_title));
        this.R = (RobotoTextView) ((View) rp31.d(accountDetailsView, e6h0.plus_multi_banner_text));
        listItemComponent.setDebounceClickListener(new ok(cVar, 4));
        listItemComponent2.setDebounceClickListener(new ok(cVar, 5));
        listItemComponent4.setDebounceClickListener(new ok(cVar, 6));
        listItemComponent5.setDebounceClickListener(new ok(cVar, 7));
        listItemComponent3.setDebounceClickListener(new ok(cVar, 2));
        listItemComponent2.setAnalyticsButtonName(SharedPaymentAnalytics$Button.PARTICIPANTS.getAnalyticsName());
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button = SharedPaymentAnalytics$Button.CHANGE_CARD;
        listItemComponent4.setAnalyticsButtonName(sharedPaymentAnalytics$Button.getAnalyticsName());
        listItemComponent5.setAnalyticsButtonName(sharedPaymentAnalytics$Button.getAnalyticsName());
        listItemComponent3.setAnalyticsButtonName(SharedPaymentAnalytics$Button.SETTINGS.getAnalyticsName());
        listItemComponent.setAnalyticsButtonName(SharedPaymentAnalytics$Button.DELETE_ACCOUNT.getAnalyticsName());
    }

    @Override // defpackage.mk
    public final void A9(tk tkVar) {
        String str;
        String str2 = tkVar.b;
        boolean z = tkVar.h;
        ListTitleComponent listTitleComponent = this.G;
        listTitleComponent.setTitle(str2);
        boolean z2 = tkVar.a;
        Group group = this.N;
        Group group2 = this.O;
        final int i = 0;
        Group group3 = this.M;
        if (z2) {
            group3.setVisibility(0);
            group.setVisibility(8);
            group2.setVisibility(8);
            return;
        }
        group3.setVisibility(8);
        group.setVisibility(0);
        group2.setVisibility(0);
        tl tlVar = tkVar.d;
        String str3 = tlVar.c;
        String str4 = tlVar.b;
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        final int i2 = 1;
        ListItemComponent listItemComponent = this.K;
        ListItemComponent listItemComponent2 = this.J;
        if (length != 0) {
            listItemComponent2.setVisibility(8);
            listItemComponent.setVisibility(0);
            if (str4 == null) {
                str4 = "";
            }
            listItemComponent.setTitle(str4);
            String str5 = tlVar.c;
            listItemComponent.setSubtitle(str5 != null ? str5 : "");
        } else {
            listItemComponent2.setVisibility(0);
            listItemComponent.setVisibility(8);
            if (str4 == null) {
                str4 = "";
            }
            listItemComponent2.setSubtitle(str4);
            String str6 = tlVar.a;
            listItemComponent2.setTitle(str6);
            listItemComponent2.title().setVisibility(str6 != null && str6.length() != 0 ? 0 : 8);
        }
        t0a0 t0a0Var = tlVar.d;
        if (t0a0Var == null) {
            listItemComponent2.clearTrailView();
        } else {
            this.B.b(listItemComponent2.getTrailImageView(), t0a0Var);
        }
        this.F.setVisibility(tkVar.e ? 0 : 8);
        this.H.setTrailCompanionText(tkVar.c);
        this.I.setVisibility(tkVar.f ? 0 : 8);
        AutoDividerComponentList autoDividerComponentList = this.L;
        autoDividerComponentList.removeAllViews();
        for (final jmr0 jmr0Var : tkVar.g) {
            if (jmr0Var.a.length() != 0 && (str = jmr0Var.b) != null && str.length() != 0) {
                ListItemComponent listItemComponent3 = new ListItemComponent(this.E.getContext(), null, 0, 6, null);
                listItemComponent3.setTitle(jmr0Var.a);
                listItemComponent3.setTrailMode(2);
                listItemComponent3.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.payments.shared.details.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f fVar = f.this;
                        if (fVar.S) {
                            return;
                        }
                        c cVar = fVar.A;
                        vnr0 vnr0Var = cVar.B;
                        String str7 = cVar.x.c;
                        jmr0 jmr0Var2 = jmr0Var;
                        String str8 = jmr0Var2.c;
                        t61 t61Var = vnr0Var.e;
                        t61Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str8 != null) {
                            hashMap.put("action_name", str8);
                        }
                        if (str7 != null) {
                            hashMap.put("group_id", str7);
                        }
                        t61Var.a.a("GroupAccount.OpenURLAction.Tapped", hashMap, 1, new HashMap());
                        pzt0 pzt0Var = cVar.F;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        cVar.F = tje.N(cVar.Jg(), null, null, new AccountDetailsPresenter$onActionClick$1(cVar, jmr0Var2, null), 3);
                        fVar.S = true;
                    }
                });
                autoDividerComponentList.addView(listItemComponent3);
            }
        }
        if (z) {
            View inflate = LayoutInflater.from(listTitleComponent.getContext()).inflate(luh0.plus_multi_badge, (ViewGroup) listTitleComponent, false);
            listTitleComponent.clipTrailFrame(false);
            listTitleComponent.setTrailView(inflate);
            int i3 = e6h0.plus_badge;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            CashbackAmountView cashbackAmountView = (CashbackAmountView) ((View) rp31.d(inflate, i3));
            cashbackAmountView.setText(this.c.getString(kyh0.plus_promo_badge_label).toUpperCase(Locale.getDefault()), false);
            cashbackAmountView.stopAnimations();
            inflate.setOnClickListener(new View.OnClickListener(this) { // from class: qk
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i2;
                    final f fVar = this.b;
                    switch (i4) {
                        case 0:
                            c cVar = fVar.A;
                            vnr0 vnr0Var = cVar.B;
                            String str7 = cVar.x.c;
                            t61 t61Var = vnr0Var.e;
                            t61Var.getClass();
                            HashMap hashMap = new HashMap();
                            if (str7 != null) {
                                hashMap.put("group_id", str7);
                            }
                            t61Var.a.a("GroupAccount.PlusMultiBanner.Tapped", hashMap, 1, new HashMap());
                            ((s3d0) fVar.C.get()).a(new qxx0(PlusHomeOpenReason.FAMILY.getOpenPlusHomeParamContext(), w2d0.f, new u1d0() { // from class: com.yandex.go.payments.shared.details.e
                                @Override // defpackage.u1d0
                                public final void h(w7o w7oVar) {
                                    c cVar2 = f.this.A;
                                    tje.N(cVar2.Jg(), null, null, new AccountDetailsPresenter$loadAccountDetails$1(cVar2, null), 3);
                                }
                            }));
                            break;
                        default:
                            c cVar2 = fVar.A;
                            vnr0 vnr0Var2 = cVar2.B;
                            String str8 = cVar2.x.c;
                            t61 t61Var2 = vnr0Var2.e;
                            t61Var2.getClass();
                            HashMap hashMap2 = new HashMap();
                            if (str8 != null) {
                                hashMap2.put("group_id", str8);
                            }
                            t61Var2.a.a("GroupAccount.PlusMultiBadge.Tapped", hashMap2, 1, new HashMap());
                            s3d0 s3d0Var = (s3d0) fVar.C.get();
                            String openPlusHomeParamContext = PlusHomeOpenReason.FAMILY.getOpenPlusHomeParamContext();
                            w2d0 w2d0Var = w2d0.f;
                            s3d0Var.a(new qxx0(openPlusHomeParamContext, mo91.h(), null));
                            break;
                    }
                }
            });
        }
        rg7 rg7Var = tkVar.i;
        if (rg7Var == null || z) {
            group2.setVisibility(8);
            return;
        }
        group2.setVisibility(0);
        this.Q.setText(rg7Var.a);
        this.R.setText(rg7Var.b);
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.T = ru.yandex.taxi.utils.a.c(this.x.b().b(((m7x0) this.y).a(rg7Var.c)), new y4(9, this), new d4(5, this), this.w);
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: qk
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                final f fVar = this.b;
                switch (i4) {
                    case 0:
                        c cVar = fVar.A;
                        vnr0 vnr0Var = cVar.B;
                        String str7 = cVar.x.c;
                        t61 t61Var = vnr0Var.e;
                        t61Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str7 != null) {
                            hashMap.put("group_id", str7);
                        }
                        t61Var.a.a("GroupAccount.PlusMultiBanner.Tapped", hashMap, 1, new HashMap());
                        ((s3d0) fVar.C.get()).a(new qxx0(PlusHomeOpenReason.FAMILY.getOpenPlusHomeParamContext(), w2d0.f, new u1d0() { // from class: com.yandex.go.payments.shared.details.e
                            @Override // defpackage.u1d0
                            public final void h(w7o w7oVar) {
                                c cVar2 = f.this.A;
                                tje.N(cVar2.Jg(), null, null, new AccountDetailsPresenter$loadAccountDetails$1(cVar2, null), 3);
                            }
                        }));
                        break;
                    default:
                        c cVar2 = fVar.A;
                        vnr0 vnr0Var2 = cVar2.B;
                        String str8 = cVar2.x.c;
                        t61 t61Var2 = vnr0Var2.e;
                        t61Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        if (str8 != null) {
                            hashMap2.put("group_id", str8);
                        }
                        t61Var2.a.a("GroupAccount.PlusMultiBadge.Tapped", hashMap2, 1, new HashMap());
                        s3d0 s3d0Var = (s3d0) fVar.C.get();
                        String openPlusHomeParamContext = PlusHomeOpenReason.FAMILY.getOpenPlusHomeParamContext();
                        w2d0 w2d0Var = w2d0.f;
                        s3d0Var.a(new qxx0(openPlusHomeParamContext, mo91.h(), null));
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        c cVar = this.A;
        cVar.Bg(this);
        il ilVar = cVar.x.a;
        if (ilVar.a != null) {
            cVar.Lg(ilVar.b());
        } else {
            a aVar = cVar.y;
            String str = ilVar.c;
            aVar.getClass();
            rk rkVar = new rk();
            rkVar.a = true;
            A9(new tk(true, str, rkVar.b, rkVar.c, rkVar.d, rkVar.e, rkVar.f, rkVar.g, rkVar.h));
            tje.N(cVar.Jg(), null, null, new AccountDetailsPresenter$loadAccountDetails$1(cVar, null), 3);
        }
        this.B.a();
    }

    @Override // defpackage.mk
    public final void E() {
        yes0 yes0Var = SimpleSpinnerModalView.Companion;
        AccountDetailsView accountDetailsView = this.E;
        ViewGroup viewGroup = (ViewGroup) accountDetailsView.getRootView();
        yes0Var.getClass();
        yes0.b(viewGroup);
        accountDetailsView.requestFocus();
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        this.A.Cg();
        this.B.d();
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.E;
    }

    @Override // defpackage.mk
    public final void U8() {
        this.E.requestFocus();
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.E;
    }

    @Override // defpackage.mk
    public final void i7() {
        this.S = false;
    }

    @Override // defpackage.mk
    public final void l0() {
        yes0 yes0Var = SimpleSpinnerModalView.Companion;
        ViewGroup viewGroup = (ViewGroup) this.E.getRootView();
        yes0Var.getClass();
        yes0.d(viewGroup, null);
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.E.requestFocus();
    }

    @Override // defpackage.mk
    public final void showWebView(UiWebViewConfig uiWebViewConfig) {
        WebContainerModalView webContainerModalView = new WebContainerModalView(uiWebViewConfig, id00.e(this.D, uiWebViewConfig, bi41.D4, dp41.a, to41.a, ms41.a).c(), null, null, 8, null);
        webContainerModalView.setOnAppearingListener(new sc(1, this));
        ffe ffeVar = this.z;
        webContainerModalView.show(ffeVar.a, 0.0f);
        ffeVar.a(webContainerModalView, ContentContainer$ZOrder.MOST_IMPORTANT);
    }
}
