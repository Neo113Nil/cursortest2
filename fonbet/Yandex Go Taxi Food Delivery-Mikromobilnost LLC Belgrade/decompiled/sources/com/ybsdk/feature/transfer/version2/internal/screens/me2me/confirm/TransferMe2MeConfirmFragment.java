package com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import defpackage.am01;
import defpackage.bm01;
import defpackage.buz0;
import defpackage.cm01;
import defpackage.cuz0;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.el0;
import defpackage.frb1;
import defpackage.h5a0;
import defpackage.hcq0;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.lwg0;
import defpackage.mdq0;
import defpackage.mm01;
import defpackage.nm01;
import defpackage.om01;
import defpackage.px11;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.s8j0;
import defpackage.saf;
import defpackage.sl;
import defpackage.t8j0;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.vvz0;
import defpackage.w511;
import defpackage.y8f;
import defpackage.y961;
import defpackage.yr31;
import defpackage.zl01;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u00020\u0007B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00102\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010#J\u0019\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J+\u0010/\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010*2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000201H\u0002¢\u0006\u0004\b6\u00104J\u0019\u00107\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J-\u00109\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b9\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/TransferMe2MeConfirmFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ly961;", "Lu8j0;", "Lmm01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/TransferMe2MeConfirmViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/a;", "Lmdq0;", "Lnm01;", "viewModelFactory", "<init>", "(Lnm01;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/a;", "Lsl;", "accountPaymentMethodEntity", "Lzy11;", "onSelectedAccountChanged", "(Lsl;)V", "viewState", "render", "(Lu8j0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ly961;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "onStop", "onDestroyView", "Lvvz0;", "tooltipViewState", "renderTooltip", "(Lvvz0;)V", "Lcom/ybsdk/core/utils/text/Text;", "subtitle", "linkText", "Lrbv;", "linkImage", "showTooltip", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lrbv;)V", "Lpx11;", "widgetState", "setupWidget", "(Lpx11;)V", ClidProvider.STATE, "showWidget", "renderBottomSheet", "(Lmm01;)Lzy11;", "hideAndShowTooltip", "Lnm01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/TransferMe2MeConfirmScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/confirm/TransferMe2MeConfirmScreenParams;", "screenParams", "Lcuz0;", "tooltip", "Lcuz0;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "previousViewState", "Lu8j0;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferMe2MeConfirmFragment extends BaseMvvmFragment<y961, u8j0, a> implements mdq0 {
    private BottomSheetDialogView bottomSheetDialogView;
    private u8j0 previousViewState;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private cuz0 tooltip;
    private final nm01 viewModelFactory;

    public TransferMe2MeConfirmFragment(nm01 nm01Var) {
        super(Boolean.TRUE, null, null, null, a.class, 14, null);
        this.viewModelFactory = nm01Var;
        this.screenParams = dcs.c(this);
    }

    private final TransferMe2MeConfirmScreenParams getScreenParams() {
        return (TransferMe2MeConfirmScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$3(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, StadiumButtonView.ClickedPart clickedPart) {
        int i = cm01.a[clickedPart.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            transferMe2MeConfirmFragment.getViewModel().l0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$7$lambda$4(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, View view) {
        transferMe2MeConfirmFragment.getViewModel().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$6$lambda$5(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment) {
        transferMe2MeConfirmFragment.getViewModel().e0();
        return zy11.a;
    }

    private final void hideAndShowTooltip(Text subtitle, Text linkText, rbv linkImage) {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        this.tooltip = null;
        if (subtitle != null) {
            showTooltip(subtitle, linkText, linkImage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderBottomSheet(mm01 viewState) {
        hcq0 a = viewState.a();
        zy11 zy11Var = zy11.a;
        if (a == null) {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView == null) {
                return null;
            }
            bottomSheetDialogView.dismiss();
            this.bottomSheetDialogView = null;
            vvz0 g = viewState.g();
            Text c = g != null ? g.c() : null;
            vvz0 g2 = viewState.g();
            Text b = g2 != null ? g2.b() : null;
            vvz0 g3 = viewState.g();
            hideAndShowTooltip(c, b, g3 != null ? g3.a() : null);
            return zy11Var;
        }
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new i5y0(26, this, viewState), 3), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_payment_method_select_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (bottomSheetDialogView2 == null) {
            BottomSheetDialogView bottomSheetDialogView3 = new BottomSheetDialogView(((y961) getBinding()).o().getContext(), null, 0, 6, null);
            bottomSheetDialogView3.onPrimaryAction(new am01(this, 1));
            bottomSheetDialogView3.onDismiss(new zl01(this, 2));
            BottomSheetDialogView.show$default(bottomSheetDialogView3, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView3;
            bottomSheetDialogView2 = bottomSheetDialogView3;
        }
        bottomSheetDialogView2.render(state);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$25$lambda$22$lambda$17(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, mm01 mm01Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(transferMe2MeConfirmFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(transferMe2MeConfirmFragment);
        selectPaymentMethodView.render(mm01Var.a().a());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$18(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, View view) {
        transferMe2MeConfirmFragment.getViewModel().c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$19(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, boolean z) {
        transferMe2MeConfirmFragment.getViewModel().b0();
        return zy11.a;
    }

    private final void renderTooltip(vvz0 tooltipViewState) {
        if (tooltipViewState != null) {
            showTooltip(tooltipViewState.c(), tooltipViewState.b(), tooltipViewState.a());
            return;
        }
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        this.tooltip = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupWidget(px11 widgetState) {
        ((y961) getBinding()).i.setClickListener(new zl01(this, 3));
        if (widgetState != null) {
            showWidget(widgetState);
        }
        ((y961) getBinding()).i.setVisibility(widgetState == null ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupWidget$lambda$14(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, px11 px11Var) {
        transferMe2MeConfirmFragment.getViewModel().j0(px11Var);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showTooltip(Text subtitle, Text linkText, rbv linkImage) {
        mm01 mm01Var;
        u8j0 u8j0Var = this.previousViewState;
        vvz0 g = (u8j0Var == null || (mm01Var = (mm01) u8j0Var.a()) == null) ? null : mm01Var.g();
        if (jl40.l(subtitle, g != null ? g.c() : null) && jl40.l(linkText, g.b()) && this.tooltip != null) {
            return;
        }
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        buz0 d = frb1.d(requireContext());
        d.l(subtitle);
        d.j(rje.d(lwg0.ybsdk_tooltip_horizontal_padding, requireContext()));
        d.i(linkText);
        d.h(linkImage);
        d.e();
        d.f(false);
        d.k(Tooltip$PreferredPosition.TOP);
        int i = 1;
        d.b(new bm01(this, i));
        d.d(new zl01(this, i));
        cuz0 a = d.a();
        this.tooltip = a;
        a.f(((y961) getBinding()).c, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTooltip$lambda$12(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment) {
        transferMe2MeConfirmFragment.getViewModel().h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTooltip$lambda$13(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, Tooltip$DismissReason tooltip$DismissReason) {
        transferMe2MeConfirmFragment.tooltip = null;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showWidget(px11 state) {
        ((y961) getBinding()).i.render(state);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((om01) this.viewModelFactory).a(getScreenParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public y961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        y961 p = y961.p(getLayoutInflater(), container);
        int i = 0;
        p.g.onClick(new zl01(this, i));
        p.h.setSubtitleClickListener(new am01(this, i));
        ErrorView errorView = p.f;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new bm01(this, i));
        return p;
    }

    @Override // defpackage.mdq0
    public void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onAdditionalButtonClicked(el0 el0Var) {
    }

    @Override // defpackage.mdq0
    public void onBackPressedFromSbp() {
    }

    @Override // defpackage.mdq0
    public void onCreditPaymentMethodChanged(saf safVar) {
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.previousViewState = null;
        this.tooltip = null;
        this.bottomSheetDialogView = null;
        getViewModel().d0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        mm01 mm01Var;
        vvz0 g;
        super.onResume();
        u8j0 u8j0Var = this.previousViewState;
        if (u8j0Var == null || (mm01Var = (mm01) u8j0Var.a()) == null || mm01Var.a() != null || (g = mm01Var.g()) == null) {
            return;
        }
        hideAndShowTooltip(g.c(), g.b(), g.a());
    }

    @Override // defpackage.mdq0
    public void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onSbpWidgetClicked() {
    }

    @Override // defpackage.mdq0
    public void onSelectedAccountChanged(sl accountPaymentMethodEntity) {
        getViewModel().f0(accountPaymentMethodEntity);
    }

    @Override // defpackage.mdq0
    public void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        y961 y961Var = (y961) getBinding();
        ErrorView errorView = y961Var.f;
        StadiumButtonView stadiumButtonView = y961Var.g;
        errorView.render(null);
        boolean z = viewState instanceof t8j0;
        y961Var.b.o().setVisibility(!z ? 4 : 0);
        if (viewState instanceof r8j0) {
            mm01 mm01Var = (mm01) ((r8j0) viewState).e();
            y961Var.h.render(mm01Var.f());
            y961Var.d.setText(d.a(requireContext(), mm01Var.e()));
            y961Var.e.setText(d.a(requireContext(), mm01Var.b()));
            renderTooltip(mm01Var.g());
            setupWidget(mm01Var.c());
            stadiumButtonView.render(mm01Var.d());
            stadiumButtonView.setVisibility(mm01Var.c() != null ? 4 : 0);
            y961Var.i.setVisibility(mm01Var.c() != null ? 0 : 4);
            renderBottomSheet(mm01Var);
        } else if (viewState instanceof s8j0) {
            y961Var.f.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        } else if (!z) {
            w511.b();
            return;
        }
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
