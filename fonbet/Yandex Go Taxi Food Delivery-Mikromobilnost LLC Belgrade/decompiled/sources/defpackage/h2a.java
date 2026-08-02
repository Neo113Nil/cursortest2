package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h2a {
    public final boolean a;
    public final Long b;

    public h2a(Long l, boolean z) {
        this.a = z;
        this.b = l;
    }

    public static h2a a(h2a h2aVar, boolean z, Long l, int i) {
        if ((i & 1) != 0) {
            z = h2aVar.a;
        }
        if ((i & 2) != 0) {
            l = h2aVar.b;
        }
        h2aVar.getClass();
        return new h2a(l, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2a)) {
            return false;
        }
        h2a h2aVar = (h2a) obj;
        return this.a == h2aVar.a && jl40.l(this.b, h2aVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TimerState(shouldUseBackendInitialValue=" + this.a + ", remainingMs=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ h2a(int i) {
        this(null, true);
    }

    public h2a() {
        this(0);
    }
}
