package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class bib0 extends abo {
    public final s3v a;

    public bib0(s3v s3vVar) {
        this.a = s3vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bib0) && jl40.l(this.a, ((bib0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InitEvent(provider=" + this.a + Extension.C_BRAKE;
    }
}
