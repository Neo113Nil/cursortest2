package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class msc extends psc {
    public final hfb0 a;

    public msc(hfb0 hfb0Var) {
        this.a = hfb0Var;
    }

    public final hfb0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msc) && this.a.equals(((msc) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "DirectPhoneCall(phoneNumber=" + this.a + Extension.C_BRAKE;
    }
}
