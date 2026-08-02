package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class s0 implements a1 {
    public final String a;
    public final String b;

    public s0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return jl40.l(this.a, s0Var.a) && jl40.l(this.b, s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithOpenUrl(url=");
        uw51.y(sb, this.a, ", purpose=");
        return b64.p(sb, this.b, ')');
    }
}
