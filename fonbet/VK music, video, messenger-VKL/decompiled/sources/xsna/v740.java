package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MultipleCoownershipSideEffect.kt */
/* loaded from: classes3.dex */
public abstract class v740 {

    /* compiled from: MultipleCoownershipSideEffect.kt */
    public static abstract class a extends v740 {

        /* compiled from: MultipleCoownershipSideEffect.kt */
        /* renamed from: xsna.v740$a$a, reason: collision with other inner class name */
        public static final class C3873a extends a {
            public final UserId a;

            public C3873a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3873a) && epx.f(this.a, ((C3873a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Approve(coownerId="), this.a, ')');
            }
        }

        /* compiled from: MultipleCoownershipSideEffect.kt */
        public static final class b extends a {
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
                return gp.b(new StringBuilder("Reject(coownerId="), this.a, ')');
            }
        }
    }

    /* compiled from: MultipleCoownershipSideEffect.kt */
    public static abstract class b extends v740 {

        /* compiled from: MultipleCoownershipSideEffect.kt */
        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1945890024;
            }

            public final String toString() {
                return "Close";
            }
        }
    }
}
