package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$TwoFactorResult;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import defpackage.abs;
import defpackage.bbs;
import defpackage.bdp;
import defpackage.dcs;
import defpackage.dz2;
import defpackage.dzh0;
import defpackage.eu01;
import defpackage.hu01;
import defpackage.hua1;
import defpackage.i161;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.loj;
import defpackage.ntz0;
import defpackage.p97;
import defpackage.qas;
import defpackage.qas0;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rbv;
import defpackage.rtu;
import defpackage.rtz0;
import defpackage.s8j0;
import defpackage.sas;
import defpackage.sls;
import defpackage.t8j0;
import defpackage.tas;
import defpackage.tu01;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.xas;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zas;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001.\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010(\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/FpsPayEnrollFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Li161;", "Lu8j0;", "Lxas;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/FpsPayEnrollViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/a;", "Lzas;", "factory", "Lhu01;", "twoFactorScreenProvider", "<init>", "(Lzas;Lhu01;)V", "viewState", "Lzy11;", "renderBottomSheet", "(Lxas;)V", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "showErrorDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li161;", "render", "(Lu8j0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "Lzas;", "Lhu01;", "tas", "selectAccountListener", "Ltas;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FpsPayEnrollFragment extends BaseMvvmFragment<i161, u8j0, a> {
    private BottomSheetDialogView bottomSheetDialogView;
    private final zas factory;
    private final tas selectAccountListener;
    private final hu01 twoFactorScreenProvider;

    public FpsPayEnrollFragment(zas zasVar, hu01 hu01Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.factory = zasVar;
        this.twoFactorScreenProvider = hu01Var;
        this.selectAccountListener = new tas(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$5$lambda$1$lambda$0(FpsPayEnrollFragment fpsPayEnrollFragment) {
        fpsPayEnrollFragment.getViewModel().i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$5$lambda$2(FpsPayEnrollFragment fpsPayEnrollFragment, View view) {
        fpsPayEnrollFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$5$lambda$3(FpsPayEnrollFragment fpsPayEnrollFragment, View view) {
        fpsPayEnrollFragment.getViewModel().l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$5$lambda$4(FpsPayEnrollFragment fpsPayEnrollFragment) {
        fpsPayEnrollFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$9(FpsPayEnrollFragment fpsPayEnrollFragment, String str, Bundle bundle) {
        TransferTwoFactorScreenProvider$TwoFactorResult a = ((tu01) fpsPayEnrollFragment.twoFactorScreenProvider).a(bundle);
        if (a instanceof TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) {
            fpsPayEnrollFragment.getViewModel().h0(((TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) a).getVerificationToken());
        } else if (!jl40.l(a, TransferTwoFactorScreenProvider$TwoFactorResult.Cancel.INSTANCE) && a != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$8$lambda$7$lambda$6(FpsPayEnrollFragment fpsPayEnrollFragment, String str) {
        fpsPayEnrollFragment.getViewModel().j0(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBottomSheet(xas viewState) {
        if (viewState.a() == null) {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new bdp(11, this, viewState), 3), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_payment_method_select_action), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (bottomSheetDialogView2 == null) {
            getViewModel().e0();
            BottomSheetDialogView bottomSheetDialogView3 = new BottomSheetDialogView(((i161) getBinding()).o().getContext(), null, 0, 6, null);
            bottomSheetDialogView3.onPrimaryAction(new sas(this, 2));
            bottomSheetDialogView3.onDismiss(new qas(this, 0));
            BottomSheetDialogView.show$default(bottomSheetDialogView3, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView3;
            bottomSheetDialogView2 = bottomSheetDialogView3;
        }
        bottomSheetDialogView2.render(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$18$lambda$16$lambda$11(FpsPayEnrollFragment fpsPayEnrollFragment, xas xasVar) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(fpsPayEnrollFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(fpsPayEnrollFragment.selectAccountListener);
        selectPaymentMethodView.render(xasVar.a().a());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$12(FpsPayEnrollFragment fpsPayEnrollFragment, View view) {
        fpsPayEnrollFragment.getViewModel().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderBottomSheet$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13(FpsPayEnrollFragment fpsPayEnrollFragment, boolean z) {
        fpsPayEnrollFragment.getViewModel().c0();
        return zy11.a;
    }

    private final void showErrorDialog(String title, String description) {
        if (title == null) {
            title = getString(dzh0.ybsdk_transfer_sbp_account_bind_failed);
        }
        if (description == null) {
            description = getString(dzh0.ybsdk_transfer_sbp_try_again);
        }
        showAlertDialog(new AlertDialog.a(requireContext()).setTitle(title).d(description).e(getString(dzh0.ybsdk_transfer_sbp_close), new dz2(3)).h(getString(dzh0.ybsdk_transfer_sbp_to_sbpay_app), new p97(6, this)));
        getViewModel().g0(title, description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$19(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$20(FpsPayEnrollFragment fpsPayEnrollFragment, DialogInterface dialogInterface, int i) {
        fpsPayEnrollFragment.getViewModel().k0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        abs absVar = sideEffect instanceof abs ? (abs) sideEffect : null;
        if (absVar == null) {
            return;
        }
        showErrorDialog(absVar.b(), absVar.a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((bbs) this.factory).a((FpsPayScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public i161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        i161 p = i161.p(inflater);
        ErrorView errorView = p.e;
        final int i = 0;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: ras
            public final /* synthetic */ FpsPayEnrollFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$5$lambda$1$lambda$0;
                zy11 viewBinding$lambda$5$lambda$4;
                int i2 = i;
                FpsPayEnrollFragment fpsPayEnrollFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$5$lambda$1$lambda$0 = FpsPayEnrollFragment.getViewBinding$lambda$5$lambda$1$lambda$0(fpsPayEnrollFragment);
                        return viewBinding$lambda$5$lambda$1$lambda$0;
                    default:
                        viewBinding$lambda$5$lambda$4 = FpsPayEnrollFragment.getViewBinding$lambda$5$lambda$4(fpsPayEnrollFragment);
                        return viewBinding$lambda$5$lambda$4;
                }
            }
        });
        p.b.setOnClickListener(new sas(this, i));
        TransferToolbarView transferToolbarView = p.h;
        final int i2 = 1;
        transferToolbarView.setSubtitleClickListener(new sas(this, i2));
        transferToolbarView.setOnCloseButtonClickListener(new sls(this) { // from class: ras
            public final /* synthetic */ FpsPayEnrollFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$5$lambda$1$lambda$0;
                zy11 viewBinding$lambda$5$lambda$4;
                int i22 = i2;
                FpsPayEnrollFragment fpsPayEnrollFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$5$lambda$1$lambda$0 = FpsPayEnrollFragment.getViewBinding$lambda$5$lambda$1$lambda$0(fpsPayEnrollFragment);
                        return viewBinding$lambda$5$lambda$1$lambda$0;
                    default:
                        viewBinding$lambda$5$lambda$4 = FpsPayEnrollFragment.getViewBinding$lambda$5$lambda$4(fpsPayEnrollFragment);
                        return viewBinding$lambda$5$lambda$4;
                }
            }
        });
        p.c.setMovementMethod(LinkMovementMethod.getInstance());
        return p;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.bottomSheetDialogView = null;
        super.onDestroyView();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hua1.g(this, TransferTwoFactorScreenProvider$Request.CONFIRM_FPS_PAY.getKey(), new loj(29, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        i161 i161Var = (i161) getBinding();
        ErrorView errorView = i161Var.e;
        TextView textView = i161Var.c;
        YbButtonView ybButtonView = i161Var.b;
        TransferToolbarView transferToolbarView = i161Var.h;
        errorView.render(null);
        boolean z = viewState instanceof t8j0;
        i161Var.i.p().setVisibility(!z ? 4 : 0);
        ybButtonView.setVisibility(z ? 4 : 0);
        if (!(viewState instanceof r8j0)) {
            if (viewState instanceof s8j0) {
                i161Var.e.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
                transferToolbarView.render(new eu01((Text.Constant) null, false, (rbv) null, (Text.Constant) null, (Text) null, (rtz0) new ntz0(0), 95));
                return;
            } else if (z) {
                transferToolbarView.render(new eu01((Text.Constant) null, false, (rbv) null, (Text.Constant) null, (Text) null, (rtz0) new ntz0(0), 95));
                return;
            } else {
                w511.b();
                return;
            }
        }
        xas xasVar = (xas) ((r8j0) viewState).e();
        transferToolbarView.render(xasVar.g());
        v4b1.k(xasVar.e(), i161Var.f, null, null, 6);
        i161Var.g.setText(d.a(requireContext(), xasVar.f()));
        i161Var.d.setText(d.a(requireContext(), xasVar.d()));
        String b = xasVar.b();
        textView.setVisibility((b == null || b.length() == 0) ? 8 : 0);
        String b2 = xasVar.b();
        textView.setText(b2 != null ? rtu.a(new qas(this, 1), b2) : null);
        ybButtonView.render(xasVar.c());
        renderBottomSheet(xasVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
