package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k0 {
    public final Integer a;
    public final SlothParams b;

    public k0(Integer num, SlothParams slothParams) {
        this.a = num;
        this.b = slothParams;
    }

    public static k0 a(k0 k0Var, Integer num, SlothParams slothParams, int i) {
        if ((i & 1) != 0) {
            num = k0Var.a;
        }
        if ((i & 2) != 0) {
            slothParams = k0Var.b;
        }
        k0Var.getClass();
        k0Var.getClass();
        return new k0(num, slothParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return jl40.l(this.a, k0Var.a) && jl40.l(this.b, k0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        SlothParams slothParams = this.b;
        return (hashCode + (slothParams != null ? slothParams.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "State(resultCode=" + this.a + ", slothParams=" + this.b + ", error=null)";
    }

    public k0() {
        this(null, null);
    }
}
