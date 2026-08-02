package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipCoauthorDecisionAction.kt */
/* loaded from: classes16.dex */
public interface fnc extends lj50 {

    /* compiled from: ClipCoauthorDecisionAction.kt */
    public static final class a implements fnc {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeRequest(isAcceptRequest="), this.b, ')');
        }
    }

    /* compiled from: ClipCoauthorDecisionAction.kt */
    public static final class b implements fnc {
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
            UserId userId = this.b;
            if (userId == null) {
                return 0;
            }
            return Long.hashCode(userId.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("DeleteClip(targetId="), this.b, ')');
        }
    }

    /* compiled from: ClipCoauthorDecisionAction.kt */
    public static final class c implements fnc {
        public static final c b = new c();
    }

    /* compiled from: ClipCoauthorDecisionAction.kt */
    public static final class d implements fnc {
        public final UserId b;

        public d(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SelectOwner(ownerId="), this.b, ')');
        }
    }
}
