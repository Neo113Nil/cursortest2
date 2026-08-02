package xsna;

/* compiled from: OnDialogsDeleteForAllFlagUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class u480 extends sxp {
    public final Object b;
    public final boolean c;

    public u480(Object obj, boolean z) {
        this.b = obj;
        this.c = z;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u480)) {
            return false;
        }
        u480 u480Var = (u480) obj;
        return epx.f(this.b, u480Var.b) && this.c == u480Var.c;
    }

    public final int hashCode() {
        Object obj = this.b;
        return Boolean.hashCode(this.c) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDialogsDeleteForAllFlagUpdateEvent(changerTag=");
        sb.append(this.b);
        sb.append(", flag=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
