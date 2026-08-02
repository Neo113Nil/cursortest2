package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class pwy extends kr {
    public final u1m a;
    public final ywl b;
    public final boolean c;

    public /* synthetic */ pwy(u1m u1mVar, ywl ywlVar, boolean z, int i) {
        this(u1mVar, (i & 2) != 0 ? null : ywlVar, (i & 4) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwy)) {
            return false;
        }
        pwy pwyVar = (pwy) obj;
        return jl40.l(this.a, pwyVar.a) && jl40.l(this.b, pwyVar.b) && this.c == pwyVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ywl ywlVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (ywlVar == null ? 0 : ywlVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadDocumentAction(query=");
        sb.append(this.a);
        sb.append(", preview=");
        sb.append(this.b);
        sb.append(", isForce=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public pwy(u1m u1mVar, ywl ywlVar, boolean z) {
        this.a = u1mVar;
        this.b = ywlVar;
        this.c = z;
    }
}
