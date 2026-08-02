package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o7f extends s7f {
    public final int a;
    public String b;

    public o7f(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.s7f
    public final boolean a(s7f s7fVar) {
        o7f o7fVar = s7fVar instanceof o7f ? (o7f) s7fVar : null;
        return o7fVar != null && this.a == o7fVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7f)) {
            return false;
        }
        o7f o7fVar = (o7f) obj;
        return this.a == o7fVar.a && jl40.l(this.b, o7fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "Answer(id=", ", text=", this.b, Extension.C_BRAKE);
    }

    public /* synthetic */ o7f(int i) {
        this(i, "");
    }
}
