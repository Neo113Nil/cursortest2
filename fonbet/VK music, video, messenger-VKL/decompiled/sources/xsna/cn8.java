package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ cn8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                dn8 dn8Var = (dn8) this.c;
                return new is4((csp) this.d, (lzf) this.e, (el4) this.f, (d80) this.g, dn8Var.b, dn8Var.a, dn8Var.c.d);
            default:
                SearchContentVh searchContentVh = (SearchContentVh) this.c;
                SearchContentVh.b bVar = (SearchContentVh.b) this.d;
                e9h e9hVar = (e9h) this.e;
                ViewGroup viewGroup = (ViewGroup) this.f;
                Bundle bundle = (Bundle) this.g;
                FiltersWithSearchResultVh filtersWithSearchResultVh = new FiltersWithSearchResultVh(searchContentVh.b, new bpn0(com.vk.catalog2.common.ui.holders.search.c.b), searchContentVh.e, searchContentVh.f, true);
                View k5 = filtersWithSearchResultVh.k5(LayoutInflater.from(e9hVar.c), viewGroup, bundle);
                viewGroup.addView(k5);
                bVar.a = k5;
                return filtersWithSearchResultVh;
        }
    }
}
