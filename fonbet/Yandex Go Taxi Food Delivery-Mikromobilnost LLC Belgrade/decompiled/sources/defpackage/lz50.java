package defpackage;

/* loaded from: classes2.dex */
public final class lz50 {
    public static final lz50 b = new lz50("http/1.0");
    public static final lz50 c = new lz50("http/1.1");
    public static final lz50 d = new lz50("h2");
    public static final lz50 e = new lz50("quic");
    public final String a;

    public lz50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz50) && this.a.equals(((lz50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
