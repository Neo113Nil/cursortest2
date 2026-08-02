package defpackage;

import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$ChangeSource$Mode;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;

/* loaded from: classes14.dex */
public final class d0y0 extends l0y0 {
    public final TaxiOrderDeeplink$ChangeSource$Mode d;
    public final c0y0 e;
    public final String f;

    public d0y0(String str, TaxiOrderDeeplink$ChangeSource$Mode taxiOrderDeeplink$ChangeSource$Mode, c0y0 c0y0Var, String str2, TaxiOrderDeeplink$PreferredScreenType taxiOrderDeeplink$PreferredScreenType, boolean z) {
        super(str, taxiOrderDeeplink$PreferredScreenType, z);
        this.d = taxiOrderDeeplink$ChangeSource$Mode;
        this.e = c0y0Var;
        this.f = str2;
    }

    public final TaxiOrderDeeplink$ChangeSource$Mode d() {
        return this.d;
    }

    public final c0y0 e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }
}
