package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ezy0 {
    public final int a;

    public ezy0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezy0) && this.a == ((ezy0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "ThreadUnseenReadInfo(unreadThreadsCount=", Extension.C_BRAKE);
    }

    public ezy0() {
        this(0);
    }
}
