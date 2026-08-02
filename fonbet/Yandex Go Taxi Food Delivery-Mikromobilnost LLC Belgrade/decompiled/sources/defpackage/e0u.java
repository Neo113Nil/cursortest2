package defpackage;

/* loaded from: classes10.dex */
public abstract class e0u implements l8q0 {
    public abstract int a(int i);

    public abstract int b(int i);

    @Override // defpackage.l8q0
    public final int c(int i) {
        int b = b(i);
        if (b == -1 || b(b) == -1) {
            return -1;
        }
        return b;
    }

    @Override // defpackage.l8q0
    public final int e(int i) {
        int a = a(i);
        if (a == -1 || a(a) == -1) {
            return -1;
        }
        return a;
    }

    @Override // defpackage.l8q0
    public final int f(int i) {
        return b(i);
    }

    @Override // defpackage.l8q0
    public final int g(int i) {
        return a(i);
    }
}
