package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e5s implements h5s {
    public final String a;
    public final t3s b;
    public final xys0 c;

    public e5s(String str, t3s t3sVar, xys0 xys0Var) {
        this.a = str;
        this.b = t3sVar;
        this.c = xys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5s)) {
            return false;
        }
        e5s e5sVar = (e5s) obj;
        return jl40.l(this.a, e5sVar.a) && this.b.equals(e5sVar.b) && this.c.equals(e5sVar.c);
    }

    @Override // defpackage.h5s
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.h5s
    public final t3s getLayout() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ModalViewOverCamera(id=" + this.a + ", layout=" + this.b + ", initialType=" + this.c + Extension.C_BRAKE;
    }
}
