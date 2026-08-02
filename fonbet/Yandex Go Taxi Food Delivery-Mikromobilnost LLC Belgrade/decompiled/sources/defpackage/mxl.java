package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mxl extends nxl {
    public final ywl a;
    public final zwl b;

    public mxl(ywl ywlVar, zwl zwlVar) {
        this.a = ywlVar;
        this.b = zwlVar;
    }

    public final ywl a() {
        return this.a;
    }

    public final zwl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxl)) {
            return false;
        }
        mxl mxlVar = (mxl) obj;
        return jl40.l(this.a, mxlVar.a) && jl40.l(this.b, mxlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateDocument(document=" + this.a + ", previousDocumentActionsCallbacksConfig=" + this.b + Extension.C_BRAKE;
    }
}
