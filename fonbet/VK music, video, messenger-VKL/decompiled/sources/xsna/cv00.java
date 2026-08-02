package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;

/* compiled from: MarketCatalogFilterDialogV2.kt */
/* loaded from: classes18.dex */
public final class cv00 implements w8i {
    public static final cv00 b = new cv00();

    public final void a(FragmentActivity fragmentActivity, MarketCatalogFilterVM marketCatalogFilterVM, qy00 qy00Var, jjx jjxVar, gb10 gb10Var) {
        eb10<?> T2 = ((MarketProductFilterComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketProductFilterComponent.class))).T2();
        if (T2 == null) {
            T2 = null;
        }
        if (T2 != null) {
            mcr<?> a = T2.a(fragmentActivity);
            a.a(new ry00(fragmentActivity, qy00Var, new s8(1, a, mcr.class, "updateFields", "updateFields(Ljava/util/List;)V", 0, 9), new ku1(16, marketCatalogFilterVM, jjxVar), gb10Var));
        }
    }
}
