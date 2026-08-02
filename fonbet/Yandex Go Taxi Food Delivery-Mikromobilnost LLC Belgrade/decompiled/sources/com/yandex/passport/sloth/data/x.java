package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class x extends g implements f {
    public final String a;
    public final Uid b;
    public final boolean c;
    public final SlothLoginProperties w;
    public final boolean x;

    public x(String str, Uid uid, boolean z, SlothLoginProperties slothLoginProperties) {
        super(SlothMode.Relogin);
        this.a = str;
        this.b = uid;
        this.c = z;
        this.w = slothLoginProperties;
        this.x = true;
    }

    @Override // com.yandex.passport.sloth.data.g
    public final SlothLoginProperties c() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return jl40.l(this.a, xVar.a) && jl40.l(this.b, xVar.b) && this.c == xVar.c && jl40.l(this.w, xVar.w) && this.x == xVar.x;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.x) + ((this.w.hashCode() + unr0.e(uw51.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Relogin(login=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", editable=");
        sb.append(this.c);
        sb.append(", properties=");
        sb.append(this.w);
        sb.append(", canGoBack=");
        return unr0.u(sb, this.x, ')');
    }
}
