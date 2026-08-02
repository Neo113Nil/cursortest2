package defpackage;

import ru.yandex.taxi.net.taxi.NearestDriversApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes12.dex */
public interface ck50 {
    static NearestDriversApi a(on2 on2Var) {
        on2Var.getClass();
        return (NearestDriversApi) on2Var.a(GoApiName.TaxiV3, NearestDriversApi.class);
    }
}
