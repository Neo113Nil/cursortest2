package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.Group;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.transfer.utils.AmountResizeTextWatcher;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.feature.credit.deposit.api.BoostDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditLimitDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import com.ybsdk.feature.credit.deposit.api.MkkDepositScreenParams;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.TooltipPosition;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import com.ybsdk.widgets.common.SuggestsGroupView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.k;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.l;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.an8;
import defpackage.baf;
import defpackage.bbf;
import defpackage.bmg0;
import defpackage.buz0;
import defpackage.ca41;
import defpackage.cbf;
import defpackage.ce4;
import defpackage.ci8;
import defpackage.dbf;
import defpackage.dcs;
import defpackage.dye;
import defpackage.eaf;
import defpackage.ebf;
import defpackage.el0;
import defpackage.frb1;
import defpackage.gaf;
import defpackage.gu01;
import defpackage.h5a0;
import defpackage.ha41;
import defpackage.haf;
import defpackage.hbf;
import defpackage.iaf;
import defpackage.ibf;
import defpackage.jaf;
import defpackage.jhd;
import defpackage.jl40;
import defpackage.k5;
import defpackage.l7n;
import defpackage.laf;
import defpackage.lfx;
import defpackage.lwg0;
import defpackage.lyc;
import defpackage.maf;
import defpackage.mdq0;
import defpackage.mj31;
import defpackage.oc70;
import defpackage.oxf;
import defpackage.p1b;
import defpackage.pbj;
import defpackage.pc70;
import defpackage.ptb1;
import defpackage.q661;
import defpackage.qas0;
import defpackage.qc70;
import defpackage.r501;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rr51;
import defpackage.saf;
import defpackage.sl;
import defpackage.sm91;
import defpackage.tbb;
import defpackage.tm60;
import defpackage.ubv0;
import defpackage.utb1;
import defpackage.vbb;
import defpackage.w511;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.y9f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z9f;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u0004\u0018\u00010\u00132\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b:\u0010/J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010/J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010/J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010/J\u001b\u0010D\u001a\u0004\u0018\u00010\u00132\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00132\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010G\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ3\u0010T\u001a\u00020\u00132\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\b\u0010Q\u001a\u0004\u0018\u00010M2\b\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010VR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/CreditDepositFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lq661;", "Libf;", "Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/a;", "Lmdq0;", "Lce4;", "Lebf;", "factoryOfViewModel", "Lca41;", "web3dsFeature", "Ly9f;", "analyticsInteractorFactory", "<init>", "(Lebf;Lca41;Ly9f;)V", "createViewModel", "()Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/a;", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lq661;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lsaf;", "entity", "onCreditPaymentMethodChanged", "(Lsaf;)V", "Lel0;", "additionalButtonEntity", "onAdditionalButtonClicked", "(Lel0;)V", "", "onBackPressed", "()Z", "viewState", "render", "(Libf;)V", "onDestroyView", "()V", "Lrr51;", "divkitData", "renderDivkit", "(Lrr51;)Lzy11;", "Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/CreditDepositShimmerType;", "shimmerType", "renderShimmer", "(Lcom/ybsdk/feature/credit/deposit/internal/screens/deposit/CreditDepositShimmerType;)V", "disableInputIfNeeded", "renderAmountInput", "renderOperationDialog", "Lcom/ybsdk/widgets/common/l;", "operationState", "renderOperationDialogResult", "(Lcom/ybsdk/widgets/common/l;)V", "hideInput", "", "urlFor3ds", "renderWeb3dsView", "(Ljava/lang/String;)Lzy11;", "Lhaf;", ClidProvider.STATE, "renderPaymentMethodsBottomSheet", "(Lhaf;)V", "Lgaf;", "renderCreditInfoBottomSheet", "(Lgaf;)V", "Lcom/ybsdk/core/utils/text/Text;", "subtitle", "Lcom/ybsdk/feature/credit/deposit/internal/domain/entities/TooltipPosition;", "position", "actionText", "Lrbv;", "actionImage", "showTooltip", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/feature/credit/deposit/internal/domain/entities/TooltipPosition;Lcom/ybsdk/core/utils/text/Text;Lrbv;)V", "Lebf;", "Lca41;", "Ly9f;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "creditInfoBottomSheet", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "paymentMethodsBottomSheet", "Lha41;", "web3dsView", "Lha41;", "shouldEnableActionButton", "Z", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreditDepositFragment extends BaseDivContextMvvmFragment<q661, ibf, a> implements mdq0, ce4 {
    private final y9f analyticsInteractorFactory;
    private BottomSheetDialogView creditInfoBottomSheet;
    private final ebf factoryOfViewModel;
    private BottomSheetDialogView paymentMethodsBottomSheet;
    private boolean shouldEnableActionButton;
    private final ca41 web3dsFeature;
    private ha41 web3dsView;

    public CreditDepositFragment(ebf ebfVar, ca41 ca41Var, y9f y9fVar) {
        super(null, 3, null, null, a.class, 13, null);
        this.factoryOfViewModel = ebfVar;
        this.web3dsFeature = ca41Var;
        this.analyticsInteractorFactory = y9fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(CreditDepositFragment creditDepositFragment) {
        return (a) creditDepositFragment.getViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void disableInputIfNeeded(ibf viewState) {
        q661 q661Var = (q661) getBinding();
        boolean z = false;
        boolean z2 = viewState.k() != CreditDepositShimmerType.FullScreenShimmer;
        Group group = q661Var.o;
        NumberKeyboardView numberKeyboardView = q661Var.i;
        group.setVisibility(!z2 ? 4 : 0);
        numberKeyboardView.setSkeletonMode(!z2);
        numberKeyboardView.setEnabled(z2);
        MoneyInputEditView moneyInputEditView = q661Var.c;
        if (z2 && viewState.q()) {
            z = true;
        }
        moneyInputEditView.setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideInput(ibf viewState) {
        q661 q661Var = (q661) getBinding();
        boolean z = viewState.i() != null;
        boolean z2 = viewState.k() == CreditDepositShimmerType.FullScreenShimmer;
        q661Var.c.setVisibility((z || z2) ? 8 : 0);
        q661Var.b.setVisibility((z || z2) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$14$lambda$0(q661 q661Var, View view) {
        q661Var.c.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$14$lambda$1(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$14$lambda$10(q661 q661Var) {
        q661Var.r.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$14$lambda$11(q661 q661Var, Throwable th) {
        q661Var.r.setVisibility(8);
        q661Var.h.render(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$14$lambda$13(CreditDepositFragment creditDepositFragment, BigDecimal bigDecimal, SuggestView$State$Behaviour suggestView$State$Behaviour) {
        ((a) creditDepositFragment.getViewModel()).p0(bigDecimal.toPlainString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$14$lambda$2(CreditDepositFragment creditDepositFragment) {
        ((a) creditDepositFragment.getViewModel()).u0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$14$lambda$3(CreditDepositFragment creditDepositFragment) {
        ((a) creditDepositFragment.getViewModel()).t0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$14$lambda$8$lambda$7(CreditDepositFragment creditDepositFragment) {
        ((a) creditDepositFragment.getViewModel()).m0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$14$lambda$9(CreditDepositFragment creditDepositFragment, q661 q661Var, View view) {
        if (creditDepositFragment.shouldEnableActionButton) {
            ((a) creditDepositFragment.getViewModel()).k0();
        } else {
            sm91.h(bmg0.ybsdk_animation_wiggle, q661Var.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$18$lambda$17(CreditDepositFragment creditDepositFragment, String str) {
        ((a) creditDepositFragment.getViewModel()).f0(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAmountInput(ibf viewState) {
        q661 q661Var = (q661) getBinding();
        Locale locale = tm60.a;
        MoneyInputEditView moneyInputEditView = q661Var.c;
        if (!jl40.l(tm60.g(String.valueOf(moneyInputEditView.getText())), viewState.b())) {
            String i = tm60.i(tm60.b(viewState.b()));
            moneyInputEditView.setText(i);
            moneyInputEditView.setSelection(i.length());
        }
        q661Var.b.setText(viewState.d());
    }

    private final void renderCreditInfoBottomSheet(gaf state) {
        BottomSheetDialogView bottomSheetDialogView = this.paymentMethodsBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView2 = this.creditInfoBottomSheet;
        if (bottomSheetDialogView2 != null) {
            bottomSheetDialogView2.render(state.d());
            return;
        }
        BottomSheetDialogView bottomSheetDialogView3 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        this.creditInfoBottomSheet = bottomSheetDialogView3;
        int i = 2;
        bottomSheetDialogView3.onDismiss(new jaf(this, i));
        BottomSheetDialogView bottomSheetDialogView4 = this.creditInfoBottomSheet;
        if (bottomSheetDialogView4 != null) {
            bottomSheetDialogView4.onPrimaryAction(new laf(this, i));
        }
        BottomSheetDialogView bottomSheetDialogView5 = this.creditInfoBottomSheet;
        if (bottomSheetDialogView5 != null) {
            bottomSheetDialogView5.render(state.d());
        }
        BottomSheetDialogView bottomSheetDialogView6 = this.creditInfoBottomSheet;
        if (bottomSheetDialogView6 != null) {
            BottomSheetDialogView.show$default(bottomSheetDialogView6, requireActivity(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderCreditInfoBottomSheet$lambda$39(CreditDepositFragment creditDepositFragment, boolean z) {
        ((a) creditDepositFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderCreditInfoBottomSheet$lambda$40(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderDivkit(rr51 divkitData) {
        ((q661) getBinding()).j.setVisibility(divkitData != null ? 0 : 8);
        if (divkitData == null) {
            return null;
        }
        YbDivView.setData$default(((q661) getBinding()).j, divkitData, null, null, false, 14, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderOperationDialog(final ibf viewState) {
        OperationProgressOverlayDialog operationProgressOverlayDialog = ((q661) getBinding()).q;
        final int i = 0;
        operationProgressOverlayDialog.setVisibility(viewState.i() != null ? 0 : 8);
        hideInput(viewState);
        k i2 = viewState.i();
        if (i2 != null) {
            operationProgressOverlayDialog.render(i2);
        }
        if (viewState.h() != null) {
            operationProgressOverlayDialog.setPrimaryActionClickListener(new View.OnClickListener(this) { // from class: kaf
                public final /* synthetic */ CreditDepositFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    ibf ibfVar = viewState;
                    CreditDepositFragment creditDepositFragment = this.b;
                    switch (i3) {
                        case 0:
                            CreditDepositFragment.renderOperationDialog$lambda$29$lambda$25(creditDepositFragment, ibfVar, view);
                            break;
                        default:
                            CreditDepositFragment.renderOperationDialog$lambda$29$lambda$27(creditDepositFragment, ibfVar, view);
                            break;
                    }
                }
            });
        } else {
            k i3 = viewState.i();
            qc70 a = i3 != null ? i3.a() : null;
            if (!jl40.l(a, oc70.a) && a != null) {
                if (a.equals(pc70.a)) {
                    operationProgressOverlayDialog.setPrimaryActionClickListener(new laf(this, i));
                } else {
                    if (!(a instanceof l)) {
                        w511.b();
                        return;
                    }
                    renderOperationDialogResult((l) a);
                }
            }
        }
        final int i4 = 1;
        if (viewState.j() != null) {
            operationProgressOverlayDialog.setSubActionClickListener(new View.OnClickListener(this) { // from class: kaf
                public final /* synthetic */ CreditDepositFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i4;
                    ibf ibfVar = viewState;
                    CreditDepositFragment creditDepositFragment = this.b;
                    switch (i32) {
                        case 0:
                            CreditDepositFragment.renderOperationDialog$lambda$29$lambda$25(creditDepositFragment, ibfVar, view);
                            break;
                        default:
                            CreditDepositFragment.renderOperationDialog$lambda$29$lambda$27(creditDepositFragment, ibfVar, view);
                            break;
                    }
                }
            });
        } else {
            operationProgressOverlayDialog.setSubActionClickListener(new laf(this, i4));
        }
        ptb1 c = viewState.c();
        if (c instanceof gaf) {
            renderCreditInfoBottomSheet((gaf) viewState.c());
            return;
        }
        if (c instanceof haf) {
            renderPaymentMethodsBottomSheet((haf) viewState.c());
            return;
        }
        if (c != null) {
            w511.b();
            return;
        }
        BottomSheetDialogView bottomSheetDialogView = this.creditInfoBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.creditInfoBottomSheet = null;
        BottomSheetDialogView bottomSheetDialogView2 = this.paymentMethodsBottomSheet;
        if (bottomSheetDialogView2 != null) {
            bottomSheetDialogView2.dismiss();
        }
        this.paymentMethodsBottomSheet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialog$lambda$29$lambda$25(CreditDepositFragment creditDepositFragment, ibf ibfVar, View view) {
        ((a) creditDepositFragment.getViewModel()).x0(ibfVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialog$lambda$29$lambda$26(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialog$lambda$29$lambda$27(CreditDepositFragment creditDepositFragment, ibf ibfVar, View view) {
        ((a) creditDepositFragment.getViewModel()).x0(ibfVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialog$lambda$29$lambda$28(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderOperationDialogResult(l operationState) {
        q661 q661Var = (q661) getBinding();
        int i = maf.b[operationState.a().ordinal()];
        int i2 = 3;
        if (i == 1 || i == 2) {
            q661Var.q.setPrimaryActionClickListener(new laf(this, i2));
            return;
        }
        int i3 = 4;
        if (i == 3) {
            q661Var.q.setPrimaryActionClickListener(new laf(this, i3));
            return;
        }
        int i4 = 5;
        if (i == 4 || i == 5) {
            q661Var.q.setPrimaryActionClickListener(new laf(this, i4));
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialogResult$lambda$33$lambda$30(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialogResult$lambda$33$lambda$31(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderOperationDialogResult$lambda$33$lambda$32(CreditDepositFragment creditDepositFragment, View view) {
        ((a) creditDepositFragment.getViewModel()).i0();
    }

    private final void renderPaymentMethodsBottomSheet(haf state) {
        BottomSheetDialogView bottomSheetDialogView = this.creditInfoBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        BottomSheetDialogView.State state2 = new BottomSheetDialogView.State((d) new e(null, Integer.valueOf(rje.d(lwg0.ybsdk_payment_methods_bottom_sheet_content_bottom_padding, requireContext())), new jhd(18, this, state), 1), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (com.ybsdk.widgets.common.bottomsheet.l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        BottomSheetDialogView bottomSheetDialogView2 = this.paymentMethodsBottomSheet;
        if (bottomSheetDialogView2 != null) {
            bottomSheetDialogView2.render(state2);
            return;
        }
        BottomSheetDialogView bottomSheetDialogView3 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        this.paymentMethodsBottomSheet = bottomSheetDialogView3;
        bottomSheetDialogView3.onDismiss(new jaf(this, 0));
        BottomSheetDialogView bottomSheetDialogView4 = this.paymentMethodsBottomSheet;
        if (bottomSheetDialogView4 != null) {
            bottomSheetDialogView4.render(state2);
        }
        BottomSheetDialogView bottomSheetDialogView5 = this.paymentMethodsBottomSheet;
        if (bottomSheetDialogView5 != null) {
            BottomSheetDialogView.show$default(bottomSheetDialogView5, requireActivity(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderPaymentMethodsBottomSheet$lambda$37(CreditDepositFragment creditDepositFragment, haf hafVar) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(creditDepositFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(creditDepositFragment);
        selectPaymentMethodView.render(hafVar.d());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderPaymentMethodsBottomSheet$lambda$38(CreditDepositFragment creditDepositFragment, boolean z) {
        ((a) creditDepositFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderShimmer(CreditDepositShimmerType shimmerType) {
        q661 q661Var = (q661) getBinding();
        l7n l7nVar = q661Var.k;
        ShimmerFrameLayout shimmerFrameLayout = q661Var.m;
        ShimmerFrameLayout shimmerFrameLayout2 = q661Var.g;
        ShimmerFrameLayout shimmerFrameLayout3 = q661Var.f;
        TransferToolbarView transferToolbarView = q661Var.n;
        l7nVar.q().setVisibility(shimmerType == CreditDepositShimmerType.FullScreenShimmer ? 0 : 8);
        int i = shimmerType == null ? -1 : maf.a[shimmerType.ordinal()];
        if (i == -1) {
            transferToolbarView.setVisibility(0);
            q661Var.o().stopShimmer();
            shimmerFrameLayout3.stopShimmer();
            shimmerFrameLayout2.stopShimmer();
            shimmerFrameLayout.stopShimmer();
            return;
        }
        if (i == 1) {
            transferToolbarView.setVisibility(4);
            q661Var.o().startShimmer();
            shimmerFrameLayout3.stopShimmer();
            shimmerFrameLayout2.stopShimmer();
            shimmerFrameLayout.stopShimmer();
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        transferToolbarView.setVisibility(0);
        q661Var.o().stopShimmer();
        shimmerFrameLayout3.startShimmer();
        shimmerFrameLayout2.startShimmer();
        shimmerFrameLayout.startShimmer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderWeb3dsView(String urlFor3ds) {
        q661 q661Var = (q661) getBinding();
        zy11 zy11Var = zy11.a;
        if (urlFor3ds == null) {
            q661Var.r.setVisibility(8);
            return zy11Var;
        }
        ha41 ha41Var = this.web3dsView;
        if (ha41Var == null) {
            return null;
        }
        ((pbj) ha41Var).K(urlFor3ds);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showTooltip(Text subtitle, TooltipPosition position, Text actionText, rbv actionImage) {
        View view;
        int i = maf.c[position.ordinal()];
        if (i == 1) {
            view = ((q661) getBinding()).p;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            view = ((q661) getBinding()).n;
        }
        buz0 d = frb1.d(requireContext());
        d.g(Tooltip$PreferredGravity.CENTER);
        d.l(subtitle);
        d.k(Tooltip$PreferredPosition.TOP);
        d.b(new iaf(this, 0));
        d.d(new jaf(this, 3));
        d.i(actionText);
        d.h(actionImage);
        d.a().f(view, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showTooltip$lambda$41(CreditDepositFragment creditDepositFragment) {
        ((a) creditDepositFragment.getViewModel()).v0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showTooltip$lambda$42(CreditDepositFragment creditDepositFragment, Tooltip$DismissReason tooltip$DismissReason) {
        ((a) creditDepositFragment.getViewModel()).w0();
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof dbf) {
            dbf dbfVar = (dbf) sideEffect;
            if (dbfVar instanceof cbf) {
                cbf cbfVar = (cbf) sideEffect;
                showTooltip(cbfVar.d(), cbfVar.c(), cbfVar.b(), cbfVar.a());
            } else if (dbfVar instanceof bbf) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((bbf) sideEffect).a(), null, 12);
            } else {
                w511.b();
            }
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        z9f z9fVar;
        CreditScreenParams creditScreenParams = (CreditScreenParams) dcs.a(this);
        ebf ebfVar = this.factoryOfViewModel;
        an8 an8Var = (an8) this.analyticsInteractorFactory;
        if (creditScreenParams instanceof CreditDepositScreenParams) {
            z9fVar = new vbb((CreditDepositScreenParams) creditScreenParams, (AppAnalyticsReporter) ((oxf) ((eaf) an8Var.c).a.b).get());
        } else if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
            z9fVar = (z9f) ((baf) an8Var.w).get();
        } else if (creditScreenParams instanceof MkkDepositScreenParams) {
            z9fVar = (z9f) ((baf) an8Var.x).get();
        } else if (creditScreenParams instanceof BoostDepositScreenParams) {
            z9fVar = (z9f) ((baf) an8Var.b).get();
        } else {
            an8Var.getClass();
            w511.b();
            z9fVar = null;
        }
        return ((hbf) ebfVar).a(creditScreenParams, z9fVar);
    }

    @Override // defpackage.mdq0
    public void onAddMethodClicked() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdq0
    public void onAdditionalButtonClicked(el0 additionalButtonEntity) {
        ((a) getViewModel()).e0(additionalButtonEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).g0();
        return true;
    }

    @Override // defpackage.mdq0
    public void onBackPressedFromSbp() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdq0
    public void onCreditPaymentMethodChanged(saf entity) {
        ((a) getViewModel()).l0(entity);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BottomSheetDialogView bottomSheetDialogView = this.creditInfoBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.creditInfoBottomSheet = null;
        BottomSheetDialogView bottomSheetDialogView2 = this.paymentMethodsBottomSheet;
        if (bottomSheetDialogView2 != null) {
            bottomSheetDialogView2.dismiss();
        }
        this.paymentMethodsBottomSheet = null;
        this.web3dsView = null;
        super.onDestroyView();
    }

    @Override // defpackage.mdq0
    public void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onSbpWidgetClicked() {
    }

    @Override // defpackage.mdq0
    public void onSelectedAccountChanged(sl slVar) {
    }

    @Override // defpackage.mdq0
    public void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        WebView J;
        q661 q661Var = (q661) getBinding();
        super.onViewCreated(view, savedInstanceState);
        q661Var.o().setOnClickListener(new ci8(14, q661Var));
        TransferToolbarView transferToolbarView = q661Var.n;
        transferToolbarView.setSubtitleClickListener(new laf(this, 6));
        int i = 1;
        transferToolbarView.setOnRightImageClickListener(new iaf(this, i));
        transferToolbarView.setOnCloseButtonClickListener(new iaf(this, 2));
        MoneyInputEditView moneyInputEditView = q661Var.c;
        utb1.d(q661Var.i, moneyInputEditView);
        moneyInputEditView.setCursorVisible(true);
        moneyInputEditView.addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment$onViewCreated$lambda$14$lambda$6$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String obj;
                if (s == null || (obj = s.toString()) == null) {
                    return;
                }
                a access$getViewModel = CreditDepositFragment.access$getViewModel(CreditDepositFragment.this);
                access$getViewModel.C.l();
                access$getViewModel.c0(obj);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        moneyInputEditView.addTextChangedListener(new ThousandSeparatorTextWatcher(null, i, 0 == true ? 1 : 0));
        moneyInputEditView.addTextChangedListener(new AmountResizeTextWatcher(requireContext(), moneyInputEditView, q661Var.b, q661Var.o()));
        ErrorView errorView = q661Var.h;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new iaf(this, 3));
        q661Var.d.setOnClickListener(new k5(23, this, q661Var));
        pbj w = ((mj31) this.web3dsFeature).w(requireContext());
        this.web3dsView = w;
        w.R(new lyc(27, q661Var));
        ha41 ha41Var = this.web3dsView;
        if (ha41Var != null) {
            ((pbj) ha41Var).P(new dye(7, q661Var));
        }
        ha41 ha41Var2 = this.web3dsView;
        if (ha41Var2 != null && (J = ((pbj) ha41Var2).J()) != null) {
            q661Var.r.addView(J);
        }
        q661Var.l.setOnSuggestClickListener(new tbb(13, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ibf viewState) {
        q661 q661Var = (q661) getBinding();
        disableInputIfNeeded(viewState);
        ErrorView errorView = q661Var.h;
        SuggestsGroupView suggestsGroupView = q661Var.l;
        errorView.render(viewState.g());
        q661Var.h.setVisibility(viewState.g() != null ? 0 : 8);
        q661Var.i.setVisibility((!viewState.q() || viewState.k() == CreditDepositShimmerType.FullScreenShimmer) ? 8 : 0);
        setBackButtonVisible(viewState.p());
        gu01 n = viewState.n();
        if (n != null) {
            q661Var.n.render(n);
        }
        renderShimmer(viewState.k());
        renderAmountInput(viewState);
        suggestsGroupView.setVisibility(viewState.m() != null ? 0 : 8);
        ubv0 m = viewState.m();
        if (m != null) {
            suggestsGroupView.render(m);
        }
        xty0.c(q661Var.e, viewState.e(), null, new jaf(this, 1), 6);
        renderDivkit(viewState.f());
        renderWeb3dsView(viewState.o());
        q661Var.d.render(viewState.a());
        this.shouldEnableActionButton = viewState.l();
        renderOperationDialog(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public q661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return q661.p(inflater, container);
    }
}
