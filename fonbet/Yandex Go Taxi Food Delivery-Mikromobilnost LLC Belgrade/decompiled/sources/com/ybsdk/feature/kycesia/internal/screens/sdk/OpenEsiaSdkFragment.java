package com.ybsdk.feature.kycesia.internal.screens.sdk;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.d570;
import defpackage.dcs;
import defpackage.e570;
import defpackage.f570;
import defpackage.g570;
import defpackage.h570;
import defpackage.j570;
import defpackage.j761;
import defpackage.lfx;
import defpackage.m50;
import defpackage.nbo;
import defpackage.pbo;
import defpackage.qas0;
import defpackage.v50;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/kycesia/internal/screens/sdk/OpenEsiaSdkFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lj761;", "Lj570;", "Lf570;", "Ld570;", "factoryOfViewModel", "Lpbo;", "navigationHelper", "<init>", "(Ld570;Lpbo;)V", "createViewModel", "()Lf570;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lj761;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lj570;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Ld570;", "Lm50;", "Lb0p;", "resultContractLauncher", "Lm50;", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenEsiaSdkFragment extends BaseMvvmFragment<j761, j570, f570> {
    private final d570 factoryOfViewModel;
    private final m50 resultContractLauncher;

    public OpenEsiaSdkFragment(d570 d570Var, pbo pboVar) {
        super(null, null, null, null, f570.class, 15, null);
        this.factoryOfViewModel = d570Var;
        this.resultContractLauncher = registerForActivityResult(((nbo) pboVar).a(), new v50(6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resultContractLauncher$lambda$0(OpenEsiaSdkFragment openEsiaSdkFragment, Uri uri) {
        openEsiaSdkFragment.getViewModel().d0(uri);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof e570) {
            this.resultContractLauncher.a(((e570) sideEffect).a());
        } else {
            super.consumeSideEffect(sideEffect);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public f570 getFactoryOfViewModel() {
        return ((g570) this.factoryOfViewModel).a((OpenEsiaSdkParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public j761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        j761 o = j761.o(inflater, container);
        ErrorView errorView = o.b;
        errorView.setPrimaryButtonOnClickListener(new OpenEsiaSdkFragment$getViewBinding$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new OpenEsiaSdkFragment$getViewBinding$1$2(getViewModel()));
        return o;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(j570 viewState) {
        boolean z = viewState instanceof h570;
        ((j761) getBinding()).b.render(null);
        ((j761) getBinding()).b.setVisibility(z ? 0 : 8);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
