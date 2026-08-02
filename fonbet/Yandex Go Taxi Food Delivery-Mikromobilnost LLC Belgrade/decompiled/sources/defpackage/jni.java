package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class jni {
    public final boolean a;
    public final Integer b;
    public final hci c;
    public final String d;
    public final Boolean e;
    public final Boolean f;

    public jni(boolean z, Integer num, hci hciVar, String str, Boolean bool, Boolean bool2) {
        this.a = z;
        this.b = num;
        this.c = hciVar;
        this.d = str;
        this.e = bool;
        this.f = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jni)) {
            return false;
        }
        jni jniVar = (jni) obj;
        return this.a == jniVar.a && jl40.l(this.b, jniVar.b) && this.c.equals(jniVar.c) && jl40.l(this.d, jniVar.d) && jl40.l(this.e, jniVar.e) && jl40.l(this.f, jniVar.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryRouteStatsInfo(isBusinessAccountEnabled=" + this.a + ", rentalDuration=" + this.b + ", insurance=" + this.c + ", marketplaceChatId=" + this.d + ", doorToDoor=" + this.e + ", payOnDelivery=" + this.f + Extension.C_BRAKE;
    }
}
