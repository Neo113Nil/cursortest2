package com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$SecondFactorResult;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSubscriptionScreenParams;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.view.QrPaymentsWithoutExtraActionsView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.agc0;
import defpackage.bbg0;
import defpackage.d5b0;
import defpackage.dcs;
import defpackage.dma0;
import defpackage.e8g0;
import defpackage.h791;
import defpackage.i3y;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.odf0;
import defpackage.qag0;
import defpackage.qas0;
import defpackage.rje;
import defpackage.s461;
import defpackage.tdr;
import defpackage.vfc0;
import defpackage.w511;
import defpackage.wag0;
import defpackage.xag0;
import defpackage.y8f;
import defpackage.yag0;
import defpackage.yr31;
import defpackage.zag0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/presentation/QrPaymentsSubscriptionFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ls461;", "Ldma0;", "Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/presentation/a;", "Ltdr;", "Lwag0;", "viewModelFactory", "Lqag0;", "secondFactorScreenProvider", "Lj3h;", "deeplinkResolver", "<init>", "(Lwag0;Lqag0;Lj3h;)V", "createViewModel", "()Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/presentation/a;", "viewState", "Lzy11;", "render", "(Ldma0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ls461;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onDestroyView", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "fitNavigation", "()Z", "Lwag0;", "Lqag0;", "Lj3h;", "Lcom/ybsdk/feature/qr/payments/api/QrPaymentsSubscriptionScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/qr/payments/api/QrPaymentsSubscriptionScreenParams;", "screenParams", "Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/view/QrPaymentsWithoutExtraActionsView;", "actionsView", "Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/view/QrPaymentsWithoutExtraActionsView;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrPaymentsSubscriptionFragment extends BaseMvvmFragment<s461, dma0, a> implements tdr {
    private QrPaymentsWithoutExtraActionsView actionsView;
    private BottomSheetDialogView bottomSheetDialogView;
    private final j3h deeplinkResolver;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final qag0 secondFactorScreenProvider;
    private final wag0 viewModelFactory;

    public QrPaymentsSubscriptionFragment(wag0 wag0Var, qag0 qag0Var, j3h j3hVar) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = wag0Var;
        this.secondFactorScreenProvider = qag0Var;
        this.deeplinkResolver = j3hVar;
        this.screenParams = dcs.c(this);
    }

    private final QrPaymentsSubscriptionScreenParams getScreenParams() {
        return (QrPaymentsSubscriptionScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(QrPaymentsSubscriptionFragment qrPaymentsSubscriptionFragment, String str, Bundle bundle) {
        QrPaymentsSecondFactorScreenProvider$SecondFactorResult a = ((e8g0) qrPaymentsSubscriptionFragment.secondFactorScreenProvider).a(bundle);
        if (a instanceof QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken) {
            qrPaymentsSubscriptionFragment.getViewModel().f0(((QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken) a).getVerificationToken());
        } else if (jl40.l(a, QrPaymentsSecondFactorScreenProvider$SecondFactorResult.Cancel.INSTANCE) || a == null) {
            qrPaymentsSubscriptionFragment.getViewModel().e0();
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View render$lambda$1(QrPaymentsSubscriptionFragment qrPaymentsSubscriptionFragment, dma0 dma0Var) {
        QrPaymentsWithoutExtraActionsView qrPaymentsWithoutExtraActionsView = qrPaymentsSubscriptionFragment.actionsView;
        qrPaymentsWithoutExtraActionsView.render(dma0Var.b());
        return qrPaymentsWithoutExtraActionsView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$5$lambda$4$lambda$2(QrPaymentsSubscriptionFragment qrPaymentsSubscriptionFragment, View view) {
        qrPaymentsSubscriptionFragment.getViewModel().f0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$5$lambda$4$lambda$3(QrPaymentsSubscriptionFragment qrPaymentsSubscriptionFragment, boolean z) {
        qrPaymentsSubscriptionFragment.getViewModel().e0();
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        BottomSheetDialogView bottomSheetDialogView;
        if (sideEffect instanceof zag0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((zag0) sideEffect).a(), null, 12);
            return;
        }
        if (!(sideEffect instanceof yag0)) {
            if (!(sideEffect instanceof xag0) || (bottomSheetDialogView = this.bottomSheetDialogView) == null) {
                return;
            }
            bottomSheetDialogView.dismiss();
            return;
        }
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (bottomSheetDialogView2 != null) {
            bottomSheetDialogView2.dismiss();
        }
        yag0 yag0Var = (yag0) sideEffect;
        if (yag0Var.b()) {
            h791.e(this.deeplinkResolver, yag0Var.a(), false, null, 14);
        } else {
            rje.i(requireContext(), yag0Var.a());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((bbg0) this.viewModelFactory).a(getScreenParams());
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public s461 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        QrPaymentsWithoutExtraActionsView qrPaymentsWithoutExtraActionsView = new QrPaymentsWithoutExtraActionsView(requireContext(), null, 0, 6, null);
        qrPaymentsWithoutExtraActionsView.onSelectAgreement(new QrPaymentsSubscriptionFragment$getViewBinding$1$1(getViewModel()));
        this.actionsView = qrPaymentsWithoutExtraActionsView;
        return s461.o(inflater, container);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewModel().d0();
        this.bottomSheetDialogView = null;
        this.actionsView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.setVisibility(0);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.setVisibility(8);
        }
        super.onStop();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().g0();
        getParentFragmentManager().m0(QrPaymentsSecondFactorScreenProvider$Request.SUBSCRIPTION.getKey(), this, new vfc0(11, this));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(dma0 viewState) {
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new agc0(16, this, viewState), 3), viewState.a(), null, null, null, null, null, null, null, 131068);
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView == null) {
            BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView2.onPrimaryAction(new d5b0(22, this));
            bottomSheetDialogView2.onDismiss(new odf0(7, this));
            BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView2;
            bottomSheetDialogView = bottomSheetDialogView2;
        }
        bottomSheetDialogView.render(state);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
