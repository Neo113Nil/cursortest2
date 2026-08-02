package com.yandex.go.scooters.offers.v2.components;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.offers.v2.components.error.ScootersCardErrorComponent;
import com.yandex.go.scooters.offers.v2.components.header.ScootersCardHeaderComponentPresenter$listenToOffer$$inlined$collectIn$1;
import com.yandex.go.scooters.offers.v2.components.header.b;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardOptionsListComponent;
import com.yandex.go.scooters.offers.v2.components.scooters.ScootersListComponent;
import com.yandex.go.scooters.offers.v2.components.tariffs.ScootersTariffListView;
import com.yandex.go.scooters.offers.v2.components.tariffs.a;
import defpackage.a5n0;
import defpackage.b5n0;
import defpackage.c0n0;
import defpackage.cjm0;
import defpackage.g8m0;
import defpackage.gi;
import defpackage.hwn0;
import defpackage.k7x0;
import defpackage.kwn0;
import defpackage.lwn0;
import defpackage.m5n0;
import defpackage.mth;
import defpackage.nwn0;
import defpackage.o5n0;
import defpackage.pav;
import defpackage.q5n0;
import defpackage.qfh0;
import defpackage.r5n0;
import defpackage.sbn0;
import defpackage.tje;
import defpackage.vbn0;
import defpackage.w4n0;
import defpackage.w511;
import defpackage.w5n0;
import defpackage.wro0;
import defpackage.x5n0;
import defpackage.xvf0;
import defpackage.y4n0;
import defpackage.y5n0;
import defpackage.z4n0;
import defpackage.z5n0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001-BG\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006."}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/ScootersComponentsView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lhwn0;", "scootersListComponentFactory", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/a;", "scootersTariffListViewFactory", "Lm5n0;", "scootersCardOptionsListComponentFactory", "Lw4n0;", "scootersCardHeaderComponentDelegateFactory", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "chargeConfig", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "batteryChargePercents", "<init>", "(Landroid/content/Context;Lhwn0;Lcom/yandex/go/scooters/offers/v2/components/tariffs/a;Lm5n0;Lw4n0;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;)V", "Lzy11;", "onAttachedToWindow", "()V", "Lz5n0;", "uiState", "update", "(Lz5n0;)V", "onDetachedFromWindow", "Lcom/yandex/go/scooters/offers/v2/components/error/ScootersCardErrorComponent;", "errorComponent", "Lcom/yandex/go/scooters/offers/v2/components/error/ScootersCardErrorComponent;", "Lcom/yandex/go/scooters/offers/v2/components/header/b;", "headerComponentDelegate", "Lcom/yandex/go/scooters/offers/v2/components/header/b;", "Lcom/yandex/go/design/divider/CardDivider;", "multiorderHeaderTariffsDivider", "Lcom/yandex/go/design/divider/CardDivider;", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ScootersTariffListView;", "tariffsList", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ScootersTariffListView;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardOptionsListComponent;", "optionsListComponent", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardOptionsListComponent;", "Lcom/yandex/go/scooters/offers/v2/components/scooters/ScootersListComponent;", "scootersListComponent", "Lcom/yandex/go/scooters/offers/v2/components/scooters/ScootersListComponent;", "scootersListCardDivider", "uan0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersComponentsView extends GoLinearLayout {
    public static final int $stable = 8;
    private final ScootersCardErrorComponent errorComponent;
    private final b headerComponentDelegate;
    private final CardDivider multiorderHeaderTariffsDivider;
    private final ScootersCardOptionsListComponent optionsListComponent;
    private final CardDivider scootersListCardDivider;
    private final ScootersListComponent scootersListComponent;
    private final ScootersTariffListView tariffsList;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScootersComponentsView(Context context, hwn0 hwn0Var, a aVar, m5n0 m5n0Var, w4n0 w4n0Var, ScootersCardV2.ChargeConfig chargeConfig, ScootersCardV2.a aVar2) {
        super(context, null, 0, r4, 14, r6);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        ScootersCardErrorComponent scootersCardErrorComponent = new ScootersCardErrorComponent(context, null, i, 6, defaultConstructorMarker);
        scootersCardErrorComponent.loading();
        this.errorComponent = scootersCardErrorComponent;
        ScootersComponentsView$headerComponentDelegate$1 scootersComponentsView$headerComponentDelegate$1 = new ScootersComponentsView$headerComponentDelegate$1(0, this, gi.class, "isAccessibilityFocusedIncludingChildren", "isAccessibilityFocusedIncludingChildren(Landroid/view/View;)Z", 1);
        y4n0 y4n0Var = ((z4n0) w4n0Var).a;
        b bVar = new b((Context) y4n0Var.a.get(), (pav) y4n0Var.b.get(), (k7x0) y4n0Var.c.get(), (c0n0) y4n0Var.d.get(), (wro0) y4n0Var.e.get(), (b5n0) y4n0Var.f.get(), chargeConfig, scootersComponentsView$headerComponentDelegate$1, aVar2);
        this.headerComponentDelegate = bVar;
        CardDivider cardDivider = new CardDivider(context, null, 0, 6, null);
        cardDivider.setVisibility(8);
        this.multiorderHeaderTariffsDivider = cardDivider;
        ScootersTariffListView a = aVar.a();
        this.tariffsList = a;
        cjm0 cjm0Var = ((o5n0) m5n0Var).a;
        ScootersCardOptionsListComponent scootersCardOptionsListComponent = new ScootersCardOptionsListComponent((Context) ((xvf0) cjm0Var.b).get(), (q5n0) ((r5n0) cjm0Var.c).get());
        this.optionsListComponent = scootersCardOptionsListComponent;
        kwn0 kwn0Var = ((lwn0) hwn0Var).a;
        ScootersListComponent scootersListComponent = new ScootersListComponent((Context) kwn0Var.a.get(), (pav) kwn0Var.b.get(), (nwn0) kwn0Var.c.get(), chargeConfig);
        scootersListComponent.setVisibility(8);
        this.scootersListComponent = scootersListComponent;
        CardDivider cardDivider2 = new CardDivider(context, null, 0, 6, null);
        cardDivider2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        cardDivider2.setId(qfh0.scooters_component_list_divider);
        cardDivider2.setVisibility(8);
        this.scootersListCardDivider = cardDivider2;
        setId(qfh0.scooters_components);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(1);
        setClickable(true);
        addView(scootersCardErrorComponent);
        addView(bVar.j);
        addView(cardDivider);
        addView(a);
        addView(scootersCardOptionsListComponent);
        addView(cardDivider2);
        addView(scootersListComponent);
        scootersListComponent.setOnVisibilityChangeListener(new g8m0(26, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ScootersComponentsView scootersComponentsView, boolean z) {
        scootersComponentsView.scootersListCardDivider.setVisibility(z ? 0 : 8);
        return zy11.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.headerComponentDelegate;
        GoLinearLayout goLinearLayout = bVar.j;
        ScootersCardHeaderComponent a = bVar.a();
        a.loading();
        goLinearLayout.addView(a);
        b5n0 b5n0Var = bVar.f;
        b5n0Var.Bg(new com.yandex.go.scooters.offers.v2.components.header.a(bVar));
        tje.N(b5n0Var.Jg(), null, null, new ScootersCardHeaderComponentPresenter$listenToOffer$$inlined$collectIn$1(new mth(e.d(b5n0Var.B.a), 6), null, (a5n0) b5n0Var.Dg()), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.headerComponentDelegate.f.Cg();
    }

    public final void update(z5n0 uiState) {
        List list;
        if (uiState instanceof y5n0) {
            vbn0 vbn0Var = ((y5n0) uiState).j;
            sbn0 sbn0Var = vbn0Var instanceof sbn0 ? (sbn0) vbn0Var : null;
            this.multiorderHeaderTariffsDivider.setVisibility(((sbn0Var == null || (list = sbn0Var.e) == null) ? 0 : list.size()) > 1 ? 0 : 8);
            this.errorComponent.success();
            return;
        }
        if (uiState instanceof x5n0) {
            this.multiorderHeaderTariffsDivider.setVisibility(8);
            this.errorComponent.loading();
        } else if (!(uiState instanceof w5n0)) {
            w511.b();
        } else {
            this.multiorderHeaderTariffsDivider.setVisibility(8);
            this.errorComponent.error(((w5n0) uiState).a);
        }
    }
}
