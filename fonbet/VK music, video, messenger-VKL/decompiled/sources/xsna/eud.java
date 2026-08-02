package xsna;

/* compiled from: ClipsDraftVolume.kt */
/* loaded from: classes17.dex */
public final class eud {
    public final float a;
    public final boolean b;

    public eud(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eud)) {
            return false;
        }
        eud eudVar = (eud) obj;
        return Float.compare(this.a, eudVar.a) == 0 && this.b == eudVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftVolume(volume=");
        sb.append(this.a);
        sb.append(", muted=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
