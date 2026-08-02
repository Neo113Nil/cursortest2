package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ef3 extends hf3 {
    public final String a;

    public ef3(int i) {
        this.a = "Earpiece";
    }

    @Override // defpackage.hf3
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ef3) && jl40.l(this.a, ((ef3) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return oyr.t(new StringBuilder("Earpiece(name="), this.a, Extension.C_BRAKE);
    }

    public ef3() {
        this(0);
    }
}
