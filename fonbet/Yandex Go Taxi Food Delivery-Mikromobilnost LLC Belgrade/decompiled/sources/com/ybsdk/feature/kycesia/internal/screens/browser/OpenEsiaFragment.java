package com.ybsdk.feature.kycesia.internal.screens.browser;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import defpackage.b0p;
import defpackage.dcs;
import defpackage.i761;
import defpackage.jla1;
import defpackage.lfx;
import defpackage.m50;
import defpackage.nbo;
import defpackage.o570;
import defpackage.p570;
import defpackage.pbo;
import defpackage.q570;
import defpackage.qas0;
import defpackage.r570;
import defpackage.uh60;
import defpackage.v50;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/kycesia/internal/screens/browser/OpenEsiaFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Li761;", "Lr570;", "Lcom/ybsdk/feature/kycesia/internal/screens/browser/a;", "Lo570;", "viewModelFactory", "Lpbo;", "navigationHelper", "<init>", "(Lo570;Lpbo;)V", "createViewModel", "()Lcom/ybsdk/feature/kycesia/internal/screens/browser/a;", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li761;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lr570;)V", "Lo570;", "Lm50;", "Lb0p;", "launchBrowserContract", "Lm50;", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenEsiaFragment extends BaseMvvmFragment<i761, r570, a> {
    private final m50 launchBrowserContract;
    private final o570 viewModelFactory;

    public OpenEsiaFragment(o570 o570Var, pbo pboVar) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = o570Var;
        this.launchBrowserContract = registerForActivityResult(((nbo) pboVar).a(), new v50(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$2$lambda$1(OpenEsiaFragment openEsiaFragment) {
        openEsiaFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchBrowserContract$lambda$0(OpenEsiaFragment openEsiaFragment, Uri uri) {
        openEsiaFragment.getViewModel().c0(uri);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof p570) {
            jla1.i(this.launchBrowserContract, new b0p(((p570) sideEffect).a()));
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
        return ((q570) this.viewModelFactory).a((OpenEsiaParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public i761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        i761 o = i761.o(inflater);
        o.b.setPrimaryButtonOnClickListener(new uh60(6, this));
        return o;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(r570 viewState) {
        ((i761) getBinding()).b.render(viewState.a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
