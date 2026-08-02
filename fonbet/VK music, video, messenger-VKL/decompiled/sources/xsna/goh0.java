package xsna;

import com.vk.dto.profile.Address;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: SearchCommunitiesOnMapDetailsState.kt */
/* loaded from: classes5.dex */
public interface goh0 extends km50 {

    /* compiled from: SearchCommunitiesOnMapDetailsState.kt */
    public static final class a implements goh0 {
        public final ExtendedCommunityProfile b;
        public final Address c;
        public final LocationCoordinate d;
        public final boolean e;

        public a(ExtendedCommunityProfile extendedCommunityProfile, Address address, LocationCoordinate locationCoordinate, boolean z) {
            this.b = extendedCommunityProfile;
            this.c = address;
            this.d = locationCoordinate;
            this.e = z;
        }

        public static a a(a aVar, ExtendedCommunityProfile extendedCommunityProfile, Address address, LocationCoordinate locationCoordinate, boolean z, int i) {
            if ((i & 1) != 0) {
                extendedCommunityProfile = aVar.b;
            }
            if ((i & 2) != 0) {
                address = aVar.c;
            }
            if ((i & 4) != 0) {
                locationCoordinate = aVar.d;
            }
            if ((i & 8) != 0) {
                z = aVar.e;
            }
            return new a(extendedCommunityProfile, address, locationCoordinate, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Address address = this.c;
            int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
            LocationCoordinate locationCoordinate = this.d;
            return Boolean.hashCode(this.e) + ((hashCode2 + (locationCoordinate != null ? locationCoordinate.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Details(communityProfile=");
            sb.append(this.b);
            sb.append(", address=");
            sb.append(this.c);
            sb.append(", location=");
            sb.append(this.d);
            sb.append(", isJoining=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsState.kt */
    public static final class b implements goh0 {
        public static final b b = new b();
    }
}
