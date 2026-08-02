package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: UsersEvent.kt */
/* loaded from: classes5.dex */
public abstract class y0r0 {
    public final UserId a;

    /* compiled from: UsersEvent.kt */
    public static final class a extends y0r0 {
        public final UserId b;

        public a(UserId userId) {
            super(userId);
            this.b = userId;
        }

        @Override // xsna.y0r0
        public final UserId a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Banned(userId="), this.b, ')');
        }
    }

    /* compiled from: UsersEvent.kt */
    public static final class b extends y0r0 {
        public final UserId b;

        public b(UserId userId) {
            super(userId);
            this.b = userId;
        }

        @Override // xsna.y0r0
        public final UserId a() {
            return this.b;
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
            return gp.b(new StringBuilder("Unbanned(userId="), this.b, ')');
        }
    }

    public y0r0(UserId userId) {
        this.a = userId;
    }

    public UserId a() {
        return this.a;
    }
}
