package com.ybsdk.feature.rebind.payment.internal.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodScreenParams;
import defpackage.ca41;
import defpackage.dcs;
import defpackage.e661;
import defpackage.ha41;
import defpackage.hfi0;
import defpackage.jfi0;
import defpackage.kfi0;
import defpackage.lfx;
import defpackage.mj31;
import defpackage.pbj;
import defpackage.ugd0;
import defpackage.vyf0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/rebind/payment/internal/screens/RebindPaymentMethodFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Le661;", "Lkfi0;", "Lcom/ybsdk/feature/rebind/payment/internal/screens/a;", "Lhfi0;", "factoryOfViewModel", "Lca41;", "web3dsFeature", "<init>", "(Lhfi0;Lca41;)V", "createViewModel", "()Lcom/ybsdk/feature/rebind/payment/internal/screens/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Le661;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lkfi0;)V", "Lhfi0;", "Lca41;", "Lha41;", "web3dsView", "Lha41;", "feature-rebind-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RebindPaymentMethodFragment extends BaseMvvmFragment<e661, kfi0, a> {
    private final hfi0 factoryOfViewModel;
    private final ca41 web3dsFeature;
    private ha41 web3dsView;

    public RebindPaymentMethodFragment(hfi0 hfi0Var, ca41 ca41Var) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = hfi0Var;
        this.web3dsFeature = ca41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4$lambda$0(RebindPaymentMethodFragment rebindPaymentMethodFragment) {
        rebindPaymentMethodFragment.getViewModel().b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4$lambda$1(e661 e661Var) {
        e661Var.d.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4$lambda$2(e661 e661Var, RebindPaymentMethodFragment rebindPaymentMethodFragment, Throwable th) {
        e661Var.d.setVisibility(8);
        rebindPaymentMethodFragment.getViewModel().d0(th);
        rebindPaymentMethodFragment.getViewModel().c0(th);
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((jfi0) this.factoryOfViewModel).a((RebindPaymentMethodScreenParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        WebView J;
        e661 e661Var = (e661) getBinding();
        super.onViewCreated(view, savedInstanceState);
        setBackButtonVisible(false);
        e661Var.c.setOnCloseButtonClickListener(new vyf0(11, this));
        pbj w = ((mj31) this.web3dsFeature).w(requireContext());
        this.web3dsView = w;
        w.R(new vyf0(12, e661Var));
        ha41 ha41Var = this.web3dsView;
        if (ha41Var != null) {
            ((pbj) ha41Var).P(new ugd0(23, e661Var, this));
        }
        ha41 ha41Var2 = this.web3dsView;
        if (ha41Var2 == null || (J = ((pbj) ha41Var2).J()) == null) {
            return;
        }
        e661Var.d.addView(J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(kfi0 viewState) {
        ((e661) getBinding()).b.render(viewState.a());
        if (viewState.b() == null) {
            ((e661) getBinding()).d.setVisibility(8);
            return;
        }
        ha41 ha41Var = this.web3dsView;
        if (ha41Var != null) {
            ((pbj) ha41Var).K(viewState.b());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public e661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return e661.o(inflater, container);
    }
}
