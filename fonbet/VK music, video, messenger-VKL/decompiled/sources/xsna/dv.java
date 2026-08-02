package xsna;

/* compiled from: ActionButtonState.kt */
/* loaded from: classes17.dex */
public final class dv {
    public final boolean a;
    public final cut0 b;
    public final cut0 c;

    public dv(boolean z, cut0 cut0Var, cut0 cut0Var2) {
        this.a = z;
        this.b = cut0Var;
        this.c = cut0Var2;
    }

    public static dv a(dv dvVar, cut0 cut0Var, cut0 cut0Var2, int i) {
        boolean z = (i & 1) != 0 ? dvVar.a : true;
        if ((i & 2) != 0) {
            cut0Var = dvVar.b;
        }
        if ((i & 4) != 0) {
            cut0Var2 = dvVar.c;
        }
        return (z == dvVar.a && cut0Var.equals(dvVar.b) && cut0Var2.equals(dvVar.c)) ? dvVar : new dv(z, cut0Var, cut0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return this.a == dvVar.a && epx.f(this.b, dvVar.b) && epx.f(this.c, dvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonState(actionButtonWasActive=" + this.a + ", activeBackgroundColor=" + this.b + ", activeTextColor=" + this.c + ')';
    }
}
