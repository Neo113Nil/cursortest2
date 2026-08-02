package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bm1 implements cm1 {
    public final rdb a;

    public bm1(rdb rdbVar) {
        this.a = rdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm1) && jl40.l(this.a, ((bm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Warm(chatViewController=" + this.a + Extension.C_BRAKE;
    }
}
