package com.ybsdk.feature.savings.internal.screens.fund.operation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.bns;
import defpackage.dcs;
import defpackage.hua1;
import defpackage.jps;
import defpackage.kps;
import defpackage.l561;
import defpackage.lfx;
import defpackage.lps;
import defpackage.mps;
import defpackage.ops;
import defpackage.pps;
import defpackage.qps;
import defpackage.sls;
import defpackage.udm0;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.wcm0;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/fund/operation/FundOperationFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Ll561;", "Lqps;", "Lcom/ybsdk/feature/savings/internal/screens/fund/operation/a;", "Ljps;", "viewModelProvider", "Ludm0;", "twoFactorAuthScreenProvider", "<init>", "(Ljps;Ludm0;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/fund/operation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll561;", "viewState", "render", "(Lqps;)V", "Ljps;", "Ludm0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FundOperationFragment extends BaseDivContextMvvmFragment<l561, qps, a> {
    private final udm0 twoFactorAuthScreenProvider;
    private final jps viewModelProvider;

    public FundOperationFragment(jps jpsVar, udm0 udm0Var) {
        super(Boolean.TRUE, 48, null, null, a.class, 12, null);
        this.viewModelProvider = jpsVar;
        this.twoFactorAuthScreenProvider = udm0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$3$lambda$1(FundOperationFragment fundOperationFragment) {
        ((a) fundOperationFragment.getViewModel()).b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$3$lambda$2(FundOperationFragment fundOperationFragment) {
        ((a) fundOperationFragment.getViewModel()).c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$0(FundOperationFragment fundOperationFragment, String str, Bundle bundle) {
        ((a) fundOperationFragment.getViewModel()).d0(((wcm0) fundOperationFragment.twoFactorAuthScreenProvider).a(bundle));
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((kps) this.viewModelProvider).a((FundOperationParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r1v3, types: [uc5] */
    /* JADX WARN: Type inference failed for: r1v5, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r3v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public l561 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        l561 o = l561.o(inflater, container);
        ErrorView errorView = o.e;
        final int i = 0;
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: wos
            public final /* synthetic */ FundOperationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$3$lambda$1;
                zy11 viewBinding$lambda$3$lambda$2;
                int i2 = i;
                FundOperationFragment fundOperationFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$3$lambda$1 = FundOperationFragment.getViewBinding$lambda$3$lambda$1(fundOperationFragment);
                        return viewBinding$lambda$3$lambda$1;
                    default:
                        viewBinding$lambda$3$lambda$2 = FundOperationFragment.getViewBinding$lambda$3$lambda$2(fundOperationFragment);
                        return viewBinding$lambda$3$lambda$2;
                }
            }
        });
        final int i2 = 1;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: wos
            public final /* synthetic */ FundOperationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$3$lambda$1;
                zy11 viewBinding$lambda$3$lambda$2;
                int i22 = i2;
                FundOperationFragment fundOperationFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$3$lambda$1 = FundOperationFragment.getViewBinding$lambda$3$lambda$1(fundOperationFragment);
                        return viewBinding$lambda$3$lambda$1;
                    default:
                        viewBinding$lambda$3$lambda$2 = FundOperationFragment.getViewBinding$lambda$3$lambda$2(fundOperationFragment);
                        return viewBinding$lambda$3$lambda$2;
                }
            }
        });
        YbButtonViewGroup ybButtonViewGroup = o.c;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new FundOperationFragment$getViewBinding$1$3(getViewModel()));
        ybButtonViewGroup.setSecondaryButtonClickListener(new FundOperationFragment$getViewBinding$1$4(getViewModel()));
        o.g.setPrimaryButtonAction(new FundOperationFragment$getViewBinding$1$5(getViewModel()));
        ybButtonViewGroup.setLinkClickListener(new FundOperationFragment$getViewBinding$1$6(getViewModel()));
        o.d.setActionHandler(new FundOperationFragment$getViewBinding$1$7(getViewModel()));
        return o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "FUND_OPEN_REQUEST_KEY", new bns(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a) getViewModel()).e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(qps viewState) {
        boolean z = viewState instanceof mps;
        if (z) {
            mps mpsVar = (mps) viewState;
            YbDivView.setData$default(((l561) getBinding()).d, mpsVar.c(), null, null, false, 14, null);
            ((l561) getBinding()).c.render(mpsVar.b());
            xty0.d(((l561) getBinding()).i, mpsVar.e());
            xty0.d(((l561) getBinding()).h, mpsVar.d());
            v4b1.k(mpsVar.a(), ((l561) getBinding()).b, null, null, 6);
        } else if (viewState instanceof lps) {
            ((l561) getBinding()).g.render(((lps) viewState).a());
        } else if (viewState instanceof ops) {
            ((l561) getBinding()).e.render(((ops) viewState).a());
        } else {
            if (!(viewState instanceof pps)) {
                w511.b();
                return;
            }
            ((l561) getBinding()).g.render(((pps) viewState).a());
        }
        boolean z2 = false;
        ((l561) getBinding()).e.setVisibility(viewState instanceof ops ? 0 : 8);
        boolean z3 = viewState instanceof pps;
        ((l561) getBinding()).g.setVisibility((z3 || (viewState instanceof lps)) ? 0 : 8);
        ((l561) getBinding()).f.setVisibility(z ? 0 : 8);
        if (!(viewState instanceof lps) && !z3) {
            z2 = true;
        }
        setBackButtonVisible(z2);
        setBackButtonEnabled(getIsBackButtonVisible());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
