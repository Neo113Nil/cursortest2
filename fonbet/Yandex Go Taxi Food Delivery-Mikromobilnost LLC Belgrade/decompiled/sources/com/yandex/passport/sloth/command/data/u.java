package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes2.dex */
public final class u {
    public static final t Companion = new t();
    public final String a;

    public /* synthetic */ u(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, s.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && jl40.l(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("GetXTokenClientIdData(login="), this.a, ')');
    }
}
