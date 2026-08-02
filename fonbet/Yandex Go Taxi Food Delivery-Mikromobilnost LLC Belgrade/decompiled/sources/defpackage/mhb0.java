package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.photocomments.data.PhotoModel$Type;

/* loaded from: classes5.dex */
public final class mhb0 {
    public final String a;
    public final String b;
    public final PhotoModel$Type c;

    public mhb0(String str, String str2, PhotoModel$Type photoModel$Type) {
        this.a = str;
        this.b = str2;
        this.c = photoModel$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhb0)) {
            return false;
        }
        mhb0 mhb0Var = (mhb0) obj;
        return jl40.l(this.a, mhb0Var.a) && jl40.l(this.b, mhb0Var.b) && this.c == mhb0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PhotoModel(uri=", this.a, ", contentDescription=", this.b, ", type=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
