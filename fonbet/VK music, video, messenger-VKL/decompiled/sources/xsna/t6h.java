package xsna;

import com.vk.profile.community.core.communityleave.LeaveAction;

/* compiled from: CommunityLeaveAction.kt */
/* loaded from: classes5.dex */
public interface t6h extends kj50 {

    /* compiled from: CommunityLeaveAction.kt */
    public static final class a implements t6h {
        public static final a b = new a();
    }

    /* compiled from: CommunityLeaveAction.kt */
    public static final class b implements t6h {
        public final LeaveAction b;

        public b(LeaveAction leaveAction) {
            this.b = leaveAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectLeaveAction(leaveAction=" + this.b + ')';
        }
    }

    /* compiled from: CommunityLeaveAction.kt */
    public static final class c implements t6h {
        public static final c b = new c();
    }
}
