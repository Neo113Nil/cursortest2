package com.yandex.passport.sloth.url;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class m extends p {
    public final String a;
    public final boolean b;

    public m(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return jl40.l(this.a, mVar.a) && this.b == mVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalUrl(url=");
        uw51.y(sb, this.a, ", cancel=");
        return unr0.u(sb, this.b, ')');
    }
}
