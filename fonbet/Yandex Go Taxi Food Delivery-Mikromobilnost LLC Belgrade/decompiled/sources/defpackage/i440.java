package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.map.WalkingRouteUiState;

/* loaded from: classes6.dex */
public final class i440 {
    public final WalkingRouteUiState a;
    public final String b;

    public i440(WalkingRouteUiState walkingRouteUiState, String str) {
        this.a = walkingRouteUiState;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i440)) {
            return false;
        }
        i440 i440Var = (i440) obj;
        return this.a.equals(i440Var.a) && jl40.l(this.b, i440Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtStopWalkRoute(uiState=" + this.a + ", time=" + this.b + Extension.C_BRAKE;
    }
}
