package defpackage;

import com.yandex.go.blockeduser.api.BlockedUserType;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p36 {
    public final BlockedUserType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Calendar f;

    public p36(BlockedUserType blockedUserType, String str, String str2, String str3, String str4, Calendar calendar) {
        this.a = blockedUserType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p36)) {
            return false;
        }
        p36 p36Var = (p36) obj;
        return this.a == p36Var.a && jl40.l(this.b, p36Var.b) && jl40.l(this.c, p36Var.c) && jl40.l(this.d, p36Var.d) && jl40.l(this.e, p36Var.e) && jl40.l(this.f, p36Var.f);
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
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Calendar calendar = this.f;
        return hashCode5 + (calendar != null ? calendar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockedUser(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        g8e.D(sb, this.c, ", appealButtonText=", this.d, ", changePhoneButtonText=");
        sb.append(this.e);
        sb.append(", blockedTillTime=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
