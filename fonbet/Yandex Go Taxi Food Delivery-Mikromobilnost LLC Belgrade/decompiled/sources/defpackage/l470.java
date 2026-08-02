package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class l470 extends mr {
    public final mde a;

    public l470(mde mdeVar) {
        this.a = mdeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l470) && this.a.equals(((l470) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenContacts(contactsScreenParams=" + this.a + Extension.C_BRAKE;
    }
}
