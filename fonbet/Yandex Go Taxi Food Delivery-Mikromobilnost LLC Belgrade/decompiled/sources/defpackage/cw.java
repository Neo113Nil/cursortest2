package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cw {
    public final String a;
    public final Object b;

    public cw(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return jl40.l(this.a, cwVar.a) && jl40.l(this.b, cwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormStateKeyActionGuardPolicy(key=" + this.a + ", interruptValue=" + this.b + Extension.C_BRAKE;
    }
}
