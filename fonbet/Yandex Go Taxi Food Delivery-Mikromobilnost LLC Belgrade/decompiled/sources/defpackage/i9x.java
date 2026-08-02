package defpackage;

import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWall;

/* loaded from: classes15.dex */
public final class i9x {
    public final boolean a;
    public final GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo b;
    public final boolean c;

    public i9x(GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo joinWallChatInfo, int i) {
        boolean z = (i & 1) == 0;
        joinWallChatInfo = (i & 2) != 0 ? null : joinWallChatInfo;
        this.a = z;
        this.b = joinWallChatInfo;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9x)) {
            return false;
        }
        i9x i9xVar = (i9x) obj;
        return this.a == i9xVar.a && jl40.l(this.b, i9xVar.b) && this.c == i9xVar.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo joinWallChatInfo = this.b;
        return Boolean.hashCode(false) + unr0.e((hashCode + (joinWallChatInfo == null ? 0 : joinWallChatInfo.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinChatUiState(isCheckingAccess=");
        sb.append(this.a);
        sb.append(", chatInfo=");
        sb.append(this.b);
        sb.append(", isJoining=");
        return x4e.i(sb, this.c, ", isInvalidLink=false)");
    }

    public i9x() {
        this(null, 15);
    }
}
