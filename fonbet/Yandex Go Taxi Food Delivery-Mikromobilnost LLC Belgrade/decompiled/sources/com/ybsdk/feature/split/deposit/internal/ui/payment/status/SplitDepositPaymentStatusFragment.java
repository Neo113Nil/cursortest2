package com.ybsdk.feature.split.deposit.internal.ui.payment.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.but0;
import defpackage.ca41;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.dut0;
import defpackage.fka0;
import defpackage.gut0;
import defpackage.ha41;
import defpackage.hua1;
import defpackage.hut0;
import defpackage.iut0;
import defpackage.jl40;
import defpackage.jut0;
import defpackage.lfx;
import defpackage.mj31;
import defpackage.p9t0;
import defpackage.pbj;
import defpackage.ppr0;
import defpackage.qas0;
import defpackage.sls;
import defpackage.u861;
import defpackage.w511;
import defpackage.y8f;
import defpackage.ye0;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/payment/status/SplitDepositPaymentStatusFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lu861;", "Ljut0;", "Lcom/ybsdk/feature/split/deposit/internal/ui/payment/status/c;", "Lce4;", "Ldut0;", "viewModelFactory", "Lca41;", "web3dsFeature", "<init>", "(Ldut0;Lca41;)V", "", "challengeUrl", "Lzy11;", "renderChallengeWebView", "(Ljava/lang/String;)V", "renderNewChallengeWebView", "removeChallengeWebViewIfShown", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/split/deposit/internal/ui/payment/status/c;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Ljut0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lu861;", "onDestroyView", "", "onBackPressed", "()Z", "Ldut0;", "Lca41;", "Lha41;", "challengeWebView", "Lha41;", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SplitDepositPaymentStatusFragment extends BaseDivContextMvvmFragment<u861, jut0, c> implements ce4 {
    private ha41 challengeWebView;
    private final dut0 viewModelFactory;
    private final ca41 web3dsFeature;

    public SplitDepositPaymentStatusFragment(dut0 dut0Var, ca41 ca41Var) {
        super(Boolean.FALSE, null, null, null, c.class, 14, null);
        this.viewModelFactory = dut0Var;
        this.web3dsFeature = ca41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$0(SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment, String str, Bundle bundle) {
        ((c) splitDepositPaymentStatusFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$4$lambda$1(SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment) {
        ((c) splitDepositPaymentStatusFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$4$lambda$2(SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment) {
        ((c) splitDepositPaymentStatusFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$4$lambda$3(SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment) {
        ((c) splitDepositPaymentStatusFragment.getViewModel()).d0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeChallengeWebViewIfShown() {
        u861 u861Var = (u861) getBinding();
        if (this.challengeWebView != null) {
            u861Var.b.removeAllViews();
            u861Var.b.setVisibility(8);
            this.challengeWebView = null;
        }
    }

    private final void renderChallengeWebView(String challengeUrl) {
        ye0 n;
        ha41 ha41Var = this.challengeWebView;
        if (jl40.l((ha41Var == null || (n = ((pbj) ha41Var).n()) == null) ? null : n.k(), challengeUrl)) {
            return;
        }
        removeChallengeWebViewIfShown();
        if (challengeUrl != null) {
            renderNewChallengeWebView(challengeUrl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderNewChallengeWebView(String challengeUrl) {
        u861 u861Var = (u861) getBinding();
        pbj w = ((mj31) this.web3dsFeature).w(requireContext());
        w.R(new ppr0(29, this, u861Var));
        w.P(new p9t0(5, this));
        WebView J = w.J();
        if (J != null) {
            u861Var.b.addView(J);
        }
        w.K(challengeUrl);
        this.challengeWebView = w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderNewChallengeWebView$lambda$9$lambda$6(SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment, u861 u861Var) {
        ((c) splitDepositPaymentStatusFragment.getViewModel()).f0();
        u861Var.b.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderNewChallengeWebView$lambda$9$lambda$7(SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment, Throwable th) {
        ((c) splitDepositPaymentStatusFragment.getViewModel()).e0(th);
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof fka0) {
            hua1.f(((fka0) sideEffect).a(), this, "split_deposit_repayment");
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((gut0) this.viewModelFactory).a((SplitDepositPaymentStatusScreenParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public u861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        u861 o = u861.o(inflater, container);
        o.d.setActionHandler(new SplitDepositPaymentStatusFragment$getViewBinding$1$1(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((c) getViewModel()).c0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        hua1.g(this, "navigating_away_after_method_selection_payment", new but0(0, this));
        super.onCreate(savedInstanceState);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.challengeWebView = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        u861 u861Var = (u861) getBinding();
        final int i = 0;
        u861Var.e.setOnCloseButtonClickListener(new sls(this) { // from class: aut0
            public final /* synthetic */ SplitDepositPaymentStatusFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$4$lambda$1;
                zy11 onViewCreated$lambda$4$lambda$2;
                zy11 onViewCreated$lambda$4$lambda$3;
                int i2 = i;
                SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$4$lambda$1 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$1(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$1;
                    case 1:
                        onViewCreated$lambda$4$lambda$2 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$2(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$2;
                    default:
                        onViewCreated$lambda$4$lambda$3 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$3(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$3;
                }
            }
        });
        ErrorView errorView = u861Var.c;
        final int i2 = 1;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: aut0
            public final /* synthetic */ SplitDepositPaymentStatusFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$4$lambda$1;
                zy11 onViewCreated$lambda$4$lambda$2;
                zy11 onViewCreated$lambda$4$lambda$3;
                int i22 = i2;
                SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$4$lambda$1 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$1(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$1;
                    case 1:
                        onViewCreated$lambda$4$lambda$2 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$2(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$2;
                    default:
                        onViewCreated$lambda$4$lambda$3 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$3(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$3;
                }
            }
        });
        final int i3 = 2;
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: aut0
            public final /* synthetic */ SplitDepositPaymentStatusFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$4$lambda$1;
                zy11 onViewCreated$lambda$4$lambda$2;
                zy11 onViewCreated$lambda$4$lambda$3;
                int i22 = i3;
                SplitDepositPaymentStatusFragment splitDepositPaymentStatusFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$4$lambda$1 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$1(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$1;
                    case 1:
                        onViewCreated$lambda$4$lambda$2 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$2(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$2;
                    default:
                        onViewCreated$lambda$4$lambda$3 = SplitDepositPaymentStatusFragment.onViewCreated$lambda$4$lambda$3(splitDepositPaymentStatusFragment);
                        return onViewCreated$lambda$4$lambda$3;
                }
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(jut0 viewState) {
        u861 u861Var = (u861) getBinding();
        if (viewState instanceof iut0) {
            iut0 iut0Var = (iut0) viewState;
            renderChallengeWebView(iut0Var.a());
            u861Var.d.updateLocalDivkitVariables(iut0Var.b());
            u861Var.d.render(iut0Var.c());
            u861Var.c.render(null);
            return;
        }
        if (!(viewState instanceof hut0)) {
            w511.b();
        } else {
            u861Var.c.render(((hut0) viewState).a());
            removeChallengeWebViewIfShown();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
