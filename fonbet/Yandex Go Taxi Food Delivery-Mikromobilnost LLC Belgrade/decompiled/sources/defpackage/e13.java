package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e13 implements g13 {
    public final dqg a;

    public e13(dqg dqgVar) {
        this.a = dqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e13) && jl40.l(this.a, ((e13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + Extension.C_BRAKE;
    }
}
