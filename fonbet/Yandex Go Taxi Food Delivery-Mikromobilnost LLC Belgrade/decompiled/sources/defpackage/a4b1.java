package defpackage;

import android.app.Activity;
import com.yandex.go.scooters.promocodes.data.ScootersPromocodesApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes11.dex */
public abstract class a4b1 {
    public static o091 a(Activity activity) {
        cvw.l(activity);
        return new o091(activity, new h191());
    }

    public static ScootersPromocodesApi b(on2 on2Var) {
        on2Var.getClass();
        return (ScootersPromocodesApi) on2Var.a(GoApiName.TaxiV4, ScootersPromocodesApi.class);
    }
}
