package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bwv extends iwv {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public bwv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwv)) {
            return false;
        }
        bwv bwvVar = (bwv) obj;
        return jl40.l(this.a, bwvVar.a) && jl40.l(this.b, bwvVar.b) && jl40.l(this.c, bwvVar.c) && jl40.l(this.d, bwvVar.d) && jl40.l(this.e, bwvVar.e) && jl40.l(this.f, bwvVar.f) && jl40.l(this.g, bwvVar.g) && jl40.l(this.h, bwvVar.h) && jl40.l(this.i, bwvVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeeplinkError(title=", this.a, ", description=", this.b, ", primaryButtonText=");
        g8e.D(v, this.c, ", buttonAction=", this.d, ", hyperlinkTitle=");
        g8e.D(v, this.e, ", hyperlinkAction=", this.f, ", imageUrl=");
        g8e.D(v, this.g, ", imageUrlDark=", this.h, ", userEmail=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }
}
