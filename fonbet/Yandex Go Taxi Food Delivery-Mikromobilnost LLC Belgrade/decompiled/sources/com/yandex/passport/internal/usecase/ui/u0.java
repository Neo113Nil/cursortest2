package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ui.domik.RegTrack;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class u0 {
    public final RegTrack a;
    public final String b;
    public final com.yandex.passport.biometric.ui.verification.a c;

    public u0(RegTrack regTrack, String str, com.yandex.passport.biometric.ui.verification.a aVar) {
        this.a = regTrack;
        this.b = str;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return jl40.l(this.a, u0Var.a) && jl40.l(this.b, u0Var.b) && jl40.l(this.c, u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(regTrack=" + this.a + ", phone=" + this.b + ", callback=" + this.c + ')';
    }
}
