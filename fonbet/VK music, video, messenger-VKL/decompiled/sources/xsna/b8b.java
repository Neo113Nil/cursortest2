package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ChannelPayoutPatch.kt */
/* loaded from: classes16.dex */
public interface b8b extends xl50 {

    /* compiled from: ChannelPayoutPatch.kt */
    public static final class a implements b8b {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Bankcard(maskedPan="), this.b, ')');
        }
    }

    /* compiled from: ChannelPayoutPatch.kt */
    public static final class b implements b8b {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ChangeVkPayRecipient(user="), this.b, ')');
        }
    }

    /* compiled from: ChannelPayoutPatch.kt */
    public static final class c implements b8b {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -821358219;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ChannelPayoutPatch.kt */
    public static final class d implements b8b {
        public final List<h8b> b;
        public final UserId c;
        public final boolean d;
        public final h8b e;

        public d(List<h8b> list, UserId userId, boolean z, h8b h8bVar) {
            this.b = list;
            this.c = userId;
            this.d = z;
            this.e = h8bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d);
        }

        public final String toString() {
            return "VkPay(userList=" + this.b + ", startingVkPayRecipient=" + this.c + ", isMeWithoutVkPay=" + this.d + ", me=" + this.e + ')';
        }
    }
}
