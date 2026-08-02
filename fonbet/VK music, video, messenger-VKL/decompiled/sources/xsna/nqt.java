package xsna;

import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.database.dto.DatabaseCityByIdDto;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: MarketGetAddressesRequest.kt */
/* loaded from: classes15.dex */
public final class nqt extends com.vk.api.request.rx.batch.a<List<? extends DatabaseCityByIdDto>, List<? extends BaseCountryDto>, mqt> {
    @Override // com.vk.api.request.rx.batch.a
    public final mqt K0(bv6<List<? extends DatabaseCityByIdDto>> bv6Var, bv6<List<? extends BaseCountryDto>> bv6Var2) {
        List<? extends DatabaseCityByIdDto> list = bv6Var.a;
        List<? extends BaseCountryDto> list2 = bv6Var2.a;
        List<? extends DatabaseCityByIdDto> list3 = list;
        int e = on00.e(c5g.u(list3, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (DatabaseCityByIdDto databaseCityByIdDto : list3) {
            Integer valueOf = Integer.valueOf(databaseCityByIdDto.getId());
            WebCity webCity = new WebCity();
            webCity.b = databaseCityByIdDto.getId();
            webCity.c = databaseCityByIdDto.getTitle();
            webCity.f = false;
            Pair pair = new Pair(valueOf, webCity);
            linkedHashMap.put(pair.i(), pair.j());
        }
        List<? extends BaseCountryDto> list4 = list2;
        int e2 = on00.e(c5g.u(list4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (BaseCountryDto baseCountryDto : list4) {
            Integer valueOf2 = Integer.valueOf(baseCountryDto.getId());
            WebCountry webCountry = new WebCountry();
            webCountry.b = baseCountryDto.getId();
            webCountry.c = baseCountryDto.getTitle();
            Pair pair2 = new Pair(valueOf2, webCountry);
            linkedHashMap2.put(pair2.i(), pair2.j());
        }
        return new mqt(linkedHashMap, linkedHashMap2, jgp.b);
    }
}
