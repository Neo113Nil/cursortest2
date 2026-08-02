package xsna;

/* compiled from: ExtraSettings.kt */
/* loaded from: classes2.dex */
public final class jgq {
    public final boolean a;
    public final boolean b;

    public jgq() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgq)) {
            return false;
        }
        jgq jgqVar = (jgq) obj;
        return this.a == jgqVar.a && this.b == jgqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtraSettings(channelsControlSelectAll=");
        sb.append(this.a);
        sb.append(", channelsControlSelectSubscribers=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public jgq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
