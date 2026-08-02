package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class j extends c0 implements e, f {
    public final String a;
    public final Uid b;
    public final SlothTheme c;
    public final boolean w;

    public j(String str, Uid uid, SlothTheme slothTheme, boolean z) {
        super(SlothMode.Upgrade);
        this.a = str;
        this.b = uid;
        this.c = slothTheme;
        this.w = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jl40.l(this.a, jVar.a) && jl40.l(this.b, jVar.b) && this.c == jVar.c && this.w == jVar.w;
    }

    @Override // com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.c;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + ((this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUpgrade(url=");
        uw51.y(sb, this.a, ", uid=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", isForce=");
        return unr0.u(sb, this.w, ')');
    }
}
