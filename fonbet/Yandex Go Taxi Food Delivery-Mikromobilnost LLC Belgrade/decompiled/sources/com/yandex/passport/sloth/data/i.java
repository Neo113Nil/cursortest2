package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes2.dex */
public final class i extends c0 implements e, f {
    public final Uid a;
    public final long b;
    public final SlothTheme c;

    public i(long j, Uid uid, SlothTheme slothTheme) {
        super(SlothMode.AccountDeleteForever);
        this.a = uid;
        this.b = j;
        this.c = slothTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jl40.l(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
    }

    @Override // com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.c;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AccountDeleteForever(uid=" + this.a + ", locationId=" + this.b + ", theme=" + this.c + ')';
    }
}
