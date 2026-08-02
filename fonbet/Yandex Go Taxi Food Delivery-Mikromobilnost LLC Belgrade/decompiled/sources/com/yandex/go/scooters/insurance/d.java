package com.yandex.go.scooters.insurance;

import androidx.constraintlayout.widget.Group;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.insurance.ScootersInsuranceModalView;
import com.yandex.go.scooters.insurance.analytics.InsuranceButton;
import com.yandex.go.scooters.insurance.analytics.InsuranceCloseReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceScreen;
import com.yandex.go.scooters.insurance.d;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceCompletion;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import defpackage.etn0;
import defpackage.g18;
import defpackage.gtn0;
import defpackage.hek0;
import defpackage.itn0;
import defpackage.jl40;
import defpackage.k1b1;
import defpackage.ktn0;
import defpackage.kyh0;
import defpackage.ltn0;
import defpackage.msb1;
import defpackage.mtn0;
import defpackage.n3o0;
import defpackage.nac;
import defpackage.obv;
import defpackage.pav;
import defpackage.r8c0;
import defpackage.sls;
import defpackage.stn0;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zsn0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class d implements mtn0 {
    public ScootersInsuranceModalView.LoadingButton a = ScootersInsuranceModalView.LoadingButton.MAIN;
    public final /* synthetic */ ScootersInsuranceModalView b;

    public d(ScootersInsuranceModalView scootersInsuranceModalView) {
        this.b = scootersInsuranceModalView;
    }

    public final void I(InsuranceButton insuranceButton, ScootersInsuranceControl scootersInsuranceControl, String str) {
        ltn0 ltn0Var;
        zsn0 zsn0Var;
        ScootersInsuranceModalView scootersInsuranceModalView = this.b;
        ltn0Var = scootersInsuranceModalView.mode;
        if (ltn0Var instanceof ktn0) {
            zsn0Var = scootersInsuranceModalView.scootersInsuranceAnalytics;
            zsn0Var.c(insuranceButton, scootersInsuranceControl, str, InsuranceScreen.DEFAULT);
        }
    }

    @Override // defpackage.mtn0
    public final void U6(Throwable th, sls slsVar) {
        wls wlsVar;
        wlsVar = this.b.showErrorDialog;
        wlsVar.invoke(th, slsVar);
    }

    @Override // defpackage.mtn0
    public final void Yf(ScootersInsuranceType scootersInsuranceType, sls slsVar) {
        itn0 binding;
        binding = this.b.getBinding();
        binding.h.setEnabled(true);
        ButtonComponent buttonComponent = binding.i;
        buttonComponent.setEnabled(true);
        ListItemSwitchComponent listItemSwitchComponent = binding.g;
        listItemSwitchComponent.setEnabled(true);
        listItemSwitchComponent.setCheckedWithAnimation(scootersInsuranceType == ScootersInsuranceType.FULL);
        int i = c.b[this.a.ordinal()];
        if (i == 1) {
            ButtonComponent buttonComponent2 = binding.h;
            k1b1.f(buttonComponent2);
            buttonComponent2.stopAnimation();
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            k1b1.f(buttonComponent);
            buttonComponent.stopAnimation();
        }
        slsVar.invoke();
    }

    @Override // defpackage.mtn0
    public final void close() {
        tls tlsVar;
        tlsVar = this.b.onComplete;
        tlsVar.invoke(ScootersInsuranceCompletion.CLOSED);
    }

    @Override // defpackage.mtn0
    public final void e6(String str, String str2, String str3, final ScootersInsuranceControl scootersInsuranceControl, final String str4, ScootersInsuranceType scootersInsuranceType, boolean z, etn0 etn0Var) {
        ltn0 ltn0Var;
        itn0 binding;
        g18 g18Var;
        g18 g18Var2;
        CharSequence string;
        CharSequence string2;
        CharSequence string3;
        itn0 binding2;
        itn0 itn0Var;
        pav pavVar;
        InsuranceOpenReason insuranceOpenReason;
        zsn0 zsn0Var;
        final ScootersInsuranceModalView scootersInsuranceModalView = this.b;
        ltn0Var = scootersInsuranceModalView.mode;
        ktn0 ktn0Var = ltn0Var instanceof ktn0 ? (ktn0) ltn0Var : null;
        if (ktn0Var != null && (insuranceOpenReason = ktn0Var.a) != null) {
            zsn0Var = scootersInsuranceModalView.scootersInsuranceAnalytics;
            zsn0Var.b(insuranceOpenReason, scootersInsuranceControl, str4, InsuranceScreen.DEFAULT);
        }
        binding = scootersInsuranceModalView.getBinding();
        g18Var = scootersInsuranceModalView.loadImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        final int i = 0;
        if (str != null) {
            pavVar = scootersInsuranceModalView.imageLoader;
            g18Var2 = ((nac) pavVar.a(binding.f)).b(new obv(str, null, 6, 0));
        } else {
            g18Var2 = null;
        }
        scootersInsuranceModalView.loadImageCancellable = g18Var2;
        RobotoTextView robotoTextView = binding.l;
        ButtonComponent buttonComponent = binding.i;
        ButtonComponent buttonComponent2 = binding.h;
        ListItemComponent listItemComponent = binding.e;
        if (etn0Var == null || (string = etn0Var.b) == null) {
            string = scootersInsuranceModalView.getContext().getString(kyh0.scooters_insurance_screen_title);
        }
        robotoTextView.setText(string);
        binding.j.setTitle(str2);
        binding.k.setText(str3);
        listItemComponent.setVisibility(z ? 0 : 8);
        if (etn0Var == null || (string2 = etn0Var.c) == null) {
            string2 = scootersInsuranceModalView.getContext().getString(kyh0.scooters_turn_on_insurance_button);
        }
        buttonComponent2.setText(string2);
        if (etn0Var == null || (string3 = etn0Var.d) == null) {
            string3 = scootersInsuranceModalView.getContext().getString(kyh0.scooters_refuse_insurance_button);
        }
        buttonComponent.setText(string3);
        binding2 = scootersInsuranceModalView.getBinding();
        int i2 = c.a[scootersInsuranceControl.ordinal()];
        final int i3 = 1;
        if (i2 == 1) {
            binding2.b.setVisibility(0);
            binding2.m.setVisibility(8);
        } else if (i2 == 2) {
            Group group = binding2.b;
            ListItemSwitchComponent listItemSwitchComponent = binding2.g;
            group.setVisibility(8);
            binding2.m.setVisibility(0);
            listItemSwitchComponent.setChecked(true);
            listItemSwitchComponent.setEnabled(true);
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            Group group2 = binding2.b;
            ListItemSwitchComponent listItemSwitchComponent2 = binding2.g;
            group2.setVisibility(8);
            binding2.m.setVisibility(0);
            listItemSwitchComponent2.setChecked(scootersInsuranceType == ScootersInsuranceType.FULL);
            listItemSwitchComponent2.setEnabled(false);
        }
        ToolbarComponent toolbarComponent = binding.n;
        ListItemSwitchComponent listItemSwitchComponent3 = binding.g;
        final int i4 = 0;
        toolbarComponent.setOnCloseClickListener(new Runnable(this) { // from class: htn0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                tls tlsVar;
                tls tlsVar2;
                int i5 = i4;
                ScootersInsuranceModalView scootersInsuranceModalView2 = scootersInsuranceModalView;
                String str5 = str4;
                ScootersInsuranceControl scootersInsuranceControl2 = scootersInsuranceControl;
                d dVar = this.b;
                switch (i5) {
                    case 0:
                        dVar.h(InsuranceCloseReason.CLOSE_BUTTON, scootersInsuranceControl2, str5);
                        tlsVar = scootersInsuranceModalView2.onComplete;
                        tlsVar.invoke(ScootersInsuranceCompletion.CLOSED);
                        break;
                    default:
                        dVar.h(InsuranceCloseReason.CLOSE_BUTTON, scootersInsuranceControl2, str5);
                        tlsVar2 = scootersInsuranceModalView2.onComplete;
                        tlsVar2.invoke(ScootersInsuranceCompletion.CLOSED);
                        break;
                }
            }
        });
        final ScootersInsuranceControl scootersInsuranceControl2 = scootersInsuranceControl;
        binding.d.setDebounceClickListener(new Runnable(this) { // from class: com.yandex.go.scooters.insurance.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                e eVar2;
                int i5 = i4;
                ScootersInsuranceModalView scootersInsuranceModalView2 = scootersInsuranceModalView;
                String str5 = str4;
                ScootersInsuranceControl scootersInsuranceControl3 = scootersInsuranceControl2;
                d dVar = this.b;
                switch (i5) {
                    case 0:
                        dVar.I(InsuranceButton.AGREEMENT, scootersInsuranceControl3, str5);
                        eVar = scootersInsuranceModalView2.scootersInsurancePresenter;
                        tje.N(eVar.Jg(), null, null, new ScootersInsurancePresenter$showInsuranceInfo$1(eVar, null), 3);
                        break;
                    default:
                        dVar.I(InsuranceButton.DETAILS, scootersInsuranceControl3, str5);
                        eVar2 = scootersInsuranceModalView2.scootersInsurancePresenter;
                        n3o0 n3o0Var = eVar2.C;
                        stn0 stn0Var = n3o0Var != null ? n3o0Var.f : null;
                        if (stn0Var != null) {
                            ((ScootersInsuranceRouter$provideModalView$4) eVar2.D).invoke(stn0Var.a, stn0Var.b);
                            break;
                        } else {
                            zgz.a(null, new IllegalStateException("Insurance provider info is null"));
                            break;
                        }
                }
            }
        });
        final int i5 = 1;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: com.yandex.go.scooters.insurance.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                e eVar2;
                int i52 = i5;
                ScootersInsuranceModalView scootersInsuranceModalView2 = scootersInsuranceModalView;
                String str5 = str4;
                ScootersInsuranceControl scootersInsuranceControl3 = scootersInsuranceControl2;
                d dVar = this.b;
                switch (i52) {
                    case 0:
                        dVar.I(InsuranceButton.AGREEMENT, scootersInsuranceControl3, str5);
                        eVar = scootersInsuranceModalView2.scootersInsurancePresenter;
                        tje.N(eVar.Jg(), null, null, new ScootersInsurancePresenter$showInsuranceInfo$1(eVar, null), 3);
                        break;
                    default:
                        dVar.I(InsuranceButton.DETAILS, scootersInsuranceControl3, str5);
                        eVar2 = scootersInsuranceModalView2.scootersInsurancePresenter;
                        n3o0 n3o0Var = eVar2.C;
                        stn0 stn0Var = n3o0Var != null ? n3o0Var.f : null;
                        if (stn0Var != null) {
                            ((ScootersInsuranceRouter$provideModalView$4) eVar2.D).invoke(stn0Var.a, stn0Var.b);
                            break;
                        } else {
                            zgz.a(null, new IllegalStateException("Insurance provider info is null"));
                            break;
                        }
                }
            }
        });
        buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: com.yandex.go.scooters.insurance.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ltn0 ltn0Var2;
                e eVar;
                tls tlsVar;
                ltn0 ltn0Var3;
                tls tlsVar2;
                e eVar2;
                switch (i) {
                    case 0:
                        d dVar = this.b;
                        ScootersInsuranceModalView scootersInsuranceModalView2 = dVar.b;
                        ltn0Var2 = scootersInsuranceModalView2.mode;
                        if (!jl40.l(ltn0Var2, msb1.R)) {
                            if (!(ltn0Var2 instanceof ktn0)) {
                                w511.b();
                                break;
                            } else {
                                dVar.a = ScootersInsuranceModalView.LoadingButton.MAIN;
                                InsuranceButton insuranceButton = InsuranceButton.INSURANCE_ON;
                                ScootersInsuranceControl scootersInsuranceControl3 = scootersInsuranceControl2;
                                String str5 = str4;
                                dVar.I(insuranceButton, scootersInsuranceControl3, str5);
                                eVar = scootersInsuranceModalView2.scootersInsurancePresenter;
                                eVar.Kg(ScootersInsuranceType.FULL, new r8c0(dVar, scootersInsuranceControl3, str5, scootersInsuranceModalView2, 4));
                                break;
                            }
                        } else {
                            tlsVar = scootersInsuranceModalView2.onComplete;
                            tlsVar.invoke(ScootersInsuranceCompletion.SKIPPED);
                            break;
                        }
                    default:
                        d dVar2 = this.b;
                        ScootersInsuranceModalView scootersInsuranceModalView3 = dVar2.b;
                        ltn0Var3 = scootersInsuranceModalView3.mode;
                        if (!jl40.l(ltn0Var3, msb1.R)) {
                            if (!(ltn0Var3 instanceof ktn0)) {
                                w511.b();
                                break;
                            } else {
                                dVar2.h(InsuranceCloseReason.REFUSE_BUTTON, scootersInsuranceControl2, str4);
                                tlsVar2 = scootersInsuranceModalView3.onComplete;
                                tlsVar2.invoke(ScootersInsuranceCompletion.CLOSED);
                                break;
                            }
                        } else {
                            dVar2.a = ScootersInsuranceModalView.LoadingButton.MINOR;
                            eVar2 = scootersInsuranceModalView3.scootersInsurancePresenter;
                            eVar2.Kg(ScootersInsuranceType.STANDART, new gtn0(scootersInsuranceModalView3, 1));
                            break;
                        }
                }
            }
        });
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: com.yandex.go.scooters.insurance.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ltn0 ltn0Var2;
                e eVar;
                tls tlsVar;
                ltn0 ltn0Var3;
                tls tlsVar2;
                e eVar2;
                switch (i3) {
                    case 0:
                        d dVar = this.b;
                        ScootersInsuranceModalView scootersInsuranceModalView2 = dVar.b;
                        ltn0Var2 = scootersInsuranceModalView2.mode;
                        if (!jl40.l(ltn0Var2, msb1.R)) {
                            if (!(ltn0Var2 instanceof ktn0)) {
                                w511.b();
                                break;
                            } else {
                                dVar.a = ScootersInsuranceModalView.LoadingButton.MAIN;
                                InsuranceButton insuranceButton = InsuranceButton.INSURANCE_ON;
                                ScootersInsuranceControl scootersInsuranceControl3 = scootersInsuranceControl2;
                                String str5 = str4;
                                dVar.I(insuranceButton, scootersInsuranceControl3, str5);
                                eVar = scootersInsuranceModalView2.scootersInsurancePresenter;
                                eVar.Kg(ScootersInsuranceType.FULL, new r8c0(dVar, scootersInsuranceControl3, str5, scootersInsuranceModalView2, 4));
                                break;
                            }
                        } else {
                            tlsVar = scootersInsuranceModalView2.onComplete;
                            tlsVar.invoke(ScootersInsuranceCompletion.SKIPPED);
                            break;
                        }
                    default:
                        d dVar2 = this.b;
                        ScootersInsuranceModalView scootersInsuranceModalView3 = dVar2.b;
                        ltn0Var3 = scootersInsuranceModalView3.mode;
                        if (!jl40.l(ltn0Var3, msb1.R)) {
                            if (!(ltn0Var3 instanceof ktn0)) {
                                w511.b();
                                break;
                            } else {
                                dVar2.h(InsuranceCloseReason.REFUSE_BUTTON, scootersInsuranceControl2, str4);
                                tlsVar2 = scootersInsuranceModalView3.onComplete;
                                tlsVar2.invoke(ScootersInsuranceCompletion.CLOSED);
                                break;
                            }
                        } else {
                            dVar2.a = ScootersInsuranceModalView.LoadingButton.MINOR;
                            eVar2 = scootersInsuranceModalView3.scootersInsurancePresenter;
                            eVar2.Kg(ScootersInsuranceType.STANDART, new gtn0(scootersInsuranceModalView3, 1));
                            break;
                        }
                }
            }
        });
        if (scootersInsuranceControl2 == ScootersInsuranceControl.TOGGLE) {
            itn0Var = binding;
            hek0 hek0Var = new hek0(itn0Var, scootersInsuranceModalView, scootersInsuranceControl2, str4, 3);
            scootersInsuranceModalView = scootersInsuranceModalView;
            scootersInsuranceControl2 = scootersInsuranceControl2;
            listItemSwitchComponent3.setTrailContainerClickListener(hek0Var);
        } else {
            itn0Var = binding;
            if (scootersInsuranceControl2 == ScootersInsuranceControl.IMMUTABLE_TOGGLE) {
                listItemSwitchComponent3.setTrailContainerClickListener(null);
            }
        }
        final int i6 = 1;
        itn0Var.c.setDebounceClickListener(new Runnable(this) { // from class: htn0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                tls tlsVar;
                tls tlsVar2;
                int i52 = i6;
                ScootersInsuranceModalView scootersInsuranceModalView2 = scootersInsuranceModalView;
                String str5 = str4;
                ScootersInsuranceControl scootersInsuranceControl22 = scootersInsuranceControl2;
                d dVar = this.b;
                switch (i52) {
                    case 0:
                        dVar.h(InsuranceCloseReason.CLOSE_BUTTON, scootersInsuranceControl22, str5);
                        tlsVar = scootersInsuranceModalView2.onComplete;
                        tlsVar.invoke(ScootersInsuranceCompletion.CLOSED);
                        break;
                    default:
                        dVar.h(InsuranceCloseReason.CLOSE_BUTTON, scootersInsuranceControl22, str5);
                        tlsVar2 = scootersInsuranceModalView2.onComplete;
                        tlsVar2.invoke(ScootersInsuranceCompletion.CLOSED);
                        break;
                }
            }
        });
    }

    public final void h(InsuranceCloseReason insuranceCloseReason, ScootersInsuranceControl scootersInsuranceControl, String str) {
        ltn0 ltn0Var;
        zsn0 zsn0Var;
        ScootersInsuranceModalView scootersInsuranceModalView = this.b;
        ltn0Var = scootersInsuranceModalView.mode;
        if (ltn0Var instanceof ktn0) {
            zsn0Var = scootersInsuranceModalView.scootersInsuranceAnalytics;
            zsn0Var.a(insuranceCloseReason, scootersInsuranceControl, str, InsuranceScreen.DEFAULT);
        }
    }

    @Override // defpackage.mtn0
    public final void s2() {
        itn0 binding;
        binding = this.b.getBinding();
        binding.h.setEnabled(false);
        ButtonComponent buttonComponent = binding.i;
        buttonComponent.setEnabled(false);
        binding.g.setEnabled(false);
        int i = c.b[this.a.ordinal()];
        if (i == 1) {
            ButtonComponent buttonComponent2 = binding.h;
            k1b1.f(buttonComponent2);
            buttonComponent2.startAnimation();
        } else if (i != 2) {
            w511.b();
        } else {
            k1b1.f(buttonComponent);
            buttonComponent.startAnimation();
        }
    }
}
