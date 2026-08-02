package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ewj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ewj(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewj)) {
            return false;
        }
        ewj ewjVar = (ewj) obj;
        return jl40.l(this.a, ewjVar.a) && jl40.l(this.b, ewjVar.b) && jl40.l(this.c, ewjVar.c) && this.d.equals(ewjVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return g8e.r(b64.v("StateEventKey(oid=", this.a, ", uri=", this.b, ", mode="), this.c, ", event=", this.d, Extension.C_BRAKE);
    }
}
