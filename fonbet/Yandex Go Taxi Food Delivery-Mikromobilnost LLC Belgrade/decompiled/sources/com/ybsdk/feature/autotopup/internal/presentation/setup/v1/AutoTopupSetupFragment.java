package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupToggleView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.SelectedItemFormView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import com.ybsdk.widgets.common.tabview.TabView;
import defpackage.a04;
import defpackage.a061;
import defpackage.ahq0;
import defpackage.av3;
import defpackage.bei;
import defpackage.bmg0;
import defpackage.buz0;
import defpackage.bv3;
import defpackage.ce4;
import defpackage.cuz0;
import defpackage.cv3;
import defpackage.cyy;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.eu3;
import defpackage.frb1;
import defpackage.fu3;
import defpackage.g8e;
import defpackage.h2b1;
import defpackage.hua1;
import defpackage.j5x0;
import defpackage.jl40;
import defpackage.jr3;
import defpackage.k5x0;
import defpackage.k751;
import defpackage.l14;
import defpackage.lfx;
import defpackage.m14;
import defpackage.n14;
import defpackage.n751;
import defpackage.ntz0;
import defpackage.ny61;
import defpackage.o14;
import defpackage.o2b1;
import defpackage.p14;
import defpackage.q14;
import defpackage.qas0;
import defpackage.rz3;
import defpackage.sls;
import defpackage.sm91;
import defpackage.stz0;
import defpackage.sz3;
import defpackage.t14;
import defpackage.tdr;
import defpackage.tn1;
import defpackage.u14;
import defpackage.uk11;
import defpackage.unr0;
import defpackage.utb1;
import defpackage.uz3;
import defpackage.v14;
import defpackage.vv3;
import defpackage.w14;
import defpackage.w511;
import defpackage.wfz;
import defpackage.wz3;
import defpackage.wz51;
import defpackage.x14;
import defpackage.xz3;
import defpackage.y14;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import defpackage.zz3;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001R\b\u0000\u0018\u0000 X2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001YB\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001aH\u0016¢\u0006\u0004\b.\u0010&J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010&J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u0013\u00103\u001a\u00020\u001a*\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\u001a*\u000202H\u0002¢\u0006\u0004\b5\u00104J+\u0010:\u001a\u00020\u001a2\u0006\u00106\u001a\u00020!2\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\u001a2\u0006\u00106\u001a\u00020!2\b\u00109\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020>H\u0002¢\u0006\u0004\bA\u0010@J#\u0010(\u001a\u00020\u001a*\u00020>2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010EJ\u0017\u0010F\u001a\u00020\u001a2\u0006\u0010'\u001a\u000202H\u0002¢\u0006\u0004\bF\u00104J\u000f\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0004\bG\u0010&J\u000f\u0010H\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010&J\u0017\u0010I\u001a\u00020\u001a2\u0006\u0010'\u001a\u000202H\u0002¢\u0006\u0004\bI\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v1/AutoTopupSetupFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "La061;", "Ly14;", "Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v1/b;", "Lce4;", "Ltdr;", "Lq14;", "viewModelFactory", "Luk11;", "secondFactorScreenProvider", "<init>", "(Lq14;Luk11;)V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v1/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La061;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "viewState", "render", "(Ly14;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onStop", "onStart", "onDestroyView", "onBackPressed", "Lu14;", "renderAutoTopup", "(Lu14;)V", "renderAutoFund", "anchorView", "Lcom/ybsdk/core/utils/text/Text;", "title", "subtitle", "showErrorTooltip", "(Landroid/view/View;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;)V", "showTooltip", "(Landroid/view/View;Lcom/ybsdk/core/utils/text/Text;)V", "Lcom/ybsdk/widgets/common/LoadableInput;", "focusHandler", "(Lcom/ybsdk/widgets/common/LoadableInput;)V", "scrollToFocusedLoadableInput", "Lfu3;", "amountInput", "isInteractive", "(Lcom/ybsdk/widgets/common/LoadableInput;Lfu3;Z)V", "renderBottomSheet", "onSavingsNoticeBackButtonListener", "disableInputStateRestoration", "renderValidationErrorTooltip", "Lq14;", "Luk11;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lcuz0;", "errorTooltip", "Lcuz0;", "a04", "selectPaymentMethodListener", "La04;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "focusListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Companion", "zz3", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupSetupFragment extends BaseMvvmFragment<a061, y14, b> implements ce4, tdr {
    private static final zz3 Companion = new zz3();
    private static final long DEFAULT_HIDE_KEYBOARD_DELAY_MS = 100;
    private BottomSheetDialogView bottomSheetDialogView;
    private cuz0 errorTooltip;
    private ViewTreeObserver.OnGlobalFocusChangeListener focusListener;
    private final uk11 secondFactorScreenProvider;
    private final a04 selectPaymentMethodListener;
    private final q14 viewModelFactory;

    public AutoTopupSetupFragment(q14 q14Var, uk11 uk11Var) {
        super(null, 3, null, null, b.class, 13, null);
        this.viewModelFactory = q14Var;
        this.secondFactorScreenProvider = uk11Var;
        this.selectPaymentMethodListener = new a04(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void disableInputStateRestoration() {
        ((a061) getBinding()).e.getEditText().setSaveEnabled(false);
        ((a061) getBinding()).n.getEditText().setSaveEnabled(false);
        ((a061) getBinding()).b.getEditText().setSaveEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void focusHandler(LoadableInput view) {
        utb1.d(((a061) getBinding()).h, view.getEditText());
        ((a061) getBinding()).h.open();
        scrollToFocusedLoadableInput(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$0(AutoTopupSetupFragment autoTopupSetupFragment, k5x0 k5x0Var) {
        autoTopupSetupFragment.getViewModel().P0(k5x0Var.a());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$1(AutoTopupSetupFragment autoTopupSetupFragment, Editable editable) {
        autoTopupSetupFragment.getViewModel().j0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$2(AutoTopupSetupFragment autoTopupSetupFragment, Editable editable) {
        autoTopupSetupFragment.getViewModel().Q0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$4$lambda$3(AutoTopupSetupFragment autoTopupSetupFragment, Editable editable) {
        autoTopupSetupFragment.getViewModel().i0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$5(AutoTopupSetupFragment autoTopupSetupFragment, String str, Bundle bundle) {
        autoTopupSetupFragment.getViewModel().I0(((vv3) autoTopupSetupFragment.secondFactorScreenProvider).a(bundle));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$6(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().B0(null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSavingsNoticeBackButtonListener() {
        getViewModel().L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$10(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().R0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$11(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().v0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$25$lambda$12(AutoTopupSetupFragment autoTopupSetupFragment, View view) {
        autoTopupSetupFragment.getViewModel().e0();
        autoTopupSetupFragment.getViewModel().G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$13(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().K0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$14(AutoTopupSetupFragment autoTopupSetupFragment, String str) {
        autoTopupSetupFragment.getViewModel().A0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$15(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().t0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$16(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().u0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$25$lambda$17(AutoTopupSetupFragment autoTopupSetupFragment, CompoundButton compoundButton, boolean z) {
        autoTopupSetupFragment.getViewModel().e0();
        autoTopupSetupFragment.getViewModel().m0(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$25$lambda$18(AutoTopupSetupFragment autoTopupSetupFragment, CompoundButton compoundButton, boolean z) {
        autoTopupSetupFragment.getViewModel().e0();
        autoTopupSetupFragment.getViewModel().l0(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$19(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().H0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$20(AutoTopupSetupFragment autoTopupSetupFragment) {
        autoTopupSetupFragment.getViewModel().M0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$25$lambda$21(AutoTopupSetupFragment autoTopupSetupFragment, String str) {
        autoTopupSetupFragment.getViewModel().A0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$25$lambda$22(AutoTopupSetupFragment autoTopupSetupFragment, View view) {
        autoTopupSetupFragment.getViewModel().n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$25$lambda$23(AutoTopupSetupFragment autoTopupSetupFragment, View view) {
        autoTopupSetupFragment.getViewModel().p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$25$lambda$24(AutoTopupSetupFragment autoTopupSetupFragment, View view) {
        autoTopupSetupFragment.getViewModel().o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$27(AutoTopupSetupFragment autoTopupSetupFragment, View view, View view2) {
        if (jl40.l(view, view2)) {
            return;
        }
        if (jl40.l(view, ((a061) autoTopupSetupFragment.getBinding()).e.getEditText())) {
            autoTopupSetupFragment.getViewModel().E0();
        } else if (jl40.l(view, ((a061) autoTopupSetupFragment.getBinding()).n.getEditText())) {
            autoTopupSetupFragment.getViewModel().F0();
        } else if (jl40.l(view, ((a061) autoTopupSetupFragment.getBinding()).b.getEditText())) {
            autoTopupSetupFragment.getViewModel().D0();
        }
        if (jl40.l(view2, ((a061) autoTopupSetupFragment.getBinding()).e.getEditText())) {
            autoTopupSetupFragment.getViewModel().y0();
            autoTopupSetupFragment.focusHandler(((a061) autoTopupSetupFragment.getBinding()).e);
        } else if (jl40.l(view2, ((a061) autoTopupSetupFragment.getBinding()).n.getEditText())) {
            autoTopupSetupFragment.getViewModel().z0();
            autoTopupSetupFragment.focusHandler(((a061) autoTopupSetupFragment.getBinding()).n);
        } else if (jl40.l(view2, ((a061) autoTopupSetupFragment.getBinding()).b.getEditText())) {
            autoTopupSetupFragment.getViewModel().x0();
            autoTopupSetupFragment.focusHandler(((a061) autoTopupSetupFragment.getBinding()).b);
        } else {
            autoTopupSetupFragment.getViewModel().e0();
            autoTopupSetupFragment.safePostDelayed(100L, new rz3(autoTopupSetupFragment, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$27$lambda$26(AutoTopupSetupFragment autoTopupSetupFragment) {
        ((a061) autoTopupSetupFragment.getBinding()).h.hide();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahq0 render$lambda$31$lambda$30$lambda$28(u14 u14Var, ahq0 ahq0Var) {
        return u14Var.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonViewGroup.b render$lambda$31$lambda$30$lambda$29(u14 u14Var, YbButtonViewGroup.b bVar) {
        return u14Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$38(fu3 fu3Var, boolean z, g gVar) {
        return g.a(gVar, fu3Var.c(), new cyy(2), z, null, fu3Var.d(), null, null, false, null, null, g8e.i(Text.Companion, fu3Var.a()), false, null, null, !fu3Var.b(), 0, false, 0, 0, null, null, null, 33516520);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAutoFund(u14 u14Var) {
        a061 a061Var = (a061) getBinding();
        AutoTopupToggleView autoTopupToggleView = a061Var.d;
        LoadableInput loadableInput = a061Var.b;
        autoTopupToggleView.getSwitchButton().setVisibility(u14Var.a() != null ? 0 : 8);
        jr3 a = u14Var.a();
        if (a != null) {
            a061Var.d.render(o2b1.e(a));
            loadableInput.setVisibility(a.getEnabled() ? 0 : 8);
            render(loadableInput, a.a(), u14Var.j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAutoTopup(u14 u14Var) {
        a061 a061Var = (a061) getBinding();
        AutoTopupToggleView autoTopupToggleView = a061Var.m;
        LoadableInput loadableInput = a061Var.n;
        TabView tabView = a061Var.k;
        autoTopupToggleView.getSwitchButton().setVisibility(0);
        a061Var.m.render(o2b1.e(u14Var.b()));
        LoadableInput loadableInput2 = a061Var.e;
        loadableInput2.setVisibility(u14Var.b().getEnabled() ? 0 : 8);
        render(loadableInput2, u14Var.b().a(), u14Var.j());
        loadableInput.setVisibility(u14Var.b().getEnabled() ? 0 : 8);
        render(loadableInput, u14Var.b().b(), u14Var.j());
        if (u14Var.f() == null || !u14Var.b().getEnabled()) {
            tabView.setVisibility(8);
        } else {
            tabView.setVisibility(0);
            tabView.render(new uz3(u14Var, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j5x0 renderAutoTopup$lambda$33$lambda$32(u14 u14Var, j5x0 j5x0Var) {
        return u14Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBottomSheet(final u14 viewState) {
        BottomSheetDialogView.State state;
        cv3 c = viewState.c();
        final int i = 1;
        final int i2 = 0;
        if (c instanceof bv3) {
            state = new BottomSheetDialogView.State(new e(null, null, new sls(this) { // from class: vz3
                public final /* synthetic */ AutoTopupSetupFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View renderBottomSheet$lambda$40;
                    View renderBottomSheet$lambda$42;
                    int i3 = i2;
                    u14 u14Var = viewState;
                    AutoTopupSetupFragment autoTopupSetupFragment = this.b;
                    switch (i3) {
                        case 0:
                            renderBottomSheet$lambda$40 = AutoTopupSetupFragment.renderBottomSheet$lambda$40(autoTopupSetupFragment, u14Var);
                            return renderBottomSheet$lambda$40;
                        default:
                            renderBottomSheet$lambda$42 = AutoTopupSetupFragment.renderBottomSheet$lambda$42(autoTopupSetupFragment, u14Var);
                            return renderBottomSheet$lambda$42;
                    }
                }
            }, 3), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_payment_method_select_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        } else if (jl40.l(c, wfz.x)) {
            state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_title), new Text.Resource(dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_description), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_button_text), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        } else if (jl40.l(c, h2b1.w)) {
            state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_uprid_alert_uprid_in_progress_title), new Text.Resource(dzh0.ybsdk_uprid_alert_uprid_in_progress_description), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_uprid_alert_uprid_in_progress_primary_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        } else if (jl40.l(c, bei.x)) {
            ColorModel colorModel = null;
            ColorModel colorModel2 = null;
            ColorModel colorModel3 = null;
            boolean z = false;
            state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_exit_confirmation_title), new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_subtitle), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_save_button_title), null, null, null, colorModel, colorModel2, colorModel3, false, z, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_cancel_button_title), 0 == true ? 1 : 0, 0 == true ? 1 : 0, colorModel, colorModel2, colorModel3, null, z, false, null, 4094), null, null, null, null, null, null, 131064);
        } else if (c instanceof av3) {
            state = new BottomSheetDialogView.State(new e(null, null, new sls(this) { // from class: vz3
                public final /* synthetic */ AutoTopupSetupFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View renderBottomSheet$lambda$40;
                    View renderBottomSheet$lambda$42;
                    int i3 = i;
                    u14 u14Var = viewState;
                    AutoTopupSetupFragment autoTopupSetupFragment = this.b;
                    switch (i3) {
                        case 0:
                            renderBottomSheet$lambda$40 = AutoTopupSetupFragment.renderBottomSheet$lambda$40(autoTopupSetupFragment, u14Var);
                            return renderBottomSheet$lambda$40;
                        default:
                            renderBottomSheet$lambda$42 = AutoTopupSetupFragment.renderBottomSheet$lambda$42(autoTopupSetupFragment, u14Var);
                            return renderBottomSheet$lambda$42;
                    }
                }
            }, 3), new YbButtonView.a(((av3) viewState.c()).a(), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        } else {
            if (c != null) {
                w511.b();
                return;
            }
            state = null;
        }
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (state == null) {
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        if (bottomSheetDialogView == null) {
            BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView2.onPrimaryAction(new wz3(this, i2));
            bottomSheetDialogView2.onSecondaryAction(new wz3(this, i));
            bottomSheetDialogView2.onDismiss(new sz3(this, 5));
            BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView2;
        }
        BottomSheetDialogView bottomSheetDialogView3 = this.bottomSheetDialogView;
        if (bottomSheetDialogView3 != null) {
            bottomSheetDialogView3.render(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$40(AutoTopupSetupFragment autoTopupSetupFragment, u14 u14Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(autoTopupSetupFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(autoTopupSetupFragment.selectPaymentMethodListener);
        selectPaymentMethodView.render(((bv3) u14Var.c()).a());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$42(AutoTopupSetupFragment autoTopupSetupFragment, u14 u14Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(autoTopupSetupFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(autoTopupSetupFragment.selectPaymentMethodListener);
        selectPaymentMethodView.setOnLeftToolbarImageClickListener(new AutoTopupSetupFragment$renderBottomSheet$newBottomSheetState$2$1$1(autoTopupSetupFragment));
        selectPaymentMethodView.render(((av3) u14Var.c()).b());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBottomSheet$lambda$46$lambda$43(AutoTopupSetupFragment autoTopupSetupFragment, View view) {
        autoTopupSetupFragment.getViewModel().r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBottomSheet$lambda$46$lambda$44(AutoTopupSetupFragment autoTopupSetupFragment, View view) {
        autoTopupSetupFragment.getViewModel().s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderBottomSheet$lambda$46$lambda$45(AutoTopupSetupFragment autoTopupSetupFragment, boolean z) {
        autoTopupSetupFragment.getViewModel().w0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderValidationErrorTooltip(u14 viewState) {
        cuz0 cuz0Var = this.errorTooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        this.errorTooltip = null;
        jr3 a = viewState.a();
        if ((a != null ? a.a().e() : null) != null && viewState.a().getEnabled()) {
            eu3 e = viewState.a().a().e();
            showErrorTooltip(((a061) getBinding()).b, e.b(), e.a());
        } else if (viewState.b().a().e() != null && viewState.b().getEnabled()) {
            eu3 e2 = viewState.b().a().e();
            showErrorTooltip(((a061) getBinding()).e, e2.b(), e2.a());
        } else {
            if (viewState.b().b().e() == null || !viewState.b().getEnabled()) {
                return;
            }
            eu3 e3 = viewState.b().b().e();
            showErrorTooltip(((a061) getBinding()).n, e3.b(), e3.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void scrollToFocusedLoadableInput(LoadableInput view) {
        Rect e = com.ybsdk.core.utils.ext.view.b.e(view, ((a061) getBinding()).q);
        ((a061) getBinding()).q.verticalScrollToFocusedView(e.top, e.bottom, ((a061) getBinding()).q.getScrollY());
    }

    private final void showErrorTooltip(View anchorView, Text title, Text subtitle) {
        buz0 d = frb1.d(requireContext());
        d.l(subtitle);
        d.g(Tooltip$PreferredGravity.START);
        d.f(false);
        if (title != null) {
            d.o(title);
        }
        cuz0 a = d.a();
        this.errorTooltip = a;
        a.f(anchorView, 0L);
    }

    public static /* synthetic */ void showErrorTooltip$default(AutoTopupSetupFragment autoTopupSetupFragment, View view, Text text, Text text2, int i, Object obj) {
        if ((i & 2) != 0) {
            text = null;
        }
        autoTopupSetupFragment.showErrorTooltip(view, text, text2);
    }

    private final void showTooltip(View anchorView, Text subtitle) {
        if (subtitle != null) {
            buz0 d = frb1.d(requireContext());
            d.l(subtitle);
            d.k(Tooltip$PreferredPosition.TOP);
            d.g(Tooltip$PreferredGravity.CENTER);
            d.a().f(anchorView, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof p14) {
            p14 p14Var = (p14) sideEffect;
            if (p14Var instanceof o14) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((o14) sideEffect).a(), null, 12);
                return;
            }
            if (p14Var.equals(m14.a)) {
                sm91.h(bmg0.ybsdk_animation_wiggle, ((a061) getBinding()).i);
                return;
            }
            if (p14Var instanceof l14) {
                showTooltip(((a061) getBinding()).d.getSubtitleEndIcon(), ((l14) sideEffect).a());
            } else if (p14Var instanceof n14) {
                getViewModel().X0(((n14) sideEffect).a());
            } else {
                w511.b();
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((t14) this.viewModelFactory).a((AutoTopupSetupParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public a061 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        a061 o = a061.o(inflater, container);
        o.k.setOnTabSelectedListener(new sz3(this, 1));
        o.e.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new sz3(this, 2)));
        o.n.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new sz3(this, 3)));
        o.b.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new sz3(this, 4)));
        o.h.setSkeletonMode(false);
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        k751 k751Var = insets.a;
        int i = k751Var.h(2).d;
        int i2 = k751Var.h(519).b;
        ToolbarView toolbarView = ((a061) getBinding()).o;
        ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        toolbarView.setLayoutParams(marginLayoutParams);
        YbButtonViewGroup ybButtonViewGroup = ((a061) getBinding()).j;
        ViewGroup.LayoutParams layoutParams2 = ybButtonViewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, i);
        ybButtonViewGroup.setLayoutParams(marginLayoutParams2);
        ErrorView errorView = ((a061) getBinding()).f;
        ViewGroup.LayoutParams layoutParams3 = errorView.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, i2, marginLayoutParams3.rightMargin, i);
        errorView.setLayoutParams(marginLayoutParams3);
        NumberKeyboardView numberKeyboardView = ((a061) getBinding()).h;
        numberKeyboardView.setPadding(numberKeyboardView.getPaddingLeft(), numberKeyboardView.getPaddingTop(), numberKeyboardView.getPaddingRight(), i);
        getViewModel().k0(i2, i);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        if (((a061) getBinding()).h.isOpen()) {
            getViewModel().e0();
            ((a061) getBinding()).h.hide();
            return true;
        }
        if (((a061) getBinding()).p.getVisibility() == 0) {
            getViewModel().v0();
            return true;
        }
        getViewModel().q0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "AUTO_TOPUP_REQUEST_KEY", new tn1(18, this));
        hua1.g(this, "request_select_target", new com.ybsdk.feature.transfer.api.a(new rz3(this, 6), new AutoTopupSetupFragment$onCreate$2(getViewModel())));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.focusListener = null;
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().J0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        getViewModel().N0();
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        getViewModel().O0();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().S0(getViewLifecycleOwner().getLifecycle());
        a061 a061Var = (a061) getBinding();
        disableInputStateRestoration();
        final int i = 0;
        a061Var.o.setOnRightImageClickListener(new rz3(this, i));
        a061Var.o.setOnCloseButtonClickListener(new rz3(this, 7));
        a061Var.i.setOnClickListener(new wz3(this, 5));
        a061Var.e.setCanShowSoftInputOnFocus(false);
        a061Var.n.setCanShowSoftInputOnFocus(false);
        a061Var.b.setCanShowSoftInputOnFocus(false);
        YbButtonViewGroup ybButtonViewGroup = a061Var.j;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new rz3(this, 8));
        ybButtonViewGroup.setLinkClickListener(new sz3(this, i));
        ErrorView errorView = a061Var.f;
        final int i2 = 1;
        errorView.setPrimaryButtonOnClickListener(new rz3(this, i2));
        int i3 = 2;
        errorView.setSecondaryButtonClickListener(new rz3(this, i3));
        errorView.setChangeVisibilityWithDelay(false);
        AutoTopupToggleView autoTopupToggleView = a061Var.m;
        autoTopupToggleView.getSwitchButton().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: tz3
            public final /* synthetic */ AutoTopupSetupFragment b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i;
                AutoTopupSetupFragment autoTopupSetupFragment = this.b;
                switch (i4) {
                    case 0:
                        AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$17(autoTopupSetupFragment, compoundButton, z);
                        break;
                    default:
                        AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$18(autoTopupSetupFragment, compoundButton, z);
                        break;
                }
            }
        });
        AutoTopupToggleView autoTopupToggleView2 = a061Var.d;
        autoTopupToggleView2.getSwitchButton().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: tz3
            public final /* synthetic */ AutoTopupSetupFragment b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i2;
                AutoTopupSetupFragment autoTopupSetupFragment = this.b;
                switch (i4) {
                    case 0:
                        AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$17(autoTopupSetupFragment, compoundButton, z);
                        break;
                    default:
                        AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$18(autoTopupSetupFragment, compoundButton, z);
                        break;
                }
            }
        });
        CommunicationFullScreenView communicationFullScreenView = a061Var.p;
        int i4 = 3;
        communicationFullScreenView.setPrimaryButtonOnClickListener(new rz3(this, i4));
        int i5 = 4;
        communicationFullScreenView.setSecondaryButtonClickListener(new rz3(this, i5));
        communicationFullScreenView.setOnLinkClickListener(new sz3(this, 6));
        autoTopupToggleView2.getSubtitleEndIcon().setOnClickListener(new wz3(this, i3));
        autoTopupToggleView.getTitle().setOnClickListener(new wz3(this, i4));
        autoTopupToggleView2.getTitle().setOnClickListener(new wz3(this, i5));
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0)));
        setNavigationBarColorModel(new z1x0(new ColorModel.Raw(0)));
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: yz3
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                AutoTopupSetupFragment.onViewCreated$lambda$27(AutoTopupSetupFragment.this, view2, view3);
            }
        };
        com.ybsdk.core.utils.ext.view.b.o(view, onGlobalFocusChangeListener);
        this.focusListener = onGlobalFocusChangeListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(y14 viewState) {
        stz0 b;
        a061 a061Var = (a061) getBinding();
        boolean z = viewState instanceof w14;
        w14 w14Var = z ? (w14) viewState : null;
        int i = 1;
        setBackButtonVisible(!(((w14Var == null || (b = w14Var.b()) == null) ? null : b.b()) instanceof ntz0));
        NumberKeyboardView numberKeyboardView = a061Var.h;
        ToolbarView toolbarView = a061Var.o;
        ErrorView errorView = a061Var.f;
        wz51 wz51Var = a061Var.l;
        SelectedItemFormView selectedItemFormView = a061Var.i;
        CommunicationFullScreenView communicationFullScreenView = a061Var.p;
        numberKeyboardView.setSkeletonMode(false);
        wz51Var.p().setVisibility(8);
        errorView.render(null);
        numberKeyboardView.setVisibility(0);
        if (viewState instanceof u14) {
            u14 u14Var = (u14) viewState;
            toolbarView.render(u14Var.g());
            selectedItemFormView.setClickable(u14Var.j());
            selectedItemFormView.setEnabled(u14Var.j());
            selectedItemFormView.render(new uz3(u14Var, r10));
            a061Var.j.render(new uz3(u14Var, i));
            numberKeyboardView.setSkeletonMode(!u14Var.j());
            numberKeyboardView.setEnabled(u14Var.j());
            renderBottomSheet(u14Var);
            a061Var.c.setVisibility(u14Var.h() ? 0 : 8);
            if (u14Var.h()) {
                renderAutoFund(u14Var);
            }
            a061Var.g.setVisibility(u14Var.i() ? 0 : 8);
            if (u14Var.i()) {
                renderAutoTopup(u14Var);
            }
            communicationFullScreenView.setVisibility(8);
            renderValidationErrorTooltip(u14Var);
            return;
        }
        if (viewState instanceof v14) {
            errorView.render(((v14) viewState).a());
            numberKeyboardView.setVisibility(8);
            communicationFullScreenView.setVisibility(8);
        } else if (viewState instanceof x14) {
            wz51Var.p().setVisibility(0);
            numberKeyboardView.setSkeletonMode(true);
            communicationFullScreenView.setVisibility(8);
        } else {
            if (!z) {
                w511.b();
                return;
            }
            w14 w14Var2 = (w14) viewState;
            toolbarView.render(w14Var2.b());
            communicationFullScreenView.render(w14Var2.a());
            numberKeyboardView.setVisibility(8);
            communicationFullScreenView.setVisibility(0);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    private final void render(LoadableInput loadableInput, fu3 fu3Var, boolean z) {
        loadableInput.setCanShowSoftInputOnFocus(false);
        LoadableInput.render$default(loadableInput, false, new xz3(fu3Var, z, 0), 1, null);
        if (fu3Var.b()) {
            loadableInput.getEditText().requestFocus();
        } else {
            loadableInput.getEditText().clearFocus();
        }
    }
}
