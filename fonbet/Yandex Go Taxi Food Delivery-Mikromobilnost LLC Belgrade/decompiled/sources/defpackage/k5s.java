package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k5s {
    public final int a;
    public final m5s b;

    public k5s(int i, m5s m5sVar) {
        this.a = i;
        this.b = m5sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5s)) {
            return false;
        }
        k5s k5sVar = (k5s) obj;
        return this.a == k5sVar.a && this.b.equals(k5sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FormOverrideFindResult(index=" + this.a + ", override=" + this.b + Extension.C_BRAKE;
    }
}
