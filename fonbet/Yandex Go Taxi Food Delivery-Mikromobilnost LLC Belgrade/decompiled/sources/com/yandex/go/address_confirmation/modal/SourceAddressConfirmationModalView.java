package com.yandex.go.address_confirmation.modal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoTooltipContainer$TooltipPointerAlignment;
import defpackage.aat0;
import defpackage.c230;
import defpackage.chh0;
import defpackage.cma1;
import defpackage.dt20;
import defpackage.eg3;
import defpackage.f7r;
import defpackage.f9l0;
import defpackage.frg0;
import defpackage.g7r;
import defpackage.gat0;
import defpackage.gpb0;
import defpackage.h9l0;
import defpackage.hat0;
import defpackage.hnb0;
import defpackage.hos0;
import defpackage.i3y;
import defpackage.i7r;
import defpackage.iat0;
import defpackage.jat0;
import defpackage.jl40;
import defpackage.jpb0;
import defpackage.jqr;
import defpackage.kat0;
import defpackage.kpb0;
import defpackage.kqh0;
import defpackage.kyh0;
import defpackage.lat0;
import defpackage.lhc;
import defpackage.mat0;
import defpackage.mob0;
import defpackage.mrg0;
import defpackage.nat0;
import defpackage.ndh0;
import defpackage.ny61;
import defpackage.oat0;
import defpackage.pat0;
import defpackage.pbt0;
import defpackage.qat0;
import defpackage.qbt0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.rat0;
import defpackage.rbt0;
import defpackage.rp31;
import defpackage.sat0;
import defpackage.sbt0;
import defpackage.tbt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ubt0;
import defpackage.umb0;
import defpackage.ur0;
import defpackage.vbb;
import defpackage.w511;
import defpackage.wat0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.ysd0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0014¢\u0006\u0004\b/\u0010.J\u001f\u00104\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0015H\u0014¢\u0006\u0004\b6\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0018\u0010<\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/yandex/go/address_confirmation/modal/SourceAddressConfirmationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lur0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/address_confirmation/modal/d;", "presenter", "Lhnb0;", "pickupFromPhotoEntryPointAnalytics", "Ljpb0;", "pickupFromPhotoTooltipFactory", "Lysd0;", "pointActionRouterConsumer", "Lf7r;", "finalizeAddressByGravityRouterFactory", "Lru/yandex/taxi/address/repository/AddressResolveRepository;", "addressResolveRepository", "<init>", "(Landroid/content/Context;Lcom/yandex/go/address_confirmation/modal/d;Lhnb0;Ljpb0;Lysd0;Lf7r;Lru/yandex/taxi/address/repository/AddressResolveRepository;)V", "Lubt0;", "uiState", "Lzy11;", "render", "(Lubt0;)V", "Lrbt0;", ClidProvider.STATE, "renderPickupFromPhotoButton", "(Lrbt0;)V", "Lru/yandex/taxi/design/ButtonComponent;", "button", "Lpbt0;", "buttonUiState", "renderButton", "(Lru/yandex/taxi/design/ButtonComponent;Lpbt0;)V", "Lru/yandex/taxi/design/ListItemComponent;", "addressComponent", "appendPorchNumberButton", "(Lru/yandex/taxi/design/ListItemComponent;)V", "Lc230;", "insetsType", "()Lc230;", "", "contentTop", "onModalViewAppear", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lur0;", "onBackPressed", "Lcom/yandex/go/address_confirmation/modal/d;", "Lhnb0;", "Ljpb0;", "Lysd0;", "Liat0;", "innerView", "Liat0;", "", "backFloatButtonPressed", "Z", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "upperEndButtonsHolder", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "pickupFromPhotoButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "Lgpb0;", "pickupFromPhotoTooltipContainer", "Lgpb0;", "Lg7r;", "finalizeAddressByGravityRouter$delegate", "Li3y;", "getFinalizeAddressByGravityRouter", "()Lg7r;", "finalizeAddressByGravityRouter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SourceAddressConfirmationModalView extends SlideableBindingModalView<ur0> {
    private boolean backFloatButtonPressed;

    /* renamed from: finalizeAddressByGravityRouter$delegate, reason: from kotlin metadata */
    private final i3y finalizeAddressByGravityRouter;
    private final iat0 innerView;
    private final RotatableFloatButton pickupFromPhotoButton;
    private final hnb0 pickupFromPhotoEntryPointAnalytics;
    private gpb0 pickupFromPhotoTooltipContainer;
    private final jpb0 pickupFromPhotoTooltipFactory;
    private final ysd0 pointActionRouterConsumer;
    private final d presenter;
    private final FloatButtonHolderLayout upperEndButtonsHolder;

    public SourceAddressConfirmationModalView(Context context, d dVar, hnb0 hnb0Var, jpb0 jpb0Var, ysd0 ysd0Var, f7r f7rVar, AddressResolveRepository addressResolveRepository) {
        super(context);
        this.presenter = dVar;
        this.pickupFromPhotoEntryPointAnalytics = hnb0Var;
        this.pickupFromPhotoTooltipFactory = jpb0Var;
        this.pointActionRouterConsumer = ysd0Var;
        this.innerView = new iat0(this);
        int i = 1;
        this.finalizeAddressByGravityRouter = kotlin.a.a(new h9l0(f7rVar, addressResolveRepository, i));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setClickable(false);
        getBinding().g.setDebounceClickListener(new hat0(this, i));
        int i2 = 2;
        getBinding().f.setDebounceClickListener(new hat0(this, i2));
        getBinding().h.setDebounceClickListener(new hat0(this, 3));
        ru.yandex.taxi.design.utils.c.z(new gat0(this, i), getBinding().j);
        getBinding().b.setDebounceClickListener(new hat0(this, 4));
        int i3 = ndh0.end_side_fab_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ((LinearLayout) ((View) rp31.d(this, i3))).setGravity(8388613);
        FloatButtonHolderLayout c = eg3.c(this, 12);
        RotatableFloatButton b = eg3.b(c, new hos0(i2));
        b.setVisibility(8);
        this.pickupFromPhotoButton = b;
        this.upperEndButtonsHolder = c;
        eg3.d(eg3.c(this, 12), new hat0(this, 5));
        qdb1.b(this, new hat0(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(mat0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(lat0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(kat0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(rat0.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(lat0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.backFloatButtonPressed = true;
        sourceAddressConfirmationModalView.onBackPressed();
    }

    private final void appendPorchNumberButton(ListItemComponent addressComponent) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int r = tje.r(mrg0.go_design_m_space, getContext());
        layoutParams.setMarginStart(r);
        layoutParams.setMarginEnd(r);
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setText(getResources().getString(kyh0.summary_porch_button_label));
        robotoTextView.setTextColor(qje.t(xng0.textMain, getContext()));
        robotoTextView.setGravity(17);
        int t = qje.t(xng0.bgMinor, getContext());
        float r2 = tje.r(frg0.porch_background_corners_radius, getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 0.5f), Color.red(t), Color.green(t), Color.blue(t));
        vbb vbbVar = new vbb(t, r2);
        vbbVar.X(argb);
        int i = 0;
        vbbVar.Y(lhc.c(t) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0));
        robotoTextView.setBackground((Drawable) vbbVar.b);
        xw31.I(robotoTextView, Integer.valueOf(tje.r(frg0.porch_horizontal_padding, getContext())), Integer.valueOf(tje.r(frg0.porch_vertical_padding, getContext())), Integer.valueOf(tje.r(frg0.porch_horizontal_padding, getContext())), Integer.valueOf(tje.r(frg0.porch_vertical_padding, getContext())));
        frameLayout.addView(robotoTextView);
        addressComponent.setTrailView(frameLayout);
        addressComponent.setTrailContainerClickListener(new hat0(this, i));
        xw31.c(addressComponent, new f9l0(frameLayout, addressComponent, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendPorchNumberButton$lambda$0(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(qat0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendPorchNumberButton$lambda$1(FrameLayout frameLayout, ListItemComponent listItemComponent) {
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, listItemComponent.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g7r finalizeAddressByGravityRouter_delegate$lambda$0(f7r f7rVar, AddressResolveRepository addressResolveRepository) {
        return ((i7r) f7rVar).a(addressResolveRepository);
    }

    private final g7r getFinalizeAddressByGravityRouter() {
        return (g7r) this.finalizeAddressByGravityRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$0(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        sourceAddressConfirmationModalView.presenter.Ng(oat0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(ubt0 uiState) {
        if (uiState instanceof tbt0) {
            tbt0 tbt0Var = (tbt0) uiState;
            getBinding().d.setTitle(tbt0Var.a);
            getBinding().c.setTitle(tbt0Var.b);
            getBinding().b.setTitle(tbt0Var.e);
            getBinding().b.setSubtitle(tbt0Var.f);
            appendPorchNumberButton(getBinding().b);
            renderButton(getBinding().g, tbt0Var.c);
            renderButton(getBinding().f, tbt0Var.d);
            renderPickupFromPhotoButton(tbt0Var.g);
            cma1.J(this);
            return;
        }
        if (!(uiState instanceof qbt0)) {
            if (jl40.l(uiState, sbt0.a)) {
                cma1.L(this);
                return;
            } else {
                w511.b();
                return;
            }
        }
        getBinding().d.setTitle(kyh0.new_point_selection_screen_starting_point_title_statement);
        qbt0 qbt0Var = (qbt0) uiState;
        getBinding().b.setTitle(qbt0Var.a);
        getBinding().b.setSubtitle(qbt0Var.b);
        getBinding().c.setVisibility(8);
        getBinding().e.setVisibility(8);
        getBinding().i.setVisibility(0);
        getBinding().j.setVisibility(qbt0Var.d ? 0 : 8);
        renderPickupFromPhotoButton(qbt0Var.c);
        cma1.J(this);
    }

    private final void renderButton(ButtonComponent button, pbt0 buttonUiState) {
        int i;
        button.setText(buttonUiState.a);
        int i2 = jat0.a[buttonUiState.b.ordinal()];
        if (i2 == 1) {
            i = xng0.controlMain;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = xng0.controlMinor;
        }
        button.setButtonBackground(qje.t(i, getContext()));
    }

    private final void renderPickupFromPhotoButton(rbt0 state) {
        RotatableFloatButton rotatableFloatButton = this.pickupFromPhotoButton;
        if (state == null) {
            rotatableFloatButton.setVisibility(8);
            return;
        }
        rotatableFloatButton.setImageDrawable(new BitmapDrawable(getResources(), state.a));
        this.pickupFromPhotoButton.setContentDescription(state.c);
        ru.yandex.taxi.design.utils.c.z(new gat0(this, 0), this.pickupFromPhotoButton);
        this.pickupFromPhotoButton.setVisibility(0);
        ((umb0) this.pickupFromPhotoEntryPointAnalytics).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
        String str = state.b;
        if (str == null) {
            gpb0 gpb0Var = this.pickupFromPhotoTooltipContainer;
            if (gpb0Var != null) {
                ((dt20) gpb0Var).a(false);
            }
            gpb0 gpb0Var2 = this.pickupFromPhotoTooltipContainer;
            if (gpb0Var2 != null) {
                ((dt20) gpb0Var2).c();
            }
            this.pickupFromPhotoTooltipContainer = null;
            return;
        }
        jpb0 jpb0Var = this.pickupFromPhotoTooltipFactory;
        int i = chh0.address_confirmation_top_content_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, i));
        ((kpb0) jpb0Var).getClass();
        dt20 dt20Var = new dt20(frameLayout);
        this.pickupFromPhotoTooltipContainer = dt20Var;
        RotatableFloatButton rotatableFloatButton2 = this.pickupFromPhotoButton;
        PickupFromPhotoTooltipContainer$TooltipPointerAlignment pickupFromPhotoTooltipContainer$TooltipPointerAlignment = PickupFromPhotoTooltipContainer$TooltipPointerAlignment.START;
        dt20Var.p(rotatableFloatButton2, str);
        gpb0 gpb0Var3 = this.pickupFromPhotoTooltipContainer;
        if (gpb0Var3 != null) {
            ((dt20) gpb0Var3).a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderPickupFromPhotoButton$lambda$0(SourceAddressConfirmationModalView sourceAddressConfirmationModalView) {
        ((umb0) sourceAddressConfirmationModalView.pickupFromPhotoEntryPointAnalytics).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
        sourceAddressConfirmationModalView.presenter.Ng(pat0.a);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ur0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(kqh0.address_confirmation_modal_view, parent, false);
        int i = chh0.address_confirmation_source_address;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = chh0.address_confirmation_subtitle;
            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent2 != null) {
                i = chh0.address_confirmation_title;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    i = chh0.buttons_container;
                    GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                    if (goLinearLayout != null) {
                        i = chh0.change_address_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = chh0.confirm_address_button;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                            if (buttonComponent2 != null) {
                                i = chh0.done_button;
                                ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, inflate);
                                if (buttonComponent3 != null) {
                                    i = chh0.done_buttons_container;
                                    GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                                    if (goLinearLayout2 != null) {
                                        i = chh0.save_address_button;
                                        GoImageButton goImageButton = (GoImageButton) cma1.O(i, inflate);
                                        if (goImageButton != null) {
                                            return new ur0((GoLinearLayout) inflate, listItemComponent, listItemComponent2, listHeaderComponent, goLinearLayout, buttonComponent, buttonComponent2, buttonComponent3, goLinearLayout2, goImageButton);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(4);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        tpr k;
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setEnableBackgroundOnAppearing(false);
        d dVar = this.presenter;
        iat0 iat0Var = this.innerView;
        mob0 mob0Var = dVar.K;
        dVar.Bg(iat0Var);
        int i = 3;
        dVar.O = tje.N(dVar.Jg(), null, null, new SourceAddressConfirmationModalViewPresenter$attachView$1(dVar, null), 3);
        wat0 wat0Var = dVar.E;
        if (wat0Var.c) {
            dVar.C.w(new aat0(wat0Var.b.a));
        } else {
            tje.N(dVar.Jg(), null, null, new SourceAddressConfirmationModalViewPresenter$attachView$2(dVar, null), 3);
        }
        if (mob0Var.b()) {
            dVar.P = tje.N(dVar.Jg(), null, null, new SourceAddressConfirmationModalViewPresenter$attachView$3(dVar, null), 3);
            e.H(dVar.Jg(), new jqr(new c(mob0Var.c()), new SourceAddressConfirmationModalViewPresenter$attachView$5(dVar, null), i));
        }
        k = dVar.B.k(RoutePointType.POINT_A, false);
        e.H(dVar.Jg(), new jqr(e.t(k), new SourceAddressConfirmationModalViewPresenter$attachView$6(dVar, null), i));
        e.H(dVar.Jg(), e.n(e.t(dVar.z.a()), dVar.Q, e.t(dVar.D.b), new SourceAddressConfirmationModalViewPresenter$attachView$7(iat0Var, dVar, null)));
        setVisibility(8);
        ((ru.yandex.taxi.map_common.b) this.pointActionRouterConsumer).a(s.class, getFinalizeAddressByGravityRouter());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.Ng(this.backFloatButtonPressed ? nat0.a : sat0.a);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        gpb0 gpb0Var = this.pickupFromPhotoTooltipContainer;
        if (gpb0Var != null) {
            ((dt20) gpb0Var).c();
        }
        this.pickupFromPhotoTooltipContainer = null;
        ((ru.yandex.taxi.map_common.b) this.pointActionRouterConsumer).c(s.class, getFinalizeAddressByGravityRouter());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        ru.yandex.taxi.design.utils.c.q(this, kqh0.address_confirmation_top_content, true);
    }
}
