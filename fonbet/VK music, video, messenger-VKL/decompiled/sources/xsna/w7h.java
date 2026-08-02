package xsna;

import com.vk.dto.user.deactivation.Deactivation;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityLegoRestrictedPlaceholderItemModel.kt */
/* loaded from: classes5.dex */
public interface w7h {

    /* compiled from: CommunityLegoRestrictedPlaceholderItemModel.kt */
    public static final class a implements w7h {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1252035265;
        }

        public final String toString() {
            return "Closed";
        }
    }

    /* compiled from: CommunityLegoRestrictedPlaceholderItemModel.kt */
    public static final class b implements w7h {
        public final Deactivation a;

        public b(Deactivation deactivation) {
            this.a = deactivation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Deactivation deactivation = this.a;
            if (deactivation == null) {
                return 0;
            }
            return deactivation.hashCode();
        }

        public final String toString() {
            return "Deactivated(ownerState=" + this.a + ')';
        }
    }

    /* compiled from: CommunityLegoRestrictedPlaceholderItemModel.kt */
    public static final class c implements w7h {
        public final ExtendedUserProfile.e a;

        public c(ExtendedUserProfile.e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PermanentUserBlacklist(ban=" + this.a + ')';
        }
    }

    /* compiled from: CommunityLegoRestrictedPlaceholderItemModel.kt */
    public static final class d implements w7h {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1022646578;
        }

        public final String toString() {
            return "Private";
        }
    }
}
