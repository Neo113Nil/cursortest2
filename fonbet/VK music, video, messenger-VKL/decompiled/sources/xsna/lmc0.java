package xsna;

import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class lmc0 implements fmc0.j {
    public final NearbyPlaces a;

    public lmc0(NearbyPlaces nearbyPlaces) {
        this.a = nearbyPlaces;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmc0) && epx.f(this.a, ((lmc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPlacePicker(nearbyPlaces=" + this.a + ')';
    }
}
