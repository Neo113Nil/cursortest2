package xsna;

import java.util.Map;

/* compiled from: EventMetadata.kt */
/* loaded from: classes13.dex */
public final class i0q {
    public final String a;
    public final long b;
    public final Map<String, String> c;

    public i0q(String str, long j, Map<String, String> map) {
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final Map<String, String> a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0q)) {
            return false;
        }
        i0q i0qVar = (i0q) obj;
        return epx.f(this.a, i0qVar.a) && this.b == i0qVar.b && epx.f(this.c, i0qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", additionalCustomKeys=");
        return cjl0.a(sb, this.c, ')');
    }
}
