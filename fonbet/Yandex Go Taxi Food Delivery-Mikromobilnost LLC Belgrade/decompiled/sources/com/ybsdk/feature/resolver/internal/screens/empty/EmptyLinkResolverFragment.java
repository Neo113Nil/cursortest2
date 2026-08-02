package com.ybsdk.feature.resolver.internal.screens.empty;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.awn;
import defpackage.bwn;
import defpackage.dcs;
import defpackage.lfx;
import defpackage.x661;
import defpackage.xvn;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvn;
import defpackage.zvn;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lx661;", "Lbwn;", "Lcom/ybsdk/feature/resolver/internal/screens/empty/a;", "Lxvn;", "factoryOfViewModel", "<init>", "(Lxvn;)V", "createViewModel", "()Lcom/ybsdk/feature/resolver/internal/screens/empty/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lx661;", "viewState", "Lzy11;", "render", "(Lbwn;)V", "Lxvn;", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmptyLinkResolverFragment extends BaseMvvmFragment<x661, bwn, a> {
    private final xvn factoryOfViewModel;

    public EmptyLinkResolverFragment(xvn xvnVar) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = xvnVar;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((yvn) this.factoryOfViewModel).a((EmptyLinkResolverParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public x661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        x661 o = x661.o(inflater, container);
        ErrorView errorView = o.b;
        errorView.setPrimaryButtonOnClickListener(new EmptyLinkResolverFragment$getViewBinding$1$1(getViewModel()));
        errorView.setSecondaryButtonClickListener(new EmptyLinkResolverFragment$getViewBinding$1$2(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(bwn viewState) {
        boolean z = viewState instanceof zvn;
        if (z) {
            ((x661) getBinding()).b.render(((zvn) viewState).a());
        } else {
            ((x661) getBinding()).b.render(null);
        }
        ((x661) getBinding()).b.setVisibility(z ? 0 : 8);
        ((x661) getBinding()).c.setVisibility(viewState instanceof awn ? 0 : 8);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
