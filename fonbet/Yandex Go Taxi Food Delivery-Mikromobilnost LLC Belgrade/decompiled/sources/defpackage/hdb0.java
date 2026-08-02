package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hdb0 implements kpl {
    public final String a;

    public hdb0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdb0) && this.a.equals(((hdb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PfmTransactionFeedDivViewItemPayload(sectionKey=", rcb0.a(this.a), Extension.C_BRAKE);
    }
}
