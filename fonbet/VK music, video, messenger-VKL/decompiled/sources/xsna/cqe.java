package xsna;

import com.vk.dto.geo.GeoLocation;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ClipsPlacesSearchGeolocationRequest.kt */
/* loaded from: classes16.dex */
public final class cqe {
    public final List<List<GeoLocation>> a;

    public cqe(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqe) && epx.f(this.a, ((cqe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ClipsPlacesSearchGeolocationResult(places="), this.a);
    }
}
