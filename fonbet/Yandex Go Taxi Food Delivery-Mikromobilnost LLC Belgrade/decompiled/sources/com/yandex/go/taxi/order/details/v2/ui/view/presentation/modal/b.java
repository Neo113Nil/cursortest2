package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoView;
import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import defpackage.a741;
import defpackage.ars0;
import defpackage.bdc;
import defpackage.bgc;
import defpackage.bkk0;
import defpackage.dgk0;
import defpackage.ekk0;
import defpackage.f1h0;
import defpackage.glk0;
import defpackage.gok0;
import defpackage.hrs0;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.iok0;
import defpackage.mqs0;
import defpackage.nkk0;
import defpackage.nqs0;
import defpackage.okk0;
import defpackage.pkk0;
import defpackage.qkk0;
import defpackage.qnk0;
import defpackage.rkk0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ukk0;
import defpackage.vng;
import defpackage.vrs0;
import defpackage.wls;
import defpackage.wrs0;
import defpackage.xmf0;
import defpackage.xng0;
import defpackage.xqs0;
import defpackage.xss0;
import defpackage.yqs0;
import defpackage.zy11;
import defpackage.zz7;
import java.util.List;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes14.dex */
public final class b implements nkk0 {
    public final /* synthetic */ RideCardModalView a;

    public b(RideCardModalView rideCardModalView) {
        this.a = rideCardModalView;
    }

    @Override // defpackage.nkk0
    public final void b0(glk0 glk0Var) {
        RotatableFloatButton rotatableFloatButton;
        gok0 gok0Var;
        RideCardModalView rideCardModalView = this.a;
        rotatableFloatButton = rideCardModalView.panoramaButton;
        if (rotatableFloatButton != null) {
            gok0Var = rideCardModalView.rideCardTaxiPanoramaEntryPointInteractor;
            ((iok0) gok0Var).b(glk0Var, rotatableFloatButton);
        }
    }

    @Override // defpackage.nkk0
    public final void xd(qkk0 qkk0Var) {
        ekk0 binding;
        WalkingInfoView walkingInfoView;
        WalkingInfoView walkingInfoView2;
        WalkingInfoView walkingInfoView3;
        com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar;
        bkk0 itemsAdapter;
        yqs0 yqs0Var;
        d dVar;
        yqs0 yqs0Var2;
        View asView;
        yqs0 yqs0Var3;
        yqs0 yqs0Var4;
        ars0 ars0Var;
        int dp56;
        d dVar2;
        okk0 okk0Var;
        WalkingInfoView walkingInfoView4;
        WalkingInfoView walkingInfoView5;
        ukk0 ukk0Var;
        WalkingInfoView walkingInfoView6;
        int dp8;
        final RideCardModalView rideCardModalView = this.a;
        binding = rideCardModalView.getBinding();
        BackButtonIconComponent backButtonIconComponent = binding.h;
        GoView goView = binding.g;
        RecyclerView recyclerView = binding.i;
        backButtonIconComponent.setBadgeText(qkk0Var.g);
        rideCardModalView.applyModalViewState(qkk0Var.f);
        a741 a741Var = qkk0Var.b;
        boolean z = a741Var != null;
        if (z) {
            walkingInfoView6 = rideCardModalView.walkingInfoView;
            if (walkingInfoView6 == null) {
                WalkingInfoView walkingInfoView7 = new WalkingInfoView(rideCardModalView.getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                dp8 = rideCardModalView.getDp8();
                marginLayoutParams.setMargins(dp8, dp8, dp8, dp8);
                walkingInfoView7.setLayoutParams(marginLayoutParams);
                walkingInfoView7.setBackground(vng.t(f1h0.bg_walking_info, walkingInfoView7.getContext()));
                rideCardModalView.walkingInfoView = walkingInfoView7;
                ru.yandex.taxi.design.utils.c.w(binding.k, walkingInfoView7);
            }
        }
        walkingInfoView = rideCardModalView.walkingInfoView;
        if (walkingInfoView != null) {
            walkingInfoView.setState(a741Var);
        }
        if (z) {
            walkingInfoView4 = rideCardModalView.walkingInfoView;
            if (walkingInfoView4 != null) {
                walkingInfoView4.setOnCancelButtonClickListener(new rkk0(rideCardModalView, 7));
            }
            walkingInfoView5 = rideCardModalView.walkingInfoView;
            if (walkingInfoView5 != null) {
                ukk0Var = rideCardModalView.presenter;
                ru.yandex.taxi.design.utils.c.z(new RideCardModalView$InnerMvpView$renderWalkingInfo$2(0, ukk0Var, ukk0.class, "onWalkingInfoClicked", "onWalkingInfoClicked()V", 0), walkingInfoView5);
            }
        } else {
            walkingInfoView2 = rideCardModalView.walkingInfoView;
            if (walkingInfoView2 != null) {
                walkingInfoView2.setOnCancelButtonClickListener(new bgc(12));
            }
            walkingInfoView3 = rideCardModalView.walkingInfoView;
            if (walkingInfoView3 != null) {
                walkingInfoView3.setOnClickListener(null);
            }
        }
        qnk0 qnk0Var = qkk0Var.a;
        aVar = rideCardModalView.perfAnalyticsTracer;
        RideCardState$ProcessingStep rideCardState$ProcessingStep = qnk0Var.b;
        List list = qnk0Var.a;
        aVar.f(rideCardState$ProcessingStep, list.size());
        itemsAdapter = rideCardModalView.getItemsAdapter();
        itemsAdapter.submitList(list, new xmf0(24, rideCardModalView, qnk0Var));
        dgk0 dgk0Var = qkk0Var.e;
        if (dgk0Var != null) {
            dVar2 = rideCardModalView.shadowListener;
            if (dVar2 == null) {
                okk0Var = rideCardModalView.shadowListenerFactory;
                zz7 zz7Var = ((pkk0) okk0Var).a;
                d dVar3 = new d(recyclerView, goView, (ru.yandex.taxi.design.utils.b) zz7Var.a.get(), (tse) zz7Var.b.get());
                recyclerView.addOnScrollListener(dVar3);
                rideCardModalView.shadowListener = dVar3;
            }
        }
        if (dgk0Var != null) {
            yqs0Var3 = rideCardModalView.doneButtonView;
            if (yqs0Var3 == null) {
                ars0Var = rideCardModalView.slotItemButtonViewFactory;
                SlotItemButtonViewComponent slotItemButtonViewComponent = new SlotItemButtonViewComponent(rideCardModalView.getContext(), null, 0, 0, ((hrs0) ars0Var).a, new wls() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.a
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ukk0 ukk0Var2;
                        wrs0 wrs0Var = (wrs0) obj2;
                        ibk0 a = ijk0.a((nqs0) obj);
                        if (a != null) {
                            ukk0Var2 = RideCardModalView.this.presenter;
                            tje.N(ukk0Var2.Jg(), null, null, new RideCardModalViewPresenter$handleAction$1(ukk0Var2, a, wrs0Var, null), 3);
                        }
                        return zy11.a;
                    }
                }, 14, null);
                slotItemButtonViewComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                rideCardModalView.doneButtonView = slotItemButtonViewComponent;
                ru.yandex.taxi.design.utils.c.w(binding.b, slotItemButtonViewComponent.asView());
                dp56 = rideCardModalView.getDp56();
                slotItemButtonViewComponent.setup(dp56, new bdc(xng0.controlPressed));
            }
            yqs0Var4 = rideCardModalView.doneButtonView;
            if (yqs0Var4 != null) {
                xqs0 xqs0Var = dgk0Var.c;
                xss0 xss0Var = xqs0Var.a;
                yqs0Var4.render(xss0Var, xqs0Var.b);
                yqs0Var4.setAction(xss0Var.d, dgk0Var.e);
                yqs0Var4.renderBackground(dgk0Var.d);
                yqs0Var4.renderEnabled(true);
            }
            tje.N(rideCardModalView.getMainScope(), null, null, new RideCardModalView$InnerMvpView$renderFooter$1(rideCardModalView, dgk0Var, null), 3);
        } else {
            yqs0Var = rideCardModalView.doneButtonView;
            if (yqs0Var != null) {
                mqs0 mqs0Var = new mqs0();
                wrs0.a.getClass();
                yqs0Var.setAction(mqs0Var, vrs0.b);
            }
            dVar = rideCardModalView.shadowListener;
            if (dVar != null) {
                recyclerView.removeOnScrollListener(dVar);
            }
            rideCardModalView.shadowListener = null;
            goView.setVisibility(8);
        }
        binding.c.setVisibility(dgk0Var != null ? 0 : 8);
        yqs0Var2 = rideCardModalView.doneButtonView;
        if (yqs0Var2 != null && (asView = yqs0Var2.asView()) != null) {
            asView.setVisibility(dgk0Var == null ? 8 : 0);
        }
        rideCardModalView.renderDecorations(qkk0Var.c);
    }
}
