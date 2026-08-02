package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class r2 extends t2 {
    public final ModernAccount a;
    public final List b;
    public final Uid c;
    public final Uid d;

    public r2(ModernAccount modernAccount, List list) {
        this.a = modernAccount;
        this.b = list;
        this.c = modernAccount.getMasterUid();
        this.d = modernAccount.getUid();
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.t2
    public final Uid a() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.t2
    public final Uid b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return jl40.l(this.a, r2Var.a) && jl40.l(this.b, r2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonAccount(modernAccount=");
        sb.append(this.a);
        sb.append(", badges=");
        return unr0.t(sb, this.b, ')');
    }
}
