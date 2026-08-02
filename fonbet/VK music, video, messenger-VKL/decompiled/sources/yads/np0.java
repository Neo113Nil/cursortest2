package yads;

/* loaded from: classes10.dex */
public final class np0 {
    public final l83 a;
    public final int[] b;
    public final int c;

    public np0(int i, l83 l83Var, int[] iArr) {
        if (iArr.length == 0) {
            ji1.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = l83Var;
        this.b = iArr;
        this.c = i;
    }
}
