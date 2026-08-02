package xsna;

/* compiled from: ImGridSharingConfig.kt */
/* loaded from: classes11.dex */
public final class b4w {
    public static final a c = new a();
    public static final b4w d = new b4w(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: ImGridSharingConfig.kt */
    public static final class a {
    }

    public b4w(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4w)) {
            return false;
        }
        b4w b4wVar = (b4w) obj;
        return this.a == b4wVar.a && this.b == b4wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImGridSharingConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", isSendHelpTooltipEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
