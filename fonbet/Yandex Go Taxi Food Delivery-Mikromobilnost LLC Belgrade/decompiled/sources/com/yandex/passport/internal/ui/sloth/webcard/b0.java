package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class b0 {
    public final q0 a;
    public final SlothParams b;
    public final Throwable c;

    public b0(q0 q0Var, SlothParams slothParams, Throwable th) {
        this.a = q0Var;
        this.b = slothParams;
        this.c = th;
    }

    public static b0 a(b0 b0Var, q0 q0Var, SlothParams slothParams, Throwable th, int i) {
        if ((i & 1) != 0) {
            q0Var = b0Var.a;
        }
        if ((i & 2) != 0) {
            slothParams = b0Var.b;
        }
        if ((i & 4) != 0) {
            th = b0Var.c;
        }
        b0Var.getClass();
        return new b0(q0Var, slothParams, th);
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
        q0 q0Var = this.a;
        int hashCode = (q0Var == null ? 0 : q0Var.hashCode()) * 31;
        SlothParams slothParams = this.b;
        int hashCode2 = (hashCode + (slothParams == null ? 0 : slothParams.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(result=");
        sb.append(this.a);
        sb.append(", slothParams=");
        sb.append(this.b);
        sb.append(", error=");
        return unr0.s(sb, this.c, ')');
    }

    public b0() {
        this(null, null, null);
    }
}
