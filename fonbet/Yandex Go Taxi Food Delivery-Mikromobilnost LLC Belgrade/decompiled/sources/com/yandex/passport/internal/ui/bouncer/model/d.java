package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements n0 {
    public final ModernAccount a;
    public final List b;

    public d(ModernAccount modernAccount, List list) {
        this.a = modernAccount;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSelected(modernAccount=");
        sb.append(this.a);
        sb.append(", badges=");
        return unr0.t(sb, this.b, ')');
    }
}
