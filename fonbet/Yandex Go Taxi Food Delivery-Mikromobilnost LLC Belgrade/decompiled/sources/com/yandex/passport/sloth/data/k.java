package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class k extends c0 implements e, f {
    public final String a;
    public final Uid b;
    public final SlothTheme c;

    public k(String str, Uid uid, SlothTheme slothTheme) {
        super(SlothMode.AuthQr);
        this.a = str;
        this.b = uid;
        this.c = slothTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jl40.l(this.a, kVar.a) && jl40.l(this.b, kVar.b) && this.c == kVar.c;
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
        StringBuilder sb = new StringBuilder("AuthQr(url=");
        uw51.y(sb, this.a, ", uid=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
