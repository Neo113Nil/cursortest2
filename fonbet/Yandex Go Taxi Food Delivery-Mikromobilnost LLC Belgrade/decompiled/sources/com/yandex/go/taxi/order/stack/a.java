package com.yandex.go.taxi.order.stack;

import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.details.common.TaxiCardAppearanceMode;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.jl40;
import defpackage.o2y0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a {
    public final TaxiCardAppearanceMode a;
    public final o2y0 b;
    public final OrderScreen c;
    public final OrderStackMvpView.AnimationType d;
    public final TaxiCardNavigationAction e;

    public a(TaxiCardAppearanceMode taxiCardAppearanceMode, o2y0 o2y0Var, OrderScreen orderScreen, OrderStackMvpView.AnimationType animationType, TaxiCardNavigationAction taxiCardNavigationAction) {
        this.a = taxiCardAppearanceMode;
        this.b = o2y0Var;
        this.c = orderScreen;
        this.d = animationType;
        this.e = taxiCardNavigationAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && jl40.l(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        OrderScreen orderScreen = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (orderScreen == null ? 0 : orderScreen.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "DetailsNavigationPayload(appearanceMode=" + this.a + ", orderHolder=" + this.b + ", prevState=" + this.c + ", animationType=" + this.d + ", taxiCardNavigationAction=" + this.e + Extension.C_BRAKE;
    }
}
