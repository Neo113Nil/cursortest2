package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class a8y {
    public static final z7y Companion = new z7y();
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final long f;

    public /* synthetic */ a8y(int i, long j, int i2, int i3, int i4, int i5) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, y7y.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.d = i4;
        this.e = i5;
        this.f = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8y)) {
            return false;
        }
        a8y a8yVar = (a8y) obj;
        return this.a == a8yVar.a && this.b == a8yVar.b && this.c == a8yVar.c && this.d == a8yVar.d && this.e == a8yVar.e && this.f == a8yVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, qv10.c(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "GsmCell(mcc=", ", mnc=", ", cid=");
        vfc.y(s, this.c, ", lac=", this.d);
        n.A(s, ", strength=", this.e, ", timestamp=");
        return oyr.n(this.f, Extension.C_BRAKE, s);
    }

    public a8y(int i, int i2, int i3, int i4, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i3;
        this.e = i4;
        this.f = j2;
    }
}
