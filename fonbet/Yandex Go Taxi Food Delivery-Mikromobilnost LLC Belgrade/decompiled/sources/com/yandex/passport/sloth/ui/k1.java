package com.yandex.passport.sloth.ui;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class k1 implements o1 {
    public final String a;
    public final com.yandex.passport.sloth.p b;
    public final Uid c;

    public k1(String str, com.yandex.passport.sloth.p pVar, Uid uid) {
        this.a = str;
        this.b = pVar;
        this.c = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return jl40.l(this.a, k1Var.a) && jl40.l(this.b, k1Var.b) && jl40.l(this.c, k1Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uid uid = this.c;
        return hashCode + (uid == null ? 0 : uid.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenExternalUrl(url=");
        uw51.y(sb, this.a, ", event=");
        sb.append(this.b);
        sb.append(", uid=");
        return uw51.j(sb, this.c, ')');
    }
}
