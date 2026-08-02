package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ddg0 implements fdg0 {
    public final stz0 a;

    public ddg0(stz0 stz0Var) {
        this.a = stz0Var;
    }

    public final stz0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddg0) && this.a.equals(((ddg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Default(value=" + this.a + Extension.C_BRAKE;
    }
}
