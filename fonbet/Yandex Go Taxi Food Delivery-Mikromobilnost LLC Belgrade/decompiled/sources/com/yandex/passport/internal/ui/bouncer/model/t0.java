package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.b64;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class t0 implements a1 {
    public final ModernAccount a;
    public final Uid b;
    public final PassportLoginAction c;
    public final String d;
    public final String e;

    public t0(ModernAccount modernAccount, Uid uid, PassportLoginAction passportLoginAction, String str, String str2) {
        this.a = modernAccount;
        this.b = uid;
        this.c = passportLoginAction;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a.equals(t0Var.a) && jl40.l(this.b, t0Var.b) && this.c == t0Var.c && jl40.l(this.d, t0Var.d) && jl40.l(this.e, t0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithResult(account=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        sb.append(this.d);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.e, ')');
    }
}
