package defpackage;

/* loaded from: classes14.dex */
public final class ock0 {
    public final boolean a;
    public final boolean b;
    public final nsz c;
    public final String d;
    public final int e;

    public ock0(boolean z, boolean z2, nsz nszVar, String str, int i) {
        this.a = z;
        this.b = z2;
        this.c = nszVar;
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ock0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ock0 ock0Var = (ock0) obj;
        return this.a == ock0Var.a && this.b == ock0Var.b && jl40.l(this.d, ock0Var.d) && this.e == ock0Var.e;
    }

    public final int hashCode() {
        int i = (((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31;
        nsz nszVar = this.c;
        int hashCode = (i + (nszVar != null ? nszVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.e;
    }
}
