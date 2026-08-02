package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SharingTaskId.kt */
/* loaded from: classes5.dex */
public final class icj0 {
    public final UserId a;
    public final boolean b;
    public final boolean c;

    public icj0(boolean z, UserId userId, boolean z2) {
        this.a = userId;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icj0)) {
            return false;
        }
        icj0 icj0Var = (icj0) obj;
        return epx.f(this.a, icj0Var.a) && this.b == icj0Var.b && this.c == icj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingTaskId(targetId=");
        sb.append(this.a);
        sb.append(", isUserTarget=");
        sb.append(this.b);
        sb.append(", isGroupTarget=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
