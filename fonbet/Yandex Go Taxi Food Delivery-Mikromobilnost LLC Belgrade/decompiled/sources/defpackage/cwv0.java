package defpackage;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cwv0 {
    public final SuperAppDiscoveryMapOverlayState a;
    public final SuperAppDiscoveryMapOverlayState b;
    public final SuperAppDiscoveryMapOverlayState c;
    public final SuperAppDiscoveryMapOverlayState d;
    public final SuperAppDiscoveryMapOverlayState e;

    public cwv0(SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState, SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState2, SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState3, SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState4, SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState5) {
        this.a = superAppDiscoveryMapOverlayState;
        this.b = superAppDiscoveryMapOverlayState2;
        this.c = superAppDiscoveryMapOverlayState3;
        this.d = superAppDiscoveryMapOverlayState4;
        this.e = superAppDiscoveryMapOverlayState5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwv0)) {
            return false;
        }
        cwv0 cwv0Var = (cwv0) obj;
        return this.a == cwv0Var.a && this.b == cwv0Var.b && this.c == cwv0Var.c && this.d == cwv0Var.d && this.e == cwv0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SavedOverlayStates(places=" + this.a + ", transport=" + this.b + ", chargers=" + this.c + ", scooters=" + this.d + ", taxi=" + this.e + Extension.C_BRAKE;
    }
}
