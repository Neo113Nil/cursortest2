package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.ep6;
import defpackage.fp6;
import defpackage.h061;
import defpackage.ip6;
import defpackage.lfx;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rk6;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tf;
import defpackage.u8j0;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/search/BudgetChargesSearchStatusFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lh061;", "Lu8j0;", "Lep6;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/search/BudgetChargesSearchStatusViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/search/a;", "Lfp6;", "viewModelFactory", "<init>", "(Lfp6;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/budget/presentation/search/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lh061;", "viewState", "Lzy11;", "render", "(Lu8j0;)V", "Lfp6;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BudgetChargesSearchStatusFragment extends BaseDivContextMvvmFragment<h061, u8j0, a> {
    private final fp6 viewModelFactory;

    public BudgetChargesSearchStatusFragment(fp6 fp6Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = fp6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$3$lambda$1(BudgetChargesSearchStatusFragment budgetChargesSearchStatusFragment, View view) {
        ((a) budgetChargesSearchStatusFragment.getViewModel()).b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$3$lambda$2(BudgetChargesSearchStatusFragment budgetChargesSearchStatusFragment) {
        ((a) budgetChargesSearchStatusFragment.getViewModel()).e0();
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ip6) this.viewModelFactory).a((BudgetChargesSearchStatusScreenParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public h061 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        h061 o = h061.o(inflater, container);
        ErrorView errorView = o.c;
        errorView.setPrimaryButtonOnClickListener(new BudgetChargesSearchStatusFragment$getViewBinding$1$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new BudgetChargesSearchStatusFragment$getViewBinding$1$1$2(getViewModel()));
        o.b.setOnClickListener(new tf(26, this));
        o.h.setOnCloseButtonClickListener(new rk6(2, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        h061 h061Var = (h061) getBinding();
        ErrorView errorView = h061Var.c;
        ImageView imageView = h061Var.d;
        TextView textView = h061Var.g;
        errorView.render(null);
        YbButtonView ybButtonView = h061Var.b;
        boolean z = viewState instanceof r8j0;
        ybButtonView.setVisibility((!z || ((ep6) ((r8j0) viewState).e()).a() == null) ? 8 : 0);
        if (viewState instanceof s8j0) {
            h061Var.c.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            return;
        }
        if (viewState instanceof t8j0) {
            textView.setText(requireContext().getString(dzh0.ybsdk_transfer_resolve_uin_processing_title));
            return;
        }
        if (!z) {
            w511.b();
            return;
        }
        ep6 ep6Var = (ep6) ((r8j0) viewState).e();
        xty0.d(textView, ep6Var.e());
        xty0.d(h061Var.f, ep6Var.d());
        YbButtonView.a a = ep6Var.a();
        if (a != null) {
            ybButtonView.render(a);
        }
        v4b1.k(ep6Var.b(), imageView, null, null, 6);
        imageView.setVisibility(ep6Var.b() != null ? 0 : 8);
        h061Var.e.setVisibility(ep6Var.c() ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
