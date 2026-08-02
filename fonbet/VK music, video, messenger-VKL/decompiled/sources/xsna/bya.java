package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelDonutSupportNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface bya {

    /* compiled from: ChannelDonutSupportNavigationEvent.kt */
    public static final class a implements bya {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1754810337;
        }

        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ChannelDonutSupportNavigationEvent.kt */
    public static final class b implements bya {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenDonutPayment(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ChannelDonutSupportNavigationEvent.kt */
    public static final class c implements bya {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -128732620;
        }

        public final String toString() {
            return "OpenFaq";
        }
    }
}
