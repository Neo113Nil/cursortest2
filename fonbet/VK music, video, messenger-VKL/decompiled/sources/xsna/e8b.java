package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ChannelPayoutState.kt */
/* loaded from: classes16.dex */
public interface e8b extends km50 {

    /* compiled from: ChannelPayoutState.kt */
    public static final class a implements e8b {
        public final InterfaceC2785a b;

        /* compiled from: ChannelPayoutState.kt */
        /* renamed from: xsna.e8b$a$a, reason: collision with other inner class name */
        public interface InterfaceC2785a {

            /* compiled from: ChannelPayoutState.kt */
            /* renamed from: xsna.e8b$a$a$a, reason: collision with other inner class name */
            public static final class C2786a implements InterfaceC2785a {
                public final String a;

                public C2786a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2786a) && epx.f(this.a, ((C2786a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Bankcard(maskedPan="), this.a, ')');
                }
            }

            /* compiled from: ChannelPayoutState.kt */
            /* renamed from: xsna.e8b$a$a$b */
            public static final class b implements InterfaceC2785a {
                public final List<h8b> a;
                public final UserId b;
                public final UserId c;
                public final boolean d;
                public final h8b e;

                public b(List<h8b> list, UserId userId, UserId userId2, boolean z, h8b h8bVar) {
                    this.a = list;
                    this.b = userId;
                    this.c = userId2;
                    this.d = z;
                    this.e = h8bVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
                }

                public final int hashCode() {
                    return this.e.hashCode() + qoy.b(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c.b), 31, this.d);
                }

                public final String toString() {
                    return "VkPay(userList=" + this.a + ", startingVkPayRecipient=" + this.b + ", currentVkPayRecipient=" + this.c + ", isMeWithoutVkPay=" + this.d + ", me=" + this.e + ')';
                }
            }
        }

        public a(InterfaceC2785a interfaceC2785a) {
            this.b = interfaceC2785a;
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
            return "Content(payoutType=" + this.b + ')';
        }
    }

    /* compiled from: ChannelPayoutState.kt */
    public static final class b implements e8b {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 207714934;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
