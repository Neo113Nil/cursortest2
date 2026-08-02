package xsna;

import com.vk.profile.community.core.communityleave.LeaveAction;

/* compiled from: CommunityLeaveState.kt */
/* loaded from: classes5.dex */
public final class r7h implements km50 {
    public final LeaveAction b;
    public final boolean c;

    public r7h() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7h)) {
            return false;
        }
        r7h r7hVar = (r7h) obj;
        return this.b == r7hVar.b && this.c == r7hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityLeaveState(selectedLeaveAction=");
        sb.append(this.b);
        sb.append(", hasPaymentCabinet=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public r7h(LeaveAction leaveAction, boolean z) {
        this.b = leaveAction;
        this.c = z;
    }

    public /* synthetic */ r7h(boolean z, int i) {
        this(LeaveAction.STAY_ADMIN, (i & 2) != 0 ? false : z);
    }
}
