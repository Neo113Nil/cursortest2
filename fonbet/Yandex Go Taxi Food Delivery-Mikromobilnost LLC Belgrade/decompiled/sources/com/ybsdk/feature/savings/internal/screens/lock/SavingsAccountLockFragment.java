package com.ybsdk.feature.savings.internal.screens.lock;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import defpackage.b7m0;
import defpackage.c7m0;
import defpackage.d7m0;
import defpackage.dcs;
import defpackage.e7m0;
import defpackage.f7m0;
import defpackage.lfx;
import defpackage.n751;
import defpackage.ny61;
import defpackage.p7b1;
import defpackage.tdr;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z761;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/lock/SavingsAccountLockFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lz761;", "Lf7m0;", "Lc7m0;", "Ltdr;", "Lb7m0;", "factoryOfViewModel", "<init>", "(Lb7m0;)V", "createViewModel", "()Lc7m0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lz761;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "viewState", "Lzy11;", "render", "(Lf7m0;)V", "Lb7m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountLockFragment extends BaseMvvmFragment<z761, f7m0, c7m0> implements tdr {
    private final b7m0 factoryOfViewModel;

    public SavingsAccountLockFragment(b7m0 b7m0Var) {
        super(null, null, null, null, c7m0.class, 15, null);
        this.factoryOfViewModel = b7m0Var;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c7m0 getFactoryOfViewModel() {
        return ((d7m0) this.factoryOfViewModel).a((SavingsAccountLockParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public z761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        z761 p = z761.p(inflater, container);
        p.o().setPrimaryButtonOnClickListener(new SavingsAccountLockFragment$getViewBinding$1$1(getViewModel()));
        p.o().setSecondaryButtonClickListener(new SavingsAccountLockFragment$getViewBinding$1$2(getViewModel()));
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        CommunicationFullScreenView o = ((z761) getBinding()).o();
        ViewGroup.LayoutParams layoutParams = o.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, p7b1.f(insets).d);
        o.setLayoutParams(marginLayoutParams);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(f7m0 viewState) {
        if (viewState instanceof e7m0) {
            e7m0 e7m0Var = (e7m0) viewState;
            ((z761) getBinding()).o().render(e7m0Var.a());
            setStatusBarColorModel(new z1x0(e7m0Var.b()));
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
