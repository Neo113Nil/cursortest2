package com.yandex.passport.api;

import com.yandex.passport.internal.account.PassportAccountImpl;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class u implements w {
    public final PassportUidImpl a;
    public final PassportAccountImpl b;
    public final PassportLoginAction c;
    public final String d;
    public final String e;

    public u(PassportUidImpl passportUidImpl, PassportAccountImpl passportAccountImpl, PassportLoginAction passportLoginAction, String str, String str2) {
        this.a = passportUidImpl;
        this.b = passportAccountImpl;
        this.c = passportLoginAction;
        this.d = str;
        this.e = str2;
    }

    public final PassportLoginAction a() {
        return this.c;
    }

    public final i b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final k2 d() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (jl40.l(this.a, uVar.a) && jl40.l(this.b, uVar.b) && this.c == uVar.c) {
                    String str = uVar.d;
                    String str2 = this.d;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && jl40.l(this.e, uVar.e)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggedIn(uid=");
        sb.append(this.a);
        sb.append(", passportAccount=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        String str = this.d;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.internal.ui.c.J(str)));
        sb.append(", phoneNumber=");
        return b64.p(sb, this.e, ')');
    }
}
