package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class is50 extends ps50 {
    public final String a;
    public final String b;

    public is50(String str) {
        this.a = str;
        this.b = "Cancellation";
    }

    @Override // defpackage.ps50
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is50) && jl40.l(this.a, ((is50) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Cancellation(message=", this.a, Extension.C_BRAKE);
    }

    public is50() {
        this(null);
    }
}
