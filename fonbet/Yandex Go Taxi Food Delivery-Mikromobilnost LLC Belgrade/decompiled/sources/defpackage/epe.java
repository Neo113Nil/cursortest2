package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class epe extends kr {
    public static final dpe Companion = new dpe();
    public final String a;
    public final String b;

    public /* synthetic */ epe(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, cpe.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epe.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        epe epeVar = (epe) obj;
        return jl40.l(this.a, epeVar.a) && jl40.l(this.b, epeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("CopyTextAction(text='", this.a, "', toastText=", this.b, Extension.C_BRAKE);
    }
}
