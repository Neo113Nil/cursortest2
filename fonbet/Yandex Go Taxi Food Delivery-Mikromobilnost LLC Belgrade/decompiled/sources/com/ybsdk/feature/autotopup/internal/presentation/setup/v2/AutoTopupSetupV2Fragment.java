package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupSetupV2ScreenParams;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.autotopup.AutoFundEditView;
import com.ybsdk.widgets.common.autotopup.AutoTopupEditView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.a14;
import defpackage.b061;
import defpackage.ce4;
import defpackage.d14;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.e14;
import defpackage.f14;
import defpackage.g14;
import defpackage.hua1;
import defpackage.lfx;
import defpackage.mw2;
import defpackage.n751;
import defpackage.o04;
import defpackage.p04;
import defpackage.qas0;
import defpackage.r04;
import defpackage.rbv;
import defpackage.s04;
import defpackage.t04;
import defpackage.tn1;
import defpackage.tu3;
import defpackage.unr0;
import defpackage.uu3;
import defpackage.vu3;
import defpackage.w511;
import defpackage.wu3;
import defpackage.xu3;
import defpackage.y04;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yu3;
import defpackage.zu3;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001H\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\fJ\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u0010.\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002022\u0006\u0010.\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002022\u0006\u0010.\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u0002022\u0006\u0010.\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u0002022\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/AutoTopupSetupV2Fragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lb061;", "Lg14;", "Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/b;", "Lce4;", "Ly04;", "viewModelFactory", "<init>", "(Ly04;)V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/b;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb061;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "viewState", "render", "(Lg14;)V", "onResume", "()V", "onDestroyView", "onBackPressed", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lzu3;", ClidProvider.STATE, "renderBottomSheet", "(Lzu3;)V", "Lyu3;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "openSelectPaymentOption", "(Lyu3;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Luu3;", "openAutoTopupEdit", "(Luu3;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Ltu3;", "openAutoFundEdit", "(Ltu3;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Lvu3;", "openConfirmSaveData", "(Lvu3;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Lwu3;", "bottomSheetState", "openSavingNotice", "(Lwu3;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "openSbpEnableBottomSheet", "()Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Ly04;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "settingsBottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "r04", "selectPaymentMethodListener", "Lr04;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupSetupV2Fragment extends BaseDivContextMvvmFragment<b061, g14, b> implements ce4 {
    private final r04 selectPaymentMethodListener;
    private BottomSheetDialogView settingsBottomSheetDialogView;
    private final y04 viewModelFactory;

    public AutoTopupSetupV2Fragment(y04 y04Var) {
        super(null, 3, null, null, b.class, 13, null);
        this.viewModelFactory = y04Var;
        this.selectPaymentMethodListener = new r04(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ b access$getViewModel(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment) {
        return (b) autoTopupSetupV2Fragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$5(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, String str, Bundle bundle) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).q0(bundle);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$4$lambda$0(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, Uri uri) {
        return ((b) autoTopupSetupV2Fragment.getViewModel()).n0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$4$lambda$1(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, Uri uri) {
        return ((b) autoTopupSetupV2Fragment.getViewModel()).n0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$4$lambda$2(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, Uri uri) {
        return ((b) autoTopupSetupV2Fragment.getViewModel()).n0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$4$lambda$3(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).i0(true);
        return zy11.a;
    }

    private final BottomSheetDialogView.State openAutoFundEdit(tu3 state) {
        return new BottomSheetDialogView.State(new e(null, null, new mw2(8, this, state), 3), state.a(), state.b(), null, null, null, null, null, null, 131064);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View openAutoFundEdit$lambda$24(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, tu3 tu3Var) {
        AutoFundEditView autoFundEditView = new AutoFundEditView(autoTopupSetupV2Fragment.requireContext(), null, 0, 6, null);
        autoFundEditView.setShowKeyboardListener(new o04(autoTopupSetupV2Fragment, 7));
        autoFundEditView.render(tu3Var.c());
        autoFundEditView.setLimitInputListener(new o04(autoTopupSetupV2Fragment, 8));
        return autoFundEditView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openAutoFundEdit$lambda$24$lambda$23$lambda$21(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, EditText editText) {
        BottomSheetDialogView bottomSheetDialogView = autoTopupSetupV2Fragment.settingsBottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.showKeyboard(editText);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 openAutoFundEdit$lambda$24$lambda$23$lambda$22(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, String str) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).p0(str);
        return zy11.a;
    }

    private final BottomSheetDialogView.State openAutoTopupEdit(uu3 state) {
        return new BottomSheetDialogView.State(new e(null, null, new mw2(10, this, state), 3), state.a(), state.b(), null, null, null, null, null, null, 131064);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View openAutoTopupEdit$lambda$20(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, uu3 uu3Var) {
        AutoTopupEditView autoTopupEditView = new AutoTopupEditView(autoTopupSetupV2Fragment.requireContext(), null, 0, 6, null);
        autoTopupEditView.setShowKeyboardListener(new o04(autoTopupSetupV2Fragment, 0));
        autoTopupEditView.render(uu3Var.c());
        autoTopupEditView.setThresholdInputListener(new o04(autoTopupSetupV2Fragment, 1));
        autoTopupEditView.setAmountInputListener(new o04(autoTopupSetupV2Fragment, 2));
        return autoTopupEditView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openAutoTopupEdit$lambda$20$lambda$19$lambda$16(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, EditText editText) {
        BottomSheetDialogView bottomSheetDialogView = autoTopupSetupV2Fragment.settingsBottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.showKeyboard(editText);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 openAutoTopupEdit$lambda$20$lambda$19$lambda$17(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, String str) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).t0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 openAutoTopupEdit$lambda$20$lambda$19$lambda$18(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, String str) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).j0(str);
        return zy11.a;
    }

    private final BottomSheetDialogView.State openConfirmSaveData(vu3 state) {
        return new BottomSheetDialogView.State(state.a(), state.b(), state.c(), null, null, null, null, null, null, 131064);
    }

    private final BottomSheetDialogView.State openSavingNotice(wu3 bottomSheetState) {
        return new BottomSheetDialogView.State(new e(null, null, new mw2(9, this, bottomSheetState), 3), bottomSheetState.a(), null, null, null, null, null, null, null, 131068);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View openSavingNotice$lambda$27(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, wu3 wu3Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(autoTopupSetupV2Fragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(autoTopupSetupV2Fragment.selectPaymentMethodListener);
        selectPaymentMethodView.setOnLeftToolbarImageClickListener(new p04(autoTopupSetupV2Fragment, 1));
        selectPaymentMethodView.render(wu3Var.b());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 openSavingNotice$lambda$27$lambda$26$lambda$25(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).y0();
        return zy11.a;
    }

    private final BottomSheetDialogView.State openSbpEnableBottomSheet() {
        Text text = null;
        rbv rbvVar = null;
        ColorModel colorModel = null;
        return new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_title), new Text.Resource(dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_description), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_button_text), text, rbvVar, colorModel, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BottomSheetDialogView.State openSelectPaymentOption(yu3 state) {
        ((b) getViewModel()).s0();
        return new BottomSheetDialogView.State(new e(null, null, new mw2(7, this, state), 3), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_payment_method_select_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View openSelectPaymentOption$lambda$15(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, yu3 yu3Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(autoTopupSetupV2Fragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(autoTopupSetupV2Fragment.selectPaymentMethodListener);
        selectPaymentMethodView.render(yu3Var.a());
        return selectPaymentMethodView;
    }

    private final void renderBottomSheet(zu3 state) {
        BottomSheetDialogView.State state2;
        if (state instanceof yu3) {
            state2 = openSelectPaymentOption((yu3) state);
        } else if (state instanceof wu3) {
            state2 = openSavingNotice((wu3) state);
        } else if (state instanceof uu3) {
            state2 = openAutoTopupEdit((uu3) state);
        } else if (state instanceof tu3) {
            state2 = openAutoFundEdit((tu3) state);
        } else if (state instanceof vu3) {
            state2 = openConfirmSaveData((vu3) state);
        } else if (state instanceof xu3) {
            state2 = openSbpEnableBottomSheet();
        } else {
            if (state != null) {
                w511.b();
                return;
            }
            state2 = null;
        }
        BottomSheetDialogView bottomSheetDialogView = this.settingsBottomSheetDialogView;
        if (state2 == null) {
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.settingsBottomSheetDialogView = null;
            return;
        }
        if (bottomSheetDialogView == null) {
            BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView2.onDismiss(new o04(this, 6));
            final int i = 0;
            bottomSheetDialogView2.onPrimaryAction(new View.OnClickListener(this) { // from class: q04
                public final /* synthetic */ AutoTopupSetupV2Fragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    AutoTopupSetupV2Fragment autoTopupSetupV2Fragment = this.b;
                    switch (i2) {
                        case 0:
                            AutoTopupSetupV2Fragment.renderBottomSheet$lambda$13$lambda$11(autoTopupSetupV2Fragment, view);
                            break;
                        default:
                            AutoTopupSetupV2Fragment.renderBottomSheet$lambda$13$lambda$12(autoTopupSetupV2Fragment, view);
                            break;
                    }
                }
            });
            final int i2 = 1;
            bottomSheetDialogView2.onSecondaryAction(new View.OnClickListener(this) { // from class: q04
                public final /* synthetic */ AutoTopupSetupV2Fragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    AutoTopupSetupV2Fragment autoTopupSetupV2Fragment = this.b;
                    switch (i22) {
                        case 0:
                            AutoTopupSetupV2Fragment.renderBottomSheet$lambda$13$lambda$11(autoTopupSetupV2Fragment, view);
                            break;
                        default:
                            AutoTopupSetupV2Fragment.renderBottomSheet$lambda$13$lambda$12(autoTopupSetupV2Fragment, view);
                            break;
                    }
                }
            });
            BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
            this.settingsBottomSheetDialogView = bottomSheetDialogView2;
        }
        BottomSheetDialogView bottomSheetDialogView3 = this.settingsBottomSheetDialogView;
        if (bottomSheetDialogView3 != null) {
            bottomSheetDialogView3.render(state2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderBottomSheet$lambda$13$lambda$10(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, boolean z) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderBottomSheet$lambda$13$lambda$11(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, View view) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderBottomSheet$lambda$13$lambda$12(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, View view) {
        ((b) autoTopupSetupV2Fragment.getViewModel()).m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof t04) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((t04) sideEffect).a(), null, 12);
        } else if (sideEffect instanceof s04) {
            ((b) getViewModel()).B0(((s04) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((a14) this.viewModelFactory).a((AutoTopupSetupV2ScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        int i = insets.a.h(519).b;
        ConstraintLayout o = ((b061) getBinding()).o();
        o.setPadding(o.getPaddingLeft(), i, o.getPaddingRight(), o.getPaddingBottom());
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((b) getViewModel()).k0();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [uc5] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "AUTO_TOPUP_REQUEST_KEY", new tn1(19, this));
        hua1.g(this, "request_select_target", new com.ybsdk.feature.transfer.api.a(new AutoTopupSetupV2Fragment$onCreate$2(getViewModel())));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BottomSheetDialogView bottomSheetDialogView = this.settingsBottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.settingsBottomSheetDialogView = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((b) getViewModel()).r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((b) getViewModel()).u0(getViewLifecycleOwner().getLifecycle());
        b061 b061Var = (b061) getBinding();
        b061Var.f.setActionHandler(new o04(this, 3));
        b061Var.g.setActionHandler(new o04(this, 4));
        b061Var.b.setActionHandler(new o04(this, 5));
        b061Var.c.setPrimaryButtonOnClickListener(new p04(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(g14 viewState) {
        b061 b061Var = (b061) getBinding();
        OperationProgressView operationProgressView = b061Var.d;
        YbDivView ybDivView = b061Var.b;
        ErrorView errorView = b061Var.c;
        operationProgressView.setVisibility(viewState instanceof f14 ? 0 : 8);
        boolean z = viewState instanceof e14;
        errorView.setVisibility(z ? 0 : 8);
        boolean z2 = viewState instanceof d14;
        b061Var.e.setVisibility(z2 ? 0 : 8);
        ybDivView.setVisibility(z2 ? 0 : 8);
        if (z) {
            errorView.render(((e14) viewState).a());
        }
        if (z2) {
            d14 d14Var = (d14) viewState;
            YbDivView.setData$default(ybDivView, d14Var.b().a(), null, null, false, 14, null);
            ybDivView.updateLocalVariables(d14Var.b().b());
            YbDivView ybDivView2 = b061Var.f;
            YbDivView.setData$default(ybDivView2, d14Var.c().a().a(), null, null, false, 14, null);
            ybDivView2.updateLocalVariables(d14Var.c().a().b());
            YbDivView ybDivView3 = b061Var.g;
            YbDivView.setData$default(ybDivView3, d14Var.c().b().a(), null, null, false, 14, null);
            ybDivView3.updateLocalVariables(d14Var.c().b().b());
            renderBottomSheet(d14Var.a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public b061 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return b061.p(inflater, container);
    }
}
