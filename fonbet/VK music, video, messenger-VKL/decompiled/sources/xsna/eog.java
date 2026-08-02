package xsna;

import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.search.ui.api.SearchInputMethod;
import xsna.bcw0;

/* compiled from: CommunitiesCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class eog extends bcw0 {
    public final /* synthetic */ CommunitiesCatalogRootVh a;

    public eog(CommunitiesCatalogRootVh communitiesCatalogRootVh) {
        this.a = communitiesCatalogRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        String str = aVar.a;
        SearchInputMethod.a aVar2 = SearchInputMethod.Companion;
        icw0 icw0Var = aVar.b;
        aVar2.getClass();
        SearchInputMethod a = SearchInputMethod.a.a(icw0Var);
        CommunitiesCatalogRootVh communitiesCatalogRootVh = this.a;
        communitiesCatalogRootVh.getClass();
        if (str == null) {
            communitiesCatalogRootVh.i8(alj.a);
            return;
        }
        communitiesCatalogRootVh.i8(vyh0.a);
        communitiesCatalogRootVh.Q.b(str);
        CommunitiesCatalogRootVh.n0(communitiesCatalogRootVh, str, false, a, null, 22);
    }

    @Override // xsna.bcw0
    public final void b() {
    }
}
