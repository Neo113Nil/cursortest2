package defpackage;

import kotlin.reflect.KVariance;

/* loaded from: classes13.dex */
public final class ogx {
    public static final /* synthetic */ int c = 0;
    public final KVariance a;
    public final mgx b;

    static {
        new ogx(null, null);
    }

    public ogx(KVariance kVariance, an11 an11Var) {
        String str;
        this.a = kVariance;
        this.b = an11Var;
        if ((kVariance == null) == (an11Var == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        w511.f(str);
        throw null;
    }

    public final mgx a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogx)) {
            return false;
        }
        ogx ogxVar = (ogx) obj;
        return this.a == ogxVar.a && jl40.l(this.b, ogxVar.b);
    }

    public final int hashCode() {
        KVariance kVariance = this.a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        mgx mgxVar = this.b;
        return hashCode + (mgxVar != null ? mgxVar.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.a;
        int i = kVariance == null ? -1 : ngx.a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        mgx mgxVar = this.b;
        if (i == 1) {
            return String.valueOf(mgxVar);
        }
        if (i == 2) {
            return "in " + mgxVar;
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        return "out " + mgxVar;
    }
}
