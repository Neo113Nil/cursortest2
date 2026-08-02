package xsna;

/* compiled from: JsVkclientDelegateConfig.kt */
/* loaded from: classes6.dex */
public final class t7y {
    public final xwv0 a;
    public final com.vk.superapp.base.js.bridge.b b;
    public final s13 c;
    public final r5i d;
    public final z6y e;

    public t7y(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tau0 tau0Var, r5i r5iVar, z6y z6yVar) {
        this.a = fvv0Var;
        this.b = bVar;
        this.c = tau0Var;
        this.d = r5iVar;
        this.e = z6yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7y)) {
            return false;
        }
        t7y t7yVar = (t7y) obj;
        return epx.f(this.a, t7yVar.a) && this.b.equals(t7yVar.b) && epx.f(this.c, t7yVar.c) && this.d.equals(t7yVar.d) && this.e.equals(t7yVar.e);
    }

    public final int hashCode() {
        xwv0 xwv0Var = this.a;
        int hashCode = (this.b.hashCode() + ((xwv0Var == null ? 0 : xwv0Var.hashCode()) * 31)) * 31;
        s13 s13Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (s13Var != null ? s13Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "JsVkclientDelegateConfig(presenter=" + this.a + ", bridge=" + this.b + ", analytics=" + this.c + ", contextProvider=" + this.d + ", callback=" + this.e + ')';
    }
}
