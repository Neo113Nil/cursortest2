package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class o extends c0 implements e, f {
    public final String a;
    public final Uid b;
    public final SlothTheme c;

    public o(String str, Uid uid, SlothTheme slothTheme) {
        super(SlothMode.Bear);
        this.a = str;
        this.b = uid;
        this.c = slothTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jl40.l(this.a, oVar.a) && jl40.l(this.b, oVar.b) && this.c == oVar.c;
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
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bear(url=");
        uw51.y(sb, this.a, ", uid=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
