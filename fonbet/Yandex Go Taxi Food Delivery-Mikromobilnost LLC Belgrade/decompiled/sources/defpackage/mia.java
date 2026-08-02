package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mia implements pia {
    public final bia a;

    public mia(bia biaVar) {
        this.a = biaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mia) && this.a.equals(((mia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(content=" + this.a + Extension.C_BRAKE;
    }
}
