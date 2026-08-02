package defpackage;

import com.yandex.go.taxi.order.details.common.TaxiCardAppearanceMode;

/* loaded from: classes14.dex */
public final class ack0 implements cck0 {
    public static final ack0 a = new ack0();
    public static final TaxiCardAppearanceMode b = TaxiCardAppearanceMode.RIDE_CARD;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ack0);
    }

    @Override // defpackage.cck0
    public final TaxiCardAppearanceMode getMode() {
        return b;
    }

    public final int hashCode() {
        return 220670798;
    }

    public final String toString() {
        return "Available";
    }
}
