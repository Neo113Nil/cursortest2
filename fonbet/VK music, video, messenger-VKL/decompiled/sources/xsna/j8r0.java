package xsna;

import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VKAppsCatalogCategoriesPresenter.kt */
/* loaded from: classes6.dex */
public final class j8r0 implements pka {
    public final g8r0 a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new h8r0(0, this, j8r0.class, "createCategoriesDataProvider", "createCategoriesDataProvider()Lcom/vk/lists/PaginationHelper$PagedDataProviderWithStartFrom;", 0));
    public com.vk.lists.c d;

    public j8r0(g8r0 g8r0Var) {
        this.a = g8r0Var;
    }

    @Override // xsna.pka
    public final void a(AppsCategory appsCategory, String str, Integer num) {
        this.a.a.mc(appsCategory.c, appsCategory.b);
    }

    public final io.reactivex.rxjava3.disposables.b c() {
        return this.b;
    }
}
