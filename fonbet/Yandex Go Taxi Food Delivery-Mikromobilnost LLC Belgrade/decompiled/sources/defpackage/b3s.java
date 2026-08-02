package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class b3s implements c3s {
    public final Object a;

    public b3s(Object obj) {
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
        return (obj instanceof b3s) && jl40.l(this.a, ((b3s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.p("InProgress(formStateValue=", Extension.C_BRAKE, this.a);
    }
}
