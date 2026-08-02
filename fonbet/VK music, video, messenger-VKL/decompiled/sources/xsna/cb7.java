package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: BirthdaysListSideEffect.kt */
/* loaded from: classes15.dex */
public interface cb7 {

    /* compiled from: BirthdaysListSideEffect.kt */
    public interface a extends cb7 {

        /* compiled from: BirthdaysListSideEffect.kt */
        /* renamed from: xsna.cb7$a$a, reason: collision with other inner class name */
        public static final class C2654a implements a {
            public final UserId a;

            public C2654a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2654a) && epx.f(this.a, ((C2654a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenProfile(userId="), this.a, ')');
            }
        }

        /* compiled from: BirthdaysListSideEffect.kt */
        public static final class b implements a {
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
                return gp.b(new StringBuilder("OpenWishlist(userId="), this.a, ')');
            }
        }

        /* compiled from: BirthdaysListSideEffect.kt */
        public static final class c implements a {
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
                return gp.b(new StringBuilder("SendGift(userId="), this.a, ')');
            }
        }

        /* compiled from: BirthdaysListSideEffect.kt */
        public static final class d implements a {
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
                return gp.b(new StringBuilder("SendMessage(userId="), this.a, ')');
            }
        }

        /* compiled from: BirthdaysListSideEffect.kt */
        public static final class e implements a {
            public final UserId a;
            public final String b;

            public e(UserId userId, String str) {
                this.a = userId;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SendScheduledGift(userId=");
                sb.append(this.a);
                sb.append(", scheduledDate=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }
}
