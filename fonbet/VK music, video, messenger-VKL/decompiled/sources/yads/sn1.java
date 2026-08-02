package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.vul0;

/* loaded from: classes10.dex */
public class sn1 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public sn1(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn1)) {
            return false;
        }
        sn1 sn1Var = (sn1) obj;
        return this.a.equals(sn1Var.a) && this.b == sn1Var.b && this.c == sn1Var.c && this.d == sn1Var.d && this.e == sn1Var.e;
    }

    public final int hashCode() {
        return ((((((vul0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public sn1(Object obj) {
        this(obj, -1L);
    }

    public sn1(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public sn1(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public sn1(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public sn1(sn1 sn1Var) {
        this.a = sn1Var.a;
        this.b = sn1Var.b;
        this.c = sn1Var.c;
        this.d = sn1Var.d;
        this.e = sn1Var.e;
    }
}
