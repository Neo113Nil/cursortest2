package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel$RestrictionMode;
import com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel$Theme;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class dy50 {
    public static final cy50 Companion = new cy50();
    public static final i3y[] d;
    public final NetworkPlaquePayloadRequestModel$Theme a;
    public final nw50 b;
    public final NetworkPlaquePayloadRequestModel$RestrictionMode c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new ew50(7)), null, a.b(lazyThreadSafetyMode, new ew50(8))};
    }

    public /* synthetic */ dy50(int i, NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme, nw50 nw50Var, NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, by50.a.getDescriptor());
            throw null;
        }
        this.a = networkPlaquePayloadRequestModel$Theme;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = nw50Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = networkPlaquePayloadRequestModel$RestrictionMode;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy50)) {
            return false;
        }
        dy50 dy50Var = (dy50) obj;
        return this.a == dy50Var.a && jl40.l(this.b, dy50Var.b) && this.c == dy50Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nw50 nw50Var = this.b;
        int hashCode2 = (hashCode + (nw50Var == null ? 0 : nw50Var.hashCode())) * 31;
        NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode = this.c;
        return hashCode2 + (networkPlaquePayloadRequestModel$RestrictionMode != null ? networkPlaquePayloadRequestModel$RestrictionMode.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkPlaquePayloadRequestModel(theme=" + this.a + ", location=" + this.b + ", restrictionMode=" + this.c + ')';
    }

    public dy50(NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme, nw50 nw50Var, NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode) {
        this.a = networkPlaquePayloadRequestModel$Theme;
        this.b = nw50Var;
        this.c = networkPlaquePayloadRequestModel$RestrictionMode;
    }
}
