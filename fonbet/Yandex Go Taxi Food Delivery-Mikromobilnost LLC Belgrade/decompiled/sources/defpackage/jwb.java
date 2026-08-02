package defpackage;

import com.yandex.go.copter.city_tour.api.CityToursApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes12.dex */
public interface jwb {
    static CityToursApi a(on2 on2Var) {
        on2Var.getClass();
        return (CityToursApi) on2Var.a(GoApiName.TaxiV4, CityToursApi.class);
    }
}
