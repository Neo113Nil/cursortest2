package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class s extends g implements f {
    public final Uid a;
    public final long b;
    public final String c;
    public final boolean w;
    public final SlothLoginProperties x;
    public final boolean y;

    public s(Uid uid, long j, String str, boolean z, SlothLoginProperties slothLoginProperties) {
        super(SlothMode.PhoneConfirm);
        this.a = uid;
        this.b = j;
        this.c = str;
        this.w = z;
        this.x = slothLoginProperties;
        this.y = true;
    }

    @Override // com.yandex.passport.sloth.data.g
    public final SlothLoginProperties c() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return jl40.l(this.a, sVar.a) && this.b == sVar.b && jl40.l(this.c, sVar.c) && this.w == sVar.w && jl40.l(this.x, sVar.x) && this.y == sVar.y;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.a;
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.y) + ((this.x.hashCode() + unr0.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.w)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirm(uid=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        sb.append(this.c);
        sb.append(", editable=");
        sb.append(this.w);
        sb.append(", properties=");
        sb.append(this.x);
        sb.append(", canGoBack=");
        return unr0.u(sb, this.y, ')');
    }
}
