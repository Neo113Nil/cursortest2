package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class er10 {
    public final u8j0 a;

    public /* synthetic */ er10(int i) {
        this(new t8j0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er10) && jl40.l(this.a, ((er10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MerchantsState(merchantsEntity=" + this.a + Extension.C_BRAKE;
    }

    public er10(u8j0 u8j0Var) {
        this.a = u8j0Var;
    }

    public er10() {
        this(0);
    }
}
