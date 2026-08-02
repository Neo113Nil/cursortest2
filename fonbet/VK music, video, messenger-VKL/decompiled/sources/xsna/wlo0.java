package xsna;

/* compiled from: TextState.kt */
/* loaded from: classes4.dex */
public final class wlo0 {
    public final String a;
    public final t4s b;
    public final ew5 c;
    public final et1 d;
    public final y5g e;

    public wlo0(String str, t4s t4sVar, ew5 ew5Var, et1 et1Var, y5g y5gVar) {
        this.a = str;
        this.b = t4sVar;
        this.c = ew5Var;
        this.d = et1Var;
        this.e = y5gVar;
    }

    public static wlo0 a(wlo0 wlo0Var, String str, t4s t4sVar, ew5 ew5Var, et1 et1Var, y5g y5gVar, int i) {
        if ((i & 1) != 0) {
            str = wlo0Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            t4sVar = wlo0Var.b;
        }
        t4s t4sVar2 = t4sVar;
        if ((i & 4) != 0) {
            ew5Var = wlo0Var.c;
        }
        ew5 ew5Var2 = ew5Var;
        if ((i & 8) != 0) {
            et1Var = wlo0Var.d;
        }
        et1 et1Var2 = et1Var;
        if ((i & 16) != 0) {
            y5gVar = wlo0Var.e;
        }
        wlo0Var.getClass();
        return new wlo0(str2, t4sVar2, ew5Var2, et1Var2, y5gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlo0)) {
            return false;
        }
        wlo0 wlo0Var = (wlo0) obj;
        return epx.f(this.a, wlo0Var.a) && epx.f(this.b, wlo0Var.b) && epx.f(this.c, wlo0Var.c) && epx.f(this.d, wlo0Var.d) && epx.f(this.e, wlo0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextState(text=" + this.a + ", fontData=" + this.b + ", backgroundData=" + this.c + ", alignmentData=" + this.d + ", colorData=" + this.e + ")";
    }
}
