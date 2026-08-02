package xsna;

/* compiled from: TextLinkStyles.kt */
/* loaded from: classes11.dex */
public final class tjo0 {
    public final hik0 a;
    public final hik0 b;
    public final hik0 c;
    public final hik0 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tjo0() {
        this(r0, r0, r0, 15);
        hik0 hik0Var = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tjo0)) {
            return false;
        }
        tjo0 tjo0Var = (tjo0) obj;
        return epx.f(this.a, tjo0Var.a) && epx.f(this.b, tjo0Var.b) && epx.f(this.c, tjo0Var.c) && epx.f(this.d, tjo0Var.d);
    }

    public final int hashCode() {
        hik0 hik0Var = this.a;
        int hashCode = (hik0Var != null ? hik0Var.hashCode() : 0) * 31;
        hik0 hik0Var2 = this.b;
        int hashCode2 = (hashCode + (hik0Var2 != null ? hik0Var2.hashCode() : 0)) * 31;
        hik0 hik0Var3 = this.c;
        int hashCode3 = (hashCode2 + (hik0Var3 != null ? hik0Var3.hashCode() : 0)) * 31;
        hik0 hik0Var4 = this.d;
        return hashCode3 + (hik0Var4 != null ? hik0Var4.hashCode() : 0);
    }

    public tjo0(hik0 hik0Var, hik0 hik0Var2, hik0 hik0Var3, hik0 hik0Var4) {
        this.a = hik0Var;
        this.b = hik0Var2;
        this.c = hik0Var3;
        this.d = hik0Var4;
    }

    public /* synthetic */ tjo0(hik0 hik0Var, hik0 hik0Var2, hik0 hik0Var3, int i) {
        this((i & 1) != 0 ? null : hik0Var, (i & 2) != 0 ? null : hik0Var2, (hik0) null, (i & 8) != 0 ? null : hik0Var3);
    }
}
