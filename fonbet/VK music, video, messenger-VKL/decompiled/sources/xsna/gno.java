package xsna;

import com.vk.api.generated.market.dto.MarketGroupForAttachDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import java.util.Iterator;
import java.util.List;

/* compiled from: DtoToMultipickerProductOwnerMapExt.kt */
/* loaded from: classes18.dex */
public final class gno {
    public static final MultipickerProduct.Owner a(UserId userId, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((MarketGroupForAttachDto) obj).g(), fkq0.a(userId))) {
                break;
            }
        }
        MarketGroupForAttachDto marketGroupForAttachDto = (MarketGroupForAttachDto) obj;
        if (marketGroupForAttachDto == null) {
            return null;
        }
        UserId g = marketGroupForAttachDto.g();
        String title = marketGroupForAttachDto.getTitle();
        Boolean j = marketGroupForAttachDto.j();
        return new MultipickerProduct.Owner(g, title, j != null ? j.booleanValue() : false);
    }
}
