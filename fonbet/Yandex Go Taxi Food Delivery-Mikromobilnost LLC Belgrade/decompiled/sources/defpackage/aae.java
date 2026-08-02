package defpackage;

/* loaded from: classes15.dex */
public final class aae {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public aae(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aae)) {
            return false;
        }
        aae aaeVar = (aae) obj;
        return jl40.l(this.a, aaeVar.a) && jl40.l(this.b, aaeVar.b) && jl40.l(this.c, aaeVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 923521;
    }

    public final String toString() {
        return oyr.t(b64.v("ContactInfo(userId=", this.a, ", phoneId=", this.b, ", contactName="), this.c, ", systemDisplayName=null, systemContactId=null, systemLookupId=null, phone=null)");
    }
}
