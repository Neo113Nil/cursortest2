package xsna;

import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.core.serialize.Serializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class u8a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ u8a(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                Serializer.c<CatalogMarketCategory> cVar = CatalogMarketCategory.CREATOR;
                return ((CatalogMarketCategory) obj).zb(i2);
            case 1:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, this.c, null, 0, -1, 2064383);
            default:
                tso.n((tgi0) obj, i2);
                return s3q0.a;
        }
    }
}
