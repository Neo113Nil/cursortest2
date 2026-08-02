package xsna;

import com.vk.lists.AbstractPaginatedView;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;

/* compiled from: AppsCatalogFragment.kt */
/* loaded from: classes6.dex */
public final class je3 extends AbstractPaginatedView.i {
    public final /* synthetic */ AppsCatalogFragment a;

    public je3(AppsCatalogFragment appsCatalogFragment) {
        this.a = appsCatalogFragment;
    }

    @Override // com.vk.lists.AbstractPaginatedView.i
    public final void b() {
        int i = AppsCatalogFragment.W;
        AppsCatalogFragment appsCatalogFragment = this.a;
        mzp0 mzp0Var = appsCatalogFragment.J;
        if (mzp0Var != null) {
            mzp0Var.d(appsCatalogFragment.getView());
        }
    }
}
