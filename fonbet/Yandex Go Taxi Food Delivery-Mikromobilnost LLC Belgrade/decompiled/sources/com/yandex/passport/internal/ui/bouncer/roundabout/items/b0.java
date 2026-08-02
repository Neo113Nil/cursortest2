package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ModernAccount;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class b0 {
    public final ModernAccount a;
    public final String b;
    public final String c;

    public b0(ModernAccount modernAccount, String str, String str2) {
        this.a = modernAccount;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return jl40.l(this.a, b0Var.a) && jl40.l(this.b, b0Var.b) && jl40.l(this.c, b0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phonish(modernAccount=");
        sb.append(this.a);
        sb.append(", phone=");
        sb.append(this.b);
        sb.append(", deleteMessageOverride=");
        return b64.p(sb, this.c, ')');
    }
}
