package defpackage;

import com.yandex.go.design.compose.loading.b;
import com.yandex.go.scooters.zones.data.ScootersPolygonInfoApi;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentStatus;
import io.appmetrica.analytics.BuildConfig;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes3.dex */
public abstract class p2b1 {
    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1641397862);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            b.a(ljs0.e(ljs0.c(f530Var, 1.0f), 88.0f), cyk0.c(20.0f), false, yx91.a, null, null, true, btsVar, 12582912, BuildConfig.API_LEVEL);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 20);
        }
    }

    public static String b(n1a0 n1a0Var) {
        if (n1a0Var instanceof i1a0) {
            return ((i1a0) n1a0Var).a;
        }
        if (n1a0Var instanceof l1a0) {
            return ((l1a0) n1a0Var).a;
        }
        w511.b();
        return null;
    }

    public static ScootersPolygonInfoApi c(on2 on2Var) {
        on2Var.getClass();
        return (ScootersPolygonInfoApi) on2Var.a(GoApiName.TaxiV4, ScootersPolygonInfoApi.class);
    }

    public static AutoTopupPaymentStatus d(SettingStatus settingStatus) {
        int i = settingStatus == null ? -1 : o24.a[settingStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return AutoTopupPaymentStatus.ENABLED;
            }
            if (i != 2) {
                w511.b();
                return null;
            }
        }
        return AutoTopupPaymentStatus.DISABLED;
    }
}
