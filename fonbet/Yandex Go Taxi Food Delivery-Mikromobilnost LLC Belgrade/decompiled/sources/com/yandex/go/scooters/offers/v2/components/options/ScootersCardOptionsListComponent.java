package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardOptionsListComponent;
import com.yandex.go.scooters.offers.v2.domain.model.ScootersOfferSuperPassComponentLocation;
import com.yandex.payment.common.result.ResultType;
import defpackage.a2i0;
import defpackage.b4p0;
import defpackage.c3o;
import defpackage.d3o;
import defpackage.h7n0;
import defpackage.j5n0;
import defpackage.l76;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.n5n0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.p5n0;
import defpackage.q5n0;
import defpackage.qco0;
import defpackage.qfh0;
import defpackage.rco0;
import defpackage.reo0;
import defpackage.sco0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00029:B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\"\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardOptionsListComponent;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lq5n0;", "scootersCardOptionsListPresenter", "<init>", "(Landroid/content/Context;Lq5n0;)V", "Lj5n0;", "insurance", "Lsco0;", "scootersPasses", "Lzy11;", "success", "(Lj5n0;Lsco0;)V", "error", "()V", "", "insuranceAvailable", "superPassAvailable", "bonusPassesAvailable", "activePackagesAvailable", "areOptionsAvailable", "(ZZZZ)Z", "passAvailable", "activePassesAvailable", "", "shimmeringBarHeight", "(ZZZZ)I", "onAttachedToWindow", "onDetachedFromWindow", ResultType.RESULT_TYPE_LOADING, "(Z)V", "Lq5n0;", "horizontalMargin", CA20Status.STATUS_USER_I, "bottomMargin", "optionHeight", "lastSuccessAvailability", "Z", "lastSuccessShimmeringHeight", "Ljava/lang/Integer;", "Lru/yandex/taxi/widget/ShimmeringBar;", "shimmeringBar", "Lru/yandex/taxi/widget/ShimmeringBar;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardInsuranceComponent;", "insuranceComponent", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardInsuranceComponent;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardSuperPassComponent;", "superPassComponent", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardSuperPassComponent;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardBonusPassesHolderComponent;", "bonusPassesHolderComponent", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardBonusPassesHolderComponent;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardActivePackagesComponent;", "activePackagesComponent", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardActivePackagesComponent;", "n5n0", "m5n0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardOptionsListComponent extends GoLinearLayout {
    public static final int $stable = 8;
    private final ScootersCardActivePackagesComponent activePackagesComponent;
    private final ScootersCardBonusPassesHolderComponent bonusPassesHolderComponent;
    private final int bottomMargin;
    private final int horizontalMargin;
    private final ScootersCardInsuranceComponent insuranceComponent;
    private boolean lastSuccessAvailability;
    private Integer lastSuccessShimmeringHeight;
    private final int optionHeight;
    private final q5n0 scootersCardOptionsListPresenter;
    private final ShimmeringBar shimmeringBar;
    private final ScootersCardSuperPassComponent superPassComponent;

    public ScootersCardOptionsListComponent(Context context, q5n0 q5n0Var) {
        super(context, null, 0, 0, 14, null);
        this.scootersCardOptionsListPresenter = q5n0Var;
        int r = tje.r(mrg0.go_design_m_space, getContext());
        this.horizontalMargin = r;
        int r2 = tje.r(mrg0.go_design_s_space, getContext());
        this.bottomMargin = r2;
        int u = tje.u(60, getContext());
        this.optionHeight = u;
        setId(qfh0.scooters_component_options_list);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        final int i = 1;
        setOrientation(1);
        ShimmeringBar shimmeringBar = new ShimmeringBar(context, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
        shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, u));
        shimmeringBar.setTag("shimmering");
        ViewGroup.LayoutParams layoutParams = shimmeringBar.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(r);
        marginLayoutParams.setMarginEnd(r);
        marginLayoutParams.bottomMargin = r2;
        shimmeringBar.setLayoutParams(marginLayoutParams);
        this.shimmeringBar = shimmeringBar;
        final int i2 = 0;
        ScootersCardInsuranceComponent scootersCardInsuranceComponent = new ScootersCardInsuranceComponent(context, new sls(this) { // from class: k5n0
            public final /* synthetic */ ScootersCardOptionsListComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 insuranceComponent$lambda$0;
                zy11 activePackagesComponent$lambda$0;
                int i3 = i2;
                ScootersCardOptionsListComponent scootersCardOptionsListComponent = this.b;
                switch (i3) {
                    case 0:
                        insuranceComponent$lambda$0 = ScootersCardOptionsListComponent.insuranceComponent$lambda$0(scootersCardOptionsListComponent);
                        return insuranceComponent$lambda$0;
                    default:
                        activePackagesComponent$lambda$0 = ScootersCardOptionsListComponent.activePackagesComponent$lambda$0(scootersCardOptionsListComponent);
                        return activePackagesComponent$lambda$0;
                }
            }
        });
        this.insuranceComponent = scootersCardInsuranceComponent;
        ScootersCardSuperPassComponent scootersCardSuperPassComponent = new ScootersCardSuperPassComponent(context, new tls(this) { // from class: l5n0
            public final /* synthetic */ ScootersCardOptionsListComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 superPassComponent$lambda$0;
                zy11 superPassComponent$lambda$1;
                int i3 = i2;
                ScootersCardOptionsListComponent scootersCardOptionsListComponent = this.b;
                rco0 rco0Var = (rco0) obj;
                switch (i3) {
                    case 0:
                        superPassComponent$lambda$0 = ScootersCardOptionsListComponent.superPassComponent$lambda$0(scootersCardOptionsListComponent, rco0Var);
                        return superPassComponent$lambda$0;
                    default:
                        superPassComponent$lambda$1 = ScootersCardOptionsListComponent.superPassComponent$lambda$1(scootersCardOptionsListComponent, rco0Var);
                        return superPassComponent$lambda$1;
                }
            }
        }, new tls(this) { // from class: l5n0
            public final /* synthetic */ ScootersCardOptionsListComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 superPassComponent$lambda$0;
                zy11 superPassComponent$lambda$1;
                int i3 = i;
                ScootersCardOptionsListComponent scootersCardOptionsListComponent = this.b;
                rco0 rco0Var = (rco0) obj;
                switch (i3) {
                    case 0:
                        superPassComponent$lambda$0 = ScootersCardOptionsListComponent.superPassComponent$lambda$0(scootersCardOptionsListComponent, rco0Var);
                        return superPassComponent$lambda$0;
                    default:
                        superPassComponent$lambda$1 = ScootersCardOptionsListComponent.superPassComponent$lambda$1(scootersCardOptionsListComponent, rco0Var);
                        return superPassComponent$lambda$1;
                }
            }
        }, ScootersOfferSuperPassComponentLocation.OPTIONS);
        this.superPassComponent = scootersCardSuperPassComponent;
        ScootersCardBonusPassesHolderComponent scootersCardBonusPassesHolderComponent = new ScootersCardBonusPassesHolderComponent(context);
        this.bonusPassesHolderComponent = scootersCardBonusPassesHolderComponent;
        ScootersCardActivePackagesComponent scootersCardActivePackagesComponent = new ScootersCardActivePackagesComponent(context, new sls(this) { // from class: k5n0
            public final /* synthetic */ ScootersCardOptionsListComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 insuranceComponent$lambda$0;
                zy11 activePackagesComponent$lambda$0;
                int i3 = i;
                ScootersCardOptionsListComponent scootersCardOptionsListComponent = this.b;
                switch (i3) {
                    case 0:
                        insuranceComponent$lambda$0 = ScootersCardOptionsListComponent.insuranceComponent$lambda$0(scootersCardOptionsListComponent);
                        return insuranceComponent$lambda$0;
                    default:
                        activePackagesComponent$lambda$0 = ScootersCardOptionsListComponent.activePackagesComponent$lambda$0(scootersCardOptionsListComponent);
                        return activePackagesComponent$lambda$0;
                }
            }
        });
        this.activePackagesComponent = scootersCardActivePackagesComponent;
        addView(shimmeringBar);
        addView(scootersCardInsuranceComponent);
        addView(scootersCardSuperPassComponent);
        addView(scootersCardBonusPassesHolderComponent);
        addView(scootersCardActivePackagesComponent);
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 activePackagesComponent$lambda$0(ScootersCardOptionsListComponent scootersCardOptionsListComponent) {
        q5n0 q5n0Var = scootersCardOptionsListComponent.scootersCardOptionsListPresenter;
        if (q5n0Var != null) {
            q5n0Var.A.a(ScootersCardV2Analytics$CardButton.ACTIVE_PASSES);
            ((h7n0) q5n0Var.y).h(l76.P);
        }
        return zy11.a;
    }

    private final boolean areOptionsAvailable(boolean insuranceAvailable, boolean superPassAvailable, boolean bonusPassesAvailable, boolean activePackagesAvailable) {
        return insuranceAvailable || superPassAvailable || bonusPassesAvailable || activePackagesAvailable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error() {
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insuranceComponent$lambda$0(ScootersCardOptionsListComponent scootersCardOptionsListComponent) {
        q5n0 q5n0Var = scootersCardOptionsListComponent.scootersCardOptionsListPresenter;
        if (q5n0Var != null) {
            q5n0Var.A.a(ScootersCardV2Analytics$CardButton.INSURANCE_OPTION);
            n6n0 n6n0Var = q5n0Var.y;
            InsuranceOpenReason insuranceOpenReason = InsuranceOpenReason.OFFER_ADDON;
            b4p0 a = q5n0Var.z.a();
            ((h7n0) n6n0Var).g(insuranceOpenReason, a != null ? a.l : null);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int shimmeringBarHeight(boolean insuranceAvailable, boolean passAvailable, boolean bonusPassesAvailable, boolean activePassesAvailable) {
        int i = insuranceAvailable;
        if (passAvailable) {
            i = insuranceAvailable + 1;
        }
        if (bonusPassesAvailable) {
            i++;
        }
        if (activePassesAvailable) {
            i++;
        }
        int i2 = i * this.optionHeight;
        return i2 > 0 ? i2 - this.bottomMargin : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void success(j5n0 insurance, sco0 scootersPasses) {
        rco0 rco0Var;
        this.insuranceComponent.setInsurance(insurance);
        this.superPassComponent.setSuperPasses(scootersPasses);
        ScootersCardBonusPassesHolderComponent scootersCardBonusPassesHolderComponent = this.bonusPassesHolderComponent;
        qco0 qco0Var = scootersPasses instanceof qco0 ? (qco0) scootersPasses : null;
        if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
            rco0Var = scootersPasses instanceof rco0 ? (rco0) scootersPasses : null;
        }
        scootersCardBonusPassesHolderComponent.setBonusPasses(rco0Var != null ? rco0Var.a : null);
        this.activePackagesComponent.setActivePasses(scootersPasses, scootersPasses != null && scootersPasses.f);
        boolean areOptionsAvailable = areOptionsAvailable(this.insuranceComponent.getVisibility() == 0, this.superPassComponent.getVisibility() == 0, this.bonusPassesHolderComponent.getVisibility() == 0, this.activePackagesComponent.getVisibility() == 0);
        this.shimmeringBar.setVisibility(8);
        setVisibility(areOptionsAvailable ? 0 : 8);
        this.lastSuccessAvailability = areOptionsAvailable;
        this.lastSuccessShimmeringHeight = Integer.valueOf(shimmeringBarHeight(this.insuranceComponent.getVisibility() == 0, this.superPassComponent.getVisibility() == 0, this.bonusPassesHolderComponent.getVisibility() == 0, this.activePackagesComponent.getVisibility() == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 superPassComponent$lambda$0(ScootersCardOptionsListComponent scootersCardOptionsListComponent, rco0 rco0Var) {
        q5n0 q5n0Var = scootersCardOptionsListComponent.scootersCardOptionsListPresenter;
        if (q5n0Var != null) {
            q5n0Var.A.a(ScootersCardV2Analytics$CardButton.SUPERPASSES);
            d3o d3oVar = rco0Var.b;
            c3o c3oVar = d3oVar != null ? d3oVar.d : null;
            n6n0 n6n0Var = q5n0Var.y;
            if (c3oVar != null) {
                ((h7n0) n6n0Var).i(c3oVar);
            } else {
                n6n0.b(n6n0Var);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 superPassComponent$lambda$1(ScootersCardOptionsListComponent scootersCardOptionsListComponent, rco0 rco0Var) {
        q5n0 q5n0Var = scootersCardOptionsListComponent.scootersCardOptionsListPresenter;
        if (q5n0Var != null) {
            q5n0Var.A.a(ScootersCardV2Analytics$CardButton.ACTIVE_SUPERPASSES);
            d3o d3oVar = rco0Var.b;
            c3o c3oVar = d3oVar != null ? d3oVar.d : null;
            n6n0 n6n0Var = q5n0Var.y;
            if (c3oVar != null) {
                ((h7n0) n6n0Var).i(c3oVar);
            } else {
                ((h7n0) n6n0Var).h(reo0.a);
            }
        }
        return zy11.a;
    }

    public final void loading(boolean insuranceAvailable) {
        if (this.lastSuccessAvailability) {
            boolean areOptionsAvailable = areOptionsAvailable(insuranceAvailable, false, false, false);
            setVisibility(areOptionsAvailable ? 0 : 8);
            if (areOptionsAvailable) {
                this.shimmeringBar.setVisibility(0);
                ShimmeringBar shimmeringBar = this.shimmeringBar;
                Integer num = this.lastSuccessShimmeringHeight;
                c.C(num != null ? num.intValue() : shimmeringBarHeight(insuranceAvailable, false, false, false), shimmeringBar);
                this.insuranceComponent.setVisibility(8);
                this.superPassComponent.setVisibility(8);
                this.bonusPassesHolderComponent.setVisibility(8);
                this.activePackagesComponent.setVisibility(8);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q5n0 q5n0Var = this.scootersCardOptionsListPresenter;
        if (q5n0Var != null) {
            q5n0Var.Bg(new n5n0(this));
            b bVar = new b(new mth(e.d(q5n0Var.B.a), 6), q5n0Var);
            q5n0Var.x.getClass();
            tje.N(q5n0Var.Jg(), null, null, new ScootersCardOptionsListPresenter$listenToUiState$$inlined$collectIn$1(e.F(bVar, uyj.a), null, (p5n0) q5n0Var.Dg()), 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q5n0 q5n0Var = this.scootersCardOptionsListPresenter;
        if (q5n0Var != null) {
            q5n0Var.Cg();
        }
    }
}
