package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class i3u {
    public final long a;
    public final long b;

    public i3u(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3u)) {
            return false;
        }
        i3u i3uVar = (i3u) obj;
        return this.a == i3uVar.a && this.b == i3uVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "Key(id=", ", orgId="));
    }
}
