package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mvi0 extends w4v {
    public final String a;
    public final String b;
    public final String c;
    public final qfc d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ mvi0(String str, String str2, String str3, String str4, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (qfc) null, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvi0)) {
            return false;
        }
        mvi0 mvi0Var = (mvi0) obj;
        return jl40.l(this.a, mvi0Var.a) && jl40.l(this.b, mvi0Var.b) && jl40.l(this.c, mvi0Var.c) && jl40.l(this.d, mvi0Var.d) && jl40.l(this.e, mvi0Var.e) && jl40.l(this.f, mvi0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        qfc qfcVar = this.d;
        int hashCode4 = (hashCode3 + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RemoteIconModel(tagDay=", this.a, ", tagNight=", this.b, ", url=");
        v.append(this.c);
        v.append(", tintColor=");
        v.append(this.d);
        v.append(", accessibilityLabel=");
        v.append(this.e);
        v.append(", monochrome=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public mvi0(String str, String str2, String str3, qfc qfcVar, String str4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qfcVar;
        this.e = str4;
        this.f = bool;
    }

    public mvi0() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, 63);
    }
}
