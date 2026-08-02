package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class y extends c0 implements e {
    public final Uid a;
    public final Uid b;
    public final long c;
    public final boolean w;
    public final SlothTheme x;

    public y(Uid uid, Uid uid2, long j, boolean z, SlothTheme slothTheme) {
        super(SlothMode.SwitchMasterMember);
        this.a = uid;
        this.b = uid2;
        this.c = j;
        this.w = z;
        this.x = slothTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return jl40.l(this.a, yVar.a) && jl40.l(this.b, yVar.b) && this.c == yVar.c && this.w == yVar.w && this.x == yVar.x;
    }

    @Override // com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.x;
    }

    public final int hashCode() {
        return this.x.hashCode() + unr0.e(qv10.c(uw51.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.w);
    }

    public final String toString() {
        return "SwitchMasterMember(initialUid=" + this.a + ", targetUid=" + this.b + ", locationId=" + this.c + ", isUpdateTokenRequired=" + this.w + ", theme=" + this.x + ')';
    }
}
