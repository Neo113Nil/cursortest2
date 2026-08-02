package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class v extends c0 implements e, f {
    public final Uid a;
    public final SlothTheme b;
    public final long c;

    public v(long j, Uid uid, SlothTheme slothTheme) {
        super(SlothMode.RegisterWebAuthN);
        this.a = uid;
        this.b = slothTheme;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return jl40.l(this.a, vVar.a) && this.b == vVar.b && this.c == vVar.c;
    }

    @Override // com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.b;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterWebAuthN(uid=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", locationId=");
        return b64.o(sb, this.c, ')');
    }
}
