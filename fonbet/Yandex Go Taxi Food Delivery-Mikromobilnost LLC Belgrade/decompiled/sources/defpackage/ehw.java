package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;

/* loaded from: classes14.dex */
public final class ehw {
    public final String a;
    public final IntercityDashboardSelectTariffSource b;

    public ehw(String str, IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource) {
        this.a = str;
        this.b = intercityDashboardSelectTariffSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehw)) {
            return false;
        }
        ehw ehwVar = (ehw) obj;
        return jl40.l(this.a, ehwVar.a) && this.b == ehwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
