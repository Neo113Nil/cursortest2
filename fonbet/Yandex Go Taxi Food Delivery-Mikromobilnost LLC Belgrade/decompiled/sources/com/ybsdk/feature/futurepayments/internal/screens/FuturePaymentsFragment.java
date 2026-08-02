package com.ybsdk.feature.futurepayments.internal.screens;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import defpackage.a761;
import defpackage.dnr;
import defpackage.lfx;
import defpackage.mqs;
import defpackage.rr51;
import defpackage.s1r;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/futurepayments/internal/screens/FuturePaymentsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "La761;", "Lmqs;", "Lcom/ybsdk/feature/futurepayments/internal/screens/a;", "Lyvf0;", "viewModelFactoryProvider", "<init>", "(Lyvf0;)V", "createViewModel", "()Lcom/ybsdk/feature/futurepayments/internal/screens/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La761;", "Lzy11;", "onResume", "()V", "viewState", "render", "(Lmqs;)V", "Lyvf0;", "feature-future-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FuturePaymentsFragment extends BaseDivContextMvvmFragment<a761, mqs, a> {
    private final yvf0 viewModelFactoryProvider;

    public FuturePaymentsFragment(yvf0 yvf0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactoryProvider = yvf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getViewBinding$lambda$2$lambda$0(FuturePaymentsFragment futurePaymentsFragment, Uri uri) {
        return ((a) futurePaymentsFragment.getViewModel()).b0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$2$lambda$1(FuturePaymentsFragment futurePaymentsFragment) {
        ((a) futurePaymentsFragment.getViewModel()).c0();
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return (a) this.viewModelFactoryProvider.get();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public a761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        a761 o = a761.o(inflater, container);
        o.b.setActionHandler(new s1r(22, this));
        o.c.setPrimaryButtonOnClickListener(new dnr(11, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a) getViewModel()).d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(mqs viewState) {
        ((a761) getBinding()).d.setVisibility(viewState.c() ? 0 : 8);
        ((a761) getBinding()).c.render(viewState.b());
        ((a761) getBinding()).e.render(viewState.d());
        ((a761) getBinding()).b.setVisibility(viewState.a() != null ? 0 : 8);
        rr51 a = viewState.a();
        if (a != null) {
            YbDivView.setData$default(((a761) getBinding()).b, a, null, null, false, 14, null);
            ((a761) getBinding()).b.setVisibility(0);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
