package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class q extends c0 implements e, f {
    public final Uid a;
    public final long b;
    public final SlothTheme c;
    public final String w;
    public final String x;

    public q(Uid uid, long j, SlothTheme slothTheme, String str, String str2) {
        super(SlothMode.ManagingPlusDevices);
        this.a = uid;
        this.b = j;
        this.c = slothTheme;
        this.w = str;
        this.x = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jl40.l(this.a, qVar.a) && this.b == qVar.b && this.c == qVar.c && jl40.l(this.w, qVar.w) && jl40.l(this.x, qVar.x);
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
        return this.x.hashCode() + unr0.b((this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevices(uid=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", service=");
        sb.append(this.w);
        sb.append(", brand=");
        return b64.p(sb, this.x, ')');
    }
}
