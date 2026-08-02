package com.yandex.fintechsdk.features.splash.internal.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.ag9;
import defpackage.dn90;
import defpackage.es31;
import defpackage.gas0;
import defpackage.gh91;
import defpackage.hk3;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.kqt0;
import defpackage.m50;
import defpackage.n751;
import defpackage.nqt0;
import defpackage.ovr0;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.u6s0;
import defpackage.uar;
import defpackage.v50;
import defpackage.vbi0;
import defpackage.w511;
import defpackage.w8f;
import defpackage.y8f;
import defpackage.yn90;
import defpackage.yrt0;
import defpackage.z22;
import defpackage.zgf;
import defpackage.zmh0;
import defpackage.zrt0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/fintechsdk/features/splash/internal/presentation/SplashFragment;", "Lcom/yandex/fintechsdk/core/architecture/api/fragment/BaseFragment;", "Lzy11;", "Lzrt0;", "<init>", "()V", "initAuthContract", "sideEffectLaunchAuth", "Landroid/view/View;", "v", "Ln751;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "sideEffect", "(Lzrt0;)V", "Lcom/yandex/fintechsdk/features/splash/internal/presentation/b;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/fintechsdk/features/splash/internal/presentation/b;", "viewModel", "Lm50;", "authLauncher", "Lm50;", "Luar;", "binding$delegate", "Lvbi0;", "getBinding", "()Luar;", "binding", "Lkqt0;", "componentStore$delegate", "getComponentStore", "()Lkqt0;", "componentStore", "features-splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SplashFragment extends BaseFragment<zy11, zrt0> {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private m50 authLauncher;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final vbi0 binding;

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("binding", 0, "getBinding()Lcom/yandex/fintechsdk/features/splash/databinding/FinsdkFragmentSplashBinding;", SplashFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectViewModel$2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectFeatureComponentStore$2] */
    public SplashFragment() {
        super(zmh0.finsdk_fragment_splash);
        u6s0 u6s0Var = new u6s0(3, new gas0(22, this));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectViewModel$2
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, u6s0Var, new sls() { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectViewModel$5
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
        this.binding = gh91.d(this, SplashFragment$binding$2.b);
        SplashFragment$componentStore$2 splashFragment$componentStore$2 = SplashFragment$componentStore$2.b;
        a aVar = new a(this);
        final ?? r1 = new sls(this) { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectFeatureComponentStore$2
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectFeatureComponentStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(kqt0.class), new sls() { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectFeatureComponentStore$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, aVar, new sls() { // from class: com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment$special$$inlined$injectFeatureComponentStore$5
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
    }

    private final uar getBinding() {
        return (uar) this.binding.getValue(this, $$delegatedProperties[0]);
    }

    private final kqt0 getComponentStore() {
        return (kqt0) this.componentStore.getValue();
    }

    private final void initAuthContract() {
        zgf zgfVar = getComponentStore().b;
        zgfVar.getClass();
        nqt0 nqt0Var = (nqt0) zgfVar.b;
        DefaultEnvironment environment = nqt0Var.getEnvironment();
        q5z.h(environment);
        dn90 b = nqt0Var.b();
        yn90 yn90Var = b != null ? new yn90(environment, b, 1) : null;
        if (yn90Var == null) {
            return;
        }
        this.authLauncher = registerForActivityResult(yn90Var, new v50(9, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAuthContract$lambda$1(SplashFragment splashFragment, Long l) {
        splashFragment.getViewModel().E.d(l);
    }

    private final void sideEffectLaunchAuth() {
        m50 m50Var = this.authLauncher;
        if (m50Var != null) {
            m50Var.a(zy11.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b viewModel_delegate$lambda$0(SplashFragment splashFragment) {
        nqt0 nqt0Var = (nqt0) splashFragment.getComponentStore().b.b;
        z22 analytics = nqt0Var.getAnalytics();
        q5z.h(analytics);
        hk3 a = nqt0Var.a();
        q5z.h(a);
        DefaultEnvironment environment = nqt0Var.getEnvironment();
        q5z.h(environment);
        return new b(analytics, a, environment, nqt0Var.b(), nqt0Var.h(), nqt0Var.C(), nqt0Var.s(), nqt0Var.l(), nqt0Var.n());
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment, defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initAuthContract();
        b viewModel = getViewModel();
        Context requireContext = requireContext();
        viewModel.getClass();
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new SplashViewModel$initViewModel$1(viewModel, requireContext, null));
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ovr0 ovr0Var = ShimmersFragment.Companion;
        FragmentManager childFragmentManager = getChildFragmentManager();
        SplashFragment$onViewCreated$1 splashFragment$onViewCreated$1 = new SplashFragment$onViewCreated$1(0, getViewModel(), b.class, "onBackPressed", "onBackPressed()V", 0);
        ovr0Var.getClass();
        childFragmentManager.m0("shimmers_fragment_result_id", this, new ag9(splashFragment$onViewCreated$1));
        ovr0.a(getBinding().b.getId(), getChildFragmentManager(), ((nqt0) getComponentStore().b.b).d(), null);
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public void sideEffect(zrt0 sideEffect) {
        if (sideEffect.equals(yrt0.a)) {
            sideEffectLaunchAuth();
        } else {
            w511.b();
        }
    }
}
