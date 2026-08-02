package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes15.dex */
public final class l2 implements o2 {
    public final ModernAccount a;
    public final List b;

    public l2(ModernAccount modernAccount, List list) {
        this.a = modernAccount;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return jl40.l(this.a, l2Var.a) && jl40.l(this.b, l2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAccount(selectedAccount=");
        sb.append(this.a);
        sb.append(", badges=");
        return unr0.t(sb, this.b, ')');
    }
}
