package com.yandex.passport.internal.entities;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportUidImpl;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class j {
    public final PassportUidImpl a;
    public final PassportLoginAction b;
    public final String c;

    public j(PassportUidImpl passportUidImpl, PassportLoginAction passportLoginAction, String str) {
        this.a = passportUidImpl;
        this.b = passportLoginAction;
        this.c = str;
    }

    public final PassportUidImpl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!jl40.l(this.a, jVar.a) || this.b != jVar.b) {
            return false;
        }
        String str = jVar.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResult(uid=");
        sb.append(this.a);
        sb.append(", loginAction=");
        sb.append(this.b);
        sb.append(", additionalActionResponse=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.internal.ui.c.J(str)));
        sb.append(')');
        return sb.toString();
    }
}
