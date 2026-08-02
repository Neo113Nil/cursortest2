package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.sharing.api.dto.Target;

/* compiled from: TargetSend.kt */
/* loaded from: classes5.dex */
public final class a4o0 {
    public final UserId a;
    public final boolean b;
    public final boolean c;

    public a4o0(boolean z, UserId userId, boolean z2) {
        this.a = userId;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4o0)) {
            return false;
        }
        a4o0 a4o0Var = (a4o0) obj;
        return epx.f(this.a, a4o0Var.a) && this.b == a4o0Var.b && this.c == a4o0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetSend(targetId=");
        sb.append(this.a);
        sb.append(", isUser=");
        sb.append(this.b);
        sb.append(", isGroup=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public a4o0(Target target) {
        this(target.k, target.c, target.l);
    }
}
