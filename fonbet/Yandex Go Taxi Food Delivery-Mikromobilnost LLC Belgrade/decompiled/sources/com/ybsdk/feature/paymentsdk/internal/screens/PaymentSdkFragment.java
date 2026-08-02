package com.ybsdk.feature.paymentsdk.internal.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import defpackage.aja0;
import defpackage.bja0;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.eja1;
import defpackage.hja0;
import defpackage.k1x0;
import defpackage.k761;
import defpackage.lfx;
import defpackage.tje;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0006*\u0001%\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/paymentsdk/internal/screens/PaymentSdkFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lk761;", "Lhja0;", "Lcom/ybsdk/feature/paymentsdk/internal/screens/a;", "Lce4;", "factoryOfViewModel", "Lk1x0;", "Lbja0;", "paymentSdkKit", "<init>", "(Lcom/ybsdk/feature/paymentsdk/internal/screens/a;Lk1x0;)V", "createViewModel", "()Lcom/ybsdk/feature/paymentsdk/internal/screens/a;", "", "fitsSystemWindow", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk761;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "viewState", "Lzy11;", "render", "(Lhja0;)V", "onDestroyView", "()V", "onBackPressed", "Lcom/ybsdk/feature/paymentsdk/internal/screens/a;", "Lk1x0;", "aja0", "fragmentLifecycleCallback", "Laja0;", "isInitialized", "Z", "feature-paymentsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentSdkFragment extends BaseMvvmFragment<k761, hja0, a> implements ce4 {
    private final a factoryOfViewModel;
    private final aja0 fragmentLifecycleCallback;
    private boolean isInitialized;
    private final k1x0 paymentSdkKit;

    public PaymentSdkFragment(a aVar, k1x0 k1x0Var) {
        super(Boolean.FALSE, 48, null, null, a.class, 12, null);
        this.factoryOfViewModel = aVar;
        this.paymentSdkKit = k1x0Var;
        this.fragmentLifecycleCallback = new aja0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        return ((bja0) this.paymentSdkKit.get()).a();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        getChildFragmentManager().d0(this.fragmentLifecycleCallback, true);
        return onCreateView;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().r0(this.fragmentLifecycleCallback);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(hja0 viewState) {
        if (this.isInitialized) {
            tje.N(eja1.s(this), null, null, new PaymentSdkFragment$render$1(this, null), 3);
            return;
        }
        ((bja0) this.paymentSdkKit.get()).e((AppCompatActivity) requireActivity(), ((k761) getBinding()).b, getChildFragmentManager(), ((PaymentSdkParams) dcs.a(this)).getDeeplink());
        this.isInitialized = true;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel, reason: from getter */
    public a getFactoryOfViewModel() {
        return this.factoryOfViewModel;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public k761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return k761.o(inflater, container);
    }
}
