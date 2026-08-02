package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoClickAction.kt */
/* loaded from: classes3.dex */
public final class qws0 extends dbs0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final UserId d;

    public qws0() {
        this(15, null, false);
    }

    public static qws0 a(qws0 qws0Var, boolean z) {
        boolean z2 = qws0Var.a;
        boolean z3 = qws0Var.c;
        UserId userId = qws0Var.d;
        qws0Var.getClass();
        return new qws0(userId, z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qws0)) {
            return false;
        }
        qws0 qws0Var = (qws0) obj;
        return this.a == qws0Var.a && this.b == qws0Var.b && this.c == qws0Var.c && epx.f(this.d, qws0Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d.b) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMoreAction(isForMediaViewer=");
        sb.append(this.a);
        sb.append(", fromFullscreen=");
        sb.append(this.b);
        sb.append(", isSharingEnabled=");
        sb.append(this.c);
        sb.append(", currentUserId=");
        return gp.b(sb, this.d, ')');
    }

    public qws0(UserId userId, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = userId;
    }

    public /* synthetic */ qws0(int i, UserId userId, boolean z) {
        this((i & 8) != 0 ? o25.a().c() : userId, (i & 1) == 0, (i & 2) == 0, (i & 4) != 0 ? true : z);
    }
}
