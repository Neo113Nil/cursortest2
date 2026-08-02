package defpackage;

import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class b6g0 {
    public static final a6g0 Companion = new a6g0();
    public final d a;
    public final d b;
    public final d c;
    public final d d;
    public final d e;

    public /* synthetic */ b6g0(int i, d dVar, d dVar2, d dVar3, d dVar4, d dVar5) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, z5g0.a.getDescriptor());
            throw null;
        }
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = dVar4;
        if ((i & 16) == 0) {
            this.e = qcx.b(0);
        } else {
            this.e = dVar5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6g0)) {
            return false;
        }
        b6g0 b6g0Var = (b6g0) obj;
        return jl40.l(this.a, b6g0Var.a) && jl40.l(this.b, b6g0Var.b) && jl40.l(this.c, b6g0Var.c) && jl40.l(this.d, b6g0Var.d) && jl40.l(this.e, b6g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "QrCodeCutout(height=" + this.a + ", width=" + this.b + ", x=" + this.c + ", y=" + this.d + ", cornerRadius=" + this.e + Extension.C_BRAKE;
    }
}
