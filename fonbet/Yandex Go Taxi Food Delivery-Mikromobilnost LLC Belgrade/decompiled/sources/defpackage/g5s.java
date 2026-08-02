package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g5s implements h5s {
    public final String a;
    public final t3s b;

    public g5s(String str, t3s t3sVar) {
        this.a = str;
        this.b = t3sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5s)) {
            return false;
        }
        g5s g5sVar = (g5s) obj;
        return jl40.l(this.a, g5sVar.a) && this.b.equals(g5sVar.b);
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ModalViewPopup(id=" + this.a + ", layout=" + this.b + Extension.C_BRAKE;
    }
}
