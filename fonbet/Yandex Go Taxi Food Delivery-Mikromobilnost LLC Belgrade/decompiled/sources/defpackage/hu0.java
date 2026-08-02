package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hu0 implements ju0 {
    public final int a;

    public hu0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu0) && this.a == ((hu0) obj).a;
    }

    @Override // defpackage.ju0
    public final int getIndex() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Change(index=", Extension.C_BRAKE);
    }
}
