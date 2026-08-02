package xsna;

import xsna.uu;

/* compiled from: ActionButtonState.kt */
/* loaded from: classes17.dex */
public final class ev {
    public final boolean a;
    public final boolean b;
    public final uu c;
    public final cut0 d;
    public final cut0 e;

    public ev(boolean z, boolean z2, uu uuVar, cut0 cut0Var, cut0 cut0Var2) {
        this.a = z;
        this.b = z2;
        this.c = uuVar;
        this.d = cut0Var;
        this.e = cut0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [xsna.uu] */
    public static ev a(ev evVar, boolean z, boolean z2, uu.a aVar, cut0 cut0Var, cut0 cut0Var2, int i) {
        if ((i & 1) != 0) {
            z = evVar.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = evVar.b;
        }
        boolean z4 = z2;
        uu.a aVar2 = aVar;
        if ((i & 4) != 0) {
            aVar2 = evVar.c;
        }
        uu.a aVar3 = aVar2;
        if ((i & 8) != 0) {
            cut0Var = evVar.d;
        }
        cut0 cut0Var3 = cut0Var;
        if ((i & 16) != 0) {
            cut0Var2 = evVar.e;
        }
        cut0 cut0Var4 = cut0Var2;
        return (z3 == evVar.a && z4 == evVar.b && epx.f(aVar3, evVar.c) && cut0Var3.equals(evVar.d) && cut0Var4.equals(evVar.e)) ? evVar : new ev(z3, z4, aVar3, cut0Var3, cut0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return this.a == evVar.a && this.b == evVar.b && epx.f(this.c, evVar.c) && epx.f(this.d, evVar.d) && epx.f(this.e, evVar.e);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        uu uuVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((b + (uuVar == null ? 0 : uuVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonState(actionButtonWasShown=" + this.a + ", actionButtonWasActive=" + this.b + ", icon=" + this.c + ", activeBackgroundColor=" + this.d + ", activeTextColor=" + this.e + ')';
    }
}
