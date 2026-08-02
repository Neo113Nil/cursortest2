package defpackage;

/* loaded from: classes4.dex */
public class av10 implements Cloneable {
    public int a = 512;
    public int b = 8192;
    public int c = 8192;
    public boolean w = true;

    public final Object clone() {
        av10 av10Var = new av10();
        av10Var.a = 512;
        av10Var.b = 8192;
        av10Var.c = 8192;
        av10Var.w = true;
        av10Var.a = this.a;
        av10Var.b = this.b;
        av10Var.c = this.c;
        av10Var.w = this.w;
        return av10Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof av10)) {
            return false;
        }
        av10 av10Var = (av10) obj;
        return this.a == av10Var.a && this.b == av10Var.b && this.c == av10Var.c && this.w == av10Var.w;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + (this.w ? 1 : 0);
    }
}
