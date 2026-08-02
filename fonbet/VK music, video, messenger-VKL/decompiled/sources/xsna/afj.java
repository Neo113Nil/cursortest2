package xsna;

/* compiled from: ContainerState.kt */
/* loaded from: classes16.dex */
public final class afj {
    public final String a;
    public final boolean b;

    public afj() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afj)) {
            return false;
        }
        afj afjVar = (afj) obj;
        return epx.f(this.a, afjVar.a) && this.b == afjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContainerState(contentDescription=");
        sb.append(this.a);
        sb.append(", isRippleEffectEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public afj(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ afj(String str, int i) {
        this((i & 1) != 0 ? "" : str, true);
    }
}
