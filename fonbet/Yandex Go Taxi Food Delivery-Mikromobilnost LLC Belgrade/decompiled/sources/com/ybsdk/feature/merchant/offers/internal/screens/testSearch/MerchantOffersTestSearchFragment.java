package com.ybsdk.feature.merchant.offers.internal.screens.testSearch;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import defpackage.bns;
import defpackage.e7n;
import defpackage.eja1;
import defpackage.hc5;
import defpackage.i3y;
import defpackage.k161;
import defpackage.lfx;
import defpackage.m70;
import defpackage.ola1;
import defpackage.oq10;
import defpackage.qq10;
import defpackage.spl;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/screens/testSearch/MerchantOffersTestSearchFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lk161;", "Lqq10;", "Lcom/ybsdk/feature/merchant/offers/internal/screens/testSearch/a;", "Lyvf0;", "viewModelProvider", "<init>", "(Lyvf0;)V", "createViewModel", "()Lcom/ybsdk/feature/merchant/offers/internal/screens/testSearch/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk161;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lqq10;)V", "Lyvf0;", "Le7n;", "Lgc5;", "adapter$delegate", "Li3y;", "getAdapter", "()Le7n;", "adapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MerchantOffersTestSearchFragment extends BaseDivContextMvvmFragment<k161, qq10, a> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final yvf0 viewModelProvider;

    public MerchantOffersTestSearchFragment(yvf0 yvf0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelProvider = yvf0Var;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new oq10(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ k161 access$getBinding(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment) {
        return (k161) merchantOffersTestSearchFragment.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment) {
        return (a) merchantOffersTestSearchFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7n adapter_delegate$lambda$1(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment) {
        return new e7n(hc5.a(), ola1.c(new bns(29, merchantOffersTestSearchFragment)), new m70[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter_delegate$lambda$1$lambda$0(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment, Uri uri, spl splVar) {
        return ((a) merchantOffersTestSearchFragment.getViewModel()).d0(uri);
    }

    private final e7n getAdapter() {
        return (e7n) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$2(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment) {
        ((a) merchantOffersTestSearchFragment.getViewModel()).c0();
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return (a) this.viewModelProvider.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((k161) getBinding()).e.setAdapter(getAdapter());
        ((k161) getBinding()).b.setPrimaryButtonOnClickListener(new oq10(this, 1));
        eja1.s(this).c(new MerchantOffersTestSearchFragment$onViewCreated$2(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(qq10 viewState) {
        k161 k161Var = (k161) getBinding();
        k161Var.c.render(viewState.b());
        getAdapter().g(viewState.c());
        k161Var.b.render(viewState.a());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public k161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return k161.o(inflater, container);
    }
}
