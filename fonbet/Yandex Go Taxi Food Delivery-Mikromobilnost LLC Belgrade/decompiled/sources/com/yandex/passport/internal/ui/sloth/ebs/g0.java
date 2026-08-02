package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class g0 implements l0 {
    public final AppTheme a;
    public final Uid b;
    public final String c;
    public final String d;
    public final String e;

    static {
        int i = Uid.$stable;
    }

    public g0(Uid uid, String str, String str2, String str3, AppTheme appTheme) {
        this.a = appTheme;
        this.b = uid;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && jl40.l(this.b, g0Var.b) && jl40.l(this.c, g0Var.c) && jl40.l(this.d, g0Var.d) && jl40.l(this.e, g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(uw51.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsiaBind(theme=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", application=");
        sb.append(this.c);
        sb.append(", consumer=");
        sb.append(this.d);
        sb.append(", scope=");
        return b64.p(sb, this.e, ')');
    }
}
