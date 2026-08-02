package com.yandex.go.navigator.driving;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.navigator.alt_select.traffic.TrafficJamView;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.navigator.maneuver.DrivingBubbleView;
import com.yandex.go.navigator.map_interactions.parkings.CarParsToggle;
import defpackage.ame;
import defpackage.bme;
import defpackage.cme;
import defpackage.cvw;
import defpackage.dme;
import defpackage.eh60;
import defpackage.ekm;
import defpackage.f08;
import defpackage.hbp0;
import defpackage.hmm;
import defpackage.i8m;
import defpackage.ikm;
import defpackage.krb1;
import defpackage.kyh0;
import defpackage.lu11;
import defpackage.mrg0;
import defpackage.n901;
import defpackage.ntr;
import defpackage.o901;
import defpackage.p901;
import defpackage.pm6;
import defpackage.q901;
import defpackage.qje;
import defpackage.r901;
import defpackage.rkm;
import defpackage.s801;
import defpackage.scc;
import defpackage.sif0;
import defpackage.srb1;
import defpackage.tje;
import defpackage.tkm;
import defpackage.tls;
import defpackage.uh6;
import defpackage.v2h0;
import defpackage.v58;
import defpackage.vjm;
import defpackage.vng;
import defpackage.w511;
import defpackage.wqj;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yjm;
import java.lang.ref.WeakReference;
import java.util.List;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class q implements ekm {
    public final /* synthetic */ DrivingModalView a;

    public q(DrivingModalView drivingModalView) {
        this.a = drivingModalView;
    }

    @Override // defpackage.ekm
    public final void q(Drawable drawable, Drawable drawable2) {
        int i = v2h0.bg_top_round;
        DrivingModalView drivingModalView = this.a;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, vng.t(i, drivingModalView.getContext())});
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable2, vng.t(v2h0.bg_bottom_round, drivingModalView.getContext())});
        cvw.e0(DrivingModalView.access$getBinding(drivingModalView).m, layerDrawable, null, Integer.valueOf(tje.u(8, drivingModalView.getContext())), 10);
        cvw.e0(DrivingModalView.access$getBinding(drivingModalView).n, layerDrawable2, null, null, 14);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        String str;
        ListItemComponent listItemComponent;
        vjm vjmVar;
        ikm ikmVar;
        FrameLayout notificationStackComponent;
        FrameLayout streetAddressViewContainer;
        FrameLayout notificationStackComponent2;
        FrameLayout streetAddressViewContainer2;
        int baseBubbleHorizontalMargin;
        DrivingTopView drivingTopView;
        FrameLayout streetAddressViewContainer3;
        int horizontalButtonsMargin;
        DrivingBubbleView drivingBubbleView;
        ikm ikmVar2;
        ikm ikmVar3;
        hmm hmmVar = (hmm) obj;
        boolean z = hmmVar instanceof v58;
        DrivingModalView drivingModalView = this.a;
        if (z) {
            CarParsToggle carParsToggle = drivingModalView.getRightSideButtonsContainer().b;
            carParsToggle.updateState(((v58) hmmVar).a);
            ikmVar3 = drivingModalView.presenter;
            carParsToggle.setDebounceClickListener(new rkm(ikmVar3, 3));
        } else if (hmmVar instanceof sif0) {
            sif0 sif0Var = (sif0) hmmVar;
            tkm access$getBinding = DrivingModalView.access$getBinding(drivingModalView);
            access$getBinding.i.setText(sif0Var.b + " · " + sif0Var.e);
            access$getBinding.c.setText(sif0Var.d);
            ProgressView progressView = access$getBinding.j;
            progressView.setRouteProgress(sif0Var.f);
            if (sif0Var.h) {
                progressView.updateTrafficLine(sif0Var.g);
            }
        } else if (hmmVar instanceof s801) {
            r901 r901Var = ((s801) hmmVar).a;
            TrafficJamView trafficJamView = drivingModalView.getRightSideButtonsContainer().e;
            if (r901Var instanceof n901) {
                trafficJamView.showInactive();
            } else if (r901Var instanceof o901) {
                o901 o901Var = (o901) r901Var;
                trafficJamView.showActive(srb1.a(o901Var.a), o901Var.b);
            } else if (r901Var instanceof p901) {
                trafficJamView.showLoading();
            } else {
                if (!(r901Var instanceof q901)) {
                    w511.b();
                    return;
                }
                trafficJamView.showUnavailable();
            }
            ikmVar2 = drivingModalView.presenter;
            trafficJamView.setDebounceClickListener(new rkm(ikmVar2, 4));
        } else if (hmmVar instanceof pm6) {
            drivingBubbleView = drivingModalView.getDrivingBubbleView();
            drivingBubbleView.render(((pm6) hmmVar).a, null, null);
        } else if (hmmVar instanceof lu11) {
            lu11 lu11Var = (lu11) hmmVar;
            drivingModalView.getLocationButton().a(new ntr(lu11Var.c, 56));
            if (lu11Var.a) {
                streetAddressViewContainer3 = drivingModalView.getStreetAddressViewContainer();
                horizontalButtonsMargin = drivingModalView.getHorizontalButtonsMargin();
                xw31.A(horizontalButtonsMargin, streetAddressViewContainer3);
                drivingModalView.showFloatingComponents();
            } else {
                streetAddressViewContainer2 = drivingModalView.getStreetAddressViewContainer();
                baseBubbleHorizontalMargin = drivingModalView.getBaseBubbleHorizontalMargin();
                xw31.A(baseBubbleHorizontalMargin, streetAddressViewContainer2);
                drivingModalView.hideFloatingComponents();
            }
            drivingModalView.updateStreetAddressViewMargin();
            drivingTopView = drivingModalView.drivingTopView;
            drivingTopView.setCameraNotificationVisibility(lu11Var.b);
        } else {
            int i = 0;
            if (hmmVar instanceof eh60) {
                DrivingModeNotification drivingModeNotification = ((eh60) hmmVar).a;
                if (drivingModeNotification == null) {
                    DrivingModalView.removeNotifications$default(drivingModalView, false, 1, null);
                } else {
                    drivingModalView.removeNotifications(false);
                    notificationStackComponent = drivingModalView.getNotificationStackComponent();
                    notificationStackComponent.addView(drivingModeNotification);
                    drivingModalView.post(new wqj(11, drivingModalView, drivingModeNotification));
                    streetAddressViewContainer = drivingModalView.getStreetAddressViewContainer();
                    streetAddressViewContainer.setVisibility(8);
                    notificationStackComponent2 = drivingModalView.getNotificationStackComponent();
                    notificationStackComponent2.setVisibility(0);
                    drivingModalView.updateStreetAddressViewMargin();
                    drivingModeNotification.startExpiresTimer();
                    drivingModeNotification.setExpiresListener(new f08(4, drivingModalView));
                }
            } else {
                if (!(hmmVar instanceof yjm)) {
                    w511.b();
                    return;
                }
                yjm yjmVar = (yjm) hmmVar;
                boolean z2 = yjmVar.a.a;
                RobotoTextView robotoTextView = DrivingModalView.access$getBinding(drivingModalView).e;
                String str2 = yjmVar.b;
                if (str2 == null || (str = drivingModalView.getContext().getString(kyh0.navigator_driving_screen_to, str2)) == null) {
                    str = "";
                }
                robotoTextView.setText(str);
                drivingModalView.renderHorizontalButtons(yjmVar.c);
                List list = yjmVar.d;
                if (DrivingModalView.access$getBinding(drivingModalView).o.getChildCount() > list.size()) {
                    DrivingModalView.access$getBinding(drivingModalView).o.removeViews(list.size(), DrivingModalView.access$getBinding(drivingModalView).o.getChildCount() - list.size());
                }
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    final dme dmeVar = (dme) obj2;
                    if (i < DrivingModalView.access$getBinding(drivingModalView).o.getChildCount()) {
                        listItemComponent = (ListItemComponent) uh6.v(DrivingModalView.access$getBinding(drivingModalView).o, i);
                    } else {
                        ListItemComponent listItemComponent2 = new ListItemComponent(drivingModalView.getContext(), null, 0, 6, null);
                        listItemComponent2.setTrailImage(v2h0.ic_chevron);
                        listItemComponent2.trailFrame.setScaleX(xw31.n(drivingModalView.getContext()) ? -1.0f : 1.0f);
                        listItemComponent2.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, drivingModalView.getContext()));
                        listItemComponent2.setTitleTypeface(3);
                        DrivingModalView.access$getBinding(drivingModalView).o.addView(listItemComponent2);
                        listItemComponent = listItemComponent2;
                    }
                    vjmVar = drivingModalView.drivingButtonWithIconMapper;
                    ikmVar = drivingModalView.presenter;
                    final DrivingModalView$InnerMvpView$renderVerticalButtons$1$1 drivingModalView$InnerMvpView$renderVerticalButtons$1$1 = new DrivingModalView$InnerMvpView$renderVerticalButtons$1$1(1, ikmVar, ikm.class, "handleAction", "handleAction(Lcom/yandex/go/navigator/models/ControlButtonAction;)V", 0);
                    vjmVar.getClass();
                    cme cmeVar = dmeVar.d;
                    if (cmeVar instanceof ame) {
                        listItemComponent.setLeadImage(((ame) cmeVar).a);
                    } else {
                        if (!(cmeVar instanceof bme)) {
                            w511.b();
                            return;
                        }
                        hbp0.e(vjmVar.d, null, null, new DrivingButtonWithIconMapper$mapControlButton$2$1(vjmVar, cmeVar, new WeakReference(listItemComponent), null), 3);
                    }
                    if (dmeVar.e) {
                        listItemComponent.setLeadTint(qje.t(xng0.textMain, listItemComponent.getContext()));
                    }
                    listItemComponent.setTitle(krb1.c(dmeVar.b, new DrivingButtonWithIconMapper$mapControlButton$2$2(1, listItemComponent.getContext(), Context.class, "getString", "getString(I)Ljava/lang/String;", 0)));
                    listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.navigator.driving.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((DrivingModalView$InnerMvpView$renderVerticalButtons$1$1) tls.this).invoke(dmeVar.c);
                        }
                    });
                    i = i2;
                }
                if (z2) {
                    drivingModalView.anchor();
                } else {
                    drivingModalView.expand();
                }
                OneShotPreDrawListener.add(drivingModalView, new i8m(4, drivingModalView));
            }
        }
        drivingModalView.sendContentSizes();
    }
}
