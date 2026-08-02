package defpackage;

/* loaded from: classes10.dex */
public final class joo {
    public final xzz0 a;
    public final int[] b;

    public joo(int i, xzz0 xzz0Var, int[] iArr) {
        if (iArr.length == 0) {
            lk91.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = xzz0Var;
        this.b = iArr;
    }
}
