package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ngh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ngh(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngh)) {
            return false;
        }
        ngh nghVar = (ngh) obj;
        return this.a.equals(nghVar.a) && this.b.equals(nghVar.b) && this.c.equals(nghVar.c) && this.d.equals(nghVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("DefaultOutgoingCallTypeResources(itemTitle=", this.a, ", byPhoneText=", this.b, ", byVoip="), this.c, ", alwaysAsk=", this.d, Extension.C_BRAKE);
    }
}
