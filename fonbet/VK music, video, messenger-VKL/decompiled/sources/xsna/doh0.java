package xsna;

import com.vk.dto.profile.Address;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: SearchCommunitiesOnMapDetailsPatch.kt */
/* loaded from: classes5.dex */
public interface doh0 extends xl50 {

    /* compiled from: SearchCommunitiesOnMapDetailsPatch.kt */
    public static final class a implements doh0 {
        public final ExtendedCommunityProfile b;
        public final Address c;
        public final LocationCoordinate d;

        public a(ExtendedCommunityProfile extendedCommunityProfile, Address address, LocationCoordinate locationCoordinate) {
            this.b = extendedCommunityProfile;
            this.c = address;
            this.d = locationCoordinate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Address address = this.c;
            int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
            LocationCoordinate locationCoordinate = this.d;
            return hashCode2 + (locationCoordinate != null ? locationCoordinate.hashCode() : 0);
        }

        public final String toString() {
            return "CommunityFetched(profile=" + this.b + ", address=" + this.c + ", location=" + this.d + ')';
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsPatch.kt */
    public static final class b implements doh0 {
        public final SubscribeStatus b;

        public b(SubscribeStatus subscribeStatus) {
            this.b = subscribeStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "JoinToGroupCompleted(joinedStatus=" + this.b + ')';
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsPatch.kt */
    public static final class c implements doh0 {
        public static final c b = new c();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsPatch.kt */
    public static final class d implements doh0 {
        public final SubscribeStatus b;

        public d(SubscribeStatus subscribeStatus) {
            this.b = subscribeStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SubscriptionStatusChanged(subscriptionStatus=" + this.b + ')';
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsPatch.kt */
    public static final class e implements doh0 {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UnreadMessagesCountFetched(count="), this.b, ')');
        }
    }
}
