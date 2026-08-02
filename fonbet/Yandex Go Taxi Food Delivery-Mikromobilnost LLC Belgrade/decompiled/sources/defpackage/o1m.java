package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class o1m implements peo {
    public final n1m a;

    public o1m(n1m n1mVar) {
        this.a = n1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1m) && this.a.equals(((o1m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentOriginChangedEvent(origin=" + this.a + Extension.C_BRAKE;
    }
}
