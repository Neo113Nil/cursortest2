package xsna;

import com.vk.dto.geo.GeoLocation;
import java.util.List;

/* compiled from: ClipsPlacesSearchGeolocationRequest.kt */
/* loaded from: classes17.dex */
public final class bqe {
    public final List<List<GeoLocation>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public bqe(List<? extends List<GeoLocation>> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqe) && epx.f(this.a, ((bqe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ClipsPlacesSearchGeolocationResult(places="), this.a);
    }
}
