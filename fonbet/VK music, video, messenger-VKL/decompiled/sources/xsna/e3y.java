package xsna;

/* compiled from: JsCommonDelegateConfig.kt */
/* loaded from: classes6.dex */
public final class e3y {
    public final xwv0 a;
    public final com.vk.superapp.base.js.bridge.b b;
    public final s13 c;
    public final jb d;
    public final p5y e;
    public final z6y f;

    public e3y(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tau0 tau0Var, jb jbVar, p5y p5yVar, z6y z6yVar) {
        this.a = fvv0Var;
        this.b = bVar;
        this.c = tau0Var;
        this.d = jbVar;
        this.e = p5yVar;
        this.f = z6yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3y)) {
            return false;
        }
        e3y e3yVar = (e3y) obj;
        return epx.f(this.a, e3yVar.a) && this.b.equals(e3yVar.b) && epx.f(this.c, e3yVar.c) && this.d.equals(e3yVar.d) && this.e.equals(e3yVar.e) && this.f.equals(e3yVar.f);
    }

    public final int hashCode() {
        xwv0 xwv0Var = this.a;
        int hashCode = (this.b.hashCode() + ((xwv0Var == null ? 0 : xwv0Var.hashCode()) * 31)) * 31;
        s13 s13Var = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (s13Var != null ? s13Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "JsCommonDelegateConfig(presenter=" + this.a + ", bridge=" + this.b + ", analytics=" + this.c + ", hostProvider=" + this.d + ", contextProvider=" + this.e + ", callback=" + this.f + ')';
    }
}
