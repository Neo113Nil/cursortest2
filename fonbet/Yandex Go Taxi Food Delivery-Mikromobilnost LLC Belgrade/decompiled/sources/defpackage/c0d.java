package defpackage;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.SuperAppDiscoveryMapOverlayUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c0d {
    public final Object a;
    public final SuperAppDiscoveryMapOverlayState b;
    public final SuperAppDiscoveryMapOverlayUiState c;

    public c0d(Object obj, SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState, SuperAppDiscoveryMapOverlayUiState superAppDiscoveryMapOverlayUiState) {
        this.a = obj;
        this.b = superAppDiscoveryMapOverlayState;
        this.c = superAppDiscoveryMapOverlayUiState;
    }

    public static c0d a(c0d c0dVar, Object obj, SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState, SuperAppDiscoveryMapOverlayUiState superAppDiscoveryMapOverlayUiState, int i) {
        if ((i & 1) != 0) {
            obj = c0dVar.a;
        }
        if ((i & 2) != 0) {
            superAppDiscoveryMapOverlayState = c0dVar.b;
        }
        if ((i & 4) != 0) {
            superAppDiscoveryMapOverlayUiState = c0dVar.c;
        }
        c0dVar.getClass();
        return new c0d(obj, superAppDiscoveryMapOverlayState, superAppDiscoveryMapOverlayUiState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0d)) {
            return false;
        }
        c0d c0dVar = (c0d) obj;
        return jl40.l(this.a, c0dVar.a) && this.b == c0dVar.b && this.c == c0dVar.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ComplexMapOverlayState(payload=" + this.a + ", overlayState=" + this.b + ", overlayUiState=" + this.c + Extension.C_BRAKE;
    }
}
