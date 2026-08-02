package defpackage;

/* loaded from: classes12.dex */
public final class cie implements jie {
    public final zgf a;
    public final o0f0 b;
    public final we6 c;
    public final qwi d;
    public final n73 e;
    public final xw11 f;
    public final vqf0 g;

    public cie(zgf zgfVar, o0f0 o0f0Var, we6 we6Var, qwi qwiVar, n73 n73Var, xw11 xw11Var, vqf0 vqf0Var) {
        this.a = zgfVar;
        this.b = o0f0Var;
        this.c = we6Var;
        this.d = qwiVar;
        this.e = n73Var;
        this.f = xw11Var;
        this.g = vqf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cie) {
            cie cieVar = (cie) obj;
            if (this.a == cieVar.a && this.b.equals(cieVar.b) && this.c == cieVar.c && this.d.equals(cieVar.d) && this.e.equals(cieVar.e) && this.f.equals(cieVar.f) && this.g.equals(cieVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
