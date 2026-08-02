package yads;

import android.os.Bundle;
import xsna.yil0;

/* loaded from: classes10.dex */
public abstract class um1 implements xq {
    public static final wq g = new yil0(8);
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public um1(tm1 tm1Var) {
        this.b = tm1Var.a;
        this.c = tm1Var.b;
        this.d = tm1Var.c;
        this.e = tm1Var.d;
        this.f = tm1Var.e;
    }

    public static vm1 a(Bundle bundle) {
        tm1 tm1Var = new tm1();
        long j = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        tm1Var.a = j;
        long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j2 != Long.MIN_VALUE && j2 < 0) {
            throw new IllegalArgumentException();
        }
        tm1Var.b = j2;
        tm1Var.c = bundle.getBoolean(Integer.toString(2, 36), false);
        tm1Var.d = bundle.getBoolean(Integer.toString(3, 36), false);
        tm1Var.e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new vm1(tm1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um1)) {
            return false;
        }
        um1 um1Var = (um1) obj;
        return this.b == um1Var.b && this.c == um1Var.c && this.d == um1Var.d && this.e == um1Var.e && this.f == um1Var.f;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.c;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
