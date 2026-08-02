package xsna;

/* compiled from: OnImEngineInvalidateEvent.kt */
/* loaded from: classes.dex */
public final class p680 extends sxp {
    public final plp b;
    public final boolean c;

    public p680(plp plpVar, boolean z) {
        this.b = plpVar;
        this.c = z;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p680)) {
            return false;
        }
        p680 p680Var = (p680) obj;
        return epx.f(this.b, p680Var.b) && this.c == p680Var.c;
    }

    public final int hashCode() {
        plp plpVar = this.b;
        return Boolean.hashCode(this.c) + ((plpVar == null ? 0 : plpVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnImEngineInvalidateEvent(reason=");
        sb.append(this.b);
        sb.append(", hasCredentials=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
