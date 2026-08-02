package xsna;

import com.vk.profile.community.core.communityleave.LeaveAction;

/* compiled from: CommunityLeavePatch.kt */
/* loaded from: classes5.dex */
public interface m7h extends xl50 {

    /* compiled from: CommunityLeavePatch.kt */
    public static final class a implements m7h {
        public final LeaveAction b;

        public a(LeaveAction leaveAction) {
            this.b = leaveAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeLeaveAction(leaveAction=" + this.b + ')';
        }
    }
}
