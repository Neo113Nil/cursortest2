package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class l1o {
    public final n530 a;
    public final txl b;
    public final cyl c;
    public final w0j d;
    public final o530 e;
    public final yxl f;
    public final lb7 g;

    public l1o(n530 n530Var, txl txlVar, cyl cylVar, w0j w0jVar, o530 o530Var, yxl yxlVar, lb7 lb7Var) {
        this.a = n530Var;
        this.b = txlVar;
        this.c = cylVar;
        this.d = w0jVar;
        this.e = o530Var;
        this.f = yxlVar;
        this.g = lb7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l1o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l1o l1oVar = (l1o) obj;
        return this.a == l1oVar.a && this.b == l1oVar.b && this.c == l1oVar.c && this.d == l1oVar.d && this.e == l1oVar.e && this.f == l1oVar.f && this.g == l1oVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EngineContext(actionDispatcher=" + this.a + ", commandChannel=" + this.b + ", visibleBoundsAware=" + this.c + ", viewLifecycleOwner=" + this.d + ", animationPlayer=" + this.e + ", documentSupplier=" + this.f + ", eventSender=" + this.g + Extension.C_BRAKE;
    }
}
