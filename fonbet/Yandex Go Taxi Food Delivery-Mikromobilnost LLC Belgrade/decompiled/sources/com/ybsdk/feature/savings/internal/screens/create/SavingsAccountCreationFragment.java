package com.ybsdk.feature.savings.internal.screens.create;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.a5m0;
import defpackage.b5m0;
import defpackage.c5m0;
import defpackage.d5m0;
import defpackage.dcs;
import defpackage.iik0;
import defpackage.lfx;
import defpackage.w4m0;
import defpackage.w511;
import defpackage.x761;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/create/SavingsAccountCreationFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lx761;", "Ld5m0;", "Lcom/ybsdk/feature/savings/internal/screens/create/a;", "Lw4m0;", "factoryOfViewModel", "<init>", "(Lw4m0;)V", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/create/a;", "viewState", "Lzy11;", "render", "(Ld5m0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lx761;", "Lw4m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountCreationFragment extends BaseMvvmFragment<x761, d5m0, a> {
    private final w4m0 factoryOfViewModel;

    public SavingsAccountCreationFragment(w4m0 w4m0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = w4m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$1$lambda$0(SavingsAccountCreationFragment savingsAccountCreationFragment) {
        savingsAccountCreationFragment.getViewModel().d0();
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
        return ((a5m0) this.factoryOfViewModel).a((SavingsAccountCreationParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public x761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        x761 o = x761.o(inflater, container);
        ErrorView errorView = o.b;
        errorView.setPrimaryButtonOnClickListener(new SavingsAccountCreationFragment$getViewBinding$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new SavingsAccountCreationFragment$getViewBinding$1$2(getViewModel()));
        o.c.setPrimaryButtonAction(new iik0(29, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(d5m0 viewState) {
        boolean z = viewState instanceof c5m0;
        ((x761) getBinding()).b.setVisibility(z ? 0 : 8);
        boolean z2 = viewState instanceof b5m0;
        ((x761) getBinding()).c.setVisibility(z2 ? 0 : 8);
        if (z2) {
            ((x761) getBinding()).c.render(((b5m0) viewState).a());
        } else if (z) {
            ((x761) getBinding()).b.render(((c5m0) viewState).a());
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
