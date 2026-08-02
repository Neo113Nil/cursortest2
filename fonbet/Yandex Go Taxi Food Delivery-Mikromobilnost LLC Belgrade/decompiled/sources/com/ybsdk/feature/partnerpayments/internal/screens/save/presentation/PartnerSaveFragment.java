package com.ybsdk.feature.partnerpayments.internal.screens.save.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.partnerpayments.api.PartnerSaveScreenParams;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.d;
import defpackage.b561;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.hua1;
import defpackage.lfx;
import defpackage.oh90;
import defpackage.th90;
import defpackage.u290;
import defpackage.uh90;
import defpackage.vh90;
import defpackage.wh90;
import defpackage.xh90;
import defpackage.y8f;
import defpackage.yh90;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/screens/save/presentation/PartnerSaveFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lb561;", "Lyh90;", "Lcom/ybsdk/feature/partnerpayments/internal/screens/save/presentation/a;", "Lce4;", "Lth90;", "viewModelFactory", "<init>", "(Lth90;)V", "", "onBackPressed", "()Z", "createViewModel", "()Lcom/ybsdk/feature/partnerpayments/internal/screens/save/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb561;", "viewState", "Lzy11;", "render", "(Lyh90;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lth90;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PartnerSaveFragment extends BaseMvvmFragment<b561, yh90, a> implements ce4 {
    private final th90 viewModelFactory;

    public PartnerSaveFragment(th90 th90Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = th90Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$2$lambda$0(PartnerSaveFragment partnerSaveFragment) {
        partnerSaveFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$2$lambda$1(PartnerSaveFragment partnerSaveFragment) {
        partnerSaveFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$5(PartnerSaveFragment partnerSaveFragment, SelectedPartner selectedPartner) {
        partnerSaveFragment.getViewModel().d0(selectedPartner.getPartnerEntity().getPartnerId());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$6(PartnerSaveFragment partnerSaveFragment) {
        partnerSaveFragment.onBackPressed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$7(PartnerSaveFragment partnerSaveFragment) {
        partnerSaveFragment.onBackPressed();
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
        return ((uh90) this.viewModelFactory).a((PartnerSaveScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public b561 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        b561 o = b561.o(inflater, container);
        o.d.setOnCloseButtonClickListener(new PartnerSaveFragment$getViewBinding$1$1(getViewModel()));
        ErrorView errorView = o.b;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new oh90(this, 2));
        errorView.setSecondaryButtonClickListener(new oh90(this, 3));
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().c0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "SELECT_PARTNER_RESULT_KEY", new com.ybsdk.feature.partnerselection.api.a(new oh90(this, 0), new oh90(this, 1), new u290(6, this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(yh90 viewState) {
        b561 b561Var = (b561) getBinding();
        boolean z = viewState instanceof xh90;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            b561Var.c.render(new d((Text) (objArr2 == true ? 1 : 0), (Text) (objArr == true ? 1 : 0), 7));
        }
        ErrorView errorView = b561Var.b;
        vh90 vh90Var = viewState instanceof vh90 ? (vh90) viewState : null;
        errorView.render(vh90Var != null ? vh90Var.a() : null);
        b561Var.c.setVisibility(z ? 0 : 8);
        b561Var.d.setVisibility(viewState instanceof wh90 ? 8 : 0);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
