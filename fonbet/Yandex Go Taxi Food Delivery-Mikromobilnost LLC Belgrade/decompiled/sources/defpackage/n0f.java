package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n0f {
    public final String a;
    public final Object b;

    public n0f(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0f)) {
            return false;
        }
        n0f n0fVar = (n0f) obj;
        return jl40.l(this.a, n0fVar.a) && jl40.l(this.b, n0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CounterOptionModel(title=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
