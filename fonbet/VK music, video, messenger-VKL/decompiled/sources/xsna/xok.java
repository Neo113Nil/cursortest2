package xsna;

/* compiled from: CustomTrackSelectionConfig.kt */
/* loaded from: classes11.dex */
public final class xok {
    public static final a c = new a();
    public final boolean a;
    public final Long b;

    /* compiled from: CustomTrackSelectionConfig.kt */
    public static final class a {
    }

    public xok(boolean z, Long l) {
        this.a = z;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xok)) {
            return false;
        }
        xok xokVar = (xok) obj;
        return this.a == xokVar.a && epx.f(this.b, xokVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomTrackSelectionConfig(queueDropEnabled=");
        sb.append(this.a);
        sb.append(", queueDropDelayMs=");
        return iq.b(sb, this.b, ')');
    }
}
