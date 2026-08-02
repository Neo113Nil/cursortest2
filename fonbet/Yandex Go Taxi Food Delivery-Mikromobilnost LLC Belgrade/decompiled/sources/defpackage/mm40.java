package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mm40 {
    public final String a;
    public final String b;
    public final InputStream c;
    public final String d;

    public mm40(String str, String str2, InputStream inputStream, String str3) {
        this.a = str;
        this.b = str2;
        this.c = inputStream;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm40)) {
            return false;
        }
        mm40 mm40Var = (mm40) obj;
        return jl40.l(this.a, mm40Var.a) && jl40.l(this.b, mm40Var.b) && jl40.l(this.c, mm40Var.c) && jl40.l(this.d, mm40Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + m2a1.a(this.b, this.a.hashCode() * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("MultiPartBodyPart(name=", this.a, ", type=", this.b, ", inputStream=");
        v.append(this.c);
        v.append(", filename=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ mm40(String str, ByteArrayInputStream byteArrayInputStream) {
        this(str, "application/json;charset=UTF-8", byteArrayInputStream, null);
    }
}
