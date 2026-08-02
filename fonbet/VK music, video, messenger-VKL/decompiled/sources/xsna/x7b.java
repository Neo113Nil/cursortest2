package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelPayoutNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface x7b {

    /* compiled from: ChannelPayoutNavigationEvent.kt */
    public static final class a implements x7b {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnClickChangePayout(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ChannelPayoutNavigationEvent.kt */
    public static final class b implements x7b {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1104800288;
        }

        public final String toString() {
            return "OnClickClose";
        }
    }

    /* compiled from: ChannelPayoutNavigationEvent.kt */
    public static final class c implements x7b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1087382437;
        }

        public final String toString() {
            return "OnClickMeWithoutVkPay";
        }
    }
}
