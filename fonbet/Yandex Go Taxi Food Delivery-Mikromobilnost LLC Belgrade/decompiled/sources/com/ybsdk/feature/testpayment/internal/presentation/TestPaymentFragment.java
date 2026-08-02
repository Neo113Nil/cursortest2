package com.ybsdk.feature.testpayment.internal.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.c961;
import defpackage.dcs;
import defpackage.i3y;
import defpackage.lfx;
import defpackage.mhy0;
import defpackage.oc70;
import defpackage.ohy0;
import defpackage.qhy0;
import defpackage.rhy0;
import defpackage.shy0;
import defpackage.sls;
import defpackage.thy0;
import defpackage.uhy0;
import defpackage.v4b1;
import defpackage.wz51;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lc961;", "Luhy0;", "Lcom/ybsdk/feature/testpayment/internal/presentation/a;", "Lohy0;", "viewModelFactory", "<init>", "(Lohy0;)V", "createViewModel", "()Lcom/ybsdk/feature/testpayment/internal/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lc961;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Luhy0;)V", "Lohy0;", "Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentArguments;", "screenArguments$delegate", "Li3y;", "getScreenArguments", "()Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentArguments;", "screenArguments", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TestPaymentFragment extends BaseMvvmFragment<c961, uhy0, a> {

    /* renamed from: screenArguments$delegate, reason: from kotlin metadata */
    private final i3y screenArguments;
    private final ohy0 viewModelFactory;

    public TestPaymentFragment(ohy0 ohy0Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = ohy0Var;
        this.screenArguments = dcs.c(this);
    }

    private final TestPaymentArguments getScreenArguments() {
        return (TestPaymentArguments) this.screenArguments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$0(TestPaymentFragment testPaymentFragment) {
        testPaymentFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$1(TestPaymentFragment testPaymentFragment) {
        testPaymentFragment.getViewModel().g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$2(TestPaymentFragment testPaymentFragment) {
        testPaymentFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$3(TestPaymentFragment testPaymentFragment) {
        testPaymentFragment.getViewModel().h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5$lambda$4(TestPaymentFragment testPaymentFragment) {
        testPaymentFragment.getViewModel().i0();
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
        return ((qhy0) this.viewModelFactory).a(getScreenArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c961 c961Var = (c961) getBinding();
        final int i = 0;
        c961Var.b.setPrimaryButtonOnClickListener(new sls(this) { // from class: bhy0
            public final /* synthetic */ TestPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$0;
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$2;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i2 = i;
                TestPaymentFragment testPaymentFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$5$lambda$0 = TestPaymentFragment.onViewCreated$lambda$5$lambda$0(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$0;
                    case 1:
                        onViewCreated$lambda$5$lambda$1 = TestPaymentFragment.onViewCreated$lambda$5$lambda$1(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 2:
                        onViewCreated$lambda$5$lambda$2 = TestPaymentFragment.onViewCreated$lambda$5$lambda$2(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$2;
                    case 3:
                        onViewCreated$lambda$5$lambda$3 = TestPaymentFragment.onViewCreated$lambda$5$lambda$3(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TestPaymentFragment.onViewCreated$lambda$5$lambda$4(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
        final int i2 = 1;
        c961Var.b.setSecondaryButtonClickListener(new sls(this) { // from class: bhy0
            public final /* synthetic */ TestPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$0;
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$2;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i22 = i2;
                TestPaymentFragment testPaymentFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$5$lambda$0 = TestPaymentFragment.onViewCreated$lambda$5$lambda$0(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$0;
                    case 1:
                        onViewCreated$lambda$5$lambda$1 = TestPaymentFragment.onViewCreated$lambda$5$lambda$1(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 2:
                        onViewCreated$lambda$5$lambda$2 = TestPaymentFragment.onViewCreated$lambda$5$lambda$2(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$2;
                    case 3:
                        onViewCreated$lambda$5$lambda$3 = TestPaymentFragment.onViewCreated$lambda$5$lambda$3(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TestPaymentFragment.onViewCreated$lambda$5$lambda$4(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
        final int i3 = 2;
        c961Var.i.setOnCloseButtonClickListener(new sls(this) { // from class: bhy0
            public final /* synthetic */ TestPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$0;
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$2;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i22 = i3;
                TestPaymentFragment testPaymentFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$5$lambda$0 = TestPaymentFragment.onViewCreated$lambda$5$lambda$0(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$0;
                    case 1:
                        onViewCreated$lambda$5$lambda$1 = TestPaymentFragment.onViewCreated$lambda$5$lambda$1(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 2:
                        onViewCreated$lambda$5$lambda$2 = TestPaymentFragment.onViewCreated$lambda$5$lambda$2(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$2;
                    case 3:
                        onViewCreated$lambda$5$lambda$3 = TestPaymentFragment.onViewCreated$lambda$5$lambda$3(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TestPaymentFragment.onViewCreated$lambda$5$lambda$4(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
        ErrorView errorView = c961Var.d;
        final int i4 = 3;
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: bhy0
            public final /* synthetic */ TestPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$0;
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$2;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i22 = i4;
                TestPaymentFragment testPaymentFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$5$lambda$0 = TestPaymentFragment.onViewCreated$lambda$5$lambda$0(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$0;
                    case 1:
                        onViewCreated$lambda$5$lambda$1 = TestPaymentFragment.onViewCreated$lambda$5$lambda$1(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 2:
                        onViewCreated$lambda$5$lambda$2 = TestPaymentFragment.onViewCreated$lambda$5$lambda$2(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$2;
                    case 3:
                        onViewCreated$lambda$5$lambda$3 = TestPaymentFragment.onViewCreated$lambda$5$lambda$3(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TestPaymentFragment.onViewCreated$lambda$5$lambda$4(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
        final int i5 = 4;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: bhy0
            public final /* synthetic */ TestPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$5$lambda$0;
                zy11 onViewCreated$lambda$5$lambda$1;
                zy11 onViewCreated$lambda$5$lambda$2;
                zy11 onViewCreated$lambda$5$lambda$3;
                zy11 onViewCreated$lambda$5$lambda$4;
                int i22 = i5;
                TestPaymentFragment testPaymentFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$5$lambda$0 = TestPaymentFragment.onViewCreated$lambda$5$lambda$0(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$0;
                    case 1:
                        onViewCreated$lambda$5$lambda$1 = TestPaymentFragment.onViewCreated$lambda$5$lambda$1(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$1;
                    case 2:
                        onViewCreated$lambda$5$lambda$2 = TestPaymentFragment.onViewCreated$lambda$5$lambda$2(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$2;
                    case 3:
                        onViewCreated$lambda$5$lambda$3 = TestPaymentFragment.onViewCreated$lambda$5$lambda$3(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$3;
                    default:
                        onViewCreated$lambda$5$lambda$4 = TestPaymentFragment.onViewCreated$lambda$5$lambda$4(testPaymentFragment);
                        return onViewCreated$lambda$5$lambda$4;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(uhy0 viewState) {
        c961 c961Var = (c961) getBinding();
        wz51 wz51Var = c961Var.g;
        TextView textView = c961Var.c;
        TextView textView2 = c961Var.h;
        OperationProgressView operationProgressView = c961Var.f;
        ImageView imageView = c961Var.e;
        boolean z = viewState instanceof thy0;
        wz51Var.p().setVisibility(z ? 0 : 8);
        ErrorView errorView = c961Var.d;
        shy0 shy0Var = viewState instanceof shy0 ? (shy0) viewState : null;
        errorView.render(shy0Var != null ? shy0Var.a() : null);
        rhy0 rhy0Var = viewState instanceof rhy0 ? (rhy0) viewState : null;
        mhy0 a = rhy0Var != null ? rhy0Var.a() : null;
        c961Var.i.setVisibility((z || a != null) ? 0 : 8);
        v4b1.k(a != null ? a.c() : null, imageView, null, null, 6);
        imageView.setVisibility(a != null ? 0 : 8);
        if (a != null) {
            operationProgressView.render(a.d());
        }
        operationProgressView.setVisibility((a == null || a.d().equals(oc70.a)) ? 8 : 0);
        textView2.setText(a != null ? d.a(requireContext(), a.e()) : null);
        textView2.setVisibility(a != null ? 0 : 8);
        textView.setText(a != null ? d.a(requireContext(), a.b()) : null);
        textView.setVisibility(a != null ? 0 : 8);
        c961Var.b.render(a != null ? a.a() : null);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public c961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return c961.o(inflater, container);
    }
}
