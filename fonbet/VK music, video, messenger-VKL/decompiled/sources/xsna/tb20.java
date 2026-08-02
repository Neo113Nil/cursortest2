package xsna;

/* compiled from: MessageTranslateScreenState.kt */
/* loaded from: classes6.dex */
public final class tb20 {
    public final ez80 a;
    public final dop0 b;
    public final unp0 c;
    public final ob20 d;
    public final boolean e;

    public tb20(ez80 ez80Var, dop0 dop0Var, unp0 unp0Var, ob20 ob20Var, boolean z) {
        this.a = ez80Var;
        this.b = dop0Var;
        this.c = unp0Var;
        this.d = ob20Var;
        this.e = z;
    }

    public static tb20 a(tb20 tb20Var, ez80 ez80Var, dop0 dop0Var, unp0 unp0Var, ob20 ob20Var, boolean z, int i) {
        if ((i & 1) != 0) {
            ez80Var = tb20Var.a;
        }
        ez80 ez80Var2 = ez80Var;
        if ((i & 2) != 0) {
            dop0Var = tb20Var.b;
        }
        dop0 dop0Var2 = dop0Var;
        if ((i & 4) != 0) {
            unp0Var = tb20Var.c;
        }
        unp0 unp0Var2 = unp0Var;
        if ((i & 8) != 0) {
            ob20Var = tb20Var.d;
        }
        ob20 ob20Var2 = ob20Var;
        if ((i & 16) != 0) {
            z = tb20Var.e;
        }
        tb20Var.getClass();
        return new tb20(ez80Var2, dop0Var2, unp0Var2, ob20Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb20)) {
            return false;
        }
        tb20 tb20Var = (tb20) obj;
        return epx.f(this.a, tb20Var.a) && epx.f(this.b, tb20Var.b) && epx.f(this.c, tb20Var.c) && epx.f(this.d, tb20Var.d) && this.e == tb20Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageTranslateScreenState(originalTextState=");
        sb.append(this.a);
        sb.append(", translateTextState=");
        sb.append(this.b);
        sb.append(", translateLanguageMode=");
        sb.append(this.c);
        sb.append(", actionsUpdate=");
        sb.append(this.d);
        sb.append(", copyTranslateEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
