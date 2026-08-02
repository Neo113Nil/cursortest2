package com.yandex.passport.sloth;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.data.SlothLoginAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class m0 implements a1 {
    public final com.yandex.passport.common.account.a a;
    public final Uid b;
    public final SlothLoginAction c;
    public final String d;

    public m0(com.yandex.passport.common.account.a aVar, Uid uid, SlothLoginAction slothLoginAction, String str) {
        this.a = aVar;
        this.b = uid;
        this.c = slothLoginAction;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a.equals(m0Var.a) && jl40.l(this.b, m0Var.b) && this.c == m0Var.c && jl40.l(this.d, m0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothLoginResult(account=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        return b64.p(sb, this.d, ')');
    }
}
