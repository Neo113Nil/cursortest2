package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class v0 {
    public final Uid a;
    public final Uid b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public v0(Uid uid, Uid uid2, boolean z, boolean z2, boolean z3, List list) {
        this.a = uid;
        this.b = uid2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a.equals(v0Var.a) && jl40.l(this.b, v0Var.b) && this.c == v0Var.c && this.d == v0Var.d && this.e == v0Var.e && this.f.equals(v0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uid uid = this.b;
        return this.f.hashCode() + unr0.e(unr0.e(unr0.e((hashCode + (uid == null ? 0 : uid.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowButtons(uid=");
        sb.append(this.a);
        sb.append(", muid=");
        sb.append(this.b);
        sb.append(", showYandex=");
        sb.append(this.c);
        sb.append(", showDelete=");
        sb.append(this.d);
        sb.append(", showLogoutOnDevice=");
        sb.append(this.e);
        sb.append(", masterMembers=");
        return unr0.t(sb, this.f, ')');
    }
}
