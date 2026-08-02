package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class a3s implements c3s {
    public final Object a;

    public a3s(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.c3s
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3s) && jl40.l(this.a, ((a3s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.p("Completed(formStateValue=", Extension.C_BRAKE, this.a);
    }
}
