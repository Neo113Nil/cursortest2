package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoProfileMeta.kt */
/* loaded from: classes6.dex */
public final class h8t0 {
    public final UserId a;
    public final boolean b;
    public final boolean c;

    public h8t0(boolean z, UserId userId, boolean z2) {
        this.a = userId;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8t0)) {
            return false;
        }
        h8t0 h8t0Var = (h8t0) obj;
        return epx.f(this.a, h8t0Var.a) && this.b == h8t0Var.b && this.c == h8t0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileMeta(id=");
        sb.append(this.a);
        sb.append(", isClosed=");
        sb.append(this.b);
        sb.append(", isOwn=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
