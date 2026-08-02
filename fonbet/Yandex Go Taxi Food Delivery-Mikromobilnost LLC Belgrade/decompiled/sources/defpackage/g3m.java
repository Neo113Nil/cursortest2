package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class g3m implements peo {
    public final e3m a;

    public g3m(e3m e3mVar) {
        this.a = e3mVar;
    }

    public final e3m a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3m) && this.a.equals(((g3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentStateRestoredEvent(restoredState=" + this.a + Extension.C_BRAKE;
    }
}
