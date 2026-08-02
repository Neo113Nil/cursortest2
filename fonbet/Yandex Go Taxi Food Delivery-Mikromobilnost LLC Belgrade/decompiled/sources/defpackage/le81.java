package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class le81 implements kq71 {
    public final int a;
    public final tu71 b;
    public final boolean c;
    public final int[] w;
    public final boolean[] x;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0 > 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public le81(tu71 tu71Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = tu71Var.a;
        this.a = i;
        if (i != iArr.length || i != zArr.length) {
            w511.q();
            throw null;
        }
        this.b = tu71Var;
        boolean z2 = z;
        this.c = z2;
        this.w = (int[]) iArr.clone();
        this.x = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || le81.class != obj.getClass()) {
            return false;
        }
        le81 le81Var = (le81) obj;
        return this.c == le81Var.c && this.b.equals(le81Var.b) && Arrays.equals(this.w, le81Var.w) && Arrays.equals(this.x, le81Var.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.x) + ((Arrays.hashCode(this.w) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
