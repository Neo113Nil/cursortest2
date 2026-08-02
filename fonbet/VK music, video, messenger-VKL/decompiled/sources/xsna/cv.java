package xsna;

/* compiled from: ActionButtonState.kt */
/* loaded from: classes17.dex */
public final class cv {
    public final boolean a;
    public final cut0 b;
    public final cut0 c;

    public cv(boolean z, cut0 cut0Var, cut0 cut0Var2) {
        this.a = z;
        this.b = cut0Var;
        this.c = cut0Var2;
    }

    public static cv a(cv cvVar, cut0 cut0Var, cut0 cut0Var2, int i) {
        boolean z = (i & 1) != 0 ? cvVar.a : true;
        if ((i & 2) != 0) {
            cut0Var = cvVar.b;
        }
        if ((i & 4) != 0) {
            cut0Var2 = cvVar.c;
        }
        return (z == cvVar.a && cut0Var.equals(cvVar.b) && cut0Var2.equals(cvVar.c)) ? cvVar : new cv(z, cut0Var, cut0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return this.a == cvVar.a && epx.f(this.b, cvVar.b) && epx.f(this.c, cvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonState(actionButtonWasActive=" + this.a + ", activeBackgroundColor=" + this.b + ", activeTextColor=" + this.c + ')';
    }
}
