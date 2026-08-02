package com.yandex.fintechsdk.features.error.internal.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import defpackage.a80;
import defpackage.c1o;
import defpackage.dmh0;
import defpackage.es31;
import defpackage.gh91;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.m7o;
import defpackage.n751;
import defpackage.n7o;
import defpackage.o6o;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sao;
import defpackage.sar;
import defpackage.sls;
import defpackage.u1w;
import defpackage.vbi0;
import defpackage.w8f;
import defpackage.x6o;
import defpackage.y8f;
import defpackage.zgl;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/yandex/fintechsdk/features/error/internal/presentation/ErrorFragment;", "Lcom/yandex/fintechsdk/core/architecture/api/fragment/BaseFragment;", "Lzy11;", "<init>", "()V", "initViews", "initTryAgainButton", "initCloseButton", "applyWindowInsets", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lsao;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lsao;", "viewModel", "Lo6o;", "componentStore$delegate", "getComponentStore", "()Lo6o;", "componentStore", "Lsar;", "binding$delegate", "Lvbi0;", "getBinding", "()Lsar;", "binding", "Companion", "n7o", "features-error_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorFragment extends BaseFragment<zy11, zy11> {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private static final int BOTTOM_PADDING_DP = 12;
    public static final n7o Companion;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final vbi0 binding;

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("binding", 0, "getBinding()Lcom/yandex/fintechsdk/core/ui/impl/databinding/FinsdkErrorViewDefaultBinding;", ErrorFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
        Companion = new n7o();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectViewModel$2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectFeatureComponentStore$2] */
    public ErrorFragment() {
        super(dmh0.finsdk_error_view_default);
        a80 a80Var = new a80(9, new c1o(3, this));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectViewModel$2
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(sao.class), new sls() { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, a80Var, new sls() { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectViewModel$5
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
        ErrorFragment$componentStore$2 errorFragment$componentStore$2 = ErrorFragment$componentStore$2.b;
        a aVar = new a(this);
        final ?? r1 = new sls(this) { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectFeatureComponentStore$2
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectFeatureComponentStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(o6o.class), new sls() { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectFeatureComponentStore$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, aVar, new sls() { // from class: com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment$special$$inlined$injectFeatureComponentStore$5
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
        this.binding = gh91.d(this, ErrorFragment$binding$2.b);
    }

    private final void applyWindowInsets() {
        ConstraintLayout constraintLayout = getBinding().a;
        zgl zglVar = new zgl(18);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(constraintLayout, zglVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 applyWindowInsets$lambda$3(View view, n751 n751Var) {
        u1w g = n751Var.a.g(519);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((int) (12.0f * view.getContext().getResources().getDisplayMetrics().density)) + g.d);
        return n751Var;
    }

    private final sar getBinding() {
        return (sar) this.binding.getValue(this, $$delegatedProperties[0]);
    }

    private final o6o getComponentStore() {
        return (o6o) this.componentStore.getValue();
    }

    private final void initCloseButton() {
        getBinding().b.setOnClickListener(new m7o(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCloseButton$lambda$2(ErrorFragment errorFragment, View view) {
        errorFragment.getViewModel().c.a();
    }

    private final void initTryAgainButton() {
        getBinding().c.setOnClickListener(new m7o(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTryAgainButton$lambda$1(ErrorFragment errorFragment, View view) {
        errorFragment.getViewModel().c.b();
    }

    private final void initViews() {
        initTryAgainButton();
        initCloseButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sao viewModel_delegate$lambda$0(ErrorFragment errorFragment) {
        return new sao(((x6o) errorFragment.getComponentStore().b.b).t());
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public sao getViewModel() {
        return (sao) this.viewModel.getValue();
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        if (((x6o) getComponentStore().b.b).A().b()) {
            return;
        }
        applyWindowInsets();
    }
}
