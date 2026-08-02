package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import xsna.ify;

/* compiled from: MarketCatalogFilterDialogV2.kt */
/* loaded from: classes18.dex */
public final class bv00 implements ify.a {
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ MarketCatalogFilterVM c;
    public final /* synthetic */ qy00 d;
    public final /* synthetic */ jjx e;
    public final /* synthetic */ gb10 f;

    public bv00(FragmentActivity fragmentActivity, MarketCatalogFilterVM marketCatalogFilterVM, qy00 qy00Var, jjx jjxVar, gb10 gb10Var) {
        this.b = fragmentActivity;
        this.c = marketCatalogFilterVM;
        this.d = qy00Var;
        this.e = jjxVar;
        this.f = gb10Var;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        int i = ify.a;
        ify.g(this);
        cv00.b.a(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}
