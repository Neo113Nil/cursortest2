package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class k820 implements n6z {
    public final String a;

    public k820(String str) {
        this.a = str;
    }

    @Override // defpackage.n6z
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k820) && jl40.l(this.a, ((k820) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("MetaData(source=", q6z.a(this.a), Extension.C_BRAKE);
    }
}
