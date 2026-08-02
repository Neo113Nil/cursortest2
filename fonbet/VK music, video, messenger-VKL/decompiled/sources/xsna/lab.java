package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ChannelReactionQuantitySelectorNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface lab {

    /* compiled from: ChannelReactionQuantitySelectorNavigationEvent.kt */
    public static final class a implements lab {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -217887957;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorNavigationEvent.kt */
    public static final class b implements lab {
        public final String a;
        public final UserId b;
        public final int c;
        public final int d;
        public final int e;

        public b(UserId userId, int i, String str, int i2, int i3) {
            this.a = str;
            this.b = userId;
            this.c = i;
            this.d = i2;
            this.e = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPaymentForReaction(link=");
            sb.append(this.a);
            sb.append(", channelId=");
            sb.append(this.b);
            sb.append(", cmid=");
            sb.append(this.c);
            sb.append(", count=");
            sb.append(this.d);
            sb.append(", userCountBeforePayment=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorNavigationEvent.kt */
    public static final class c implements lab {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1058236672;
        }

        public final String toString() {
            return "OpenTermsOfUse";
        }
    }
}
