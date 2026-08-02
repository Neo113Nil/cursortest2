package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;

/* compiled from: CatalogPresenterOnAttachStateChangeListener.kt */
/* loaded from: classes16.dex */
public final class dca extends n1a {
    public final CatalogBasePaginatedListVh b;
    public final tba<?> c;

    public dca(CatalogBasePaginatedListVh catalogBasePaginatedListVh, tba tbaVar) {
        this.b = catalogBasePaginatedListVh;
        this.c = tbaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tba<?> tbaVar = this.c;
        if (tbaVar.g()) {
            return;
        }
        tbaVar.b(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.d(this.b);
    }
}
