package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lte implements ote {
    public final wte a;

    static {
        int i = wte.c;
    }

    public lte(wte wteVar) {
        this.a = wteVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lte) && this.a.equals(((lte) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenEmployeeAccessInfo(data=" + this.a + Extension.C_BRAKE;
    }
}
