package defpackage;

import com.ybsdk.core.utils.dto.common.FailDataException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o8p {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final FailDataException e;

    public o8p(String str, String str2, String str3, String str4, FailDataException failDataException) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = failDataException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8p)) {
            return false;
        }
        o8p o8pVar = (o8p) obj;
        return jl40.l(this.a, o8pVar.a) && jl40.l(this.b, o8pVar.b) && jl40.l(this.c, o8pVar.c) && jl40.l(this.d, o8pVar.d) && this.e.equals(o8pVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("FailDataEntity(title=", this.a, ", description=", this.b, ", supportUrl=");
        g8e.D(v, this.c, ", techInfo=", this.d, ", error=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
