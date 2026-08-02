package com.ybsdk.screens.initial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.screens.initial.InitialFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.b761;
import defpackage.dcs;
import defpackage.fj3;
import defpackage.gau;
import defpackage.kwt0;
import defpackage.lfx;
import defpackage.mwv;
import defpackage.pwv;
import defpackage.qwv;
import defpackage.sls;
import defpackage.vvv;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001f¨\u0006\""}, d2 = {"Lcom/ybsdk/screens/initial/InitialFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lb761;", "Lqwv;", "Lcom/ybsdk/screens/initial/d;", "Lkwt0;", "Lmwv;", "viewModelFactory", "Lfj3;", "authLandingFeature", "<init>", "(Lmwv;Lfj3;)V", "createViewModel", "()Lcom/ybsdk/screens/initial/d;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb761;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lqwv;)V", "Lmwv;", "Lfj3;", "Companion", "vvv", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InitialFragment extends BaseMvvmFragment<b761, qwv, d> implements kwt0 {
    public static final vvv Companion = new vvv();
    public static final long GRACEFUL_TIME = 100;
    public static final long PROGRESS_ANIMATION_TIME = 250;
    private final fj3 authLandingFeature;
    private final mwv viewModelFactory;

    public InitialFragment(mwv mwvVar, fj3 fj3Var) {
        super(Boolean.FALSE, null, null, null, d.class, 14, null);
        this.viewModelFactory = mwvVar;
        this.authLandingFeature = fj3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$0(InitialFragment initialFragment) {
        initialFragment.getViewModel().j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$1(InitialFragment initialFragment) {
        initialFragment.getViewModel().j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$2(InitialFragment initialFragment) {
        initialFragment.authLandingFeature.getClass();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$5$lambda$4(InitialFragment initialFragment, String str) {
        initialFragment.getViewModel().k0(str);
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public d getFactoryOfViewModel() {
        return ((pwv) this.viewModelFactory).a((InitialFragmentScreenParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        b761 b761Var = (b761) getBinding();
        super.onViewCreated(view, savedInstanceState);
        final int i = 0;
        ((b761) getBinding()).b.setPrimaryButtonOnClickListener(new sls(this) { // from class: uvv
            public final /* synthetic */ InitialFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$3$lambda$0;
                zy11 onViewCreated$lambda$3$lambda$1;
                zy11 onViewCreated$lambda$3$lambda$2;
                int i2 = i;
                InitialFragment initialFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$3$lambda$0 = InitialFragment.onViewCreated$lambda$3$lambda$0(initialFragment);
                        return onViewCreated$lambda$3$lambda$0;
                    case 1:
                        onViewCreated$lambda$3$lambda$1 = InitialFragment.onViewCreated$lambda$3$lambda$1(initialFragment);
                        return onViewCreated$lambda$3$lambda$1;
                    default:
                        onViewCreated$lambda$3$lambda$2 = InitialFragment.onViewCreated$lambda$3$lambda$2(initialFragment);
                        return onViewCreated$lambda$3$lambda$2;
                }
            }
        });
        final int i2 = 1;
        b761Var.b.setPrimaryButtonOnClickListener(new sls(this) { // from class: uvv
            public final /* synthetic */ InitialFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$3$lambda$0;
                zy11 onViewCreated$lambda$3$lambda$1;
                zy11 onViewCreated$lambda$3$lambda$2;
                int i22 = i2;
                InitialFragment initialFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$3$lambda$0 = InitialFragment.onViewCreated$lambda$3$lambda$0(initialFragment);
                        return onViewCreated$lambda$3$lambda$0;
                    case 1:
                        onViewCreated$lambda$3$lambda$1 = InitialFragment.onViewCreated$lambda$3$lambda$1(initialFragment);
                        return onViewCreated$lambda$3$lambda$1;
                    default:
                        onViewCreated$lambda$3$lambda$2 = InitialFragment.onViewCreated$lambda$3$lambda$2(initialFragment);
                        return onViewCreated$lambda$3$lambda$2;
                }
            }
        });
        ErrorView errorView = b761Var.b;
        final int i3 = 2;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: uvv
            public final /* synthetic */ InitialFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$3$lambda$0;
                zy11 onViewCreated$lambda$3$lambda$1;
                zy11 onViewCreated$lambda$3$lambda$2;
                int i22 = i3;
                InitialFragment initialFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$3$lambda$0 = InitialFragment.onViewCreated$lambda$3$lambda$0(initialFragment);
                        return onViewCreated$lambda$3$lambda$0;
                    case 1:
                        onViewCreated$lambda$3$lambda$1 = InitialFragment.onViewCreated$lambda$3$lambda$1(initialFragment);
                        return onViewCreated$lambda$3$lambda$1;
                    default:
                        onViewCreated$lambda$3$lambda$2 = InitialFragment.onViewCreated$lambda$3$lambda$2(initialFragment);
                        return onViewCreated$lambda$3$lambda$2;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(qwv viewState) {
        b761 b761Var = (b761) getBinding();
        CircularProgressIndicator circularProgressIndicator = b761Var.c;
        ErrorView errorView = b761Var.b;
        com.ybsdk.core.utils.ext.view.b.c(circularProgressIndicator, viewState.b(), 250L, 8, 100L, null, 16);
        setBackButtonVisible(viewState.a() != null || viewState.b());
        errorView.render(viewState.a());
        errorView.setHyperLinkOnClickListener(new gau(16, this));
    }

    @Override // defpackage.kwt0
    public boolean shouldActivateSpoilers() {
        return false;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public b761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return b761.o(inflater, container);
    }
}
