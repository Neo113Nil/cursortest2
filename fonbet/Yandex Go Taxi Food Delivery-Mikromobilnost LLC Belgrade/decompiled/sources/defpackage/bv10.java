package defpackage;

import java.nio.charset.CodingErrorAction;

/* loaded from: classes4.dex */
public class bv10 implements Cloneable {
    public boolean a = true;
    public boolean b = true;
    public CodingErrorAction c;
    public CodingErrorAction w;
    public int x;
    public int y;
    public int z;

    public bv10() {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.c = codingErrorAction;
        this.w = codingErrorAction;
        this.x = Integer.MAX_VALUE;
        this.y = 8192;
        this.z = 8192;
    }

    public final Object clone() {
        bv10 bv10Var = new bv10();
        bv10Var.a = true;
        bv10Var.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        bv10Var.c = codingErrorAction;
        bv10Var.w = codingErrorAction;
        bv10Var.x = Integer.MAX_VALUE;
        bv10Var.y = 8192;
        bv10Var.z = 8192;
        bv10Var.a = this.a;
        bv10Var.b = this.b;
        bv10Var.c = this.c;
        bv10Var.w = this.w;
        bv10Var.x = this.x;
        bv10Var.y = this.y;
        return bv10Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bv10)) {
            return false;
        }
        bv10 bv10Var = (bv10) obj;
        return this.a == bv10Var.a && this.b == bv10Var.b && this.c == bv10Var.c && this.w == bv10Var.w && this.x == bv10Var.x && this.z == bv10Var.z && this.y == bv10Var.y;
    }

    public final int hashCode() {
        int i = (((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31;
        CodingErrorAction codingErrorAction = this.c;
        int hashCode = (i + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.w;
        return ((((((hashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.x) * 31) + this.y) * 31) + this.z;
    }
}
