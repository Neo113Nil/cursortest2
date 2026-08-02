package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lwo {
    public final zvo a;
    public final List b;

    public lwo(zvo zvoVar, ArrayList arrayList) {
        this.a = zvoVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwo)) {
            return false;
        }
        lwo lwoVar = (lwo) obj;
        return jl40.l(this.a, lwoVar.a) && jl40.l(this.b, lwoVar.b);
    }

    public final int hashCode() {
        zvo zvoVar = this.a;
        int hashCode = (zvoVar == null ? 0 : zvoVar.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ExtendExpirationDateState(action=" + this.a + ", options=" + this.b + Extension.C_BRAKE;
    }
}
