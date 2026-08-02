package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class u6c implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ List d;

    public /* synthetic */ u6c(int i, List list, izs izsVar) {
        this.b = i;
        this.d = list;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                ksy ksyVar = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(ksyVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    b7c b7cVar = (b7c) ((ArrayList) this.d).get(intValue);
                    aVar.K(-193855765);
                    float f = VersionConstants.PRODUCT_MAJOR_VERSION;
                    xw80 xw80Var = b7cVar.c;
                    boolean z = b7cVar.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1563744128, 0, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.getConfig (CheckoutOrderList.kt:55)");
                    }
                    String str = xw80Var.b;
                    String valueOf = String.valueOf(xw80Var.a);
                    MarketProductTileConfig.ViewerType viewerType = MarketProductTileConfig.ViewerType.Bayer;
                    MarketProductTileConfig.ProductStatusType productStatusType = MarketProductTileConfig.ProductStatusType.Normal;
                    k6d0 k6d0Var = xw80Var.d;
                    ArrayList arrayList = null;
                    MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(k6d0Var.c, k6d0Var.b, (String) null);
                    Image image = xw80Var.f.a;
                    List singletonList = image != null ? Collections.singletonList(image) : null;
                    MarketProductTileConfig.h.b bVar = new MarketProductTileConfig.h.b(d370.O(R.string.ecomm_checkout_product_amount, new Object[]{Integer.valueOf(xw80Var.e)}, aVar));
                    if (z) {
                        List<jrd0> list = xw80Var.g;
                        arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jrd0) it.next()).b);
                        }
                    }
                    MarketProductTileConfig marketProductTileConfig = new MarketProductTileConfig(valueOf, viewerType, productStatusType, null, singletonList, bVar, false, eVar, str, null, null, null, null, null, arrayList, 64664);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pco pcoVar = new pco(f);
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar) | aVar.y(b7cVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new s6c(izsVar, b7cVar);
                        aVar.R(x);
                    }
                    com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, null, pcoVar, (izs) x, null, null, aVar, 384, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                cry cryVar = (cry) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar2.J(cryVar) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1117249557, i2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    hpd0 hpd0Var = (hpd0) ((wow) this.d).b.get(intValue3);
                    aVar2.K(-2145288464);
                    ojj.d(this.c, hpd0Var, null, aVar2, 0);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
