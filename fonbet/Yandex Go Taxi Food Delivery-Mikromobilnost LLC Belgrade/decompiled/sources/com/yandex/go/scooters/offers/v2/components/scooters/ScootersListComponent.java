package com.yandex.go.scooters.offers.v2.components.scooters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.offers.v2.data.b;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import com.yandex.payment.common.result.ResultType;
import defpackage.bpm0;
import defpackage.cma1;
import defpackage.ehn0;
import defpackage.gwn0;
import defpackage.h7n0;
import defpackage.iin0;
import defpackage.iwn0;
import defpackage.jwn0;
import defpackage.l4o0;
import defpackage.m950;
import defpackage.mrg0;
import defpackage.n6n0;
import defpackage.nwn0;
import defpackage.ny61;
import defpackage.o4o0;
import defpackage.pav;
import defpackage.qfh0;
import defpackage.qke;
import defpackage.r7p0;
import defpackage.s6n0;
import defpackage.srh0;
import defpackage.t4o0;
import defpackage.tbo0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uqu;
import defpackage.vvb1;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002-.B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u000e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/scooters/ScootersListComponent;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lnwn0;", "scootersListPresenter", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "chargeConfig", "<init>", "(Landroid/content/Context;Lpav;Lnwn0;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;)V", "", "forceVisible", "Lzy11;", ResultType.RESULT_TYPE_LOADING, "(Z)V", "hideLoading", "()V", "hideView", "Lt4o0;", "fewScooters", "showViewWithScooters", "(Lt4o0;)V", "onAttachedToWindow", "onDetachedFromWindow", "", "visibility", "setVisibility", "(I)V", "Lkotlin/Function1;", "listener", "setOnVisibilityChangeListener", "(Ltls;)V", "Lpav;", "Lnwn0;", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "Ljwn0;", "binding", "Ljwn0;", "visibilityChangeListener", "Ltls;", "Lgwn0;", "adapter", "Lgwn0;", "iwn0", "hwn0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersListComponent extends GoConstraintLayout {
    public static final int $stable = 8;
    private gwn0 adapter;
    private final jwn0 binding;
    private final ScootersCardV2.ChargeConfig chargeConfig;
    private final pav imageLoader;
    private final nwn0 scootersListPresenter;
    private tls visibilityChangeListener;

    public ScootersListComponent(Context context, pav pavVar, nwn0 nwn0Var, ScootersCardV2.ChargeConfig chargeConfig) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.scootersListPresenter = nwn0Var;
        this.chargeConfig = chargeConfig;
        LayoutInflater.from(context).inflate(srh0.scooters_list_component, this);
        int i = qfh0.parking_about_title;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = qfh0.rv;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, this);
            if (recyclerView != null) {
                i = qfh0.scooters_in_parking_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                if (robotoTextView2 != null) {
                    i = qfh0.shimmering_list;
                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, this);
                    if (shimmeringBar != null) {
                        i = qfh0.shimmering_title;
                        ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i, this);
                        if (shimmeringBar2 != null) {
                            this.binding = new jwn0(this, robotoTextView, recyclerView, robotoTextView2, shimmeringBar, shimmeringBar2);
                            setId(qfh0.scooters_component_scooters_list);
                            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            loading(false);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void hideLoading() {
        this.binding.c.setVisibility(0);
        this.binding.f.setVisibility(8);
        this.binding.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideView() {
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loading(boolean forceVisible) {
        this.binding.d.setVisibility(8);
        this.binding.c.setVisibility(8);
        this.binding.f.setVisibility(0);
        this.binding.e.setVisibility(0);
        if (forceVisible) {
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(ScootersListComponent scootersListComponent, bpm0 bpm0Var) {
        qke.E(scootersListComponent.getContext(), HapticController$Effect.SELECT, false, 12);
        nwn0 nwn0Var = scootersListComponent.scootersListPresenter;
        r7p0 r7p0Var = bpm0Var.a;
        nwn0Var.A.b = true;
        s6n0 s6n0Var = nwn0Var.z;
        s6n0Var.getClass();
        s6n0Var.a(ScootersCardV2Analytics$CardButton.SCOOTER_FROM_PARKING);
        b bVar = nwn0Var.B;
        bVar.c = r7p0Var;
        bVar.b.g(r7p0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showViewWithScooters(t4o0 fewScooters) {
        gwn0 gwn0Var = this.adapter;
        if (gwn0Var != null) {
            gwn0Var.submitList(fewScooters.c, null);
        }
        RobotoTextView robotoTextView = this.binding.d;
        CharSequence charSequence = fewScooters.a;
        boolean z = fewScooters.b;
        robotoTextView.setText(charSequence);
        RobotoTextView robotoTextView2 = this.binding.d;
        CharSequence charSequence2 = fewScooters.a;
        int i = 8;
        robotoTextView2.setVisibility((charSequence2 == null || charSequence2.length() == 0) ? 8 : 0);
        this.binding.b.setVisibility(z ? 0 : 8);
        if (z) {
            c.z(new ehn0(i, this), this.binding.b);
        }
        hideLoading();
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showViewWithScooters$lambda$0(ScootersListComponent scootersListComponent) {
        nwn0 nwn0Var = scootersListComponent.scootersListPresenter;
        o4o0 a = nwn0Var.C.a();
        n6n0 n6n0Var = nwn0Var.x;
        zzs zzsVar = a.a;
        l4o0 l4o0Var = a instanceof l4o0 ? (l4o0) a : null;
        boolean z = l4o0Var != null ? l4o0Var.e : false;
        g gVar = ((h7n0) n6n0Var).b;
        gVar.A((m950) gVar.R.get(), new tbo0(zzsVar, z, ParkingCardOpenReason.OFFER_SCREEN, ParkingButtonAction.DONE, null), vvb1.O);
        return zy11.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gwn0 gwn0Var = new gwn0(this.imageLoader, new iin0(7, this), this.chargeConfig);
        this.adapter = gwn0Var;
        this.binding.c.setAdapter(gwn0Var);
        this.binding.c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.binding.c.addItemDecoration(new uqu(tje.r(mrg0.go_design_s_space, getContext())));
        RecyclerView recyclerView = this.binding.c;
        h hVar = new h();
        hVar.c = 200L;
        hVar.d = 200L;
        recyclerView.setItemAnimator(hVar);
        nwn0 nwn0Var = this.scootersListPresenter;
        iwn0 iwn0Var = new iwn0(this);
        nwn0Var.Bg(iwn0Var);
        tje.N(nwn0Var.Jg(), null, null, new ScootersListPresenter$attachView$$inlined$collectIn$1(nwn0Var.y.a(), null, iwn0Var), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersListPresenter.Cg();
    }

    public final void setOnVisibilityChangeListener(tls listener) {
        this.visibilityChangeListener = listener;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        int visibility2 = getVisibility();
        super.setVisibility(visibility);
        if (visibility2 != visibility) {
            tls tlsVar = this.visibilityChangeListener;
            if (visibility == 0) {
                if (tlsVar != null) {
                    tlsVar.invoke(Boolean.TRUE);
                }
            } else if (tlsVar != null) {
                tlsVar.invoke(Boolean.FALSE);
            }
        }
    }
}
