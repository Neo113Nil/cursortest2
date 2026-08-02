package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mde {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final s9e i;
    public final mt0 j;

    public mde(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, s9e s9eVar, mt0 mt0Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = s9eVar;
        this.j = mt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mde) {
            mde mdeVar = (mde) obj;
            return this.a == mdeVar.a && jl40.l(this.b, mdeVar.b) && jl40.l(this.c, mdeVar.c) && jl40.l(this.d, mdeVar.d) && jl40.l(this.e, mdeVar.e) && jl40.l(this.f, mdeVar.f) && jl40.l(this.g, mdeVar.g) && jl40.l(this.h, mdeVar.h) && jl40.l(this.i, mdeVar.i) && this.j == mdeVar.j;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        s9e s9eVar = this.i;
        return this.j.hashCode() + ((hashCode8 + (s9eVar != null ? s9eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ContactsScreenParams(index=", ", title=", this.b, ", description=");
        g8e.D(v, this.c, ", userContactTitle=", this.d, ", emptyContactTitle=");
        g8e.D(v, this.e, ", emptyContactSubtitle=", this.f, ", permissionErrorText=");
        g8e.D(v, this.g, ", buttonChooseTitle=", this.h, ", previouslySelectedContact=");
        v.append(this.i);
        v.append(", onContactSelected=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
