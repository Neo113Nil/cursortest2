package xsna;

/* compiled from: GoodCharacteristic.kt */
/* loaded from: classes18.dex */
public final class w3u {
    public final String a;
    public final String b;

    public w3u(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3u)) {
            return false;
        }
        w3u w3uVar = (w3u) obj;
        return epx.f(this.a, w3uVar.a) && epx.f(this.b, w3uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodCharacteristic(name=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
