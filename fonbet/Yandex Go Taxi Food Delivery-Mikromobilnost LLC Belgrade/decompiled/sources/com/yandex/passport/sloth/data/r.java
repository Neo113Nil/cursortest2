package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class r extends c0 implements f {
    public final String a;
    public final Uid b;
    public final String c;

    public r(String str, Uid uid, String str2) {
        super(SlothMode.PayUrl);
        this.a = str;
        this.b = uid;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jl40.l(this.a, rVar.a) && jl40.l(this.b, rVar.b) && jl40.l(this.c, rVar.c);
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayUrl(url=");
        uw51.y(sb, this.a, ", uid=");
        sb.append(this.b);
        sb.append(", paySessionId=");
        return b64.p(sb, this.c, ')');
    }
}
