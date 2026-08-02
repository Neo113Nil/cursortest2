package com.ybsdk.screens.spoilerOnboarding;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.spoilerOnboarding.SpoilerOnboardingFragment;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.ce4;
import defpackage.cwt0;
import defpackage.dwt0;
import defpackage.eaj0;
import defpackage.lfx;
import defpackage.rm31;
import defpackage.rtu;
import defpackage.sls;
import defpackage.sm91;
import defpackage.x861;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006#"}, d2 = {"Lcom/ybsdk/screens/spoilerOnboarding/SpoilerOnboardingFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lx861;", "Ldwt0;", "Lcwt0;", "Lce4;", "Lrm31;", "videoPlayerFactory", "Lyvf0;", "onboardingViewModelProviderProvider", "<init>", "(Lrm31;Lyvf0;)V", "createViewModel", "()Lcwt0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lx861;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Ldwt0;)V", "", "onBackPressed", "()Z", "Lrm31;", "Lyvf0;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpoilerOnboardingFragment extends BaseMvvmFragment<x861, dwt0, cwt0> implements ce4 {
    private final yvf0 onboardingViewModelProviderProvider;
    private final rm31 videoPlayerFactory;

    public SpoilerOnboardingFragment(rm31 rm31Var, yvf0 yvf0Var) {
        super(Boolean.FALSE, null, null, null, cwt0.class, 14, null);
        this.videoPlayerFactory = rm31Var;
        this.onboardingViewModelProviderProvider = yvf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$0(SpoilerOnboardingFragment spoilerOnboardingFragment, View view) {
        spoilerOnboardingFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$1(SpoilerOnboardingFragment spoilerOnboardingFragment) {
        spoilerOnboardingFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$2(SpoilerOnboardingFragment spoilerOnboardingFragment) {
        spoilerOnboardingFragment.getViewModel().d0();
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public cwt0 getFactoryOfViewModel() {
        return (cwt0) this.onboardingViewModelProviderProvider.get();
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().b0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ((x861) getBinding()).f.setVideoPlayerFactory(this.videoPlayerFactory);
        ((x861) getBinding()).d.setMovementMethod(LinkMovementMethod.getInstance());
        super.onViewCreated(view, savedInstanceState);
        x861 x861Var = (x861) getBinding();
        x861Var.b.setOnClickListener(new eaj0(24, this));
        YbButtonViewGroup ybButtonViewGroup = x861Var.c;
        final int i = 0;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new sls(this) { // from class: yvt0
            public final /* synthetic */ SpoilerOnboardingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$3$lambda$1;
                zy11 onViewCreated$lambda$3$lambda$2;
                int i2 = i;
                SpoilerOnboardingFragment spoilerOnboardingFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$3$lambda$1 = SpoilerOnboardingFragment.onViewCreated$lambda$3$lambda$1(spoilerOnboardingFragment);
                        return onViewCreated$lambda$3$lambda$1;
                    default:
                        onViewCreated$lambda$3$lambda$2 = SpoilerOnboardingFragment.onViewCreated$lambda$3$lambda$2(spoilerOnboardingFragment);
                        return onViewCreated$lambda$3$lambda$2;
                }
            }
        });
        final int i2 = 1;
        ybButtonViewGroup.setSecondaryButtonClickListener(new sls(this) { // from class: yvt0
            public final /* synthetic */ SpoilerOnboardingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$3$lambda$1;
                zy11 onViewCreated$lambda$3$lambda$2;
                int i22 = i2;
                SpoilerOnboardingFragment spoilerOnboardingFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$3$lambda$1 = SpoilerOnboardingFragment.onViewCreated$lambda$3$lambda$1(spoilerOnboardingFragment);
                        return onViewCreated$lambda$3$lambda$1;
                    default:
                        onViewCreated$lambda$3$lambda$2 = SpoilerOnboardingFragment.onViewCreated$lambda$3$lambda$2(spoilerOnboardingFragment);
                        return onViewCreated$lambda$3$lambda$2;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(dwt0 viewState) {
        x861 x861Var = (x861) getBinding();
        xty0.d(x861Var.e, viewState.d());
        TextView textView = x861Var.d;
        Text c = viewState.c();
        textView.setText(rtu.a(new SpoilerOnboardingFragment$render$1$1(getViewModel()), d.a(sm91.c(x861Var), c).toString()));
        x861Var.f.render(viewState.b());
        x861Var.c.render(viewState.a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public x861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return x861.o(inflater, container);
    }
}
