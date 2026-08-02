package xsna;

/* compiled from: SearchDatabaseCustomAction.kt */
/* loaded from: classes5.dex */
public final class cph0 {
    public final Object a;

    public cph0(eyz eyzVar) {
        this.a = eyzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cph0)) {
            return false;
        }
        cph0 cph0Var = (cph0) obj;
        cph0Var.getClass();
        return epx.f(this.a, cph0Var.a);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(1) * 31;
        Object obj = this.a;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return k73.c(new StringBuilder("SearchDatabaseCustomAction(id=1, payload="), this.a, ')');
    }
}
