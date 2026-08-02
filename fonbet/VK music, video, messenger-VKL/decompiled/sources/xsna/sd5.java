package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;

/* compiled from: AuthorsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class sd5 extends ViewPager.m {
    public final /* synthetic */ AuthorsCatalogRootVh b;

    public sd5(AuthorsCatalogRootVh authorsCatalogRootVh) {
        this.b = authorsCatalogRootVh;
    }

    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        AuthorsCatalogRootVh authorsCatalogRootVh = this.b;
        if (i == 0) {
            authorsCatalogRootVh.m.b.e.b(new oon0("author_hide_unhide", null, false, false, 14), false);
        }
        UIBlockCatalog uIBlockCatalog = authorsCatalogRootVh.w.n;
        if (uIBlockCatalog == null) {
            return;
        }
        Object b0 = j5g.b0(i, uIBlockCatalog.A);
        UIBlockList uIBlockList = b0 instanceof UIBlockList ? (UIBlockList) b0 : null;
        if (uIBlockList == null) {
            return;
        }
        authorsCatalogRootVh.y.q = uIBlockList.b;
    }
}
