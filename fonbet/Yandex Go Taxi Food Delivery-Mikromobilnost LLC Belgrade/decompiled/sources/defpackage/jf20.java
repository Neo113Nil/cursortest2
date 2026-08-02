package defpackage;

/* loaded from: classes6.dex */
public final class jf20 extends sf20 {
    public final String b;
    public final q0d0 c;
    public final o151 d;
    public final bg20 e;

    public jf20(String str, q0d0 q0d0Var, o151 o151Var, bg20 bg20Var) {
        super(q0d0Var);
        this.b = str;
        this.c = q0d0Var;
        this.d = o151Var;
        this.e = bg20Var;
    }

    @Override // defpackage.sf20, defpackage.dg20
    public final q0d0 a() {
        return this.c;
    }

    @Override // defpackage.dg20
    public final String b() {
        return this.b;
    }

    @Override // defpackage.sf20
    public final o151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf20)) {
            return false;
        }
        jf20 jf20Var = (jf20) obj;
        return jl40.l(this.b, jf20Var.b) && jl40.l(this.c, jf20Var.c) && jl40.l(this.d, jf20Var.d) && this.e.equals(jf20Var.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        q0d0 q0d0Var = this.c;
        return (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode())) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "ButtonMicroWidgetModel(id=" + this.b + ", action=" + this.c + ", widgetDisplaySettings=" + this.d + ", text=" + this.e + ", contentDescription=null)";
    }
}
