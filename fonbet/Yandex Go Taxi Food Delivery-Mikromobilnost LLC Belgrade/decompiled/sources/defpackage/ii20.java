package defpackage;

/* loaded from: classes11.dex */
public final class ii20 {
    public final char a;
    public final int b;
    public final ii20 c;
    public final int d;

    public ii20(char c, lan lanVar, int i, ii20 ii20Var, int i2) {
        int length;
        char c2 = c == i2 ? (char) 1000 : c;
        this.a = c2;
        this.b = i;
        this.c = ii20Var;
        if (c2 == 1000) {
            length = 1;
        } else {
            length = ("" + c).getBytes(lanVar.a[i].charset()).length;
        }
        length = (ii20Var == null ? 0 : ii20Var.b) != i ? length + 3 : length;
        this.d = ii20Var != null ? length + ii20Var.d : length;
    }
}
