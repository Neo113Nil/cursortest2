package defpackage;

import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class op81 implements kq71 {
    public static final su71 z;
    public final String a;
    public final d981 b;
    public final q581 c;
    public final oi61 w;
    public final dw71 x;
    public final qf81 y;

    static {
        new wp71();
        p481 p481Var = t31.b;
        wk2 wk2Var = wk2.x;
        qf81 qf81Var = qf81.c;
        oi61 oi61Var = oi61.b0;
        z = new su71(18);
    }

    public op81(String str, dw71 dw71Var, d981 d981Var, q581 q581Var, oi61 oi61Var, qf81 qf81Var) {
        this.a = str;
        this.b = d981Var;
        this.c = q581Var;
        this.w = oi61Var;
        this.x = dw71Var;
        this.y = qf81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op81)) {
            return false;
        }
        op81 op81Var = (op81) obj;
        String str = op81Var.a;
        int i = rf71.a;
        return this.a.equals(str) && this.x.equals(op81Var.x) && rf71.o(this.b, op81Var.b) && this.c.equals(op81Var.c) && rf71.o(this.w, op81Var.w) && rf71.o(this.y, op81Var.y);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d981 d981Var = this.b;
        return this.y.hashCode() + ((this.w.hashCode() + ((this.x.hashCode() + ((this.c.hashCode() + ((hashCode + (d981Var != null ? d981Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
