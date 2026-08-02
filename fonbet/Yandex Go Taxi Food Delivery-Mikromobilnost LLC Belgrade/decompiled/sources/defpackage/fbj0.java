package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fbj0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ fbj0(String str, int i) {
        this(str, (i & 2) == 0, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbj0)) {
            return false;
        }
        fbj0 fbj0Var = (fbj0) obj;
        return jl40.l(this.a, fbj0Var.a) && this.b == fbj0Var.b && this.c == fbj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("RequirementActionParams(requirementName=", this.a, ", showWithGroup=", ", ignoreSelectionStateForCommunication=", this.b), this.c, Extension.C_BRAKE);
    }

    public fbj0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
