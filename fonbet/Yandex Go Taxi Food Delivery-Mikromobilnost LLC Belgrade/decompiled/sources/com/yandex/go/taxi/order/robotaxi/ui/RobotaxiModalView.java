package com.yandex.go.taxi.order.robotaxi.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.taxi.order.robotaxi.domain.c;
import defpackage.avk0;
import defpackage.bdc;
import defpackage.bts0;
import defpackage.cma1;
import defpackage.evk0;
import defpackage.fvk0;
import defpackage.grs0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.kvk0;
import defpackage.lg21;
import defpackage.lt6;
import defpackage.mg21;
import defpackage.mrg0;
import defpackage.mvk0;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qu;
import defpackage.r3k0;
import defpackage.rvk0;
import defpackage.s8o;
import defpackage.sts;
import defpackage.sue0;
import defpackage.svk0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tvk0;
import defpackage.uvk0;
import defpackage.vxj0;
import defpackage.wss0;
import defpackage.xmf0;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.yss0;
import defpackage.yuk0;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u000f*\u00020#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000f0$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u000fH\u0014¢\u0006\u0004\b1\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103¨\u00064"}, d2 = {"Lcom/yandex/go/taxi/order/robotaxi/ui/RobotaxiModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lkvk0;", "Lrvk0;", "Landroid/content/Context;", "context", "Lmvk0;", "presenter", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Lmvk0;Lbts0;)V", "", "Lxss0;", "bullets", "Lzy11;", "renderBullets", "(Ljava/util/List;)V", "Luvk0;", ClidProvider.STATE, "renderBottomEdgeButtonsContainer", "(Luvk0;)V", "Lyss0;", "createSlot", "()Lyss0;", "Lsvk0;", "buttonModel", "Lru/yandex/taxi/design/ButtonComponent;", "createButton", "(Lsvk0;)Lru/yandex/taxi/design/ButtonComponent;", "Ltvk0;", "model", "Lru/yandex/taxi/design/SliderButtonView;", "createSlider", "(Ltvk0;)Lru/yandex/taxi/design/SliderButtonView;", "Lfvk0;", "Lkotlin/Function1;", "setListener", "setNoDoNothingAction", "(Lfvk0;Ltls;)V", "onAttachedToWindow", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lkvk0;", "render", "onBackPressed", "Lmvk0;", "Lbts0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RobotaxiModalView extends SlideableBindingModalView<kvk0> implements rvk0 {
    public static final int $stable = 8;
    private final mvk0 presenter;
    private final bts0 slotItemViewFactory;

    public RobotaxiModalView(Context context, mvk0 mvk0Var, bts0 bts0Var) {
        super(context);
        this.presenter = mvk0Var;
        this.slotItemViewFactory = bts0Var;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    private final ButtonComponent createButton(svk0 buttonModel) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setText(buttonModel.a);
        buttonComponent.setButtonTitleColor(buttonModel.b);
        buttonComponent.setButtonBackground(s8o.m(buttonModel.c, buttonComponent.getContext()));
        buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_body, buttonComponent.getContext()));
        buttonComponent.setButtonSize(3);
        setNoDoNothingAction(buttonModel.d, new vxj0(11, buttonComponent, this));
        buttonComponent.setRoundedCornersRadius(tje.r(mrg0.go_design_m_space, buttonComponent.getContext()));
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createButton$lambda$0$0(ButtonComponent buttonComponent, RobotaxiModalView robotaxiModalView, fvk0 fvk0Var) {
        buttonComponent.setDebounceClickListener(new xmf0(28, robotaxiModalView, fvk0Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButton$lambda$0$0$0(RobotaxiModalView robotaxiModalView, fvk0 fvk0Var) {
        robotaxiModalView.presenter.Kg(fvk0Var);
    }

    private final SliderButtonView createSlider(tvk0 model) {
        SliderButtonView sliderButtonView = new SliderButtonView(getContext(), null, 0, 6, null);
        sliderButtonView.setTrackBackgroundColor(s8o.m(new bdc(xng0.controlMain), sliderButtonView.getContext()));
        sliderButtonView.setTextColor(new bdc(xng0.textOnControl));
        sliderButtonView.setTitleIdle(model.a);
        sliderButtonView.setSubtitleIdle(model.b);
        setNoDoNothingAction(model.c, new vxj0(12, sliderButtonView, this));
        return sliderButtonView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createSlider$lambda$0$0(SliderButtonView sliderButtonView, RobotaxiModalView robotaxiModalView, fvk0 fvk0Var) {
        sliderButtonView.setSlideFinishedListener(new r3k0(4, robotaxiModalView, fvk0Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSlider$lambda$0$0$0(RobotaxiModalView robotaxiModalView, fvk0 fvk0Var, int i, long j) {
        robotaxiModalView.presenter.Kg(fvk0Var);
    }

    private final yss0 createSlot() {
        AttributeSet attributeSet = null;
        int i = 0;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(getContext(), attributeSet, i, ((grs0) this.slotItemViewFactory).a, 6, null);
        createSlot$lambda$0(slotItemViewComponent);
        return slotItemViewComponent;
    }

    private static final zy11 createSlot$lambda$0(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return zy11.a;
    }

    private final void renderBottomEdgeButtonsContainer(uvk0 state) {
        BottomEdgeButtonLayout bottomEdgeButtonLayout = getBinding().e;
        bottomEdgeButtonLayout.removeAllViews();
        Iterator it = state.d.iterator();
        while (it.hasNext()) {
            bottomEdgeButtonLayout.addView(createButton((svk0) it.next()));
        }
        tvk0 tvk0Var = state.e;
        if (tvk0Var == null) {
            return;
        }
        bottomEdgeButtonLayout.addView(createSlider(tvk0Var));
    }

    private final void renderBullets(List<xss0> bullets) {
        getBinding().b.removeAllViews();
        for (xss0 xss0Var : bullets) {
            yss0 createSlot = createSlot();
            createSlot.render(xss0Var, false, new lt6(this, 1));
            getBinding().b.addView(createSlot.asView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBullets$lambda$0$0(RobotaxiModalView robotaxiModalView, nqs0 nqs0Var, wss0 wss0Var) {
        sue0 sue0Var = robotaxiModalView.presenter.y;
        if (nqs0Var instanceof yuk0) {
            ((mg21) ((lg21) ((h3y) ((sts) sue0Var.b).K).get())).a(((yuk0) nqs0Var).a);
        } else if (nqs0Var instanceof avk0) {
            ((mg21) ((lg21) ((h3y) ((sts) sue0Var.b).K).get())).a(((avk0) nqs0Var).a);
        }
    }

    private final void setNoDoNothingAction(fvk0 fvk0Var, tls tlsVar) {
        if (jl40.l(fvk0Var, evk0.a)) {
            return;
        }
        tlsVar.invoke(fvk0Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public kvk0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.robotaxi_modal_view, parent, false);
        int i = p8h0.bullets_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = p8h0.header;
            ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
            if (listHeaderComponent != null) {
                i = p8h0.icon;
                if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                    i = p8h0.image;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = p8h0.widgets_container;
                        BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
                        if (bottomEdgeButtonLayout != null) {
                            return new kvk0((NestedScrollView) inflate, goLinearLayout, listHeaderComponent, imageView, bottomEdgeButtonLayout);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mvk0 mvk0Var = this.presenter;
        mvk0Var.Bg(this);
        mvk0Var.B.c(mvk0Var.A);
        tje.N(mvk0Var.Jg(), null, null, new RobotaxiModalViewPresenter$attachView$1(mvk0Var, this, null), 3);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        mvk0 mvk0Var = this.presenter;
        mvk0Var.B.b(mvk0Var.A, CommunicationModalAnalyticsData$CloseReason.SYSTEM_BACK);
        c cVar = mvk0Var.C;
        ((f) cVar.d.a).X(mvk0Var.z);
        ((sts) mvk0Var.y.b).r(new qu(9));
    }

    @Override // defpackage.rvk0
    public void render(uvk0 state) {
        getBinding().d.setImageDrawable(state.f);
        getBinding().c.setTitle(state.b);
        renderBullets(state.c);
        renderBottomEdgeButtonsContainer(state);
    }
}
