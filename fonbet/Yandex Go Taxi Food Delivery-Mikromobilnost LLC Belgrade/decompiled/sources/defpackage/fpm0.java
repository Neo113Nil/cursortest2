package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.data.model.CreateOffersV1Params;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;
import ru.yandex.taxi.scooters.data.model.ScootersCard;

/* loaded from: classes13.dex */
public final class fpm0 {
    public static CreateOffersV1Params a(String str, zzs zzsVar, m6a0 m6a0Var, List list, CreateOfferType createOfferType, d5p0 d5p0Var, ScootersInsuranceType scootersInsuranceType, String str2, boolean z) {
        zzs zzsVar2;
        CreateOfferType createOfferType2;
        int i;
        String str3 = null;
        if (d5p0Var instanceof c5p0) {
            CreateOfferType createOfferType3 = createOfferType == null ? CreateOfferType.TO_DESTINATION_OFFER : createOfferType;
            zzsVar2 = ((c5p0) d5p0Var).a;
            createOfferType2 = createOfferType3;
        } else {
            zzsVar2 = null;
            createOfferType2 = null;
        }
        List f = r3b1.f(m6a0Var);
        List<r7p0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (r7p0 r7p0Var : list2) {
            arrayList.add(new CreateOffersV1Params.Vehicle(r7p0Var.a, r7p0Var.b.k()));
        }
        if (!f.isEmpty() && (i = ftn0.a[scootersInsuranceType.ordinal()]) != 1) {
            if (i == 2) {
                str3 = "standart";
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                str3 = "full";
            }
        }
        return new CreateOffersV1Params(arrayList, zzsVar, zzsVar2, f, str3, createOfferType2, ScootersCard.V2, str, str2, z);
    }
}
