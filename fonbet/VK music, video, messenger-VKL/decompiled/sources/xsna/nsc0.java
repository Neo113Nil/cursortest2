package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PostponedPostsMviState.kt */
/* loaded from: classes4.dex */
public final class nsc0 implements tw60<nsc0> {
    public final UserId b;
    public final ur60 c;

    public nsc0(UserId userId, ur60 ur60Var) {
        this.b = userId;
        this.c = ur60Var;
    }

    @Override // xsna.tw60
    public final nsc0 b(ur60 ur60Var) {
        return new nsc0(this.b, ur60Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsc0)) {
            return false;
        }
        nsc0 nsc0Var = (nsc0) obj;
        return epx.f(this.b, nsc0Var.b) && epx.f(this.c, nsc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.c;
    }

    public final String toString() {
        return "PostponedPostsMviState(ownerId=" + this.b + ", listState=" + this.c + ')';
    }
}
