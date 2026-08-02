package xsna;

/* compiled from: Device.kt */
/* loaded from: classes12.dex */
public final class u5m {
    public final int a;
    public final String b;
    public final String c;

    public u5m(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u5m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        u5m u5mVar = (u5m) obj;
        return this.a == u5mVar.a && epx.f(this.b, u5mVar.b) && epx.f(this.c, u5mVar.c);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device(type=");
        sb.append(this.a);
        sb.append(", manufacturer=");
        sb.append(this.b);
        sb.append(", model=");
        return ho8.a(sb, this.c, ')');
    }
}
