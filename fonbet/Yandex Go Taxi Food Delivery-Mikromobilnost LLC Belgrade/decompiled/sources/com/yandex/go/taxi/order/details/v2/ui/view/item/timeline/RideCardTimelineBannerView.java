package com.yandex.go.taxi.order.details.v2.ui.view.item.timeline;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.superapp.plate_number.PlateNumberDividerView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.aub;
import defpackage.bts0;
import defpackage.cma1;
import defpackage.grs0;
import defpackage.hxj0;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.jl40;
import defpackage.kok0;
import defpackage.kp50;
import defpackage.mhq0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.og20;
import defpackage.p8h0;
import defpackage.p9y0;
import defpackage.pav;
import defpackage.q2y;
import defpackage.qcq0;
import defpackage.qje;
import defpackage.qok0;
import defpackage.rok0;
import defpackage.sok0;
import defpackage.tje;
import defpackage.uz1;
import defpackage.vrs0;
import defpackage.wrs0;
import defpackage.wss0;
import defpackage.wug0;
import defpackage.xmf0;
import defpackage.xng0;
import defpackage.xok0;
import defpackage.xss0;
import defpackage.yso;
import defpackage.yss0;
import defpackage.zak0;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.utils.h;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J+\u0010+\u001a\u00020*2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001d2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001dH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\f2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020'H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\f2\u0006\u00107\u001a\u00020'H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0010J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020'0I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/timeline/RideCardTimelineBannerView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lbts0;", "slotItemViewFactory", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lbts0;Lpav;)V", "Lxss0;", "uiState", "Lzy11;", "render", "(Lxss0;)V", "showAdditionalOptionsSection", "()V", "hideAdditionalOptionsSection", "Lsok0;", "optionsData", "renderAdditionalOptions", "(Lsok0;)V", "Lmhq0;", "listener", "setSelectedOptionChangeListener", "(Lmhq0;)V", "Lqcq0;", "setSelectOptionListener", "(Lqcq0;)V", "", "Landroid/graphics/Point;", CRLDistributionPointsExtension.POINTS, "", "currentItemIndex", "renderTail", "(Ljava/util/List;I)V", IssuingDistributionPointExtension.POINT, "animateOffsetTail", "(Landroid/graphics/Point;)V", "Lrok0;", "oldItems", "newItems", "Landroidx/recyclerview/widget/i;", "calculateDiff", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/i;", "ignore", "Lru/yandex/taxi/design/ListItemCheckComponent;", "createOptionView", "(Lrok0;)Lru/yandex/taxi/design/ListItemCheckComponent;", "view", "item", "bindOptionView", "(Lru/yandex/taxi/design/ListItemCheckComponent;Lrok0;)V", "removeView", "(Lru/yandex/taxi/design/ListItemCheckComponent;)V", PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, "updateSelectedOption", "(Lrok0;)V", "addOptionsButtonViewIfNeed", "Lqok0;", "button", "bindOptionsButtonView", "(Lqok0;)V", "Lpav;", "selectedOptionChangeListener", "Lmhq0;", "selectOptionListener", "Lqcq0;", "Lq2y;", "binding", "Lq2y;", "halfTailWidth", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/utils/h;", "listDelegate$delegate", "Li3y;", "getListDelegate", "()Lru/yandex/taxi/utils/h;", "listDelegate", "Lyss0;", "slotItemView$delegate", "getSlotItemView", "()Lyss0;", "slotItemView", "Lru/yandex/taxi/design/ButtonComponent;", "optionsButtonComponent$delegate", "getOptionsButtonComponent", "()Lru/yandex/taxi/design/ButtonComponent;", "optionsButtonComponent", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardTimelineBannerView extends GoLinearLayout {
    public static final int $stable = 8;
    private final q2y binding;
    private final int halfTailWidth;
    private final pav imageLoader;

    /* renamed from: listDelegate$delegate, reason: from kotlin metadata */
    private final i3y listDelegate;

    /* renamed from: optionsButtonComponent$delegate, reason: from kotlin metadata */
    private final i3y optionsButtonComponent;
    private qcq0 selectOptionListener;
    private mhq0 selectedOptionChangeListener;

    /* renamed from: slotItemView$delegate, reason: from kotlin metadata */
    private final i3y slotItemView;

    public RideCardTimelineBannerView(Context context, bts0 bts0Var, pav pavVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        LayoutInflater.from(context).inflate(zkh0.layout_timeline_banner_section, this);
        int i = p8h0.banner_section;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
        if (goLinearLayout != null) {
            i = p8h0.divider_view;
            PlateNumberDividerView plateNumberDividerView = (PlateNumberDividerView) cma1.O(i, this);
            if (plateNumberDividerView != null) {
                i = p8h0.tail_view;
                GoImageView goImageView = (GoImageView) cma1.O(i, this);
                if (goImageView != null) {
                    i = p8h0.timeline_options_section;
                    GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, this);
                    if (goLinearLayout2 != null) {
                        this.binding = new q2y(this, goLinearLayout, plateNumberDividerView, goImageView, goLinearLayout2);
                        this.halfTailWidth = tje.r(wug0.timeline_banner_tail_width, getContext()) / 2;
                        int i2 = 4;
                        iik0 iik0Var = new iik0(i2, this);
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                        this.listDelegate = a.b(lazyThreadSafetyMode, iik0Var);
                        this.slotItemView = a.b(lazyThreadSafetyMode, new o8k0(i2, bts0Var, context));
                        this.optionsButtonComponent = a.b(lazyThreadSafetyMode, new kok0(context, 0));
                        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        setOrientation(1);
                        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), tje.r(wug0.timeline_banner_margin, getContext()));
                        goLinearLayout.addView(getSlotItemView().asView());
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void addOptionsButtonViewIfNeed() {
        if (this.binding.d.indexOfChild(getOptionsButtonComponent()) != -1) {
            return;
        }
        this.binding.d.addView(getOptionsButtonComponent());
        getOptionsButtonComponent().setDebounceClickListener(new hxj0(6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOptionsButtonViewIfNeed$lambda$0(RideCardTimelineBannerView rideCardTimelineBannerView) {
        Object obj;
        qcq0 qcq0Var;
        Iterator it = rideCardTimelineBannerView.getListDelegate().h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((rok0) obj).e) {
                    break;
                }
            }
        }
        rok0 rok0Var = (rok0) obj;
        if (rok0Var == null || (qcq0Var = rideCardTimelineBannerView.selectOptionListener) == null) {
            return;
        }
        ((xok0) qcq0Var).a.T.a(rok0Var.a, rok0Var.g);
    }

    private final void animateOffsetTail(Point point) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.binding.c.getX(), point.x - this.halfTailWidth);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new yso(25, this));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateOffsetTail$lambda$0(RideCardTimelineBannerView rideCardTimelineBannerView, ValueAnimator valueAnimator) {
        rideCardTimelineBannerView.binding.c.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOptionView(ListItemCheckComponent view, rok0 item) {
        CharSequence charSequence = item.b;
        String str = item.d;
        view.setTitle(charSequence);
        view.setSubtitle(item.c);
        view.setChecked(item.e);
        boolean z = item.f;
        view.setEnabled(z);
        view.setDebounceClickListener(new xmf0(25, this, item));
        view.getTrailImageView().setAlpha(z ? 1.0f : 0.5f);
        view.setEnabled(z);
        ClickableImageView leadImageView = view.getLeadImageView();
        this.imageLoader.c(leadImageView);
        if (str != null) {
            ((nac) this.imageLoader.a(leadImageView)).c(str);
        }
        leadImageView.setVisibility(str != null ? 0 : 8);
    }

    private final void bindOptionsButtonView(qok0 button) {
        getOptionsButtonComponent().setText(button.a.a);
        getOptionsButtonComponent().setContentDescription(button.a.b);
        ButtonComponent optionsButtonComponent = getOptionsButtonComponent();
        boolean z = button.b;
        optionsButtonComponent.setProgressing(z);
        getOptionsButtonComponent().setEnabled(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i calculateDiff(List<rok0> oldItems, List<rok0> newItems) {
        return kp50.f(new og20(oldItems, newItems, new aub(16)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean calculateDiff$lambda$0(rok0 rok0Var, rok0 rok0Var2) {
        return Boolean.valueOf(jl40.l(rok0Var, rok0Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemCheckComponent createOptionView(rok0 ignore) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(getContext(), null, 0, 6, null);
        listItemCheckComponent.setMode(ListItemCheckComponent.Mode.SINGLE);
        listItemCheckComponent.setTitleTypeface(0);
        listItemCheckComponent.setTitleTextSizePx(tje.u(13, listItemCheckComponent.getContext()));
        listItemCheckComponent.setMinHeight((int) tje.w(48, listItemCheckComponent.getContext()));
        return listItemCheckComponent;
    }

    private final h getListDelegate() {
        return (h) this.listDelegate.getValue();
    }

    private final ButtonComponent getOptionsButtonComponent() {
        return (ButtonComponent) this.optionsButtonComponent.getValue();
    }

    private final yss0 getSlotItemView() {
        return (yss0) this.slotItemView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h listDelegate_delegate$lambda$0(RideCardTimelineBannerView rideCardTimelineBannerView) {
        return new h(rideCardTimelineBannerView.binding.d, new RideCardTimelineBannerView$listDelegate$2$1(2, rideCardTimelineBannerView, RideCardTimelineBannerView.class, "calculateDiff", "calculateDiff(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", 0), new RideCardTimelineBannerView$listDelegate$2$2(1, rideCardTimelineBannerView, RideCardTimelineBannerView.class, "createOptionView", "createOptionView(Lcom/yandex/go/taxi/order/details/v2/state/elements/timeline/options/RideCardTimelineOptionsUiState$RideCardTimelineOptionUiState;)Lru/yandex/taxi/design/ListItemCheckComponent;", 0), new RideCardTimelineBannerView$listDelegate$2$3(2, rideCardTimelineBannerView, RideCardTimelineBannerView.class, "bindOptionView", "bindOptionView(Lru/yandex/taxi/design/ListItemCheckComponent;Lcom/yandex/go/taxi/order/details/v2/state/elements/timeline/options/RideCardTimelineOptionsUiState$RideCardTimelineOptionUiState;)V", 0), new RideCardTimelineBannerView$listDelegate$2$4(1, rideCardTimelineBannerView, RideCardTimelineBannerView.class, "removeView", "removeView(Lru/yandex/taxi/design/ListItemCheckComponent;)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonComponent optionsButtonComponent_delegate$lambda$0(Context context) {
        ButtonComponent buttonComponent = new ButtonComponent(context, null, 0, 6, null);
        buttonComponent.setTextTypeface(3);
        buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_caption, buttonComponent.getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(tje.r(wug0.timeline_options_button_horizontal_margin, buttonComponent.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, tje.r(wug0.timeline_options_button_horizontal_margin, buttonComponent.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        buttonComponent.setLayoutParams(layoutParams);
        buttonComponent.setButtonSize(2);
        buttonComponent.setButtonBackground(qje.t(xng0.controlMain, buttonComponent.getContext()));
        buttonComponent.setButtonTitleColor(qje.t(xng0.textMain, buttonComponent.getContext()));
        buttonComponent.setDisabledButtonBackground(qje.t(xng0.controlMain, buttonComponent.getContext()));
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeView(ListItemCheckComponent view) {
        this.imageLoader.c(view.getLeadImageView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(nqs0 nqs0Var, wss0 wss0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yss0 slotItemView_delegate$lambda$0(bts0 bts0Var, Context context) {
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, null, 0, ((grs0) bts0Var).a, 6, null);
        slotItemView_delegate$lambda$0$0(slotItemViewComponent);
        return slotItemViewComponent;
    }

    private static final zy11 slotItemView_delegate$lambda$0$0(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectedOption(rok0 option) {
        mhq0 mhq0Var;
        if (option.e || (mhq0Var = this.selectedOptionChangeListener) == null) {
            return;
        }
        p9y0 p9y0Var = ((xok0) mhq0Var).a.T;
        zak0 zak0Var = new zak0(option);
        wrs0.a.getClass();
        p9y0Var.a(zak0Var, vrs0.b);
    }

    public final void hideAdditionalOptionsSection() {
        cma1.L(this.binding.d);
        cma1.L(this.binding.b);
    }

    public final void render(xss0 uiState) {
        getSlotItemView().render(uiState, false, new uz1(4));
    }

    public final void renderAdditionalOptions(sok0 optionsData) {
        getListDelegate().c(optionsData.a);
        qok0 qok0Var = optionsData.b;
        if (qok0Var != null) {
            addOptionsButtonViewIfNeed();
            bindOptionsButtonView(qok0Var);
        }
    }

    public final void renderTail(List<? extends Point> points, int currentItemIndex) {
        Point point = points.get(currentItemIndex);
        if (this.binding.c.getX() == 0.0f) {
            this.binding.c.setX(point.x - this.halfTailWidth);
        } else {
            animateOffsetTail(point);
        }
    }

    public final void setSelectOptionListener(qcq0 listener) {
        this.selectOptionListener = listener;
    }

    public final void setSelectedOptionChangeListener(mhq0 listener) {
        this.selectedOptionChangeListener = listener;
    }

    public final void showAdditionalOptionsSection() {
        cma1.J(this.binding.d);
        cma1.J(this.binding.b);
    }
}
