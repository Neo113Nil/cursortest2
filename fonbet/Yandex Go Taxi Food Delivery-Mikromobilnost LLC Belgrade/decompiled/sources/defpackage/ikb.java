package defpackage;

/* loaded from: classes8.dex */
public final class ikb {
    public final String a;
    public final String b;

    public ikb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikb)) {
            return false;
        }
        ikb ikbVar = (ikb) obj;
        return this.a.equals(ikbVar.a) && this.b.equals(ikbVar.b);
    }

    public final int hashCode() {
        return unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(uuid=");
        sb.append(this.a);
        sb.append(", deviceId=");
        return oyr.t(sb, this.b, ", clid=null)");
    }
}
