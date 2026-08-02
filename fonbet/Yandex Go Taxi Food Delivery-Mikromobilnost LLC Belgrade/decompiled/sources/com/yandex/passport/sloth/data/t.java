package com.yandex.passport.sloth.data;

import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class t extends g {
    public final SlothLoginProperties a;
    public final boolean b;

    public t(SlothLoginProperties slothLoginProperties) {
        super(SlothMode.Phonish);
        this.a = slothLoginProperties;
        this.b = true;
    }

    @Override // com.yandex.passport.sloth.data.g
    public final SlothLoginProperties c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return jl40.l(this.a, tVar.a) && this.b == tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phonish(properties=");
        sb.append(this.a);
        sb.append(", canGoBack=");
        return unr0.u(sb, this.b, ')');
    }
}
