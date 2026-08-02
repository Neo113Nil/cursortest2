package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SuggestedPostsMviState.kt */
/* loaded from: classes4.dex */
public final class v4n0 implements tw60<v4n0> {
    public final UserId b;
    public final ur60 c;

    public v4n0(UserId userId, ur60 ur60Var) {
        this.b = userId;
        this.c = ur60Var;
    }

    @Override // xsna.tw60
    public final v4n0 b(ur60 ur60Var) {
        return new v4n0(this.b, ur60Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4n0)) {
            return false;
        }
        v4n0 v4n0Var = (v4n0) obj;
        return epx.f(this.b, v4n0Var.b) && epx.f(this.c, v4n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.c;
    }

    public final String toString() {
        return "SuggestedPostsMviState(ownerId=" + this.b + ", listState=" + this.c + ')';
    }
}
