package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes8.dex */
public final class o {
    public final Uid a;
    public final Uid b;

    static {
        int i = Uid.$stable;
    }

    public o(Uid uid, Uid uid2) {
        this.a = uid;
        this.b = uid2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jl40.l(this.a, oVar.a) && this.b.equals(oVar.b);
    }

    public final int hashCode() {
        Uid uid = this.a;
        return this.b.hashCode() + ((uid == null ? 0 : uid.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeData(uid=");
        sb.append(this.a);
        sb.append(", challengeUid=");
        return uw51.j(sb, this.b, ')');
    }
}
