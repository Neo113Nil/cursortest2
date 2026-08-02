package xsna;

import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pze implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ pze(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (DataRepositoryComponent) this.c.a(fpf0.a(DataRepositoryComponent.class));
            case 1:
                return ((ProductsMultipickerComponent) this.c.a(fpf0.a(ProductsMultipickerComponent.class))).a();
            case 2:
                return ((YandexAdFeatureComponent) this.c.a(fpf0.a(YandexAdFeatureComponent.class))).e5();
            default:
                return ((MarketComponent) this.c.a(fpf0.a(MarketComponent.class))).Ob();
        }
    }
}
