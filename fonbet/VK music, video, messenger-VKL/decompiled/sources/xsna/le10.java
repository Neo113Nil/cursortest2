package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketTextWithTitleDto;
import com.vk.common.links.LinksParserData;
import com.vk.ecomm.shop_conditions.impl.ui.dovdialog.data.model.ConditionType;
import com.vk.toggle.features.SoccomFeatures;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarketShopConditionsRepository.kt */
/* loaded from: classes18.dex */
public final class le10 {
    public final yd10 a = new yd10();
    public final sdz b;
    public final boolean c;

    public le10(sdz sdzVar) {
        this.b = sdzVar;
        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
        soccomFeatures.getClass();
        this.c = com.vk.toggle.b.A.a(soccomFeatures);
    }

    public final jej0 a(MarketTextWithTitleDto marketTextWithTitleDto, ConditionType conditionType, sdz sdzVar) {
        Object obj;
        String str;
        Object obj2;
        String url;
        String title = marketTextWithTitleDto.getTitle();
        ucp ucpVar = ucp.a;
        CharSequence i = ucp.i(sdzVar.d(marketTextWithTitleDto.f(), new LinksParserData(58235, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)));
        String e = marketTextWithTitleDto.e();
        List<BaseImageDto> d = marketTextWithTitleDto.d();
        ely elyVar = null;
        if (d != null) {
            BaseImageDto baseImageDto = (BaseImageDto) j5g.a0(d);
            String url2 = baseImageDto != null ? baseImageDto.getUrl() : null;
            List<BaseImageDto> list = d;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.LIGHT) {
                    break;
                }
            }
            BaseImageDto baseImageDto2 = (BaseImageDto) obj;
            if (baseImageDto2 == null || (str = baseImageDto2.getUrl()) == null) {
                str = url2;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((BaseImageDto) obj2).d() == BaseImageDto.ThemeDto.DARK) {
                    break;
                }
            }
            BaseImageDto baseImageDto3 = (BaseImageDto) obj2;
            if (baseImageDto3 != null && (url = baseImageDto3.getUrl()) != null) {
                url2 = url;
            }
            ely elyVar2 = new ely(str, url2, null, null);
            if (this.c) {
                elyVar = elyVar2;
            }
        }
        return new jej0(conditionType, title, i, e, elyVar);
    }
}
