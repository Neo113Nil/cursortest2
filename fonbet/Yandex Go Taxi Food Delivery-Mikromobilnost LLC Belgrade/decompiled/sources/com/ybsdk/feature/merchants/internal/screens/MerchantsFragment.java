package com.ybsdk.feature.merchants.internal.screens;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import defpackage.fr10;
import defpackage.h761;
import defpackage.k200;
import defpackage.lfx;
import defpackage.rr51;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/merchants/internal/screens/MerchantsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lh761;", "Lfr10;", "Lcom/ybsdk/feature/merchants/internal/screens/a;", "factoryOfViewModel", "<init>", "(Lcom/ybsdk/feature/merchants/internal/screens/a;)V", "createViewModel", "()Lcom/ybsdk/feature/merchants/internal/screens/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lh761;", "viewState", "Lzy11;", "render", "(Lfr10;)V", "Lcom/ybsdk/feature/merchants/internal/screens/a;", "feature-merchants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MerchantsFragment extends BaseDivContextMvvmFragment<h761, fr10, a> {
    private final a factoryOfViewModel;

    public MerchantsFragment(a aVar) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getViewBinding$lambda$1$lambda$0(MerchantsFragment merchantsFragment, Uri uri) {
        return ((a) merchantsFragment.getViewModel()).b0(uri);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public h761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        h761 o = h761.o(inflater, container);
        o.b.setActionHandler(new k200(22, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(fr10 viewState) {
        ((h761) getBinding()).d.setVisibility(viewState.c() ? 0 : 8);
        ((h761) getBinding()).c.render(viewState.b());
        ((h761) getBinding()).e.render(viewState.d());
        ((h761) getBinding()).b.setVisibility(viewState.a() != null ? 0 : 8);
        rr51 a = viewState.a();
        if (a != null) {
            YbDivView.setData$default(((h761) getBinding()).b, a, null, null, false, 14, null);
            ((h761) getBinding()).b.setVisibility(0);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel, reason: from getter */
    public a getFactoryOfViewModel() {
        return this.factoryOfViewModel;
    }
}
