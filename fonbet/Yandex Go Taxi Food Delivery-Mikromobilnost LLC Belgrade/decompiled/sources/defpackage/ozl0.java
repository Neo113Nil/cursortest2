package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ozl0 {
    public final String a;
    public final String b;

    public ozl0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozl0)) {
            return false;
        }
        ozl0 ozl0Var = (ozl0) obj;
        return jl40.l(this.a, ozl0Var.a) && jl40.l(this.b, ozl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SaveAutoTopupV2Entity(requestId=", this.a, ", action=", this.b, Extension.C_BRAKE);
    }
}
