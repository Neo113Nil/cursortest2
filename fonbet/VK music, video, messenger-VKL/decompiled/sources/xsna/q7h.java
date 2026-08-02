package xsna;

import com.vk.profile.community.core.communityleave.LeaveAction;

/* compiled from: CommunityLeaveSideEffect.kt */
/* loaded from: classes5.dex */
public interface q7h {

    /* compiled from: CommunityLeaveSideEffect.kt */
    public static final class a implements q7h {
        public static final a a = new a();
    }

    /* compiled from: CommunityLeaveSideEffect.kt */
    public static final class b implements q7h {
        public final LeaveAction a;

        public b(LeaveAction leaveAction) {
            this.a = leaveAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SubmitResult(action=" + this.a + ')';
        }
    }
}
