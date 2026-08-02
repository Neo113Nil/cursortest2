package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MultiAccountInfoUpdater.kt */
/* loaded from: classes6.dex */
public abstract class k240 {

    /* compiled from: MultiAccountInfoUpdater.kt */
    public static final class a extends k240 {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final UserId a() {
            return this.a;
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
            return gp.b(new StringBuilder("Account(userId="), this.a, ')');
        }
    }

    /* compiled from: MultiAccountInfoUpdater.kt */
    public static final class b extends k240 {
        public final UserId a;
        public final int b;

        public b(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final UserId b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Counter(userId=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: MultiAccountInfoUpdater.kt */
    public static final class c extends k240 {
        public static final c a;

        static {
            UserId.b bVar = UserId.c;
            a = new c();
        }
    }
}
