package xsna;

/* compiled from: ToolbarMenuModels.kt */
/* loaded from: classes16.dex */
public final class t7p0 {
    public final s7p0 a;
    public final s7p0 b;
    public final s7p0 c;
    public final s7p0 d;
    public final s7p0 e;
    public final s7p0 f;

    public t7p0() {
        this(0);
    }

    public static t7p0 a(t7p0 t7p0Var, s7p0 s7p0Var, s7p0 s7p0Var2, s7p0 s7p0Var3, s7p0 s7p0Var4, s7p0 s7p0Var5, s7p0 s7p0Var6, int i) {
        if ((i & 1) != 0) {
            s7p0Var = t7p0Var.a;
        }
        s7p0 s7p0Var7 = s7p0Var;
        if ((i & 2) != 0) {
            s7p0Var2 = t7p0Var.b;
        }
        s7p0 s7p0Var8 = s7p0Var2;
        if ((i & 4) != 0) {
            s7p0Var3 = t7p0Var.c;
        }
        s7p0 s7p0Var9 = s7p0Var3;
        if ((i & 8) != 0) {
            s7p0Var4 = t7p0Var.d;
        }
        s7p0 s7p0Var10 = s7p0Var4;
        if ((i & 16) != 0) {
            s7p0Var5 = t7p0Var.e;
        }
        s7p0 s7p0Var11 = s7p0Var5;
        if ((i & 32) != 0) {
            s7p0Var6 = t7p0Var.f;
        }
        t7p0Var.getClass();
        return new t7p0(s7p0Var7, s7p0Var8, s7p0Var9, s7p0Var10, s7p0Var11, s7p0Var6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7p0)) {
            return false;
        }
        t7p0 t7p0Var = (t7p0) obj;
        return epx.f(this.a, t7p0Var.a) && epx.f(this.b, t7p0Var.b) && epx.f(this.c, t7p0Var.c) && epx.f(this.d, t7p0Var.d) && epx.f(this.e, t7p0Var.e) && epx.f(this.f, t7p0Var.f);
    }

    public final int hashCode() {
        s7p0 s7p0Var = this.a;
        int hashCode = (s7p0Var == null ? 0 : s7p0Var.hashCode()) * 31;
        s7p0 s7p0Var2 = this.b;
        int hashCode2 = (hashCode + (s7p0Var2 == null ? 0 : s7p0Var2.hashCode())) * 31;
        s7p0 s7p0Var3 = this.c;
        int hashCode3 = (hashCode2 + (s7p0Var3 == null ? 0 : s7p0Var3.hashCode())) * 31;
        s7p0 s7p0Var4 = this.d;
        int hashCode4 = (hashCode3 + (s7p0Var4 == null ? 0 : s7p0Var4.hashCode())) * 31;
        s7p0 s7p0Var5 = this.e;
        int hashCode5 = (hashCode4 + (s7p0Var5 == null ? 0 : s7p0Var5.hashCode())) * 31;
        s7p0 s7p0Var6 = this.f;
        return hashCode5 + (s7p0Var6 != null ? s7p0Var6.hashCode() : 0);
    }

    public final String toString() {
        return "TopBarMenuState(search=" + this.a + ", edit=" + this.b + ", clear=" + this.c + ", options=" + this.d + ", filters=" + this.e + ", downloadAll=" + this.f + ')';
    }

    public /* synthetic */ t7p0(int i) {
        this(null, null, null, null, null, null);
    }

    public t7p0(s7p0 s7p0Var, s7p0 s7p0Var2, s7p0 s7p0Var3, s7p0 s7p0Var4, s7p0 s7p0Var5, s7p0 s7p0Var6) {
        this.a = s7p0Var;
        this.b = s7p0Var2;
        this.c = s7p0Var3;
        this.d = s7p0Var4;
        this.e = s7p0Var5;
        this.f = s7p0Var6;
    }
}
