package defpackage;

/* loaded from: classes2.dex */
public final class jyt {
    public final String a;
    public final vfu b;

    public jyt(String str, vfu vfuVar) {
        this.a = str;
        this.b = vfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyt)) {
            return false;
        }
        jyt jytVar = (jyt) obj;
        return this.a.equals(jytVar.a) && this.b.equals(jytVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HexColor(__typename=" + this.a + ", hexColorFragment=" + this.b + ')';
    }
}
