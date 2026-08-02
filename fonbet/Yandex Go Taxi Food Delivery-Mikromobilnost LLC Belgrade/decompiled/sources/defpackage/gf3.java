package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class gf3 extends hf3 {
    public final String a;

    public gf3(int i) {
        this.a = "Wired Headset";
    }

    @Override // defpackage.hf3
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof gf3) && jl40.l(this.a, ((gf3) obj).a);
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
        return oyr.t(new StringBuilder("WiredHeadset(name="), this.a, Extension.C_BRAKE);
    }

    public gf3() {
        this(0);
    }
}
