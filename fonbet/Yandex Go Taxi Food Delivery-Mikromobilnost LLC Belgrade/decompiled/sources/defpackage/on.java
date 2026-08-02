package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class on extends nr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public on(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // defpackage.nr
    public final String a() {
        return this.d;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on)) {
            return false;
        }
        on onVar = (on) obj;
        return jl40.l(this.a, onVar.a) && jl40.l(this.b, onVar.b) && jl40.l(this.c, onVar.c) && jl40.l(this.d, onVar.d) && jl40.l(this.e, onVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionDeeplink(deeplink=", this.a, ", title=", this.b, ", badgeText=");
        g8e.D(v, this.c, ", imageTag=", this.d, ", analyticsName=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ on(String str) {
        this(str, null, null, null, null);
    }
}
