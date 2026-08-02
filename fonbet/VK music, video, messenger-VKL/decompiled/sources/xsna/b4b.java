package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelMonetizationNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface b4b {

    /* compiled from: ChannelMonetizationNavigationEvent.kt */
    public static final class a implements b4b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1840344479;
        }

        public final String toString() {
            return "OnClickBack";
        }
    }

    /* compiled from: ChannelMonetizationNavigationEvent.kt */
    public static final class b implements b4b {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 612185627;
        }

        public final String toString() {
            return "OpenFaq";
        }
    }

    /* compiled from: ChannelMonetizationNavigationEvent.kt */
    public static final class c implements b4b {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenNonePayments(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ChannelMonetizationNavigationEvent.kt */
    public static final class d implements b4b {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenPayments(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ChannelMonetizationNavigationEvent.kt */
    public static final class e implements b4b {
        public final UserId a;

        public e(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenRegularSupport(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ChannelMonetizationNavigationEvent.kt */
    public static final class f implements b4b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1824027688;
        }

        public final String toString() {
            return "ShowOnePaymentDonutEnabledModalDialog";
        }
    }
}
