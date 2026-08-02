package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f5s implements h5s {
    public final String a;
    public final t3s b;
    public final ip00 c;

    public f5s(String str, t3s t3sVar, ip00 ip00Var) {
        this.a = str;
        this.b = t3sVar;
        this.c = ip00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5s)) {
            return false;
        }
        f5s f5sVar = (f5s) obj;
        return jl40.l(this.a, f5sVar.a) && this.b.equals(f5sVar.b) && this.c.equals(f5sVar.c);
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
        return "ModalViewOverMap(id=" + this.a + ", layout=" + this.b + ", mapObjectsDescriptor=" + this.c + Extension.C_BRAKE;
    }
}
