package xsna;

import java.util.UUID;

/* compiled from: CommunityProfileLinksAction.kt */
/* loaded from: classes3.dex */
public interface iqh extends lj50 {

    /* compiled from: CommunityProfileLinksAction.kt */
    public static final class a implements iqh {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -748293739;
        }

        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: CommunityProfileLinksAction.kt */
    public static final class b implements iqh {
        public final UUID b;

        public b(UUID uuid) {
            this.b = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnLinkItemClick(uid=" + this.b + ')';
        }
    }
}
