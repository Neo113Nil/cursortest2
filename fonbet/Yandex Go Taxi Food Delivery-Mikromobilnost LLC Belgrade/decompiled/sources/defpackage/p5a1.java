package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class p5a1 extends s7a1 {
    public final boolean a;

    public p5a1(boolean z) {
        this.a = z;
    }

    @Override // defpackage.s7a1
    public final int a() {
        return s7a1.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        s7a1 s7a1Var = (s7a1) obj;
        int a = s7a1Var.a();
        int d = s7a1.d((byte) -32);
        if (d != a) {
            return d - s7a1Var.a();
        }
        return (true != this.a ? 20 : 21) - (true != ((p5a1) s7a1Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p5a1.class == obj.getClass() && this.a == ((p5a1) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(s7a1.d((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
