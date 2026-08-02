package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a0 extends c0 implements e, f {
    public final SlothTheme a;
    public final Map b;
    public final Uid c;
    public final Long w;

    public a0(SlothTheme slothTheme, Map map, Uid uid, Long l) {
        super(SlothMode.UserMenu);
        this.a = slothTheme;
        this.b = map;
        this.c = uid;
        this.w = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && jl40.l(this.b, a0Var.b) && jl40.l(this.c, a0Var.c) && jl40.l(this.w, a0Var.w);
    }

    @Override // com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.a;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.c;
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        Uid uid = this.c;
        int hashCode = (d + (uid == null ? 0 : uid.hashCode())) * 31;
        Long l = this.w;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserMenu(theme=");
        sb.append(this.a);
        sb.append(", customWebParams=");
        sb.append(this.b);
        sb.append(", uid=");
        sb.append(this.c);
        sb.append(", locationId=");
        return qv10.q(sb, this.w, ')');
    }
}
