package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e370 {
    public final boolean a;
    public final long b;

    public e370(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final r0k a() {
        gu21 gu21Var;
        if (this.a) {
            it21 it21Var = yt21.k;
            gu21Var = jzz.g(it21Var.c, it21Var.e, it21Var.b, it21Var.f, it21Var.d);
        } else {
            gu21Var = null;
        }
        return new r0k(gu21Var, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e370)) {
            return false;
        }
        e370 e370Var = (e370) obj;
        return this.a == e370Var.a && this.b == e370Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnlineStatus(isOnline=" + this.a + ", lastSeenMs=" + this.b + Extension.C_BRAKE;
    }
}
