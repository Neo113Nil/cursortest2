package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ff3 extends hf3 {
    public final String a;

    public ff3(int i) {
        this.a = "Speakerphone";
    }

    @Override // defpackage.hf3
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ff3) && jl40.l(this.a, ((ff3) obj).a);
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
        return oyr.t(new StringBuilder("Speakerphone(name="), this.a, Extension.C_BRAKE);
    }

    public ff3() {
        this(0);
    }
}
