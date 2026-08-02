package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class f implements n0 {
    public final g1 a;
    public final Uid b;
    public final PassportTheme c;
    public final boolean d;

    public f(g1 g1Var, Uid uid, PassportTheme passportTheme, boolean z) {
        this.a = g1Var;
        this.b = uid;
        this.c = passportTheme;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeRequired(bouncerParameters=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", isCheckAgain=");
        return unr0.u(sb, this.d, ')');
    }
}
