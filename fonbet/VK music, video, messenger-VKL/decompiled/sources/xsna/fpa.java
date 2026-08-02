package xsna;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public final class fpa implements zoa {
    public final Long a;
    public final boolean b;

    public fpa(Long l, boolean z) {
        this.a = l;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpa)) {
            return false;
        }
        fpa fpaVar = (fpa) obj;
        return epx.f(this.a, fpaVar.a) && this.b == fpaVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Boolean.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicationDate(timeMs=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
